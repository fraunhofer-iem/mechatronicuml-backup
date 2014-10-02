package de.uni_paderborn.uppaal.trace.ui.contentassist.antlr.internal; 

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
import de.uni_paderborn.uppaal.trace.services.DiagnosticTraceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDiagnosticTraceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_EDGE", "RULE_DEPTH", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tau'", "'Showing counter example.'", "'Showing example trace.'", "'-- Property is satisfied.'", "'-- Property is NOT satisfied.'", "'='", "'<='", "'>='", "'?'", "'!'", "'Cannot reuse state space when trace length optimisation is used.'", "'Verifying property'", "'at line'", "'('", "')'", "','", "'.'", "'-'", "'['", "']'", "'State'", "':'", "'->'", "'Delay:'", "'Transitions:'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int RULE_DEPTH=7;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_EDGE=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalDiagnosticTraceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDiagnosticTraceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDiagnosticTraceParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g"; }


     
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:60:1: entryRuleTraceRepository : ruleTraceRepository EOF ;
    public final void entryRuleTraceRepository() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:61:1: ( ruleTraceRepository EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:62:1: ruleTraceRepository EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:69:1: ruleTraceRepository : ( ( rule__TraceRepository__Group__0 ) ) ;
    public final void ruleTraceRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:73:2: ( ( ( rule__TraceRepository__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:74:1: ( ( rule__TraceRepository__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:74:1: ( ( rule__TraceRepository__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:75:1: ( rule__TraceRepository__Group__0 )
            {
             before(grammarAccess.getTraceRepositoryAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:76:1: ( rule__TraceRepository__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:76:2: rule__TraceRepository__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:88:1: entryRuleTrace : ruleTrace EOF ;
    public final void entryRuleTrace() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:89:1: ( ruleTrace EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:90:1: ruleTrace EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:97:1: ruleTrace : ( ( rule__Trace__Group__0 ) ) ;
    public final void ruleTrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:101:2: ( ( ( rule__Trace__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:102:1: ( ( rule__Trace__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:102:1: ( ( rule__Trace__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:103:1: ( rule__Trace__Group__0 )
            {
             before(grammarAccess.getTraceAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:104:1: ( rule__Trace__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:104:2: rule__Trace__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:116:1: entryRuleProcessIdentifier : ruleProcessIdentifier EOF ;
    public final void entryRuleProcessIdentifier() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:117:1: ( ruleProcessIdentifier EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:118:1: ruleProcessIdentifier EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:125:1: ruleProcessIdentifier : ( ( rule__ProcessIdentifier__Group__0 ) ) ;
    public final void ruleProcessIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:129:2: ( ( ( rule__ProcessIdentifier__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:130:1: ( ( rule__ProcessIdentifier__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:130:1: ( ( rule__ProcessIdentifier__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:131:1: ( rule__ProcessIdentifier__Group__0 )
            {
             before(grammarAccess.getProcessIdentifierAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:132:1: ( rule__ProcessIdentifier__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:132:2: rule__ProcessIdentifier__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:144:1: entryRuleLocationActivity : ruleLocationActivity EOF ;
    public final void entryRuleLocationActivity() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:145:1: ( ruleLocationActivity EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:146:1: ruleLocationActivity EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:153:1: ruleLocationActivity : ( ( rule__LocationActivity__Group__0 ) ) ;
    public final void ruleLocationActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:157:2: ( ( ( rule__LocationActivity__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:158:1: ( ( rule__LocationActivity__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:158:1: ( ( rule__LocationActivity__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:159:1: ( rule__LocationActivity__Group__0 )
            {
             before(grammarAccess.getLocationActivityAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:160:1: ( rule__LocationActivity__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:160:2: rule__LocationActivity__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:172:1: entryRuleVariableValue : ruleVariableValue EOF ;
    public final void entryRuleVariableValue() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:173:1: ( ruleVariableValue EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:174:1: ruleVariableValue EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:181:1: ruleVariableValue : ( ( rule__VariableValue__Group__0 ) ) ;
    public final void ruleVariableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:185:2: ( ( ( rule__VariableValue__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:186:1: ( ( rule__VariableValue__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:186:1: ( ( rule__VariableValue__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:187:1: ( rule__VariableValue__Group__0 )
            {
             before(grammarAccess.getVariableValueAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:188:1: ( rule__VariableValue__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:188:2: rule__VariableValue__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:200:1: entryRuleSingleNamedElementReference : ruleSingleNamedElementReference EOF ;
    public final void entryRuleSingleNamedElementReference() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:201:1: ( ruleSingleNamedElementReference EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:202:1: ruleSingleNamedElementReference EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:209:1: ruleSingleNamedElementReference : ( ( rule__SingleNamedElementReference__Group__0 ) ) ;
    public final void ruleSingleNamedElementReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:213:2: ( ( ( rule__SingleNamedElementReference__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:214:1: ( ( rule__SingleNamedElementReference__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:214:1: ( ( rule__SingleNamedElementReference__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:215:1: ( rule__SingleNamedElementReference__Group__0 )
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:216:1: ( rule__SingleNamedElementReference__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:216:2: rule__SingleNamedElementReference__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:228:1: entryRuleNamedElementReference : ruleNamedElementReference EOF ;
    public final void entryRuleNamedElementReference() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:229:1: ( ruleNamedElementReference EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:230:1: ruleNamedElementReference EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:237:1: ruleNamedElementReference : ( ( rule__NamedElementReference__Group__0 ) ) ;
    public final void ruleNamedElementReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:241:2: ( ( ( rule__NamedElementReference__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:242:1: ( ( rule__NamedElementReference__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:242:1: ( ( rule__NamedElementReference__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:243:1: ( rule__NamedElementReference__Group__0 )
            {
             before(grammarAccess.getNamedElementReferenceAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:244:1: ( rule__NamedElementReference__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:244:2: rule__NamedElementReference__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:256:1: entryRuleTraceItem : ruleTraceItem EOF ;
    public final void entryRuleTraceItem() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:257:1: ( ruleTraceItem EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:258:1: ruleTraceItem EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:265:1: ruleTraceItem : ( ( rule__TraceItem__Alternatives ) ) ;
    public final void ruleTraceItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:269:2: ( ( ( rule__TraceItem__Alternatives ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:270:1: ( ( rule__TraceItem__Alternatives ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:270:1: ( ( rule__TraceItem__Alternatives ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:271:1: ( rule__TraceItem__Alternatives )
            {
             before(grammarAccess.getTraceItemAccess().getAlternatives()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:272:1: ( rule__TraceItem__Alternatives )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:272:2: rule__TraceItem__Alternatives
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:284:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_DEPTH");

        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:288:1: ( ruleState EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:289:1: ruleState EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:299:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_DEPTH");
        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:304:2: ( ( ( rule__State__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:305:1: ( ( rule__State__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:305:1: ( ( rule__State__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:306:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:307:1: ( rule__State__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:307:2: rule__State__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:320:1: entryRuleEdgeActivity : ruleEdgeActivity EOF ;
    public final void entryRuleEdgeActivity() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:321:1: ( ruleEdgeActivity EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:322:1: ruleEdgeActivity EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:329:1: ruleEdgeActivity : ( ( rule__EdgeActivity__Group__0 ) ) ;
    public final void ruleEdgeActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:333:2: ( ( ( rule__EdgeActivity__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:334:1: ( ( rule__EdgeActivity__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:334:1: ( ( rule__EdgeActivity__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:335:1: ( rule__EdgeActivity__Group__0 )
            {
             before(grammarAccess.getEdgeActivityAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:336:1: ( rule__EdgeActivity__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:336:2: rule__EdgeActivity__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:350:1: entryRuleChannelSynchronization : ruleChannelSynchronization EOF ;
    public final void entryRuleChannelSynchronization() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:351:1: ( ruleChannelSynchronization EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:352:1: ruleChannelSynchronization EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:359:1: ruleChannelSynchronization : ( ( rule__ChannelSynchronization__Group__0 ) ) ;
    public final void ruleChannelSynchronization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:363:2: ( ( ( rule__ChannelSynchronization__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:364:1: ( ( rule__ChannelSynchronization__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:364:1: ( ( rule__ChannelSynchronization__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:365:1: ( rule__ChannelSynchronization__Group__0 )
            {
             before(grammarAccess.getChannelSynchronizationAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:366:1: ( rule__ChannelSynchronization__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:366:2: rule__ChannelSynchronization__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:378:1: entryRuleTauSynchronization : ruleTauSynchronization EOF ;
    public final void entryRuleTauSynchronization() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:379:1: ( ruleTauSynchronization EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:380:1: ruleTauSynchronization EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:387:1: ruleTauSynchronization : ( 'tau' ) ;
    public final void ruleTauSynchronization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:391:2: ( ( 'tau' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:392:1: ( 'tau' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:392:1: ( 'tau' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:393:1: 'tau'
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:408:1: entryRuleDelayTransition : ruleDelayTransition EOF ;
    public final void entryRuleDelayTransition() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:409:1: ( ruleDelayTransition EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:410:1: ruleDelayTransition EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:417:1: ruleDelayTransition : ( ( rule__DelayTransition__Group__0 ) ) ;
    public final void ruleDelayTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:421:2: ( ( ( rule__DelayTransition__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:422:1: ( ( rule__DelayTransition__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:422:1: ( ( rule__DelayTransition__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:423:1: ( rule__DelayTransition__Group__0 )
            {
             before(grammarAccess.getDelayTransitionAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:424:1: ( rule__DelayTransition__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:424:2: rule__DelayTransition__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:436:1: entryRuleActionTransition : ruleActionTransition EOF ;
    public final void entryRuleActionTransition() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:437:1: ( ruleActionTransition EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:438:1: ruleActionTransition EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:445:1: ruleActionTransition : ( ( rule__ActionTransition__Group__0 ) ) ;
    public final void ruleActionTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:449:2: ( ( ( rule__ActionTransition__Group__0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:450:1: ( ( rule__ActionTransition__Group__0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:450:1: ( ( rule__ActionTransition__Group__0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:451:1: ( rule__ActionTransition__Group__0 )
            {
             before(grammarAccess.getActionTransitionAccess().getGroup()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:452:1: ( rule__ActionTransition__Group__0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:452:2: rule__ActionTransition__Group__0
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:464:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:465:1: ( ruleTransition EOF )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:466:1: ruleTransition EOF
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:473:1: ruleTransition : ( ( rule__Transition__Alternatives ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:477:2: ( ( ( rule__Transition__Alternatives ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:478:1: ( ( rule__Transition__Alternatives ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:478:1: ( ( rule__Transition__Alternatives ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:479:1: ( rule__Transition__Alternatives )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:480:1: ( rule__Transition__Alternatives )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:480:2: rule__Transition__Alternatives
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:493:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:497:1: ( ( ( rule__Result__Alternatives ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:498:1: ( ( rule__Result__Alternatives ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:498:1: ( ( rule__Result__Alternatives ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:499:1: ( rule__Result__Alternatives )
            {
             before(grammarAccess.getResultAccess().getAlternatives()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:500:1: ( rule__Result__Alternatives )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:500:2: rule__Result__Alternatives
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:512:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:516:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:517:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:517:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:518:1: ( rule__CompareOperator__Alternatives )
            {
             before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:519:1: ( rule__CompareOperator__Alternatives )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:519:2: rule__CompareOperator__Alternatives
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:531:1: ruleSynchronizationKind : ( ( rule__SynchronizationKind__Alternatives ) ) ;
    public final void ruleSynchronizationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:535:1: ( ( ( rule__SynchronizationKind__Alternatives ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:536:1: ( ( rule__SynchronizationKind__Alternatives ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:536:1: ( ( rule__SynchronizationKind__Alternatives ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:537:1: ( rule__SynchronizationKind__Alternatives )
            {
             before(grammarAccess.getSynchronizationKindAccess().getAlternatives()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:538:1: ( rule__SynchronizationKind__Alternatives )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:538:2: rule__SynchronizationKind__Alternatives
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


    // $ANTLR start "rule__Trace__Alternatives_5_0"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:549:1: rule__Trace__Alternatives_5_0 : ( ( 'Showing counter example.' ) | ( 'Showing example trace.' ) );
    public final void rule__Trace__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:553:1: ( ( 'Showing counter example.' ) | ( 'Showing example trace.' ) )
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
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:554:1: ( 'Showing counter example.' )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:554:1: ( 'Showing counter example.' )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:555:1: 'Showing counter example.'
                    {
                     before(grammarAccess.getTraceAccess().getShowingCounterExampleKeyword_5_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Trace__Alternatives_5_01092); 
                     after(grammarAccess.getTraceAccess().getShowingCounterExampleKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:562:6: ( 'Showing example trace.' )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:562:6: ( 'Showing example trace.' )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:563:1: 'Showing example trace.'
                    {
                     before(grammarAccess.getTraceAccess().getShowingExampleTraceKeyword_5_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Trace__Alternatives_5_01112); 
                     after(grammarAccess.getTraceAccess().getShowingExampleTraceKeyword_5_0_1()); 

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
    // $ANTLR end "rule__Trace__Alternatives_5_0"


    // $ANTLR start "rule__TraceItem__Alternatives"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:575:1: rule__TraceItem__Alternatives : ( ( ruleState ) | ( ruleTransition ) );
    public final void rule__TraceItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:579:1: ( ( ruleState ) | ( ruleTransition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=36 && LA2_0<=37)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:580:1: ( ruleState )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:580:1: ( ruleState )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:581:1: ruleState
                    {
                     before(grammarAccess.getTraceItemAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleState_in_rule__TraceItem__Alternatives1146);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getTraceItemAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:586:6: ( ruleTransition )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:586:6: ( ruleTransition )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:587:1: ruleTransition
                    {
                     before(grammarAccess.getTraceItemAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__TraceItem__Alternatives1163);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:598:1: rule__Transition__Alternatives : ( ( ruleActionTransition ) | ( ruleDelayTransition ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:602:1: ( ( ruleActionTransition ) | ( ruleDelayTransition ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:603:1: ( ruleActionTransition )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:603:1: ( ruleActionTransition )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:604:1: ruleActionTransition
                    {
                     before(grammarAccess.getTransitionAccess().getActionTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionTransition_in_rule__Transition__Alternatives1196);
                    ruleActionTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getActionTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:609:6: ( ruleDelayTransition )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:609:6: ( ruleDelayTransition )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:610:1: ruleDelayTransition
                    {
                     before(grammarAccess.getTransitionAccess().getDelayTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDelayTransition_in_rule__Transition__Alternatives1213);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:620:1: rule__Result__Alternatives : ( ( ( '-- Property is satisfied.' ) ) | ( ( '-- Property is NOT satisfied.' ) ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:624:1: ( ( ( '-- Property is satisfied.' ) ) | ( ( '-- Property is NOT satisfied.' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:625:1: ( ( '-- Property is satisfied.' ) )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:625:1: ( ( '-- Property is satisfied.' ) )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:626:1: ( '-- Property is satisfied.' )
                    {
                     before(grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:627:1: ( '-- Property is satisfied.' )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:627:3: '-- Property is satisfied.'
                    {
                    match(input,16,FOLLOW_16_in_rule__Result__Alternatives1246); 

                    }

                     after(grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:632:6: ( ( '-- Property is NOT satisfied.' ) )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:632:6: ( ( '-- Property is NOT satisfied.' ) )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:633:1: ( '-- Property is NOT satisfied.' )
                    {
                     before(grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:634:1: ( '-- Property is NOT satisfied.' )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:634:3: '-- Property is NOT satisfied.'
                    {
                    match(input,17,FOLLOW_17_in_rule__Result__Alternatives1267); 

                    }

                     after(grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_1()); 

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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:644:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:648:1: ( ( ( '=' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt5=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:649:1: ( ( '=' ) )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:649:1: ( ( '=' ) )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:650:1: ( '=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:651:1: ( '=' )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:651:3: '='
                    {
                    match(input,18,FOLLOW_18_in_rule__CompareOperator__Alternatives1303); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:656:6: ( ( '<=' ) )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:656:6: ( ( '<=' ) )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:657:1: ( '<=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:658:1: ( '<=' )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:658:3: '<='
                    {
                    match(input,19,FOLLOW_19_in_rule__CompareOperator__Alternatives1324); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:663:6: ( ( '>=' ) )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:663:6: ( ( '>=' ) )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:664:1: ( '>=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:665:1: ( '>=' )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:665:3: '>='
                    {
                    match(input,20,FOLLOW_20_in_rule__CompareOperator__Alternatives1345); 

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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:675:1: rule__SynchronizationKind__Alternatives : ( ( ( '?' ) ) | ( ( '!' ) ) );
    public final void rule__SynchronizationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:679:1: ( ( ( '?' ) ) | ( ( '!' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:680:1: ( ( '?' ) )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:680:1: ( ( '?' ) )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:681:1: ( '?' )
                    {
                     before(grammarAccess.getSynchronizationKindAccess().getRECEIVEEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:682:1: ( '?' )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:682:3: '?'
                    {
                    match(input,21,FOLLOW_21_in_rule__SynchronizationKind__Alternatives1381); 

                    }

                     after(grammarAccess.getSynchronizationKindAccess().getRECEIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:687:6: ( ( '!' ) )
                    {
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:687:6: ( ( '!' ) )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:688:1: ( '!' )
                    {
                     before(grammarAccess.getSynchronizationKindAccess().getSENDEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:689:1: ( '!' )
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:689:3: '!'
                    {
                    match(input,22,FOLLOW_22_in_rule__SynchronizationKind__Alternatives1402); 

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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:701:1: rule__TraceRepository__Group__0 : rule__TraceRepository__Group__0__Impl rule__TraceRepository__Group__1 ;
    public final void rule__TraceRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:705:1: ( rule__TraceRepository__Group__0__Impl rule__TraceRepository__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:706:2: rule__TraceRepository__Group__0__Impl rule__TraceRepository__Group__1
            {
            pushFollow(FOLLOW_rule__TraceRepository__Group__0__Impl_in_rule__TraceRepository__Group__01435);
            rule__TraceRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TraceRepository__Group__1_in_rule__TraceRepository__Group__01438);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:713:1: rule__TraceRepository__Group__0__Impl : ( ( 'Cannot reuse state space when trace length optimisation is used.' )? ) ;
    public final void rule__TraceRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:717:1: ( ( ( 'Cannot reuse state space when trace length optimisation is used.' )? ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:718:1: ( ( 'Cannot reuse state space when trace length optimisation is used.' )? )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:718:1: ( ( 'Cannot reuse state space when trace length optimisation is used.' )? )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:719:1: ( 'Cannot reuse state space when trace length optimisation is used.' )?
            {
             before(grammarAccess.getTraceRepositoryAccess().getCannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:720:1: ( 'Cannot reuse state space when trace length optimisation is used.' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:721:2: 'Cannot reuse state space when trace length optimisation is used.'
                    {
                    match(input,23,FOLLOW_23_in_rule__TraceRepository__Group__0__Impl1467); 

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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:732:1: rule__TraceRepository__Group__1 : rule__TraceRepository__Group__1__Impl ;
    public final void rule__TraceRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:736:1: ( rule__TraceRepository__Group__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:737:2: rule__TraceRepository__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TraceRepository__Group__1__Impl_in_rule__TraceRepository__Group__11500);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:743:1: rule__TraceRepository__Group__1__Impl : ( ( rule__TraceRepository__TracesAssignment_1 )* ) ;
    public final void rule__TraceRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:747:1: ( ( ( rule__TraceRepository__TracesAssignment_1 )* ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:748:1: ( ( rule__TraceRepository__TracesAssignment_1 )* )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:748:1: ( ( rule__TraceRepository__TracesAssignment_1 )* )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:749:1: ( rule__TraceRepository__TracesAssignment_1 )*
            {
             before(grammarAccess.getTraceRepositoryAccess().getTracesAssignment_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:750:1: ( rule__TraceRepository__TracesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:750:2: rule__TraceRepository__TracesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TraceRepository__TracesAssignment_1_in_rule__TraceRepository__Group__1__Impl1527);
            	    rule__TraceRepository__TracesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:764:1: rule__Trace__Group__0 : rule__Trace__Group__0__Impl rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:768:1: ( rule__Trace__Group__0__Impl rule__Trace__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:769:2: rule__Trace__Group__0__Impl rule__Trace__Group__1
            {
            pushFollow(FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__01562);
            rule__Trace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__01565);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:776:1: rule__Trace__Group__0__Impl : ( 'Verifying property' ) ;
    public final void rule__Trace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:780:1: ( ( 'Verifying property' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:781:1: ( 'Verifying property' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:781:1: ( 'Verifying property' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:782:1: 'Verifying property'
            {
             before(grammarAccess.getTraceAccess().getVerifyingPropertyKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Trace__Group__0__Impl1593); 
             after(grammarAccess.getTraceAccess().getVerifyingPropertyKeyword_0()); 

            }


            }

        }
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:795:1: rule__Trace__Group__1 : rule__Trace__Group__1__Impl rule__Trace__Group__2 ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:799:1: ( rule__Trace__Group__1__Impl rule__Trace__Group__2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:800:2: rule__Trace__Group__1__Impl rule__Trace__Group__2
            {
            pushFollow(FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__11624);
            rule__Trace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__11627);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:807:1: rule__Trace__Group__1__Impl : ( ( rule__Trace__PropertyAssignment_1 ) ) ;
    public final void rule__Trace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:811:1: ( ( ( rule__Trace__PropertyAssignment_1 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:812:1: ( ( rule__Trace__PropertyAssignment_1 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:812:1: ( ( rule__Trace__PropertyAssignment_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:813:1: ( rule__Trace__PropertyAssignment_1 )
            {
             before(grammarAccess.getTraceAccess().getPropertyAssignment_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:814:1: ( rule__Trace__PropertyAssignment_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:814:2: rule__Trace__PropertyAssignment_1
            {
            pushFollow(FOLLOW_rule__Trace__PropertyAssignment_1_in_rule__Trace__Group__1__Impl1654);
            rule__Trace__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getPropertyAssignment_1()); 

            }


            }

        }
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:824:1: rule__Trace__Group__2 : rule__Trace__Group__2__Impl rule__Trace__Group__3 ;
    public final void rule__Trace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:828:1: ( rule__Trace__Group__2__Impl rule__Trace__Group__3 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:829:2: rule__Trace__Group__2__Impl rule__Trace__Group__3
            {
            pushFollow(FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__21684);
            rule__Trace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__21687);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:836:1: rule__Trace__Group__2__Impl : ( 'at line' ) ;
    public final void rule__Trace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:840:1: ( ( 'at line' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:841:1: ( 'at line' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:841:1: ( 'at line' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:842:1: 'at line'
            {
             before(grammarAccess.getTraceAccess().getAtLineKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Trace__Group__2__Impl1715); 
             after(grammarAccess.getTraceAccess().getAtLineKeyword_2()); 

            }


            }

        }
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:855:1: rule__Trace__Group__3 : rule__Trace__Group__3__Impl rule__Trace__Group__4 ;
    public final void rule__Trace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:859:1: ( rule__Trace__Group__3__Impl rule__Trace__Group__4 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:860:2: rule__Trace__Group__3__Impl rule__Trace__Group__4
            {
            pushFollow(FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31746);
            rule__Trace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__31749);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:867:1: rule__Trace__Group__3__Impl : ( ( rule__Trace__LineAssignment_3 ) ) ;
    public final void rule__Trace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:871:1: ( ( ( rule__Trace__LineAssignment_3 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:872:1: ( ( rule__Trace__LineAssignment_3 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:872:1: ( ( rule__Trace__LineAssignment_3 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:873:1: ( rule__Trace__LineAssignment_3 )
            {
             before(grammarAccess.getTraceAccess().getLineAssignment_3()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:874:1: ( rule__Trace__LineAssignment_3 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:874:2: rule__Trace__LineAssignment_3
            {
            pushFollow(FOLLOW_rule__Trace__LineAssignment_3_in_rule__Trace__Group__3__Impl1776);
            rule__Trace__LineAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getLineAssignment_3()); 

            }


            }

        }
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:884:1: rule__Trace__Group__4 : rule__Trace__Group__4__Impl rule__Trace__Group__5 ;
    public final void rule__Trace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:888:1: ( rule__Trace__Group__4__Impl rule__Trace__Group__5 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:889:2: rule__Trace__Group__4__Impl rule__Trace__Group__5
            {
            pushFollow(FOLLOW_rule__Trace__Group__4__Impl_in_rule__Trace__Group__41806);
            rule__Trace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__41809);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:896:1: rule__Trace__Group__4__Impl : ( ( rule__Trace__ResultAssignment_4 ) ) ;
    public final void rule__Trace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:900:1: ( ( ( rule__Trace__ResultAssignment_4 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:901:1: ( ( rule__Trace__ResultAssignment_4 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:901:1: ( ( rule__Trace__ResultAssignment_4 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:902:1: ( rule__Trace__ResultAssignment_4 )
            {
             before(grammarAccess.getTraceAccess().getResultAssignment_4()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:903:1: ( rule__Trace__ResultAssignment_4 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:903:2: rule__Trace__ResultAssignment_4
            {
            pushFollow(FOLLOW_rule__Trace__ResultAssignment_4_in_rule__Trace__Group__4__Impl1836);
            rule__Trace__ResultAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getResultAssignment_4()); 

            }


            }

        }
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:913:1: rule__Trace__Group__5 : rule__Trace__Group__5__Impl ;
    public final void rule__Trace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:917:1: ( rule__Trace__Group__5__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:918:2: rule__Trace__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Trace__Group__5__Impl_in_rule__Trace__Group__51866);
            rule__Trace__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:924:1: rule__Trace__Group__5__Impl : ( ( rule__Trace__Group_5__0 )? ) ;
    public final void rule__Trace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:928:1: ( ( ( rule__Trace__Group_5__0 )? ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:929:1: ( ( rule__Trace__Group_5__0 )? )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:929:1: ( ( rule__Trace__Group_5__0 )? )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:930:1: ( rule__Trace__Group_5__0 )?
            {
             before(grammarAccess.getTraceAccess().getGroup_5()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:931:1: ( rule__Trace__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=14 && LA9_0<=15)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:931:2: rule__Trace__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Trace__Group_5__0_in_rule__Trace__Group__5__Impl1893);
                    rule__Trace__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTraceAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Trace__Group_5__0"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:953:1: rule__Trace__Group_5__0 : rule__Trace__Group_5__0__Impl rule__Trace__Group_5__1 ;
    public final void rule__Trace__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:957:1: ( rule__Trace__Group_5__0__Impl rule__Trace__Group_5__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:958:2: rule__Trace__Group_5__0__Impl rule__Trace__Group_5__1
            {
            pushFollow(FOLLOW_rule__Trace__Group_5__0__Impl_in_rule__Trace__Group_5__01936);
            rule__Trace__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group_5__1_in_rule__Trace__Group_5__01939);
            rule__Trace__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group_5__0"


    // $ANTLR start "rule__Trace__Group_5__0__Impl"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:965:1: rule__Trace__Group_5__0__Impl : ( ( rule__Trace__Alternatives_5_0 ) ) ;
    public final void rule__Trace__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:969:1: ( ( ( rule__Trace__Alternatives_5_0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:970:1: ( ( rule__Trace__Alternatives_5_0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:970:1: ( ( rule__Trace__Alternatives_5_0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:971:1: ( rule__Trace__Alternatives_5_0 )
            {
             before(grammarAccess.getTraceAccess().getAlternatives_5_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:972:1: ( rule__Trace__Alternatives_5_0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:972:2: rule__Trace__Alternatives_5_0
            {
            pushFollow(FOLLOW_rule__Trace__Alternatives_5_0_in_rule__Trace__Group_5__0__Impl1966);
            rule__Trace__Alternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group_5__0__Impl"


    // $ANTLR start "rule__Trace__Group_5__1"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:982:1: rule__Trace__Group_5__1 : rule__Trace__Group_5__1__Impl ;
    public final void rule__Trace__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:986:1: ( rule__Trace__Group_5__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:987:2: rule__Trace__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Trace__Group_5__1__Impl_in_rule__Trace__Group_5__11996);
            rule__Trace__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group_5__1"


    // $ANTLR start "rule__Trace__Group_5__1__Impl"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:993:1: rule__Trace__Group_5__1__Impl : ( ( ( rule__Trace__TraceItemsAssignment_5_1 ) ) ( ( rule__Trace__TraceItemsAssignment_5_1 )* ) ) ;
    public final void rule__Trace__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:997:1: ( ( ( ( rule__Trace__TraceItemsAssignment_5_1 ) ) ( ( rule__Trace__TraceItemsAssignment_5_1 )* ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:998:1: ( ( ( rule__Trace__TraceItemsAssignment_5_1 ) ) ( ( rule__Trace__TraceItemsAssignment_5_1 )* ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:998:1: ( ( ( rule__Trace__TraceItemsAssignment_5_1 ) ) ( ( rule__Trace__TraceItemsAssignment_5_1 )* ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:999:1: ( ( rule__Trace__TraceItemsAssignment_5_1 ) ) ( ( rule__Trace__TraceItemsAssignment_5_1 )* )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:999:1: ( ( rule__Trace__TraceItemsAssignment_5_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1000:1: ( rule__Trace__TraceItemsAssignment_5_1 )
            {
             before(grammarAccess.getTraceAccess().getTraceItemsAssignment_5_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1001:1: ( rule__Trace__TraceItemsAssignment_5_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1001:2: rule__Trace__TraceItemsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Trace__TraceItemsAssignment_5_1_in_rule__Trace__Group_5__1__Impl2025);
            rule__Trace__TraceItemsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getTraceItemsAssignment_5_1()); 

            }

            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1004:1: ( ( rule__Trace__TraceItemsAssignment_5_1 )* )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1005:1: ( rule__Trace__TraceItemsAssignment_5_1 )*
            {
             before(grammarAccess.getTraceAccess().getTraceItemsAssignment_5_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1006:1: ( rule__Trace__TraceItemsAssignment_5_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33||(LA10_0>=36 && LA10_0<=37)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1006:2: rule__Trace__TraceItemsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Trace__TraceItemsAssignment_5_1_in_rule__Trace__Group_5__1__Impl2037);
            	    rule__Trace__TraceItemsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTraceAccess().getTraceItemsAssignment_5_1()); 

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
    // $ANTLR end "rule__Trace__Group_5__1__Impl"


    // $ANTLR start "rule__ProcessIdentifier__Group__0"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1021:1: rule__ProcessIdentifier__Group__0 : rule__ProcessIdentifier__Group__0__Impl rule__ProcessIdentifier__Group__1 ;
    public final void rule__ProcessIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1025:1: ( rule__ProcessIdentifier__Group__0__Impl rule__ProcessIdentifier__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1026:2: rule__ProcessIdentifier__Group__0__Impl rule__ProcessIdentifier__Group__1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group__0__Impl_in_rule__ProcessIdentifier__Group__02074);
            rule__ProcessIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group__1_in_rule__ProcessIdentifier__Group__02077);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1033:1: rule__ProcessIdentifier__Group__0__Impl : ( ( rule__ProcessIdentifier__TemplateAssignment_0 ) ) ;
    public final void rule__ProcessIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1037:1: ( ( ( rule__ProcessIdentifier__TemplateAssignment_0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1038:1: ( ( rule__ProcessIdentifier__TemplateAssignment_0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1038:1: ( ( rule__ProcessIdentifier__TemplateAssignment_0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1039:1: ( rule__ProcessIdentifier__TemplateAssignment_0 )
            {
             before(grammarAccess.getProcessIdentifierAccess().getTemplateAssignment_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1040:1: ( rule__ProcessIdentifier__TemplateAssignment_0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1040:2: rule__ProcessIdentifier__TemplateAssignment_0
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__TemplateAssignment_0_in_rule__ProcessIdentifier__Group__0__Impl2104);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1050:1: rule__ProcessIdentifier__Group__1 : rule__ProcessIdentifier__Group__1__Impl ;
    public final void rule__ProcessIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1054:1: ( rule__ProcessIdentifier__Group__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1055:2: rule__ProcessIdentifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group__1__Impl_in_rule__ProcessIdentifier__Group__12134);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1061:1: rule__ProcessIdentifier__Group__1__Impl : ( ( rule__ProcessIdentifier__Group_1__0 )? ) ;
    public final void rule__ProcessIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1065:1: ( ( ( rule__ProcessIdentifier__Group_1__0 )? ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1066:1: ( ( rule__ProcessIdentifier__Group_1__0 )? )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1066:1: ( ( rule__ProcessIdentifier__Group_1__0 )? )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1067:1: ( rule__ProcessIdentifier__Group_1__0 )?
            {
             before(grammarAccess.getProcessIdentifierAccess().getGroup_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1068:1: ( rule__ProcessIdentifier__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1068:2: rule__ProcessIdentifier__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__0_in_rule__ProcessIdentifier__Group__1__Impl2161);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1082:1: rule__ProcessIdentifier__Group_1__0 : rule__ProcessIdentifier__Group_1__0__Impl rule__ProcessIdentifier__Group_1__1 ;
    public final void rule__ProcessIdentifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1086:1: ( rule__ProcessIdentifier__Group_1__0__Impl rule__ProcessIdentifier__Group_1__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1087:2: rule__ProcessIdentifier__Group_1__0__Impl rule__ProcessIdentifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__0__Impl_in_rule__ProcessIdentifier__Group_1__02196);
            rule__ProcessIdentifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__1_in_rule__ProcessIdentifier__Group_1__02199);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1094:1: rule__ProcessIdentifier__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ProcessIdentifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1098:1: ( ( '(' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1099:1: ( '(' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1099:1: ( '(' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1100:1: '('
            {
             before(grammarAccess.getProcessIdentifierAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__ProcessIdentifier__Group_1__0__Impl2227); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1113:1: rule__ProcessIdentifier__Group_1__1 : rule__ProcessIdentifier__Group_1__1__Impl rule__ProcessIdentifier__Group_1__2 ;
    public final void rule__ProcessIdentifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1117:1: ( rule__ProcessIdentifier__Group_1__1__Impl rule__ProcessIdentifier__Group_1__2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1118:2: rule__ProcessIdentifier__Group_1__1__Impl rule__ProcessIdentifier__Group_1__2
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__1__Impl_in_rule__ProcessIdentifier__Group_1__12258);
            rule__ProcessIdentifier__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__2_in_rule__ProcessIdentifier__Group_1__12261);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1125:1: rule__ProcessIdentifier__Group_1__1__Impl : ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__ProcessIdentifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1129:1: ( ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1130:1: ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1130:1: ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1131:1: ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 )
            {
             before(grammarAccess.getProcessIdentifierAccess().getArgumentsAssignment_1_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1132:1: ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1132:2: rule__ProcessIdentifier__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__ArgumentsAssignment_1_1_in_rule__ProcessIdentifier__Group_1__1__Impl2288);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1142:1: rule__ProcessIdentifier__Group_1__2 : rule__ProcessIdentifier__Group_1__2__Impl rule__ProcessIdentifier__Group_1__3 ;
    public final void rule__ProcessIdentifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1146:1: ( rule__ProcessIdentifier__Group_1__2__Impl rule__ProcessIdentifier__Group_1__3 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1147:2: rule__ProcessIdentifier__Group_1__2__Impl rule__ProcessIdentifier__Group_1__3
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__2__Impl_in_rule__ProcessIdentifier__Group_1__22318);
            rule__ProcessIdentifier__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__3_in_rule__ProcessIdentifier__Group_1__22321);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1154:1: rule__ProcessIdentifier__Group_1__2__Impl : ( ( rule__ProcessIdentifier__Group_1_2__0 )* ) ;
    public final void rule__ProcessIdentifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1158:1: ( ( ( rule__ProcessIdentifier__Group_1_2__0 )* ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1159:1: ( ( rule__ProcessIdentifier__Group_1_2__0 )* )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1159:1: ( ( rule__ProcessIdentifier__Group_1_2__0 )* )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1160:1: ( rule__ProcessIdentifier__Group_1_2__0 )*
            {
             before(grammarAccess.getProcessIdentifierAccess().getGroup_1_2()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1161:1: ( rule__ProcessIdentifier__Group_1_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1161:2: rule__ProcessIdentifier__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1_2__0_in_rule__ProcessIdentifier__Group_1__2__Impl2348);
            	    rule__ProcessIdentifier__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1171:1: rule__ProcessIdentifier__Group_1__3 : rule__ProcessIdentifier__Group_1__3__Impl ;
    public final void rule__ProcessIdentifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1175:1: ( rule__ProcessIdentifier__Group_1__3__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1176:2: rule__ProcessIdentifier__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__3__Impl_in_rule__ProcessIdentifier__Group_1__32379);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1182:1: rule__ProcessIdentifier__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ProcessIdentifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1186:1: ( ( ')' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1187:1: ( ')' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1187:1: ( ')' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1188:1: ')'
            {
             before(grammarAccess.getProcessIdentifierAccess().getRightParenthesisKeyword_1_3()); 
            match(input,27,FOLLOW_27_in_rule__ProcessIdentifier__Group_1__3__Impl2407); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1209:1: rule__ProcessIdentifier__Group_1_2__0 : rule__ProcessIdentifier__Group_1_2__0__Impl rule__ProcessIdentifier__Group_1_2__1 ;
    public final void rule__ProcessIdentifier__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1213:1: ( rule__ProcessIdentifier__Group_1_2__0__Impl rule__ProcessIdentifier__Group_1_2__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1214:2: rule__ProcessIdentifier__Group_1_2__0__Impl rule__ProcessIdentifier__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1_2__0__Impl_in_rule__ProcessIdentifier__Group_1_2__02446);
            rule__ProcessIdentifier__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1_2__1_in_rule__ProcessIdentifier__Group_1_2__02449);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1221:1: rule__ProcessIdentifier__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ProcessIdentifier__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1225:1: ( ( ',' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1226:1: ( ',' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1226:1: ( ',' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1227:1: ','
            {
             before(grammarAccess.getProcessIdentifierAccess().getCommaKeyword_1_2_0()); 
            match(input,28,FOLLOW_28_in_rule__ProcessIdentifier__Group_1_2__0__Impl2477); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1240:1: rule__ProcessIdentifier__Group_1_2__1 : rule__ProcessIdentifier__Group_1_2__1__Impl ;
    public final void rule__ProcessIdentifier__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1244:1: ( rule__ProcessIdentifier__Group_1_2__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1245:2: rule__ProcessIdentifier__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1_2__1__Impl_in_rule__ProcessIdentifier__Group_1_2__12508);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1251:1: rule__ProcessIdentifier__Group_1_2__1__Impl : ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__ProcessIdentifier__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1255:1: ( ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1256:1: ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1256:1: ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1257:1: ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 )
            {
             before(grammarAccess.getProcessIdentifierAccess().getArgumentsAssignment_1_2_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1258:1: ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1258:2: rule__ProcessIdentifier__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__ArgumentsAssignment_1_2_1_in_rule__ProcessIdentifier__Group_1_2__1__Impl2535);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1272:1: rule__LocationActivity__Group__0 : rule__LocationActivity__Group__0__Impl rule__LocationActivity__Group__1 ;
    public final void rule__LocationActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1276:1: ( rule__LocationActivity__Group__0__Impl rule__LocationActivity__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1277:2: rule__LocationActivity__Group__0__Impl rule__LocationActivity__Group__1
            {
            pushFollow(FOLLOW_rule__LocationActivity__Group__0__Impl_in_rule__LocationActivity__Group__02569);
            rule__LocationActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocationActivity__Group__1_in_rule__LocationActivity__Group__02572);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1284:1: rule__LocationActivity__Group__0__Impl : ( ( rule__LocationActivity__ProcessAssignment_0 ) ) ;
    public final void rule__LocationActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1288:1: ( ( ( rule__LocationActivity__ProcessAssignment_0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1289:1: ( ( rule__LocationActivity__ProcessAssignment_0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1289:1: ( ( rule__LocationActivity__ProcessAssignment_0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1290:1: ( rule__LocationActivity__ProcessAssignment_0 )
            {
             before(grammarAccess.getLocationActivityAccess().getProcessAssignment_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1291:1: ( rule__LocationActivity__ProcessAssignment_0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1291:2: rule__LocationActivity__ProcessAssignment_0
            {
            pushFollow(FOLLOW_rule__LocationActivity__ProcessAssignment_0_in_rule__LocationActivity__Group__0__Impl2599);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1301:1: rule__LocationActivity__Group__1 : rule__LocationActivity__Group__1__Impl rule__LocationActivity__Group__2 ;
    public final void rule__LocationActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1305:1: ( rule__LocationActivity__Group__1__Impl rule__LocationActivity__Group__2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1306:2: rule__LocationActivity__Group__1__Impl rule__LocationActivity__Group__2
            {
            pushFollow(FOLLOW_rule__LocationActivity__Group__1__Impl_in_rule__LocationActivity__Group__12629);
            rule__LocationActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocationActivity__Group__2_in_rule__LocationActivity__Group__12632);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1313:1: rule__LocationActivity__Group__1__Impl : ( '.' ) ;
    public final void rule__LocationActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1317:1: ( ( '.' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1318:1: ( '.' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1318:1: ( '.' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1319:1: '.'
            {
             before(grammarAccess.getLocationActivityAccess().getFullStopKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__LocationActivity__Group__1__Impl2660); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1332:1: rule__LocationActivity__Group__2 : rule__LocationActivity__Group__2__Impl ;
    public final void rule__LocationActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1336:1: ( rule__LocationActivity__Group__2__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1337:2: rule__LocationActivity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LocationActivity__Group__2__Impl_in_rule__LocationActivity__Group__22691);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1343:1: rule__LocationActivity__Group__2__Impl : ( ( rule__LocationActivity__LocationAssignment_2 ) ) ;
    public final void rule__LocationActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1347:1: ( ( ( rule__LocationActivity__LocationAssignment_2 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1348:1: ( ( rule__LocationActivity__LocationAssignment_2 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1348:1: ( ( rule__LocationActivity__LocationAssignment_2 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1349:1: ( rule__LocationActivity__LocationAssignment_2 )
            {
             before(grammarAccess.getLocationActivityAccess().getLocationAssignment_2()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1350:1: ( rule__LocationActivity__LocationAssignment_2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1350:2: rule__LocationActivity__LocationAssignment_2
            {
            pushFollow(FOLLOW_rule__LocationActivity__LocationAssignment_2_in_rule__LocationActivity__Group__2__Impl2718);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1366:1: rule__VariableValue__Group__0 : rule__VariableValue__Group__0__Impl rule__VariableValue__Group__1 ;
    public final void rule__VariableValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1370:1: ( rule__VariableValue__Group__0__Impl rule__VariableValue__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1371:2: rule__VariableValue__Group__0__Impl rule__VariableValue__Group__1
            {
            pushFollow(FOLLOW_rule__VariableValue__Group__0__Impl_in_rule__VariableValue__Group__02754);
            rule__VariableValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableValue__Group__1_in_rule__VariableValue__Group__02757);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1378:1: rule__VariableValue__Group__0__Impl : ( ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 ) ) ;
    public final void rule__VariableValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1382:1: ( ( ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1383:1: ( ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1383:1: ( ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1384:1: ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 )
            {
             before(grammarAccess.getVariableValueAccess().getFirstNamedElementReferenceAssignment_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1385:1: ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1385:2: rule__VariableValue__FirstNamedElementReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableValue__FirstNamedElementReferenceAssignment_0_in_rule__VariableValue__Group__0__Impl2784);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1395:1: rule__VariableValue__Group__1 : rule__VariableValue__Group__1__Impl rule__VariableValue__Group__2 ;
    public final void rule__VariableValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1399:1: ( rule__VariableValue__Group__1__Impl rule__VariableValue__Group__2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1400:2: rule__VariableValue__Group__1__Impl rule__VariableValue__Group__2
            {
            pushFollow(FOLLOW_rule__VariableValue__Group__1__Impl_in_rule__VariableValue__Group__12814);
            rule__VariableValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableValue__Group__2_in_rule__VariableValue__Group__12817);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1407:1: rule__VariableValue__Group__1__Impl : ( ( rule__VariableValue__Group_1__0 )? ) ;
    public final void rule__VariableValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1411:1: ( ( ( rule__VariableValue__Group_1__0 )? ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1412:1: ( ( rule__VariableValue__Group_1__0 )? )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1412:1: ( ( rule__VariableValue__Group_1__0 )? )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1413:1: ( rule__VariableValue__Group_1__0 )?
            {
             before(grammarAccess.getVariableValueAccess().getGroup_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1414:1: ( rule__VariableValue__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1414:2: rule__VariableValue__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VariableValue__Group_1__0_in_rule__VariableValue__Group__1__Impl2844);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1424:1: rule__VariableValue__Group__2 : rule__VariableValue__Group__2__Impl rule__VariableValue__Group__3 ;
    public final void rule__VariableValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1428:1: ( rule__VariableValue__Group__2__Impl rule__VariableValue__Group__3 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1429:2: rule__VariableValue__Group__2__Impl rule__VariableValue__Group__3
            {
            pushFollow(FOLLOW_rule__VariableValue__Group__2__Impl_in_rule__VariableValue__Group__22875);
            rule__VariableValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableValue__Group__3_in_rule__VariableValue__Group__22878);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1436:1: rule__VariableValue__Group__2__Impl : ( ( rule__VariableValue__OperatorAssignment_2 ) ) ;
    public final void rule__VariableValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1440:1: ( ( ( rule__VariableValue__OperatorAssignment_2 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1441:1: ( ( rule__VariableValue__OperatorAssignment_2 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1441:1: ( ( rule__VariableValue__OperatorAssignment_2 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1442:1: ( rule__VariableValue__OperatorAssignment_2 )
            {
             before(grammarAccess.getVariableValueAccess().getOperatorAssignment_2()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1443:1: ( rule__VariableValue__OperatorAssignment_2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1443:2: rule__VariableValue__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableValue__OperatorAssignment_2_in_rule__VariableValue__Group__2__Impl2905);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1453:1: rule__VariableValue__Group__3 : rule__VariableValue__Group__3__Impl ;
    public final void rule__VariableValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1457:1: ( rule__VariableValue__Group__3__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1458:2: rule__VariableValue__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableValue__Group__3__Impl_in_rule__VariableValue__Group__32935);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1464:1: rule__VariableValue__Group__3__Impl : ( ( rule__VariableValue__ValueAssignment_3 ) ) ;
    public final void rule__VariableValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1468:1: ( ( ( rule__VariableValue__ValueAssignment_3 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1469:1: ( ( rule__VariableValue__ValueAssignment_3 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1469:1: ( ( rule__VariableValue__ValueAssignment_3 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1470:1: ( rule__VariableValue__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableValueAccess().getValueAssignment_3()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1471:1: ( rule__VariableValue__ValueAssignment_3 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1471:2: rule__VariableValue__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableValue__ValueAssignment_3_in_rule__VariableValue__Group__3__Impl2962);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1489:1: rule__VariableValue__Group_1__0 : rule__VariableValue__Group_1__0__Impl rule__VariableValue__Group_1__1 ;
    public final void rule__VariableValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1493:1: ( rule__VariableValue__Group_1__0__Impl rule__VariableValue__Group_1__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1494:2: rule__VariableValue__Group_1__0__Impl rule__VariableValue__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableValue__Group_1__0__Impl_in_rule__VariableValue__Group_1__03000);
            rule__VariableValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableValue__Group_1__1_in_rule__VariableValue__Group_1__03003);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1501:1: rule__VariableValue__Group_1__0__Impl : ( '-' ) ;
    public final void rule__VariableValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1505:1: ( ( '-' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1506:1: ( '-' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1506:1: ( '-' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1507:1: '-'
            {
             before(grammarAccess.getVariableValueAccess().getHyphenMinusKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__VariableValue__Group_1__0__Impl3031); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1520:1: rule__VariableValue__Group_1__1 : rule__VariableValue__Group_1__1__Impl ;
    public final void rule__VariableValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1524:1: ( rule__VariableValue__Group_1__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1525:2: rule__VariableValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableValue__Group_1__1__Impl_in_rule__VariableValue__Group_1__13062);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1531:1: rule__VariableValue__Group_1__1__Impl : ( ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 ) ) ;
    public final void rule__VariableValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1535:1: ( ( ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1536:1: ( ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1536:1: ( ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1537:1: ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 )
            {
             before(grammarAccess.getVariableValueAccess().getSecondNamedElementReferenceAssignment_1_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1538:1: ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1538:2: rule__VariableValue__SecondNamedElementReferenceAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VariableValue__SecondNamedElementReferenceAssignment_1_1_in_rule__VariableValue__Group_1__1__Impl3089);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1552:1: rule__SingleNamedElementReference__Group__0 : rule__SingleNamedElementReference__Group__0__Impl rule__SingleNamedElementReference__Group__1 ;
    public final void rule__SingleNamedElementReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1556:1: ( rule__SingleNamedElementReference__Group__0__Impl rule__SingleNamedElementReference__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1557:2: rule__SingleNamedElementReference__Group__0__Impl rule__SingleNamedElementReference__Group__1
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group__0__Impl_in_rule__SingleNamedElementReference__Group__03123);
            rule__SingleNamedElementReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group__1_in_rule__SingleNamedElementReference__Group__03126);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1564:1: rule__SingleNamedElementReference__Group__0__Impl : ( ( rule__SingleNamedElementReference__NamedElementAssignment_0 ) ) ;
    public final void rule__SingleNamedElementReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1568:1: ( ( ( rule__SingleNamedElementReference__NamedElementAssignment_0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1569:1: ( ( rule__SingleNamedElementReference__NamedElementAssignment_0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1569:1: ( ( rule__SingleNamedElementReference__NamedElementAssignment_0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1570:1: ( rule__SingleNamedElementReference__NamedElementAssignment_0 )
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementAssignment_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1571:1: ( rule__SingleNamedElementReference__NamedElementAssignment_0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1571:2: rule__SingleNamedElementReference__NamedElementAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__NamedElementAssignment_0_in_rule__SingleNamedElementReference__Group__0__Impl3153);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1581:1: rule__SingleNamedElementReference__Group__1 : rule__SingleNamedElementReference__Group__1__Impl ;
    public final void rule__SingleNamedElementReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1585:1: ( rule__SingleNamedElementReference__Group__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1586:2: rule__SingleNamedElementReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group__1__Impl_in_rule__SingleNamedElementReference__Group__13183);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1592:1: rule__SingleNamedElementReference__Group__1__Impl : ( ( rule__SingleNamedElementReference__Group_1__0 )* ) ;
    public final void rule__SingleNamedElementReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1596:1: ( ( ( rule__SingleNamedElementReference__Group_1__0 )* ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1597:1: ( ( rule__SingleNamedElementReference__Group_1__0 )* )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1597:1: ( ( rule__SingleNamedElementReference__Group_1__0 )* )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1598:1: ( rule__SingleNamedElementReference__Group_1__0 )*
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getGroup_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1599:1: ( rule__SingleNamedElementReference__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1599:2: rule__SingleNamedElementReference__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__0_in_rule__SingleNamedElementReference__Group__1__Impl3210);
            	    rule__SingleNamedElementReference__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1613:1: rule__SingleNamedElementReference__Group_1__0 : rule__SingleNamedElementReference__Group_1__0__Impl rule__SingleNamedElementReference__Group_1__1 ;
    public final void rule__SingleNamedElementReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1617:1: ( rule__SingleNamedElementReference__Group_1__0__Impl rule__SingleNamedElementReference__Group_1__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1618:2: rule__SingleNamedElementReference__Group_1__0__Impl rule__SingleNamedElementReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__0__Impl_in_rule__SingleNamedElementReference__Group_1__03245);
            rule__SingleNamedElementReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__1_in_rule__SingleNamedElementReference__Group_1__03248);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1625:1: rule__SingleNamedElementReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__SingleNamedElementReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1629:1: ( ( '[' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1630:1: ( '[' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1630:1: ( '[' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1631:1: '['
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__SingleNamedElementReference__Group_1__0__Impl3276); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1644:1: rule__SingleNamedElementReference__Group_1__1 : rule__SingleNamedElementReference__Group_1__1__Impl rule__SingleNamedElementReference__Group_1__2 ;
    public final void rule__SingleNamedElementReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1648:1: ( rule__SingleNamedElementReference__Group_1__1__Impl rule__SingleNamedElementReference__Group_1__2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1649:2: rule__SingleNamedElementReference__Group_1__1__Impl rule__SingleNamedElementReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__1__Impl_in_rule__SingleNamedElementReference__Group_1__13307);
            rule__SingleNamedElementReference__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__2_in_rule__SingleNamedElementReference__Group_1__13310);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1656:1: rule__SingleNamedElementReference__Group_1__1__Impl : ( ( rule__SingleNamedElementReference__IndexesAssignment_1_1 ) ) ;
    public final void rule__SingleNamedElementReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1660:1: ( ( ( rule__SingleNamedElementReference__IndexesAssignment_1_1 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1661:1: ( ( rule__SingleNamedElementReference__IndexesAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1661:1: ( ( rule__SingleNamedElementReference__IndexesAssignment_1_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1662:1: ( rule__SingleNamedElementReference__IndexesAssignment_1_1 )
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getIndexesAssignment_1_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1663:1: ( rule__SingleNamedElementReference__IndexesAssignment_1_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1663:2: rule__SingleNamedElementReference__IndexesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__IndexesAssignment_1_1_in_rule__SingleNamedElementReference__Group_1__1__Impl3337);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1673:1: rule__SingleNamedElementReference__Group_1__2 : rule__SingleNamedElementReference__Group_1__2__Impl ;
    public final void rule__SingleNamedElementReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1677:1: ( rule__SingleNamedElementReference__Group_1__2__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1678:2: rule__SingleNamedElementReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__2__Impl_in_rule__SingleNamedElementReference__Group_1__23367);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1684:1: rule__SingleNamedElementReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__SingleNamedElementReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1688:1: ( ( ']' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1689:1: ( ']' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1689:1: ( ']' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1690:1: ']'
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,32,FOLLOW_32_in_rule__SingleNamedElementReference__Group_1__2__Impl3395); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1709:1: rule__NamedElementReference__Group__0 : rule__NamedElementReference__Group__0__Impl rule__NamedElementReference__Group__1 ;
    public final void rule__NamedElementReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1713:1: ( rule__NamedElementReference__Group__0__Impl rule__NamedElementReference__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1714:2: rule__NamedElementReference__Group__0__Impl rule__NamedElementReference__Group__1
            {
            pushFollow(FOLLOW_rule__NamedElementReference__Group__0__Impl_in_rule__NamedElementReference__Group__03432);
            rule__NamedElementReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedElementReference__Group__1_in_rule__NamedElementReference__Group__03435);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1721:1: rule__NamedElementReference__Group__0__Impl : ( ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 ) ) ;
    public final void rule__NamedElementReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1725:1: ( ( ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1726:1: ( ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1726:1: ( ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1727:1: ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 )
            {
             before(grammarAccess.getNamedElementReferenceAccess().getSingleNamedElementReferenceAssignment_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1728:1: ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1728:2: rule__NamedElementReference__SingleNamedElementReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__NamedElementReference__SingleNamedElementReferenceAssignment_0_in_rule__NamedElementReference__Group__0__Impl3462);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1738:1: rule__NamedElementReference__Group__1 : rule__NamedElementReference__Group__1__Impl ;
    public final void rule__NamedElementReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1742:1: ( rule__NamedElementReference__Group__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1743:2: rule__NamedElementReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamedElementReference__Group__1__Impl_in_rule__NamedElementReference__Group__13492);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1749:1: rule__NamedElementReference__Group__1__Impl : ( ( rule__NamedElementReference__Group_1__0 )? ) ;
    public final void rule__NamedElementReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1753:1: ( ( ( rule__NamedElementReference__Group_1__0 )? ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1754:1: ( ( rule__NamedElementReference__Group_1__0 )? )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1754:1: ( ( rule__NamedElementReference__Group_1__0 )? )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1755:1: ( rule__NamedElementReference__Group_1__0 )?
            {
             before(grammarAccess.getNamedElementReferenceAccess().getGroup_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1756:1: ( rule__NamedElementReference__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1756:2: rule__NamedElementReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NamedElementReference__Group_1__0_in_rule__NamedElementReference__Group__1__Impl3519);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1770:1: rule__NamedElementReference__Group_1__0 : rule__NamedElementReference__Group_1__0__Impl rule__NamedElementReference__Group_1__1 ;
    public final void rule__NamedElementReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1774:1: ( rule__NamedElementReference__Group_1__0__Impl rule__NamedElementReference__Group_1__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1775:2: rule__NamedElementReference__Group_1__0__Impl rule__NamedElementReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__NamedElementReference__Group_1__0__Impl_in_rule__NamedElementReference__Group_1__03554);
            rule__NamedElementReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedElementReference__Group_1__1_in_rule__NamedElementReference__Group_1__03557);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1782:1: rule__NamedElementReference__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NamedElementReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1786:1: ( ( '.' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1787:1: ( '.' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1787:1: ( '.' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1788:1: '.'
            {
             before(grammarAccess.getNamedElementReferenceAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__NamedElementReference__Group_1__0__Impl3585); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1801:1: rule__NamedElementReference__Group_1__1 : rule__NamedElementReference__Group_1__1__Impl ;
    public final void rule__NamedElementReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1805:1: ( rule__NamedElementReference__Group_1__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1806:2: rule__NamedElementReference__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NamedElementReference__Group_1__1__Impl_in_rule__NamedElementReference__Group_1__13616);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1812:1: rule__NamedElementReference__Group_1__1__Impl : ( ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 ) ) ;
    public final void rule__NamedElementReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1816:1: ( ( ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1817:1: ( ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1817:1: ( ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1818:1: ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 )
            {
             before(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceAssignment_1_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1819:1: ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1819:2: rule__NamedElementReference__NamedElementReferenceAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NamedElementReference__NamedElementReferenceAssignment_1_1_in_rule__NamedElementReference__Group_1__1__Impl3643);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1833:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1837:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1838:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03677);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__03680);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1845:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1849:1: ( ( 'State' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1850:1: ( 'State' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1850:1: ( 'State' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1851:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__State__Group__0__Impl3708); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1864:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1868:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1869:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13739);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__13742);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1876:1: rule__State__Group__1__Impl : ( ( ':' )? ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1880:1: ( ( ( ':' )? ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1881:1: ( ( ':' )? )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1881:1: ( ( ':' )? )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1882:1: ( ':' )?
            {
             before(grammarAccess.getStateAccess().getColonKeyword_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1883:1: ( ':' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1884:2: ':'
                    {
                    match(input,34,FOLLOW_34_in_rule__State__Group__1__Impl3771); 

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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1895:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1899:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1900:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23804);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__23807);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1907:1: rule__State__Group__2__Impl : ( '(' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1911:1: ( ( '(' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1912:1: ( '(' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1912:1: ( '(' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1913:1: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__State__Group__2__Impl3835); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1926:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1930:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1931:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33866);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__33869);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1938:1: rule__State__Group__3__Impl : ( ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1942:1: ( ( ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1943:1: ( ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1943:1: ( ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1944:1: ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1944:1: ( ( rule__State__LocationActivitiesAssignment_3 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1945:1: ( rule__State__LocationActivitiesAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getLocationActivitiesAssignment_3()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1946:1: ( rule__State__LocationActivitiesAssignment_3 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1946:2: rule__State__LocationActivitiesAssignment_3
            {
            pushFollow(FOLLOW_rule__State__LocationActivitiesAssignment_3_in_rule__State__Group__3__Impl3898);
            rule__State__LocationActivitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getLocationActivitiesAssignment_3()); 

            }

            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1949:1: ( ( rule__State__LocationActivitiesAssignment_3 )* )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1950:1: ( rule__State__LocationActivitiesAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getLocationActivitiesAssignment_3()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1951:1: ( rule__State__LocationActivitiesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1951:2: rule__State__LocationActivitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__LocationActivitiesAssignment_3_in_rule__State__Group__3__Impl3910);
            	    rule__State__LocationActivitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1962:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1966:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1967:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43943);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__43946);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1974:1: rule__State__Group__4__Impl : ( ')' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1978:1: ( ( ')' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1979:1: ( ')' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1979:1: ( ')' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1980:1: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__State__Group__4__Impl3974); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1993:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1997:1: ( rule__State__Group__5__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1998:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__54005);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2004:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2008:1: ( ( ( rule__State__Group_5__0 )? ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2009:1: ( ( rule__State__Group_5__0 )? )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2009:1: ( ( rule__State__Group_5__0 )? )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2010:1: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2011:1: ( rule__State__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2011:2: rule__State__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl4032);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2033:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2037:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2038:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__04075);
            rule__State__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__04078);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2045:1: rule__State__Group_5__0__Impl : ( ( rule__State__VariableValuesAssignment_5_0 ) ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2049:1: ( ( ( rule__State__VariableValuesAssignment_5_0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2050:1: ( ( rule__State__VariableValuesAssignment_5_0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2050:1: ( ( rule__State__VariableValuesAssignment_5_0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2051:1: ( rule__State__VariableValuesAssignment_5_0 )
            {
             before(grammarAccess.getStateAccess().getVariableValuesAssignment_5_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2052:1: ( rule__State__VariableValuesAssignment_5_0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2052:2: rule__State__VariableValuesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__State__VariableValuesAssignment_5_0_in_rule__State__Group_5__0__Impl4105);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2062:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2066:1: ( rule__State__Group_5__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2067:2: rule__State__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__14135);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2073:1: rule__State__Group_5__1__Impl : ( ( rule__State__Group_5_1__0 )* ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2077:1: ( ( ( rule__State__Group_5_1__0 )* ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2078:1: ( ( rule__State__Group_5_1__0 )* )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2078:1: ( ( rule__State__Group_5_1__0 )* )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2079:1: ( rule__State__Group_5_1__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2080:1: ( rule__State__Group_5_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2080:2: rule__State__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__State__Group_5_1__0_in_rule__State__Group_5__1__Impl4162);
            	    rule__State__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2094:1: rule__State__Group_5_1__0 : rule__State__Group_5_1__0__Impl rule__State__Group_5_1__1 ;
    public final void rule__State__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2098:1: ( rule__State__Group_5_1__0__Impl rule__State__Group_5_1__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2099:2: rule__State__Group_5_1__0__Impl rule__State__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_5_1__0__Impl_in_rule__State__Group_5_1__04197);
            rule__State__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_5_1__1_in_rule__State__Group_5_1__04200);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2106:1: rule__State__Group_5_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__State__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2110:1: ( ( ( ',' )? ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2111:1: ( ( ',' )? )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2111:1: ( ( ',' )? )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2112:1: ( ',' )?
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_1_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2113:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2114:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__State__Group_5_1__0__Impl4229); 

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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2125:1: rule__State__Group_5_1__1 : rule__State__Group_5_1__1__Impl ;
    public final void rule__State__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2129:1: ( rule__State__Group_5_1__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2130:2: rule__State__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_5_1__1__Impl_in_rule__State__Group_5_1__14262);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2136:1: rule__State__Group_5_1__1__Impl : ( ( rule__State__VariableValuesAssignment_5_1_1 ) ) ;
    public final void rule__State__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2140:1: ( ( ( rule__State__VariableValuesAssignment_5_1_1 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2141:1: ( ( rule__State__VariableValuesAssignment_5_1_1 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2141:1: ( ( rule__State__VariableValuesAssignment_5_1_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2142:1: ( rule__State__VariableValuesAssignment_5_1_1 )
            {
             before(grammarAccess.getStateAccess().getVariableValuesAssignment_5_1_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2143:1: ( rule__State__VariableValuesAssignment_5_1_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2143:2: rule__State__VariableValuesAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__State__VariableValuesAssignment_5_1_1_in_rule__State__Group_5_1__1__Impl4289);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2157:1: rule__EdgeActivity__Group__0 : rule__EdgeActivity__Group__0__Impl rule__EdgeActivity__Group__1 ;
    public final void rule__EdgeActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2161:1: ( rule__EdgeActivity__Group__0__Impl rule__EdgeActivity__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2162:2: rule__EdgeActivity__Group__0__Impl rule__EdgeActivity__Group__1
            {
            pushFollow(FOLLOW_rule__EdgeActivity__Group__0__Impl_in_rule__EdgeActivity__Group__04323);
            rule__EdgeActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EdgeActivity__Group__1_in_rule__EdgeActivity__Group__04326);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2169:1: rule__EdgeActivity__Group__0__Impl : ( ( rule__EdgeActivity__SourceAssignment_0 ) ) ;
    public final void rule__EdgeActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2173:1: ( ( ( rule__EdgeActivity__SourceAssignment_0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2174:1: ( ( rule__EdgeActivity__SourceAssignment_0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2174:1: ( ( rule__EdgeActivity__SourceAssignment_0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2175:1: ( rule__EdgeActivity__SourceAssignment_0 )
            {
             before(grammarAccess.getEdgeActivityAccess().getSourceAssignment_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2176:1: ( rule__EdgeActivity__SourceAssignment_0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2176:2: rule__EdgeActivity__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__EdgeActivity__SourceAssignment_0_in_rule__EdgeActivity__Group__0__Impl4353);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2186:1: rule__EdgeActivity__Group__1 : rule__EdgeActivity__Group__1__Impl rule__EdgeActivity__Group__2 ;
    public final void rule__EdgeActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2190:1: ( rule__EdgeActivity__Group__1__Impl rule__EdgeActivity__Group__2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2191:2: rule__EdgeActivity__Group__1__Impl rule__EdgeActivity__Group__2
            {
            pushFollow(FOLLOW_rule__EdgeActivity__Group__1__Impl_in_rule__EdgeActivity__Group__14383);
            rule__EdgeActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EdgeActivity__Group__2_in_rule__EdgeActivity__Group__14386);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2198:1: rule__EdgeActivity__Group__1__Impl : ( '->' ) ;
    public final void rule__EdgeActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2202:1: ( ( '->' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2203:1: ( '->' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2203:1: ( '->' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2204:1: '->'
            {
             before(grammarAccess.getEdgeActivityAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__EdgeActivity__Group__1__Impl4414); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2217:1: rule__EdgeActivity__Group__2 : rule__EdgeActivity__Group__2__Impl rule__EdgeActivity__Group__3 ;
    public final void rule__EdgeActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2221:1: ( rule__EdgeActivity__Group__2__Impl rule__EdgeActivity__Group__3 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2222:2: rule__EdgeActivity__Group__2__Impl rule__EdgeActivity__Group__3
            {
            pushFollow(FOLLOW_rule__EdgeActivity__Group__2__Impl_in_rule__EdgeActivity__Group__24445);
            rule__EdgeActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EdgeActivity__Group__3_in_rule__EdgeActivity__Group__24448);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2229:1: rule__EdgeActivity__Group__2__Impl : ( ( rule__EdgeActivity__TargetAssignment_2 ) ) ;
    public final void rule__EdgeActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2233:1: ( ( ( rule__EdgeActivity__TargetAssignment_2 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2234:1: ( ( rule__EdgeActivity__TargetAssignment_2 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2234:1: ( ( rule__EdgeActivity__TargetAssignment_2 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2235:1: ( rule__EdgeActivity__TargetAssignment_2 )
            {
             before(grammarAccess.getEdgeActivityAccess().getTargetAssignment_2()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2236:1: ( rule__EdgeActivity__TargetAssignment_2 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2236:2: rule__EdgeActivity__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__EdgeActivity__TargetAssignment_2_in_rule__EdgeActivity__Group__2__Impl4475);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2246:1: rule__EdgeActivity__Group__3 : rule__EdgeActivity__Group__3__Impl ;
    public final void rule__EdgeActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2250:1: ( rule__EdgeActivity__Group__3__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2251:2: rule__EdgeActivity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EdgeActivity__Group__3__Impl_in_rule__EdgeActivity__Group__34505);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2257:1: rule__EdgeActivity__Group__3__Impl : ( ( rule__EdgeActivity__DetailsAssignment_3 ) ) ;
    public final void rule__EdgeActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2261:1: ( ( ( rule__EdgeActivity__DetailsAssignment_3 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2262:1: ( ( rule__EdgeActivity__DetailsAssignment_3 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2262:1: ( ( rule__EdgeActivity__DetailsAssignment_3 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2263:1: ( rule__EdgeActivity__DetailsAssignment_3 )
            {
             before(grammarAccess.getEdgeActivityAccess().getDetailsAssignment_3()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2264:1: ( rule__EdgeActivity__DetailsAssignment_3 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2264:2: rule__EdgeActivity__DetailsAssignment_3
            {
            pushFollow(FOLLOW_rule__EdgeActivity__DetailsAssignment_3_in_rule__EdgeActivity__Group__3__Impl4532);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2283:1: rule__ChannelSynchronization__Group__0 : rule__ChannelSynchronization__Group__0__Impl rule__ChannelSynchronization__Group__1 ;
    public final void rule__ChannelSynchronization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2287:1: ( rule__ChannelSynchronization__Group__0__Impl rule__ChannelSynchronization__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2288:2: rule__ChannelSynchronization__Group__0__Impl rule__ChannelSynchronization__Group__1
            {
            pushFollow(FOLLOW_rule__ChannelSynchronization__Group__0__Impl_in_rule__ChannelSynchronization__Group__04571);
            rule__ChannelSynchronization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChannelSynchronization__Group__1_in_rule__ChannelSynchronization__Group__04574);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2295:1: rule__ChannelSynchronization__Group__0__Impl : ( ( rule__ChannelSynchronization__ChannelAssignment_0 ) ) ;
    public final void rule__ChannelSynchronization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2299:1: ( ( ( rule__ChannelSynchronization__ChannelAssignment_0 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2300:1: ( ( rule__ChannelSynchronization__ChannelAssignment_0 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2300:1: ( ( rule__ChannelSynchronization__ChannelAssignment_0 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2301:1: ( rule__ChannelSynchronization__ChannelAssignment_0 )
            {
             before(grammarAccess.getChannelSynchronizationAccess().getChannelAssignment_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2302:1: ( rule__ChannelSynchronization__ChannelAssignment_0 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2302:2: rule__ChannelSynchronization__ChannelAssignment_0
            {
            pushFollow(FOLLOW_rule__ChannelSynchronization__ChannelAssignment_0_in_rule__ChannelSynchronization__Group__0__Impl4601);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2312:1: rule__ChannelSynchronization__Group__1 : rule__ChannelSynchronization__Group__1__Impl ;
    public final void rule__ChannelSynchronization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2316:1: ( rule__ChannelSynchronization__Group__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2317:2: rule__ChannelSynchronization__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ChannelSynchronization__Group__1__Impl_in_rule__ChannelSynchronization__Group__14631);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2323:1: rule__ChannelSynchronization__Group__1__Impl : ( ( rule__ChannelSynchronization__KindAssignment_1 ) ) ;
    public final void rule__ChannelSynchronization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2327:1: ( ( ( rule__ChannelSynchronization__KindAssignment_1 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2328:1: ( ( rule__ChannelSynchronization__KindAssignment_1 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2328:1: ( ( rule__ChannelSynchronization__KindAssignment_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2329:1: ( rule__ChannelSynchronization__KindAssignment_1 )
            {
             before(grammarAccess.getChannelSynchronizationAccess().getKindAssignment_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2330:1: ( rule__ChannelSynchronization__KindAssignment_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2330:2: rule__ChannelSynchronization__KindAssignment_1
            {
            pushFollow(FOLLOW_rule__ChannelSynchronization__KindAssignment_1_in_rule__ChannelSynchronization__Group__1__Impl4658);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2344:1: rule__DelayTransition__Group__0 : rule__DelayTransition__Group__0__Impl rule__DelayTransition__Group__1 ;
    public final void rule__DelayTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2348:1: ( rule__DelayTransition__Group__0__Impl rule__DelayTransition__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2349:2: rule__DelayTransition__Group__0__Impl rule__DelayTransition__Group__1
            {
            pushFollow(FOLLOW_rule__DelayTransition__Group__0__Impl_in_rule__DelayTransition__Group__04692);
            rule__DelayTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelayTransition__Group__1_in_rule__DelayTransition__Group__04695);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2356:1: rule__DelayTransition__Group__0__Impl : ( 'Delay:' ) ;
    public final void rule__DelayTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2360:1: ( ( 'Delay:' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2361:1: ( 'Delay:' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2361:1: ( 'Delay:' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2362:1: 'Delay:'
            {
             before(grammarAccess.getDelayTransitionAccess().getDelayKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__DelayTransition__Group__0__Impl4723); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2375:1: rule__DelayTransition__Group__1 : rule__DelayTransition__Group__1__Impl ;
    public final void rule__DelayTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2379:1: ( rule__DelayTransition__Group__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2380:2: rule__DelayTransition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DelayTransition__Group__1__Impl_in_rule__DelayTransition__Group__14754);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2386:1: rule__DelayTransition__Group__1__Impl : ( ( rule__DelayTransition__DurationAssignment_1 ) ) ;
    public final void rule__DelayTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2390:1: ( ( ( rule__DelayTransition__DurationAssignment_1 ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2391:1: ( ( rule__DelayTransition__DurationAssignment_1 ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2391:1: ( ( rule__DelayTransition__DurationAssignment_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2392:1: ( rule__DelayTransition__DurationAssignment_1 )
            {
             before(grammarAccess.getDelayTransitionAccess().getDurationAssignment_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2393:1: ( rule__DelayTransition__DurationAssignment_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2393:2: rule__DelayTransition__DurationAssignment_1
            {
            pushFollow(FOLLOW_rule__DelayTransition__DurationAssignment_1_in_rule__DelayTransition__Group__1__Impl4781);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2407:1: rule__ActionTransition__Group__0 : rule__ActionTransition__Group__0__Impl rule__ActionTransition__Group__1 ;
    public final void rule__ActionTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2411:1: ( rule__ActionTransition__Group__0__Impl rule__ActionTransition__Group__1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2412:2: rule__ActionTransition__Group__0__Impl rule__ActionTransition__Group__1
            {
            pushFollow(FOLLOW_rule__ActionTransition__Group__0__Impl_in_rule__ActionTransition__Group__04815);
            rule__ActionTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionTransition__Group__1_in_rule__ActionTransition__Group__04818);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2419:1: rule__ActionTransition__Group__0__Impl : ( 'Transitions:' ) ;
    public final void rule__ActionTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2423:1: ( ( 'Transitions:' ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2424:1: ( 'Transitions:' )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2424:1: ( 'Transitions:' )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2425:1: 'Transitions:'
            {
             before(grammarAccess.getActionTransitionAccess().getTransitionsKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ActionTransition__Group__0__Impl4846); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2438:1: rule__ActionTransition__Group__1 : rule__ActionTransition__Group__1__Impl ;
    public final void rule__ActionTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2442:1: ( rule__ActionTransition__Group__1__Impl )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2443:2: rule__ActionTransition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionTransition__Group__1__Impl_in_rule__ActionTransition__Group__14877);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2449:1: rule__ActionTransition__Group__1__Impl : ( ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* ) ) ;
    public final void rule__ActionTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2453:1: ( ( ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2454:1: ( ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2454:1: ( ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2455:1: ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2455:1: ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2456:1: ( rule__ActionTransition__EdgeActivitiesAssignment_1 )
            {
             before(grammarAccess.getActionTransitionAccess().getEdgeActivitiesAssignment_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2457:1: ( rule__ActionTransition__EdgeActivitiesAssignment_1 )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2457:2: rule__ActionTransition__EdgeActivitiesAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionTransition__EdgeActivitiesAssignment_1_in_rule__ActionTransition__Group__1__Impl4906);
            rule__ActionTransition__EdgeActivitiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTransitionAccess().getEdgeActivitiesAssignment_1()); 

            }

            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2460:1: ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2461:1: ( rule__ActionTransition__EdgeActivitiesAssignment_1 )*
            {
             before(grammarAccess.getActionTransitionAccess().getEdgeActivitiesAssignment_1()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2462:1: ( rule__ActionTransition__EdgeActivitiesAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2462:2: rule__ActionTransition__EdgeActivitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ActionTransition__EdgeActivitiesAssignment_1_in_rule__ActionTransition__Group__1__Impl4918);
            	    rule__ActionTransition__EdgeActivitiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2478:1: rule__TraceRepository__TracesAssignment_1 : ( ruleTrace ) ;
    public final void rule__TraceRepository__TracesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2482:1: ( ( ruleTrace ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2483:1: ( ruleTrace )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2483:1: ( ruleTrace )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2484:1: ruleTrace
            {
             before(grammarAccess.getTraceRepositoryAccess().getTracesTraceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTrace_in_rule__TraceRepository__TracesAssignment_14960);
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


    // $ANTLR start "rule__Trace__PropertyAssignment_1"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2493:1: rule__Trace__PropertyAssignment_1 : ( RULE_INT ) ;
    public final void rule__Trace__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2497:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2498:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2498:1: ( RULE_INT )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2499:1: RULE_INT
            {
             before(grammarAccess.getTraceAccess().getPropertyINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Trace__PropertyAssignment_14991); 
             after(grammarAccess.getTraceAccess().getPropertyINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__PropertyAssignment_1"


    // $ANTLR start "rule__Trace__LineAssignment_3"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2508:1: rule__Trace__LineAssignment_3 : ( RULE_INT ) ;
    public final void rule__Trace__LineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2512:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2513:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2513:1: ( RULE_INT )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2514:1: RULE_INT
            {
             before(grammarAccess.getTraceAccess().getLineINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Trace__LineAssignment_35022); 
             after(grammarAccess.getTraceAccess().getLineINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__LineAssignment_3"


    // $ANTLR start "rule__Trace__ResultAssignment_4"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2523:1: rule__Trace__ResultAssignment_4 : ( ruleResult ) ;
    public final void rule__Trace__ResultAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2527:1: ( ( ruleResult ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2528:1: ( ruleResult )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2528:1: ( ruleResult )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2529:1: ruleResult
            {
             before(grammarAccess.getTraceAccess().getResultResultEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleResult_in_rule__Trace__ResultAssignment_45053);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getTraceAccess().getResultResultEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__ResultAssignment_4"


    // $ANTLR start "rule__Trace__TraceItemsAssignment_5_1"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2538:1: rule__Trace__TraceItemsAssignment_5_1 : ( ruleTraceItem ) ;
    public final void rule__Trace__TraceItemsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2542:1: ( ( ruleTraceItem ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2543:1: ( ruleTraceItem )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2543:1: ( ruleTraceItem )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2544:1: ruleTraceItem
            {
             before(grammarAccess.getTraceAccess().getTraceItemsTraceItemParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTraceItem_in_rule__Trace__TraceItemsAssignment_5_15084);
            ruleTraceItem();

            state._fsp--;

             after(grammarAccess.getTraceAccess().getTraceItemsTraceItemParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__TraceItemsAssignment_5_1"


    // $ANTLR start "rule__ProcessIdentifier__TemplateAssignment_0"
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2553:1: rule__ProcessIdentifier__TemplateAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ProcessIdentifier__TemplateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2557:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2558:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2558:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2559:1: ( RULE_ID )
            {
             before(grammarAccess.getProcessIdentifierAccess().getTemplateAbstractTemplateCrossReference_0_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2560:1: ( RULE_ID )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2561:1: RULE_ID
            {
             before(grammarAccess.getProcessIdentifierAccess().getTemplateAbstractTemplateIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessIdentifier__TemplateAssignment_05119); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2572:1: rule__ProcessIdentifier__ArgumentsAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__ProcessIdentifier__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2576:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2577:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2577:1: ( RULE_INT )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2578:1: RULE_INT
            {
             before(grammarAccess.getProcessIdentifierAccess().getArgumentsINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ProcessIdentifier__ArgumentsAssignment_1_15154); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2587:1: rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 : ( RULE_INT ) ;
    public final void rule__ProcessIdentifier__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2591:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2592:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2592:1: ( RULE_INT )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2593:1: RULE_INT
            {
             before(grammarAccess.getProcessIdentifierAccess().getArgumentsINTTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ProcessIdentifier__ArgumentsAssignment_1_2_15185); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2602:1: rule__LocationActivity__ProcessAssignment_0 : ( ruleProcessIdentifier ) ;
    public final void rule__LocationActivity__ProcessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2606:1: ( ( ruleProcessIdentifier ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2607:1: ( ruleProcessIdentifier )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2607:1: ( ruleProcessIdentifier )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2608:1: ruleProcessIdentifier
            {
             before(grammarAccess.getLocationActivityAccess().getProcessProcessIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProcessIdentifier_in_rule__LocationActivity__ProcessAssignment_05216);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2617:1: rule__LocationActivity__LocationAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LocationActivity__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2621:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2622:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2622:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2623:1: ( RULE_ID )
            {
             before(grammarAccess.getLocationActivityAccess().getLocationLocationCrossReference_2_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2624:1: ( RULE_ID )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2625:1: RULE_ID
            {
             before(grammarAccess.getLocationActivityAccess().getLocationLocationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocationActivity__LocationAssignment_25251); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2636:1: rule__VariableValue__FirstNamedElementReferenceAssignment_0 : ( ruleNamedElementReference ) ;
    public final void rule__VariableValue__FirstNamedElementReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2640:1: ( ( ruleNamedElementReference ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2641:1: ( ruleNamedElementReference )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2641:1: ( ruleNamedElementReference )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2642:1: ruleNamedElementReference
            {
             before(grammarAccess.getVariableValueAccess().getFirstNamedElementReferenceNamedElementReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNamedElementReference_in_rule__VariableValue__FirstNamedElementReferenceAssignment_05286);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2651:1: rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 : ( ruleNamedElementReference ) ;
    public final void rule__VariableValue__SecondNamedElementReferenceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2655:1: ( ( ruleNamedElementReference ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2656:1: ( ruleNamedElementReference )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2656:1: ( ruleNamedElementReference )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2657:1: ruleNamedElementReference
            {
             before(grammarAccess.getVariableValueAccess().getSecondNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNamedElementReference_in_rule__VariableValue__SecondNamedElementReferenceAssignment_1_15317);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2666:1: rule__VariableValue__OperatorAssignment_2 : ( ruleCompareOperator ) ;
    public final void rule__VariableValue__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2670:1: ( ( ruleCompareOperator ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2671:1: ( ruleCompareOperator )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2671:1: ( ruleCompareOperator )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2672:1: ruleCompareOperator
            {
             before(grammarAccess.getVariableValueAccess().getOperatorCompareOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__VariableValue__OperatorAssignment_25348);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2681:1: rule__VariableValue__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2685:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2686:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2686:1: ( RULE_INT )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2687:1: RULE_INT
            {
             before(grammarAccess.getVariableValueAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VariableValue__ValueAssignment_35379); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2696:1: rule__SingleNamedElementReference__NamedElementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SingleNamedElementReference__NamedElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2700:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2701:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2701:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2702:1: ( RULE_ID )
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementNamedElementCrossReference_0_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2703:1: ( RULE_ID )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2704:1: RULE_ID
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleNamedElementReference__NamedElementAssignment_05414); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2715:1: rule__SingleNamedElementReference__IndexesAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__SingleNamedElementReference__IndexesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2719:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2720:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2720:1: ( RULE_INT )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2721:1: RULE_INT
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getIndexesINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SingleNamedElementReference__IndexesAssignment_1_15449); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2730:1: rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 : ( ruleSingleNamedElementReference ) ;
    public final void rule__NamedElementReference__SingleNamedElementReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2734:1: ( ( ruleSingleNamedElementReference ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2735:1: ( ruleSingleNamedElementReference )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2735:1: ( ruleSingleNamedElementReference )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2736:1: ruleSingleNamedElementReference
            {
             before(grammarAccess.getNamedElementReferenceAccess().getSingleNamedElementReferenceSingleNamedElementReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSingleNamedElementReference_in_rule__NamedElementReference__SingleNamedElementReferenceAssignment_05480);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2745:1: rule__NamedElementReference__NamedElementReferenceAssignment_1_1 : ( ruleNamedElementReference ) ;
    public final void rule__NamedElementReference__NamedElementReferenceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2749:1: ( ( ruleNamedElementReference ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2750:1: ( ruleNamedElementReference )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2750:1: ( ruleNamedElementReference )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2751:1: ruleNamedElementReference
            {
             before(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNamedElementReference_in_rule__NamedElementReference__NamedElementReferenceAssignment_1_15511);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2760:1: rule__State__LocationActivitiesAssignment_3 : ( ruleLocationActivity ) ;
    public final void rule__State__LocationActivitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2764:1: ( ( ruleLocationActivity ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2765:1: ( ruleLocationActivity )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2765:1: ( ruleLocationActivity )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2766:1: ruleLocationActivity
            {
             before(grammarAccess.getStateAccess().getLocationActivitiesLocationActivityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocationActivity_in_rule__State__LocationActivitiesAssignment_35542);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2775:1: rule__State__VariableValuesAssignment_5_0 : ( ruleVariableValue ) ;
    public final void rule__State__VariableValuesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2779:1: ( ( ruleVariableValue ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2780:1: ( ruleVariableValue )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2780:1: ( ruleVariableValue )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2781:1: ruleVariableValue
            {
             before(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleVariableValue_in_rule__State__VariableValuesAssignment_5_05573);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2790:1: rule__State__VariableValuesAssignment_5_1_1 : ( ruleVariableValue ) ;
    public final void rule__State__VariableValuesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2794:1: ( ( ruleVariableValue ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2795:1: ( ruleVariableValue )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2795:1: ( ruleVariableValue )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2796:1: ruleVariableValue
            {
             before(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleVariableValue_in_rule__State__VariableValuesAssignment_5_1_15604);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2805:1: rule__EdgeActivity__SourceAssignment_0 : ( ruleLocationActivity ) ;
    public final void rule__EdgeActivity__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2809:1: ( ( ruleLocationActivity ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2810:1: ( ruleLocationActivity )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2810:1: ( ruleLocationActivity )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2811:1: ruleLocationActivity
            {
             before(grammarAccess.getEdgeActivityAccess().getSourceLocationActivityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLocationActivity_in_rule__EdgeActivity__SourceAssignment_05635);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2820:1: rule__EdgeActivity__TargetAssignment_2 : ( ruleLocationActivity ) ;
    public final void rule__EdgeActivity__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2824:1: ( ( ruleLocationActivity ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2825:1: ( ruleLocationActivity )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2825:1: ( ruleLocationActivity )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2826:1: ruleLocationActivity
            {
             before(grammarAccess.getEdgeActivityAccess().getTargetLocationActivityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLocationActivity_in_rule__EdgeActivity__TargetAssignment_25666);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2835:1: rule__EdgeActivity__DetailsAssignment_3 : ( RULE_EDGE ) ;
    public final void rule__EdgeActivity__DetailsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2839:1: ( ( RULE_EDGE ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2840:1: ( RULE_EDGE )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2840:1: ( RULE_EDGE )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2841:1: RULE_EDGE
            {
             before(grammarAccess.getEdgeActivityAccess().getDetailsEDGETerminalRuleCall_3_0()); 
            match(input,RULE_EDGE,FOLLOW_RULE_EDGE_in_rule__EdgeActivity__DetailsAssignment_35697); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2850:1: rule__ChannelSynchronization__ChannelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChannelSynchronization__ChannelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2854:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2855:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2855:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2856:1: ( RULE_ID )
            {
             before(grammarAccess.getChannelSynchronizationAccess().getChannelVariableCrossReference_0_0()); 
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2857:1: ( RULE_ID )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2858:1: RULE_ID
            {
             before(grammarAccess.getChannelSynchronizationAccess().getChannelVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChannelSynchronization__ChannelAssignment_05732); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2869:1: rule__ChannelSynchronization__KindAssignment_1 : ( ruleSynchronizationKind ) ;
    public final void rule__ChannelSynchronization__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2873:1: ( ( ruleSynchronizationKind ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2874:1: ( ruleSynchronizationKind )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2874:1: ( ruleSynchronizationKind )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2875:1: ruleSynchronizationKind
            {
             before(grammarAccess.getChannelSynchronizationAccess().getKindSynchronizationKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSynchronizationKind_in_rule__ChannelSynchronization__KindAssignment_15767);
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2884:1: rule__DelayTransition__DurationAssignment_1 : ( RULE_INT ) ;
    public final void rule__DelayTransition__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2888:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2889:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2889:1: ( RULE_INT )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2890:1: RULE_INT
            {
             before(grammarAccess.getDelayTransitionAccess().getDurationINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DelayTransition__DurationAssignment_15798); 
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
    // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2899:1: rule__ActionTransition__EdgeActivitiesAssignment_1 : ( ruleEdgeActivity ) ;
    public final void rule__ActionTransition__EdgeActivitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2903:1: ( ( ruleEdgeActivity ) )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2904:1: ( ruleEdgeActivity )
            {
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2904:1: ( ruleEdgeActivity )
            // ../de.uni_paderborn.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2905:1: ruleEdgeActivity
            {
             before(grammarAccess.getActionTransitionAccess().getEdgeActivitiesEdgeActivityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEdgeActivity_in_rule__ActionTransition__EdgeActivitiesAssignment_15829);
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
    public static final BitSet FOLLOW_14_in_rule__Trace__Alternatives_5_01092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Trace__Alternatives_5_01112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__TraceItem__Alternatives1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__TraceItem__Alternatives1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionTransition_in_rule__Transition__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayTransition_in_rule__Transition__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Result__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Result__Alternatives1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CompareOperator__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CompareOperator__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CompareOperator__Alternatives1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SynchronizationKind__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SynchronizationKind__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceRepository__Group__0__Impl_in_rule__TraceRepository__Group__01435 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TraceRepository__Group__1_in_rule__TraceRepository__Group__01438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TraceRepository__Group__0__Impl1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceRepository__Group__1__Impl_in_rule__TraceRepository__Group__11500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceRepository__TracesAssignment_1_in_rule__TraceRepository__Group__1__Impl1527 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__01562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__01565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Trace__Group__0__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__11624 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__PropertyAssignment_1_in_rule__Trace__Group__1__Impl1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__21684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__21687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Trace__Group__2__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31746 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__31749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__LineAssignment_3_in_rule__Trace__Group__3__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__4__Impl_in_rule__Trace__Group__41806 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__41809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__ResultAssignment_4_in_rule__Trace__Group__4__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__5__Impl_in_rule__Trace__Group__51866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group_5__0_in_rule__Trace__Group__5__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group_5__0__Impl_in_rule__Trace__Group_5__01936 = new BitSet(new long[]{0x0000003200000000L});
    public static final BitSet FOLLOW_rule__Trace__Group_5__1_in_rule__Trace__Group_5__01939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Alternatives_5_0_in_rule__Trace__Group_5__0__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group_5__1__Impl_in_rule__Trace__Group_5__11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__TraceItemsAssignment_5_1_in_rule__Trace__Group_5__1__Impl2025 = new BitSet(new long[]{0x0000003200000002L});
    public static final BitSet FOLLOW_rule__Trace__TraceItemsAssignment_5_1_in_rule__Trace__Group_5__1__Impl2037 = new BitSet(new long[]{0x0000003200000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group__0__Impl_in_rule__ProcessIdentifier__Group__02074 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group__1_in_rule__ProcessIdentifier__Group__02077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__TemplateAssignment_0_in_rule__ProcessIdentifier__Group__0__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group__1__Impl_in_rule__ProcessIdentifier__Group__12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__0_in_rule__ProcessIdentifier__Group__1__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__0__Impl_in_rule__ProcessIdentifier__Group_1__02196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__1_in_rule__ProcessIdentifier__Group_1__02199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ProcessIdentifier__Group_1__0__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__1__Impl_in_rule__ProcessIdentifier__Group_1__12258 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__2_in_rule__ProcessIdentifier__Group_1__12261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__ArgumentsAssignment_1_1_in_rule__ProcessIdentifier__Group_1__1__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__2__Impl_in_rule__ProcessIdentifier__Group_1__22318 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__3_in_rule__ProcessIdentifier__Group_1__22321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1_2__0_in_rule__ProcessIdentifier__Group_1__2__Impl2348 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__3__Impl_in_rule__ProcessIdentifier__Group_1__32379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ProcessIdentifier__Group_1__3__Impl2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1_2__0__Impl_in_rule__ProcessIdentifier__Group_1_2__02446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1_2__1_in_rule__ProcessIdentifier__Group_1_2__02449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ProcessIdentifier__Group_1_2__0__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1_2__1__Impl_in_rule__ProcessIdentifier__Group_1_2__12508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__ArgumentsAssignment_1_2_1_in_rule__ProcessIdentifier__Group_1_2__1__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__0__Impl_in_rule__LocationActivity__Group__02569 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__1_in_rule__LocationActivity__Group__02572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__ProcessAssignment_0_in_rule__LocationActivity__Group__0__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__1__Impl_in_rule__LocationActivity__Group__12629 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__2_in_rule__LocationActivity__Group__12632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__LocationActivity__Group__1__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__2__Impl_in_rule__LocationActivity__Group__22691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__LocationAssignment_2_in_rule__LocationActivity__Group__2__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__0__Impl_in_rule__VariableValue__Group__02754 = new BitSet(new long[]{0x00000000401C0000L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__1_in_rule__VariableValue__Group__02757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__FirstNamedElementReferenceAssignment_0_in_rule__VariableValue__Group__0__Impl2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__1__Impl_in_rule__VariableValue__Group__12814 = new BitSet(new long[]{0x00000000401C0000L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__2_in_rule__VariableValue__Group__12817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group_1__0_in_rule__VariableValue__Group__1__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__2__Impl_in_rule__VariableValue__Group__22875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__3_in_rule__VariableValue__Group__22878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__OperatorAssignment_2_in_rule__VariableValue__Group__2__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__3__Impl_in_rule__VariableValue__Group__32935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__ValueAssignment_3_in_rule__VariableValue__Group__3__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group_1__0__Impl_in_rule__VariableValue__Group_1__03000 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VariableValue__Group_1__1_in_rule__VariableValue__Group_1__03003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VariableValue__Group_1__0__Impl3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group_1__1__Impl_in_rule__VariableValue__Group_1__13062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__SecondNamedElementReferenceAssignment_1_1_in_rule__VariableValue__Group_1__1__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group__0__Impl_in_rule__SingleNamedElementReference__Group__03123 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group__1_in_rule__SingleNamedElementReference__Group__03126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__NamedElementAssignment_0_in_rule__SingleNamedElementReference__Group__0__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group__1__Impl_in_rule__SingleNamedElementReference__Group__13183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__0_in_rule__SingleNamedElementReference__Group__1__Impl3210 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__0__Impl_in_rule__SingleNamedElementReference__Group_1__03245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__1_in_rule__SingleNamedElementReference__Group_1__03248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SingleNamedElementReference__Group_1__0__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__1__Impl_in_rule__SingleNamedElementReference__Group_1__13307 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__2_in_rule__SingleNamedElementReference__Group_1__13310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__IndexesAssignment_1_1_in_rule__SingleNamedElementReference__Group_1__1__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__2__Impl_in_rule__SingleNamedElementReference__Group_1__23367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SingleNamedElementReference__Group_1__2__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group__0__Impl_in_rule__NamedElementReference__Group__03432 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group__1_in_rule__NamedElementReference__Group__03435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__SingleNamedElementReferenceAssignment_0_in_rule__NamedElementReference__Group__0__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group__1__Impl_in_rule__NamedElementReference__Group__13492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group_1__0_in_rule__NamedElementReference__Group__1__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group_1__0__Impl_in_rule__NamedElementReference__Group_1__03554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group_1__1_in_rule__NamedElementReference__Group_1__03557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NamedElementReference__Group_1__0__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group_1__1__Impl_in_rule__NamedElementReference__Group_1__13616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__NamedElementReferenceAssignment_1_1_in_rule__NamedElementReference__Group_1__1__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03677 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__State__Group__0__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13739 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__State__Group__1__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23804 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__State__Group__2__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__33866 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__33869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__LocationActivitiesAssignment_3_in_rule__State__Group__3__Impl3898 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__State__LocationActivitiesAssignment_3_in_rule__State__Group__3__Impl3910 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__43943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__43946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__State__Group__4__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__54005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__04075 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__04078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__VariableValuesAssignment_5_0_in_rule__State__Group_5__0__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__14135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5_1__0_in_rule__State__Group_5__1__Impl4162 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__State__Group_5_1__0__Impl_in_rule__State__Group_5_1__04197 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__State__Group_5_1__1_in_rule__State__Group_5_1__04200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__State__Group_5_1__0__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5_1__1__Impl_in_rule__State__Group_5_1__14262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__VariableValuesAssignment_5_1_1_in_rule__State__Group_5_1__1__Impl4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__0__Impl_in_rule__EdgeActivity__Group__04323 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__1_in_rule__EdgeActivity__Group__04326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__SourceAssignment_0_in_rule__EdgeActivity__Group__0__Impl4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__1__Impl_in_rule__EdgeActivity__Group__14383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__2_in_rule__EdgeActivity__Group__14386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EdgeActivity__Group__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__2__Impl_in_rule__EdgeActivity__Group__24445 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__3_in_rule__EdgeActivity__Group__24448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__TargetAssignment_2_in_rule__EdgeActivity__Group__2__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__3__Impl_in_rule__EdgeActivity__Group__34505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__DetailsAssignment_3_in_rule__EdgeActivity__Group__3__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__Group__0__Impl_in_rule__ChannelSynchronization__Group__04571 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__Group__1_in_rule__ChannelSynchronization__Group__04574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__ChannelAssignment_0_in_rule__ChannelSynchronization__Group__0__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__Group__1__Impl_in_rule__ChannelSynchronization__Group__14631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__KindAssignment_1_in_rule__ChannelSynchronization__Group__1__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayTransition__Group__0__Impl_in_rule__DelayTransition__Group__04692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DelayTransition__Group__1_in_rule__DelayTransition__Group__04695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DelayTransition__Group__0__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayTransition__Group__1__Impl_in_rule__DelayTransition__Group__14754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayTransition__DurationAssignment_1_in_rule__DelayTransition__Group__1__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionTransition__Group__0__Impl_in_rule__ActionTransition__Group__04815 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionTransition__Group__1_in_rule__ActionTransition__Group__04818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ActionTransition__Group__0__Impl4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionTransition__Group__1__Impl_in_rule__ActionTransition__Group__14877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionTransition__EdgeActivitiesAssignment_1_in_rule__ActionTransition__Group__1__Impl4906 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ActionTransition__EdgeActivitiesAssignment_1_in_rule__ActionTransition__Group__1__Impl4918 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTrace_in_rule__TraceRepository__TracesAssignment_14960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Trace__PropertyAssignment_14991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Trace__LineAssignment_35022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResult_in_rule__Trace__ResultAssignment_45053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceItem_in_rule__Trace__TraceItemsAssignment_5_15084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessIdentifier__TemplateAssignment_05119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ProcessIdentifier__ArgumentsAssignment_1_15154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ProcessIdentifier__ArgumentsAssignment_1_2_15185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessIdentifier_in_rule__LocationActivity__ProcessAssignment_05216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocationActivity__LocationAssignment_25251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_rule__VariableValue__FirstNamedElementReferenceAssignment_05286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_rule__VariableValue__SecondNamedElementReferenceAssignment_1_15317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__VariableValue__OperatorAssignment_25348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VariableValue__ValueAssignment_35379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleNamedElementReference__NamedElementAssignment_05414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SingleNamedElementReference__IndexesAssignment_1_15449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleNamedElementReference_in_rule__NamedElementReference__SingleNamedElementReferenceAssignment_05480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_rule__NamedElementReference__NamedElementReferenceAssignment_1_15511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_rule__State__LocationActivitiesAssignment_35542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableValue_in_rule__State__VariableValuesAssignment_5_05573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableValue_in_rule__State__VariableValuesAssignment_5_1_15604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_rule__EdgeActivity__SourceAssignment_05635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_rule__EdgeActivity__TargetAssignment_25666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EDGE_in_rule__EdgeActivity__DetailsAssignment_35697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChannelSynchronization__ChannelAssignment_05732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynchronizationKind_in_rule__ChannelSynchronization__KindAssignment_15767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DelayTransition__DurationAssignment_15798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeActivity_in_rule__ActionTransition__EdgeActivitiesAssignment_15829 = new BitSet(new long[]{0x0000000000000002L});

}