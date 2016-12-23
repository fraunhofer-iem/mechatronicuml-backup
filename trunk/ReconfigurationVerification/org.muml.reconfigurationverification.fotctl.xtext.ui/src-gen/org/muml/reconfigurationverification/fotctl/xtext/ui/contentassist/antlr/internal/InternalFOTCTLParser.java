package org.muml.reconfigurationverification.fotctl.xtext.ui.contentassist.antlr.internal; 

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
import org.muml.reconfigurationverification.fotctl.xtext.services.FOTCTLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFOTCTLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NODE_PREDICATE_NAME", "RULE_EDGE_PREDICATE_NAME", "RULE_CONSTANT_NAME", "RULE_VARIABLE_NAME", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exists'", "'forall'", "' & '", "' <=> '", "' => '", "' | '", "' ^ '", "' = '", "' > '", "' >= '", "' < '", "' <= '", "'AF'", "'AG'", "'AU'", "'EF'", "'EG'", "'EU'", "'Declaration\\n'", "'Formulas\\n'", "'NodeLabelPredicates {'", "'}\\n'", "','", "'EdgeLabelPredicates {'", "'Constants {'", "';\\n'", "'('", "')'", "' '", "'NOT '", "'['", "'] '"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_NODE_PREDICATE_NAME=4;
    public static final int RULE_EDGE_PREDICATE_NAME=5;
    public static final int RULE_ID=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_CONSTANT_NAME=6;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int RULE_VARIABLE_NAME=7;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFOTCTLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFOTCTLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFOTCTLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFOTCTL.g"; }


     
     	private FOTCTLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FOTCTLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleFoTCTLSpec"
    // InternalFOTCTL.g:61:1: entryRuleFoTCTLSpec : ruleFoTCTLSpec EOF ;
    public final void entryRuleFoTCTLSpec() throws RecognitionException {
        try {
            // InternalFOTCTL.g:62:1: ( ruleFoTCTLSpec EOF )
            // InternalFOTCTL.g:63:1: ruleFoTCTLSpec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFoTCTLSpec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFoTCTLSpec"


    // $ANTLR start "ruleFoTCTLSpec"
    // InternalFOTCTL.g:70:1: ruleFoTCTLSpec : ( ( rule__FoTCTLSpec__Group__0 ) ) ;
    public final void ruleFoTCTLSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:74:2: ( ( ( rule__FoTCTLSpec__Group__0 ) ) )
            // InternalFOTCTL.g:75:1: ( ( rule__FoTCTLSpec__Group__0 ) )
            {
            // InternalFOTCTL.g:75:1: ( ( rule__FoTCTLSpec__Group__0 ) )
            // InternalFOTCTL.g:76:1: ( rule__FoTCTLSpec__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getGroup()); 
            }
            // InternalFOTCTL.g:77:1: ( rule__FoTCTLSpec__Group__0 )
            // InternalFOTCTL.g:77:2: rule__FoTCTLSpec__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getGroup()); 
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
    // $ANTLR end "ruleFoTCTLSpec"


    // $ANTLR start "entryRuleFoTCTLFormula"
    // InternalFOTCTL.g:89:1: entryRuleFoTCTLFormula : ruleFoTCTLFormula EOF ;
    public final void entryRuleFoTCTLFormula() throws RecognitionException {
        try {
            // InternalFOTCTL.g:90:1: ( ruleFoTCTLFormula EOF )
            // InternalFOTCTL.g:91:1: ruleFoTCTLFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFoTCTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFoTCTLFormula"


    // $ANTLR start "ruleFoTCTLFormula"
    // InternalFOTCTL.g:98:1: ruleFoTCTLFormula : ( ( rule__FoTCTLFormula__Group__0 ) ) ;
    public final void ruleFoTCTLFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:102:2: ( ( ( rule__FoTCTLFormula__Group__0 ) ) )
            // InternalFOTCTL.g:103:1: ( ( rule__FoTCTLFormula__Group__0 ) )
            {
            // InternalFOTCTL.g:103:1: ( ( rule__FoTCTLFormula__Group__0 ) )
            // InternalFOTCTL.g:104:1: ( rule__FoTCTLFormula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLFormulaAccess().getGroup()); 
            }
            // InternalFOTCTL.g:105:1: ( rule__FoTCTLFormula__Group__0 )
            // InternalFOTCTL.g:105:2: rule__FoTCTLFormula__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLFormula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLFormulaAccess().getGroup()); 
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
    // $ANTLR end "ruleFoTCTLFormula"


    // $ANTLR start "entryRuleFormulaDefinition"
    // InternalFOTCTL.g:117:1: entryRuleFormulaDefinition : ruleFormulaDefinition EOF ;
    public final void entryRuleFormulaDefinition() throws RecognitionException {
        try {
            // InternalFOTCTL.g:118:1: ( ruleFormulaDefinition EOF )
            // InternalFOTCTL.g:119:1: ruleFormulaDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaDefinitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFormulaDefinition"


    // $ANTLR start "ruleFormulaDefinition"
    // InternalFOTCTL.g:126:1: ruleFormulaDefinition : ( ( rule__FormulaDefinition__Alternatives ) ) ;
    public final void ruleFormulaDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:130:2: ( ( ( rule__FormulaDefinition__Alternatives ) ) )
            // InternalFOTCTL.g:131:1: ( ( rule__FormulaDefinition__Alternatives ) )
            {
            // InternalFOTCTL.g:131:1: ( ( rule__FormulaDefinition__Alternatives ) )
            // InternalFOTCTL.g:132:1: ( rule__FormulaDefinition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaDefinitionAccess().getAlternatives()); 
            }
            // InternalFOTCTL.g:133:1: ( rule__FormulaDefinition__Alternatives )
            // InternalFOTCTL.g:133:2: rule__FormulaDefinition__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FormulaDefinition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaDefinitionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFormulaDefinition"


    // $ANTLR start "entryRuleNodeLabelPredicateDecl"
    // InternalFOTCTL.g:145:1: entryRuleNodeLabelPredicateDecl : ruleNodeLabelPredicateDecl EOF ;
    public final void entryRuleNodeLabelPredicateDecl() throws RecognitionException {
        try {
            // InternalFOTCTL.g:146:1: ( ruleNodeLabelPredicateDecl EOF )
            // InternalFOTCTL.g:147:1: ruleNodeLabelPredicateDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNodeLabelPredicateDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateDeclRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNodeLabelPredicateDecl"


    // $ANTLR start "ruleNodeLabelPredicateDecl"
    // InternalFOTCTL.g:154:1: ruleNodeLabelPredicateDecl : ( ( rule__NodeLabelPredicateDecl__Group__0 ) ) ;
    public final void ruleNodeLabelPredicateDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:158:2: ( ( ( rule__NodeLabelPredicateDecl__Group__0 ) ) )
            // InternalFOTCTL.g:159:1: ( ( rule__NodeLabelPredicateDecl__Group__0 ) )
            {
            // InternalFOTCTL.g:159:1: ( ( rule__NodeLabelPredicateDecl__Group__0 ) )
            // InternalFOTCTL.g:160:1: ( rule__NodeLabelPredicateDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateDeclAccess().getGroup()); 
            }
            // InternalFOTCTL.g:161:1: ( rule__NodeLabelPredicateDecl__Group__0 )
            // InternalFOTCTL.g:161:2: rule__NodeLabelPredicateDecl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicateDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateDeclAccess().getGroup()); 
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
    // $ANTLR end "ruleNodeLabelPredicateDecl"


    // $ANTLR start "entryRuleEdgeLabelPredicateDecl"
    // InternalFOTCTL.g:173:1: entryRuleEdgeLabelPredicateDecl : ruleEdgeLabelPredicateDecl EOF ;
    public final void entryRuleEdgeLabelPredicateDecl() throws RecognitionException {
        try {
            // InternalFOTCTL.g:174:1: ( ruleEdgeLabelPredicateDecl EOF )
            // InternalFOTCTL.g:175:1: ruleEdgeLabelPredicateDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEdgeLabelPredicateDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateDeclRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEdgeLabelPredicateDecl"


    // $ANTLR start "ruleEdgeLabelPredicateDecl"
    // InternalFOTCTL.g:182:1: ruleEdgeLabelPredicateDecl : ( ( rule__EdgeLabelPredicateDecl__Group__0 ) ) ;
    public final void ruleEdgeLabelPredicateDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:186:2: ( ( ( rule__EdgeLabelPredicateDecl__Group__0 ) ) )
            // InternalFOTCTL.g:187:1: ( ( rule__EdgeLabelPredicateDecl__Group__0 ) )
            {
            // InternalFOTCTL.g:187:1: ( ( rule__EdgeLabelPredicateDecl__Group__0 ) )
            // InternalFOTCTL.g:188:1: ( rule__EdgeLabelPredicateDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateDeclAccess().getGroup()); 
            }
            // InternalFOTCTL.g:189:1: ( rule__EdgeLabelPredicateDecl__Group__0 )
            // InternalFOTCTL.g:189:2: rule__EdgeLabelPredicateDecl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicateDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateDeclAccess().getGroup()); 
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
    // $ANTLR end "ruleEdgeLabelPredicateDecl"


    // $ANTLR start "entryRuleConstantSymbolDecl"
    // InternalFOTCTL.g:201:1: entryRuleConstantSymbolDecl : ruleConstantSymbolDecl EOF ;
    public final void entryRuleConstantSymbolDecl() throws RecognitionException {
        try {
            // InternalFOTCTL.g:202:1: ( ruleConstantSymbolDecl EOF )
            // InternalFOTCTL.g:203:1: ruleConstantSymbolDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantSymbolDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConstantSymbolDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantSymbolDeclRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstantSymbolDecl"


    // $ANTLR start "ruleConstantSymbolDecl"
    // InternalFOTCTL.g:210:1: ruleConstantSymbolDecl : ( ( rule__ConstantSymbolDecl__Group__0 ) ) ;
    public final void ruleConstantSymbolDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:214:2: ( ( ( rule__ConstantSymbolDecl__Group__0 ) ) )
            // InternalFOTCTL.g:215:1: ( ( rule__ConstantSymbolDecl__Group__0 ) )
            {
            // InternalFOTCTL.g:215:1: ( ( rule__ConstantSymbolDecl__Group__0 ) )
            // InternalFOTCTL.g:216:1: ( rule__ConstantSymbolDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantSymbolDeclAccess().getGroup()); 
            }
            // InternalFOTCTL.g:217:1: ( rule__ConstantSymbolDecl__Group__0 )
            // InternalFOTCTL.g:217:2: rule__ConstantSymbolDecl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstantSymbolDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantSymbolDeclAccess().getGroup()); 
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
    // $ANTLR end "ruleConstantSymbolDecl"


    // $ANTLR start "entryRuleConstant"
    // InternalFOTCTL.g:229:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalFOTCTL.g:230:1: ( ruleConstant EOF )
            // InternalFOTCTL.g:231:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalFOTCTL.g:238:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:242:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalFOTCTL.g:243:1: ( ( rule__Constant__Group__0 ) )
            {
            // InternalFOTCTL.g:243:1: ( ( rule__Constant__Group__0 ) )
            // InternalFOTCTL.g:244:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // InternalFOTCTL.g:245:1: ( rule__Constant__Group__0 )
            // InternalFOTCTL.g:245:2: rule__Constant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getGroup()); 
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVariable"
    // InternalFOTCTL.g:257:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalFOTCTL.g:258:1: ( ruleVariable EOF )
            // InternalFOTCTL.g:259:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalFOTCTL.g:266:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:270:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalFOTCTL.g:271:1: ( ( rule__Variable__Group__0 ) )
            {
            // InternalFOTCTL.g:271:1: ( ( rule__Variable__Group__0 ) )
            // InternalFOTCTL.g:272:1: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalFOTCTL.g:273:1: ( rule__Variable__Group__0 )
            // InternalFOTCTL.g:273:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getGroup()); 
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


    // $ANTLR start "entryRuleUnaryFormula"
    // InternalFOTCTL.g:285:1: entryRuleUnaryFormula : ruleUnaryFormula EOF ;
    public final void entryRuleUnaryFormula() throws RecognitionException {
        try {
            // InternalFOTCTL.g:286:1: ( ruleUnaryFormula EOF )
            // InternalFOTCTL.g:287:1: ruleUnaryFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnaryFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnaryFormula"


    // $ANTLR start "ruleUnaryFormula"
    // InternalFOTCTL.g:294:1: ruleUnaryFormula : ( ( rule__UnaryFormula__Alternatives ) ) ;
    public final void ruleUnaryFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:298:2: ( ( ( rule__UnaryFormula__Alternatives ) ) )
            // InternalFOTCTL.g:299:1: ( ( rule__UnaryFormula__Alternatives ) )
            {
            // InternalFOTCTL.g:299:1: ( ( rule__UnaryFormula__Alternatives ) )
            // InternalFOTCTL.g:300:1: ( rule__UnaryFormula__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryFormulaAccess().getAlternatives()); 
            }
            // InternalFOTCTL.g:301:1: ( rule__UnaryFormula__Alternatives )
            // InternalFOTCTL.g:301:2: rule__UnaryFormula__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryFormula__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryFormulaAccess().getAlternatives()); 
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
    // $ANTLR end "ruleUnaryFormula"


    // $ANTLR start "entryRuleBinaryFormula"
    // InternalFOTCTL.g:313:1: entryRuleBinaryFormula : ruleBinaryFormula EOF ;
    public final void entryRuleBinaryFormula() throws RecognitionException {
        try {
            // InternalFOTCTL.g:314:1: ( ruleBinaryFormula EOF )
            // InternalFOTCTL.g:315:1: ruleBinaryFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBinaryFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBinaryFormula"


    // $ANTLR start "ruleBinaryFormula"
    // InternalFOTCTL.g:322:1: ruleBinaryFormula : ( ( rule__BinaryFormula__Alternatives ) ) ;
    public final void ruleBinaryFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:326:2: ( ( ( rule__BinaryFormula__Alternatives ) ) )
            // InternalFOTCTL.g:327:1: ( ( rule__BinaryFormula__Alternatives ) )
            {
            // InternalFOTCTL.g:327:1: ( ( rule__BinaryFormula__Alternatives ) )
            // InternalFOTCTL.g:328:1: ( rule__BinaryFormula__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryFormulaAccess().getAlternatives()); 
            }
            // InternalFOTCTL.g:329:1: ( rule__BinaryFormula__Alternatives )
            // InternalFOTCTL.g:329:2: rule__BinaryFormula__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryFormula__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryFormulaAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBinaryFormula"


    // $ANTLR start "entryRuleAtomicFormula"
    // InternalFOTCTL.g:341:1: entryRuleAtomicFormula : ruleAtomicFormula EOF ;
    public final void entryRuleAtomicFormula() throws RecognitionException {
        try {
            // InternalFOTCTL.g:342:1: ( ruleAtomicFormula EOF )
            // InternalFOTCTL.g:343:1: ruleAtomicFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAtomicFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAtomicFormula"


    // $ANTLR start "ruleAtomicFormula"
    // InternalFOTCTL.g:350:1: ruleAtomicFormula : ( ( rule__AtomicFormula__Alternatives ) ) ;
    public final void ruleAtomicFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:354:2: ( ( ( rule__AtomicFormula__Alternatives ) ) )
            // InternalFOTCTL.g:355:1: ( ( rule__AtomicFormula__Alternatives ) )
            {
            // InternalFOTCTL.g:355:1: ( ( rule__AtomicFormula__Alternatives ) )
            // InternalFOTCTL.g:356:1: ( rule__AtomicFormula__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicFormulaAccess().getAlternatives()); 
            }
            // InternalFOTCTL.g:357:1: ( rule__AtomicFormula__Alternatives )
            // InternalFOTCTL.g:357:2: rule__AtomicFormula__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicFormula__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicFormulaAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAtomicFormula"


    // $ANTLR start "entryRuleNodeLabelPredicate"
    // InternalFOTCTL.g:369:1: entryRuleNodeLabelPredicate : ruleNodeLabelPredicate EOF ;
    public final void entryRuleNodeLabelPredicate() throws RecognitionException {
        try {
            // InternalFOTCTL.g:370:1: ( ruleNodeLabelPredicate EOF )
            // InternalFOTCTL.g:371:1: ruleNodeLabelPredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNodeLabelPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNodeLabelPredicate"


    // $ANTLR start "ruleNodeLabelPredicate"
    // InternalFOTCTL.g:378:1: ruleNodeLabelPredicate : ( ( rule__NodeLabelPredicate__Group__0 ) ) ;
    public final void ruleNodeLabelPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:382:2: ( ( ( rule__NodeLabelPredicate__Group__0 ) ) )
            // InternalFOTCTL.g:383:1: ( ( rule__NodeLabelPredicate__Group__0 ) )
            {
            // InternalFOTCTL.g:383:1: ( ( rule__NodeLabelPredicate__Group__0 ) )
            // InternalFOTCTL.g:384:1: ( rule__NodeLabelPredicate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateAccess().getGroup()); 
            }
            // InternalFOTCTL.g:385:1: ( rule__NodeLabelPredicate__Group__0 )
            // InternalFOTCTL.g:385:2: rule__NodeLabelPredicate__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicate__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateAccess().getGroup()); 
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
    // $ANTLR end "ruleNodeLabelPredicate"


    // $ANTLR start "entryRuleEdgeLabelPredicate"
    // InternalFOTCTL.g:397:1: entryRuleEdgeLabelPredicate : ruleEdgeLabelPredicate EOF ;
    public final void entryRuleEdgeLabelPredicate() throws RecognitionException {
        try {
            // InternalFOTCTL.g:398:1: ( ruleEdgeLabelPredicate EOF )
            // InternalFOTCTL.g:399:1: ruleEdgeLabelPredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEdgeLabelPredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEdgeLabelPredicate"


    // $ANTLR start "ruleEdgeLabelPredicate"
    // InternalFOTCTL.g:406:1: ruleEdgeLabelPredicate : ( ( rule__EdgeLabelPredicate__Group__0 ) ) ;
    public final void ruleEdgeLabelPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:410:2: ( ( ( rule__EdgeLabelPredicate__Group__0 ) ) )
            // InternalFOTCTL.g:411:1: ( ( rule__EdgeLabelPredicate__Group__0 ) )
            {
            // InternalFOTCTL.g:411:1: ( ( rule__EdgeLabelPredicate__Group__0 ) )
            // InternalFOTCTL.g:412:1: ( rule__EdgeLabelPredicate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getGroup()); 
            }
            // InternalFOTCTL.g:413:1: ( rule__EdgeLabelPredicate__Group__0 )
            // InternalFOTCTL.g:413:2: rule__EdgeLabelPredicate__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getGroup()); 
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
    // $ANTLR end "ruleEdgeLabelPredicate"


    // $ANTLR start "entryRuleQuantifiedFormula"
    // InternalFOTCTL.g:425:1: entryRuleQuantifiedFormula : ruleQuantifiedFormula EOF ;
    public final void entryRuleQuantifiedFormula() throws RecognitionException {
        try {
            // InternalFOTCTL.g:426:1: ( ruleQuantifiedFormula EOF )
            // InternalFOTCTL.g:427:1: ruleQuantifiedFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQuantifiedFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQuantifiedFormula"


    // $ANTLR start "ruleQuantifiedFormula"
    // InternalFOTCTL.g:434:1: ruleQuantifiedFormula : ( ( rule__QuantifiedFormula__Group__0 ) ) ;
    public final void ruleQuantifiedFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:438:2: ( ( ( rule__QuantifiedFormula__Group__0 ) ) )
            // InternalFOTCTL.g:439:1: ( ( rule__QuantifiedFormula__Group__0 ) )
            {
            // InternalFOTCTL.g:439:1: ( ( rule__QuantifiedFormula__Group__0 ) )
            // InternalFOTCTL.g:440:1: ( rule__QuantifiedFormula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getGroup()); 
            }
            // InternalFOTCTL.g:441:1: ( rule__QuantifiedFormula__Group__0 )
            // InternalFOTCTL.g:441:2: rule__QuantifiedFormula__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getGroup()); 
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
    // $ANTLR end "ruleQuantifiedFormula"


    // $ANTLR start "entryRuleNotFormula"
    // InternalFOTCTL.g:455:1: entryRuleNotFormula : ruleNotFormula EOF ;
    public final void entryRuleNotFormula() throws RecognitionException {
        try {
            // InternalFOTCTL.g:456:1: ( ruleNotFormula EOF )
            // InternalFOTCTL.g:457:1: ruleNotFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNotFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNotFormula"


    // $ANTLR start "ruleNotFormula"
    // InternalFOTCTL.g:464:1: ruleNotFormula : ( ( rule__NotFormula__Group__0 ) ) ;
    public final void ruleNotFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:468:2: ( ( ( rule__NotFormula__Group__0 ) ) )
            // InternalFOTCTL.g:469:1: ( ( rule__NotFormula__Group__0 ) )
            {
            // InternalFOTCTL.g:469:1: ( ( rule__NotFormula__Group__0 ) )
            // InternalFOTCTL.g:470:1: ( rule__NotFormula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFormulaAccess().getGroup()); 
            }
            // InternalFOTCTL.g:471:1: ( rule__NotFormula__Group__0 )
            // InternalFOTCTL.g:471:2: rule__NotFormula__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotFormula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFormulaAccess().getGroup()); 
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
    // $ANTLR end "ruleNotFormula"


    // $ANTLR start "entryRuleUnaryTemporalFormula"
    // InternalFOTCTL.g:485:1: entryRuleUnaryTemporalFormula : ruleUnaryTemporalFormula EOF ;
    public final void entryRuleUnaryTemporalFormula() throws RecognitionException {
        try {
            // InternalFOTCTL.g:486:1: ( ruleUnaryTemporalFormula EOF )
            // InternalFOTCTL.g:487:1: ruleUnaryTemporalFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnaryTemporalFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnaryTemporalFormula"


    // $ANTLR start "ruleUnaryTemporalFormula"
    // InternalFOTCTL.g:494:1: ruleUnaryTemporalFormula : ( ( rule__UnaryTemporalFormula__Group__0 ) ) ;
    public final void ruleUnaryTemporalFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:498:2: ( ( ( rule__UnaryTemporalFormula__Group__0 ) ) )
            // InternalFOTCTL.g:499:1: ( ( rule__UnaryTemporalFormula__Group__0 ) )
            {
            // InternalFOTCTL.g:499:1: ( ( rule__UnaryTemporalFormula__Group__0 ) )
            // InternalFOTCTL.g:500:1: ( rule__UnaryTemporalFormula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getGroup()); 
            }
            // InternalFOTCTL.g:501:1: ( rule__UnaryTemporalFormula__Group__0 )
            // InternalFOTCTL.g:501:2: rule__UnaryTemporalFormula__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getGroup()); 
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
    // $ANTLR end "ruleUnaryTemporalFormula"


    // $ANTLR start "entryRuleBinaryTemporalFormula"
    // InternalFOTCTL.g:513:1: entryRuleBinaryTemporalFormula : ruleBinaryTemporalFormula EOF ;
    public final void entryRuleBinaryTemporalFormula() throws RecognitionException {
        try {
            // InternalFOTCTL.g:514:1: ( ruleBinaryTemporalFormula EOF )
            // InternalFOTCTL.g:515:1: ruleBinaryTemporalFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBinaryTemporalFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBinaryTemporalFormula"


    // $ANTLR start "ruleBinaryTemporalFormula"
    // InternalFOTCTL.g:522:1: ruleBinaryTemporalFormula : ( ( rule__BinaryTemporalFormula__Group__0 ) ) ;
    public final void ruleBinaryTemporalFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:526:2: ( ( ( rule__BinaryTemporalFormula__Group__0 ) ) )
            // InternalFOTCTL.g:527:1: ( ( rule__BinaryTemporalFormula__Group__0 ) )
            {
            // InternalFOTCTL.g:527:1: ( ( rule__BinaryTemporalFormula__Group__0 ) )
            // InternalFOTCTL.g:528:1: ( rule__BinaryTemporalFormula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getGroup()); 
            }
            // InternalFOTCTL.g:529:1: ( rule__BinaryTemporalFormula__Group__0 )
            // InternalFOTCTL.g:529:2: rule__BinaryTemporalFormula__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getGroup()); 
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
    // $ANTLR end "ruleBinaryTemporalFormula"


    // $ANTLR start "entryRuleBinaryLogicFormula"
    // InternalFOTCTL.g:541:1: entryRuleBinaryLogicFormula : ruleBinaryLogicFormula EOF ;
    public final void entryRuleBinaryLogicFormula() throws RecognitionException {
        try {
            // InternalFOTCTL.g:542:1: ( ruleBinaryLogicFormula EOF )
            // InternalFOTCTL.g:543:1: ruleBinaryLogicFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBinaryLogicFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBinaryLogicFormula"


    // $ANTLR start "ruleBinaryLogicFormula"
    // InternalFOTCTL.g:550:1: ruleBinaryLogicFormula : ( ( rule__BinaryLogicFormula__Group__0 ) ) ;
    public final void ruleBinaryLogicFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:554:2: ( ( ( rule__BinaryLogicFormula__Group__0 ) ) )
            // InternalFOTCTL.g:555:1: ( ( rule__BinaryLogicFormula__Group__0 ) )
            {
            // InternalFOTCTL.g:555:1: ( ( rule__BinaryLogicFormula__Group__0 ) )
            // InternalFOTCTL.g:556:1: ( rule__BinaryLogicFormula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getGroup()); 
            }
            // InternalFOTCTL.g:557:1: ( rule__BinaryLogicFormula__Group__0 )
            // InternalFOTCTL.g:557:2: rule__BinaryLogicFormula__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getGroup()); 
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
    // $ANTLR end "ruleBinaryLogicFormula"


    // $ANTLR start "entryRuleTerm"
    // InternalFOTCTL.g:569:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalFOTCTL.g:570:1: ( ruleTerm EOF )
            // InternalFOTCTL.g:571:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalFOTCTL.g:578:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:582:2: ( ( ( rule__Term__Alternatives ) ) )
            // InternalFOTCTL.g:583:1: ( ( rule__Term__Alternatives ) )
            {
            // InternalFOTCTL.g:583:1: ( ( rule__Term__Alternatives ) )
            // InternalFOTCTL.g:584:1: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // InternalFOTCTL.g:585:1: ( rule__Term__Alternatives )
            // InternalFOTCTL.g:585:2: rule__Term__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Term__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtomicProposition"
    // InternalFOTCTL.g:597:1: entryRuleAtomicProposition : ruleAtomicProposition EOF ;
    public final void entryRuleAtomicProposition() throws RecognitionException {
        try {
            // InternalFOTCTL.g:598:1: ( ruleAtomicProposition EOF )
            // InternalFOTCTL.g:599:1: ruleAtomicProposition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicPropositionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAtomicProposition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicPropositionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAtomicProposition"


    // $ANTLR start "ruleAtomicProposition"
    // InternalFOTCTL.g:606:1: ruleAtomicProposition : ( ( rule__AtomicProposition__Group__0 ) ) ;
    public final void ruleAtomicProposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:610:2: ( ( ( rule__AtomicProposition__Group__0 ) ) )
            // InternalFOTCTL.g:611:1: ( ( rule__AtomicProposition__Group__0 ) )
            {
            // InternalFOTCTL.g:611:1: ( ( rule__AtomicProposition__Group__0 ) )
            // InternalFOTCTL.g:612:1: ( rule__AtomicProposition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicPropositionAccess().getGroup()); 
            }
            // InternalFOTCTL.g:613:1: ( rule__AtomicProposition__Group__0 )
            // InternalFOTCTL.g:613:2: rule__AtomicProposition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicProposition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicPropositionAccess().getGroup()); 
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
    // $ANTLR end "ruleAtomicProposition"


    // $ANTLR start "ruleQuantifier"
    // InternalFOTCTL.g:626:1: ruleQuantifier : ( ( rule__Quantifier__Alternatives ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:630:1: ( ( ( rule__Quantifier__Alternatives ) ) )
            // InternalFOTCTL.g:631:1: ( ( rule__Quantifier__Alternatives ) )
            {
            // InternalFOTCTL.g:631:1: ( ( rule__Quantifier__Alternatives ) )
            // InternalFOTCTL.g:632:1: ( rule__Quantifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifierAccess().getAlternatives()); 
            }
            // InternalFOTCTL.g:633:1: ( rule__Quantifier__Alternatives )
            // InternalFOTCTL.g:633:2: rule__Quantifier__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Quantifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifierAccess().getAlternatives()); 
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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "ruleBinaryLogicOperator"
    // InternalFOTCTL.g:645:1: ruleBinaryLogicOperator : ( ( rule__BinaryLogicOperator__Alternatives ) ) ;
    public final void ruleBinaryLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:649:1: ( ( ( rule__BinaryLogicOperator__Alternatives ) ) )
            // InternalFOTCTL.g:650:1: ( ( rule__BinaryLogicOperator__Alternatives ) )
            {
            // InternalFOTCTL.g:650:1: ( ( rule__BinaryLogicOperator__Alternatives ) )
            // InternalFOTCTL.g:651:1: ( rule__BinaryLogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicOperatorAccess().getAlternatives()); 
            }
            // InternalFOTCTL.g:652:1: ( rule__BinaryLogicOperator__Alternatives )
            // InternalFOTCTL.g:652:2: rule__BinaryLogicOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBinaryLogicOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalFOTCTL.g:664:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:668:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalFOTCTL.g:669:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalFOTCTL.g:669:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalFOTCTL.g:670:1: ( rule__ComparisonOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            }
            // InternalFOTCTL.g:671:1: ( rule__ComparisonOperator__Alternatives )
            // InternalFOTCTL.g:671:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleTemporalOperator"
    // InternalFOTCTL.g:683:1: ruleTemporalOperator : ( ( rule__TemporalOperator__Alternatives ) ) ;
    public final void ruleTemporalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:687:1: ( ( ( rule__TemporalOperator__Alternatives ) ) )
            // InternalFOTCTL.g:688:1: ( ( rule__TemporalOperator__Alternatives ) )
            {
            // InternalFOTCTL.g:688:1: ( ( rule__TemporalOperator__Alternatives ) )
            // InternalFOTCTL.g:689:1: ( rule__TemporalOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalOperatorAccess().getAlternatives()); 
            }
            // InternalFOTCTL.g:690:1: ( rule__TemporalOperator__Alternatives )
            // InternalFOTCTL.g:690:2: rule__TemporalOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TemporalOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTemporalOperator"


    // $ANTLR start "rule__FormulaDefinition__Alternatives"
    // InternalFOTCTL.g:701:1: rule__FormulaDefinition__Alternatives : ( ( ruleAtomicFormula ) | ( ruleUnaryFormula ) | ( ruleBinaryFormula ) );
    public final void rule__FormulaDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:705:1: ( ( ruleAtomicFormula ) | ( ruleUnaryFormula ) | ( ruleBinaryFormula ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_NODE_PREDICATE_NAME:
            case RULE_EDGE_PREDICATE_NAME:
                {
                alt1=1;
                }
                break;
            case 15:
            case 16:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 44:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFOTCTL.g:706:1: ( ruleAtomicFormula )
                    {
                    // InternalFOTCTL.g:706:1: ( ruleAtomicFormula )
                    // InternalFOTCTL.g:707:1: ruleAtomicFormula
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormulaDefinitionAccess().getAtomicFormulaParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtomicFormula();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormulaDefinitionAccess().getAtomicFormulaParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:712:6: ( ruleUnaryFormula )
                    {
                    // InternalFOTCTL.g:712:6: ( ruleUnaryFormula )
                    // InternalFOTCTL.g:713:1: ruleUnaryFormula
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormulaDefinitionAccess().getUnaryFormulaParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnaryFormula();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormulaDefinitionAccess().getUnaryFormulaParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFOTCTL.g:718:6: ( ruleBinaryFormula )
                    {
                    // InternalFOTCTL.g:718:6: ( ruleBinaryFormula )
                    // InternalFOTCTL.g:719:1: ruleBinaryFormula
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormulaDefinitionAccess().getBinaryFormulaParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBinaryFormula();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormulaDefinitionAccess().getBinaryFormulaParserRuleCall_2()); 
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
    // $ANTLR end "rule__FormulaDefinition__Alternatives"


    // $ANTLR start "rule__UnaryFormula__Alternatives"
    // InternalFOTCTL.g:729:1: rule__UnaryFormula__Alternatives : ( ( ruleNotFormula ) | ( ruleUnaryTemporalFormula ) | ( ruleQuantifiedFormula ) );
    public final void rule__UnaryFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:733:1: ( ( ruleNotFormula ) | ( ruleUnaryTemporalFormula ) | ( ruleQuantifiedFormula ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt2=2;
                }
                break;
            case 15:
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFOTCTL.g:734:1: ( ruleNotFormula )
                    {
                    // InternalFOTCTL.g:734:1: ( ruleNotFormula )
                    // InternalFOTCTL.g:735:1: ruleNotFormula
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryFormulaAccess().getNotFormulaParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNotFormula();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryFormulaAccess().getNotFormulaParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:740:6: ( ruleUnaryTemporalFormula )
                    {
                    // InternalFOTCTL.g:740:6: ( ruleUnaryTemporalFormula )
                    // InternalFOTCTL.g:741:1: ruleUnaryTemporalFormula
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryFormulaAccess().getUnaryTemporalFormulaParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnaryTemporalFormula();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryFormulaAccess().getUnaryTemporalFormulaParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFOTCTL.g:746:6: ( ruleQuantifiedFormula )
                    {
                    // InternalFOTCTL.g:746:6: ( ruleQuantifiedFormula )
                    // InternalFOTCTL.g:747:1: ruleQuantifiedFormula
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryFormulaAccess().getQuantifiedFormulaParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQuantifiedFormula();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryFormulaAccess().getQuantifiedFormulaParserRuleCall_2()); 
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
    // $ANTLR end "rule__UnaryFormula__Alternatives"


    // $ANTLR start "rule__BinaryFormula__Alternatives"
    // InternalFOTCTL.g:757:1: rule__BinaryFormula__Alternatives : ( ( ruleBinaryLogicFormula ) | ( ruleBinaryTemporalFormula ) );
    public final void rule__BinaryFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:761:1: ( ( ruleBinaryLogicFormula ) | ( ruleBinaryTemporalFormula ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==41) ) {
                int LA3_1 = input.LA(2);

                if ( (synpred5_InternalFOTCTL()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFOTCTL.g:762:1: ( ruleBinaryLogicFormula )
                    {
                    // InternalFOTCTL.g:762:1: ( ruleBinaryLogicFormula )
                    // InternalFOTCTL.g:763:1: ruleBinaryLogicFormula
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryFormulaAccess().getBinaryLogicFormulaParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBinaryLogicFormula();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryFormulaAccess().getBinaryLogicFormulaParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:768:6: ( ruleBinaryTemporalFormula )
                    {
                    // InternalFOTCTL.g:768:6: ( ruleBinaryTemporalFormula )
                    // InternalFOTCTL.g:769:1: ruleBinaryTemporalFormula
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryFormulaAccess().getBinaryTemporalFormulaParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBinaryTemporalFormula();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryFormulaAccess().getBinaryTemporalFormulaParserRuleCall_1()); 
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
    // $ANTLR end "rule__BinaryFormula__Alternatives"


    // $ANTLR start "rule__AtomicFormula__Alternatives"
    // InternalFOTCTL.g:779:1: rule__AtomicFormula__Alternatives : ( ( ruleNodeLabelPredicate ) | ( ruleEdgeLabelPredicate ) );
    public final void rule__AtomicFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:783:1: ( ( ruleNodeLabelPredicate ) | ( ruleEdgeLabelPredicate ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NODE_PREDICATE_NAME) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_EDGE_PREDICATE_NAME) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFOTCTL.g:784:1: ( ruleNodeLabelPredicate )
                    {
                    // InternalFOTCTL.g:784:1: ( ruleNodeLabelPredicate )
                    // InternalFOTCTL.g:785:1: ruleNodeLabelPredicate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicFormulaAccess().getNodeLabelPredicateParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNodeLabelPredicate();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicFormulaAccess().getNodeLabelPredicateParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:790:6: ( ruleEdgeLabelPredicate )
                    {
                    // InternalFOTCTL.g:790:6: ( ruleEdgeLabelPredicate )
                    // InternalFOTCTL.g:791:1: ruleEdgeLabelPredicate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicFormulaAccess().getEdgeLabelPredicateParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEdgeLabelPredicate();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicFormulaAccess().getEdgeLabelPredicateParserRuleCall_1()); 
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
    // $ANTLR end "rule__AtomicFormula__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // InternalFOTCTL.g:803:1: rule__Term__Alternatives : ( ( ruleVariable ) | ( ruleConstant ) | ( ruleAtomicProposition ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:807:1: ( ( ruleVariable ) | ( ruleConstant ) | ( ruleAtomicProposition ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_VARIABLE_NAME) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred7_InternalFOTCTL()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_CONSTANT_NAME) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFOTCTL.g:808:1: ( ruleVariable )
                    {
                    // InternalFOTCTL.g:808:1: ( ruleVariable )
                    // InternalFOTCTL.g:809:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getVariableParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getVariableParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:814:6: ( ruleConstant )
                    {
                    // InternalFOTCTL.g:814:6: ( ruleConstant )
                    // InternalFOTCTL.g:815:1: ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getConstantParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getConstantParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFOTCTL.g:820:6: ( ruleAtomicProposition )
                    {
                    // InternalFOTCTL.g:820:6: ( ruleAtomicProposition )
                    // InternalFOTCTL.g:821:1: ruleAtomicProposition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getAtomicPropositionParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAtomicProposition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getAtomicPropositionParserRuleCall_2()); 
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
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__Quantifier__Alternatives"
    // InternalFOTCTL.g:831:1: rule__Quantifier__Alternatives : ( ( ( 'exists' ) ) | ( ( 'forall' ) ) );
    public final void rule__Quantifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:835:1: ( ( ( 'exists' ) ) | ( ( 'forall' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
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
                    // InternalFOTCTL.g:836:1: ( ( 'exists' ) )
                    {
                    // InternalFOTCTL.g:836:1: ( ( 'exists' ) )
                    // InternalFOTCTL.g:837:1: ( 'exists' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuantifierAccess().getEXISTSEnumLiteralDeclaration_0()); 
                    }
                    // InternalFOTCTL.g:838:1: ( 'exists' )
                    // InternalFOTCTL.g:838:3: 'exists'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuantifierAccess().getEXISTSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:843:6: ( ( 'forall' ) )
                    {
                    // InternalFOTCTL.g:843:6: ( ( 'forall' ) )
                    // InternalFOTCTL.g:844:1: ( 'forall' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQuantifierAccess().getFORALLEnumLiteralDeclaration_1()); 
                    }
                    // InternalFOTCTL.g:845:1: ( 'forall' )
                    // InternalFOTCTL.g:845:3: 'forall'
                    {
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQuantifierAccess().getFORALLEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__Quantifier__Alternatives"


    // $ANTLR start "rule__BinaryLogicOperator__Alternatives"
    // InternalFOTCTL.g:855:1: rule__BinaryLogicOperator__Alternatives : ( ( ( ' & ' ) ) | ( ( ' <=> ' ) ) | ( ( ' => ' ) ) | ( ( ' | ' ) ) | ( ( ' ^ ' ) ) );
    public final void rule__BinaryLogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:859:1: ( ( ( ' & ' ) ) | ( ( ' <=> ' ) ) | ( ( ' => ' ) ) | ( ( ' | ' ) ) | ( ( ' ^ ' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
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
                    // InternalFOTCTL.g:860:1: ( ( ' & ' ) )
                    {
                    // InternalFOTCTL.g:860:1: ( ( ' & ' ) )
                    // InternalFOTCTL.g:861:1: ( ' & ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalFOTCTL.g:862:1: ( ' & ' )
                    // InternalFOTCTL.g:862:3: ' & '
                    {
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:867:6: ( ( ' <=> ' ) )
                    {
                    // InternalFOTCTL.g:867:6: ( ( ' <=> ' ) )
                    // InternalFOTCTL.g:868:1: ( ' <=> ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryLogicOperatorAccess().getEQUIVEnumLiteralDeclaration_1()); 
                    }
                    // InternalFOTCTL.g:869:1: ( ' <=> ' )
                    // InternalFOTCTL.g:869:3: ' <=> '
                    {
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryLogicOperatorAccess().getEQUIVEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFOTCTL.g:874:6: ( ( ' => ' ) )
                    {
                    // InternalFOTCTL.g:874:6: ( ( ' => ' ) )
                    // InternalFOTCTL.g:875:1: ( ' => ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_2()); 
                    }
                    // InternalFOTCTL.g:876:1: ( ' => ' )
                    // InternalFOTCTL.g:876:3: ' => '
                    {
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFOTCTL.g:881:6: ( ( ' | ' ) )
                    {
                    // InternalFOTCTL.g:881:6: ( ( ' | ' ) )
                    // InternalFOTCTL.g:882:1: ( ' | ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryLogicOperatorAccess().getOREnumLiteralDeclaration_3()); 
                    }
                    // InternalFOTCTL.g:883:1: ( ' | ' )
                    // InternalFOTCTL.g:883:3: ' | '
                    {
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryLogicOperatorAccess().getOREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFOTCTL.g:888:6: ( ( ' ^ ' ) )
                    {
                    // InternalFOTCTL.g:888:6: ( ( ' ^ ' ) )
                    // InternalFOTCTL.g:889:1: ( ' ^ ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryLogicOperatorAccess().getXOREnumLiteralDeclaration_4()); 
                    }
                    // InternalFOTCTL.g:890:1: ( ' ^ ' )
                    // InternalFOTCTL.g:890:3: ' ^ '
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryLogicOperatorAccess().getXOREnumLiteralDeclaration_4()); 
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
    // $ANTLR end "rule__BinaryLogicOperator__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalFOTCTL.g:900:1: rule__ComparisonOperator__Alternatives : ( ( ( ' = ' ) ) | ( ( ' > ' ) ) | ( ( ' >= ' ) ) | ( ( ' < ' ) ) | ( ( ' <= ' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:904:1: ( ( ( ' = ' ) ) | ( ( ' > ' ) ) | ( ( ' >= ' ) ) | ( ( ' < ' ) ) | ( ( ' <= ' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
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
                    // InternalFOTCTL.g:905:1: ( ( ' = ' ) )
                    {
                    // InternalFOTCTL.g:905:1: ( ( ' = ' ) )
                    // InternalFOTCTL.g:906:1: ( ' = ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // InternalFOTCTL.g:907:1: ( ' = ' )
                    // InternalFOTCTL.g:907:3: ' = '
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:912:6: ( ( ' > ' ) )
                    {
                    // InternalFOTCTL.g:912:6: ( ( ' > ' ) )
                    // InternalFOTCTL.g:913:1: ( ' > ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }
                    // InternalFOTCTL.g:914:1: ( ' > ' )
                    // InternalFOTCTL.g:914:3: ' > '
                    {
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFOTCTL.g:919:6: ( ( ' >= ' ) )
                    {
                    // InternalFOTCTL.g:919:6: ( ( ' >= ' ) )
                    // InternalFOTCTL.g:920:1: ( ' >= ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalFOTCTL.g:921:1: ( ' >= ' )
                    // InternalFOTCTL.g:921:3: ' >= '
                    {
                    match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFOTCTL.g:926:6: ( ( ' < ' ) )
                    {
                    // InternalFOTCTL.g:926:6: ( ( ' < ' ) )
                    // InternalFOTCTL.g:927:1: ( ' < ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                    }
                    // InternalFOTCTL.g:928:1: ( ' < ' )
                    // InternalFOTCTL.g:928:3: ' < '
                    {
                    match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFOTCTL.g:933:6: ( ( ' <= ' ) )
                    {
                    // InternalFOTCTL.g:933:6: ( ( ' <= ' ) )
                    // InternalFOTCTL.g:934:1: ( ' <= ' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalFOTCTL.g:935:1: ( ' <= ' )
                    // InternalFOTCTL.g:935:3: ' <= '
                    {
                    match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__TemporalOperator__Alternatives"
    // InternalFOTCTL.g:945:1: rule__TemporalOperator__Alternatives : ( ( ( 'AF' ) ) | ( ( 'AG' ) ) | ( ( 'AU' ) ) | ( ( 'EF' ) ) | ( ( 'EG' ) ) | ( ( 'EU' ) ) );
    public final void rule__TemporalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:949:1: ( ( ( 'AF' ) ) | ( ( 'AG' ) ) | ( ( 'AU' ) ) | ( ( 'EF' ) ) | ( ( 'EG' ) ) | ( ( 'EU' ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 30:
                {
                alt9=4;
                }
                break;
            case 31:
                {
                alt9=5;
                }
                break;
            case 32:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFOTCTL.g:950:1: ( ( 'AF' ) )
                    {
                    // InternalFOTCTL.g:950:1: ( ( 'AF' ) )
                    // InternalFOTCTL.g:951:1: ( 'AF' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalOperatorAccess().getAFEnumLiteralDeclaration_0()); 
                    }
                    // InternalFOTCTL.g:952:1: ( 'AF' )
                    // InternalFOTCTL.g:952:3: 'AF'
                    {
                    match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalOperatorAccess().getAFEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFOTCTL.g:957:6: ( ( 'AG' ) )
                    {
                    // InternalFOTCTL.g:957:6: ( ( 'AG' ) )
                    // InternalFOTCTL.g:958:1: ( 'AG' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalOperatorAccess().getAGEnumLiteralDeclaration_1()); 
                    }
                    // InternalFOTCTL.g:959:1: ( 'AG' )
                    // InternalFOTCTL.g:959:3: 'AG'
                    {
                    match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalOperatorAccess().getAGEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFOTCTL.g:964:6: ( ( 'AU' ) )
                    {
                    // InternalFOTCTL.g:964:6: ( ( 'AU' ) )
                    // InternalFOTCTL.g:965:1: ( 'AU' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalOperatorAccess().getAUEnumLiteralDeclaration_2()); 
                    }
                    // InternalFOTCTL.g:966:1: ( 'AU' )
                    // InternalFOTCTL.g:966:3: 'AU'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalOperatorAccess().getAUEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFOTCTL.g:971:6: ( ( 'EF' ) )
                    {
                    // InternalFOTCTL.g:971:6: ( ( 'EF' ) )
                    // InternalFOTCTL.g:972:1: ( 'EF' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalOperatorAccess().getEFEnumLiteralDeclaration_3()); 
                    }
                    // InternalFOTCTL.g:973:1: ( 'EF' )
                    // InternalFOTCTL.g:973:3: 'EF'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalOperatorAccess().getEFEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFOTCTL.g:978:6: ( ( 'EG' ) )
                    {
                    // InternalFOTCTL.g:978:6: ( ( 'EG' ) )
                    // InternalFOTCTL.g:979:1: ( 'EG' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalOperatorAccess().getEGEnumLiteralDeclaration_4()); 
                    }
                    // InternalFOTCTL.g:980:1: ( 'EG' )
                    // InternalFOTCTL.g:980:3: 'EG'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalOperatorAccess().getEGEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFOTCTL.g:985:6: ( ( 'EU' ) )
                    {
                    // InternalFOTCTL.g:985:6: ( ( 'EU' ) )
                    // InternalFOTCTL.g:986:1: ( 'EU' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalOperatorAccess().getEUEnumLiteralDeclaration_5()); 
                    }
                    // InternalFOTCTL.g:987:1: ( 'EU' )
                    // InternalFOTCTL.g:987:3: 'EU'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalOperatorAccess().getEUEnumLiteralDeclaration_5()); 
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
    // $ANTLR end "rule__TemporalOperator__Alternatives"


    // $ANTLR start "rule__FoTCTLSpec__Group__0"
    // InternalFOTCTL.g:999:1: rule__FoTCTLSpec__Group__0 : rule__FoTCTLSpec__Group__0__Impl rule__FoTCTLSpec__Group__1 ;
    public final void rule__FoTCTLSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1003:1: ( rule__FoTCTLSpec__Group__0__Impl rule__FoTCTLSpec__Group__1 )
            // InternalFOTCTL.g:1004:2: rule__FoTCTLSpec__Group__0__Impl rule__FoTCTLSpec__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__FoTCTLSpec__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group__1();

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
    // $ANTLR end "rule__FoTCTLSpec__Group__0"


    // $ANTLR start "rule__FoTCTLSpec__Group__0__Impl"
    // InternalFOTCTL.g:1011:1: rule__FoTCTLSpec__Group__0__Impl : ( () ) ;
    public final void rule__FoTCTLSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1015:1: ( ( () ) )
            // InternalFOTCTL.g:1016:1: ( () )
            {
            // InternalFOTCTL.g:1016:1: ( () )
            // InternalFOTCTL.g:1017:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getFoTCTLSpecAction_0()); 
            }
            // InternalFOTCTL.g:1018:1: ()
            // InternalFOTCTL.g:1020:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getFoTCTLSpecAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoTCTLSpec__Group__0__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group__1"
    // InternalFOTCTL.g:1030:1: rule__FoTCTLSpec__Group__1 : rule__FoTCTLSpec__Group__1__Impl rule__FoTCTLSpec__Group__2 ;
    public final void rule__FoTCTLSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1034:1: ( rule__FoTCTLSpec__Group__1__Impl rule__FoTCTLSpec__Group__2 )
            // InternalFOTCTL.g:1035:2: rule__FoTCTLSpec__Group__1__Impl rule__FoTCTLSpec__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FoTCTLSpec__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group__2();

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
    // $ANTLR end "rule__FoTCTLSpec__Group__1"


    // $ANTLR start "rule__FoTCTLSpec__Group__1__Impl"
    // InternalFOTCTL.g:1042:1: rule__FoTCTLSpec__Group__1__Impl : ( 'Declaration\\n' ) ;
    public final void rule__FoTCTLSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1046:1: ( ( 'Declaration\\n' ) )
            // InternalFOTCTL.g:1047:1: ( 'Declaration\\n' )
            {
            // InternalFOTCTL.g:1047:1: ( 'Declaration\\n' )
            // InternalFOTCTL.g:1048:1: 'Declaration\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getDeclarationKeyword_1()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getDeclarationKeyword_1()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group__1__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group__2"
    // InternalFOTCTL.g:1061:1: rule__FoTCTLSpec__Group__2 : rule__FoTCTLSpec__Group__2__Impl rule__FoTCTLSpec__Group__3 ;
    public final void rule__FoTCTLSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1065:1: ( rule__FoTCTLSpec__Group__2__Impl rule__FoTCTLSpec__Group__3 )
            // InternalFOTCTL.g:1066:2: rule__FoTCTLSpec__Group__2__Impl rule__FoTCTLSpec__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FoTCTLSpec__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group__3();

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
    // $ANTLR end "rule__FoTCTLSpec__Group__2"


    // $ANTLR start "rule__FoTCTLSpec__Group__2__Impl"
    // InternalFOTCTL.g:1073:1: rule__FoTCTLSpec__Group__2__Impl : ( ( rule__FoTCTLSpec__Group_2__0 )? ) ;
    public final void rule__FoTCTLSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1077:1: ( ( ( rule__FoTCTLSpec__Group_2__0 )? ) )
            // InternalFOTCTL.g:1078:1: ( ( rule__FoTCTLSpec__Group_2__0 )? )
            {
            // InternalFOTCTL.g:1078:1: ( ( rule__FoTCTLSpec__Group_2__0 )? )
            // InternalFOTCTL.g:1079:1: ( rule__FoTCTLSpec__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getGroup_2()); 
            }
            // InternalFOTCTL.g:1080:1: ( rule__FoTCTLSpec__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFOTCTL.g:1080:2: rule__FoTCTLSpec__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FoTCTLSpec__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getGroup_2()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group__2__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group__3"
    // InternalFOTCTL.g:1090:1: rule__FoTCTLSpec__Group__3 : rule__FoTCTLSpec__Group__3__Impl rule__FoTCTLSpec__Group__4 ;
    public final void rule__FoTCTLSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1094:1: ( rule__FoTCTLSpec__Group__3__Impl rule__FoTCTLSpec__Group__4 )
            // InternalFOTCTL.g:1095:2: rule__FoTCTLSpec__Group__3__Impl rule__FoTCTLSpec__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FoTCTLSpec__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group__4();

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
    // $ANTLR end "rule__FoTCTLSpec__Group__3"


    // $ANTLR start "rule__FoTCTLSpec__Group__3__Impl"
    // InternalFOTCTL.g:1102:1: rule__FoTCTLSpec__Group__3__Impl : ( ( rule__FoTCTLSpec__Group_3__0 )? ) ;
    public final void rule__FoTCTLSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1106:1: ( ( ( rule__FoTCTLSpec__Group_3__0 )? ) )
            // InternalFOTCTL.g:1107:1: ( ( rule__FoTCTLSpec__Group_3__0 )? )
            {
            // InternalFOTCTL.g:1107:1: ( ( rule__FoTCTLSpec__Group_3__0 )? )
            // InternalFOTCTL.g:1108:1: ( rule__FoTCTLSpec__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getGroup_3()); 
            }
            // InternalFOTCTL.g:1109:1: ( rule__FoTCTLSpec__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFOTCTL.g:1109:2: rule__FoTCTLSpec__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FoTCTLSpec__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getGroup_3()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group__3__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group__4"
    // InternalFOTCTL.g:1119:1: rule__FoTCTLSpec__Group__4 : rule__FoTCTLSpec__Group__4__Impl rule__FoTCTLSpec__Group__5 ;
    public final void rule__FoTCTLSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1123:1: ( rule__FoTCTLSpec__Group__4__Impl rule__FoTCTLSpec__Group__5 )
            // InternalFOTCTL.g:1124:2: rule__FoTCTLSpec__Group__4__Impl rule__FoTCTLSpec__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FoTCTLSpec__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group__5();

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
    // $ANTLR end "rule__FoTCTLSpec__Group__4"


    // $ANTLR start "rule__FoTCTLSpec__Group__4__Impl"
    // InternalFOTCTL.g:1131:1: rule__FoTCTLSpec__Group__4__Impl : ( ( rule__FoTCTLSpec__Group_4__0 )? ) ;
    public final void rule__FoTCTLSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1135:1: ( ( ( rule__FoTCTLSpec__Group_4__0 )? ) )
            // InternalFOTCTL.g:1136:1: ( ( rule__FoTCTLSpec__Group_4__0 )? )
            {
            // InternalFOTCTL.g:1136:1: ( ( rule__FoTCTLSpec__Group_4__0 )? )
            // InternalFOTCTL.g:1137:1: ( rule__FoTCTLSpec__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getGroup_4()); 
            }
            // InternalFOTCTL.g:1138:1: ( rule__FoTCTLSpec__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFOTCTL.g:1138:2: rule__FoTCTLSpec__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__FoTCTLSpec__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getGroup_4()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group__4__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group__5"
    // InternalFOTCTL.g:1148:1: rule__FoTCTLSpec__Group__5 : rule__FoTCTLSpec__Group__5__Impl rule__FoTCTLSpec__Group__6 ;
    public final void rule__FoTCTLSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1152:1: ( rule__FoTCTLSpec__Group__5__Impl rule__FoTCTLSpec__Group__6 )
            // InternalFOTCTL.g:1153:2: rule__FoTCTLSpec__Group__5__Impl rule__FoTCTLSpec__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__FoTCTLSpec__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group__6();

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
    // $ANTLR end "rule__FoTCTLSpec__Group__5"


    // $ANTLR start "rule__FoTCTLSpec__Group__5__Impl"
    // InternalFOTCTL.g:1160:1: rule__FoTCTLSpec__Group__5__Impl : ( 'Formulas\\n' ) ;
    public final void rule__FoTCTLSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1164:1: ( ( 'Formulas\\n' ) )
            // InternalFOTCTL.g:1165:1: ( 'Formulas\\n' )
            {
            // InternalFOTCTL.g:1165:1: ( 'Formulas\\n' )
            // InternalFOTCTL.g:1166:1: 'Formulas\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getFormulasKeyword_5()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getFormulasKeyword_5()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group__5__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group__6"
    // InternalFOTCTL.g:1179:1: rule__FoTCTLSpec__Group__6 : rule__FoTCTLSpec__Group__6__Impl ;
    public final void rule__FoTCTLSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1183:1: ( rule__FoTCTLSpec__Group__6__Impl )
            // InternalFOTCTL.g:1184:2: rule__FoTCTLSpec__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group__6__Impl();

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
    // $ANTLR end "rule__FoTCTLSpec__Group__6"


    // $ANTLR start "rule__FoTCTLSpec__Group__6__Impl"
    // InternalFOTCTL.g:1190:1: rule__FoTCTLSpec__Group__6__Impl : ( ( ( rule__FoTCTLSpec__FormulasAssignment_6 ) ) ( ( rule__FoTCTLSpec__FormulasAssignment_6 )* ) ) ;
    public final void rule__FoTCTLSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1194:1: ( ( ( ( rule__FoTCTLSpec__FormulasAssignment_6 ) ) ( ( rule__FoTCTLSpec__FormulasAssignment_6 )* ) ) )
            // InternalFOTCTL.g:1195:1: ( ( ( rule__FoTCTLSpec__FormulasAssignment_6 ) ) ( ( rule__FoTCTLSpec__FormulasAssignment_6 )* ) )
            {
            // InternalFOTCTL.g:1195:1: ( ( ( rule__FoTCTLSpec__FormulasAssignment_6 ) ) ( ( rule__FoTCTLSpec__FormulasAssignment_6 )* ) )
            // InternalFOTCTL.g:1196:1: ( ( rule__FoTCTLSpec__FormulasAssignment_6 ) ) ( ( rule__FoTCTLSpec__FormulasAssignment_6 )* )
            {
            // InternalFOTCTL.g:1196:1: ( ( rule__FoTCTLSpec__FormulasAssignment_6 ) )
            // InternalFOTCTL.g:1197:1: ( rule__FoTCTLSpec__FormulasAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getFormulasAssignment_6()); 
            }
            // InternalFOTCTL.g:1198:1: ( rule__FoTCTLSpec__FormulasAssignment_6 )
            // InternalFOTCTL.g:1198:2: rule__FoTCTLSpec__FormulasAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__FoTCTLSpec__FormulasAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getFormulasAssignment_6()); 
            }

            }

            // InternalFOTCTL.g:1201:1: ( ( rule__FoTCTLSpec__FormulasAssignment_6 )* )
            // InternalFOTCTL.g:1202:1: ( rule__FoTCTLSpec__FormulasAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getFormulasAssignment_6()); 
            }
            // InternalFOTCTL.g:1203:1: ( rule__FoTCTLSpec__FormulasAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_NODE_PREDICATE_NAME && LA13_0<=RULE_EDGE_PREDICATE_NAME)||(LA13_0>=15 && LA13_0<=16)||(LA13_0>=27 && LA13_0<=32)||LA13_0==41||LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFOTCTL.g:1203:2: rule__FoTCTLSpec__FormulasAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__FoTCTLSpec__FormulasAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getFormulasAssignment_6()); 
            }

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
    // $ANTLR end "rule__FoTCTLSpec__Group__6__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_2__0"
    // InternalFOTCTL.g:1228:1: rule__FoTCTLSpec__Group_2__0 : rule__FoTCTLSpec__Group_2__0__Impl rule__FoTCTLSpec__Group_2__1 ;
    public final void rule__FoTCTLSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1232:1: ( rule__FoTCTLSpec__Group_2__0__Impl rule__FoTCTLSpec__Group_2__1 )
            // InternalFOTCTL.g:1233:2: rule__FoTCTLSpec__Group_2__0__Impl rule__FoTCTLSpec__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__FoTCTLSpec__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_2__1();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_2__0"


    // $ANTLR start "rule__FoTCTLSpec__Group_2__0__Impl"
    // InternalFOTCTL.g:1240:1: rule__FoTCTLSpec__Group_2__0__Impl : ( 'NodeLabelPredicates {' ) ;
    public final void rule__FoTCTLSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1244:1: ( ( 'NodeLabelPredicates {' ) )
            // InternalFOTCTL.g:1245:1: ( 'NodeLabelPredicates {' )
            {
            // InternalFOTCTL.g:1245:1: ( 'NodeLabelPredicates {' )
            // InternalFOTCTL.g:1246:1: 'NodeLabelPredicates {'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesKeyword_2_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_2__0__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_2__1"
    // InternalFOTCTL.g:1259:1: rule__FoTCTLSpec__Group_2__1 : rule__FoTCTLSpec__Group_2__1__Impl rule__FoTCTLSpec__Group_2__2 ;
    public final void rule__FoTCTLSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1263:1: ( rule__FoTCTLSpec__Group_2__1__Impl rule__FoTCTLSpec__Group_2__2 )
            // InternalFOTCTL.g:1264:2: rule__FoTCTLSpec__Group_2__1__Impl rule__FoTCTLSpec__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__FoTCTLSpec__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_2__2();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_2__1"


    // $ANTLR start "rule__FoTCTLSpec__Group_2__1__Impl"
    // InternalFOTCTL.g:1271:1: rule__FoTCTLSpec__Group_2__1__Impl : ( ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1 ) ) ;
    public final void rule__FoTCTLSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1275:1: ( ( ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1 ) ) )
            // InternalFOTCTL.g:1276:1: ( ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1 ) )
            {
            // InternalFOTCTL.g:1276:1: ( ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1 ) )
            // InternalFOTCTL.g:1277:1: ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesAssignment_2_1()); 
            }
            // InternalFOTCTL.g:1278:1: ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1 )
            // InternalFOTCTL.g:1278:2: rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesAssignment_2_1()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_2__1__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_2__2"
    // InternalFOTCTL.g:1288:1: rule__FoTCTLSpec__Group_2__2 : rule__FoTCTLSpec__Group_2__2__Impl rule__FoTCTLSpec__Group_2__3 ;
    public final void rule__FoTCTLSpec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1292:1: ( rule__FoTCTLSpec__Group_2__2__Impl rule__FoTCTLSpec__Group_2__3 )
            // InternalFOTCTL.g:1293:2: rule__FoTCTLSpec__Group_2__2__Impl rule__FoTCTLSpec__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__FoTCTLSpec__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_2__3();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_2__2"


    // $ANTLR start "rule__FoTCTLSpec__Group_2__2__Impl"
    // InternalFOTCTL.g:1300:1: rule__FoTCTLSpec__Group_2__2__Impl : ( ( rule__FoTCTLSpec__Group_2_2__0 )* ) ;
    public final void rule__FoTCTLSpec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1304:1: ( ( ( rule__FoTCTLSpec__Group_2_2__0 )* ) )
            // InternalFOTCTL.g:1305:1: ( ( rule__FoTCTLSpec__Group_2_2__0 )* )
            {
            // InternalFOTCTL.g:1305:1: ( ( rule__FoTCTLSpec__Group_2_2__0 )* )
            // InternalFOTCTL.g:1306:1: ( rule__FoTCTLSpec__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getGroup_2_2()); 
            }
            // InternalFOTCTL.g:1307:1: ( rule__FoTCTLSpec__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFOTCTL.g:1307:2: rule__FoTCTLSpec__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__FoTCTLSpec__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getGroup_2_2()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_2__2__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_2__3"
    // InternalFOTCTL.g:1317:1: rule__FoTCTLSpec__Group_2__3 : rule__FoTCTLSpec__Group_2__3__Impl ;
    public final void rule__FoTCTLSpec__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1321:1: ( rule__FoTCTLSpec__Group_2__3__Impl )
            // InternalFOTCTL.g:1322:2: rule__FoTCTLSpec__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_2__3__Impl();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_2__3"


    // $ANTLR start "rule__FoTCTLSpec__Group_2__3__Impl"
    // InternalFOTCTL.g:1328:1: rule__FoTCTLSpec__Group_2__3__Impl : ( '}\\n' ) ;
    public final void rule__FoTCTLSpec__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1332:1: ( ( '}\\n' ) )
            // InternalFOTCTL.g:1333:1: ( '}\\n' )
            {
            // InternalFOTCTL.g:1333:1: ( '}\\n' )
            // InternalFOTCTL.g:1334:1: '}\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getRightCurlyBracketControl000aKeyword_2_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getRightCurlyBracketControl000aKeyword_2_3()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_2__3__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_2_2__0"
    // InternalFOTCTL.g:1355:1: rule__FoTCTLSpec__Group_2_2__0 : rule__FoTCTLSpec__Group_2_2__0__Impl rule__FoTCTLSpec__Group_2_2__1 ;
    public final void rule__FoTCTLSpec__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1359:1: ( rule__FoTCTLSpec__Group_2_2__0__Impl rule__FoTCTLSpec__Group_2_2__1 )
            // InternalFOTCTL.g:1360:2: rule__FoTCTLSpec__Group_2_2__0__Impl rule__FoTCTLSpec__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__FoTCTLSpec__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_2_2__1();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_2_2__0"


    // $ANTLR start "rule__FoTCTLSpec__Group_2_2__0__Impl"
    // InternalFOTCTL.g:1367:1: rule__FoTCTLSpec__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FoTCTLSpec__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1371:1: ( ( ',' ) )
            // InternalFOTCTL.g:1372:1: ( ',' )
            {
            // InternalFOTCTL.g:1372:1: ( ',' )
            // InternalFOTCTL.g:1373:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getCommaKeyword_2_2_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_2_2__0__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_2_2__1"
    // InternalFOTCTL.g:1386:1: rule__FoTCTLSpec__Group_2_2__1 : rule__FoTCTLSpec__Group_2_2__1__Impl ;
    public final void rule__FoTCTLSpec__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1390:1: ( rule__FoTCTLSpec__Group_2_2__1__Impl )
            // InternalFOTCTL.g:1391:2: rule__FoTCTLSpec__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_2_2__1"


    // $ANTLR start "rule__FoTCTLSpec__Group_2_2__1__Impl"
    // InternalFOTCTL.g:1397:1: rule__FoTCTLSpec__Group_2_2__1__Impl : ( ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1 ) ) ;
    public final void rule__FoTCTLSpec__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1401:1: ( ( ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1 ) ) )
            // InternalFOTCTL.g:1402:1: ( ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1 ) )
            {
            // InternalFOTCTL.g:1402:1: ( ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1 ) )
            // InternalFOTCTL.g:1403:1: ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesAssignment_2_2_1()); 
            }
            // InternalFOTCTL.g:1404:1: ( rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1 )
            // InternalFOTCTL.g:1404:2: rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesAssignment_2_2_1()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_2_2__1__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_3__0"
    // InternalFOTCTL.g:1418:1: rule__FoTCTLSpec__Group_3__0 : rule__FoTCTLSpec__Group_3__0__Impl rule__FoTCTLSpec__Group_3__1 ;
    public final void rule__FoTCTLSpec__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1422:1: ( rule__FoTCTLSpec__Group_3__0__Impl rule__FoTCTLSpec__Group_3__1 )
            // InternalFOTCTL.g:1423:2: rule__FoTCTLSpec__Group_3__0__Impl rule__FoTCTLSpec__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__FoTCTLSpec__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_3__1();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_3__0"


    // $ANTLR start "rule__FoTCTLSpec__Group_3__0__Impl"
    // InternalFOTCTL.g:1430:1: rule__FoTCTLSpec__Group_3__0__Impl : ( 'EdgeLabelPredicates {' ) ;
    public final void rule__FoTCTLSpec__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1434:1: ( ( 'EdgeLabelPredicates {' ) )
            // InternalFOTCTL.g:1435:1: ( 'EdgeLabelPredicates {' )
            {
            // InternalFOTCTL.g:1435:1: ( 'EdgeLabelPredicates {' )
            // InternalFOTCTL.g:1436:1: 'EdgeLabelPredicates {'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesKeyword_3_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesKeyword_3_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_3__0__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_3__1"
    // InternalFOTCTL.g:1449:1: rule__FoTCTLSpec__Group_3__1 : rule__FoTCTLSpec__Group_3__1__Impl rule__FoTCTLSpec__Group_3__2 ;
    public final void rule__FoTCTLSpec__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1453:1: ( rule__FoTCTLSpec__Group_3__1__Impl rule__FoTCTLSpec__Group_3__2 )
            // InternalFOTCTL.g:1454:2: rule__FoTCTLSpec__Group_3__1__Impl rule__FoTCTLSpec__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__FoTCTLSpec__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_3__2();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_3__1"


    // $ANTLR start "rule__FoTCTLSpec__Group_3__1__Impl"
    // InternalFOTCTL.g:1461:1: rule__FoTCTLSpec__Group_3__1__Impl : ( ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1 ) ) ;
    public final void rule__FoTCTLSpec__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1465:1: ( ( ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1 ) ) )
            // InternalFOTCTL.g:1466:1: ( ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1 ) )
            {
            // InternalFOTCTL.g:1466:1: ( ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1 ) )
            // InternalFOTCTL.g:1467:1: ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesAssignment_3_1()); 
            }
            // InternalFOTCTL.g:1468:1: ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1 )
            // InternalFOTCTL.g:1468:2: rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesAssignment_3_1()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_3__1__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_3__2"
    // InternalFOTCTL.g:1478:1: rule__FoTCTLSpec__Group_3__2 : rule__FoTCTLSpec__Group_3__2__Impl rule__FoTCTLSpec__Group_3__3 ;
    public final void rule__FoTCTLSpec__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1482:1: ( rule__FoTCTLSpec__Group_3__2__Impl rule__FoTCTLSpec__Group_3__3 )
            // InternalFOTCTL.g:1483:2: rule__FoTCTLSpec__Group_3__2__Impl rule__FoTCTLSpec__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__FoTCTLSpec__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_3__3();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_3__2"


    // $ANTLR start "rule__FoTCTLSpec__Group_3__2__Impl"
    // InternalFOTCTL.g:1490:1: rule__FoTCTLSpec__Group_3__2__Impl : ( ( rule__FoTCTLSpec__Group_3_2__0 )* ) ;
    public final void rule__FoTCTLSpec__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1494:1: ( ( ( rule__FoTCTLSpec__Group_3_2__0 )* ) )
            // InternalFOTCTL.g:1495:1: ( ( rule__FoTCTLSpec__Group_3_2__0 )* )
            {
            // InternalFOTCTL.g:1495:1: ( ( rule__FoTCTLSpec__Group_3_2__0 )* )
            // InternalFOTCTL.g:1496:1: ( rule__FoTCTLSpec__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getGroup_3_2()); 
            }
            // InternalFOTCTL.g:1497:1: ( rule__FoTCTLSpec__Group_3_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFOTCTL.g:1497:2: rule__FoTCTLSpec__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__FoTCTLSpec__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getGroup_3_2()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_3__2__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_3__3"
    // InternalFOTCTL.g:1507:1: rule__FoTCTLSpec__Group_3__3 : rule__FoTCTLSpec__Group_3__3__Impl ;
    public final void rule__FoTCTLSpec__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1511:1: ( rule__FoTCTLSpec__Group_3__3__Impl )
            // InternalFOTCTL.g:1512:2: rule__FoTCTLSpec__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_3__3__Impl();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_3__3"


    // $ANTLR start "rule__FoTCTLSpec__Group_3__3__Impl"
    // InternalFOTCTL.g:1518:1: rule__FoTCTLSpec__Group_3__3__Impl : ( '}\\n' ) ;
    public final void rule__FoTCTLSpec__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1522:1: ( ( '}\\n' ) )
            // InternalFOTCTL.g:1523:1: ( '}\\n' )
            {
            // InternalFOTCTL.g:1523:1: ( '}\\n' )
            // InternalFOTCTL.g:1524:1: '}\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getRightCurlyBracketControl000aKeyword_3_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getRightCurlyBracketControl000aKeyword_3_3()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_3__3__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_3_2__0"
    // InternalFOTCTL.g:1545:1: rule__FoTCTLSpec__Group_3_2__0 : rule__FoTCTLSpec__Group_3_2__0__Impl rule__FoTCTLSpec__Group_3_2__1 ;
    public final void rule__FoTCTLSpec__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1549:1: ( rule__FoTCTLSpec__Group_3_2__0__Impl rule__FoTCTLSpec__Group_3_2__1 )
            // InternalFOTCTL.g:1550:2: rule__FoTCTLSpec__Group_3_2__0__Impl rule__FoTCTLSpec__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__FoTCTLSpec__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_3_2__1();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_3_2__0"


    // $ANTLR start "rule__FoTCTLSpec__Group_3_2__0__Impl"
    // InternalFOTCTL.g:1557:1: rule__FoTCTLSpec__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FoTCTLSpec__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1561:1: ( ( ',' ) )
            // InternalFOTCTL.g:1562:1: ( ',' )
            {
            // InternalFOTCTL.g:1562:1: ( ',' )
            // InternalFOTCTL.g:1563:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getCommaKeyword_3_2_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_3_2__0__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_3_2__1"
    // InternalFOTCTL.g:1576:1: rule__FoTCTLSpec__Group_3_2__1 : rule__FoTCTLSpec__Group_3_2__1__Impl ;
    public final void rule__FoTCTLSpec__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1580:1: ( rule__FoTCTLSpec__Group_3_2__1__Impl )
            // InternalFOTCTL.g:1581:2: rule__FoTCTLSpec__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_3_2__1"


    // $ANTLR start "rule__FoTCTLSpec__Group_3_2__1__Impl"
    // InternalFOTCTL.g:1587:1: rule__FoTCTLSpec__Group_3_2__1__Impl : ( ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1 ) ) ;
    public final void rule__FoTCTLSpec__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1591:1: ( ( ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1 ) ) )
            // InternalFOTCTL.g:1592:1: ( ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1 ) )
            {
            // InternalFOTCTL.g:1592:1: ( ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1 ) )
            // InternalFOTCTL.g:1593:1: ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesAssignment_3_2_1()); 
            }
            // InternalFOTCTL.g:1594:1: ( rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1 )
            // InternalFOTCTL.g:1594:2: rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesAssignment_3_2_1()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_3_2__1__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_4__0"
    // InternalFOTCTL.g:1608:1: rule__FoTCTLSpec__Group_4__0 : rule__FoTCTLSpec__Group_4__0__Impl rule__FoTCTLSpec__Group_4__1 ;
    public final void rule__FoTCTLSpec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1612:1: ( rule__FoTCTLSpec__Group_4__0__Impl rule__FoTCTLSpec__Group_4__1 )
            // InternalFOTCTL.g:1613:2: rule__FoTCTLSpec__Group_4__0__Impl rule__FoTCTLSpec__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__FoTCTLSpec__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_4__1();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_4__0"


    // $ANTLR start "rule__FoTCTLSpec__Group_4__0__Impl"
    // InternalFOTCTL.g:1620:1: rule__FoTCTLSpec__Group_4__0__Impl : ( 'Constants {' ) ;
    public final void rule__FoTCTLSpec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1624:1: ( ( 'Constants {' ) )
            // InternalFOTCTL.g:1625:1: ( 'Constants {' )
            {
            // InternalFOTCTL.g:1625:1: ( 'Constants {' )
            // InternalFOTCTL.g:1626:1: 'Constants {'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getConstantsKeyword_4_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getConstantsKeyword_4_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_4__0__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_4__1"
    // InternalFOTCTL.g:1639:1: rule__FoTCTLSpec__Group_4__1 : rule__FoTCTLSpec__Group_4__1__Impl rule__FoTCTLSpec__Group_4__2 ;
    public final void rule__FoTCTLSpec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1643:1: ( rule__FoTCTLSpec__Group_4__1__Impl rule__FoTCTLSpec__Group_4__2 )
            // InternalFOTCTL.g:1644:2: rule__FoTCTLSpec__Group_4__1__Impl rule__FoTCTLSpec__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__FoTCTLSpec__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_4__2();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_4__1"


    // $ANTLR start "rule__FoTCTLSpec__Group_4__1__Impl"
    // InternalFOTCTL.g:1651:1: rule__FoTCTLSpec__Group_4__1__Impl : ( ( rule__FoTCTLSpec__ConstantsAssignment_4_1 ) ) ;
    public final void rule__FoTCTLSpec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1655:1: ( ( ( rule__FoTCTLSpec__ConstantsAssignment_4_1 ) ) )
            // InternalFOTCTL.g:1656:1: ( ( rule__FoTCTLSpec__ConstantsAssignment_4_1 ) )
            {
            // InternalFOTCTL.g:1656:1: ( ( rule__FoTCTLSpec__ConstantsAssignment_4_1 ) )
            // InternalFOTCTL.g:1657:1: ( rule__FoTCTLSpec__ConstantsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getConstantsAssignment_4_1()); 
            }
            // InternalFOTCTL.g:1658:1: ( rule__FoTCTLSpec__ConstantsAssignment_4_1 )
            // InternalFOTCTL.g:1658:2: rule__FoTCTLSpec__ConstantsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__ConstantsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getConstantsAssignment_4_1()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_4__1__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_4__2"
    // InternalFOTCTL.g:1668:1: rule__FoTCTLSpec__Group_4__2 : rule__FoTCTLSpec__Group_4__2__Impl rule__FoTCTLSpec__Group_4__3 ;
    public final void rule__FoTCTLSpec__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1672:1: ( rule__FoTCTLSpec__Group_4__2__Impl rule__FoTCTLSpec__Group_4__3 )
            // InternalFOTCTL.g:1673:2: rule__FoTCTLSpec__Group_4__2__Impl rule__FoTCTLSpec__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__FoTCTLSpec__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_4__3();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_4__2"


    // $ANTLR start "rule__FoTCTLSpec__Group_4__2__Impl"
    // InternalFOTCTL.g:1680:1: rule__FoTCTLSpec__Group_4__2__Impl : ( ( rule__FoTCTLSpec__Group_4_2__0 )* ) ;
    public final void rule__FoTCTLSpec__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1684:1: ( ( ( rule__FoTCTLSpec__Group_4_2__0 )* ) )
            // InternalFOTCTL.g:1685:1: ( ( rule__FoTCTLSpec__Group_4_2__0 )* )
            {
            // InternalFOTCTL.g:1685:1: ( ( rule__FoTCTLSpec__Group_4_2__0 )* )
            // InternalFOTCTL.g:1686:1: ( rule__FoTCTLSpec__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getGroup_4_2()); 
            }
            // InternalFOTCTL.g:1687:1: ( rule__FoTCTLSpec__Group_4_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFOTCTL.g:1687:2: rule__FoTCTLSpec__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__FoTCTLSpec__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getGroup_4_2()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_4__2__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_4__3"
    // InternalFOTCTL.g:1697:1: rule__FoTCTLSpec__Group_4__3 : rule__FoTCTLSpec__Group_4__3__Impl ;
    public final void rule__FoTCTLSpec__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1701:1: ( rule__FoTCTLSpec__Group_4__3__Impl )
            // InternalFOTCTL.g:1702:2: rule__FoTCTLSpec__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_4__3__Impl();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_4__3"


    // $ANTLR start "rule__FoTCTLSpec__Group_4__3__Impl"
    // InternalFOTCTL.g:1708:1: rule__FoTCTLSpec__Group_4__3__Impl : ( '}\\n' ) ;
    public final void rule__FoTCTLSpec__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1712:1: ( ( '}\\n' ) )
            // InternalFOTCTL.g:1713:1: ( '}\\n' )
            {
            // InternalFOTCTL.g:1713:1: ( '}\\n' )
            // InternalFOTCTL.g:1714:1: '}\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getRightCurlyBracketControl000aKeyword_4_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getRightCurlyBracketControl000aKeyword_4_3()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_4__3__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_4_2__0"
    // InternalFOTCTL.g:1735:1: rule__FoTCTLSpec__Group_4_2__0 : rule__FoTCTLSpec__Group_4_2__0__Impl rule__FoTCTLSpec__Group_4_2__1 ;
    public final void rule__FoTCTLSpec__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1739:1: ( rule__FoTCTLSpec__Group_4_2__0__Impl rule__FoTCTLSpec__Group_4_2__1 )
            // InternalFOTCTL.g:1740:2: rule__FoTCTLSpec__Group_4_2__0__Impl rule__FoTCTLSpec__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__FoTCTLSpec__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_4_2__1();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_4_2__0"


    // $ANTLR start "rule__FoTCTLSpec__Group_4_2__0__Impl"
    // InternalFOTCTL.g:1747:1: rule__FoTCTLSpec__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__FoTCTLSpec__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1751:1: ( ( ',' ) )
            // InternalFOTCTL.g:1752:1: ( ',' )
            {
            // InternalFOTCTL.g:1752:1: ( ',' )
            // InternalFOTCTL.g:1753:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getCommaKeyword_4_2_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_4_2__0__Impl"


    // $ANTLR start "rule__FoTCTLSpec__Group_4_2__1"
    // InternalFOTCTL.g:1766:1: rule__FoTCTLSpec__Group_4_2__1 : rule__FoTCTLSpec__Group_4_2__1__Impl ;
    public final void rule__FoTCTLSpec__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1770:1: ( rule__FoTCTLSpec__Group_4_2__1__Impl )
            // InternalFOTCTL.g:1771:2: rule__FoTCTLSpec__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__FoTCTLSpec__Group_4_2__1"


    // $ANTLR start "rule__FoTCTLSpec__Group_4_2__1__Impl"
    // InternalFOTCTL.g:1777:1: rule__FoTCTLSpec__Group_4_2__1__Impl : ( ( rule__FoTCTLSpec__ConstantsAssignment_4_2_1 ) ) ;
    public final void rule__FoTCTLSpec__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1781:1: ( ( ( rule__FoTCTLSpec__ConstantsAssignment_4_2_1 ) ) )
            // InternalFOTCTL.g:1782:1: ( ( rule__FoTCTLSpec__ConstantsAssignment_4_2_1 ) )
            {
            // InternalFOTCTL.g:1782:1: ( ( rule__FoTCTLSpec__ConstantsAssignment_4_2_1 ) )
            // InternalFOTCTL.g:1783:1: ( rule__FoTCTLSpec__ConstantsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getConstantsAssignment_4_2_1()); 
            }
            // InternalFOTCTL.g:1784:1: ( rule__FoTCTLSpec__ConstantsAssignment_4_2_1 )
            // InternalFOTCTL.g:1784:2: rule__FoTCTLSpec__ConstantsAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLSpec__ConstantsAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getConstantsAssignment_4_2_1()); 
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
    // $ANTLR end "rule__FoTCTLSpec__Group_4_2__1__Impl"


    // $ANTLR start "rule__FoTCTLFormula__Group__0"
    // InternalFOTCTL.g:1798:1: rule__FoTCTLFormula__Group__0 : rule__FoTCTLFormula__Group__0__Impl rule__FoTCTLFormula__Group__1 ;
    public final void rule__FoTCTLFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1802:1: ( rule__FoTCTLFormula__Group__0__Impl rule__FoTCTLFormula__Group__1 )
            // InternalFOTCTL.g:1803:2: rule__FoTCTLFormula__Group__0__Impl rule__FoTCTLFormula__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__FoTCTLFormula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLFormula__Group__1();

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
    // $ANTLR end "rule__FoTCTLFormula__Group__0"


    // $ANTLR start "rule__FoTCTLFormula__Group__0__Impl"
    // InternalFOTCTL.g:1810:1: rule__FoTCTLFormula__Group__0__Impl : ( () ) ;
    public final void rule__FoTCTLFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1814:1: ( ( () ) )
            // InternalFOTCTL.g:1815:1: ( () )
            {
            // InternalFOTCTL.g:1815:1: ( () )
            // InternalFOTCTL.g:1816:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLFormulaAccess().getFoTCTLFormulaAction_0()); 
            }
            // InternalFOTCTL.g:1817:1: ()
            // InternalFOTCTL.g:1819:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLFormulaAccess().getFoTCTLFormulaAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FoTCTLFormula__Group__0__Impl"


    // $ANTLR start "rule__FoTCTLFormula__Group__1"
    // InternalFOTCTL.g:1829:1: rule__FoTCTLFormula__Group__1 : rule__FoTCTLFormula__Group__1__Impl rule__FoTCTLFormula__Group__2 ;
    public final void rule__FoTCTLFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1833:1: ( rule__FoTCTLFormula__Group__1__Impl rule__FoTCTLFormula__Group__2 )
            // InternalFOTCTL.g:1834:2: rule__FoTCTLFormula__Group__1__Impl rule__FoTCTLFormula__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__FoTCTLFormula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLFormula__Group__2();

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
    // $ANTLR end "rule__FoTCTLFormula__Group__1"


    // $ANTLR start "rule__FoTCTLFormula__Group__1__Impl"
    // InternalFOTCTL.g:1841:1: rule__FoTCTLFormula__Group__1__Impl : ( ( rule__FoTCTLFormula__FormulaAssignment_1 ) ) ;
    public final void rule__FoTCTLFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1845:1: ( ( ( rule__FoTCTLFormula__FormulaAssignment_1 ) ) )
            // InternalFOTCTL.g:1846:1: ( ( rule__FoTCTLFormula__FormulaAssignment_1 ) )
            {
            // InternalFOTCTL.g:1846:1: ( ( rule__FoTCTLFormula__FormulaAssignment_1 ) )
            // InternalFOTCTL.g:1847:1: ( rule__FoTCTLFormula__FormulaAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLFormulaAccess().getFormulaAssignment_1()); 
            }
            // InternalFOTCTL.g:1848:1: ( rule__FoTCTLFormula__FormulaAssignment_1 )
            // InternalFOTCTL.g:1848:2: rule__FoTCTLFormula__FormulaAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLFormula__FormulaAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLFormulaAccess().getFormulaAssignment_1()); 
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
    // $ANTLR end "rule__FoTCTLFormula__Group__1__Impl"


    // $ANTLR start "rule__FoTCTLFormula__Group__2"
    // InternalFOTCTL.g:1858:1: rule__FoTCTLFormula__Group__2 : rule__FoTCTLFormula__Group__2__Impl ;
    public final void rule__FoTCTLFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1862:1: ( rule__FoTCTLFormula__Group__2__Impl )
            // InternalFOTCTL.g:1863:2: rule__FoTCTLFormula__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FoTCTLFormula__Group__2__Impl();

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
    // $ANTLR end "rule__FoTCTLFormula__Group__2"


    // $ANTLR start "rule__FoTCTLFormula__Group__2__Impl"
    // InternalFOTCTL.g:1869:1: rule__FoTCTLFormula__Group__2__Impl : ( ';\\n' ) ;
    public final void rule__FoTCTLFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1873:1: ( ( ';\\n' ) )
            // InternalFOTCTL.g:1874:1: ( ';\\n' )
            {
            // InternalFOTCTL.g:1874:1: ( ';\\n' )
            // InternalFOTCTL.g:1875:1: ';\\n'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLFormulaAccess().getSemicolonControl000aKeyword_2()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLFormulaAccess().getSemicolonControl000aKeyword_2()); 
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
    // $ANTLR end "rule__FoTCTLFormula__Group__2__Impl"


    // $ANTLR start "rule__NodeLabelPredicateDecl__Group__0"
    // InternalFOTCTL.g:1894:1: rule__NodeLabelPredicateDecl__Group__0 : rule__NodeLabelPredicateDecl__Group__0__Impl rule__NodeLabelPredicateDecl__Group__1 ;
    public final void rule__NodeLabelPredicateDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1898:1: ( rule__NodeLabelPredicateDecl__Group__0__Impl rule__NodeLabelPredicateDecl__Group__1 )
            // InternalFOTCTL.g:1899:2: rule__NodeLabelPredicateDecl__Group__0__Impl rule__NodeLabelPredicateDecl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__NodeLabelPredicateDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicateDecl__Group__1();

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
    // $ANTLR end "rule__NodeLabelPredicateDecl__Group__0"


    // $ANTLR start "rule__NodeLabelPredicateDecl__Group__0__Impl"
    // InternalFOTCTL.g:1906:1: rule__NodeLabelPredicateDecl__Group__0__Impl : ( () ) ;
    public final void rule__NodeLabelPredicateDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1910:1: ( ( () ) )
            // InternalFOTCTL.g:1911:1: ( () )
            {
            // InternalFOTCTL.g:1911:1: ( () )
            // InternalFOTCTL.g:1912:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateDeclAccess().getNodeLabelPredicateDeclAction_0()); 
            }
            // InternalFOTCTL.g:1913:1: ()
            // InternalFOTCTL.g:1915:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateDeclAccess().getNodeLabelPredicateDeclAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeLabelPredicateDecl__Group__0__Impl"


    // $ANTLR start "rule__NodeLabelPredicateDecl__Group__1"
    // InternalFOTCTL.g:1925:1: rule__NodeLabelPredicateDecl__Group__1 : rule__NodeLabelPredicateDecl__Group__1__Impl ;
    public final void rule__NodeLabelPredicateDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1929:1: ( rule__NodeLabelPredicateDecl__Group__1__Impl )
            // InternalFOTCTL.g:1930:2: rule__NodeLabelPredicateDecl__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicateDecl__Group__1__Impl();

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
    // $ANTLR end "rule__NodeLabelPredicateDecl__Group__1"


    // $ANTLR start "rule__NodeLabelPredicateDecl__Group__1__Impl"
    // InternalFOTCTL.g:1936:1: rule__NodeLabelPredicateDecl__Group__1__Impl : ( ( rule__NodeLabelPredicateDecl__NameAssignment_1 ) ) ;
    public final void rule__NodeLabelPredicateDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1940:1: ( ( ( rule__NodeLabelPredicateDecl__NameAssignment_1 ) ) )
            // InternalFOTCTL.g:1941:1: ( ( rule__NodeLabelPredicateDecl__NameAssignment_1 ) )
            {
            // InternalFOTCTL.g:1941:1: ( ( rule__NodeLabelPredicateDecl__NameAssignment_1 ) )
            // InternalFOTCTL.g:1942:1: ( rule__NodeLabelPredicateDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateDeclAccess().getNameAssignment_1()); 
            }
            // InternalFOTCTL.g:1943:1: ( rule__NodeLabelPredicateDecl__NameAssignment_1 )
            // InternalFOTCTL.g:1943:2: rule__NodeLabelPredicateDecl__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicateDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateDeclAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__NodeLabelPredicateDecl__Group__1__Impl"


    // $ANTLR start "rule__EdgeLabelPredicateDecl__Group__0"
    // InternalFOTCTL.g:1957:1: rule__EdgeLabelPredicateDecl__Group__0 : rule__EdgeLabelPredicateDecl__Group__0__Impl rule__EdgeLabelPredicateDecl__Group__1 ;
    public final void rule__EdgeLabelPredicateDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1961:1: ( rule__EdgeLabelPredicateDecl__Group__0__Impl rule__EdgeLabelPredicateDecl__Group__1 )
            // InternalFOTCTL.g:1962:2: rule__EdgeLabelPredicateDecl__Group__0__Impl rule__EdgeLabelPredicateDecl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__EdgeLabelPredicateDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicateDecl__Group__1();

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
    // $ANTLR end "rule__EdgeLabelPredicateDecl__Group__0"


    // $ANTLR start "rule__EdgeLabelPredicateDecl__Group__0__Impl"
    // InternalFOTCTL.g:1969:1: rule__EdgeLabelPredicateDecl__Group__0__Impl : ( () ) ;
    public final void rule__EdgeLabelPredicateDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1973:1: ( ( () ) )
            // InternalFOTCTL.g:1974:1: ( () )
            {
            // InternalFOTCTL.g:1974:1: ( () )
            // InternalFOTCTL.g:1975:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateDeclAccess().getEdgeLabelPredicateDeclAction_0()); 
            }
            // InternalFOTCTL.g:1976:1: ()
            // InternalFOTCTL.g:1978:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateDeclAccess().getEdgeLabelPredicateDeclAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeLabelPredicateDecl__Group__0__Impl"


    // $ANTLR start "rule__EdgeLabelPredicateDecl__Group__1"
    // InternalFOTCTL.g:1988:1: rule__EdgeLabelPredicateDecl__Group__1 : rule__EdgeLabelPredicateDecl__Group__1__Impl ;
    public final void rule__EdgeLabelPredicateDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:1992:1: ( rule__EdgeLabelPredicateDecl__Group__1__Impl )
            // InternalFOTCTL.g:1993:2: rule__EdgeLabelPredicateDecl__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicateDecl__Group__1__Impl();

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
    // $ANTLR end "rule__EdgeLabelPredicateDecl__Group__1"


    // $ANTLR start "rule__EdgeLabelPredicateDecl__Group__1__Impl"
    // InternalFOTCTL.g:1999:1: rule__EdgeLabelPredicateDecl__Group__1__Impl : ( ( rule__EdgeLabelPredicateDecl__NameAssignment_1 ) ) ;
    public final void rule__EdgeLabelPredicateDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2003:1: ( ( ( rule__EdgeLabelPredicateDecl__NameAssignment_1 ) ) )
            // InternalFOTCTL.g:2004:1: ( ( rule__EdgeLabelPredicateDecl__NameAssignment_1 ) )
            {
            // InternalFOTCTL.g:2004:1: ( ( rule__EdgeLabelPredicateDecl__NameAssignment_1 ) )
            // InternalFOTCTL.g:2005:1: ( rule__EdgeLabelPredicateDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateDeclAccess().getNameAssignment_1()); 
            }
            // InternalFOTCTL.g:2006:1: ( rule__EdgeLabelPredicateDecl__NameAssignment_1 )
            // InternalFOTCTL.g:2006:2: rule__EdgeLabelPredicateDecl__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicateDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateDeclAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__EdgeLabelPredicateDecl__Group__1__Impl"


    // $ANTLR start "rule__ConstantSymbolDecl__Group__0"
    // InternalFOTCTL.g:2020:1: rule__ConstantSymbolDecl__Group__0 : rule__ConstantSymbolDecl__Group__0__Impl rule__ConstantSymbolDecl__Group__1 ;
    public final void rule__ConstantSymbolDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2024:1: ( rule__ConstantSymbolDecl__Group__0__Impl rule__ConstantSymbolDecl__Group__1 )
            // InternalFOTCTL.g:2025:2: rule__ConstantSymbolDecl__Group__0__Impl rule__ConstantSymbolDecl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__ConstantSymbolDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstantSymbolDecl__Group__1();

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
    // $ANTLR end "rule__ConstantSymbolDecl__Group__0"


    // $ANTLR start "rule__ConstantSymbolDecl__Group__0__Impl"
    // InternalFOTCTL.g:2032:1: rule__ConstantSymbolDecl__Group__0__Impl : ( () ) ;
    public final void rule__ConstantSymbolDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2036:1: ( ( () ) )
            // InternalFOTCTL.g:2037:1: ( () )
            {
            // InternalFOTCTL.g:2037:1: ( () )
            // InternalFOTCTL.g:2038:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantSymbolDeclAccess().getConstantSymbolDeclAction_0()); 
            }
            // InternalFOTCTL.g:2039:1: ()
            // InternalFOTCTL.g:2041:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantSymbolDeclAccess().getConstantSymbolDeclAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantSymbolDecl__Group__0__Impl"


    // $ANTLR start "rule__ConstantSymbolDecl__Group__1"
    // InternalFOTCTL.g:2051:1: rule__ConstantSymbolDecl__Group__1 : rule__ConstantSymbolDecl__Group__1__Impl ;
    public final void rule__ConstantSymbolDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2055:1: ( rule__ConstantSymbolDecl__Group__1__Impl )
            // InternalFOTCTL.g:2056:2: rule__ConstantSymbolDecl__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstantSymbolDecl__Group__1__Impl();

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
    // $ANTLR end "rule__ConstantSymbolDecl__Group__1"


    // $ANTLR start "rule__ConstantSymbolDecl__Group__1__Impl"
    // InternalFOTCTL.g:2062:1: rule__ConstantSymbolDecl__Group__1__Impl : ( ( rule__ConstantSymbolDecl__NameAssignment_1 ) ) ;
    public final void rule__ConstantSymbolDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2066:1: ( ( ( rule__ConstantSymbolDecl__NameAssignment_1 ) ) )
            // InternalFOTCTL.g:2067:1: ( ( rule__ConstantSymbolDecl__NameAssignment_1 ) )
            {
            // InternalFOTCTL.g:2067:1: ( ( rule__ConstantSymbolDecl__NameAssignment_1 ) )
            // InternalFOTCTL.g:2068:1: ( rule__ConstantSymbolDecl__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantSymbolDeclAccess().getNameAssignment_1()); 
            }
            // InternalFOTCTL.g:2069:1: ( rule__ConstantSymbolDecl__NameAssignment_1 )
            // InternalFOTCTL.g:2069:2: rule__ConstantSymbolDecl__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ConstantSymbolDecl__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantSymbolDeclAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ConstantSymbolDecl__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalFOTCTL.g:2083:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2087:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalFOTCTL.g:2088:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Constant__Group__1();

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
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalFOTCTL.g:2095:1: rule__Constant__Group__0__Impl : ( () ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2099:1: ( ( () ) )
            // InternalFOTCTL.g:2100:1: ( () )
            {
            // InternalFOTCTL.g:2100:1: ( () )
            // InternalFOTCTL.g:2101:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstantAction_0()); 
            }
            // InternalFOTCTL.g:2102:1: ()
            // InternalFOTCTL.g:2104:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getConstantAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalFOTCTL.g:2114:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2118:1: ( rule__Constant__Group__1__Impl )
            // InternalFOTCTL.g:2119:2: rule__Constant__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Constant__Group__1__Impl();

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
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalFOTCTL.g:2125:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__DeclarationAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2129:1: ( ( ( rule__Constant__DeclarationAssignment_1 ) ) )
            // InternalFOTCTL.g:2130:1: ( ( rule__Constant__DeclarationAssignment_1 ) )
            {
            // InternalFOTCTL.g:2130:1: ( ( rule__Constant__DeclarationAssignment_1 ) )
            // InternalFOTCTL.g:2131:1: ( rule__Constant__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getDeclarationAssignment_1()); 
            }
            // InternalFOTCTL.g:2132:1: ( rule__Constant__DeclarationAssignment_1 )
            // InternalFOTCTL.g:2132:2: rule__Constant__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Constant__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getDeclarationAssignment_1()); 
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
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalFOTCTL.g:2146:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2150:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalFOTCTL.g:2151:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Variable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalFOTCTL.g:2158:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2162:1: ( ( () ) )
            // InternalFOTCTL.g:2163:1: ( () )
            {
            // InternalFOTCTL.g:2163:1: ( () )
            // InternalFOTCTL.g:2164:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            }
            // InternalFOTCTL.g:2165:1: ()
            // InternalFOTCTL.g:2167:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalFOTCTL.g:2177:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2181:1: ( rule__Variable__Group__1__Impl )
            // InternalFOTCTL.g:2182:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalFOTCTL.g:2188:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__DeclarationAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2192:1: ( ( ( rule__Variable__DeclarationAssignment_1 ) ) )
            // InternalFOTCTL.g:2193:1: ( ( rule__Variable__DeclarationAssignment_1 ) )
            {
            // InternalFOTCTL.g:2193:1: ( ( rule__Variable__DeclarationAssignment_1 ) )
            // InternalFOTCTL.g:2194:1: ( rule__Variable__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationAssignment_1()); 
            }
            // InternalFOTCTL.g:2195:1: ( rule__Variable__DeclarationAssignment_1 )
            // InternalFOTCTL.g:2195:2: rule__Variable__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Variable__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getDeclarationAssignment_1()); 
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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__NodeLabelPredicate__Group__0"
    // InternalFOTCTL.g:2209:1: rule__NodeLabelPredicate__Group__0 : rule__NodeLabelPredicate__Group__0__Impl rule__NodeLabelPredicate__Group__1 ;
    public final void rule__NodeLabelPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2213:1: ( rule__NodeLabelPredicate__Group__0__Impl rule__NodeLabelPredicate__Group__1 )
            // InternalFOTCTL.g:2214:2: rule__NodeLabelPredicate__Group__0__Impl rule__NodeLabelPredicate__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__NodeLabelPredicate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicate__Group__1();

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
    // $ANTLR end "rule__NodeLabelPredicate__Group__0"


    // $ANTLR start "rule__NodeLabelPredicate__Group__0__Impl"
    // InternalFOTCTL.g:2221:1: rule__NodeLabelPredicate__Group__0__Impl : ( () ) ;
    public final void rule__NodeLabelPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2225:1: ( ( () ) )
            // InternalFOTCTL.g:2226:1: ( () )
            {
            // InternalFOTCTL.g:2226:1: ( () )
            // InternalFOTCTL.g:2227:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateAccess().getNodeLabelPredicateAction_0()); 
            }
            // InternalFOTCTL.g:2228:1: ()
            // InternalFOTCTL.g:2230:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateAccess().getNodeLabelPredicateAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeLabelPredicate__Group__0__Impl"


    // $ANTLR start "rule__NodeLabelPredicate__Group__1"
    // InternalFOTCTL.g:2240:1: rule__NodeLabelPredicate__Group__1 : rule__NodeLabelPredicate__Group__1__Impl rule__NodeLabelPredicate__Group__2 ;
    public final void rule__NodeLabelPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2244:1: ( rule__NodeLabelPredicate__Group__1__Impl rule__NodeLabelPredicate__Group__2 )
            // InternalFOTCTL.g:2245:2: rule__NodeLabelPredicate__Group__1__Impl rule__NodeLabelPredicate__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__NodeLabelPredicate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicate__Group__2();

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
    // $ANTLR end "rule__NodeLabelPredicate__Group__1"


    // $ANTLR start "rule__NodeLabelPredicate__Group__1__Impl"
    // InternalFOTCTL.g:2252:1: rule__NodeLabelPredicate__Group__1__Impl : ( ( rule__NodeLabelPredicate__DeclarationAssignment_1 ) ) ;
    public final void rule__NodeLabelPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2256:1: ( ( ( rule__NodeLabelPredicate__DeclarationAssignment_1 ) ) )
            // InternalFOTCTL.g:2257:1: ( ( rule__NodeLabelPredicate__DeclarationAssignment_1 ) )
            {
            // InternalFOTCTL.g:2257:1: ( ( rule__NodeLabelPredicate__DeclarationAssignment_1 ) )
            // InternalFOTCTL.g:2258:1: ( rule__NodeLabelPredicate__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateAccess().getDeclarationAssignment_1()); 
            }
            // InternalFOTCTL.g:2259:1: ( rule__NodeLabelPredicate__DeclarationAssignment_1 )
            // InternalFOTCTL.g:2259:2: rule__NodeLabelPredicate__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicate__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateAccess().getDeclarationAssignment_1()); 
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
    // $ANTLR end "rule__NodeLabelPredicate__Group__1__Impl"


    // $ANTLR start "rule__NodeLabelPredicate__Group__2"
    // InternalFOTCTL.g:2269:1: rule__NodeLabelPredicate__Group__2 : rule__NodeLabelPredicate__Group__2__Impl rule__NodeLabelPredicate__Group__3 ;
    public final void rule__NodeLabelPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2273:1: ( rule__NodeLabelPredicate__Group__2__Impl rule__NodeLabelPredicate__Group__3 )
            // InternalFOTCTL.g:2274:2: rule__NodeLabelPredicate__Group__2__Impl rule__NodeLabelPredicate__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__NodeLabelPredicate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicate__Group__3();

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
    // $ANTLR end "rule__NodeLabelPredicate__Group__2"


    // $ANTLR start "rule__NodeLabelPredicate__Group__2__Impl"
    // InternalFOTCTL.g:2281:1: rule__NodeLabelPredicate__Group__2__Impl : ( '(' ) ;
    public final void rule__NodeLabelPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2285:1: ( ( '(' ) )
            // InternalFOTCTL.g:2286:1: ( '(' )
            {
            // InternalFOTCTL.g:2286:1: ( '(' )
            // InternalFOTCTL.g:2287:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__NodeLabelPredicate__Group__2__Impl"


    // $ANTLR start "rule__NodeLabelPredicate__Group__3"
    // InternalFOTCTL.g:2300:1: rule__NodeLabelPredicate__Group__3 : rule__NodeLabelPredicate__Group__3__Impl rule__NodeLabelPredicate__Group__4 ;
    public final void rule__NodeLabelPredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2304:1: ( rule__NodeLabelPredicate__Group__3__Impl rule__NodeLabelPredicate__Group__4 )
            // InternalFOTCTL.g:2305:2: rule__NodeLabelPredicate__Group__3__Impl rule__NodeLabelPredicate__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__NodeLabelPredicate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicate__Group__4();

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
    // $ANTLR end "rule__NodeLabelPredicate__Group__3"


    // $ANTLR start "rule__NodeLabelPredicate__Group__3__Impl"
    // InternalFOTCTL.g:2312:1: rule__NodeLabelPredicate__Group__3__Impl : ( ( rule__NodeLabelPredicate__TermAssignment_3 ) ) ;
    public final void rule__NodeLabelPredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2316:1: ( ( ( rule__NodeLabelPredicate__TermAssignment_3 ) ) )
            // InternalFOTCTL.g:2317:1: ( ( rule__NodeLabelPredicate__TermAssignment_3 ) )
            {
            // InternalFOTCTL.g:2317:1: ( ( rule__NodeLabelPredicate__TermAssignment_3 ) )
            // InternalFOTCTL.g:2318:1: ( rule__NodeLabelPredicate__TermAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateAccess().getTermAssignment_3()); 
            }
            // InternalFOTCTL.g:2319:1: ( rule__NodeLabelPredicate__TermAssignment_3 )
            // InternalFOTCTL.g:2319:2: rule__NodeLabelPredicate__TermAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicate__TermAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateAccess().getTermAssignment_3()); 
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
    // $ANTLR end "rule__NodeLabelPredicate__Group__3__Impl"


    // $ANTLR start "rule__NodeLabelPredicate__Group__4"
    // InternalFOTCTL.g:2329:1: rule__NodeLabelPredicate__Group__4 : rule__NodeLabelPredicate__Group__4__Impl ;
    public final void rule__NodeLabelPredicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2333:1: ( rule__NodeLabelPredicate__Group__4__Impl )
            // InternalFOTCTL.g:2334:2: rule__NodeLabelPredicate__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeLabelPredicate__Group__4__Impl();

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
    // $ANTLR end "rule__NodeLabelPredicate__Group__4"


    // $ANTLR start "rule__NodeLabelPredicate__Group__4__Impl"
    // InternalFOTCTL.g:2340:1: rule__NodeLabelPredicate__Group__4__Impl : ( ')' ) ;
    public final void rule__NodeLabelPredicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2344:1: ( ( ')' ) )
            // InternalFOTCTL.g:2345:1: ( ')' )
            {
            // InternalFOTCTL.g:2345:1: ( ')' )
            // InternalFOTCTL.g:2346:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__NodeLabelPredicate__Group__4__Impl"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__0"
    // InternalFOTCTL.g:2369:1: rule__EdgeLabelPredicate__Group__0 : rule__EdgeLabelPredicate__Group__0__Impl rule__EdgeLabelPredicate__Group__1 ;
    public final void rule__EdgeLabelPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2373:1: ( rule__EdgeLabelPredicate__Group__0__Impl rule__EdgeLabelPredicate__Group__1 )
            // InternalFOTCTL.g:2374:2: rule__EdgeLabelPredicate__Group__0__Impl rule__EdgeLabelPredicate__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__EdgeLabelPredicate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__Group__1();

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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__0"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__0__Impl"
    // InternalFOTCTL.g:2381:1: rule__EdgeLabelPredicate__Group__0__Impl : ( () ) ;
    public final void rule__EdgeLabelPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2385:1: ( ( () ) )
            // InternalFOTCTL.g:2386:1: ( () )
            {
            // InternalFOTCTL.g:2386:1: ( () )
            // InternalFOTCTL.g:2387:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getEdgeLabelPredicateAction_0()); 
            }
            // InternalFOTCTL.g:2388:1: ()
            // InternalFOTCTL.g:2390:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getEdgeLabelPredicateAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeLabelPredicate__Group__0__Impl"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__1"
    // InternalFOTCTL.g:2400:1: rule__EdgeLabelPredicate__Group__1 : rule__EdgeLabelPredicate__Group__1__Impl rule__EdgeLabelPredicate__Group__2 ;
    public final void rule__EdgeLabelPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2404:1: ( rule__EdgeLabelPredicate__Group__1__Impl rule__EdgeLabelPredicate__Group__2 )
            // InternalFOTCTL.g:2405:2: rule__EdgeLabelPredicate__Group__1__Impl rule__EdgeLabelPredicate__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__EdgeLabelPredicate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__Group__2();

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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__1"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__1__Impl"
    // InternalFOTCTL.g:2412:1: rule__EdgeLabelPredicate__Group__1__Impl : ( ( rule__EdgeLabelPredicate__DeclarationAssignment_1 ) ) ;
    public final void rule__EdgeLabelPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2416:1: ( ( ( rule__EdgeLabelPredicate__DeclarationAssignment_1 ) ) )
            // InternalFOTCTL.g:2417:1: ( ( rule__EdgeLabelPredicate__DeclarationAssignment_1 ) )
            {
            // InternalFOTCTL.g:2417:1: ( ( rule__EdgeLabelPredicate__DeclarationAssignment_1 ) )
            // InternalFOTCTL.g:2418:1: ( rule__EdgeLabelPredicate__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getDeclarationAssignment_1()); 
            }
            // InternalFOTCTL.g:2419:1: ( rule__EdgeLabelPredicate__DeclarationAssignment_1 )
            // InternalFOTCTL.g:2419:2: rule__EdgeLabelPredicate__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getDeclarationAssignment_1()); 
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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__1__Impl"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__2"
    // InternalFOTCTL.g:2429:1: rule__EdgeLabelPredicate__Group__2 : rule__EdgeLabelPredicate__Group__2__Impl rule__EdgeLabelPredicate__Group__3 ;
    public final void rule__EdgeLabelPredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2433:1: ( rule__EdgeLabelPredicate__Group__2__Impl rule__EdgeLabelPredicate__Group__3 )
            // InternalFOTCTL.g:2434:2: rule__EdgeLabelPredicate__Group__2__Impl rule__EdgeLabelPredicate__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EdgeLabelPredicate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__Group__3();

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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__2"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__2__Impl"
    // InternalFOTCTL.g:2441:1: rule__EdgeLabelPredicate__Group__2__Impl : ( '(' ) ;
    public final void rule__EdgeLabelPredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2445:1: ( ( '(' ) )
            // InternalFOTCTL.g:2446:1: ( '(' )
            {
            // InternalFOTCTL.g:2446:1: ( '(' )
            // InternalFOTCTL.g:2447:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__2__Impl"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__3"
    // InternalFOTCTL.g:2460:1: rule__EdgeLabelPredicate__Group__3 : rule__EdgeLabelPredicate__Group__3__Impl rule__EdgeLabelPredicate__Group__4 ;
    public final void rule__EdgeLabelPredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2464:1: ( rule__EdgeLabelPredicate__Group__3__Impl rule__EdgeLabelPredicate__Group__4 )
            // InternalFOTCTL.g:2465:2: rule__EdgeLabelPredicate__Group__3__Impl rule__EdgeLabelPredicate__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__EdgeLabelPredicate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__Group__4();

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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__3"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__3__Impl"
    // InternalFOTCTL.g:2472:1: rule__EdgeLabelPredicate__Group__3__Impl : ( ( rule__EdgeLabelPredicate__TermAssignment_3 ) ) ;
    public final void rule__EdgeLabelPredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2476:1: ( ( ( rule__EdgeLabelPredicate__TermAssignment_3 ) ) )
            // InternalFOTCTL.g:2477:1: ( ( rule__EdgeLabelPredicate__TermAssignment_3 ) )
            {
            // InternalFOTCTL.g:2477:1: ( ( rule__EdgeLabelPredicate__TermAssignment_3 ) )
            // InternalFOTCTL.g:2478:1: ( rule__EdgeLabelPredicate__TermAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getTermAssignment_3()); 
            }
            // InternalFOTCTL.g:2479:1: ( rule__EdgeLabelPredicate__TermAssignment_3 )
            // InternalFOTCTL.g:2479:2: rule__EdgeLabelPredicate__TermAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__TermAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getTermAssignment_3()); 
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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__3__Impl"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__4"
    // InternalFOTCTL.g:2489:1: rule__EdgeLabelPredicate__Group__4 : rule__EdgeLabelPredicate__Group__4__Impl rule__EdgeLabelPredicate__Group__5 ;
    public final void rule__EdgeLabelPredicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2493:1: ( rule__EdgeLabelPredicate__Group__4__Impl rule__EdgeLabelPredicate__Group__5 )
            // InternalFOTCTL.g:2494:2: rule__EdgeLabelPredicate__Group__4__Impl rule__EdgeLabelPredicate__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EdgeLabelPredicate__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__Group__5();

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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__4"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__4__Impl"
    // InternalFOTCTL.g:2501:1: rule__EdgeLabelPredicate__Group__4__Impl : ( ',' ) ;
    public final void rule__EdgeLabelPredicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2505:1: ( ( ',' ) )
            // InternalFOTCTL.g:2506:1: ( ',' )
            {
            // InternalFOTCTL.g:2506:1: ( ',' )
            // InternalFOTCTL.g:2507:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getCommaKeyword_4()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getCommaKeyword_4()); 
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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__4__Impl"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__5"
    // InternalFOTCTL.g:2520:1: rule__EdgeLabelPredicate__Group__5 : rule__EdgeLabelPredicate__Group__5__Impl rule__EdgeLabelPredicate__Group__6 ;
    public final void rule__EdgeLabelPredicate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2524:1: ( rule__EdgeLabelPredicate__Group__5__Impl rule__EdgeLabelPredicate__Group__6 )
            // InternalFOTCTL.g:2525:2: rule__EdgeLabelPredicate__Group__5__Impl rule__EdgeLabelPredicate__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__EdgeLabelPredicate__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__Group__6();

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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__5"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__5__Impl"
    // InternalFOTCTL.g:2532:1: rule__EdgeLabelPredicate__Group__5__Impl : ( ( rule__EdgeLabelPredicate__SecondTermAssignment_5 ) ) ;
    public final void rule__EdgeLabelPredicate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2536:1: ( ( ( rule__EdgeLabelPredicate__SecondTermAssignment_5 ) ) )
            // InternalFOTCTL.g:2537:1: ( ( rule__EdgeLabelPredicate__SecondTermAssignment_5 ) )
            {
            // InternalFOTCTL.g:2537:1: ( ( rule__EdgeLabelPredicate__SecondTermAssignment_5 ) )
            // InternalFOTCTL.g:2538:1: ( rule__EdgeLabelPredicate__SecondTermAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getSecondTermAssignment_5()); 
            }
            // InternalFOTCTL.g:2539:1: ( rule__EdgeLabelPredicate__SecondTermAssignment_5 )
            // InternalFOTCTL.g:2539:2: rule__EdgeLabelPredicate__SecondTermAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__SecondTermAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getSecondTermAssignment_5()); 
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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__5__Impl"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__6"
    // InternalFOTCTL.g:2549:1: rule__EdgeLabelPredicate__Group__6 : rule__EdgeLabelPredicate__Group__6__Impl ;
    public final void rule__EdgeLabelPredicate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2553:1: ( rule__EdgeLabelPredicate__Group__6__Impl )
            // InternalFOTCTL.g:2554:2: rule__EdgeLabelPredicate__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EdgeLabelPredicate__Group__6__Impl();

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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__6"


    // $ANTLR start "rule__EdgeLabelPredicate__Group__6__Impl"
    // InternalFOTCTL.g:2560:1: rule__EdgeLabelPredicate__Group__6__Impl : ( ')' ) ;
    public final void rule__EdgeLabelPredicate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2564:1: ( ( ')' ) )
            // InternalFOTCTL.g:2565:1: ( ')' )
            {
            // InternalFOTCTL.g:2565:1: ( ')' )
            // InternalFOTCTL.g:2566:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getRightParenthesisKeyword_6()); 
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
    // $ANTLR end "rule__EdgeLabelPredicate__Group__6__Impl"


    // $ANTLR start "rule__QuantifiedFormula__Group__0"
    // InternalFOTCTL.g:2593:1: rule__QuantifiedFormula__Group__0 : rule__QuantifiedFormula__Group__0__Impl rule__QuantifiedFormula__Group__1 ;
    public final void rule__QuantifiedFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2597:1: ( rule__QuantifiedFormula__Group__0__Impl rule__QuantifiedFormula__Group__1 )
            // InternalFOTCTL.g:2598:2: rule__QuantifiedFormula__Group__0__Impl rule__QuantifiedFormula__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__QuantifiedFormula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__Group__1();

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
    // $ANTLR end "rule__QuantifiedFormula__Group__0"


    // $ANTLR start "rule__QuantifiedFormula__Group__0__Impl"
    // InternalFOTCTL.g:2605:1: rule__QuantifiedFormula__Group__0__Impl : ( () ) ;
    public final void rule__QuantifiedFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2609:1: ( ( () ) )
            // InternalFOTCTL.g:2610:1: ( () )
            {
            // InternalFOTCTL.g:2610:1: ( () )
            // InternalFOTCTL.g:2611:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getQuantifiedFormulaAction_0()); 
            }
            // InternalFOTCTL.g:2612:1: ()
            // InternalFOTCTL.g:2614:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getQuantifiedFormulaAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedFormula__Group__0__Impl"


    // $ANTLR start "rule__QuantifiedFormula__Group__1"
    // InternalFOTCTL.g:2624:1: rule__QuantifiedFormula__Group__1 : rule__QuantifiedFormula__Group__1__Impl rule__QuantifiedFormula__Group__2 ;
    public final void rule__QuantifiedFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2628:1: ( rule__QuantifiedFormula__Group__1__Impl rule__QuantifiedFormula__Group__2 )
            // InternalFOTCTL.g:2629:2: rule__QuantifiedFormula__Group__1__Impl rule__QuantifiedFormula__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__QuantifiedFormula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__Group__2();

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
    // $ANTLR end "rule__QuantifiedFormula__Group__1"


    // $ANTLR start "rule__QuantifiedFormula__Group__1__Impl"
    // InternalFOTCTL.g:2636:1: rule__QuantifiedFormula__Group__1__Impl : ( ( rule__QuantifiedFormula__QuantifierAssignment_1 ) ) ;
    public final void rule__QuantifiedFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2640:1: ( ( ( rule__QuantifiedFormula__QuantifierAssignment_1 ) ) )
            // InternalFOTCTL.g:2641:1: ( ( rule__QuantifiedFormula__QuantifierAssignment_1 ) )
            {
            // InternalFOTCTL.g:2641:1: ( ( rule__QuantifiedFormula__QuantifierAssignment_1 ) )
            // InternalFOTCTL.g:2642:1: ( rule__QuantifiedFormula__QuantifierAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getQuantifierAssignment_1()); 
            }
            // InternalFOTCTL.g:2643:1: ( rule__QuantifiedFormula__QuantifierAssignment_1 )
            // InternalFOTCTL.g:2643:2: rule__QuantifiedFormula__QuantifierAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__QuantifierAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getQuantifierAssignment_1()); 
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
    // $ANTLR end "rule__QuantifiedFormula__Group__1__Impl"


    // $ANTLR start "rule__QuantifiedFormula__Group__2"
    // InternalFOTCTL.g:2653:1: rule__QuantifiedFormula__Group__2 : rule__QuantifiedFormula__Group__2__Impl rule__QuantifiedFormula__Group__3 ;
    public final void rule__QuantifiedFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2657:1: ( rule__QuantifiedFormula__Group__2__Impl rule__QuantifiedFormula__Group__3 )
            // InternalFOTCTL.g:2658:2: rule__QuantifiedFormula__Group__2__Impl rule__QuantifiedFormula__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__QuantifiedFormula__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__Group__3();

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
    // $ANTLR end "rule__QuantifiedFormula__Group__2"


    // $ANTLR start "rule__QuantifiedFormula__Group__2__Impl"
    // InternalFOTCTL.g:2665:1: rule__QuantifiedFormula__Group__2__Impl : ( ' ' ) ;
    public final void rule__QuantifiedFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2669:1: ( ( ' ' ) )
            // InternalFOTCTL.g:2670:1: ( ' ' )
            {
            // InternalFOTCTL.g:2670:1: ( ' ' )
            // InternalFOTCTL.g:2671:1: ' '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getSpaceKeyword_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getSpaceKeyword_2()); 
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
    // $ANTLR end "rule__QuantifiedFormula__Group__2__Impl"


    // $ANTLR start "rule__QuantifiedFormula__Group__3"
    // InternalFOTCTL.g:2684:1: rule__QuantifiedFormula__Group__3 : rule__QuantifiedFormula__Group__3__Impl rule__QuantifiedFormula__Group__4 ;
    public final void rule__QuantifiedFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2688:1: ( rule__QuantifiedFormula__Group__3__Impl rule__QuantifiedFormula__Group__4 )
            // InternalFOTCTL.g:2689:2: rule__QuantifiedFormula__Group__3__Impl rule__QuantifiedFormula__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__QuantifiedFormula__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__Group__4();

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
    // $ANTLR end "rule__QuantifiedFormula__Group__3"


    // $ANTLR start "rule__QuantifiedFormula__Group__3__Impl"
    // InternalFOTCTL.g:2696:1: rule__QuantifiedFormula__Group__3__Impl : ( ( rule__QuantifiedFormula__NameAssignment_3 ) ) ;
    public final void rule__QuantifiedFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2700:1: ( ( ( rule__QuantifiedFormula__NameAssignment_3 ) ) )
            // InternalFOTCTL.g:2701:1: ( ( rule__QuantifiedFormula__NameAssignment_3 ) )
            {
            // InternalFOTCTL.g:2701:1: ( ( rule__QuantifiedFormula__NameAssignment_3 ) )
            // InternalFOTCTL.g:2702:1: ( rule__QuantifiedFormula__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getNameAssignment_3()); 
            }
            // InternalFOTCTL.g:2703:1: ( rule__QuantifiedFormula__NameAssignment_3 )
            // InternalFOTCTL.g:2703:2: rule__QuantifiedFormula__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getNameAssignment_3()); 
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
    // $ANTLR end "rule__QuantifiedFormula__Group__3__Impl"


    // $ANTLR start "rule__QuantifiedFormula__Group__4"
    // InternalFOTCTL.g:2713:1: rule__QuantifiedFormula__Group__4 : rule__QuantifiedFormula__Group__4__Impl rule__QuantifiedFormula__Group__5 ;
    public final void rule__QuantifiedFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2717:1: ( rule__QuantifiedFormula__Group__4__Impl rule__QuantifiedFormula__Group__5 )
            // InternalFOTCTL.g:2718:2: rule__QuantifiedFormula__Group__4__Impl rule__QuantifiedFormula__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__QuantifiedFormula__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__Group__5();

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
    // $ANTLR end "rule__QuantifiedFormula__Group__4"


    // $ANTLR start "rule__QuantifiedFormula__Group__4__Impl"
    // InternalFOTCTL.g:2725:1: rule__QuantifiedFormula__Group__4__Impl : ( ' ' ) ;
    public final void rule__QuantifiedFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2729:1: ( ( ' ' ) )
            // InternalFOTCTL.g:2730:1: ( ' ' )
            {
            // InternalFOTCTL.g:2730:1: ( ' ' )
            // InternalFOTCTL.g:2731:1: ' '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getSpaceKeyword_4()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getSpaceKeyword_4()); 
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
    // $ANTLR end "rule__QuantifiedFormula__Group__4__Impl"


    // $ANTLR start "rule__QuantifiedFormula__Group__5"
    // InternalFOTCTL.g:2744:1: rule__QuantifiedFormula__Group__5 : rule__QuantifiedFormula__Group__5__Impl ;
    public final void rule__QuantifiedFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2748:1: ( rule__QuantifiedFormula__Group__5__Impl )
            // InternalFOTCTL.g:2749:2: rule__QuantifiedFormula__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__Group__5__Impl();

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
    // $ANTLR end "rule__QuantifiedFormula__Group__5"


    // $ANTLR start "rule__QuantifiedFormula__Group__5__Impl"
    // InternalFOTCTL.g:2755:1: rule__QuantifiedFormula__Group__5__Impl : ( ( rule__QuantifiedFormula__SubformulaAssignment_5 ) ) ;
    public final void rule__QuantifiedFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2759:1: ( ( ( rule__QuantifiedFormula__SubformulaAssignment_5 ) ) )
            // InternalFOTCTL.g:2760:1: ( ( rule__QuantifiedFormula__SubformulaAssignment_5 ) )
            {
            // InternalFOTCTL.g:2760:1: ( ( rule__QuantifiedFormula__SubformulaAssignment_5 ) )
            // InternalFOTCTL.g:2761:1: ( rule__QuantifiedFormula__SubformulaAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getSubformulaAssignment_5()); 
            }
            // InternalFOTCTL.g:2762:1: ( rule__QuantifiedFormula__SubformulaAssignment_5 )
            // InternalFOTCTL.g:2762:2: rule__QuantifiedFormula__SubformulaAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuantifiedFormula__SubformulaAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getSubformulaAssignment_5()); 
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
    // $ANTLR end "rule__QuantifiedFormula__Group__5__Impl"


    // $ANTLR start "rule__NotFormula__Group__0"
    // InternalFOTCTL.g:2785:1: rule__NotFormula__Group__0 : rule__NotFormula__Group__0__Impl rule__NotFormula__Group__1 ;
    public final void rule__NotFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2789:1: ( rule__NotFormula__Group__0__Impl rule__NotFormula__Group__1 )
            // InternalFOTCTL.g:2790:2: rule__NotFormula__Group__0__Impl rule__NotFormula__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__NotFormula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotFormula__Group__1();

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
    // $ANTLR end "rule__NotFormula__Group__0"


    // $ANTLR start "rule__NotFormula__Group__0__Impl"
    // InternalFOTCTL.g:2797:1: rule__NotFormula__Group__0__Impl : ( 'NOT ' ) ;
    public final void rule__NotFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2801:1: ( ( 'NOT ' ) )
            // InternalFOTCTL.g:2802:1: ( 'NOT ' )
            {
            // InternalFOTCTL.g:2802:1: ( 'NOT ' )
            // InternalFOTCTL.g:2803:1: 'NOT '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFormulaAccess().getNOTKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFormulaAccess().getNOTKeyword_0()); 
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
    // $ANTLR end "rule__NotFormula__Group__0__Impl"


    // $ANTLR start "rule__NotFormula__Group__1"
    // InternalFOTCTL.g:2816:1: rule__NotFormula__Group__1 : rule__NotFormula__Group__1__Impl rule__NotFormula__Group__2 ;
    public final void rule__NotFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2820:1: ( rule__NotFormula__Group__1__Impl rule__NotFormula__Group__2 )
            // InternalFOTCTL.g:2821:2: rule__NotFormula__Group__1__Impl rule__NotFormula__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__NotFormula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotFormula__Group__2();

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
    // $ANTLR end "rule__NotFormula__Group__1"


    // $ANTLR start "rule__NotFormula__Group__1__Impl"
    // InternalFOTCTL.g:2828:1: rule__NotFormula__Group__1__Impl : ( () ) ;
    public final void rule__NotFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2832:1: ( ( () ) )
            // InternalFOTCTL.g:2833:1: ( () )
            {
            // InternalFOTCTL.g:2833:1: ( () )
            // InternalFOTCTL.g:2834:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFormulaAccess().getNotFormulaAction_1()); 
            }
            // InternalFOTCTL.g:2835:1: ()
            // InternalFOTCTL.g:2837:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFormulaAccess().getNotFormulaAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotFormula__Group__1__Impl"


    // $ANTLR start "rule__NotFormula__Group__2"
    // InternalFOTCTL.g:2847:1: rule__NotFormula__Group__2 : rule__NotFormula__Group__2__Impl ;
    public final void rule__NotFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2851:1: ( rule__NotFormula__Group__2__Impl )
            // InternalFOTCTL.g:2852:2: rule__NotFormula__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotFormula__Group__2__Impl();

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
    // $ANTLR end "rule__NotFormula__Group__2"


    // $ANTLR start "rule__NotFormula__Group__2__Impl"
    // InternalFOTCTL.g:2858:1: rule__NotFormula__Group__2__Impl : ( ( rule__NotFormula__SubformulaAssignment_2 ) ) ;
    public final void rule__NotFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2862:1: ( ( ( rule__NotFormula__SubformulaAssignment_2 ) ) )
            // InternalFOTCTL.g:2863:1: ( ( rule__NotFormula__SubformulaAssignment_2 ) )
            {
            // InternalFOTCTL.g:2863:1: ( ( rule__NotFormula__SubformulaAssignment_2 ) )
            // InternalFOTCTL.g:2864:1: ( rule__NotFormula__SubformulaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFormulaAccess().getSubformulaAssignment_2()); 
            }
            // InternalFOTCTL.g:2865:1: ( rule__NotFormula__SubformulaAssignment_2 )
            // InternalFOTCTL.g:2865:2: rule__NotFormula__SubformulaAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NotFormula__SubformulaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFormulaAccess().getSubformulaAssignment_2()); 
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
    // $ANTLR end "rule__NotFormula__Group__2__Impl"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__0"
    // InternalFOTCTL.g:2881:1: rule__UnaryTemporalFormula__Group__0 : rule__UnaryTemporalFormula__Group__0__Impl rule__UnaryTemporalFormula__Group__1 ;
    public final void rule__UnaryTemporalFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2885:1: ( rule__UnaryTemporalFormula__Group__0__Impl rule__UnaryTemporalFormula__Group__1 )
            // InternalFOTCTL.g:2886:2: rule__UnaryTemporalFormula__Group__0__Impl rule__UnaryTemporalFormula__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__UnaryTemporalFormula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__Group__1();

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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__0"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__0__Impl"
    // InternalFOTCTL.g:2893:1: rule__UnaryTemporalFormula__Group__0__Impl : ( () ) ;
    public final void rule__UnaryTemporalFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2897:1: ( ( () ) )
            // InternalFOTCTL.g:2898:1: ( () )
            {
            // InternalFOTCTL.g:2898:1: ( () )
            // InternalFOTCTL.g:2899:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getUnaryTemporalFormulaAction_0()); 
            }
            // InternalFOTCTL.g:2900:1: ()
            // InternalFOTCTL.g:2902:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getUnaryTemporalFormulaAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryTemporalFormula__Group__0__Impl"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__1"
    // InternalFOTCTL.g:2912:1: rule__UnaryTemporalFormula__Group__1 : rule__UnaryTemporalFormula__Group__1__Impl rule__UnaryTemporalFormula__Group__2 ;
    public final void rule__UnaryTemporalFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2916:1: ( rule__UnaryTemporalFormula__Group__1__Impl rule__UnaryTemporalFormula__Group__2 )
            // InternalFOTCTL.g:2917:2: rule__UnaryTemporalFormula__Group__1__Impl rule__UnaryTemporalFormula__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__UnaryTemporalFormula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__Group__2();

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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__1"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__1__Impl"
    // InternalFOTCTL.g:2924:1: rule__UnaryTemporalFormula__Group__1__Impl : ( ( rule__UnaryTemporalFormula__TemporalOperatorAssignment_1 ) ) ;
    public final void rule__UnaryTemporalFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2928:1: ( ( ( rule__UnaryTemporalFormula__TemporalOperatorAssignment_1 ) ) )
            // InternalFOTCTL.g:2929:1: ( ( rule__UnaryTemporalFormula__TemporalOperatorAssignment_1 ) )
            {
            // InternalFOTCTL.g:2929:1: ( ( rule__UnaryTemporalFormula__TemporalOperatorAssignment_1 ) )
            // InternalFOTCTL.g:2930:1: ( rule__UnaryTemporalFormula__TemporalOperatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getTemporalOperatorAssignment_1()); 
            }
            // InternalFOTCTL.g:2931:1: ( rule__UnaryTemporalFormula__TemporalOperatorAssignment_1 )
            // InternalFOTCTL.g:2931:2: rule__UnaryTemporalFormula__TemporalOperatorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__TemporalOperatorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getTemporalOperatorAssignment_1()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__1__Impl"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__2"
    // InternalFOTCTL.g:2941:1: rule__UnaryTemporalFormula__Group__2 : rule__UnaryTemporalFormula__Group__2__Impl rule__UnaryTemporalFormula__Group__3 ;
    public final void rule__UnaryTemporalFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2945:1: ( rule__UnaryTemporalFormula__Group__2__Impl rule__UnaryTemporalFormula__Group__3 )
            // InternalFOTCTL.g:2946:2: rule__UnaryTemporalFormula__Group__2__Impl rule__UnaryTemporalFormula__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__UnaryTemporalFormula__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__Group__3();

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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__2"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__2__Impl"
    // InternalFOTCTL.g:2953:1: rule__UnaryTemporalFormula__Group__2__Impl : ( '[' ) ;
    public final void rule__UnaryTemporalFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2957:1: ( ( '[' ) )
            // InternalFOTCTL.g:2958:1: ( '[' )
            {
            // InternalFOTCTL.g:2958:1: ( '[' )
            // InternalFOTCTL.g:2959:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getLeftSquareBracketKeyword_2()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__2__Impl"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__3"
    // InternalFOTCTL.g:2972:1: rule__UnaryTemporalFormula__Group__3 : rule__UnaryTemporalFormula__Group__3__Impl rule__UnaryTemporalFormula__Group__4 ;
    public final void rule__UnaryTemporalFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2976:1: ( rule__UnaryTemporalFormula__Group__3__Impl rule__UnaryTemporalFormula__Group__4 )
            // InternalFOTCTL.g:2977:2: rule__UnaryTemporalFormula__Group__3__Impl rule__UnaryTemporalFormula__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__UnaryTemporalFormula__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__Group__4();

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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__3"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__3__Impl"
    // InternalFOTCTL.g:2984:1: rule__UnaryTemporalFormula__Group__3__Impl : ( ( rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3 ) ) ;
    public final void rule__UnaryTemporalFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:2988:1: ( ( ( rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3 ) ) )
            // InternalFOTCTL.g:2989:1: ( ( rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3 ) )
            {
            // InternalFOTCTL.g:2989:1: ( ( rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3 ) )
            // InternalFOTCTL.g:2990:1: ( rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getComparisonOperatorAssignment_3()); 
            }
            // InternalFOTCTL.g:2991:1: ( rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3 )
            // InternalFOTCTL.g:2991:2: rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getComparisonOperatorAssignment_3()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__3__Impl"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__4"
    // InternalFOTCTL.g:3001:1: rule__UnaryTemporalFormula__Group__4 : rule__UnaryTemporalFormula__Group__4__Impl rule__UnaryTemporalFormula__Group__5 ;
    public final void rule__UnaryTemporalFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3005:1: ( rule__UnaryTemporalFormula__Group__4__Impl rule__UnaryTemporalFormula__Group__5 )
            // InternalFOTCTL.g:3006:2: rule__UnaryTemporalFormula__Group__4__Impl rule__UnaryTemporalFormula__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__UnaryTemporalFormula__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__Group__5();

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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__4"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__4__Impl"
    // InternalFOTCTL.g:3013:1: rule__UnaryTemporalFormula__Group__4__Impl : ( ( rule__UnaryTemporalFormula__ValueAssignment_4 ) ) ;
    public final void rule__UnaryTemporalFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3017:1: ( ( ( rule__UnaryTemporalFormula__ValueAssignment_4 ) ) )
            // InternalFOTCTL.g:3018:1: ( ( rule__UnaryTemporalFormula__ValueAssignment_4 ) )
            {
            // InternalFOTCTL.g:3018:1: ( ( rule__UnaryTemporalFormula__ValueAssignment_4 ) )
            // InternalFOTCTL.g:3019:1: ( rule__UnaryTemporalFormula__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getValueAssignment_4()); 
            }
            // InternalFOTCTL.g:3020:1: ( rule__UnaryTemporalFormula__ValueAssignment_4 )
            // InternalFOTCTL.g:3020:2: rule__UnaryTemporalFormula__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getValueAssignment_4()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__4__Impl"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__5"
    // InternalFOTCTL.g:3030:1: rule__UnaryTemporalFormula__Group__5 : rule__UnaryTemporalFormula__Group__5__Impl rule__UnaryTemporalFormula__Group__6 ;
    public final void rule__UnaryTemporalFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3034:1: ( rule__UnaryTemporalFormula__Group__5__Impl rule__UnaryTemporalFormula__Group__6 )
            // InternalFOTCTL.g:3035:2: rule__UnaryTemporalFormula__Group__5__Impl rule__UnaryTemporalFormula__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__UnaryTemporalFormula__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__Group__6();

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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__5"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__5__Impl"
    // InternalFOTCTL.g:3042:1: rule__UnaryTemporalFormula__Group__5__Impl : ( '] ' ) ;
    public final void rule__UnaryTemporalFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3046:1: ( ( '] ' ) )
            // InternalFOTCTL.g:3047:1: ( '] ' )
            {
            // InternalFOTCTL.g:3047:1: ( '] ' )
            // InternalFOTCTL.g:3048:1: '] '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getRightSquareBracketSpaceKeyword_5()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getRightSquareBracketSpaceKeyword_5()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__5__Impl"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__6"
    // InternalFOTCTL.g:3061:1: rule__UnaryTemporalFormula__Group__6 : rule__UnaryTemporalFormula__Group__6__Impl ;
    public final void rule__UnaryTemporalFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3065:1: ( rule__UnaryTemporalFormula__Group__6__Impl )
            // InternalFOTCTL.g:3066:2: rule__UnaryTemporalFormula__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__Group__6__Impl();

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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__6"


    // $ANTLR start "rule__UnaryTemporalFormula__Group__6__Impl"
    // InternalFOTCTL.g:3072:1: rule__UnaryTemporalFormula__Group__6__Impl : ( ( rule__UnaryTemporalFormula__SubformulaAssignment_6 ) ) ;
    public final void rule__UnaryTemporalFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3076:1: ( ( ( rule__UnaryTemporalFormula__SubformulaAssignment_6 ) ) )
            // InternalFOTCTL.g:3077:1: ( ( rule__UnaryTemporalFormula__SubformulaAssignment_6 ) )
            {
            // InternalFOTCTL.g:3077:1: ( ( rule__UnaryTemporalFormula__SubformulaAssignment_6 ) )
            // InternalFOTCTL.g:3078:1: ( rule__UnaryTemporalFormula__SubformulaAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getSubformulaAssignment_6()); 
            }
            // InternalFOTCTL.g:3079:1: ( rule__UnaryTemporalFormula__SubformulaAssignment_6 )
            // InternalFOTCTL.g:3079:2: rule__UnaryTemporalFormula__SubformulaAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryTemporalFormula__SubformulaAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getSubformulaAssignment_6()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__Group__6__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__0"
    // InternalFOTCTL.g:3103:1: rule__BinaryTemporalFormula__Group__0 : rule__BinaryTemporalFormula__Group__0__Impl rule__BinaryTemporalFormula__Group__1 ;
    public final void rule__BinaryTemporalFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3107:1: ( rule__BinaryTemporalFormula__Group__0__Impl rule__BinaryTemporalFormula__Group__1 )
            // InternalFOTCTL.g:3108:2: rule__BinaryTemporalFormula__Group__0__Impl rule__BinaryTemporalFormula__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__BinaryTemporalFormula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__1();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__0"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__0__Impl"
    // InternalFOTCTL.g:3115:1: rule__BinaryTemporalFormula__Group__0__Impl : ( () ) ;
    public final void rule__BinaryTemporalFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3119:1: ( ( () ) )
            // InternalFOTCTL.g:3120:1: ( () )
            {
            // InternalFOTCTL.g:3120:1: ( () )
            // InternalFOTCTL.g:3121:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getBinaryTemporalFormulaAction_0()); 
            }
            // InternalFOTCTL.g:3122:1: ()
            // InternalFOTCTL.g:3124:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getBinaryTemporalFormulaAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryTemporalFormula__Group__0__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__1"
    // InternalFOTCTL.g:3134:1: rule__BinaryTemporalFormula__Group__1 : rule__BinaryTemporalFormula__Group__1__Impl rule__BinaryTemporalFormula__Group__2 ;
    public final void rule__BinaryTemporalFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3138:1: ( rule__BinaryTemporalFormula__Group__1__Impl rule__BinaryTemporalFormula__Group__2 )
            // InternalFOTCTL.g:3139:2: rule__BinaryTemporalFormula__Group__1__Impl rule__BinaryTemporalFormula__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__BinaryTemporalFormula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__2();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__1"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__1__Impl"
    // InternalFOTCTL.g:3146:1: rule__BinaryTemporalFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__BinaryTemporalFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3150:1: ( ( '(' ) )
            // InternalFOTCTL.g:3151:1: ( '(' )
            {
            // InternalFOTCTL.g:3151:1: ( '(' )
            // InternalFOTCTL.g:3152:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__1__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__2"
    // InternalFOTCTL.g:3165:1: rule__BinaryTemporalFormula__Group__2 : rule__BinaryTemporalFormula__Group__2__Impl rule__BinaryTemporalFormula__Group__3 ;
    public final void rule__BinaryTemporalFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3169:1: ( rule__BinaryTemporalFormula__Group__2__Impl rule__BinaryTemporalFormula__Group__3 )
            // InternalFOTCTL.g:3170:2: rule__BinaryTemporalFormula__Group__2__Impl rule__BinaryTemporalFormula__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__BinaryTemporalFormula__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__3();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__2"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__2__Impl"
    // InternalFOTCTL.g:3177:1: rule__BinaryTemporalFormula__Group__2__Impl : ( ( rule__BinaryTemporalFormula__LeftSubformulaAssignment_2 ) ) ;
    public final void rule__BinaryTemporalFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3181:1: ( ( ( rule__BinaryTemporalFormula__LeftSubformulaAssignment_2 ) ) )
            // InternalFOTCTL.g:3182:1: ( ( rule__BinaryTemporalFormula__LeftSubformulaAssignment_2 ) )
            {
            // InternalFOTCTL.g:3182:1: ( ( rule__BinaryTemporalFormula__LeftSubformulaAssignment_2 ) )
            // InternalFOTCTL.g:3183:1: ( rule__BinaryTemporalFormula__LeftSubformulaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getLeftSubformulaAssignment_2()); 
            }
            // InternalFOTCTL.g:3184:1: ( rule__BinaryTemporalFormula__LeftSubformulaAssignment_2 )
            // InternalFOTCTL.g:3184:2: rule__BinaryTemporalFormula__LeftSubformulaAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__LeftSubformulaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getLeftSubformulaAssignment_2()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__2__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__3"
    // InternalFOTCTL.g:3194:1: rule__BinaryTemporalFormula__Group__3 : rule__BinaryTemporalFormula__Group__3__Impl rule__BinaryTemporalFormula__Group__4 ;
    public final void rule__BinaryTemporalFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3198:1: ( rule__BinaryTemporalFormula__Group__3__Impl rule__BinaryTemporalFormula__Group__4 )
            // InternalFOTCTL.g:3199:2: rule__BinaryTemporalFormula__Group__3__Impl rule__BinaryTemporalFormula__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__BinaryTemporalFormula__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__4();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__3"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__3__Impl"
    // InternalFOTCTL.g:3206:1: rule__BinaryTemporalFormula__Group__3__Impl : ( ' ' ) ;
    public final void rule__BinaryTemporalFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3210:1: ( ( ' ' ) )
            // InternalFOTCTL.g:3211:1: ( ' ' )
            {
            // InternalFOTCTL.g:3211:1: ( ' ' )
            // InternalFOTCTL.g:3212:1: ' '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getSpaceKeyword_3()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getSpaceKeyword_3()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__3__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__4"
    // InternalFOTCTL.g:3225:1: rule__BinaryTemporalFormula__Group__4 : rule__BinaryTemporalFormula__Group__4__Impl rule__BinaryTemporalFormula__Group__5 ;
    public final void rule__BinaryTemporalFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3229:1: ( rule__BinaryTemporalFormula__Group__4__Impl rule__BinaryTemporalFormula__Group__5 )
            // InternalFOTCTL.g:3230:2: rule__BinaryTemporalFormula__Group__4__Impl rule__BinaryTemporalFormula__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__BinaryTemporalFormula__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__5();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__4"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__4__Impl"
    // InternalFOTCTL.g:3237:1: rule__BinaryTemporalFormula__Group__4__Impl : ( ( rule__BinaryTemporalFormula__TemporalOperatorAssignment_4 ) ) ;
    public final void rule__BinaryTemporalFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3241:1: ( ( ( rule__BinaryTemporalFormula__TemporalOperatorAssignment_4 ) ) )
            // InternalFOTCTL.g:3242:1: ( ( rule__BinaryTemporalFormula__TemporalOperatorAssignment_4 ) )
            {
            // InternalFOTCTL.g:3242:1: ( ( rule__BinaryTemporalFormula__TemporalOperatorAssignment_4 ) )
            // InternalFOTCTL.g:3243:1: ( rule__BinaryTemporalFormula__TemporalOperatorAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getTemporalOperatorAssignment_4()); 
            }
            // InternalFOTCTL.g:3244:1: ( rule__BinaryTemporalFormula__TemporalOperatorAssignment_4 )
            // InternalFOTCTL.g:3244:2: rule__BinaryTemporalFormula__TemporalOperatorAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__TemporalOperatorAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getTemporalOperatorAssignment_4()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__4__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__5"
    // InternalFOTCTL.g:3254:1: rule__BinaryTemporalFormula__Group__5 : rule__BinaryTemporalFormula__Group__5__Impl rule__BinaryTemporalFormula__Group__6 ;
    public final void rule__BinaryTemporalFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3258:1: ( rule__BinaryTemporalFormula__Group__5__Impl rule__BinaryTemporalFormula__Group__6 )
            // InternalFOTCTL.g:3259:2: rule__BinaryTemporalFormula__Group__5__Impl rule__BinaryTemporalFormula__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__BinaryTemporalFormula__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__6();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__5"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__5__Impl"
    // InternalFOTCTL.g:3266:1: rule__BinaryTemporalFormula__Group__5__Impl : ( '[' ) ;
    public final void rule__BinaryTemporalFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3270:1: ( ( '[' ) )
            // InternalFOTCTL.g:3271:1: ( '[' )
            {
            // InternalFOTCTL.g:3271:1: ( '[' )
            // InternalFOTCTL.g:3272:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getLeftSquareBracketKeyword_5()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getLeftSquareBracketKeyword_5()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__5__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__6"
    // InternalFOTCTL.g:3285:1: rule__BinaryTemporalFormula__Group__6 : rule__BinaryTemporalFormula__Group__6__Impl rule__BinaryTemporalFormula__Group__7 ;
    public final void rule__BinaryTemporalFormula__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3289:1: ( rule__BinaryTemporalFormula__Group__6__Impl rule__BinaryTemporalFormula__Group__7 )
            // InternalFOTCTL.g:3290:2: rule__BinaryTemporalFormula__Group__6__Impl rule__BinaryTemporalFormula__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__BinaryTemporalFormula__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__7();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__6"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__6__Impl"
    // InternalFOTCTL.g:3297:1: rule__BinaryTemporalFormula__Group__6__Impl : ( ( rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6 ) ) ;
    public final void rule__BinaryTemporalFormula__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3301:1: ( ( ( rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6 ) ) )
            // InternalFOTCTL.g:3302:1: ( ( rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6 ) )
            {
            // InternalFOTCTL.g:3302:1: ( ( rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6 ) )
            // InternalFOTCTL.g:3303:1: ( rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getComparisonOperatorAssignment_6()); 
            }
            // InternalFOTCTL.g:3304:1: ( rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6 )
            // InternalFOTCTL.g:3304:2: rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getComparisonOperatorAssignment_6()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__6__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__7"
    // InternalFOTCTL.g:3314:1: rule__BinaryTemporalFormula__Group__7 : rule__BinaryTemporalFormula__Group__7__Impl rule__BinaryTemporalFormula__Group__8 ;
    public final void rule__BinaryTemporalFormula__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3318:1: ( rule__BinaryTemporalFormula__Group__7__Impl rule__BinaryTemporalFormula__Group__8 )
            // InternalFOTCTL.g:3319:2: rule__BinaryTemporalFormula__Group__7__Impl rule__BinaryTemporalFormula__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__BinaryTemporalFormula__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__8();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__7"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__7__Impl"
    // InternalFOTCTL.g:3326:1: rule__BinaryTemporalFormula__Group__7__Impl : ( ( rule__BinaryTemporalFormula__ValueAssignment_7 ) ) ;
    public final void rule__BinaryTemporalFormula__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3330:1: ( ( ( rule__BinaryTemporalFormula__ValueAssignment_7 ) ) )
            // InternalFOTCTL.g:3331:1: ( ( rule__BinaryTemporalFormula__ValueAssignment_7 ) )
            {
            // InternalFOTCTL.g:3331:1: ( ( rule__BinaryTemporalFormula__ValueAssignment_7 ) )
            // InternalFOTCTL.g:3332:1: ( rule__BinaryTemporalFormula__ValueAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getValueAssignment_7()); 
            }
            // InternalFOTCTL.g:3333:1: ( rule__BinaryTemporalFormula__ValueAssignment_7 )
            // InternalFOTCTL.g:3333:2: rule__BinaryTemporalFormula__ValueAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__ValueAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getValueAssignment_7()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__7__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__8"
    // InternalFOTCTL.g:3343:1: rule__BinaryTemporalFormula__Group__8 : rule__BinaryTemporalFormula__Group__8__Impl rule__BinaryTemporalFormula__Group__9 ;
    public final void rule__BinaryTemporalFormula__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3347:1: ( rule__BinaryTemporalFormula__Group__8__Impl rule__BinaryTemporalFormula__Group__9 )
            // InternalFOTCTL.g:3348:2: rule__BinaryTemporalFormula__Group__8__Impl rule__BinaryTemporalFormula__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__BinaryTemporalFormula__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__9();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__8"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__8__Impl"
    // InternalFOTCTL.g:3355:1: rule__BinaryTemporalFormula__Group__8__Impl : ( '] ' ) ;
    public final void rule__BinaryTemporalFormula__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3359:1: ( ( '] ' ) )
            // InternalFOTCTL.g:3360:1: ( '] ' )
            {
            // InternalFOTCTL.g:3360:1: ( '] ' )
            // InternalFOTCTL.g:3361:1: '] '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getRightSquareBracketSpaceKeyword_8()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getRightSquareBracketSpaceKeyword_8()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__8__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__9"
    // InternalFOTCTL.g:3374:1: rule__BinaryTemporalFormula__Group__9 : rule__BinaryTemporalFormula__Group__9__Impl rule__BinaryTemporalFormula__Group__10 ;
    public final void rule__BinaryTemporalFormula__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3378:1: ( rule__BinaryTemporalFormula__Group__9__Impl rule__BinaryTemporalFormula__Group__10 )
            // InternalFOTCTL.g:3379:2: rule__BinaryTemporalFormula__Group__9__Impl rule__BinaryTemporalFormula__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__BinaryTemporalFormula__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__10();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__9"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__9__Impl"
    // InternalFOTCTL.g:3386:1: rule__BinaryTemporalFormula__Group__9__Impl : ( ( rule__BinaryTemporalFormula__RightSubformulaAssignment_9 ) ) ;
    public final void rule__BinaryTemporalFormula__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3390:1: ( ( ( rule__BinaryTemporalFormula__RightSubformulaAssignment_9 ) ) )
            // InternalFOTCTL.g:3391:1: ( ( rule__BinaryTemporalFormula__RightSubformulaAssignment_9 ) )
            {
            // InternalFOTCTL.g:3391:1: ( ( rule__BinaryTemporalFormula__RightSubformulaAssignment_9 ) )
            // InternalFOTCTL.g:3392:1: ( rule__BinaryTemporalFormula__RightSubformulaAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getRightSubformulaAssignment_9()); 
            }
            // InternalFOTCTL.g:3393:1: ( rule__BinaryTemporalFormula__RightSubformulaAssignment_9 )
            // InternalFOTCTL.g:3393:2: rule__BinaryTemporalFormula__RightSubformulaAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__RightSubformulaAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getRightSubformulaAssignment_9()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__9__Impl"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__10"
    // InternalFOTCTL.g:3403:1: rule__BinaryTemporalFormula__Group__10 : rule__BinaryTemporalFormula__Group__10__Impl ;
    public final void rule__BinaryTemporalFormula__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3407:1: ( rule__BinaryTemporalFormula__Group__10__Impl )
            // InternalFOTCTL.g:3408:2: rule__BinaryTemporalFormula__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryTemporalFormula__Group__10__Impl();

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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__10"


    // $ANTLR start "rule__BinaryTemporalFormula__Group__10__Impl"
    // InternalFOTCTL.g:3414:1: rule__BinaryTemporalFormula__Group__10__Impl : ( ')' ) ;
    public final void rule__BinaryTemporalFormula__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3418:1: ( ( ')' ) )
            // InternalFOTCTL.g:3419:1: ( ')' )
            {
            // InternalFOTCTL.g:3419:1: ( ')' )
            // InternalFOTCTL.g:3420:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getRightParenthesisKeyword_10()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getRightParenthesisKeyword_10()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__Group__10__Impl"


    // $ANTLR start "rule__BinaryLogicFormula__Group__0"
    // InternalFOTCTL.g:3455:1: rule__BinaryLogicFormula__Group__0 : rule__BinaryLogicFormula__Group__0__Impl rule__BinaryLogicFormula__Group__1 ;
    public final void rule__BinaryLogicFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3459:1: ( rule__BinaryLogicFormula__Group__0__Impl rule__BinaryLogicFormula__Group__1 )
            // InternalFOTCTL.g:3460:2: rule__BinaryLogicFormula__Group__0__Impl rule__BinaryLogicFormula__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__BinaryLogicFormula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__Group__1();

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
    // $ANTLR end "rule__BinaryLogicFormula__Group__0"


    // $ANTLR start "rule__BinaryLogicFormula__Group__0__Impl"
    // InternalFOTCTL.g:3467:1: rule__BinaryLogicFormula__Group__0__Impl : ( () ) ;
    public final void rule__BinaryLogicFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3471:1: ( ( () ) )
            // InternalFOTCTL.g:3472:1: ( () )
            {
            // InternalFOTCTL.g:3472:1: ( () )
            // InternalFOTCTL.g:3473:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getBinaryLogicFormulaAction_0()); 
            }
            // InternalFOTCTL.g:3474:1: ()
            // InternalFOTCTL.g:3476:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getBinaryLogicFormulaAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryLogicFormula__Group__0__Impl"


    // $ANTLR start "rule__BinaryLogicFormula__Group__1"
    // InternalFOTCTL.g:3486:1: rule__BinaryLogicFormula__Group__1 : rule__BinaryLogicFormula__Group__1__Impl rule__BinaryLogicFormula__Group__2 ;
    public final void rule__BinaryLogicFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3490:1: ( rule__BinaryLogicFormula__Group__1__Impl rule__BinaryLogicFormula__Group__2 )
            // InternalFOTCTL.g:3491:2: rule__BinaryLogicFormula__Group__1__Impl rule__BinaryLogicFormula__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__BinaryLogicFormula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__Group__2();

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
    // $ANTLR end "rule__BinaryLogicFormula__Group__1"


    // $ANTLR start "rule__BinaryLogicFormula__Group__1__Impl"
    // InternalFOTCTL.g:3498:1: rule__BinaryLogicFormula__Group__1__Impl : ( '(' ) ;
    public final void rule__BinaryLogicFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3502:1: ( ( '(' ) )
            // InternalFOTCTL.g:3503:1: ( '(' )
            {
            // InternalFOTCTL.g:3503:1: ( '(' )
            // InternalFOTCTL.g:3504:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__BinaryLogicFormula__Group__1__Impl"


    // $ANTLR start "rule__BinaryLogicFormula__Group__2"
    // InternalFOTCTL.g:3517:1: rule__BinaryLogicFormula__Group__2 : rule__BinaryLogicFormula__Group__2__Impl rule__BinaryLogicFormula__Group__3 ;
    public final void rule__BinaryLogicFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3521:1: ( rule__BinaryLogicFormula__Group__2__Impl rule__BinaryLogicFormula__Group__3 )
            // InternalFOTCTL.g:3522:2: rule__BinaryLogicFormula__Group__2__Impl rule__BinaryLogicFormula__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__BinaryLogicFormula__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__Group__3();

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
    // $ANTLR end "rule__BinaryLogicFormula__Group__2"


    // $ANTLR start "rule__BinaryLogicFormula__Group__2__Impl"
    // InternalFOTCTL.g:3529:1: rule__BinaryLogicFormula__Group__2__Impl : ( ( rule__BinaryLogicFormula__LeftSubformulaAssignment_2 ) ) ;
    public final void rule__BinaryLogicFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3533:1: ( ( ( rule__BinaryLogicFormula__LeftSubformulaAssignment_2 ) ) )
            // InternalFOTCTL.g:3534:1: ( ( rule__BinaryLogicFormula__LeftSubformulaAssignment_2 ) )
            {
            // InternalFOTCTL.g:3534:1: ( ( rule__BinaryLogicFormula__LeftSubformulaAssignment_2 ) )
            // InternalFOTCTL.g:3535:1: ( rule__BinaryLogicFormula__LeftSubformulaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getLeftSubformulaAssignment_2()); 
            }
            // InternalFOTCTL.g:3536:1: ( rule__BinaryLogicFormula__LeftSubformulaAssignment_2 )
            // InternalFOTCTL.g:3536:2: rule__BinaryLogicFormula__LeftSubformulaAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__LeftSubformulaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getLeftSubformulaAssignment_2()); 
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
    // $ANTLR end "rule__BinaryLogicFormula__Group__2__Impl"


    // $ANTLR start "rule__BinaryLogicFormula__Group__3"
    // InternalFOTCTL.g:3546:1: rule__BinaryLogicFormula__Group__3 : rule__BinaryLogicFormula__Group__3__Impl rule__BinaryLogicFormula__Group__4 ;
    public final void rule__BinaryLogicFormula__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3550:1: ( rule__BinaryLogicFormula__Group__3__Impl rule__BinaryLogicFormula__Group__4 )
            // InternalFOTCTL.g:3551:2: rule__BinaryLogicFormula__Group__3__Impl rule__BinaryLogicFormula__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__BinaryLogicFormula__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__Group__4();

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
    // $ANTLR end "rule__BinaryLogicFormula__Group__3"


    // $ANTLR start "rule__BinaryLogicFormula__Group__3__Impl"
    // InternalFOTCTL.g:3558:1: rule__BinaryLogicFormula__Group__3__Impl : ( ( rule__BinaryLogicFormula__OperatorAssignment_3 ) ) ;
    public final void rule__BinaryLogicFormula__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3562:1: ( ( ( rule__BinaryLogicFormula__OperatorAssignment_3 ) ) )
            // InternalFOTCTL.g:3563:1: ( ( rule__BinaryLogicFormula__OperatorAssignment_3 ) )
            {
            // InternalFOTCTL.g:3563:1: ( ( rule__BinaryLogicFormula__OperatorAssignment_3 ) )
            // InternalFOTCTL.g:3564:1: ( rule__BinaryLogicFormula__OperatorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getOperatorAssignment_3()); 
            }
            // InternalFOTCTL.g:3565:1: ( rule__BinaryLogicFormula__OperatorAssignment_3 )
            // InternalFOTCTL.g:3565:2: rule__BinaryLogicFormula__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__OperatorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getOperatorAssignment_3()); 
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
    // $ANTLR end "rule__BinaryLogicFormula__Group__3__Impl"


    // $ANTLR start "rule__BinaryLogicFormula__Group__4"
    // InternalFOTCTL.g:3575:1: rule__BinaryLogicFormula__Group__4 : rule__BinaryLogicFormula__Group__4__Impl rule__BinaryLogicFormula__Group__5 ;
    public final void rule__BinaryLogicFormula__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3579:1: ( rule__BinaryLogicFormula__Group__4__Impl rule__BinaryLogicFormula__Group__5 )
            // InternalFOTCTL.g:3580:2: rule__BinaryLogicFormula__Group__4__Impl rule__BinaryLogicFormula__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__BinaryLogicFormula__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__Group__5();

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
    // $ANTLR end "rule__BinaryLogicFormula__Group__4"


    // $ANTLR start "rule__BinaryLogicFormula__Group__4__Impl"
    // InternalFOTCTL.g:3587:1: rule__BinaryLogicFormula__Group__4__Impl : ( ( rule__BinaryLogicFormula__RightSubformulaAssignment_4 ) ) ;
    public final void rule__BinaryLogicFormula__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3591:1: ( ( ( rule__BinaryLogicFormula__RightSubformulaAssignment_4 ) ) )
            // InternalFOTCTL.g:3592:1: ( ( rule__BinaryLogicFormula__RightSubformulaAssignment_4 ) )
            {
            // InternalFOTCTL.g:3592:1: ( ( rule__BinaryLogicFormula__RightSubformulaAssignment_4 ) )
            // InternalFOTCTL.g:3593:1: ( rule__BinaryLogicFormula__RightSubformulaAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getRightSubformulaAssignment_4()); 
            }
            // InternalFOTCTL.g:3594:1: ( rule__BinaryLogicFormula__RightSubformulaAssignment_4 )
            // InternalFOTCTL.g:3594:2: rule__BinaryLogicFormula__RightSubformulaAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__RightSubformulaAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getRightSubformulaAssignment_4()); 
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
    // $ANTLR end "rule__BinaryLogicFormula__Group__4__Impl"


    // $ANTLR start "rule__BinaryLogicFormula__Group__5"
    // InternalFOTCTL.g:3604:1: rule__BinaryLogicFormula__Group__5 : rule__BinaryLogicFormula__Group__5__Impl ;
    public final void rule__BinaryLogicFormula__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3608:1: ( rule__BinaryLogicFormula__Group__5__Impl )
            // InternalFOTCTL.g:3609:2: rule__BinaryLogicFormula__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BinaryLogicFormula__Group__5__Impl();

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
    // $ANTLR end "rule__BinaryLogicFormula__Group__5"


    // $ANTLR start "rule__BinaryLogicFormula__Group__5__Impl"
    // InternalFOTCTL.g:3615:1: rule__BinaryLogicFormula__Group__5__Impl : ( ')' ) ;
    public final void rule__BinaryLogicFormula__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3619:1: ( ( ')' ) )
            // InternalFOTCTL.g:3620:1: ( ')' )
            {
            // InternalFOTCTL.g:3620:1: ( ')' )
            // InternalFOTCTL.g:3621:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__BinaryLogicFormula__Group__5__Impl"


    // $ANTLR start "rule__AtomicProposition__Group__0"
    // InternalFOTCTL.g:3646:1: rule__AtomicProposition__Group__0 : rule__AtomicProposition__Group__0__Impl rule__AtomicProposition__Group__1 ;
    public final void rule__AtomicProposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3650:1: ( rule__AtomicProposition__Group__0__Impl rule__AtomicProposition__Group__1 )
            // InternalFOTCTL.g:3651:2: rule__AtomicProposition__Group__0__Impl rule__AtomicProposition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__AtomicProposition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicProposition__Group__1();

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
    // $ANTLR end "rule__AtomicProposition__Group__0"


    // $ANTLR start "rule__AtomicProposition__Group__0__Impl"
    // InternalFOTCTL.g:3658:1: rule__AtomicProposition__Group__0__Impl : ( () ) ;
    public final void rule__AtomicProposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3662:1: ( ( () ) )
            // InternalFOTCTL.g:3663:1: ( () )
            {
            // InternalFOTCTL.g:3663:1: ( () )
            // InternalFOTCTL.g:3664:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicPropositionAccess().getAtomicPropositionAction_0()); 
            }
            // InternalFOTCTL.g:3665:1: ()
            // InternalFOTCTL.g:3667:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicPropositionAccess().getAtomicPropositionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicProposition__Group__0__Impl"


    // $ANTLR start "rule__AtomicProposition__Group__1"
    // InternalFOTCTL.g:3677:1: rule__AtomicProposition__Group__1 : rule__AtomicProposition__Group__1__Impl ;
    public final void rule__AtomicProposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3681:1: ( rule__AtomicProposition__Group__1__Impl )
            // InternalFOTCTL.g:3682:2: rule__AtomicProposition__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicProposition__Group__1__Impl();

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
    // $ANTLR end "rule__AtomicProposition__Group__1"


    // $ANTLR start "rule__AtomicProposition__Group__1__Impl"
    // InternalFOTCTL.g:3688:1: rule__AtomicProposition__Group__1__Impl : ( ( rule__AtomicProposition__NameAssignment_1 ) ) ;
    public final void rule__AtomicProposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3692:1: ( ( ( rule__AtomicProposition__NameAssignment_1 ) ) )
            // InternalFOTCTL.g:3693:1: ( ( rule__AtomicProposition__NameAssignment_1 ) )
            {
            // InternalFOTCTL.g:3693:1: ( ( rule__AtomicProposition__NameAssignment_1 ) )
            // InternalFOTCTL.g:3694:1: ( rule__AtomicProposition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicPropositionAccess().getNameAssignment_1()); 
            }
            // InternalFOTCTL.g:3695:1: ( rule__AtomicProposition__NameAssignment_1 )
            // InternalFOTCTL.g:3695:2: rule__AtomicProposition__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AtomicProposition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicPropositionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__AtomicProposition__Group__1__Impl"


    // $ANTLR start "rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1"
    // InternalFOTCTL.g:3710:1: rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1 : ( ruleNodeLabelPredicateDecl ) ;
    public final void rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3714:1: ( ( ruleNodeLabelPredicateDecl ) )
            // InternalFOTCTL.g:3715:1: ( ruleNodeLabelPredicateDecl )
            {
            // InternalFOTCTL.g:3715:1: ( ruleNodeLabelPredicateDecl )
            // InternalFOTCTL.g:3716:1: ruleNodeLabelPredicateDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesNodeLabelPredicateDeclParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNodeLabelPredicateDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesNodeLabelPredicateDeclParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_1"


    // $ANTLR start "rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1"
    // InternalFOTCTL.g:3725:1: rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1 : ( ruleNodeLabelPredicateDecl ) ;
    public final void rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3729:1: ( ( ruleNodeLabelPredicateDecl ) )
            // InternalFOTCTL.g:3730:1: ( ruleNodeLabelPredicateDecl )
            {
            // InternalFOTCTL.g:3730:1: ( ruleNodeLabelPredicateDecl )
            // InternalFOTCTL.g:3731:1: ruleNodeLabelPredicateDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesNodeLabelPredicateDeclParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNodeLabelPredicateDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesNodeLabelPredicateDeclParserRuleCall_2_2_1_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__NodeLabelPredicatesAssignment_2_2_1"


    // $ANTLR start "rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1"
    // InternalFOTCTL.g:3740:1: rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1 : ( ruleEdgeLabelPredicateDecl ) ;
    public final void rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3744:1: ( ( ruleEdgeLabelPredicateDecl ) )
            // InternalFOTCTL.g:3745:1: ( ruleEdgeLabelPredicateDecl )
            {
            // InternalFOTCTL.g:3745:1: ( ruleEdgeLabelPredicateDecl )
            // InternalFOTCTL.g:3746:1: ruleEdgeLabelPredicateDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesEdgeLabelPredicateDeclParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEdgeLabelPredicateDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesEdgeLabelPredicateDeclParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_1"


    // $ANTLR start "rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1"
    // InternalFOTCTL.g:3755:1: rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1 : ( ruleEdgeLabelPredicateDecl ) ;
    public final void rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3759:1: ( ( ruleEdgeLabelPredicateDecl ) )
            // InternalFOTCTL.g:3760:1: ( ruleEdgeLabelPredicateDecl )
            {
            // InternalFOTCTL.g:3760:1: ( ruleEdgeLabelPredicateDecl )
            // InternalFOTCTL.g:3761:1: ruleEdgeLabelPredicateDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesEdgeLabelPredicateDeclParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEdgeLabelPredicateDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesEdgeLabelPredicateDeclParserRuleCall_3_2_1_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__EdgeLabelPredicatesAssignment_3_2_1"


    // $ANTLR start "rule__FoTCTLSpec__ConstantsAssignment_4_1"
    // InternalFOTCTL.g:3770:1: rule__FoTCTLSpec__ConstantsAssignment_4_1 : ( ruleConstantSymbolDecl ) ;
    public final void rule__FoTCTLSpec__ConstantsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3774:1: ( ( ruleConstantSymbolDecl ) )
            // InternalFOTCTL.g:3775:1: ( ruleConstantSymbolDecl )
            {
            // InternalFOTCTL.g:3775:1: ( ruleConstantSymbolDecl )
            // InternalFOTCTL.g:3776:1: ruleConstantSymbolDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getConstantsConstantSymbolDeclParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConstantSymbolDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getConstantsConstantSymbolDeclParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__ConstantsAssignment_4_1"


    // $ANTLR start "rule__FoTCTLSpec__ConstantsAssignment_4_2_1"
    // InternalFOTCTL.g:3785:1: rule__FoTCTLSpec__ConstantsAssignment_4_2_1 : ( ruleConstantSymbolDecl ) ;
    public final void rule__FoTCTLSpec__ConstantsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3789:1: ( ( ruleConstantSymbolDecl ) )
            // InternalFOTCTL.g:3790:1: ( ruleConstantSymbolDecl )
            {
            // InternalFOTCTL.g:3790:1: ( ruleConstantSymbolDecl )
            // InternalFOTCTL.g:3791:1: ruleConstantSymbolDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getConstantsConstantSymbolDeclParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleConstantSymbolDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getConstantsConstantSymbolDeclParserRuleCall_4_2_1_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__ConstantsAssignment_4_2_1"


    // $ANTLR start "rule__FoTCTLSpec__FormulasAssignment_6"
    // InternalFOTCTL.g:3800:1: rule__FoTCTLSpec__FormulasAssignment_6 : ( ruleFoTCTLFormula ) ;
    public final void rule__FoTCTLSpec__FormulasAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3804:1: ( ( ruleFoTCTLFormula ) )
            // InternalFOTCTL.g:3805:1: ( ruleFoTCTLFormula )
            {
            // InternalFOTCTL.g:3805:1: ( ruleFoTCTLFormula )
            // InternalFOTCTL.g:3806:1: ruleFoTCTLFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLSpecAccess().getFormulasFoTCTLFormulaParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFoTCTLFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLSpecAccess().getFormulasFoTCTLFormulaParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__FoTCTLSpec__FormulasAssignment_6"


    // $ANTLR start "rule__FoTCTLFormula__FormulaAssignment_1"
    // InternalFOTCTL.g:3815:1: rule__FoTCTLFormula__FormulaAssignment_1 : ( ruleFormulaDefinition ) ;
    public final void rule__FoTCTLFormula__FormulaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3819:1: ( ( ruleFormulaDefinition ) )
            // InternalFOTCTL.g:3820:1: ( ruleFormulaDefinition )
            {
            // InternalFOTCTL.g:3820:1: ( ruleFormulaDefinition )
            // InternalFOTCTL.g:3821:1: ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFoTCTLFormulaAccess().getFormulaFormulaDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFoTCTLFormulaAccess().getFormulaFormulaDefinitionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__FoTCTLFormula__FormulaAssignment_1"


    // $ANTLR start "rule__NodeLabelPredicateDecl__NameAssignment_1"
    // InternalFOTCTL.g:3830:1: rule__NodeLabelPredicateDecl__NameAssignment_1 : ( RULE_NODE_PREDICATE_NAME ) ;
    public final void rule__NodeLabelPredicateDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3834:1: ( ( RULE_NODE_PREDICATE_NAME ) )
            // InternalFOTCTL.g:3835:1: ( RULE_NODE_PREDICATE_NAME )
            {
            // InternalFOTCTL.g:3835:1: ( RULE_NODE_PREDICATE_NAME )
            // InternalFOTCTL.g:3836:1: RULE_NODE_PREDICATE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateDeclAccess().getNameNode_predicate_nameTerminalRuleCall_1_0()); 
            }
            match(input,RULE_NODE_PREDICATE_NAME,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateDeclAccess().getNameNode_predicate_nameTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__NodeLabelPredicateDecl__NameAssignment_1"


    // $ANTLR start "rule__EdgeLabelPredicateDecl__NameAssignment_1"
    // InternalFOTCTL.g:3845:1: rule__EdgeLabelPredicateDecl__NameAssignment_1 : ( RULE_EDGE_PREDICATE_NAME ) ;
    public final void rule__EdgeLabelPredicateDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3849:1: ( ( RULE_EDGE_PREDICATE_NAME ) )
            // InternalFOTCTL.g:3850:1: ( RULE_EDGE_PREDICATE_NAME )
            {
            // InternalFOTCTL.g:3850:1: ( RULE_EDGE_PREDICATE_NAME )
            // InternalFOTCTL.g:3851:1: RULE_EDGE_PREDICATE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateDeclAccess().getNameEdge_predicate_nameTerminalRuleCall_1_0()); 
            }
            match(input,RULE_EDGE_PREDICATE_NAME,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateDeclAccess().getNameEdge_predicate_nameTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EdgeLabelPredicateDecl__NameAssignment_1"


    // $ANTLR start "rule__ConstantSymbolDecl__NameAssignment_1"
    // InternalFOTCTL.g:3860:1: rule__ConstantSymbolDecl__NameAssignment_1 : ( RULE_CONSTANT_NAME ) ;
    public final void rule__ConstantSymbolDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3864:1: ( ( RULE_CONSTANT_NAME ) )
            // InternalFOTCTL.g:3865:1: ( RULE_CONSTANT_NAME )
            {
            // InternalFOTCTL.g:3865:1: ( RULE_CONSTANT_NAME )
            // InternalFOTCTL.g:3866:1: RULE_CONSTANT_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantSymbolDeclAccess().getNameConstant_nameTerminalRuleCall_1_0()); 
            }
            match(input,RULE_CONSTANT_NAME,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantSymbolDeclAccess().getNameConstant_nameTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ConstantSymbolDecl__NameAssignment_1"


    // $ANTLR start "rule__Constant__DeclarationAssignment_1"
    // InternalFOTCTL.g:3875:1: rule__Constant__DeclarationAssignment_1 : ( ( RULE_CONSTANT_NAME ) ) ;
    public final void rule__Constant__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3879:1: ( ( ( RULE_CONSTANT_NAME ) ) )
            // InternalFOTCTL.g:3880:1: ( ( RULE_CONSTANT_NAME ) )
            {
            // InternalFOTCTL.g:3880:1: ( ( RULE_CONSTANT_NAME ) )
            // InternalFOTCTL.g:3881:1: ( RULE_CONSTANT_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getDeclarationConstantSymbolDeclCrossReference_1_0()); 
            }
            // InternalFOTCTL.g:3882:1: ( RULE_CONSTANT_NAME )
            // InternalFOTCTL.g:3883:1: RULE_CONSTANT_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getDeclarationConstantSymbolDeclConstant_nameTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_CONSTANT_NAME,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getDeclarationConstantSymbolDeclConstant_nameTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getDeclarationConstantSymbolDeclCrossReference_1_0()); 
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
    // $ANTLR end "rule__Constant__DeclarationAssignment_1"


    // $ANTLR start "rule__Variable__DeclarationAssignment_1"
    // InternalFOTCTL.g:3894:1: rule__Variable__DeclarationAssignment_1 : ( ( RULE_VARIABLE_NAME ) ) ;
    public final void rule__Variable__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3898:1: ( ( ( RULE_VARIABLE_NAME ) ) )
            // InternalFOTCTL.g:3899:1: ( ( RULE_VARIABLE_NAME ) )
            {
            // InternalFOTCTL.g:3899:1: ( ( RULE_VARIABLE_NAME ) )
            // InternalFOTCTL.g:3900:1: ( RULE_VARIABLE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationQuantifiedFormulaCrossReference_1_0()); 
            }
            // InternalFOTCTL.g:3901:1: ( RULE_VARIABLE_NAME )
            // InternalFOTCTL.g:3902:1: RULE_VARIABLE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationQuantifiedFormulaVariable_nameTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_VARIABLE_NAME,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getDeclarationQuantifiedFormulaVariable_nameTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getDeclarationQuantifiedFormulaCrossReference_1_0()); 
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
    // $ANTLR end "rule__Variable__DeclarationAssignment_1"


    // $ANTLR start "rule__NodeLabelPredicate__DeclarationAssignment_1"
    // InternalFOTCTL.g:3913:1: rule__NodeLabelPredicate__DeclarationAssignment_1 : ( ( RULE_NODE_PREDICATE_NAME ) ) ;
    public final void rule__NodeLabelPredicate__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3917:1: ( ( ( RULE_NODE_PREDICATE_NAME ) ) )
            // InternalFOTCTL.g:3918:1: ( ( RULE_NODE_PREDICATE_NAME ) )
            {
            // InternalFOTCTL.g:3918:1: ( ( RULE_NODE_PREDICATE_NAME ) )
            // InternalFOTCTL.g:3919:1: ( RULE_NODE_PREDICATE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateAccess().getDeclarationNodeLabelPredicateDeclCrossReference_1_0()); 
            }
            // InternalFOTCTL.g:3920:1: ( RULE_NODE_PREDICATE_NAME )
            // InternalFOTCTL.g:3921:1: RULE_NODE_PREDICATE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateAccess().getDeclarationNodeLabelPredicateDeclNode_predicate_nameTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_NODE_PREDICATE_NAME,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateAccess().getDeclarationNodeLabelPredicateDeclNode_predicate_nameTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateAccess().getDeclarationNodeLabelPredicateDeclCrossReference_1_0()); 
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
    // $ANTLR end "rule__NodeLabelPredicate__DeclarationAssignment_1"


    // $ANTLR start "rule__NodeLabelPredicate__TermAssignment_3"
    // InternalFOTCTL.g:3932:1: rule__NodeLabelPredicate__TermAssignment_3 : ( ruleTerm ) ;
    public final void rule__NodeLabelPredicate__TermAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3936:1: ( ( ruleTerm ) )
            // InternalFOTCTL.g:3937:1: ( ruleTerm )
            {
            // InternalFOTCTL.g:3937:1: ( ruleTerm )
            // InternalFOTCTL.g:3938:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeLabelPredicateAccess().getTermTermParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeLabelPredicateAccess().getTermTermParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__NodeLabelPredicate__TermAssignment_3"


    // $ANTLR start "rule__EdgeLabelPredicate__DeclarationAssignment_1"
    // InternalFOTCTL.g:3947:1: rule__EdgeLabelPredicate__DeclarationAssignment_1 : ( ( RULE_EDGE_PREDICATE_NAME ) ) ;
    public final void rule__EdgeLabelPredicate__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3951:1: ( ( ( RULE_EDGE_PREDICATE_NAME ) ) )
            // InternalFOTCTL.g:3952:1: ( ( RULE_EDGE_PREDICATE_NAME ) )
            {
            // InternalFOTCTL.g:3952:1: ( ( RULE_EDGE_PREDICATE_NAME ) )
            // InternalFOTCTL.g:3953:1: ( RULE_EDGE_PREDICATE_NAME )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getDeclarationEdgeLabelPredicateDeclCrossReference_1_0()); 
            }
            // InternalFOTCTL.g:3954:1: ( RULE_EDGE_PREDICATE_NAME )
            // InternalFOTCTL.g:3955:1: RULE_EDGE_PREDICATE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getDeclarationEdgeLabelPredicateDeclEdge_predicate_nameTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_EDGE_PREDICATE_NAME,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getDeclarationEdgeLabelPredicateDeclEdge_predicate_nameTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getDeclarationEdgeLabelPredicateDeclCrossReference_1_0()); 
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
    // $ANTLR end "rule__EdgeLabelPredicate__DeclarationAssignment_1"


    // $ANTLR start "rule__EdgeLabelPredicate__TermAssignment_3"
    // InternalFOTCTL.g:3966:1: rule__EdgeLabelPredicate__TermAssignment_3 : ( ruleTerm ) ;
    public final void rule__EdgeLabelPredicate__TermAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3970:1: ( ( ruleTerm ) )
            // InternalFOTCTL.g:3971:1: ( ruleTerm )
            {
            // InternalFOTCTL.g:3971:1: ( ruleTerm )
            // InternalFOTCTL.g:3972:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getTermTermParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getTermTermParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__EdgeLabelPredicate__TermAssignment_3"


    // $ANTLR start "rule__EdgeLabelPredicate__SecondTermAssignment_5"
    // InternalFOTCTL.g:3981:1: rule__EdgeLabelPredicate__SecondTermAssignment_5 : ( ruleTerm ) ;
    public final void rule__EdgeLabelPredicate__SecondTermAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:3985:1: ( ( ruleTerm ) )
            // InternalFOTCTL.g:3986:1: ( ruleTerm )
            {
            // InternalFOTCTL.g:3986:1: ( ruleTerm )
            // InternalFOTCTL.g:3987:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeLabelPredicateAccess().getSecondTermTermParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeLabelPredicateAccess().getSecondTermTermParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__EdgeLabelPredicate__SecondTermAssignment_5"


    // $ANTLR start "rule__QuantifiedFormula__QuantifierAssignment_1"
    // InternalFOTCTL.g:3996:1: rule__QuantifiedFormula__QuantifierAssignment_1 : ( ruleQuantifier ) ;
    public final void rule__QuantifiedFormula__QuantifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4000:1: ( ( ruleQuantifier ) )
            // InternalFOTCTL.g:4001:1: ( ruleQuantifier )
            {
            // InternalFOTCTL.g:4001:1: ( ruleQuantifier )
            // InternalFOTCTL.g:4002:1: ruleQuantifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getQuantifierQuantifierEnumRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQuantifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getQuantifierQuantifierEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__QuantifiedFormula__QuantifierAssignment_1"


    // $ANTLR start "rule__QuantifiedFormula__NameAssignment_3"
    // InternalFOTCTL.g:4011:1: rule__QuantifiedFormula__NameAssignment_3 : ( RULE_VARIABLE_NAME ) ;
    public final void rule__QuantifiedFormula__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4015:1: ( ( RULE_VARIABLE_NAME ) )
            // InternalFOTCTL.g:4016:1: ( RULE_VARIABLE_NAME )
            {
            // InternalFOTCTL.g:4016:1: ( RULE_VARIABLE_NAME )
            // InternalFOTCTL.g:4017:1: RULE_VARIABLE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getNameVariable_nameTerminalRuleCall_3_0()); 
            }
            match(input,RULE_VARIABLE_NAME,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getNameVariable_nameTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__QuantifiedFormula__NameAssignment_3"


    // $ANTLR start "rule__QuantifiedFormula__SubformulaAssignment_5"
    // InternalFOTCTL.g:4026:1: rule__QuantifiedFormula__SubformulaAssignment_5 : ( ruleFormulaDefinition ) ;
    public final void rule__QuantifiedFormula__SubformulaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4030:1: ( ( ruleFormulaDefinition ) )
            // InternalFOTCTL.g:4031:1: ( ruleFormulaDefinition )
            {
            // InternalFOTCTL.g:4031:1: ( ruleFormulaDefinition )
            // InternalFOTCTL.g:4032:1: ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuantifiedFormulaAccess().getSubformulaFormulaDefinitionParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuantifiedFormulaAccess().getSubformulaFormulaDefinitionParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__QuantifiedFormula__SubformulaAssignment_5"


    // $ANTLR start "rule__NotFormula__SubformulaAssignment_2"
    // InternalFOTCTL.g:4042:1: rule__NotFormula__SubformulaAssignment_2 : ( ruleFormulaDefinition ) ;
    public final void rule__NotFormula__SubformulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4046:1: ( ( ruleFormulaDefinition ) )
            // InternalFOTCTL.g:4047:1: ( ruleFormulaDefinition )
            {
            // InternalFOTCTL.g:4047:1: ( ruleFormulaDefinition )
            // InternalFOTCTL.g:4048:1: ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotFormulaAccess().getSubformulaFormulaDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotFormulaAccess().getSubformulaFormulaDefinitionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__NotFormula__SubformulaAssignment_2"


    // $ANTLR start "rule__UnaryTemporalFormula__TemporalOperatorAssignment_1"
    // InternalFOTCTL.g:4057:1: rule__UnaryTemporalFormula__TemporalOperatorAssignment_1 : ( ruleTemporalOperator ) ;
    public final void rule__UnaryTemporalFormula__TemporalOperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4061:1: ( ( ruleTemporalOperator ) )
            // InternalFOTCTL.g:4062:1: ( ruleTemporalOperator )
            {
            // InternalFOTCTL.g:4062:1: ( ruleTemporalOperator )
            // InternalFOTCTL.g:4063:1: ruleTemporalOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getTemporalOperatorTemporalOperatorEnumRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTemporalOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getTemporalOperatorTemporalOperatorEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__TemporalOperatorAssignment_1"


    // $ANTLR start "rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3"
    // InternalFOTCTL.g:4072:1: rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3 : ( ruleComparisonOperator ) ;
    public final void rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4076:1: ( ( ruleComparisonOperator ) )
            // InternalFOTCTL.g:4077:1: ( ruleComparisonOperator )
            {
            // InternalFOTCTL.g:4077:1: ( ruleComparisonOperator )
            // InternalFOTCTL.g:4078:1: ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_3_0()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__ComparisonOperatorAssignment_3"


    // $ANTLR start "rule__UnaryTemporalFormula__ValueAssignment_4"
    // InternalFOTCTL.g:4087:1: rule__UnaryTemporalFormula__ValueAssignment_4 : ( RULE_INT ) ;
    public final void rule__UnaryTemporalFormula__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4091:1: ( ( RULE_INT ) )
            // InternalFOTCTL.g:4092:1: ( RULE_INT )
            {
            // InternalFOTCTL.g:4092:1: ( RULE_INT )
            // InternalFOTCTL.g:4093:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getValueINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getValueINTTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__ValueAssignment_4"


    // $ANTLR start "rule__UnaryTemporalFormula__SubformulaAssignment_6"
    // InternalFOTCTL.g:4102:1: rule__UnaryTemporalFormula__SubformulaAssignment_6 : ( ruleFormulaDefinition ) ;
    public final void rule__UnaryTemporalFormula__SubformulaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4106:1: ( ( ruleFormulaDefinition ) )
            // InternalFOTCTL.g:4107:1: ( ruleFormulaDefinition )
            {
            // InternalFOTCTL.g:4107:1: ( ruleFormulaDefinition )
            // InternalFOTCTL.g:4108:1: ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryTemporalFormulaAccess().getSubformulaFormulaDefinitionParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryTemporalFormulaAccess().getSubformulaFormulaDefinitionParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__UnaryTemporalFormula__SubformulaAssignment_6"


    // $ANTLR start "rule__BinaryTemporalFormula__LeftSubformulaAssignment_2"
    // InternalFOTCTL.g:4117:1: rule__BinaryTemporalFormula__LeftSubformulaAssignment_2 : ( ruleFormulaDefinition ) ;
    public final void rule__BinaryTemporalFormula__LeftSubformulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4121:1: ( ( ruleFormulaDefinition ) )
            // InternalFOTCTL.g:4122:1: ( ruleFormulaDefinition )
            {
            // InternalFOTCTL.g:4122:1: ( ruleFormulaDefinition )
            // InternalFOTCTL.g:4123:1: ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getLeftSubformulaFormulaDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getLeftSubformulaFormulaDefinitionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__LeftSubformulaAssignment_2"


    // $ANTLR start "rule__BinaryTemporalFormula__TemporalOperatorAssignment_4"
    // InternalFOTCTL.g:4132:1: rule__BinaryTemporalFormula__TemporalOperatorAssignment_4 : ( ruleTemporalOperator ) ;
    public final void rule__BinaryTemporalFormula__TemporalOperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4136:1: ( ( ruleTemporalOperator ) )
            // InternalFOTCTL.g:4137:1: ( ruleTemporalOperator )
            {
            // InternalFOTCTL.g:4137:1: ( ruleTemporalOperator )
            // InternalFOTCTL.g:4138:1: ruleTemporalOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getTemporalOperatorTemporalOperatorEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTemporalOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getTemporalOperatorTemporalOperatorEnumRuleCall_4_0()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__TemporalOperatorAssignment_4"


    // $ANTLR start "rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6"
    // InternalFOTCTL.g:4147:1: rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6 : ( ruleComparisonOperator ) ;
    public final void rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4151:1: ( ( ruleComparisonOperator ) )
            // InternalFOTCTL.g:4152:1: ( ruleComparisonOperator )
            {
            // InternalFOTCTL.g:4152:1: ( ruleComparisonOperator )
            // InternalFOTCTL.g:4153:1: ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_6_0()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__ComparisonOperatorAssignment_6"


    // $ANTLR start "rule__BinaryTemporalFormula__ValueAssignment_7"
    // InternalFOTCTL.g:4162:1: rule__BinaryTemporalFormula__ValueAssignment_7 : ( RULE_INT ) ;
    public final void rule__BinaryTemporalFormula__ValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4166:1: ( ( RULE_INT ) )
            // InternalFOTCTL.g:4167:1: ( RULE_INT )
            {
            // InternalFOTCTL.g:4167:1: ( RULE_INT )
            // InternalFOTCTL.g:4168:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getValueINTTerminalRuleCall_7_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getValueINTTerminalRuleCall_7_0()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__ValueAssignment_7"


    // $ANTLR start "rule__BinaryTemporalFormula__RightSubformulaAssignment_9"
    // InternalFOTCTL.g:4177:1: rule__BinaryTemporalFormula__RightSubformulaAssignment_9 : ( ruleFormulaDefinition ) ;
    public final void rule__BinaryTemporalFormula__RightSubformulaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4181:1: ( ( ruleFormulaDefinition ) )
            // InternalFOTCTL.g:4182:1: ( ruleFormulaDefinition )
            {
            // InternalFOTCTL.g:4182:1: ( ruleFormulaDefinition )
            // InternalFOTCTL.g:4183:1: ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryTemporalFormulaAccess().getRightSubformulaFormulaDefinitionParserRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryTemporalFormulaAccess().getRightSubformulaFormulaDefinitionParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__BinaryTemporalFormula__RightSubformulaAssignment_9"


    // $ANTLR start "rule__BinaryLogicFormula__LeftSubformulaAssignment_2"
    // InternalFOTCTL.g:4192:1: rule__BinaryLogicFormula__LeftSubformulaAssignment_2 : ( ruleFormulaDefinition ) ;
    public final void rule__BinaryLogicFormula__LeftSubformulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4196:1: ( ( ruleFormulaDefinition ) )
            // InternalFOTCTL.g:4197:1: ( ruleFormulaDefinition )
            {
            // InternalFOTCTL.g:4197:1: ( ruleFormulaDefinition )
            // InternalFOTCTL.g:4198:1: ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getLeftSubformulaFormulaDefinitionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getLeftSubformulaFormulaDefinitionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__BinaryLogicFormula__LeftSubformulaAssignment_2"


    // $ANTLR start "rule__BinaryLogicFormula__OperatorAssignment_3"
    // InternalFOTCTL.g:4207:1: rule__BinaryLogicFormula__OperatorAssignment_3 : ( ruleBinaryLogicOperator ) ;
    public final void rule__BinaryLogicFormula__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4211:1: ( ( ruleBinaryLogicOperator ) )
            // InternalFOTCTL.g:4212:1: ( ruleBinaryLogicOperator )
            {
            // InternalFOTCTL.g:4212:1: ( ruleBinaryLogicOperator )
            // InternalFOTCTL.g:4213:1: ruleBinaryLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getOperatorBinaryLogicOperatorEnumRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBinaryLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getOperatorBinaryLogicOperatorEnumRuleCall_3_0()); 
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
    // $ANTLR end "rule__BinaryLogicFormula__OperatorAssignment_3"


    // $ANTLR start "rule__BinaryLogicFormula__RightSubformulaAssignment_4"
    // InternalFOTCTL.g:4222:1: rule__BinaryLogicFormula__RightSubformulaAssignment_4 : ( ruleFormulaDefinition ) ;
    public final void rule__BinaryLogicFormula__RightSubformulaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4226:1: ( ( ruleFormulaDefinition ) )
            // InternalFOTCTL.g:4227:1: ( ruleFormulaDefinition )
            {
            // InternalFOTCTL.g:4227:1: ( ruleFormulaDefinition )
            // InternalFOTCTL.g:4228:1: ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryLogicFormulaAccess().getRightSubformulaFormulaDefinitionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryLogicFormulaAccess().getRightSubformulaFormulaDefinitionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__BinaryLogicFormula__RightSubformulaAssignment_4"


    // $ANTLR start "rule__AtomicProposition__NameAssignment_1"
    // InternalFOTCTL.g:4237:1: rule__AtomicProposition__NameAssignment_1 : ( RULE_VARIABLE_NAME ) ;
    public final void rule__AtomicProposition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalFOTCTL.g:4241:1: ( ( RULE_VARIABLE_NAME ) )
            // InternalFOTCTL.g:4242:1: ( RULE_VARIABLE_NAME )
            {
            // InternalFOTCTL.g:4242:1: ( RULE_VARIABLE_NAME )
            // InternalFOTCTL.g:4243:1: RULE_VARIABLE_NAME
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicPropositionAccess().getNameVariable_nameTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE_NAME,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicPropositionAccess().getNameVariable_nameTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__AtomicProposition__NameAssignment_1"

    // $ANTLR start synpred5_InternalFOTCTL
    public final void synpred5_InternalFOTCTL_fragment() throws RecognitionException {   
        // InternalFOTCTL.g:762:1: ( ( ruleBinaryLogicFormula ) )
        // InternalFOTCTL.g:762:1: ( ruleBinaryLogicFormula )
        {
        // InternalFOTCTL.g:762:1: ( ruleBinaryLogicFormula )
        // InternalFOTCTL.g:763:1: ruleBinaryLogicFormula
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBinaryFormulaAccess().getBinaryLogicFormulaParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleBinaryLogicFormula();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalFOTCTL

    // $ANTLR start synpred7_InternalFOTCTL
    public final void synpred7_InternalFOTCTL_fragment() throws RecognitionException {   
        // InternalFOTCTL.g:808:1: ( ( ruleVariable ) )
        // InternalFOTCTL.g:808:1: ( ruleVariable )
        {
        // InternalFOTCTL.g:808:1: ( ruleVariable )
        // InternalFOTCTL.g:809:1: ruleVariable
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTermAccess().getVariableParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleVariable();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalFOTCTL

    // Delegated rules

    public final boolean synpred5_InternalFOTCTL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalFOTCTL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalFOTCTL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalFOTCTL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000CC00000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00001201F8018030L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001201F8018032L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001001F8018000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001F8000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000007C00000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000003E0000L});
    }


}