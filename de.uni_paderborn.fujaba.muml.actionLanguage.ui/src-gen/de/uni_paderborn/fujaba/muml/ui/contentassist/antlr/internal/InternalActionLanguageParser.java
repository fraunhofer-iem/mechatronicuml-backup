package de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.uni_paderborn.fujaba.muml.services.ActionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActionLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "':='", "'+='", "'=+'", "'-='", "'=-'", "'++'", "'--'", "'&'", "'&&'", "'|'", "'||'", "'xor'", "'=>'", "'<=>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'<'", "'<='", "'=='", "'>='", "'>'", "'<>'", "'not'", "'{'", "'}'", "'for'", "'('", "';'", "')'", "'while'", "'do'", "'if'", "'elseif'", "'else'", "':'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=7;
    public static final int RULE_NUMBER=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalActionLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g"; }


     
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




    // $ANTLR start entryRuleBlock
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:61:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:62:1: ( ruleBlock EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:63:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock61);
            ruleBlock();
            _fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock68); 

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
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:70:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:74:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:75:1: ( ( rule__Block__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:75:1: ( ( rule__Block__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:76:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:77:1: ( rule__Block__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:77:2: rule__Block__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__0_in_ruleBlock94);
            rule__Block__Group__0();
            _fsp--;


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

        }
        return ;
    }
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleForLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:89:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:90:1: ( ruleForLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:91:1: ruleForLoop EOF
            {
             before(grammarAccess.getForLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_entryRuleForLoop121);
            ruleForLoop();
            _fsp--;

             after(grammarAccess.getForLoopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoop128); 

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
    // $ANTLR end entryRuleForLoop


    // $ANTLR start ruleForLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:98:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:102:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:103:1: ( ( rule__ForLoop__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:103:1: ( ( rule__ForLoop__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:104:1: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:105:1: ( rule__ForLoop__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:105:2: rule__ForLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__0_in_ruleForLoop154);
            rule__ForLoop__Group__0();
            _fsp--;


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
    // $ANTLR end ruleForLoop


    // $ANTLR start entryRuleWhileLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:117:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:118:1: ( ruleWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:119:1: ruleWhileLoop EOF
            {
             before(grammarAccess.getWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop181);
            ruleWhileLoop();
            _fsp--;

             after(grammarAccess.getWhileLoopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhileLoop188); 

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
    // $ANTLR end entryRuleWhileLoop


    // $ANTLR start ruleWhileLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:126:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:130:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:131:1: ( ( rule__WhileLoop__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:131:1: ( ( rule__WhileLoop__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:132:1: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:133:1: ( rule__WhileLoop__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:133:2: rule__WhileLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__0_in_ruleWhileLoop214);
            rule__WhileLoop__Group__0();
            _fsp--;


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
    // $ANTLR end ruleWhileLoop


    // $ANTLR start entryRuleDoWhileLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:145:1: entryRuleDoWhileLoop : ruleDoWhileLoop EOF ;
    public final void entryRuleDoWhileLoop() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:146:1: ( ruleDoWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:147:1: ruleDoWhileLoop EOF
            {
             before(grammarAccess.getDoWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop241);
            ruleDoWhileLoop();
            _fsp--;

             after(grammarAccess.getDoWhileLoopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoWhileLoop248); 

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
    // $ANTLR end entryRuleDoWhileLoop


    // $ANTLR start ruleDoWhileLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:154:1: ruleDoWhileLoop : ( ( rule__DoWhileLoop__Group__0 ) ) ;
    public final void ruleDoWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:158:2: ( ( ( rule__DoWhileLoop__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:159:1: ( ( rule__DoWhileLoop__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:159:1: ( ( rule__DoWhileLoop__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:160:1: ( rule__DoWhileLoop__Group__0 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:161:1: ( rule__DoWhileLoop__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:161:2: rule__DoWhileLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__0_in_ruleDoWhileLoop274);
            rule__DoWhileLoop__Group__0();
            _fsp--;


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
    // $ANTLR end ruleDoWhileLoop


    // $ANTLR start entryRuleIfStatement
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:173:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:174:1: ( ruleIfStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:175:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_entryRuleIfStatement301);
            ruleIfStatement();
            _fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfStatement308); 

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
    // $ANTLR end entryRuleIfStatement


    // $ANTLR start ruleIfStatement
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:182:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:186:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:187:1: ( ( rule__IfStatement__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:187:1: ( ( rule__IfStatement__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:188:1: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:189:1: ( rule__IfStatement__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:189:2: rule__IfStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement334);
            rule__IfStatement__Group__0();
            _fsp--;


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
    // $ANTLR end ruleIfStatement


    // $ANTLR start entryRuleExpressionStartRule
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:201:1: entryRuleExpressionStartRule : ruleExpressionStartRule EOF ;
    public final void entryRuleExpressionStartRule() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:202:1: ( ruleExpressionStartRule EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:203:1: ruleExpressionStartRule EOF
            {
             before(grammarAccess.getExpressionStartRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule361);
            ruleExpressionStartRule();
            _fsp--;

             after(grammarAccess.getExpressionStartRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionStartRule368); 

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
    // $ANTLR end entryRuleExpressionStartRule


    // $ANTLR start ruleExpressionStartRule
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:210:1: ruleExpressionStartRule : ( ( rule__ExpressionStartRule__Alternatives ) ) ;
    public final void ruleExpressionStartRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:214:2: ( ( ( rule__ExpressionStartRule__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:215:1: ( ( rule__ExpressionStartRule__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:215:1: ( ( rule__ExpressionStartRule__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:216:1: ( rule__ExpressionStartRule__Alternatives )
            {
             before(grammarAccess.getExpressionStartRuleAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:217:1: ( rule__ExpressionStartRule__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:217:2: rule__ExpressionStartRule__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionStartRule__Alternatives_in_ruleExpressionStartRule394);
            rule__ExpressionStartRule__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleExpressionStartRule


    // $ANTLR start entryRuleAssignment
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:229:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:230:1: ( ruleAssignment EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:231:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment421);
            ruleAssignment();
            _fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment428); 

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
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:238:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:242:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:243:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:243:1: ( ( rule__Assignment__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:244:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:245:1: ( rule__Assignment__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:245:2: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0_in_ruleAssignment454);
            rule__Assignment__Group__0();
            _fsp--;


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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleForLoopCountingExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:257:1: entryRuleForLoopCountingExpression : ruleForLoopCountingExpression EOF ;
    public final void entryRuleForLoopCountingExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:258:1: ( ruleForLoopCountingExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:259:1: ruleForLoopCountingExpression EOF
            {
             before(grammarAccess.getForLoopCountingExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression481);
            ruleForLoopCountingExpression();
            _fsp--;

             after(grammarAccess.getForLoopCountingExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoopCountingExpression488); 

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
    // $ANTLR end entryRuleForLoopCountingExpression


    // $ANTLR start ruleForLoopCountingExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:266:1: ruleForLoopCountingExpression : ( ( rule__ForLoopCountingExpression__Group__0 ) ) ;
    public final void ruleForLoopCountingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:270:2: ( ( ( rule__ForLoopCountingExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:271:1: ( ( rule__ForLoopCountingExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:271:1: ( ( rule__ForLoopCountingExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:272:1: ( rule__ForLoopCountingExpression__Group__0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:273:1: ( rule__ForLoopCountingExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:273:2: rule__ForLoopCountingExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__Group__0_in_ruleForLoopCountingExpression514);
            rule__ForLoopCountingExpression__Group__0();
            _fsp--;


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
    // $ANTLR end ruleForLoopCountingExpression


    // $ANTLR start entryRuleExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:285:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:286:1: ( ruleExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:287:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression541);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression548); 

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:294:1: ruleExpression : ( ruleArithmeticExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:298:2: ( ( ruleArithmeticExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:299:1: ( ruleArithmeticExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:299:1: ( ruleArithmeticExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:300:1: ruleArithmeticExpression
            {
             before(grammarAccess.getExpressionAccess().getArithmeticExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleExpression574);
            ruleArithmeticExpression();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getArithmeticExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleArithmeticExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:313:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:314:1: ( ruleArithmeticExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:315:1: ruleArithmeticExpression EOF
            {
             before(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression600);
            ruleArithmeticExpression();
            _fsp--;

             after(grammarAccess.getArithmeticExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArithmeticExpression607); 

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
    // $ANTLR end entryRuleArithmeticExpression


    // $ANTLR start ruleArithmeticExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:322:1: ruleArithmeticExpression : ( ( rule__ArithmeticExpression__Group__0 ) ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:326:2: ( ( ( rule__ArithmeticExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:327:1: ( ( rule__ArithmeticExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:327:1: ( ( rule__ArithmeticExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:328:1: ( rule__ArithmeticExpression__Group__0 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:329:1: ( rule__ArithmeticExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:329:2: rule__ArithmeticExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group__0_in_ruleArithmeticExpression633);
            rule__ArithmeticExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArithmeticExpression


    // $ANTLR start entryRuleComparisonExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:341:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:342:1: ( ruleComparisonExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:343:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression660);
            ruleComparisonExpression();
            _fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression667); 

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
    // $ANTLR end entryRuleComparisonExpression


    // $ANTLR start ruleComparisonExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:350:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:354:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:355:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:355:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:356:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:357:1: ( rule__ComparisonExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:357:2: rule__ComparisonExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression693);
            rule__ComparisonExpression__Group__0();
            _fsp--;


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
    // $ANTLR end ruleComparisonExpression


    // $ANTLR start entryRuleBinaryLogicExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:369:1: entryRuleBinaryLogicExpression : ruleBinaryLogicExpression EOF ;
    public final void entryRuleBinaryLogicExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:370:1: ( ruleBinaryLogicExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:371:1: ruleBinaryLogicExpression EOF
            {
             before(grammarAccess.getBinaryLogicExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_entryRuleBinaryLogicExpression720);
            ruleBinaryLogicExpression();
            _fsp--;

             after(grammarAccess.getBinaryLogicExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryLogicExpression727); 

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
    // $ANTLR end entryRuleBinaryLogicExpression


    // $ANTLR start ruleBinaryLogicExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:378:1: ruleBinaryLogicExpression : ( ( rule__BinaryLogicExpression__Group__0 ) ) ;
    public final void ruleBinaryLogicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:382:2: ( ( ( rule__BinaryLogicExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:383:1: ( ( rule__BinaryLogicExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:383:1: ( ( rule__BinaryLogicExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:384:1: ( rule__BinaryLogicExpression__Group__0 )
            {
             before(grammarAccess.getBinaryLogicExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:385:1: ( rule__BinaryLogicExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:385:2: rule__BinaryLogicExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group__0_in_ruleBinaryLogicExpression753);
            rule__BinaryLogicExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBinaryLogicExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBinaryLogicExpression


    // $ANTLR start entryRuleUnaryExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:397:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:398:1: ( ruleUnaryExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:399:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression780);
            ruleUnaryExpression();
            _fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression787); 

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
    // $ANTLR end entryRuleUnaryExpression


    // $ANTLR start ruleUnaryExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:406:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:410:2: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:411:1: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:411:1: ( ( rule__UnaryExpression__Group__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:412:1: ( rule__UnaryExpression__Group__0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:413:1: ( rule__UnaryExpression__Group__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:413:2: rule__UnaryExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group__0_in_ruleUnaryExpression813);
            rule__UnaryExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryExpression


    // $ANTLR start entryRuleLiteralExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:425:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:426:1: ( ruleLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:427:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression840);
            ruleLiteralExpression();
            _fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralExpression847); 

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
    // $ANTLR end entryRuleLiteralExpression


    // $ANTLR start ruleLiteralExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:434:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:438:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:439:1: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:439:1: ( ( rule__LiteralExpression__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:440:1: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:441:1: ( rule__LiteralExpression__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:441:2: rule__LiteralExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Alternatives_in_ruleLiteralExpression873);
            rule__LiteralExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLiteralExpression


    // $ANTLR start entryRuleAttributeExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:453:1: entryRuleAttributeExpression : ruleAttributeExpression EOF ;
    public final void entryRuleAttributeExpression() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:454:1: ( ruleAttributeExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:455:1: ruleAttributeExpression EOF
            {
             before(grammarAccess.getAttributeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_entryRuleAttributeExpression900);
            ruleAttributeExpression();
            _fsp--;

             after(grammarAccess.getAttributeExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeExpression907); 

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
    // $ANTLR end entryRuleAttributeExpression


    // $ANTLR start ruleAttributeExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:462:1: ruleAttributeExpression : ( ( rule__AttributeExpression__Alternatives ) ) ;
    public final void ruleAttributeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:466:2: ( ( ( rule__AttributeExpression__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:467:1: ( ( rule__AttributeExpression__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:467:1: ( ( rule__AttributeExpression__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:468:1: ( rule__AttributeExpression__Alternatives )
            {
             before(grammarAccess.getAttributeExpressionAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:469:1: ( rule__AttributeExpression__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:469:2: rule__AttributeExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeExpression__Alternatives_in_ruleAttributeExpression933);
            rule__AttributeExpression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAttributeExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttributeExpression


    // $ANTLR start entryRuleIdentifierOrValue
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:481:1: entryRuleIdentifierOrValue : ruleIdentifierOrValue EOF ;
    public final void entryRuleIdentifierOrValue() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:482:1: ( ruleIdentifierOrValue EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:483:1: ruleIdentifierOrValue EOF
            {
             before(grammarAccess.getIdentifierOrValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifierOrValue_in_entryRuleIdentifierOrValue960);
            ruleIdentifierOrValue();
            _fsp--;

             after(grammarAccess.getIdentifierOrValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifierOrValue967); 

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
    // $ANTLR end entryRuleIdentifierOrValue


    // $ANTLR start ruleIdentifierOrValue
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:490:1: ruleIdentifierOrValue : ( RULE_NUMBER ) ;
    public final void ruleIdentifierOrValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:494:2: ( ( RULE_NUMBER ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:495:1: ( RULE_NUMBER )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:495:1: ( RULE_NUMBER )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:496:1: RULE_NUMBER
            {
             before(grammarAccess.getIdentifierOrValueAccess().getNUMBERTerminalRuleCall()); 
            match(input,RULE_NUMBER,FollowSets000.FOLLOW_RULE_NUMBER_in_ruleIdentifierOrValue993); 
             after(grammarAccess.getIdentifierOrValueAccess().getNUMBERTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIdentifierOrValue


    // $ANTLR start ruleAssignOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:510:1: ruleAssignOperator : ( ( rule__AssignOperator__Alternatives ) ) ;
    public final void ruleAssignOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:514:1: ( ( ( rule__AssignOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:515:1: ( ( rule__AssignOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:515:1: ( ( rule__AssignOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:516:1: ( rule__AssignOperator__Alternatives )
            {
             before(grammarAccess.getAssignOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:517:1: ( rule__AssignOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:517:2: rule__AssignOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AssignOperator__Alternatives_in_ruleAssignOperator1029);
            rule__AssignOperator__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleAssignOperator


    // $ANTLR start ruleIncrementDecrementOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:529:1: ruleIncrementDecrementOperator : ( ( rule__IncrementDecrementOperator__Alternatives ) ) ;
    public final void ruleIncrementDecrementOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:533:1: ( ( ( rule__IncrementDecrementOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:534:1: ( ( rule__IncrementDecrementOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:534:1: ( ( rule__IncrementDecrementOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:535:1: ( rule__IncrementDecrementOperator__Alternatives )
            {
             before(grammarAccess.getIncrementDecrementOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:536:1: ( rule__IncrementDecrementOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:536:2: rule__IncrementDecrementOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__IncrementDecrementOperator__Alternatives_in_ruleIncrementDecrementOperator1065);
            rule__IncrementDecrementOperator__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getIncrementDecrementOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIncrementDecrementOperator


    // $ANTLR start ruleLogicOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:548:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:552:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:553:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:553:1: ( ( rule__LogicOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:554:1: ( rule__LogicOperator__Alternatives )
            {
             before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:555:1: ( rule__LogicOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:555:2: rule__LogicOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator1101);
            rule__LogicOperator__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLogicOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLogicOperator


    // $ANTLR start ruleArithmeticOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:567:1: ruleArithmeticOperator : ( ( rule__ArithmeticOperator__Alternatives ) ) ;
    public final void ruleArithmeticOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:571:1: ( ( ( rule__ArithmeticOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:572:1: ( ( rule__ArithmeticOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:572:1: ( ( rule__ArithmeticOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:573:1: ( rule__ArithmeticOperator__Alternatives )
            {
             before(grammarAccess.getArithmeticOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:574:1: ( rule__ArithmeticOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:574:2: rule__ArithmeticOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticOperator__Alternatives_in_ruleArithmeticOperator1137);
            rule__ArithmeticOperator__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getArithmeticOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArithmeticOperator


    // $ANTLR start ruleComparingOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:586:1: ruleComparingOperator : ( ( rule__ComparingOperator__Alternatives ) ) ;
    public final void ruleComparingOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:590:1: ( ( ( rule__ComparingOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:591:1: ( ( rule__ComparingOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:591:1: ( ( rule__ComparingOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:592:1: ( rule__ComparingOperator__Alternatives )
            {
             before(grammarAccess.getComparingOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:593:1: ( rule__ComparingOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:593:2: rule__ComparingOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparingOperator__Alternatives_in_ruleComparingOperator1173);
            rule__ComparingOperator__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getComparingOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleComparingOperator


    // $ANTLR start ruleUnaryOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:605:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:609:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:610:1: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:610:1: ( ( rule__UnaryOperator__Alternatives ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:611:1: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:612:1: ( rule__UnaryOperator__Alternatives )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:612:2: rule__UnaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1209);
            rule__UnaryOperator__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnaryOperator


    // $ANTLR start rule__ExpressionStartRule__Alternatives
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:623:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) );
    public final void rule__ExpressionStartRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:627:1: ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 42:
                {
                alt1=2;
                }
                break;
            case 46:
                {
                alt1=3;
                }
                break;
            case 47:
                {
                alt1=4;
                }
                break;
            case 48:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("623:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:628:1: ( ruleAssignment )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:628:1: ( ruleAssignment )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:629:1: ruleAssignment
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__ExpressionStartRule__Alternatives1244);
                    ruleAssignment();
                    _fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:634:6: ( ruleForLoop )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:634:6: ( ruleForLoop )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:635:1: ruleForLoop
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_rule__ExpressionStartRule__Alternatives1261);
                    ruleForLoop();
                    _fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:640:6: ( ruleWhileLoop )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:640:6: ( ruleWhileLoop )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:641:1: ruleWhileLoop
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_rule__ExpressionStartRule__Alternatives1278);
                    ruleWhileLoop();
                    _fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:646:6: ( ruleDoWhileLoop )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:646:6: ( ruleDoWhileLoop )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:647:1: ruleDoWhileLoop
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_rule__ExpressionStartRule__Alternatives1295);
                    ruleDoWhileLoop();
                    _fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:652:6: ( ruleIfStatement )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:652:6: ( ruleIfStatement )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:653:1: ruleIfStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_rule__ExpressionStartRule__Alternatives1312);
                    ruleIfStatement();
                    _fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 

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
    // $ANTLR end rule__ExpressionStartRule__Alternatives


    // $ANTLR start rule__Assignment__Alternatives_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:663:1: rule__Assignment__Alternatives_1 : ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) );
    public final void rule__Assignment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:667:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=17)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=18 && LA2_0<=19)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("663:1: rule__Assignment__Alternatives_1 : ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:668:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:668:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:669:1: ( rule__Assignment__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:670:1: ( rule__Assignment__Group_1_0__0 )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:670:2: rule__Assignment__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group_1_0__0_in_rule__Assignment__Alternatives_11344);
                    rule__Assignment__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:674:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:674:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:675:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:676:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:676:2: rule__Assignment__IncrementDecrementOperatorAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Assignment__IncrementDecrementOperatorAssignment_1_1_in_rule__Assignment__Alternatives_11362);
                    rule__Assignment__IncrementDecrementOperatorAssignment_1_1();
                    _fsp--;


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
    // $ANTLR end rule__Assignment__Alternatives_1


    // $ANTLR start rule__ForLoopCountingExpression__Alternatives_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:685:1: rule__ForLoopCountingExpression__Alternatives_1 : ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) );
    public final void rule__ForLoopCountingExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:689:1: ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=19)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=12 && LA3_0<=17)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("685:1: rule__ForLoopCountingExpression__Alternatives_1 : ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:690:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:690:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:691:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:692:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:692:2: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0_in_rule__ForLoopCountingExpression__Alternatives_11395);
                    rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:696:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:696:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:697:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:698:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:698:2: rule__ForLoopCountingExpression__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__Group_1_1__0_in_rule__ForLoopCountingExpression__Alternatives_11413);
                    rule__ForLoopCountingExpression__Group_1_1__0();
                    _fsp--;


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
    // $ANTLR end rule__ForLoopCountingExpression__Alternatives_1


    // $ANTLR start rule__BinaryLogicExpression__Alternatives_0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:707:1: rule__BinaryLogicExpression__Alternatives_0 : ( ( ruleUnaryExpression ) | ( ruleAttributeExpression ) );
    public final void rule__BinaryLogicExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:711:1: ( ( ruleUnaryExpression ) | ( ruleAttributeExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=27 && LA4_0<=28)||LA4_0==39) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_NUMBER && LA4_0<=RULE_ID)||LA4_0==43) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("707:1: rule__BinaryLogicExpression__Alternatives_0 : ( ( ruleUnaryExpression ) | ( ruleAttributeExpression ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:712:1: ( ruleUnaryExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:712:1: ( ruleUnaryExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:713:1: ruleUnaryExpression
                    {
                     before(grammarAccess.getBinaryLogicExpressionAccess().getUnaryExpressionParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__BinaryLogicExpression__Alternatives_01446);
                    ruleUnaryExpression();
                    _fsp--;

                     after(grammarAccess.getBinaryLogicExpressionAccess().getUnaryExpressionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:718:6: ( ruleAttributeExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:718:6: ( ruleAttributeExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:719:1: ruleAttributeExpression
                    {
                     before(grammarAccess.getBinaryLogicExpressionAccess().getAttributeExpressionParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_rule__BinaryLogicExpression__Alternatives_01463);
                    ruleAttributeExpression();
                    _fsp--;

                     after(grammarAccess.getBinaryLogicExpressionAccess().getAttributeExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end rule__BinaryLogicExpression__Alternatives_0


    // $ANTLR start rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:729:1: rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0 : ( ( ruleUnaryExpression ) | ( ruleAttributeExpression ) );
    public final void rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:733:1: ( ( ruleUnaryExpression ) | ( ruleAttributeExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=27 && LA5_0<=28)||LA5_0==39) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_NUMBER && LA5_0<=RULE_ID)||LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("729:1: rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0 : ( ( ruleUnaryExpression ) | ( ruleAttributeExpression ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:734:1: ( ruleUnaryExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:734:1: ( ruleUnaryExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:735:1: ruleUnaryExpression
                    {
                     before(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_1_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_01495);
                    ruleUnaryExpression();
                    _fsp--;

                     after(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:740:6: ( ruleAttributeExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:740:6: ( ruleAttributeExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:741:1: ruleAttributeExpression
                    {
                     before(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAttributeExpressionParserRuleCall_1_1_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_01512);
                    ruleAttributeExpression();
                    _fsp--;

                     after(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAttributeExpressionParserRuleCall_1_1_0_1()); 

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
    // $ANTLR end rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0


    // $ANTLR start rule__LiteralExpression__Alternatives
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:751:1: rule__LiteralExpression__Alternatives : ( ( ( rule__LiteralExpression__Group_0__0 ) ) | ( ( rule__LiteralExpression__Group_1__0 ) ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:755:1: ( ( ( rule__LiteralExpression__Group_0__0 ) ) | ( ( rule__LiteralExpression__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_NUMBER) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("751:1: rule__LiteralExpression__Alternatives : ( ( ( rule__LiteralExpression__Group_0__0 ) ) | ( ( rule__LiteralExpression__Group_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:756:1: ( ( rule__LiteralExpression__Group_0__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:756:1: ( ( rule__LiteralExpression__Group_0__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:757:1: ( rule__LiteralExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getGroup_0()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:758:1: ( rule__LiteralExpression__Group_0__0 )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:758:2: rule__LiteralExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_0__0_in_rule__LiteralExpression__Alternatives1544);
                    rule__LiteralExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getLiteralExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:762:6: ( ( rule__LiteralExpression__Group_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:762:6: ( ( rule__LiteralExpression__Group_1__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:763:1: ( rule__LiteralExpression__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getGroup_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:764:1: ( rule__LiteralExpression__Group_1__0 )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:764:2: rule__LiteralExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_1__0_in_rule__LiteralExpression__Alternatives1562);
                    rule__LiteralExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getLiteralExpressionAccess().getGroup_1()); 

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
    // $ANTLR end rule__LiteralExpression__Alternatives


    // $ANTLR start rule__AttributeExpression__Alternatives
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:773:1: rule__AttributeExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ( rule__AttributeExpression__Group_1__0 ) ) );
    public final void rule__AttributeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:777:1: ( ( ruleLiteralExpression ) | ( ( rule__AttributeExpression__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NUMBER||LA7_0==43) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("773:1: rule__AttributeExpression__Alternatives : ( ( ruleLiteralExpression ) | ( ( rule__AttributeExpression__Group_1__0 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:778:1: ( ruleLiteralExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:778:1: ( ruleLiteralExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:779:1: ruleLiteralExpression
                    {
                     before(grammarAccess.getAttributeExpressionAccess().getLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_rule__AttributeExpression__Alternatives1595);
                    ruleLiteralExpression();
                    _fsp--;

                     after(grammarAccess.getAttributeExpressionAccess().getLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:784:6: ( ( rule__AttributeExpression__Group_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:784:6: ( ( rule__AttributeExpression__Group_1__0 ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:785:1: ( rule__AttributeExpression__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeExpressionAccess().getGroup_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:786:1: ( rule__AttributeExpression__Group_1__0 )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:786:2: rule__AttributeExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AttributeExpression__Group_1__0_in_rule__AttributeExpression__Alternatives1612);
                    rule__AttributeExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAttributeExpressionAccess().getGroup_1()); 

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
    // $ANTLR end rule__AttributeExpression__Alternatives


    // $ANTLR start rule__AssignOperator__Alternatives
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:795:1: rule__AssignOperator__Alternatives : ( ( ( '=' ) ) | ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '=+' ) ) | ( ( '-=' ) ) | ( ( '=-' ) ) );
    public final void rule__AssignOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:799:1: ( ( ( '=' ) ) | ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '=+' ) ) | ( ( '-=' ) ) | ( ( '=-' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            case 17:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("795:1: rule__AssignOperator__Alternatives : ( ( ( '=' ) ) | ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '=+' ) ) | ( ( '-=' ) ) | ( ( '=-' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:800:1: ( ( '=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:800:1: ( ( '=' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:801:1: ( '=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:802:1: ( '=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:802:3: '='
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__AssignOperator__Alternatives1646); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:807:6: ( ( ':=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:807:6: ( ( ':=' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:808:1: ( ':=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getASSIGN2EnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:809:1: ( ':=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:809:3: ':='
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__AssignOperator__Alternatives1667); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getASSIGN2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:814:6: ( ( '+=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:814:6: ( ( '+=' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:815:1: ( '+=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:816:1: ( '+=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:816:3: '+='
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__AssignOperator__Alternatives1688); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:821:6: ( ( '=+' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:821:6: ( ( '=+' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:822:1: ( '=+' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_3()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:823:1: ( '=+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:823:3: '=+'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__AssignOperator__Alternatives1709); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:828:6: ( ( '-=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:828:6: ( ( '-=' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:829:1: ( '-=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_4()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:830:1: ( '-=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:830:3: '-='
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__AssignOperator__Alternatives1730); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:835:6: ( ( '=-' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:835:6: ( ( '=-' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:836:1: ( '=-' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getEQUAL_MINUSEnumLiteralDeclaration_5()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:837:1: ( '=-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:837:3: '=-'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__AssignOperator__Alternatives1751); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getEQUAL_MINUSEnumLiteralDeclaration_5()); 

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
    // $ANTLR end rule__AssignOperator__Alternatives


    // $ANTLR start rule__IncrementDecrementOperator__Alternatives
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:847:1: rule__IncrementDecrementOperator__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__IncrementDecrementOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:851:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("847:1: rule__IncrementDecrementOperator__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:852:1: ( ( '++' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:852:1: ( ( '++' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:853:1: ( '++' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:854:1: ( '++' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:854:3: '++'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__IncrementDecrementOperator__Alternatives1787); 

                    }

                     after(grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:859:6: ( ( '--' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:859:6: ( ( '--' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:860:1: ( '--' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:861:1: ( '--' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:861:3: '--'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__IncrementDecrementOperator__Alternatives1808); 

                    }

                     after(grammarAccess.getIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__IncrementDecrementOperator__Alternatives


    // $ANTLR start rule__LogicOperator__Alternatives
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:871:1: rule__LogicOperator__Alternatives : ( ( ( '&' ) ) | ( ( '&&' ) ) | ( ( '|' ) ) | ( ( '||' ) ) | ( ( 'xor' ) ) | ( ( '=>' ) ) | ( ( '<=>' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:875:1: ( ( ( '&' ) ) | ( ( '&&' ) ) | ( ( '|' ) ) | ( ( '||' ) ) | ( ( 'xor' ) ) | ( ( '=>' ) ) | ( ( '<=>' ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            case 25:
                {
                alt10=6;
                }
                break;
            case 26:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("871:1: rule__LogicOperator__Alternatives : ( ( ( '&' ) ) | ( ( '&&' ) ) | ( ( '|' ) ) | ( ( '||' ) ) | ( ( 'xor' ) ) | ( ( '=>' ) ) | ( ( '<=>' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:876:1: ( ( '&' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:876:1: ( ( '&' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:877:1: ( '&' )
                    {
                     before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:878:1: ( '&' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:878:3: '&'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__LogicOperator__Alternatives1844); 

                    }

                     after(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:883:6: ( ( '&&' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:883:6: ( ( '&&' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:884:1: ( '&&' )
                    {
                     before(grammarAccess.getLogicOperatorAccess().getAND_ANDEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:885:1: ( '&&' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:885:3: '&&'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__LogicOperator__Alternatives1865); 

                    }

                     after(grammarAccess.getLogicOperatorAccess().getAND_ANDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:890:6: ( ( '|' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:890:6: ( ( '|' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:891:1: ( '|' )
                    {
                     before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:892:1: ( '|' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:892:3: '|'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__LogicOperator__Alternatives1886); 

                    }

                     after(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:897:6: ( ( '||' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:897:6: ( ( '||' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:898:1: ( '||' )
                    {
                     before(grammarAccess.getLogicOperatorAccess().getOR_OREnumLiteralDeclaration_3()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:899:1: ( '||' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:899:3: '||'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__LogicOperator__Alternatives1907); 

                    }

                     after(grammarAccess.getLogicOperatorAccess().getOR_OREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:904:6: ( ( 'xor' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:904:6: ( ( 'xor' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:905:1: ( 'xor' )
                    {
                     before(grammarAccess.getLogicOperatorAccess().getXOREnumLiteralDeclaration_4()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:906:1: ( 'xor' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:906:3: 'xor'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__LogicOperator__Alternatives1928); 

                    }

                     after(grammarAccess.getLogicOperatorAccess().getXOREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:911:6: ( ( '=>' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:911:6: ( ( '=>' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:912:1: ( '=>' )
                    {
                     before(grammarAccess.getLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_5()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:913:1: ( '=>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:913:3: '=>'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__LogicOperator__Alternatives1949); 

                    }

                     after(grammarAccess.getLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:918:6: ( ( '<=>' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:918:6: ( ( '<=>' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:919:1: ( '<=>' )
                    {
                     before(grammarAccess.getLogicOperatorAccess().getEQUIVALENTEnumLiteralDeclaration_6()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:920:1: ( '<=>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:920:3: '<=>'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__LogicOperator__Alternatives1970); 

                    }

                     after(grammarAccess.getLogicOperatorAccess().getEQUIVALENTEnumLiteralDeclaration_6()); 

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
    // $ANTLR end rule__LogicOperator__Alternatives


    // $ANTLR start rule__ArithmeticOperator__Alternatives
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:930:1: rule__ArithmeticOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) | ( ( '^' ) ) );
    public final void rule__ArithmeticOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:934:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) | ( ( '^' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            case 31:
                {
                alt11=5;
                }
                break;
            case 32:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("930:1: rule__ArithmeticOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) | ( ( '^' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:935:1: ( ( '+' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:935:1: ( ( '+' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:936:1: ( '+' )
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:937:1: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:937:3: '+'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__ArithmeticOperator__Alternatives2006); 

                    }

                     after(grammarAccess.getArithmeticOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:942:6: ( ( '-' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:942:6: ( ( '-' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:943:1: ( '-' )
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:944:1: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:944:3: '-'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__ArithmeticOperator__Alternatives2027); 

                    }

                     after(grammarAccess.getArithmeticOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:949:6: ( ( '*' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:949:6: ( ( '*' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:950:1: ( '*' )
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getTIMESEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:951:1: ( '*' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:951:3: '*'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__ArithmeticOperator__Alternatives2048); 

                    }

                     after(grammarAccess.getArithmeticOperatorAccess().getTIMESEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:956:6: ( ( '/' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:956:6: ( ( '/' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:957:1: ( '/' )
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getDIVIDEEnumLiteralDeclaration_3()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:958:1: ( '/' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:958:3: '/'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__ArithmeticOperator__Alternatives2069); 

                    }

                     after(grammarAccess.getArithmeticOperatorAccess().getDIVIDEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:963:6: ( ( '%' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:963:6: ( ( '%' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:964:1: ( '%' )
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getMODULOEnumLiteralDeclaration_4()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:965:1: ( '%' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:965:3: '%'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__ArithmeticOperator__Alternatives2090); 

                    }

                     after(grammarAccess.getArithmeticOperatorAccess().getMODULOEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:970:6: ( ( '^' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:970:6: ( ( '^' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:971:1: ( '^' )
                    {
                     before(grammarAccess.getArithmeticOperatorAccess().getEXPEnumLiteralDeclaration_5()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:972:1: ( '^' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:972:3: '^'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__ArithmeticOperator__Alternatives2111); 

                    }

                     after(grammarAccess.getArithmeticOperatorAccess().getEXPEnumLiteralDeclaration_5()); 

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
    // $ANTLR end rule__ArithmeticOperator__Alternatives


    // $ANTLR start rule__ComparingOperator__Alternatives
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:982:1: rule__ComparingOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<>' ) ) );
    public final void rule__ComparingOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:986:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<>' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            case 36:
                {
                alt12=4;
                }
                break;
            case 37:
                {
                alt12=5;
                }
                break;
            case 38:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("982:1: rule__ComparingOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<>' ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:987:1: ( ( '<' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:987:1: ( ( '<' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:988:1: ( '<' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:989:1: ( '<' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:989:3: '<'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__ComparingOperator__Alternatives2147); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:994:6: ( ( '<=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:994:6: ( ( '<=' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:995:1: ( '<=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:996:1: ( '<=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:996:3: '<='
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__ComparingOperator__Alternatives2168); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1001:6: ( ( '==' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1001:6: ( ( '==' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1002:1: ( '==' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1003:1: ( '==' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1003:3: '=='
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_rule__ComparingOperator__Alternatives2189); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1008:6: ( ( '>=' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1008:6: ( ( '>=' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1009:1: ( '>=' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1010:1: ( '>=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1010:3: '>='
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__ComparingOperator__Alternatives2210); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1015:6: ( ( '>' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1015:6: ( ( '>' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1016:1: ( '>' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_4()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1017:1: ( '>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1017:3: '>'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rule__ComparingOperator__Alternatives2231); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1022:6: ( ( '<>' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1022:6: ( ( '<>' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1023:1: ( '<>' )
                    {
                     before(grammarAccess.getComparingOperatorAccess().getUNEQUALEnumLiteralDeclaration_5()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1024:1: ( '<>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1024:3: '<>'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_rule__ComparingOperator__Alternatives2252); 

                    }

                     after(grammarAccess.getComparingOperatorAccess().getUNEQUALEnumLiteralDeclaration_5()); 

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
    // $ANTLR end rule__ComparingOperator__Alternatives


    // $ANTLR start rule__UnaryOperator__Alternatives
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1034:1: rule__UnaryOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) | ( ( '+' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1038:1: ( ( ( 'not' ) ) | ( ( '-' ) ) | ( ( '+' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1034:1: rule__UnaryOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) | ( ( '+' ) ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1039:1: ( ( 'not' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1039:1: ( ( 'not' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1040:1: ( 'not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1041:1: ( 'not' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1041:3: 'not'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_rule__UnaryOperator__Alternatives2288); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1046:6: ( ( '-' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1046:6: ( ( '-' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1047:1: ( '-' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1048:1: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1048:3: '-'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__UnaryOperator__Alternatives2309); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1053:6: ( ( '+' ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1053:6: ( ( '+' ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1054:1: ( '+' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getPLUSEnumLiteralDeclaration_2()); 
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1055:1: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1055:3: '+'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__UnaryOperator__Alternatives2330); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getPLUSEnumLiteralDeclaration_2()); 

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
    // $ANTLR end rule__UnaryOperator__Alternatives


    // $ANTLR start rule__Block__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1067:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1071:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1072:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__02363);
            rule__Block__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__1_in_rule__Block__Group__02366);
            rule__Block__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__0


    // $ANTLR start rule__Block__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1079:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1083:1: ( ( '{' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1084:1: ( '{' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1084:1: ( '{' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1085:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Block__Group__0__Impl2394); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__0__Impl


    // $ANTLR start rule__Block__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1098:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1102:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1103:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__12425);
            rule__Block__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__2_in_rule__Block__Group__12428);
            rule__Block__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__1


    // $ANTLR start rule__Block__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1110:1: rule__Block__Group__1__Impl : ( ( rule__Block__ExpressionsAssignment_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1114:1: ( ( ( rule__Block__ExpressionsAssignment_1 )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1115:1: ( ( rule__Block__ExpressionsAssignment_1 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1115:1: ( ( rule__Block__ExpressionsAssignment_1 )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1116:1: ( rule__Block__ExpressionsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1117:1: ( rule__Block__ExpressionsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==42||(LA14_0>=46 && LA14_0<=48)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1117:2: rule__Block__ExpressionsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Block__ExpressionsAssignment_1_in_rule__Block__Group__1__Impl2455);
            	    rule__Block__ExpressionsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getExpressionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__1__Impl


    // $ANTLR start rule__Block__Group__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1127:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1131:1: ( rule__Block__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1132:2: rule__Block__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__22486);
            rule__Block__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__2


    // $ANTLR start rule__Block__Group__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1138:1: rule__Block__Group__2__Impl : ( '}' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1142:1: ( ( '}' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1143:1: ( '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1143:1: ( '}' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1144:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Block__Group__2__Impl2514); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__2__Impl


    // $ANTLR start rule__ForLoop__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1163:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1167:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1168:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__0__Impl_in_rule__ForLoop__Group__02551);
            rule__ForLoop__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__1_in_rule__ForLoop__Group__02554);
            rule__ForLoop__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__Group__0


    // $ANTLR start rule__ForLoop__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1175:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1179:1: ( ( 'for' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1180:1: ( 'for' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1180:1: ( 'for' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1181:1: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ForLoop__Group__0__Impl2582); 
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
    // $ANTLR end rule__ForLoop__Group__0__Impl


    // $ANTLR start rule__ForLoop__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1194:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1198:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1199:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__1__Impl_in_rule__ForLoop__Group__12613);
            rule__ForLoop__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__2_in_rule__ForLoop__Group__12616);
            rule__ForLoop__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__Group__1


    // $ANTLR start rule__ForLoop__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1206:1: rule__ForLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1210:1: ( ( '(' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1211:1: ( '(' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1211:1: ( '(' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1212:1: '('
            {
             before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__ForLoop__Group__1__Impl2644); 
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
    // $ANTLR end rule__ForLoop__Group__1__Impl


    // $ANTLR start rule__ForLoop__Group__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1225:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1229:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1230:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__2__Impl_in_rule__ForLoop__Group__22675);
            rule__ForLoop__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__3_in_rule__ForLoop__Group__22678);
            rule__ForLoop__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__Group__2


    // $ANTLR start rule__ForLoop__Group__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1237:1: rule__ForLoop__Group__2__Impl : ( ( rule__ForLoop__InitalizeExpressionAssignment_2 ) ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1241:1: ( ( ( rule__ForLoop__InitalizeExpressionAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1242:1: ( ( rule__ForLoop__InitalizeExpressionAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1242:1: ( ( rule__ForLoop__InitalizeExpressionAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1243:1: ( rule__ForLoop__InitalizeExpressionAssignment_2 )
            {
             before(grammarAccess.getForLoopAccess().getInitalizeExpressionAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1244:1: ( rule__ForLoop__InitalizeExpressionAssignment_2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1244:2: rule__ForLoop__InitalizeExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__InitalizeExpressionAssignment_2_in_rule__ForLoop__Group__2__Impl2705);
            rule__ForLoop__InitalizeExpressionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getForLoopAccess().getInitalizeExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__Group__2__Impl


    // $ANTLR start rule__ForLoop__Group__3
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1254:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1258:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1259:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__3__Impl_in_rule__ForLoop__Group__32735);
            rule__ForLoop__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__4_in_rule__ForLoop__Group__32738);
            rule__ForLoop__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__Group__3


    // $ANTLR start rule__ForLoop__Group__3__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1266:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__LoopTestAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1270:1: ( ( ( rule__ForLoop__LoopTestAssignment_3 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1271:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1271:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1272:1: ( rule__ForLoop__LoopTestAssignment_3 )
            {
             before(grammarAccess.getForLoopAccess().getLoopTestAssignment_3()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1273:1: ( rule__ForLoop__LoopTestAssignment_3 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1273:2: rule__ForLoop__LoopTestAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__LoopTestAssignment_3_in_rule__ForLoop__Group__3__Impl2765);
            rule__ForLoop__LoopTestAssignment_3();
            _fsp--;


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
    // $ANTLR end rule__ForLoop__Group__3__Impl


    // $ANTLR start rule__ForLoop__Group__4
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1283:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1287:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1288:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__4__Impl_in_rule__ForLoop__Group__42795);
            rule__ForLoop__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__5_in_rule__ForLoop__Group__42798);
            rule__ForLoop__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__Group__4


    // $ANTLR start rule__ForLoop__Group__4__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1295:1: rule__ForLoop__Group__4__Impl : ( ';' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1299:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1300:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1300:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1301:1: ';'
            {
             before(grammarAccess.getForLoopAccess().getSemicolonKeyword_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__ForLoop__Group__4__Impl2826); 
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
    // $ANTLR end rule__ForLoop__Group__4__Impl


    // $ANTLR start rule__ForLoop__Group__5
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1314:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1318:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1319:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__5__Impl_in_rule__ForLoop__Group__52857);
            rule__ForLoop__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__6_in_rule__ForLoop__Group__52860);
            rule__ForLoop__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__Group__5


    // $ANTLR start rule__ForLoop__Group__5__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1326:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1330:1: ( ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1331:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1331:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1332:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            {
             before(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1333:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1333:2: rule__ForLoop__CountingExpressionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__CountingExpressionAssignment_5_in_rule__ForLoop__Group__5__Impl2887);
            rule__ForLoop__CountingExpressionAssignment_5();
            _fsp--;


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
    // $ANTLR end rule__ForLoop__Group__5__Impl


    // $ANTLR start rule__ForLoop__Group__6
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1343:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1347:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1348:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__6__Impl_in_rule__ForLoop__Group__62917);
            rule__ForLoop__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__7_in_rule__ForLoop__Group__62920);
            rule__ForLoop__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__Group__6


    // $ANTLR start rule__ForLoop__Group__6__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1355:1: rule__ForLoop__Group__6__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1359:1: ( ( ')' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1360:1: ( ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1360:1: ( ')' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1361:1: ')'
            {
             before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__ForLoop__Group__6__Impl2948); 
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
    // $ANTLR end rule__ForLoop__Group__6__Impl


    // $ANTLR start rule__ForLoop__Group__7
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1374:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1378:1: ( rule__ForLoop__Group__7__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1379:2: rule__ForLoop__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__Group__7__Impl_in_rule__ForLoop__Group__72979);
            rule__ForLoop__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__Group__7


    // $ANTLR start rule__ForLoop__Group__7__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1385:1: rule__ForLoop__Group__7__Impl : ( ( rule__ForLoop__BlockAssignment_7 ) ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1389:1: ( ( ( rule__ForLoop__BlockAssignment_7 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1390:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1390:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1391:1: ( rule__ForLoop__BlockAssignment_7 )
            {
             before(grammarAccess.getForLoopAccess().getBlockAssignment_7()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1392:1: ( rule__ForLoop__BlockAssignment_7 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1392:2: rule__ForLoop__BlockAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoop__BlockAssignment_7_in_rule__ForLoop__Group__7__Impl3006);
            rule__ForLoop__BlockAssignment_7();
            _fsp--;


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
    // $ANTLR end rule__ForLoop__Group__7__Impl


    // $ANTLR start rule__WhileLoop__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1418:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1422:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1423:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__0__Impl_in_rule__WhileLoop__Group__03052);
            rule__WhileLoop__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__1_in_rule__WhileLoop__Group__03055);
            rule__WhileLoop__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileLoop__Group__0


    // $ANTLR start rule__WhileLoop__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1430:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1434:1: ( ( 'while' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1435:1: ( 'while' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1435:1: ( 'while' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1436:1: 'while'
            {
             before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__WhileLoop__Group__0__Impl3083); 
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
    // $ANTLR end rule__WhileLoop__Group__0__Impl


    // $ANTLR start rule__WhileLoop__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1449:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1453:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1454:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__1__Impl_in_rule__WhileLoop__Group__13114);
            rule__WhileLoop__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__2_in_rule__WhileLoop__Group__13117);
            rule__WhileLoop__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileLoop__Group__1


    // $ANTLR start rule__WhileLoop__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1461:1: rule__WhileLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1465:1: ( ( '(' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1466:1: ( '(' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1466:1: ( '(' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1467:1: '('
            {
             before(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__WhileLoop__Group__1__Impl3145); 
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
    // $ANTLR end rule__WhileLoop__Group__1__Impl


    // $ANTLR start rule__WhileLoop__Group__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1480:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1484:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1485:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__2__Impl_in_rule__WhileLoop__Group__23176);
            rule__WhileLoop__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__3_in_rule__WhileLoop__Group__23179);
            rule__WhileLoop__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileLoop__Group__2


    // $ANTLR start rule__WhileLoop__Group__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1492:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1496:1: ( ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1497:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1497:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1498:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1499:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1499:2: rule__WhileLoop__LoopTestAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__LoopTestAssignment_2_in_rule__WhileLoop__Group__2__Impl3206);
            rule__WhileLoop__LoopTestAssignment_2();
            _fsp--;


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
    // $ANTLR end rule__WhileLoop__Group__2__Impl


    // $ANTLR start rule__WhileLoop__Group__3
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1509:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1513:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1514:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__3__Impl_in_rule__WhileLoop__Group__33236);
            rule__WhileLoop__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__4_in_rule__WhileLoop__Group__33239);
            rule__WhileLoop__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileLoop__Group__3


    // $ANTLR start rule__WhileLoop__Group__3__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1521:1: rule__WhileLoop__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1525:1: ( ( ')' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1526:1: ( ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1526:1: ( ')' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1527:1: ')'
            {
             before(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__WhileLoop__Group__3__Impl3267); 
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
    // $ANTLR end rule__WhileLoop__Group__3__Impl


    // $ANTLR start rule__WhileLoop__Group__4
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1540:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1544:1: ( rule__WhileLoop__Group__4__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1545:2: rule__WhileLoop__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__Group__4__Impl_in_rule__WhileLoop__Group__43298);
            rule__WhileLoop__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__WhileLoop__Group__4


    // $ANTLR start rule__WhileLoop__Group__4__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1551:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__BlockAssignment_4 ) ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1555:1: ( ( ( rule__WhileLoop__BlockAssignment_4 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1556:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1556:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1557:1: ( rule__WhileLoop__BlockAssignment_4 )
            {
             before(grammarAccess.getWhileLoopAccess().getBlockAssignment_4()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1558:1: ( rule__WhileLoop__BlockAssignment_4 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1558:2: rule__WhileLoop__BlockAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WhileLoop__BlockAssignment_4_in_rule__WhileLoop__Group__4__Impl3325);
            rule__WhileLoop__BlockAssignment_4();
            _fsp--;


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
    // $ANTLR end rule__WhileLoop__Group__4__Impl


    // $ANTLR start rule__DoWhileLoop__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1578:1: rule__DoWhileLoop__Group__0 : rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 ;
    public final void rule__DoWhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1582:1: ( rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1583:2: rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__0__Impl_in_rule__DoWhileLoop__Group__03365);
            rule__DoWhileLoop__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__1_in_rule__DoWhileLoop__Group__03368);
            rule__DoWhileLoop__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoWhileLoop__Group__0


    // $ANTLR start rule__DoWhileLoop__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1590:1: rule__DoWhileLoop__Group__0__Impl : ( 'do' ) ;
    public final void rule__DoWhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1594:1: ( ( 'do' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1595:1: ( 'do' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1595:1: ( 'do' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1596:1: 'do'
            {
             before(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__DoWhileLoop__Group__0__Impl3396); 
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
    // $ANTLR end rule__DoWhileLoop__Group__0__Impl


    // $ANTLR start rule__DoWhileLoop__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1609:1: rule__DoWhileLoop__Group__1 : rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 ;
    public final void rule__DoWhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1613:1: ( rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1614:2: rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__1__Impl_in_rule__DoWhileLoop__Group__13427);
            rule__DoWhileLoop__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__2_in_rule__DoWhileLoop__Group__13430);
            rule__DoWhileLoop__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoWhileLoop__Group__1


    // $ANTLR start rule__DoWhileLoop__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1621:1: rule__DoWhileLoop__Group__1__Impl : ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) ;
    public final void rule__DoWhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1625:1: ( ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1626:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1626:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1627:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1628:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1628:2: rule__DoWhileLoop__BlockAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__BlockAssignment_1_in_rule__DoWhileLoop__Group__1__Impl3457);
            rule__DoWhileLoop__BlockAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__DoWhileLoop__Group__1__Impl


    // $ANTLR start rule__DoWhileLoop__Group__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1638:1: rule__DoWhileLoop__Group__2 : rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 ;
    public final void rule__DoWhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1642:1: ( rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1643:2: rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__2__Impl_in_rule__DoWhileLoop__Group__23487);
            rule__DoWhileLoop__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__3_in_rule__DoWhileLoop__Group__23490);
            rule__DoWhileLoop__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoWhileLoop__Group__2


    // $ANTLR start rule__DoWhileLoop__Group__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1650:1: rule__DoWhileLoop__Group__2__Impl : ( 'while' ) ;
    public final void rule__DoWhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1654:1: ( ( 'while' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1655:1: ( 'while' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1655:1: ( 'while' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1656:1: 'while'
            {
             before(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__DoWhileLoop__Group__2__Impl3518); 
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
    // $ANTLR end rule__DoWhileLoop__Group__2__Impl


    // $ANTLR start rule__DoWhileLoop__Group__3
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1669:1: rule__DoWhileLoop__Group__3 : rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 ;
    public final void rule__DoWhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1673:1: ( rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1674:2: rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__3__Impl_in_rule__DoWhileLoop__Group__33549);
            rule__DoWhileLoop__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__4_in_rule__DoWhileLoop__Group__33552);
            rule__DoWhileLoop__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoWhileLoop__Group__3


    // $ANTLR start rule__DoWhileLoop__Group__3__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1681:1: rule__DoWhileLoop__Group__3__Impl : ( '(' ) ;
    public final void rule__DoWhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1685:1: ( ( '(' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1686:1: ( '(' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1686:1: ( '(' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1687:1: '('
            {
             before(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__DoWhileLoop__Group__3__Impl3580); 
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
    // $ANTLR end rule__DoWhileLoop__Group__3__Impl


    // $ANTLR start rule__DoWhileLoop__Group__4
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1700:1: rule__DoWhileLoop__Group__4 : rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 ;
    public final void rule__DoWhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1704:1: ( rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1705:2: rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__4__Impl_in_rule__DoWhileLoop__Group__43611);
            rule__DoWhileLoop__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__5_in_rule__DoWhileLoop__Group__43614);
            rule__DoWhileLoop__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoWhileLoop__Group__4


    // $ANTLR start rule__DoWhileLoop__Group__4__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1712:1: rule__DoWhileLoop__Group__4__Impl : ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) ;
    public final void rule__DoWhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1716:1: ( ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1717:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1717:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1718:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1719:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1719:2: rule__DoWhileLoop__LoopTestAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__LoopTestAssignment_4_in_rule__DoWhileLoop__Group__4__Impl3641);
            rule__DoWhileLoop__LoopTestAssignment_4();
            _fsp--;


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
    // $ANTLR end rule__DoWhileLoop__Group__4__Impl


    // $ANTLR start rule__DoWhileLoop__Group__5
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1729:1: rule__DoWhileLoop__Group__5 : rule__DoWhileLoop__Group__5__Impl ;
    public final void rule__DoWhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1733:1: ( rule__DoWhileLoop__Group__5__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1734:2: rule__DoWhileLoop__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoWhileLoop__Group__5__Impl_in_rule__DoWhileLoop__Group__53671);
            rule__DoWhileLoop__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoWhileLoop__Group__5


    // $ANTLR start rule__DoWhileLoop__Group__5__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1740:1: rule__DoWhileLoop__Group__5__Impl : ( ')' ) ;
    public final void rule__DoWhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1744:1: ( ( ')' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1745:1: ( ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1745:1: ( ')' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1746:1: ')'
            {
             before(grammarAccess.getDoWhileLoopAccess().getRightParenthesisKeyword_5()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__DoWhileLoop__Group__5__Impl3699); 
             after(grammarAccess.getDoWhileLoopAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoWhileLoop__Group__5__Impl


    // $ANTLR start rule__IfStatement__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1771:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1775:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1776:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03742);
            rule__IfStatement__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03745);
            rule__IfStatement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__0


    // $ANTLR start rule__IfStatement__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1783:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1787:1: ( ( 'if' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1788:1: ( 'if' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1788:1: ( 'if' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1789:1: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__IfStatement__Group__0__Impl3773); 
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
    // $ANTLR end rule__IfStatement__Group__0__Impl


    // $ANTLR start rule__IfStatement__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1802:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1806:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1807:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13804);
            rule__IfStatement__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13807);
            rule__IfStatement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__1


    // $ANTLR start rule__IfStatement__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1814:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1818:1: ( ( '(' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1819:1: ( '(' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1819:1: ( '(' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1820:1: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__IfStatement__Group__1__Impl3835); 
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
    // $ANTLR end rule__IfStatement__Group__1__Impl


    // $ANTLR start rule__IfStatement__Group__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1833:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1837:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1838:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__23866);
            rule__IfStatement__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__23869);
            rule__IfStatement__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__2


    // $ANTLR start rule__IfStatement__Group__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1845:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__IfConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1849:1: ( ( ( rule__IfStatement__IfConditionAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1850:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1850:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1851:1: ( rule__IfStatement__IfConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1852:1: ( rule__IfStatement__IfConditionAssignment_2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1852:2: rule__IfStatement__IfConditionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__IfConditionAssignment_2_in_rule__IfStatement__Group__2__Impl3896);
            rule__IfStatement__IfConditionAssignment_2();
            _fsp--;


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
    // $ANTLR end rule__IfStatement__Group__2__Impl


    // $ANTLR start rule__IfStatement__Group__3
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1862:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1866:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1867:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__33926);
            rule__IfStatement__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__33929);
            rule__IfStatement__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__3


    // $ANTLR start rule__IfStatement__Group__3__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1874:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1878:1: ( ( ')' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1879:1: ( ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1879:1: ( ')' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1880:1: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__IfStatement__Group__3__Impl3957); 
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
    // $ANTLR end rule__IfStatement__Group__3__Impl


    // $ANTLR start rule__IfStatement__Group__4
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1893:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1897:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1898:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__43988);
            rule__IfStatement__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__5_in_rule__IfStatement__Group__43991);
            rule__IfStatement__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__4


    // $ANTLR start rule__IfStatement__Group__4__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1905:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__IfBlockAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1909:1: ( ( ( rule__IfStatement__IfBlockAssignment_4 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1910:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1910:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1911:1: ( rule__IfStatement__IfBlockAssignment_4 )
            {
             before(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1912:1: ( rule__IfStatement__IfBlockAssignment_4 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1912:2: rule__IfStatement__IfBlockAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__IfBlockAssignment_4_in_rule__IfStatement__Group__4__Impl4018);
            rule__IfStatement__IfBlockAssignment_4();
            _fsp--;


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
    // $ANTLR end rule__IfStatement__Group__4__Impl


    // $ANTLR start rule__IfStatement__Group__5
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1922:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1926:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1927:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__5__Impl_in_rule__IfStatement__Group__54048);
            rule__IfStatement__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__6_in_rule__IfStatement__Group__54051);
            rule__IfStatement__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__5


    // $ANTLR start rule__IfStatement__Group__5__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1934:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__Group_5__0 )* ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1938:1: ( ( ( rule__IfStatement__Group_5__0 )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1939:1: ( ( rule__IfStatement__Group_5__0 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1939:1: ( ( rule__IfStatement__Group_5__0 )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1940:1: ( rule__IfStatement__Group_5__0 )*
            {
             before(grammarAccess.getIfStatementAccess().getGroup_5()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1941:1: ( rule__IfStatement__Group_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==49) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1941:2: rule__IfStatement__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__0_in_rule__IfStatement__Group__5__Impl4078);
            	    rule__IfStatement__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__5__Impl


    // $ANTLR start rule__IfStatement__Group__6
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1951:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1955:1: ( rule__IfStatement__Group__6__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1956:2: rule__IfStatement__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group__6__Impl_in_rule__IfStatement__Group__64109);
            rule__IfStatement__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group__6


    // $ANTLR start rule__IfStatement__Group__6__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1962:1: rule__IfStatement__Group__6__Impl : ( ( rule__IfStatement__Group_6__0 )? ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1966:1: ( ( ( rule__IfStatement__Group_6__0 )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1967:1: ( ( rule__IfStatement__Group_6__0 )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1967:1: ( ( rule__IfStatement__Group_6__0 )? )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1968:1: ( rule__IfStatement__Group_6__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_6()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1969:1: ( rule__IfStatement__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==50) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1969:2: rule__IfStatement__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_6__0_in_rule__IfStatement__Group__6__Impl4136);
                    rule__IfStatement__Group_6__0();
                    _fsp--;


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
    // $ANTLR end rule__IfStatement__Group__6__Impl


    // $ANTLR start rule__IfStatement__Group_5__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1993:1: rule__IfStatement__Group_5__0 : rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 ;
    public final void rule__IfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1997:1: ( rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:1998:2: rule__IfStatement__Group_5__0__Impl rule__IfStatement__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__0__Impl_in_rule__IfStatement__Group_5__04181);
            rule__IfStatement__Group_5__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__1_in_rule__IfStatement__Group_5__04184);
            rule__IfStatement__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__0


    // $ANTLR start rule__IfStatement__Group_5__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2005:1: rule__IfStatement__Group_5__0__Impl : ( 'elseif' ) ;
    public final void rule__IfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2009:1: ( ( 'elseif' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2010:1: ( 'elseif' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2010:1: ( 'elseif' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2011:1: 'elseif'
            {
             before(grammarAccess.getIfStatementAccess().getElseifKeyword_5_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__IfStatement__Group_5__0__Impl4212); 
             after(grammarAccess.getIfStatementAccess().getElseifKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__0__Impl


    // $ANTLR start rule__IfStatement__Group_5__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2024:1: rule__IfStatement__Group_5__1 : rule__IfStatement__Group_5__1__Impl rule__IfStatement__Group_5__2 ;
    public final void rule__IfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2028:1: ( rule__IfStatement__Group_5__1__Impl rule__IfStatement__Group_5__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2029:2: rule__IfStatement__Group_5__1__Impl rule__IfStatement__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__1__Impl_in_rule__IfStatement__Group_5__14243);
            rule__IfStatement__Group_5__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__2_in_rule__IfStatement__Group_5__14246);
            rule__IfStatement__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__1


    // $ANTLR start rule__IfStatement__Group_5__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2036:1: rule__IfStatement__Group_5__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2040:1: ( ( '(' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2041:1: ( '(' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2041:1: ( '(' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2042:1: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__IfStatement__Group_5__1__Impl4274); 
             after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__1__Impl


    // $ANTLR start rule__IfStatement__Group_5__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2055:1: rule__IfStatement__Group_5__2 : rule__IfStatement__Group_5__2__Impl rule__IfStatement__Group_5__3 ;
    public final void rule__IfStatement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2059:1: ( rule__IfStatement__Group_5__2__Impl rule__IfStatement__Group_5__3 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2060:2: rule__IfStatement__Group_5__2__Impl rule__IfStatement__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__2__Impl_in_rule__IfStatement__Group_5__24305);
            rule__IfStatement__Group_5__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__3_in_rule__IfStatement__Group_5__24308);
            rule__IfStatement__Group_5__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__2


    // $ANTLR start rule__IfStatement__Group_5__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2067:1: rule__IfStatement__Group_5__2__Impl : ( ( rule__IfStatement__ElseIfConditionsAssignment_5_2 ) ) ;
    public final void rule__IfStatement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2071:1: ( ( ( rule__IfStatement__ElseIfConditionsAssignment_5_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2072:1: ( ( rule__IfStatement__ElseIfConditionsAssignment_5_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2072:1: ( ( rule__IfStatement__ElseIfConditionsAssignment_5_2 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2073:1: ( rule__IfStatement__ElseIfConditionsAssignment_5_2 )
            {
             before(grammarAccess.getIfStatementAccess().getElseIfConditionsAssignment_5_2()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2074:1: ( rule__IfStatement__ElseIfConditionsAssignment_5_2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2074:2: rule__IfStatement__ElseIfConditionsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__ElseIfConditionsAssignment_5_2_in_rule__IfStatement__Group_5__2__Impl4335);
            rule__IfStatement__ElseIfConditionsAssignment_5_2();
            _fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getElseIfConditionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__2__Impl


    // $ANTLR start rule__IfStatement__Group_5__3
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2084:1: rule__IfStatement__Group_5__3 : rule__IfStatement__Group_5__3__Impl rule__IfStatement__Group_5__4 ;
    public final void rule__IfStatement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2088:1: ( rule__IfStatement__Group_5__3__Impl rule__IfStatement__Group_5__4 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2089:2: rule__IfStatement__Group_5__3__Impl rule__IfStatement__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__3__Impl_in_rule__IfStatement__Group_5__34365);
            rule__IfStatement__Group_5__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__4_in_rule__IfStatement__Group_5__34368);
            rule__IfStatement__Group_5__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__3


    // $ANTLR start rule__IfStatement__Group_5__3__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2096:1: rule__IfStatement__Group_5__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2100:1: ( ( ')' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2101:1: ( ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2101:1: ( ')' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2102:1: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_5_3()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__IfStatement__Group_5__3__Impl4396); 
             after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__3__Impl


    // $ANTLR start rule__IfStatement__Group_5__4
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2115:1: rule__IfStatement__Group_5__4 : rule__IfStatement__Group_5__4__Impl ;
    public final void rule__IfStatement__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2119:1: ( rule__IfStatement__Group_5__4__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2120:2: rule__IfStatement__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_5__4__Impl_in_rule__IfStatement__Group_5__44427);
            rule__IfStatement__Group_5__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__4


    // $ANTLR start rule__IfStatement__Group_5__4__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2126:1: rule__IfStatement__Group_5__4__Impl : ( ( rule__IfStatement__ElseIfBlocksAssignment_5_4 ) ) ;
    public final void rule__IfStatement__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2130:1: ( ( ( rule__IfStatement__ElseIfBlocksAssignment_5_4 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2131:1: ( ( rule__IfStatement__ElseIfBlocksAssignment_5_4 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2131:1: ( ( rule__IfStatement__ElseIfBlocksAssignment_5_4 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2132:1: ( rule__IfStatement__ElseIfBlocksAssignment_5_4 )
            {
             before(grammarAccess.getIfStatementAccess().getElseIfBlocksAssignment_5_4()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2133:1: ( rule__IfStatement__ElseIfBlocksAssignment_5_4 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2133:2: rule__IfStatement__ElseIfBlocksAssignment_5_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__ElseIfBlocksAssignment_5_4_in_rule__IfStatement__Group_5__4__Impl4454);
            rule__IfStatement__ElseIfBlocksAssignment_5_4();
            _fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getElseIfBlocksAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_5__4__Impl


    // $ANTLR start rule__IfStatement__Group_6__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2153:1: rule__IfStatement__Group_6__0 : rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 ;
    public final void rule__IfStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2157:1: ( rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2158:2: rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_6__0__Impl_in_rule__IfStatement__Group_6__04494);
            rule__IfStatement__Group_6__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_6__1_in_rule__IfStatement__Group_6__04497);
            rule__IfStatement__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_6__0


    // $ANTLR start rule__IfStatement__Group_6__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2165:1: rule__IfStatement__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2169:1: ( ( 'else' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2170:1: ( 'else' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2170:1: ( 'else' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2171:1: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__IfStatement__Group_6__0__Impl4525); 
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
    // $ANTLR end rule__IfStatement__Group_6__0__Impl


    // $ANTLR start rule__IfStatement__Group_6__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2184:1: rule__IfStatement__Group_6__1 : rule__IfStatement__Group_6__1__Impl ;
    public final void rule__IfStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2188:1: ( rule__IfStatement__Group_6__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2189:2: rule__IfStatement__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__Group_6__1__Impl_in_rule__IfStatement__Group_6__14556);
            rule__IfStatement__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__Group_6__1


    // $ANTLR start rule__IfStatement__Group_6__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2195:1: rule__IfStatement__Group_6__1__Impl : ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) ;
    public final void rule__IfStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2199:1: ( ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2200:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2200:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2201:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            {
             before(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2202:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2202:2: rule__IfStatement__ElseBlockAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfStatement__ElseBlockAssignment_6_1_in_rule__IfStatement__Group_6__1__Impl4583);
            rule__IfStatement__ElseBlockAssignment_6_1();
            _fsp--;


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
    // $ANTLR end rule__IfStatement__Group_6__1__Impl


    // $ANTLR start rule__Assignment__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2216:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2220:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2221:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04617);
            rule__Assignment__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04620);
            rule__Assignment__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__0


    // $ANTLR start rule__Assignment__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2228:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__AttributeAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2232:1: ( ( ( rule__Assignment__AttributeAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2233:1: ( ( rule__Assignment__AttributeAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2233:1: ( ( rule__Assignment__AttributeAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2234:1: ( rule__Assignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getAttributeAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2235:1: ( rule__Assignment__AttributeAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2235:2: rule__Assignment__AttributeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__AttributeAssignment_0_in_rule__Assignment__Group__0__Impl4647);
            rule__Assignment__AttributeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__0__Impl


    // $ANTLR start rule__Assignment__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2245:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2249:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2250:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14677);
            rule__Assignment__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14680);
            rule__Assignment__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__1


    // $ANTLR start rule__Assignment__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2257:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Alternatives_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2261:1: ( ( ( rule__Assignment__Alternatives_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2262:1: ( ( rule__Assignment__Alternatives_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2262:1: ( ( rule__Assignment__Alternatives_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2263:1: ( rule__Assignment__Alternatives_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2264:1: ( rule__Assignment__Alternatives_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2264:2: rule__Assignment__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Alternatives_1_in_rule__Assignment__Group__1__Impl4707);
            rule__Assignment__Alternatives_1();
            _fsp--;


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
    // $ANTLR end rule__Assignment__Group__1__Impl


    // $ANTLR start rule__Assignment__Group__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2274:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2278:1: ( rule__Assignment__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2279:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24737);
            rule__Assignment__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group__2


    // $ANTLR start rule__Assignment__Group__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2285:1: rule__Assignment__Group__2__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2289:1: ( ( ';' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2290:1: ( ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2290:1: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2291:1: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_2()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Assignment__Group__2__Impl4765); 
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
    // $ANTLR end rule__Assignment__Group__2__Impl


    // $ANTLR start rule__Assignment__Group_1_0__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2310:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2314:1: ( rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2315:2: rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group_1_0__0__Impl_in_rule__Assignment__Group_1_0__04802);
            rule__Assignment__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group_1_0__1_in_rule__Assignment__Group_1_0__04805);
            rule__Assignment__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group_1_0__0


    // $ANTLR start rule__Assignment__Group_1_0__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2322:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2326:1: ( ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2327:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2327:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2328:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2329:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2329:2: rule__Assignment__AssignOperatorAssignment_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__AssignOperatorAssignment_1_0_0_in_rule__Assignment__Group_1_0__0__Impl4832);
            rule__Assignment__AssignOperatorAssignment_1_0_0();
            _fsp--;


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
    // $ANTLR end rule__Assignment__Group_1_0__0__Impl


    // $ANTLR start rule__Assignment__Group_1_0__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2339:1: rule__Assignment__Group_1_0__1 : rule__Assignment__Group_1_0__1__Impl ;
    public final void rule__Assignment__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2343:1: ( rule__Assignment__Group_1_0__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2344:2: rule__Assignment__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group_1_0__1__Impl_in_rule__Assignment__Group_1_0__14862);
            rule__Assignment__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group_1_0__1


    // $ANTLR start rule__Assignment__Group_1_0__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2350:1: rule__Assignment__Group_1_0__1__Impl : ( ( rule__Assignment__AssignExpressionAssignment_1_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2354:1: ( ( ( rule__Assignment__AssignExpressionAssignment_1_0_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2355:1: ( ( rule__Assignment__AssignExpressionAssignment_1_0_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2355:1: ( ( rule__Assignment__AssignExpressionAssignment_1_0_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2356:1: ( rule__Assignment__AssignExpressionAssignment_1_0_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAssignExpressionAssignment_1_0_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2357:1: ( rule__Assignment__AssignExpressionAssignment_1_0_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2357:2: rule__Assignment__AssignExpressionAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__AssignExpressionAssignment_1_0_1_in_rule__Assignment__Group_1_0__1__Impl4889);
            rule__Assignment__AssignExpressionAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAssignExpressionAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__Group_1_0__1__Impl


    // $ANTLR start rule__ForLoopCountingExpression__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2371:1: rule__ForLoopCountingExpression__Group__0 : rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 ;
    public final void rule__ForLoopCountingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2375:1: ( rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2376:2: rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__Group__0__Impl_in_rule__ForLoopCountingExpression__Group__04923);
            rule__ForLoopCountingExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__Group__1_in_rule__ForLoopCountingExpression__Group__04926);
            rule__ForLoopCountingExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoopCountingExpression__Group__0


    // $ANTLR start rule__ForLoopCountingExpression__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2383:1: rule__ForLoopCountingExpression__Group__0__Impl : ( ( rule__ForLoopCountingExpression__AttributeAssignment_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2387:1: ( ( ( rule__ForLoopCountingExpression__AttributeAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2388:1: ( ( rule__ForLoopCountingExpression__AttributeAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2388:1: ( ( rule__ForLoopCountingExpression__AttributeAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2389:1: ( rule__ForLoopCountingExpression__AttributeAssignment_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAttributeAssignment_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2390:1: ( rule__ForLoopCountingExpression__AttributeAssignment_0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2390:2: rule__ForLoopCountingExpression__AttributeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__AttributeAssignment_0_in_rule__ForLoopCountingExpression__Group__0__Impl4953);
            rule__ForLoopCountingExpression__AttributeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoopCountingExpression__Group__0__Impl


    // $ANTLR start rule__ForLoopCountingExpression__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2400:1: rule__ForLoopCountingExpression__Group__1 : rule__ForLoopCountingExpression__Group__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2404:1: ( rule__ForLoopCountingExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2405:2: rule__ForLoopCountingExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__Group__1__Impl_in_rule__ForLoopCountingExpression__Group__14983);
            rule__ForLoopCountingExpression__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoopCountingExpression__Group__1


    // $ANTLR start rule__ForLoopCountingExpression__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2411:1: rule__ForLoopCountingExpression__Group__1__Impl : ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2415:1: ( ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2416:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2416:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2417:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2418:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2418:2: rule__ForLoopCountingExpression__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__Alternatives_1_in_rule__ForLoopCountingExpression__Group__1__Impl5010);
            rule__ForLoopCountingExpression__Alternatives_1();
            _fsp--;


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
    // $ANTLR end rule__ForLoopCountingExpression__Group__1__Impl


    // $ANTLR start rule__ForLoopCountingExpression__Group_1_1__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2432:1: rule__ForLoopCountingExpression__Group_1_1__0 : rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2436:1: ( rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2437:2: rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__Group_1_1__0__Impl_in_rule__ForLoopCountingExpression__Group_1_1__05044);
            rule__ForLoopCountingExpression__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__Group_1_1__1_in_rule__ForLoopCountingExpression__Group_1_1__05047);
            rule__ForLoopCountingExpression__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoopCountingExpression__Group_1_1__0


    // $ANTLR start rule__ForLoopCountingExpression__Group_1_1__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2444:1: rule__ForLoopCountingExpression__Group_1_1__0__Impl : ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2448:1: ( ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2449:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2449:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2450:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2451:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2451:2: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0_in_rule__ForLoopCountingExpression__Group_1_1__0__Impl5074);
            rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0();
            _fsp--;


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
    // $ANTLR end rule__ForLoopCountingExpression__Group_1_1__0__Impl


    // $ANTLR start rule__ForLoopCountingExpression__Group_1_1__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2461:1: rule__ForLoopCountingExpression__Group_1_1__1 : rule__ForLoopCountingExpression__Group_1_1__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2465:1: ( rule__ForLoopCountingExpression__Group_1_1__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2466:2: rule__ForLoopCountingExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__Group_1_1__1__Impl_in_rule__ForLoopCountingExpression__Group_1_1__15104);
            rule__ForLoopCountingExpression__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoopCountingExpression__Group_1_1__1


    // $ANTLR start rule__ForLoopCountingExpression__Group_1_1__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2472:1: rule__ForLoopCountingExpression__Group_1_1__1__Impl : ( ( rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2476:1: ( ( ( rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2477:1: ( ( rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2477:1: ( ( rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2478:1: ( rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignExpressionAssignment_1_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2479:1: ( rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2479:2: rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1_in_rule__ForLoopCountingExpression__Group_1_1__1__Impl5131);
            rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getAssignExpressionAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoopCountingExpression__Group_1_1__1__Impl


    // $ANTLR start rule__ArithmeticExpression__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2493:1: rule__ArithmeticExpression__Group__0 : rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1 ;
    public final void rule__ArithmeticExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2497:1: ( rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2498:2: rule__ArithmeticExpression__Group__0__Impl rule__ArithmeticExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group__0__Impl_in_rule__ArithmeticExpression__Group__05165);
            rule__ArithmeticExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group__1_in_rule__ArithmeticExpression__Group__05168);
            rule__ArithmeticExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group__0


    // $ANTLR start rule__ArithmeticExpression__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2505:1: rule__ArithmeticExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__ArithmeticExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2509:1: ( ( ruleComparisonExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2510:1: ( ruleComparisonExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2510:1: ( ruleComparisonExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2511:1: ruleComparisonExpression
            {
             before(grammarAccess.getArithmeticExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__ArithmeticExpression__Group__0__Impl5195);
            ruleComparisonExpression();
            _fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group__0__Impl


    // $ANTLR start rule__ArithmeticExpression__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2522:1: rule__ArithmeticExpression__Group__1 : rule__ArithmeticExpression__Group__1__Impl ;
    public final void rule__ArithmeticExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2526:1: ( rule__ArithmeticExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2527:2: rule__ArithmeticExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group__1__Impl_in_rule__ArithmeticExpression__Group__15224);
            rule__ArithmeticExpression__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group__1


    // $ANTLR start rule__ArithmeticExpression__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2533:1: rule__ArithmeticExpression__Group__1__Impl : ( ( rule__ArithmeticExpression__Group_1__0 )* ) ;
    public final void rule__ArithmeticExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2537:1: ( ( ( rule__ArithmeticExpression__Group_1__0 )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2538:1: ( ( rule__ArithmeticExpression__Group_1__0 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2538:1: ( ( rule__ArithmeticExpression__Group_1__0 )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2539:1: ( rule__ArithmeticExpression__Group_1__0 )*
            {
             before(grammarAccess.getArithmeticExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2540:1: ( rule__ArithmeticExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=27 && LA17_0<=32)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2540:2: rule__ArithmeticExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group_1__0_in_rule__ArithmeticExpression__Group__1__Impl5251);
            	    rule__ArithmeticExpression__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getArithmeticExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group__1__Impl


    // $ANTLR start rule__ArithmeticExpression__Group_1__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2554:1: rule__ArithmeticExpression__Group_1__0 : rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1 ;
    public final void rule__ArithmeticExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2558:1: ( rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2559:2: rule__ArithmeticExpression__Group_1__0__Impl rule__ArithmeticExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group_1__0__Impl_in_rule__ArithmeticExpression__Group_1__05286);
            rule__ArithmeticExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group_1__1_in_rule__ArithmeticExpression__Group_1__05289);
            rule__ArithmeticExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group_1__0


    // $ANTLR start rule__ArithmeticExpression__Group_1__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2566:1: rule__ArithmeticExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ArithmeticExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2570:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2571:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2571:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2572:1: ()
            {
             before(grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2573:1: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2575:1: 
            {
            }

             after(grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group_1__0__Impl


    // $ANTLR start rule__ArithmeticExpression__Group_1__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2585:1: rule__ArithmeticExpression__Group_1__1 : rule__ArithmeticExpression__Group_1__1__Impl rule__ArithmeticExpression__Group_1__2 ;
    public final void rule__ArithmeticExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2589:1: ( rule__ArithmeticExpression__Group_1__1__Impl rule__ArithmeticExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2590:2: rule__ArithmeticExpression__Group_1__1__Impl rule__ArithmeticExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group_1__1__Impl_in_rule__ArithmeticExpression__Group_1__15347);
            rule__ArithmeticExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group_1__2_in_rule__ArithmeticExpression__Group_1__15350);
            rule__ArithmeticExpression__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group_1__1


    // $ANTLR start rule__ArithmeticExpression__Group_1__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2597:1: rule__ArithmeticExpression__Group_1__1__Impl : ( ( rule__ArithmeticExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ArithmeticExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2601:1: ( ( ( rule__ArithmeticExpression__OperatorAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2602:1: ( ( rule__ArithmeticExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2602:1: ( ( rule__ArithmeticExpression__OperatorAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2603:1: ( rule__ArithmeticExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getOperatorAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2604:1: ( rule__ArithmeticExpression__OperatorAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2604:2: rule__ArithmeticExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__OperatorAssignment_1_1_in_rule__ArithmeticExpression__Group_1__1__Impl5377);
            rule__ArithmeticExpression__OperatorAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group_1__1__Impl


    // $ANTLR start rule__ArithmeticExpression__Group_1__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2614:1: rule__ArithmeticExpression__Group_1__2 : rule__ArithmeticExpression__Group_1__2__Impl ;
    public final void rule__ArithmeticExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2618:1: ( rule__ArithmeticExpression__Group_1__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2619:2: rule__ArithmeticExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__Group_1__2__Impl_in_rule__ArithmeticExpression__Group_1__25407);
            rule__ArithmeticExpression__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group_1__2


    // $ANTLR start rule__ArithmeticExpression__Group_1__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2625:1: rule__ArithmeticExpression__Group_1__2__Impl : ( ( rule__ArithmeticExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__ArithmeticExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2629:1: ( ( ( rule__ArithmeticExpression__RightExpressionAssignment_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2630:1: ( ( rule__ArithmeticExpression__RightExpressionAssignment_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2630:1: ( ( rule__ArithmeticExpression__RightExpressionAssignment_1_2 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2631:1: ( rule__ArithmeticExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getArithmeticExpressionAccess().getRightExpressionAssignment_1_2()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2632:1: ( rule__ArithmeticExpression__RightExpressionAssignment_1_2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2632:2: rule__ArithmeticExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmeticExpression__RightExpressionAssignment_1_2_in_rule__ArithmeticExpression__Group_1__2__Impl5434);
            rule__ArithmeticExpression__RightExpressionAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getArithmeticExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__Group_1__2__Impl


    // $ANTLR start rule__ComparisonExpression__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2648:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2652:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2653:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__05470);
            rule__ComparisonExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__05473);
            rule__ComparisonExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group__0


    // $ANTLR start rule__ComparisonExpression__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2660:1: rule__ComparisonExpression__Group__0__Impl : ( ruleBinaryLogicExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2664:1: ( ( ruleBinaryLogicExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2665:1: ( ruleBinaryLogicExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2665:1: ( ruleBinaryLogicExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2666:1: ruleBinaryLogicExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getBinaryLogicExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_rule__ComparisonExpression__Group__0__Impl5500);
            ruleBinaryLogicExpression();
            _fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getBinaryLogicExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group__0__Impl


    // $ANTLR start rule__ComparisonExpression__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2677:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2681:1: ( rule__ComparisonExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2682:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__15529);
            rule__ComparisonExpression__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group__1


    // $ANTLR start rule__ComparisonExpression__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2688:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2692:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2693:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2693:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2694:1: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2695:1: ( rule__ComparisonExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=33 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2695:2: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl5556);
            	    rule__ComparisonExpression__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

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
    // $ANTLR end rule__ComparisonExpression__Group__1__Impl


    // $ANTLR start rule__ComparisonExpression__Group_1__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2709:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2713:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2714:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__05591);
            rule__ComparisonExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__05594);
            rule__ComparisonExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group_1__0


    // $ANTLR start rule__ComparisonExpression__Group_1__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2721:1: rule__ComparisonExpression__Group_1__0__Impl : ( ( rule__ComparisonExpression__Group_1_0__0 ) ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2725:1: ( ( ( rule__ComparisonExpression__Group_1_0__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2726:1: ( ( rule__ComparisonExpression__Group_1_0__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2726:1: ( ( rule__ComparisonExpression__Group_1_0__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2727:1: ( rule__ComparisonExpression__Group_1_0__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2728:1: ( rule__ComparisonExpression__Group_1_0__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2728:2: rule__ComparisonExpression__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0__0_in_rule__ComparisonExpression__Group_1__0__Impl5621);
            rule__ComparisonExpression__Group_1_0__0();
            _fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group_1__0__Impl


    // $ANTLR start rule__ComparisonExpression__Group_1__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2738:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2742:1: ( rule__ComparisonExpression__Group_1__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2743:2: rule__ComparisonExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__15651);
            rule__ComparisonExpression__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group_1__1


    // $ANTLR start rule__ComparisonExpression__Group_1__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2749:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2753:1: ( ( ( rule__ComparisonExpression__RightExpressionAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2754:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2754:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2755:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2756:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2756:2: rule__ComparisonExpression__RightExpressionAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__RightExpressionAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl5678);
            rule__ComparisonExpression__RightExpressionAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group_1__1__Impl


    // $ANTLR start rule__ComparisonExpression__Group_1_0__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2770:1: rule__ComparisonExpression__Group_1_0__0 : rule__ComparisonExpression__Group_1_0__0__Impl rule__ComparisonExpression__Group_1_0__1 ;
    public final void rule__ComparisonExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2774:1: ( rule__ComparisonExpression__Group_1_0__0__Impl rule__ComparisonExpression__Group_1_0__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2775:2: rule__ComparisonExpression__Group_1_0__0__Impl rule__ComparisonExpression__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0__0__Impl_in_rule__ComparisonExpression__Group_1_0__05712);
            rule__ComparisonExpression__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0__1_in_rule__ComparisonExpression__Group_1_0__05715);
            rule__ComparisonExpression__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group_1_0__0


    // $ANTLR start rule__ComparisonExpression__Group_1_0__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2782:1: rule__ComparisonExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2786:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2787:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2787:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2788:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2789:1: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2791:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group_1_0__0__Impl


    // $ANTLR start rule__ComparisonExpression__Group_1_0__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2801:1: rule__ComparisonExpression__Group_1_0__1 : rule__ComparisonExpression__Group_1_0__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2805:1: ( rule__ComparisonExpression__Group_1_0__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2806:2: rule__ComparisonExpression__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0__1__Impl_in_rule__ComparisonExpression__Group_1_0__15773);
            rule__ComparisonExpression__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group_1_0__1


    // $ANTLR start rule__ComparisonExpression__Group_1_0__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2812:1: rule__ComparisonExpression__Group_1_0__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2816:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_0_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2817:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_0_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2817:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_0_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2818:1: ( rule__ComparisonExpression__OperatorAssignment_1_0_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_0_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2819:1: ( rule__ComparisonExpression__OperatorAssignment_1_0_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2819:2: rule__ComparisonExpression__OperatorAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__OperatorAssignment_1_0_1_in_rule__ComparisonExpression__Group_1_0__1__Impl5800);
            rule__ComparisonExpression__OperatorAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__Group_1_0__1__Impl


    // $ANTLR start rule__BinaryLogicExpression__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2833:1: rule__BinaryLogicExpression__Group__0 : rule__BinaryLogicExpression__Group__0__Impl rule__BinaryLogicExpression__Group__1 ;
    public final void rule__BinaryLogicExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2837:1: ( rule__BinaryLogicExpression__Group__0__Impl rule__BinaryLogicExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2838:2: rule__BinaryLogicExpression__Group__0__Impl rule__BinaryLogicExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group__0__Impl_in_rule__BinaryLogicExpression__Group__05834);
            rule__BinaryLogicExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group__1_in_rule__BinaryLogicExpression__Group__05837);
            rule__BinaryLogicExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group__0


    // $ANTLR start rule__BinaryLogicExpression__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2845:1: rule__BinaryLogicExpression__Group__0__Impl : ( ( rule__BinaryLogicExpression__Alternatives_0 ) ) ;
    public final void rule__BinaryLogicExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2849:1: ( ( ( rule__BinaryLogicExpression__Alternatives_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2850:1: ( ( rule__BinaryLogicExpression__Alternatives_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2850:1: ( ( rule__BinaryLogicExpression__Alternatives_0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2851:1: ( rule__BinaryLogicExpression__Alternatives_0 )
            {
             before(grammarAccess.getBinaryLogicExpressionAccess().getAlternatives_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2852:1: ( rule__BinaryLogicExpression__Alternatives_0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2852:2: rule__BinaryLogicExpression__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Alternatives_0_in_rule__BinaryLogicExpression__Group__0__Impl5864);
            rule__BinaryLogicExpression__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getBinaryLogicExpressionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group__0__Impl


    // $ANTLR start rule__BinaryLogicExpression__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2862:1: rule__BinaryLogicExpression__Group__1 : rule__BinaryLogicExpression__Group__1__Impl ;
    public final void rule__BinaryLogicExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2866:1: ( rule__BinaryLogicExpression__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2867:2: rule__BinaryLogicExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group__1__Impl_in_rule__BinaryLogicExpression__Group__15894);
            rule__BinaryLogicExpression__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group__1


    // $ANTLR start rule__BinaryLogicExpression__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2873:1: rule__BinaryLogicExpression__Group__1__Impl : ( ( rule__BinaryLogicExpression__Group_1__0 )* ) ;
    public final void rule__BinaryLogicExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2877:1: ( ( ( rule__BinaryLogicExpression__Group_1__0 )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2878:1: ( ( rule__BinaryLogicExpression__Group_1__0 )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2878:1: ( ( rule__BinaryLogicExpression__Group_1__0 )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2879:1: ( rule__BinaryLogicExpression__Group_1__0 )*
            {
             before(grammarAccess.getBinaryLogicExpressionAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2880:1: ( rule__BinaryLogicExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=20 && LA19_0<=26)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2880:2: rule__BinaryLogicExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group_1__0_in_rule__BinaryLogicExpression__Group__1__Impl5921);
            	    rule__BinaryLogicExpression__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBinaryLogicExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group__1__Impl


    // $ANTLR start rule__BinaryLogicExpression__Group_1__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2894:1: rule__BinaryLogicExpression__Group_1__0 : rule__BinaryLogicExpression__Group_1__0__Impl rule__BinaryLogicExpression__Group_1__1 ;
    public final void rule__BinaryLogicExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2898:1: ( rule__BinaryLogicExpression__Group_1__0__Impl rule__BinaryLogicExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2899:2: rule__BinaryLogicExpression__Group_1__0__Impl rule__BinaryLogicExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group_1__0__Impl_in_rule__BinaryLogicExpression__Group_1__05956);
            rule__BinaryLogicExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group_1__1_in_rule__BinaryLogicExpression__Group_1__05959);
            rule__BinaryLogicExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group_1__0


    // $ANTLR start rule__BinaryLogicExpression__Group_1__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2906:1: rule__BinaryLogicExpression__Group_1__0__Impl : ( ( rule__BinaryLogicExpression__Group_1_0__0 ) ) ;
    public final void rule__BinaryLogicExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2910:1: ( ( ( rule__BinaryLogicExpression__Group_1_0__0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2911:1: ( ( rule__BinaryLogicExpression__Group_1_0__0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2911:1: ( ( rule__BinaryLogicExpression__Group_1_0__0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2912:1: ( rule__BinaryLogicExpression__Group_1_0__0 )
            {
             before(grammarAccess.getBinaryLogicExpressionAccess().getGroup_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2913:1: ( rule__BinaryLogicExpression__Group_1_0__0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2913:2: rule__BinaryLogicExpression__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group_1_0__0_in_rule__BinaryLogicExpression__Group_1__0__Impl5986);
            rule__BinaryLogicExpression__Group_1_0__0();
            _fsp--;


            }

             after(grammarAccess.getBinaryLogicExpressionAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group_1__0__Impl


    // $ANTLR start rule__BinaryLogicExpression__Group_1__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2923:1: rule__BinaryLogicExpression__Group_1__1 : rule__BinaryLogicExpression__Group_1__1__Impl ;
    public final void rule__BinaryLogicExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2927:1: ( rule__BinaryLogicExpression__Group_1__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2928:2: rule__BinaryLogicExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group_1__1__Impl_in_rule__BinaryLogicExpression__Group_1__16016);
            rule__BinaryLogicExpression__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group_1__1


    // $ANTLR start rule__BinaryLogicExpression__Group_1__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2934:1: rule__BinaryLogicExpression__Group_1__1__Impl : ( ( rule__BinaryLogicExpression__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__BinaryLogicExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2938:1: ( ( ( rule__BinaryLogicExpression__RightExpressionAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2939:1: ( ( rule__BinaryLogicExpression__RightExpressionAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2939:1: ( ( rule__BinaryLogicExpression__RightExpressionAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2940:1: ( rule__BinaryLogicExpression__RightExpressionAssignment_1_1 )
            {
             before(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2941:1: ( rule__BinaryLogicExpression__RightExpressionAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2941:2: rule__BinaryLogicExpression__RightExpressionAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__RightExpressionAssignment_1_1_in_rule__BinaryLogicExpression__Group_1__1__Impl6043);
            rule__BinaryLogicExpression__RightExpressionAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group_1__1__Impl


    // $ANTLR start rule__BinaryLogicExpression__Group_1_0__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2955:1: rule__BinaryLogicExpression__Group_1_0__0 : rule__BinaryLogicExpression__Group_1_0__0__Impl rule__BinaryLogicExpression__Group_1_0__1 ;
    public final void rule__BinaryLogicExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2959:1: ( rule__BinaryLogicExpression__Group_1_0__0__Impl rule__BinaryLogicExpression__Group_1_0__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2960:2: rule__BinaryLogicExpression__Group_1_0__0__Impl rule__BinaryLogicExpression__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group_1_0__0__Impl_in_rule__BinaryLogicExpression__Group_1_0__06077);
            rule__BinaryLogicExpression__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group_1_0__1_in_rule__BinaryLogicExpression__Group_1_0__06080);
            rule__BinaryLogicExpression__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group_1_0__0


    // $ANTLR start rule__BinaryLogicExpression__Group_1_0__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2967:1: rule__BinaryLogicExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__BinaryLogicExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2971:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2972:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2972:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2973:1: ()
            {
             before(grammarAccess.getBinaryLogicExpressionAccess().getBinaryLogicExpressionLeftExpressionAction_1_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2974:1: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2976:1: 
            {
            }

             after(grammarAccess.getBinaryLogicExpressionAccess().getBinaryLogicExpressionLeftExpressionAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group_1_0__0__Impl


    // $ANTLR start rule__BinaryLogicExpression__Group_1_0__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2986:1: rule__BinaryLogicExpression__Group_1_0__1 : rule__BinaryLogicExpression__Group_1_0__1__Impl ;
    public final void rule__BinaryLogicExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2990:1: ( rule__BinaryLogicExpression__Group_1_0__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2991:2: rule__BinaryLogicExpression__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__Group_1_0__1__Impl_in_rule__BinaryLogicExpression__Group_1_0__16138);
            rule__BinaryLogicExpression__Group_1_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group_1_0__1


    // $ANTLR start rule__BinaryLogicExpression__Group_1_0__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:2997:1: rule__BinaryLogicExpression__Group_1_0__1__Impl : ( ( rule__BinaryLogicExpression__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__BinaryLogicExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3001:1: ( ( ( rule__BinaryLogicExpression__OperatorAssignment_1_0_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3002:1: ( ( rule__BinaryLogicExpression__OperatorAssignment_1_0_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3002:1: ( ( rule__BinaryLogicExpression__OperatorAssignment_1_0_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3003:1: ( rule__BinaryLogicExpression__OperatorAssignment_1_0_1 )
            {
             before(grammarAccess.getBinaryLogicExpressionAccess().getOperatorAssignment_1_0_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3004:1: ( rule__BinaryLogicExpression__OperatorAssignment_1_0_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3004:2: rule__BinaryLogicExpression__OperatorAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__OperatorAssignment_1_0_1_in_rule__BinaryLogicExpression__Group_1_0__1__Impl6165);
            rule__BinaryLogicExpression__OperatorAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getBinaryLogicExpressionAccess().getOperatorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__Group_1_0__1__Impl


    // $ANTLR start rule__UnaryExpression__Group__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3018:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3022:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3023:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group__0__Impl_in_rule__UnaryExpression__Group__06199);
            rule__UnaryExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group__1_in_rule__UnaryExpression__Group__06202);
            rule__UnaryExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpression__Group__0


    // $ANTLR start rule__UnaryExpression__Group__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3030:1: rule__UnaryExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3034:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3035:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3035:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3036:1: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3037:1: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3039:1: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpression__Group__0__Impl


    // $ANTLR start rule__UnaryExpression__Group__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3049:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3053:1: ( rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3054:2: rule__UnaryExpression__Group__1__Impl rule__UnaryExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group__1__Impl_in_rule__UnaryExpression__Group__16260);
            rule__UnaryExpression__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group__2_in_rule__UnaryExpression__Group__16263);
            rule__UnaryExpression__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpression__Group__1


    // $ANTLR start rule__UnaryExpression__Group__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3061:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__UnaryOperatorAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3065:1: ( ( ( rule__UnaryExpression__UnaryOperatorAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3066:1: ( ( rule__UnaryExpression__UnaryOperatorAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3066:1: ( ( rule__UnaryExpression__UnaryOperatorAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3067:1: ( rule__UnaryExpression__UnaryOperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorAssignment_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3068:1: ( rule__UnaryExpression__UnaryOperatorAssignment_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3068:2: rule__UnaryExpression__UnaryOperatorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__UnaryOperatorAssignment_1_in_rule__UnaryExpression__Group__1__Impl6290);
            rule__UnaryExpression__UnaryOperatorAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpression__Group__1__Impl


    // $ANTLR start rule__UnaryExpression__Group__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3078:1: rule__UnaryExpression__Group__2 : rule__UnaryExpression__Group__2__Impl ;
    public final void rule__UnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3082:1: ( rule__UnaryExpression__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3083:2: rule__UnaryExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group__2__Impl_in_rule__UnaryExpression__Group__26320);
            rule__UnaryExpression__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpression__Group__2


    // $ANTLR start rule__UnaryExpression__Group__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3089:1: rule__UnaryExpression__Group__2__Impl : ( ( rule__UnaryExpression__UnaryExpressionAssignment_2 ) ) ;
    public final void rule__UnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3093:1: ( ( ( rule__UnaryExpression__UnaryExpressionAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3094:1: ( ( rule__UnaryExpression__UnaryExpressionAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3094:1: ( ( rule__UnaryExpression__UnaryExpressionAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3095:1: ( rule__UnaryExpression__UnaryExpressionAssignment_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAssignment_2()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3096:1: ( rule__UnaryExpression__UnaryExpressionAssignment_2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3096:2: rule__UnaryExpression__UnaryExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__UnaryExpressionAssignment_2_in_rule__UnaryExpression__Group__2__Impl6347);
            rule__UnaryExpression__UnaryExpressionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpression__Group__2__Impl


    // $ANTLR start rule__LiteralExpression__Group_0__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3112:1: rule__LiteralExpression__Group_0__0 : rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1 ;
    public final void rule__LiteralExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3116:1: ( rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3117:2: rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_0__0__Impl_in_rule__LiteralExpression__Group_0__06383);
            rule__LiteralExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_0__1_in_rule__LiteralExpression__Group_0__06386);
            rule__LiteralExpression__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_0__0


    // $ANTLR start rule__LiteralExpression__Group_0__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3124:1: rule__LiteralExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__LiteralExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3128:1: ( ( '(' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3129:1: ( '(' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3129:1: ( '(' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3130:1: '('
            {
             before(grammarAccess.getLiteralExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__LiteralExpression__Group_0__0__Impl6414); 
             after(grammarAccess.getLiteralExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_0__0__Impl


    // $ANTLR start rule__LiteralExpression__Group_0__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3143:1: rule__LiteralExpression__Group_0__1 : rule__LiteralExpression__Group_0__1__Impl rule__LiteralExpression__Group_0__2 ;
    public final void rule__LiteralExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3147:1: ( rule__LiteralExpression__Group_0__1__Impl rule__LiteralExpression__Group_0__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3148:2: rule__LiteralExpression__Group_0__1__Impl rule__LiteralExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_0__1__Impl_in_rule__LiteralExpression__Group_0__16445);
            rule__LiteralExpression__Group_0__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_0__2_in_rule__LiteralExpression__Group_0__16448);
            rule__LiteralExpression__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_0__1


    // $ANTLR start rule__LiteralExpression__Group_0__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3155:1: rule__LiteralExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__LiteralExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3159:1: ( ( ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3160:1: ( ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3160:1: ( ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3161:1: ruleExpression
            {
             before(grammarAccess.getLiteralExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__LiteralExpression__Group_0__1__Impl6475);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getLiteralExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_0__1__Impl


    // $ANTLR start rule__LiteralExpression__Group_0__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3172:1: rule__LiteralExpression__Group_0__2 : rule__LiteralExpression__Group_0__2__Impl ;
    public final void rule__LiteralExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3176:1: ( rule__LiteralExpression__Group_0__2__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3177:2: rule__LiteralExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_0__2__Impl_in_rule__LiteralExpression__Group_0__26504);
            rule__LiteralExpression__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_0__2


    // $ANTLR start rule__LiteralExpression__Group_0__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3183:1: rule__LiteralExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__LiteralExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3187:1: ( ( ')' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3188:1: ( ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3188:1: ( ')' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3189:1: ')'
            {
             before(grammarAccess.getLiteralExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__LiteralExpression__Group_0__2__Impl6532); 
             after(grammarAccess.getLiteralExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_0__2__Impl


    // $ANTLR start rule__LiteralExpression__Group_1__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3208:1: rule__LiteralExpression__Group_1__0 : rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1 ;
    public final void rule__LiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3212:1: ( rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3213:2: rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_1__0__Impl_in_rule__LiteralExpression__Group_1__06569);
            rule__LiteralExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_1__1_in_rule__LiteralExpression__Group_1__06572);
            rule__LiteralExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_1__0


    // $ANTLR start rule__LiteralExpression__Group_1__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3220:1: rule__LiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3224:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3225:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3225:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3226:1: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3227:1: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3229:1: 
            {
            }

             after(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_1__0__Impl


    // $ANTLR start rule__LiteralExpression__Group_1__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3239:1: rule__LiteralExpression__Group_1__1 : rule__LiteralExpression__Group_1__1__Impl rule__LiteralExpression__Group_1__2 ;
    public final void rule__LiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3243:1: ( rule__LiteralExpression__Group_1__1__Impl rule__LiteralExpression__Group_1__2 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3244:2: rule__LiteralExpression__Group_1__1__Impl rule__LiteralExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_1__1__Impl_in_rule__LiteralExpression__Group_1__16630);
            rule__LiteralExpression__Group_1__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_1__2_in_rule__LiteralExpression__Group_1__16633);
            rule__LiteralExpression__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_1__1


    // $ANTLR start rule__LiteralExpression__Group_1__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3251:1: rule__LiteralExpression__Group_1__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__LiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3255:1: ( ( ( rule__LiteralExpression__ValueAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3256:1: ( ( rule__LiteralExpression__ValueAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3256:1: ( ( rule__LiteralExpression__ValueAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3257:1: ( rule__LiteralExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3258:1: ( rule__LiteralExpression__ValueAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3258:2: rule__LiteralExpression__ValueAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__ValueAssignment_1_1_in_rule__LiteralExpression__Group_1__1__Impl6660);
            rule__LiteralExpression__ValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_1__1__Impl


    // $ANTLR start rule__LiteralExpression__Group_1__2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3268:1: rule__LiteralExpression__Group_1__2 : rule__LiteralExpression__Group_1__2__Impl rule__LiteralExpression__Group_1__3 ;
    public final void rule__LiteralExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3272:1: ( rule__LiteralExpression__Group_1__2__Impl rule__LiteralExpression__Group_1__3 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3273:2: rule__LiteralExpression__Group_1__2__Impl rule__LiteralExpression__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_1__2__Impl_in_rule__LiteralExpression__Group_1__26690);
            rule__LiteralExpression__Group_1__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_1__3_in_rule__LiteralExpression__Group_1__26693);
            rule__LiteralExpression__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_1__2


    // $ANTLR start rule__LiteralExpression__Group_1__2__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3280:1: rule__LiteralExpression__Group_1__2__Impl : ( ':' ) ;
    public final void rule__LiteralExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3284:1: ( ( ':' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3285:1: ( ':' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3285:1: ( ':' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3286:1: ':'
            {
             before(grammarAccess.getLiteralExpressionAccess().getColonKeyword_1_2()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__LiteralExpression__Group_1__2__Impl6721); 
             after(grammarAccess.getLiteralExpressionAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_1__2__Impl


    // $ANTLR start rule__LiteralExpression__Group_1__3
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3299:1: rule__LiteralExpression__Group_1__3 : rule__LiteralExpression__Group_1__3__Impl ;
    public final void rule__LiteralExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3303:1: ( rule__LiteralExpression__Group_1__3__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3304:2: rule__LiteralExpression__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__Group_1__3__Impl_in_rule__LiteralExpression__Group_1__36752);
            rule__LiteralExpression__Group_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_1__3


    // $ANTLR start rule__LiteralExpression__Group_1__3__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3310:1: rule__LiteralExpression__Group_1__3__Impl : ( ( rule__LiteralExpression__ValueTypeAssignment_1_3 ) ) ;
    public final void rule__LiteralExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3314:1: ( ( ( rule__LiteralExpression__ValueTypeAssignment_1_3 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3315:1: ( ( rule__LiteralExpression__ValueTypeAssignment_1_3 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3315:1: ( ( rule__LiteralExpression__ValueTypeAssignment_1_3 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3316:1: ( rule__LiteralExpression__ValueTypeAssignment_1_3 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueTypeAssignment_1_3()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3317:1: ( rule__LiteralExpression__ValueTypeAssignment_1_3 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3317:2: rule__LiteralExpression__ValueTypeAssignment_1_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralExpression__ValueTypeAssignment_1_3_in_rule__LiteralExpression__Group_1__3__Impl6779);
            rule__LiteralExpression__ValueTypeAssignment_1_3();
            _fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getValueTypeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__Group_1__3__Impl


    // $ANTLR start rule__AttributeExpression__Group_1__0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3335:1: rule__AttributeExpression__Group_1__0 : rule__AttributeExpression__Group_1__0__Impl rule__AttributeExpression__Group_1__1 ;
    public final void rule__AttributeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3339:1: ( rule__AttributeExpression__Group_1__0__Impl rule__AttributeExpression__Group_1__1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3340:2: rule__AttributeExpression__Group_1__0__Impl rule__AttributeExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeExpression__Group_1__0__Impl_in_rule__AttributeExpression__Group_1__06817);
            rule__AttributeExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AttributeExpression__Group_1__1_in_rule__AttributeExpression__Group_1__06820);
            rule__AttributeExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeExpression__Group_1__0


    // $ANTLR start rule__AttributeExpression__Group_1__0__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3347:1: rule__AttributeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3351:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3352:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3352:1: ( () )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3353:1: ()
            {
             before(grammarAccess.getAttributeExpressionAccess().getAttributeExpressionAction_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3354:1: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3356:1: 
            {
            }

             after(grammarAccess.getAttributeExpressionAccess().getAttributeExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeExpression__Group_1__0__Impl


    // $ANTLR start rule__AttributeExpression__Group_1__1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3366:1: rule__AttributeExpression__Group_1__1 : rule__AttributeExpression__Group_1__1__Impl ;
    public final void rule__AttributeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3370:1: ( rule__AttributeExpression__Group_1__1__Impl )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3371:2: rule__AttributeExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeExpression__Group_1__1__Impl_in_rule__AttributeExpression__Group_1__16878);
            rule__AttributeExpression__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeExpression__Group_1__1


    // $ANTLR start rule__AttributeExpression__Group_1__1__Impl
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3377:1: rule__AttributeExpression__Group_1__1__Impl : ( ( rule__AttributeExpression__AttributeAssignment_1_1 ) ) ;
    public final void rule__AttributeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3381:1: ( ( ( rule__AttributeExpression__AttributeAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3382:1: ( ( rule__AttributeExpression__AttributeAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3382:1: ( ( rule__AttributeExpression__AttributeAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3383:1: ( rule__AttributeExpression__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getAttributeExpressionAccess().getAttributeAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3384:1: ( rule__AttributeExpression__AttributeAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3384:2: rule__AttributeExpression__AttributeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeExpression__AttributeAssignment_1_1_in_rule__AttributeExpression__Group_1__1__Impl6905);
            rule__AttributeExpression__AttributeAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getAttributeExpressionAccess().getAttributeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeExpression__Group_1__1__Impl


    // $ANTLR start rule__Block__ExpressionsAssignment_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3399:1: rule__Block__ExpressionsAssignment_1 : ( ruleExpressionStartRule ) ;
    public final void rule__Block__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3403:1: ( ( ruleExpressionStartRule ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3404:1: ( ruleExpressionStartRule )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3404:1: ( ruleExpressionStartRule )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3405:1: ruleExpressionStartRule
            {
             before(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_rule__Block__ExpressionsAssignment_16944);
            ruleExpressionStartRule();
            _fsp--;

             after(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__ExpressionsAssignment_1


    // $ANTLR start rule__ForLoop__InitalizeExpressionAssignment_2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3414:1: rule__ForLoop__InitalizeExpressionAssignment_2 : ( ruleAssignment ) ;
    public final void rule__ForLoop__InitalizeExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3418:1: ( ( ruleAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3419:1: ( ruleAssignment )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3419:1: ( ruleAssignment )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3420:1: ruleAssignment
            {
             before(grammarAccess.getForLoopAccess().getInitalizeExpressionAssignmentParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__ForLoop__InitalizeExpressionAssignment_26975);
            ruleAssignment();
            _fsp--;

             after(grammarAccess.getForLoopAccess().getInitalizeExpressionAssignmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoop__InitalizeExpressionAssignment_2


    // $ANTLR start rule__ForLoop__LoopTestAssignment_3
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3429:1: rule__ForLoop__LoopTestAssignment_3 : ( ruleExpression ) ;
    public final void rule__ForLoop__LoopTestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3433:1: ( ( ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3434:1: ( ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3434:1: ( ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3435:1: ruleExpression
            {
             before(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ForLoop__LoopTestAssignment_37006);
            ruleExpression();
            _fsp--;

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
    // $ANTLR end rule__ForLoop__LoopTestAssignment_3


    // $ANTLR start rule__ForLoop__CountingExpressionAssignment_5
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3444:1: rule__ForLoop__CountingExpressionAssignment_5 : ( ruleForLoopCountingExpression ) ;
    public final void rule__ForLoop__CountingExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3448:1: ( ( ruleForLoopCountingExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3449:1: ( ruleForLoopCountingExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3449:1: ( ruleForLoopCountingExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3450:1: ruleForLoopCountingExpression
            {
             before(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_rule__ForLoop__CountingExpressionAssignment_57037);
            ruleForLoopCountingExpression();
            _fsp--;

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
    // $ANTLR end rule__ForLoop__CountingExpressionAssignment_5


    // $ANTLR start rule__ForLoop__BlockAssignment_7
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3459:1: rule__ForLoop__BlockAssignment_7 : ( ruleBlock ) ;
    public final void rule__ForLoop__BlockAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3463:1: ( ( ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3464:1: ( ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3464:1: ( ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3465:1: ruleBlock
            {
             before(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__ForLoop__BlockAssignment_77068);
            ruleBlock();
            _fsp--;

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
    // $ANTLR end rule__ForLoop__BlockAssignment_7


    // $ANTLR start rule__WhileLoop__LoopTestAssignment_2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3474:1: rule__WhileLoop__LoopTestAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__LoopTestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3478:1: ( ( ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3479:1: ( ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3479:1: ( ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3480:1: ruleExpression
            {
             before(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__WhileLoop__LoopTestAssignment_27099);
            ruleExpression();
            _fsp--;

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
    // $ANTLR end rule__WhileLoop__LoopTestAssignment_2


    // $ANTLR start rule__WhileLoop__BlockAssignment_4
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3489:1: rule__WhileLoop__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__WhileLoop__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3493:1: ( ( ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3494:1: ( ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3494:1: ( ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3495:1: ruleBlock
            {
             before(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__WhileLoop__BlockAssignment_47130);
            ruleBlock();
            _fsp--;

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
    // $ANTLR end rule__WhileLoop__BlockAssignment_4


    // $ANTLR start rule__DoWhileLoop__BlockAssignment_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3504:1: rule__DoWhileLoop__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__DoWhileLoop__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3508:1: ( ( ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3509:1: ( ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3509:1: ( ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3510:1: ruleBlock
            {
             before(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__DoWhileLoop__BlockAssignment_17161);
            ruleBlock();
            _fsp--;

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
    // $ANTLR end rule__DoWhileLoop__BlockAssignment_1


    // $ANTLR start rule__DoWhileLoop__LoopTestAssignment_4
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3519:1: rule__DoWhileLoop__LoopTestAssignment_4 : ( ruleExpression ) ;
    public final void rule__DoWhileLoop__LoopTestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3523:1: ( ( ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3524:1: ( ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3524:1: ( ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3525:1: ruleExpression
            {
             before(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__DoWhileLoop__LoopTestAssignment_47192);
            ruleExpression();
            _fsp--;

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
    // $ANTLR end rule__DoWhileLoop__LoopTestAssignment_4


    // $ANTLR start rule__IfStatement__IfConditionAssignment_2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3534:1: rule__IfStatement__IfConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__IfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3538:1: ( ( ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3539:1: ( ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3539:1: ( ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3540:1: ruleExpression
            {
             before(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__IfStatement__IfConditionAssignment_27223);
            ruleExpression();
            _fsp--;

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
    // $ANTLR end rule__IfStatement__IfConditionAssignment_2


    // $ANTLR start rule__IfStatement__IfBlockAssignment_4
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3549:1: rule__IfStatement__IfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3553:1: ( ( ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3554:1: ( ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3554:1: ( ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3555:1: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__IfStatement__IfBlockAssignment_47254);
            ruleBlock();
            _fsp--;

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
    // $ANTLR end rule__IfStatement__IfBlockAssignment_4


    // $ANTLR start rule__IfStatement__ElseIfConditionsAssignment_5_2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3564:1: rule__IfStatement__ElseIfConditionsAssignment_5_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__ElseIfConditionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3568:1: ( ( ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3569:1: ( ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3569:1: ( ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3570:1: ruleExpression
            {
             before(grammarAccess.getIfStatementAccess().getElseIfConditionsExpressionParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__IfStatement__ElseIfConditionsAssignment_5_27285);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getIfStatementAccess().getElseIfConditionsExpressionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__ElseIfConditionsAssignment_5_2


    // $ANTLR start rule__IfStatement__ElseIfBlocksAssignment_5_4
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3579:1: rule__IfStatement__ElseIfBlocksAssignment_5_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseIfBlocksAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3583:1: ( ( ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3584:1: ( ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3584:1: ( ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3585:1: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getElseIfBlocksBlockParserRuleCall_5_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__IfStatement__ElseIfBlocksAssignment_5_47316);
            ruleBlock();
            _fsp--;

             after(grammarAccess.getIfStatementAccess().getElseIfBlocksBlockParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IfStatement__ElseIfBlocksAssignment_5_4


    // $ANTLR start rule__IfStatement__ElseBlockAssignment_6_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3594:1: rule__IfStatement__ElseBlockAssignment_6_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBlockAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3598:1: ( ( ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3599:1: ( ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3599:1: ( ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3600:1: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_rule__IfStatement__ElseBlockAssignment_6_17347);
            ruleBlock();
            _fsp--;

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
    // $ANTLR end rule__IfStatement__ElseBlockAssignment_6_1


    // $ANTLR start rule__Assignment__AttributeAssignment_0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3609:1: rule__Assignment__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3613:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3614:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3614:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3615:1: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getAttributeEAttributeCrossReference_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3616:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3617:1: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getAttributeEAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Assignment__AttributeAssignment_07382); 
             after(grammarAccess.getAssignmentAccess().getAttributeEAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getAttributeEAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__AttributeAssignment_0


    // $ANTLR start rule__Assignment__AssignOperatorAssignment_1_0_0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3628:1: rule__Assignment__AssignOperatorAssignment_1_0_0 : ( ruleAssignOperator ) ;
    public final void rule__Assignment__AssignOperatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3632:1: ( ( ruleAssignOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3633:1: ( ruleAssignOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3633:1: ( ruleAssignOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3634:1: ruleAssignOperator
            {
             before(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_rule__Assignment__AssignOperatorAssignment_1_0_07417);
            ruleAssignOperator();
            _fsp--;

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
    // $ANTLR end rule__Assignment__AssignOperatorAssignment_1_0_0


    // $ANTLR start rule__Assignment__AssignExpressionAssignment_1_0_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3643:1: rule__Assignment__AssignExpressionAssignment_1_0_1 : ( ruleExpression ) ;
    public final void rule__Assignment__AssignExpressionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3647:1: ( ( ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3648:1: ( ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3648:1: ( ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3649:1: ruleExpression
            {
             before(grammarAccess.getAssignmentAccess().getAssignExpressionExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Assignment__AssignExpressionAssignment_1_0_17448);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getAssignmentAccess().getAssignExpressionExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__AssignExpressionAssignment_1_0_1


    // $ANTLR start rule__Assignment__IncrementDecrementOperatorAssignment_1_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3658:1: rule__Assignment__IncrementDecrementOperatorAssignment_1_1 : ( ruleIncrementDecrementOperator ) ;
    public final void rule__Assignment__IncrementDecrementOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3662:1: ( ( ruleIncrementDecrementOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3663:1: ( ruleIncrementDecrementOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3663:1: ( ruleIncrementDecrementOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3664:1: ruleIncrementDecrementOperator
            {
             before(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperator_in_rule__Assignment__IncrementDecrementOperatorAssignment_1_17479);
            ruleIncrementDecrementOperator();
            _fsp--;

             after(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Assignment__IncrementDecrementOperatorAssignment_1_1


    // $ANTLR start rule__ForLoopCountingExpression__AttributeAssignment_0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3673:1: rule__ForLoopCountingExpression__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ForLoopCountingExpression__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3677:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3678:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3678:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3679:1: ( RULE_ID )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAttributeEAttributeCrossReference_0_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3680:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3681:1: RULE_ID
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAttributeEAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ForLoopCountingExpression__AttributeAssignment_07514); 
             after(grammarAccess.getForLoopCountingExpressionAccess().getAttributeEAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getAttributeEAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoopCountingExpression__AttributeAssignment_0


    // $ANTLR start rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3692:1: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 : ( ruleIncrementDecrementOperator ) ;
    public final void rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3696:1: ( ( ruleIncrementDecrementOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3697:1: ( ruleIncrementDecrementOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3697:1: ( ruleIncrementDecrementOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3698:1: ruleIncrementDecrementOperator
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperator_in_rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_07549);
            ruleIncrementDecrementOperator();
            _fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0


    // $ANTLR start rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3707:1: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 : ( ruleAssignOperator ) ;
    public final void rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3711:1: ( ( ruleAssignOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3712:1: ( ruleAssignOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3712:1: ( ruleAssignOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3713:1: ruleAssignOperator
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_07580);
            ruleAssignOperator();
            _fsp--;

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
    // $ANTLR end rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0


    // $ANTLR start rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3722:1: rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3726:1: ( ( ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3727:1: ( ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3727:1: ( ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3728:1: ruleExpression
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignExpressionExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_17611);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getAssignExpressionExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1


    // $ANTLR start rule__ArithmeticExpression__OperatorAssignment_1_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3737:1: rule__ArithmeticExpression__OperatorAssignment_1_1 : ( ruleArithmeticOperator ) ;
    public final void rule__ArithmeticExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3741:1: ( ( ruleArithmeticOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3742:1: ( ruleArithmeticOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3742:1: ( ruleArithmeticOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3743:1: ruleArithmeticOperator
            {
             before(grammarAccess.getArithmeticExpressionAccess().getOperatorArithmeticOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticOperator_in_rule__ArithmeticExpression__OperatorAssignment_1_17642);
            ruleArithmeticOperator();
            _fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getOperatorArithmeticOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__OperatorAssignment_1_1


    // $ANTLR start rule__ArithmeticExpression__RightExpressionAssignment_1_2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3752:1: rule__ArithmeticExpression__RightExpressionAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__ArithmeticExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3756:1: ( ( ruleComparisonExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3757:1: ( ruleComparisonExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3757:1: ( ruleComparisonExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3758:1: ruleComparisonExpression
            {
             before(grammarAccess.getArithmeticExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__ArithmeticExpression__RightExpressionAssignment_1_27673);
            ruleComparisonExpression();
            _fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArithmeticExpression__RightExpressionAssignment_1_2


    // $ANTLR start rule__ComparisonExpression__OperatorAssignment_1_0_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3767:1: rule__ComparisonExpression__OperatorAssignment_1_0_1 : ( ruleComparingOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3771:1: ( ( ruleComparingOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3772:1: ( ruleComparingOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3772:1: ( ruleComparingOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3773:1: ruleComparingOperator
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorComparingOperatorEnumRuleCall_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_rule__ComparisonExpression__OperatorAssignment_1_0_17704);
            ruleComparingOperator();
            _fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getOperatorComparingOperatorEnumRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__OperatorAssignment_1_0_1


    // $ANTLR start rule__ComparisonExpression__RightExpressionAssignment_1_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3782:1: rule__ComparisonExpression__RightExpressionAssignment_1_1 : ( ruleBinaryLogicExpression ) ;
    public final void rule__ComparisonExpression__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3786:1: ( ( ruleBinaryLogicExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3787:1: ( ruleBinaryLogicExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3787:1: ( ruleBinaryLogicExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3788:1: ruleBinaryLogicExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExpressionBinaryLogicExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_rule__ComparisonExpression__RightExpressionAssignment_1_17735);
            ruleBinaryLogicExpression();
            _fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightExpressionBinaryLogicExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ComparisonExpression__RightExpressionAssignment_1_1


    // $ANTLR start rule__BinaryLogicExpression__OperatorAssignment_1_0_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3797:1: rule__BinaryLogicExpression__OperatorAssignment_1_0_1 : ( ruleLogicOperator ) ;
    public final void rule__BinaryLogicExpression__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3801:1: ( ( ruleLogicOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3802:1: ( ruleLogicOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3802:1: ( ruleLogicOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3803:1: ruleLogicOperator
            {
             before(grammarAccess.getBinaryLogicExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicOperator_in_rule__BinaryLogicExpression__OperatorAssignment_1_0_17766);
            ruleLogicOperator();
            _fsp--;

             after(grammarAccess.getBinaryLogicExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__OperatorAssignment_1_0_1


    // $ANTLR start rule__BinaryLogicExpression__RightExpressionAssignment_1_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3812:1: rule__BinaryLogicExpression__RightExpressionAssignment_1_1 : ( ( rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0 ) ) ;
    public final void rule__BinaryLogicExpression__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3816:1: ( ( ( rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0 ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3817:1: ( ( rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0 ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3817:1: ( ( rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0 ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3818:1: ( rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0 )
            {
             before(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAlternatives_1_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3819:1: ( rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0 )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3819:2: rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0_in_rule__BinaryLogicExpression__RightExpressionAssignment_1_17797);
            rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0();
            _fsp--;


            }

             after(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BinaryLogicExpression__RightExpressionAssignment_1_1


    // $ANTLR start rule__UnaryExpression__UnaryOperatorAssignment_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3828:1: rule__UnaryExpression__UnaryOperatorAssignment_1 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__UnaryOperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3832:1: ( ( ruleUnaryOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3833:1: ( ruleUnaryOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3833:1: ( ruleUnaryOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3834:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__UnaryExpression__UnaryOperatorAssignment_17830);
            ruleUnaryOperator();
            _fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpression__UnaryOperatorAssignment_1


    // $ANTLR start rule__UnaryExpression__UnaryExpressionAssignment_2
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3843:1: rule__UnaryExpression__UnaryExpressionAssignment_2 : ( ruleAttributeExpression ) ;
    public final void rule__UnaryExpression__UnaryExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3847:1: ( ( ruleAttributeExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3848:1: ( ruleAttributeExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3848:1: ( ruleAttributeExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3849:1: ruleAttributeExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAttributeExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_rule__UnaryExpression__UnaryExpressionAssignment_27861);
            ruleAttributeExpression();
            _fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAttributeExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpression__UnaryExpressionAssignment_2


    // $ANTLR start rule__LiteralExpression__ValueAssignment_1_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3858:1: rule__LiteralExpression__ValueAssignment_1_1 : ( ruleIdentifierOrValue ) ;
    public final void rule__LiteralExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3862:1: ( ( ruleIdentifierOrValue ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3863:1: ( ruleIdentifierOrValue )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3863:1: ( ruleIdentifierOrValue )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3864:1: ruleIdentifierOrValue
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueIdentifierOrValueParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifierOrValue_in_rule__LiteralExpression__ValueAssignment_1_17892);
            ruleIdentifierOrValue();
            _fsp--;

             after(grammarAccess.getLiteralExpressionAccess().getValueIdentifierOrValueParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__ValueAssignment_1_1


    // $ANTLR start rule__LiteralExpression__ValueTypeAssignment_1_3
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3873:1: rule__LiteralExpression__ValueTypeAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__LiteralExpression__ValueTypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3877:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3878:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3878:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3879:1: ( RULE_ID )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueTypeEDataTypeCrossReference_1_3_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3880:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3881:1: RULE_ID
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueTypeEDataTypeIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__LiteralExpression__ValueTypeAssignment_1_37927); 
             after(grammarAccess.getLiteralExpressionAccess().getValueTypeEDataTypeIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getLiteralExpressionAccess().getValueTypeEDataTypeCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LiteralExpression__ValueTypeAssignment_1_3


    // $ANTLR start rule__AttributeExpression__AttributeAssignment_1_1
    // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3892:1: rule__AttributeExpression__AttributeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeExpression__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3896:1: ( ( ( RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3897:1: ( ( RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3897:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3898:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeExpressionAccess().getAttributeEAttributeCrossReference_1_1_0()); 
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3899:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/ui/contentassist/antlr/internal/InternalActionLanguage.g:3900:1: RULE_ID
            {
             before(grammarAccess.getAttributeExpressionAccess().getAttributeEAttributeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__AttributeExpression__AttributeAssignment_1_17966); 
             after(grammarAccess.getAttributeExpressionAccess().getAttributeEAttributeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getAttributeExpressionAccess().getAttributeEAttributeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttributeExpression__AttributeAssignment_1_1


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_entryRuleForLoop121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoop128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__0_in_ruleForLoop154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoop188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__0_in_ruleWhileLoop214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileLoop248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__0_in_ruleDoWhileLoop274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__0_in_ruleIfStatement334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStartRule368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionStartRule__Alternatives_in_ruleExpressionStartRule394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoopCountingExpression488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__Group__0_in_ruleForLoopCountingExpression514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleExpression574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group__0_in_ruleArithmeticExpression633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_entryRuleBinaryLogicExpression720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryLogicExpression727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group__0_in_ruleBinaryLogicExpression753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group__0_in_ruleUnaryExpression813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Alternatives_in_ruleLiteralExpression873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_entryRuleAttributeExpression900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeExpression907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeExpression__Alternatives_in_ruleAttributeExpression933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifierOrValue_in_entryRuleIdentifierOrValue960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierOrValue967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifierOrValue993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AssignOperator__Alternatives_in_ruleAssignOperator1029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IncrementDecrementOperator__Alternatives_in_ruleIncrementDecrementOperator1065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator1101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmeticOperator__Alternatives_in_ruleArithmeticOperator1137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparingOperator__Alternatives_in_ruleComparingOperator1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__ExpressionStartRule__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_rule__ExpressionStartRule__Alternatives1261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_rule__ExpressionStartRule__Alternatives1278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_rule__ExpressionStartRule__Alternatives1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_rule__ExpressionStartRule__Alternatives1312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group_1_0__0_in_rule__Assignment__Alternatives_11344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__IncrementDecrementOperatorAssignment_1_1_in_rule__Assignment__Alternatives_11362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0_in_rule__ForLoopCountingExpression__Alternatives_11395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__Group_1_1__0_in_rule__ForLoopCountingExpression__Alternatives_11413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__BinaryLogicExpression__Alternatives_01446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_rule__BinaryLogicExpression__Alternatives_01463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_01495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_01512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_0__0_in_rule__LiteralExpression__Alternatives1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_1__0_in_rule__LiteralExpression__Alternatives1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_rule__AttributeExpression__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeExpression__Group_1__0_in_rule__AttributeExpression__Alternatives1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AssignOperator__Alternatives1646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AssignOperator__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AssignOperator__Alternatives1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__AssignOperator__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__AssignOperator__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__AssignOperator__Alternatives1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__IncrementDecrementOperator__Alternatives1787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IncrementDecrementOperator__Alternatives1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__LogicOperator__Alternatives1844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LogicOperator__Alternatives1865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LogicOperator__Alternatives1886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__LogicOperator__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__LogicOperator__Alternatives1928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__LogicOperator__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LogicOperator__Alternatives1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ArithmeticOperator__Alternatives2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ArithmeticOperator__Alternatives2027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ArithmeticOperator__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ArithmeticOperator__Alternatives2069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ArithmeticOperator__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ArithmeticOperator__Alternatives2111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ComparingOperator__Alternatives2147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ComparingOperator__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ComparingOperator__Alternatives2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ComparingOperator__Alternatives2210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ComparingOperator__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ComparingOperator__Alternatives2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__UnaryOperator__Alternatives2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__UnaryOperator__Alternatives2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__UnaryOperator__Alternatives2330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__02363 = new BitSet(new long[]{0x0001C60000000020L});
        public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__02366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Block__Group__0__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__12425 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__12428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Block__ExpressionsAssignment_1_in_rule__Block__Group__1__Impl2455 = new BitSet(new long[]{0x0001C40000000022L});
        public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__22486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Block__Group__2__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__0__Impl_in_rule__ForLoop__Group__02551 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__1_in_rule__ForLoop__Group__02554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ForLoop__Group__0__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__1__Impl_in_rule__ForLoop__Group__12613 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__2_in_rule__ForLoop__Group__12616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__ForLoop__Group__1__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__2__Impl_in_rule__ForLoop__Group__22675 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__3_in_rule__ForLoop__Group__22678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__InitalizeExpressionAssignment_2_in_rule__ForLoop__Group__2__Impl2705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__3__Impl_in_rule__ForLoop__Group__32735 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__4_in_rule__ForLoop__Group__32738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__LoopTestAssignment_3_in_rule__ForLoop__Group__3__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__4__Impl_in_rule__ForLoop__Group__42795 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__5_in_rule__ForLoop__Group__42798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__ForLoop__Group__4__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__5__Impl_in_rule__ForLoop__Group__52857 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__6_in_rule__ForLoop__Group__52860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__CountingExpressionAssignment_5_in_rule__ForLoop__Group__5__Impl2887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__6__Impl_in_rule__ForLoop__Group__62917 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__7_in_rule__ForLoop__Group__62920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__ForLoop__Group__6__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__Group__7__Impl_in_rule__ForLoop__Group__72979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoop__BlockAssignment_7_in_rule__ForLoop__Group__7__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__0__Impl_in_rule__WhileLoop__Group__03052 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__1_in_rule__WhileLoop__Group__03055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__WhileLoop__Group__0__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__1__Impl_in_rule__WhileLoop__Group__13114 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__2_in_rule__WhileLoop__Group__13117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__WhileLoop__Group__1__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__2__Impl_in_rule__WhileLoop__Group__23176 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__3_in_rule__WhileLoop__Group__23179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__LoopTestAssignment_2_in_rule__WhileLoop__Group__2__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__3__Impl_in_rule__WhileLoop__Group__33236 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__4_in_rule__WhileLoop__Group__33239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__WhileLoop__Group__3__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__Group__4__Impl_in_rule__WhileLoop__Group__43298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WhileLoop__BlockAssignment_4_in_rule__WhileLoop__Group__4__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__0__Impl_in_rule__DoWhileLoop__Group__03365 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__1_in_rule__DoWhileLoop__Group__03368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__DoWhileLoop__Group__0__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__1__Impl_in_rule__DoWhileLoop__Group__13427 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__2_in_rule__DoWhileLoop__Group__13430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__BlockAssignment_1_in_rule__DoWhileLoop__Group__1__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__2__Impl_in_rule__DoWhileLoop__Group__23487 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__3_in_rule__DoWhileLoop__Group__23490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__DoWhileLoop__Group__2__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__3__Impl_in_rule__DoWhileLoop__Group__33549 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__4_in_rule__DoWhileLoop__Group__33552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__DoWhileLoop__Group__3__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__4__Impl_in_rule__DoWhileLoop__Group__43611 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__5_in_rule__DoWhileLoop__Group__43614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__LoopTestAssignment_4_in_rule__DoWhileLoop__Group__4__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoWhileLoop__Group__5__Impl_in_rule__DoWhileLoop__Group__53671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__DoWhileLoop__Group__5__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__0__Impl_in_rule__IfStatement__Group__03742 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__1_in_rule__IfStatement__Group__03745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__IfStatement__Group__0__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__1__Impl_in_rule__IfStatement__Group__13804 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__2_in_rule__IfStatement__Group__13807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__IfStatement__Group__1__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__2__Impl_in_rule__IfStatement__Group__23866 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__3_in_rule__IfStatement__Group__23869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__IfConditionAssignment_2_in_rule__IfStatement__Group__2__Impl3896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__3__Impl_in_rule__IfStatement__Group__33926 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__4_in_rule__IfStatement__Group__33929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__IfStatement__Group__3__Impl3957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__4__Impl_in_rule__IfStatement__Group__43988 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__5_in_rule__IfStatement__Group__43991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__IfBlockAssignment_4_in_rule__IfStatement__Group__4__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__5__Impl_in_rule__IfStatement__Group__54048 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__6_in_rule__IfStatement__Group__54051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__0_in_rule__IfStatement__Group__5__Impl4078 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group__6__Impl_in_rule__IfStatement__Group__64109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_6__0_in_rule__IfStatement__Group__6__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__0__Impl_in_rule__IfStatement__Group_5__04181 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__1_in_rule__IfStatement__Group_5__04184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__IfStatement__Group_5__0__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__1__Impl_in_rule__IfStatement__Group_5__14243 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__2_in_rule__IfStatement__Group_5__14246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__IfStatement__Group_5__1__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__2__Impl_in_rule__IfStatement__Group_5__24305 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__3_in_rule__IfStatement__Group_5__24308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__ElseIfConditionsAssignment_5_2_in_rule__IfStatement__Group_5__2__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__3__Impl_in_rule__IfStatement__Group_5__34365 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__4_in_rule__IfStatement__Group_5__34368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__IfStatement__Group_5__3__Impl4396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_5__4__Impl_in_rule__IfStatement__Group_5__44427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__ElseIfBlocksAssignment_5_4_in_rule__IfStatement__Group_5__4__Impl4454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_6__0__Impl_in_rule__IfStatement__Group_6__04494 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_6__1_in_rule__IfStatement__Group_6__04497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__IfStatement__Group_6__0__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__Group_6__1__Impl_in_rule__IfStatement__Group_6__14556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfStatement__ElseBlockAssignment_6_1_in_rule__IfStatement__Group_6__1__Impl4583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04617 = new BitSet(new long[]{0x00000000000FF000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__AttributeAssignment_0_in_rule__Assignment__Group__0__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14677 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Alternatives_1_in_rule__Assignment__Group__1__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Assignment__Group__2__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group_1_0__0__Impl_in_rule__Assignment__Group_1_0__04802 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group_1_0__1_in_rule__Assignment__Group_1_0__04805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__AssignOperatorAssignment_1_0_0_in_rule__Assignment__Group_1_0__0__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group_1_0__1__Impl_in_rule__Assignment__Group_1_0__14862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__AssignExpressionAssignment_1_0_1_in_rule__Assignment__Group_1_0__1__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__Group__0__Impl_in_rule__ForLoopCountingExpression__Group__04923 = new BitSet(new long[]{0x00000000000FF000L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__Group__1_in_rule__ForLoopCountingExpression__Group__04926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__AttributeAssignment_0_in_rule__ForLoopCountingExpression__Group__0__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__Group__1__Impl_in_rule__ForLoopCountingExpression__Group__14983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__Alternatives_1_in_rule__ForLoopCountingExpression__Group__1__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__Group_1_1__0__Impl_in_rule__ForLoopCountingExpression__Group_1_1__05044 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__Group_1_1__1_in_rule__ForLoopCountingExpression__Group_1_1__05047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0_in_rule__ForLoopCountingExpression__Group_1_1__0__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__Group_1_1__1__Impl_in_rule__ForLoopCountingExpression__Group_1_1__15104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1_in_rule__ForLoopCountingExpression__Group_1_1__1__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group__0__Impl_in_rule__ArithmeticExpression__Group__05165 = new BitSet(new long[]{0x00000001F8000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group__1_in_rule__ArithmeticExpression__Group__05168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__ArithmeticExpression__Group__0__Impl5195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group__1__Impl_in_rule__ArithmeticExpression__Group__15224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group_1__0_in_rule__ArithmeticExpression__Group__1__Impl5251 = new BitSet(new long[]{0x00000001F8000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group_1__0__Impl_in_rule__ArithmeticExpression__Group_1__05286 = new BitSet(new long[]{0x00000001F8000000L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group_1__1_in_rule__ArithmeticExpression__Group_1__05289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group_1__1__Impl_in_rule__ArithmeticExpression__Group_1__15347 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group_1__2_in_rule__ArithmeticExpression__Group_1__15350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__OperatorAssignment_1_1_in_rule__ArithmeticExpression__Group_1__1__Impl5377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__Group_1__2__Impl_in_rule__ArithmeticExpression__Group_1__25407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmeticExpression__RightExpressionAssignment_1_2_in_rule__ArithmeticExpression__Group_1__2__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__05470 = new BitSet(new long[]{0x0000007E00000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__05473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_rule__ComparisonExpression__Group__0__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__15529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl5556 = new BitSet(new long[]{0x0000007E00000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__05591 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__05594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0__0_in_rule__ComparisonExpression__Group_1__0__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__15651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__RightExpressionAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0__0__Impl_in_rule__ComparisonExpression__Group_1_0__05712 = new BitSet(new long[]{0x0000007E00000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0__1_in_rule__ComparisonExpression__Group_1_0__05715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0__1__Impl_in_rule__ComparisonExpression__Group_1_0__15773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__OperatorAssignment_1_0_1_in_rule__ComparisonExpression__Group_1_0__1__Impl5800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group__0__Impl_in_rule__BinaryLogicExpression__Group__05834 = new BitSet(new long[]{0x0000000007F00002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group__1_in_rule__BinaryLogicExpression__Group__05837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Alternatives_0_in_rule__BinaryLogicExpression__Group__0__Impl5864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group__1__Impl_in_rule__BinaryLogicExpression__Group__15894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group_1__0_in_rule__BinaryLogicExpression__Group__1__Impl5921 = new BitSet(new long[]{0x0000000007F00002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group_1__0__Impl_in_rule__BinaryLogicExpression__Group_1__05956 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group_1__1_in_rule__BinaryLogicExpression__Group_1__05959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group_1_0__0_in_rule__BinaryLogicExpression__Group_1__0__Impl5986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group_1__1__Impl_in_rule__BinaryLogicExpression__Group_1__16016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__RightExpressionAssignment_1_1_in_rule__BinaryLogicExpression__Group_1__1__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group_1_0__0__Impl_in_rule__BinaryLogicExpression__Group_1_0__06077 = new BitSet(new long[]{0x0000000007F00000L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group_1_0__1_in_rule__BinaryLogicExpression__Group_1_0__06080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__Group_1_0__1__Impl_in_rule__BinaryLogicExpression__Group_1_0__16138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__OperatorAssignment_1_0_1_in_rule__BinaryLogicExpression__Group_1_0__1__Impl6165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group__0__Impl_in_rule__UnaryExpression__Group__06199 = new BitSet(new long[]{0x0000008018000000L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group__1_in_rule__UnaryExpression__Group__06202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group__1__Impl_in_rule__UnaryExpression__Group__16260 = new BitSet(new long[]{0x0000080000000030L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group__2_in_rule__UnaryExpression__Group__16263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__UnaryOperatorAssignment_1_in_rule__UnaryExpression__Group__1__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group__2__Impl_in_rule__UnaryExpression__Group__26320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__UnaryExpressionAssignment_2_in_rule__UnaryExpression__Group__2__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_0__0__Impl_in_rule__LiteralExpression__Group_0__06383 = new BitSet(new long[]{0x0000088018000030L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_0__1_in_rule__LiteralExpression__Group_0__06386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__LiteralExpression__Group_0__0__Impl6414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_0__1__Impl_in_rule__LiteralExpression__Group_0__16445 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_0__2_in_rule__LiteralExpression__Group_0__16448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__LiteralExpression__Group_0__1__Impl6475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_0__2__Impl_in_rule__LiteralExpression__Group_0__26504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__LiteralExpression__Group_0__2__Impl6532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_1__0__Impl_in_rule__LiteralExpression__Group_1__06569 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_1__1_in_rule__LiteralExpression__Group_1__06572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_1__1__Impl_in_rule__LiteralExpression__Group_1__16630 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_1__2_in_rule__LiteralExpression__Group_1__16633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__ValueAssignment_1_1_in_rule__LiteralExpression__Group_1__1__Impl6660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_1__2__Impl_in_rule__LiteralExpression__Group_1__26690 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_1__3_in_rule__LiteralExpression__Group_1__26693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__LiteralExpression__Group_1__2__Impl6721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__Group_1__3__Impl_in_rule__LiteralExpression__Group_1__36752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralExpression__ValueTypeAssignment_1_3_in_rule__LiteralExpression__Group_1__3__Impl6779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeExpression__Group_1__0__Impl_in_rule__AttributeExpression__Group_1__06817 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AttributeExpression__Group_1__1_in_rule__AttributeExpression__Group_1__06820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeExpression__Group_1__1__Impl_in_rule__AttributeExpression__Group_1__16878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeExpression__AttributeAssignment_1_1_in_rule__AttributeExpression__Group_1__1__Impl6905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_rule__Block__ExpressionsAssignment_16944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__ForLoop__InitalizeExpressionAssignment_26975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ForLoop__LoopTestAssignment_37006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_rule__ForLoop__CountingExpressionAssignment_57037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__ForLoop__BlockAssignment_77068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__WhileLoop__LoopTestAssignment_27099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__WhileLoop__BlockAssignment_47130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__DoWhileLoop__BlockAssignment_17161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__DoWhileLoop__LoopTestAssignment_47192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__IfStatement__IfConditionAssignment_27223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__IfStatement__IfBlockAssignment_47254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__IfStatement__ElseIfConditionsAssignment_5_27285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__IfStatement__ElseIfBlocksAssignment_5_47316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlock_in_rule__IfStatement__ElseBlockAssignment_6_17347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__AttributeAssignment_07382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_rule__Assignment__AssignOperatorAssignment_1_0_07417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__AssignExpressionAssignment_1_0_17448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperator_in_rule__Assignment__IncrementDecrementOperatorAssignment_1_17479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ForLoopCountingExpression__AttributeAssignment_07514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperator_in_rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_07549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_07580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_17611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticOperator_in_rule__ArithmeticExpression__OperatorAssignment_1_17642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__ArithmeticExpression__RightExpressionAssignment_1_27673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_rule__ComparisonExpression__OperatorAssignment_1_0_17704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_rule__ComparisonExpression__RightExpressionAssignment_1_17735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicOperator_in_rule__BinaryLogicExpression__OperatorAssignment_1_0_17766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0_in_rule__BinaryLogicExpression__RightExpressionAssignment_1_17797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryExpression__UnaryOperatorAssignment_17830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_rule__UnaryExpression__UnaryExpressionAssignment_27861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifierOrValue_in_rule__LiteralExpression__ValueAssignment_1_17892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__LiteralExpression__ValueTypeAssignment_1_37927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeExpression__AttributeAssignment_1_17966 = new BitSet(new long[]{0x0000000000000002L});
    }


}