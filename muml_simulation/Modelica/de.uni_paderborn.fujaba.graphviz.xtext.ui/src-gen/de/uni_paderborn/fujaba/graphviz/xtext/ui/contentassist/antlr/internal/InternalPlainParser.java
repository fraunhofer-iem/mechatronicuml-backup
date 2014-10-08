package de.uni_paderborn.fujaba.graphviz.xtext.ui.contentassist.antlr.internal; 

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
import de.uni_paderborn.fujaba.graphviz.xtext.services.PlainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'stop'", "'node'", "'edge'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=7;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=4;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalPlainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlainParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g"; }


     
     	private PlainGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PlainGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleGraph"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:60:1: entryRuleGraph : ruleGraph EOF ;
    public final void entryRuleGraph() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:61:1: ( ruleGraph EOF )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:62:1: ruleGraph EOF
            {
             before(grammarAccess.getGraphRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGraph_in_entryRuleGraph61);
            ruleGraph();

            state._fsp--;

             after(grammarAccess.getGraphRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGraph68); 

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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:69:1: ruleGraph : ( ( rule__Graph__Group__0 ) ) ;
    public final void ruleGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:73:2: ( ( ( rule__Graph__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:74:1: ( ( rule__Graph__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:74:1: ( ( rule__Graph__Group__0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:75:1: ( rule__Graph__Group__0 )
            {
             before(grammarAccess.getGraphAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:76:1: ( rule__Graph__Group__0 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:76:2: rule__Graph__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__0_in_ruleGraph94);
            rule__Graph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleNode"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:88:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:89:1: ( ruleNode EOF )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:90:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_entryRuleNode121);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNode128); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:97:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:101:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:102:1: ( ( rule__Node__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:102:1: ( ( rule__Node__Group__0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:103:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:104:1: ( rule__Node__Group__0 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:104:2: rule__Node__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__0_in_ruleNode154);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleEdge"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:116:1: entryRuleEdge : ruleEdge EOF ;
    public final void entryRuleEdge() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:117:1: ( ruleEdge EOF )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:118:1: ruleEdge EOF
            {
             before(grammarAccess.getEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEdge_in_entryRuleEdge181);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getEdgeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEdge188); 

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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:125:1: ruleEdge : ( ( rule__Edge__Group__0 ) ) ;
    public final void ruleEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:129:2: ( ( ( rule__Edge__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:130:1: ( ( rule__Edge__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:130:1: ( ( rule__Edge__Group__0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:131:1: ( rule__Edge__Group__0 )
            {
             before(grammarAccess.getEdgeAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:132:1: ( rule__Edge__Group__0 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:132:2: rule__Edge__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__0_in_ruleEdge214);
            rule__Edge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRulePoint"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:144:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:145:1: ( rulePoint EOF )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:146:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_entryRulePoint241);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePoint248); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:153:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:157:2: ( ( ( rule__Point__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:158:1: ( ( rule__Point__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:158:1: ( ( rule__Point__Group__0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:159:1: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:160:1: ( rule__Point__Group__0 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:160:2: rule__Point__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__0_in_rulePoint274);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleNumber"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:172:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:173:1: ( ruleNumber EOF )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:174:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber301);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber308); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:181:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:185:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:186:1: ( ( rule__Number__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:186:1: ( ( rule__Number__Alternatives ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:187:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:188:1: ( rule__Number__Alternatives )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:188:2: rule__Number__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Alternatives_in_ruleNumber334);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleIdentifier"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:200:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:201:1: ( ruleIdentifier EOF )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:202:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier361);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier368); 

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:209:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:213:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:214:1: ( ( rule__Identifier__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:214:1: ( ( rule__Identifier__Alternatives ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:215:1: ( rule__Identifier__Alternatives )
            {
             before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:216:1: ( rule__Identifier__Alternatives )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:216:2: rule__Identifier__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier394);
            rule__Identifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "rule__Number__Alternatives"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:228:1: rule__Number__Alternatives : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:232:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOUBLE) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:233:1: ( RULE_DOUBLE )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:233:1: ( RULE_DOUBLE )
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:234:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 
                    match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives430); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:239:6: ( RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:239:6: ( RULE_INT )
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:240:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Number__Alternatives447); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Identifier__Alternatives"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:250:1: rule__Identifier__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:254:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:255:1: ( RULE_ID )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:255:1: ( RULE_ID )
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:256:1: RULE_ID
                    {
                     before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Identifier__Alternatives479); 
                     after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:261:6: ( RULE_STRING )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:261:6: ( RULE_STRING )
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:262:1: RULE_STRING
                    {
                     before(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives496); 
                     after(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Identifier__Alternatives"


    // $ANTLR start "rule__Graph__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:274:1: rule__Graph__Group__0 : rule__Graph__Group__0__Impl rule__Graph__Group__1 ;
    public final void rule__Graph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:278:1: ( rule__Graph__Group__0__Impl rule__Graph__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:279:2: rule__Graph__Group__0__Impl rule__Graph__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__0__Impl_in_rule__Graph__Group__0526);
            rule__Graph__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__1_in_rule__Graph__Group__0529);
            rule__Graph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0"


    // $ANTLR start "rule__Graph__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:286:1: rule__Graph__Group__0__Impl : ( 'graph' ) ;
    public final void rule__Graph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:290:1: ( ( 'graph' ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:291:1: ( 'graph' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:291:1: ( 'graph' )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:292:1: 'graph'
            {
             before(grammarAccess.getGraphAccess().getGraphKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Graph__Group__0__Impl557); 
             after(grammarAccess.getGraphAccess().getGraphKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__0__Impl"


    // $ANTLR start "rule__Graph__Group__1"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:305:1: rule__Graph__Group__1 : rule__Graph__Group__1__Impl rule__Graph__Group__2 ;
    public final void rule__Graph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:309:1: ( rule__Graph__Group__1__Impl rule__Graph__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:310:2: rule__Graph__Group__1__Impl rule__Graph__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__1__Impl_in_rule__Graph__Group__1588);
            rule__Graph__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__2_in_rule__Graph__Group__1591);
            rule__Graph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1"


    // $ANTLR start "rule__Graph__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:317:1: rule__Graph__Group__1__Impl : ( ( rule__Graph__ScaleAssignment_1 ) ) ;
    public final void rule__Graph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:321:1: ( ( ( rule__Graph__ScaleAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:322:1: ( ( rule__Graph__ScaleAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:322:1: ( ( rule__Graph__ScaleAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:323:1: ( rule__Graph__ScaleAssignment_1 )
            {
             before(grammarAccess.getGraphAccess().getScaleAssignment_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:324:1: ( rule__Graph__ScaleAssignment_1 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:324:2: rule__Graph__ScaleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__ScaleAssignment_1_in_rule__Graph__Group__1__Impl618);
            rule__Graph__ScaleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getScaleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__1__Impl"


    // $ANTLR start "rule__Graph__Group__2"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:334:1: rule__Graph__Group__2 : rule__Graph__Group__2__Impl rule__Graph__Group__3 ;
    public final void rule__Graph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:338:1: ( rule__Graph__Group__2__Impl rule__Graph__Group__3 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:339:2: rule__Graph__Group__2__Impl rule__Graph__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__2__Impl_in_rule__Graph__Group__2648);
            rule__Graph__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__3_in_rule__Graph__Group__2651);
            rule__Graph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2"


    // $ANTLR start "rule__Graph__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:346:1: rule__Graph__Group__2__Impl : ( ( rule__Graph__WidthAssignment_2 ) ) ;
    public final void rule__Graph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:350:1: ( ( ( rule__Graph__WidthAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:351:1: ( ( rule__Graph__WidthAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:351:1: ( ( rule__Graph__WidthAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:352:1: ( rule__Graph__WidthAssignment_2 )
            {
             before(grammarAccess.getGraphAccess().getWidthAssignment_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:353:1: ( rule__Graph__WidthAssignment_2 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:353:2: rule__Graph__WidthAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__WidthAssignment_2_in_rule__Graph__Group__2__Impl678);
            rule__Graph__WidthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getWidthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__2__Impl"


    // $ANTLR start "rule__Graph__Group__3"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:363:1: rule__Graph__Group__3 : rule__Graph__Group__3__Impl rule__Graph__Group__4 ;
    public final void rule__Graph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:367:1: ( rule__Graph__Group__3__Impl rule__Graph__Group__4 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:368:2: rule__Graph__Group__3__Impl rule__Graph__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__3__Impl_in_rule__Graph__Group__3708);
            rule__Graph__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__4_in_rule__Graph__Group__3711);
            rule__Graph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3"


    // $ANTLR start "rule__Graph__Group__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:375:1: rule__Graph__Group__3__Impl : ( ( rule__Graph__HeightAssignment_3 ) ) ;
    public final void rule__Graph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:379:1: ( ( ( rule__Graph__HeightAssignment_3 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:380:1: ( ( rule__Graph__HeightAssignment_3 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:380:1: ( ( rule__Graph__HeightAssignment_3 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:381:1: ( rule__Graph__HeightAssignment_3 )
            {
             before(grammarAccess.getGraphAccess().getHeightAssignment_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:382:1: ( rule__Graph__HeightAssignment_3 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:382:2: rule__Graph__HeightAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__HeightAssignment_3_in_rule__Graph__Group__3__Impl738);
            rule__Graph__HeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGraphAccess().getHeightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__3__Impl"


    // $ANTLR start "rule__Graph__Group__4"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:392:1: rule__Graph__Group__4 : rule__Graph__Group__4__Impl rule__Graph__Group__5 ;
    public final void rule__Graph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:396:1: ( rule__Graph__Group__4__Impl rule__Graph__Group__5 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:397:2: rule__Graph__Group__4__Impl rule__Graph__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__4__Impl_in_rule__Graph__Group__4768);
            rule__Graph__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__5_in_rule__Graph__Group__4771);
            rule__Graph__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4"


    // $ANTLR start "rule__Graph__Group__4__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:404:1: rule__Graph__Group__4__Impl : ( ( rule__Graph__NodesAssignment_4 )* ) ;
    public final void rule__Graph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:408:1: ( ( ( rule__Graph__NodesAssignment_4 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:409:1: ( ( rule__Graph__NodesAssignment_4 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:409:1: ( ( rule__Graph__NodesAssignment_4 )* )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:410:1: ( rule__Graph__NodesAssignment_4 )*
            {
             before(grammarAccess.getGraphAccess().getNodesAssignment_4()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:411:1: ( rule__Graph__NodesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:411:2: rule__Graph__NodesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Graph__NodesAssignment_4_in_rule__Graph__Group__4__Impl798);
            	    rule__Graph__NodesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getGraphAccess().getNodesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__4__Impl"


    // $ANTLR start "rule__Graph__Group__5"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:421:1: rule__Graph__Group__5 : rule__Graph__Group__5__Impl rule__Graph__Group__6 ;
    public final void rule__Graph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:425:1: ( rule__Graph__Group__5__Impl rule__Graph__Group__6 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:426:2: rule__Graph__Group__5__Impl rule__Graph__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__5__Impl_in_rule__Graph__Group__5829);
            rule__Graph__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__6_in_rule__Graph__Group__5832);
            rule__Graph__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__5"


    // $ANTLR start "rule__Graph__Group__5__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:433:1: rule__Graph__Group__5__Impl : ( ( rule__Graph__EdgesAssignment_5 )* ) ;
    public final void rule__Graph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:437:1: ( ( ( rule__Graph__EdgesAssignment_5 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:438:1: ( ( rule__Graph__EdgesAssignment_5 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:438:1: ( ( rule__Graph__EdgesAssignment_5 )* )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:439:1: ( rule__Graph__EdgesAssignment_5 )*
            {
             before(grammarAccess.getGraphAccess().getEdgesAssignment_5()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:440:1: ( rule__Graph__EdgesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:440:2: rule__Graph__EdgesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Graph__EdgesAssignment_5_in_rule__Graph__Group__5__Impl859);
            	    rule__Graph__EdgesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGraphAccess().getEdgesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__5__Impl"


    // $ANTLR start "rule__Graph__Group__6"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:450:1: rule__Graph__Group__6 : rule__Graph__Group__6__Impl ;
    public final void rule__Graph__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:454:1: ( rule__Graph__Group__6__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:455:2: rule__Graph__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Graph__Group__6__Impl_in_rule__Graph__Group__6890);
            rule__Graph__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__6"


    // $ANTLR start "rule__Graph__Group__6__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:461:1: rule__Graph__Group__6__Impl : ( 'stop' ) ;
    public final void rule__Graph__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:465:1: ( ( 'stop' ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:466:1: ( 'stop' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:466:1: ( 'stop' )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:467:1: 'stop'
            {
             before(grammarAccess.getGraphAccess().getStopKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Graph__Group__6__Impl918); 
             after(grammarAccess.getGraphAccess().getStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Group__6__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:494:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:498:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:499:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__0963);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__1_in_rule__Node__Group__0966);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:506:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:510:1: ( ( 'node' ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:511:1: ( 'node' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:511:1: ( 'node' )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:512:1: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Node__Group__0__Impl994); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:525:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:529:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:530:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11025);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11028);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:537:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:541:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:542:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:542:1: ( ( rule__Node__NameAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:543:1: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:544:1: ( rule__Node__NameAssignment_1 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:544:2: rule__Node__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl1055);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:554:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:558:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:559:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21085);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21088);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:566:1: rule__Node__Group__2__Impl : ( ( rule__Node__PositionAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:570:1: ( ( ( rule__Node__PositionAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:571:1: ( ( rule__Node__PositionAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:571:1: ( ( rule__Node__PositionAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:572:1: ( rule__Node__PositionAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getPositionAssignment_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:573:1: ( rule__Node__PositionAssignment_2 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:573:2: rule__Node__PositionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__PositionAssignment_2_in_rule__Node__Group__2__Impl1115);
            rule__Node__PositionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getPositionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:583:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:587:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:588:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__31145);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__4_in_rule__Node__Group__31148);
            rule__Node__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:595:1: rule__Node__Group__3__Impl : ( ( rule__Node__WidthAssignment_3 ) ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:599:1: ( ( ( rule__Node__WidthAssignment_3 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:600:1: ( ( rule__Node__WidthAssignment_3 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:600:1: ( ( rule__Node__WidthAssignment_3 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:601:1: ( rule__Node__WidthAssignment_3 )
            {
             before(grammarAccess.getNodeAccess().getWidthAssignment_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:602:1: ( rule__Node__WidthAssignment_3 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:602:2: rule__Node__WidthAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__WidthAssignment_3_in_rule__Node__Group__3__Impl1175);
            rule__Node__WidthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getWidthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:612:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:616:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:617:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__41205);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__5_in_rule__Node__Group__41208);
            rule__Node__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:624:1: rule__Node__Group__4__Impl : ( ( rule__Node__HeightAssignment_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:628:1: ( ( ( rule__Node__HeightAssignment_4 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:629:1: ( ( rule__Node__HeightAssignment_4 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:629:1: ( ( rule__Node__HeightAssignment_4 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:630:1: ( rule__Node__HeightAssignment_4 )
            {
             before(grammarAccess.getNodeAccess().getHeightAssignment_4()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:631:1: ( rule__Node__HeightAssignment_4 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:631:2: rule__Node__HeightAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__HeightAssignment_4_in_rule__Node__Group__4__Impl1235);
            rule__Node__HeightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getHeightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:641:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:645:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:646:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__51265);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__6_in_rule__Node__Group__51268);
            rule__Node__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:653:1: rule__Node__Group__5__Impl : ( ruleIdentifier ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:657:1: ( ( ruleIdentifier ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:658:1: ( ruleIdentifier )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:658:1: ( ruleIdentifier )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:659:1: ruleIdentifier
            {
             before(grammarAccess.getNodeAccess().getIdentifierParserRuleCall_5()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__Node__Group__5__Impl1295);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getIdentifierParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__6"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:670:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:674:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:675:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__61324);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__7_in_rule__Node__Group__61327);
            rule__Node__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6"


    // $ANTLR start "rule__Node__Group__6__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:682:1: rule__Node__Group__6__Impl : ( RULE_ID ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:686:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:687:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:687:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:688:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getIDTerminalRuleCall_6()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Node__Group__6__Impl1354); 
             after(grammarAccess.getNodeAccess().getIDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6__Impl"


    // $ANTLR start "rule__Node__Group__7"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:699:1: rule__Node__Group__7 : rule__Node__Group__7__Impl rule__Node__Group__8 ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:703:1: ( rule__Node__Group__7__Impl rule__Node__Group__8 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:704:2: rule__Node__Group__7__Impl rule__Node__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__71383);
            rule__Node__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__8_in_rule__Node__Group__71386);
            rule__Node__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7"


    // $ANTLR start "rule__Node__Group__7__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:711:1: rule__Node__Group__7__Impl : ( RULE_ID ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:715:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:716:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:716:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:717:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getIDTerminalRuleCall_7()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Node__Group__7__Impl1413); 
             after(grammarAccess.getNodeAccess().getIDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7__Impl"


    // $ANTLR start "rule__Node__Group__8"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:728:1: rule__Node__Group__8 : rule__Node__Group__8__Impl rule__Node__Group__9 ;
    public final void rule__Node__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:732:1: ( rule__Node__Group__8__Impl rule__Node__Group__9 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:733:2: rule__Node__Group__8__Impl rule__Node__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__81442);
            rule__Node__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__9_in_rule__Node__Group__81445);
            rule__Node__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8"


    // $ANTLR start "rule__Node__Group__8__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:740:1: rule__Node__Group__8__Impl : ( RULE_ID ) ;
    public final void rule__Node__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:744:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:745:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:745:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:746:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getIDTerminalRuleCall_8()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Node__Group__8__Impl1472); 
             after(grammarAccess.getNodeAccess().getIDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8__Impl"


    // $ANTLR start "rule__Node__Group__9"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:757:1: rule__Node__Group__9 : rule__Node__Group__9__Impl ;
    public final void rule__Node__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:761:1: ( rule__Node__Group__9__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:762:2: rule__Node__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__91501);
            rule__Node__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9"


    // $ANTLR start "rule__Node__Group__9__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:768:1: rule__Node__Group__9__Impl : ( RULE_ID ) ;
    public final void rule__Node__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:772:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:773:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:773:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:774:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getIDTerminalRuleCall_9()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Node__Group__9__Impl1528); 
             after(grammarAccess.getNodeAccess().getIDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9__Impl"


    // $ANTLR start "rule__Edge__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:805:1: rule__Edge__Group__0 : rule__Edge__Group__0__Impl rule__Edge__Group__1 ;
    public final void rule__Edge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:809:1: ( rule__Edge__Group__0__Impl rule__Edge__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:810:2: rule__Edge__Group__0__Impl rule__Edge__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__0__Impl_in_rule__Edge__Group__01577);
            rule__Edge__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__1_in_rule__Edge__Group__01580);
            rule__Edge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__0"


    // $ANTLR start "rule__Edge__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:817:1: rule__Edge__Group__0__Impl : ( 'edge' ) ;
    public final void rule__Edge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:821:1: ( ( 'edge' ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:822:1: ( 'edge' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:822:1: ( 'edge' )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:823:1: 'edge'
            {
             before(grammarAccess.getEdgeAccess().getEdgeKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Edge__Group__0__Impl1608); 
             after(grammarAccess.getEdgeAccess().getEdgeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__0__Impl"


    // $ANTLR start "rule__Edge__Group__1"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:836:1: rule__Edge__Group__1 : rule__Edge__Group__1__Impl rule__Edge__Group__2 ;
    public final void rule__Edge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:840:1: ( rule__Edge__Group__1__Impl rule__Edge__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:841:2: rule__Edge__Group__1__Impl rule__Edge__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__1__Impl_in_rule__Edge__Group__11639);
            rule__Edge__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__2_in_rule__Edge__Group__11642);
            rule__Edge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__1"


    // $ANTLR start "rule__Edge__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:848:1: rule__Edge__Group__1__Impl : ( ( rule__Edge__SourceAssignment_1 ) ) ;
    public final void rule__Edge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:852:1: ( ( ( rule__Edge__SourceAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:853:1: ( ( rule__Edge__SourceAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:853:1: ( ( rule__Edge__SourceAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:854:1: ( rule__Edge__SourceAssignment_1 )
            {
             before(grammarAccess.getEdgeAccess().getSourceAssignment_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:855:1: ( rule__Edge__SourceAssignment_1 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:855:2: rule__Edge__SourceAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__SourceAssignment_1_in_rule__Edge__Group__1__Impl1669);
            rule__Edge__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getSourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__1__Impl"


    // $ANTLR start "rule__Edge__Group__2"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:865:1: rule__Edge__Group__2 : rule__Edge__Group__2__Impl rule__Edge__Group__3 ;
    public final void rule__Edge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:869:1: ( rule__Edge__Group__2__Impl rule__Edge__Group__3 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:870:2: rule__Edge__Group__2__Impl rule__Edge__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__2__Impl_in_rule__Edge__Group__21699);
            rule__Edge__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__3_in_rule__Edge__Group__21702);
            rule__Edge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__2"


    // $ANTLR start "rule__Edge__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:877:1: rule__Edge__Group__2__Impl : ( ( rule__Edge__TargetAssignment_2 ) ) ;
    public final void rule__Edge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:881:1: ( ( ( rule__Edge__TargetAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:882:1: ( ( rule__Edge__TargetAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:882:1: ( ( rule__Edge__TargetAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:883:1: ( rule__Edge__TargetAssignment_2 )
            {
             before(grammarAccess.getEdgeAccess().getTargetAssignment_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:884:1: ( rule__Edge__TargetAssignment_2 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:884:2: rule__Edge__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__TargetAssignment_2_in_rule__Edge__Group__2__Impl1729);
            rule__Edge__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__2__Impl"


    // $ANTLR start "rule__Edge__Group__3"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:894:1: rule__Edge__Group__3 : rule__Edge__Group__3__Impl rule__Edge__Group__4 ;
    public final void rule__Edge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:898:1: ( rule__Edge__Group__3__Impl rule__Edge__Group__4 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:899:2: rule__Edge__Group__3__Impl rule__Edge__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__3__Impl_in_rule__Edge__Group__31759);
            rule__Edge__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__4_in_rule__Edge__Group__31762);
            rule__Edge__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__3"


    // $ANTLR start "rule__Edge__Group__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:906:1: rule__Edge__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Edge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:910:1: ( ( RULE_INT ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:911:1: ( RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:911:1: ( RULE_INT )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:912:1: RULE_INT
            {
             before(grammarAccess.getEdgeAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Edge__Group__3__Impl1789); 
             after(grammarAccess.getEdgeAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__3__Impl"


    // $ANTLR start "rule__Edge__Group__4"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:923:1: rule__Edge__Group__4 : rule__Edge__Group__4__Impl rule__Edge__Group__5 ;
    public final void rule__Edge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:927:1: ( rule__Edge__Group__4__Impl rule__Edge__Group__5 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:928:2: rule__Edge__Group__4__Impl rule__Edge__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__4__Impl_in_rule__Edge__Group__41818);
            rule__Edge__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__5_in_rule__Edge__Group__41821);
            rule__Edge__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__4"


    // $ANTLR start "rule__Edge__Group__4__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:935:1: rule__Edge__Group__4__Impl : ( ( rule__Edge__SplinePointsAssignment_4 )* ) ;
    public final void rule__Edge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:939:1: ( ( ( rule__Edge__SplinePointsAssignment_4 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:940:1: ( ( rule__Edge__SplinePointsAssignment_4 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:940:1: ( ( rule__Edge__SplinePointsAssignment_4 )* )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:941:1: ( rule__Edge__SplinePointsAssignment_4 )*
            {
             before(grammarAccess.getEdgeAccess().getSplinePointsAssignment_4()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:942:1: ( rule__Edge__SplinePointsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_DOUBLE && LA5_0<=RULE_INT)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:942:2: rule__Edge__SplinePointsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Edge__SplinePointsAssignment_4_in_rule__Edge__Group__4__Impl1848);
            	    rule__Edge__SplinePointsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEdgeAccess().getSplinePointsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__4__Impl"


    // $ANTLR start "rule__Edge__Group__5"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:952:1: rule__Edge__Group__5 : rule__Edge__Group__5__Impl rule__Edge__Group__6 ;
    public final void rule__Edge__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:956:1: ( rule__Edge__Group__5__Impl rule__Edge__Group__6 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:957:2: rule__Edge__Group__5__Impl rule__Edge__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__5__Impl_in_rule__Edge__Group__51879);
            rule__Edge__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__6_in_rule__Edge__Group__51882);
            rule__Edge__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__5"


    // $ANTLR start "rule__Edge__Group__5__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:964:1: rule__Edge__Group__5__Impl : ( ( rule__Edge__Group_5__0 )? ) ;
    public final void rule__Edge__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:968:1: ( ( ( rule__Edge__Group_5__0 )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:969:1: ( ( rule__Edge__Group_5__0 )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:969:1: ( ( rule__Edge__Group_5__0 )? )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:970:1: ( rule__Edge__Group_5__0 )?
            {
             before(grammarAccess.getEdgeAccess().getGroup_5()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:971:1: ( rule__Edge__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=RULE_DOUBLE && LA6_1<=RULE_INT)) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:971:2: rule__Edge__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Edge__Group_5__0_in_rule__Edge__Group__5__Impl1909);
                    rule__Edge__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEdgeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__5__Impl"


    // $ANTLR start "rule__Edge__Group__6"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:981:1: rule__Edge__Group__6 : rule__Edge__Group__6__Impl rule__Edge__Group__7 ;
    public final void rule__Edge__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:985:1: ( rule__Edge__Group__6__Impl rule__Edge__Group__7 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:986:2: rule__Edge__Group__6__Impl rule__Edge__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__6__Impl_in_rule__Edge__Group__61940);
            rule__Edge__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__7_in_rule__Edge__Group__61943);
            rule__Edge__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__6"


    // $ANTLR start "rule__Edge__Group__6__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:993:1: rule__Edge__Group__6__Impl : ( RULE_ID ) ;
    public final void rule__Edge__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:997:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:998:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:998:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:999:1: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getIDTerminalRuleCall_6()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Edge__Group__6__Impl1970); 
             after(grammarAccess.getEdgeAccess().getIDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__6__Impl"


    // $ANTLR start "rule__Edge__Group__7"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1010:1: rule__Edge__Group__7 : rule__Edge__Group__7__Impl ;
    public final void rule__Edge__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1014:1: ( rule__Edge__Group__7__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1015:2: rule__Edge__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group__7__Impl_in_rule__Edge__Group__71999);
            rule__Edge__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__7"


    // $ANTLR start "rule__Edge__Group__7__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1021:1: rule__Edge__Group__7__Impl : ( RULE_ID ) ;
    public final void rule__Edge__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1025:1: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1026:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1026:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1027:1: RULE_ID
            {
             before(grammarAccess.getEdgeAccess().getIDTerminalRuleCall_7()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Edge__Group__7__Impl2026); 
             after(grammarAccess.getEdgeAccess().getIDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group__7__Impl"


    // $ANTLR start "rule__Edge__Group_5__0"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1054:1: rule__Edge__Group_5__0 : rule__Edge__Group_5__0__Impl rule__Edge__Group_5__1 ;
    public final void rule__Edge__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1058:1: ( rule__Edge__Group_5__0__Impl rule__Edge__Group_5__1 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1059:2: rule__Edge__Group_5__0__Impl rule__Edge__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group_5__0__Impl_in_rule__Edge__Group_5__02071);
            rule__Edge__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group_5__1_in_rule__Edge__Group_5__02074);
            rule__Edge__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_5__0"


    // $ANTLR start "rule__Edge__Group_5__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1066:1: rule__Edge__Group_5__0__Impl : ( ruleIdentifier ) ;
    public final void rule__Edge__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1070:1: ( ( ruleIdentifier ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1071:1: ( ruleIdentifier )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1071:1: ( ruleIdentifier )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1072:1: ruleIdentifier
            {
             before(grammarAccess.getEdgeAccess().getIdentifierParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__Edge__Group_5__0__Impl2101);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getIdentifierParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_5__0__Impl"


    // $ANTLR start "rule__Edge__Group_5__1"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1083:1: rule__Edge__Group_5__1 : rule__Edge__Group_5__1__Impl rule__Edge__Group_5__2 ;
    public final void rule__Edge__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1087:1: ( rule__Edge__Group_5__1__Impl rule__Edge__Group_5__2 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1088:2: rule__Edge__Group_5__1__Impl rule__Edge__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group_5__1__Impl_in_rule__Edge__Group_5__12130);
            rule__Edge__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group_5__2_in_rule__Edge__Group_5__12133);
            rule__Edge__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_5__1"


    // $ANTLR start "rule__Edge__Group_5__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1095:1: rule__Edge__Group_5__1__Impl : ( ruleNumber ) ;
    public final void rule__Edge__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1099:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1100:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1100:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1101:1: ruleNumber
            {
             before(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Edge__Group_5__1__Impl2160);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_5__1__Impl"


    // $ANTLR start "rule__Edge__Group_5__2"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1112:1: rule__Edge__Group_5__2 : rule__Edge__Group_5__2__Impl ;
    public final void rule__Edge__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1116:1: ( rule__Edge__Group_5__2__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1117:2: rule__Edge__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Edge__Group_5__2__Impl_in_rule__Edge__Group_5__22189);
            rule__Edge__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_5__2"


    // $ANTLR start "rule__Edge__Group_5__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1123:1: rule__Edge__Group_5__2__Impl : ( ruleNumber ) ;
    public final void rule__Edge__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1127:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1128:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1128:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1129:1: ruleNumber
            {
             before(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_2()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Edge__Group_5__2__Impl2216);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__Group_5__2__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1146:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1150:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1151:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__0__Impl_in_rule__Point__Group__02251);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__1_in_rule__Point__Group__02254);
            rule__Point__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1158:1: rule__Point__Group__0__Impl : ( ( rule__Point__XAssignment_0 ) ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1162:1: ( ( ( rule__Point__XAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1163:1: ( ( rule__Point__XAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1163:1: ( ( rule__Point__XAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1164:1: ( rule__Point__XAssignment_0 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1165:1: ( rule__Point__XAssignment_0 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1165:2: rule__Point__XAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__XAssignment_0_in_rule__Point__Group__0__Impl2281);
            rule__Point__XAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getXAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1175:1: rule__Point__Group__1 : rule__Point__Group__1__Impl ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1179:1: ( rule__Point__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1180:2: rule__Point__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__Group__1__Impl_in_rule__Point__Group__12311);
            rule__Point__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1186:1: rule__Point__Group__1__Impl : ( ( rule__Point__YAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1190:1: ( ( ( rule__Point__YAssignment_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1191:1: ( ( rule__Point__YAssignment_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1191:1: ( ( rule__Point__YAssignment_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1192:1: ( rule__Point__YAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1193:1: ( rule__Point__YAssignment_1 )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1193:2: rule__Point__YAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Point__YAssignment_1_in_rule__Point__Group__1__Impl2338);
            rule__Point__YAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getYAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Graph__ScaleAssignment_1"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1208:1: rule__Graph__ScaleAssignment_1 : ( ruleNumber ) ;
    public final void rule__Graph__ScaleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1212:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1213:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1213:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1214:1: ruleNumber
            {
             before(grammarAccess.getGraphAccess().getScaleNumberParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Graph__ScaleAssignment_12377);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getScaleNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__ScaleAssignment_1"


    // $ANTLR start "rule__Graph__WidthAssignment_2"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1223:1: rule__Graph__WidthAssignment_2 : ( ruleNumber ) ;
    public final void rule__Graph__WidthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1227:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1228:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1228:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1229:1: ruleNumber
            {
             before(grammarAccess.getGraphAccess().getWidthNumberParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Graph__WidthAssignment_22408);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getWidthNumberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__WidthAssignment_2"


    // $ANTLR start "rule__Graph__HeightAssignment_3"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1238:1: rule__Graph__HeightAssignment_3 : ( ruleNumber ) ;
    public final void rule__Graph__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1242:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1243:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1243:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1244:1: ruleNumber
            {
             before(grammarAccess.getGraphAccess().getHeightNumberParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Graph__HeightAssignment_32439);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getHeightNumberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__HeightAssignment_3"


    // $ANTLR start "rule__Graph__NodesAssignment_4"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1253:1: rule__Graph__NodesAssignment_4 : ( ruleNode ) ;
    public final void rule__Graph__NodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1257:1: ( ( ruleNode ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1258:1: ( ruleNode )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1258:1: ( ruleNode )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1259:1: ruleNode
            {
             before(grammarAccess.getGraphAccess().getNodesNodeParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_rule__Graph__NodesAssignment_42470);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getNodesNodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__NodesAssignment_4"


    // $ANTLR start "rule__Graph__EdgesAssignment_5"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1268:1: rule__Graph__EdgesAssignment_5 : ( ruleEdge ) ;
    public final void rule__Graph__EdgesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1272:1: ( ( ruleEdge ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1273:1: ( ruleEdge )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1273:1: ( ruleEdge )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1274:1: ruleEdge
            {
             before(grammarAccess.getGraphAccess().getEdgesEdgeParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEdge_in_rule__Graph__EdgesAssignment_52501);
            ruleEdge();

            state._fsp--;

             after(grammarAccess.getGraphAccess().getEdgesEdgeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__EdgesAssignment_5"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1283:1: rule__Node__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1287:1: ( ( ruleIdentifier ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1288:1: ( ruleIdentifier )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1288:1: ( ruleIdentifier )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1289:1: ruleIdentifier
            {
             before(grammarAccess.getNodeAccess().getNameIdentifierParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__Node__NameAssignment_12532);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getNameIdentifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__PositionAssignment_2"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1298:1: rule__Node__PositionAssignment_2 : ( rulePoint ) ;
    public final void rule__Node__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1302:1: ( ( rulePoint ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1303:1: ( rulePoint )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1303:1: ( rulePoint )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1304:1: rulePoint
            {
             before(grammarAccess.getNodeAccess().getPositionPointParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_rule__Node__PositionAssignment_22563);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getPositionPointParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__PositionAssignment_2"


    // $ANTLR start "rule__Node__WidthAssignment_3"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1313:1: rule__Node__WidthAssignment_3 : ( ruleNumber ) ;
    public final void rule__Node__WidthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1317:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1318:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1318:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1319:1: ruleNumber
            {
             before(grammarAccess.getNodeAccess().getWidthNumberParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Node__WidthAssignment_32594);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getWidthNumberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__WidthAssignment_3"


    // $ANTLR start "rule__Node__HeightAssignment_4"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1328:1: rule__Node__HeightAssignment_4 : ( ruleNumber ) ;
    public final void rule__Node__HeightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1332:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1333:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1333:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1334:1: ruleNumber
            {
             before(grammarAccess.getNodeAccess().getHeightNumberParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Node__HeightAssignment_42625);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getHeightNumberParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__HeightAssignment_4"


    // $ANTLR start "rule__Edge__SourceAssignment_1"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1343:1: rule__Edge__SourceAssignment_1 : ( ( ruleIdentifier ) ) ;
    public final void rule__Edge__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1347:1: ( ( ( ruleIdentifier ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1348:1: ( ( ruleIdentifier ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1348:1: ( ( ruleIdentifier ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1349:1: ( ruleIdentifier )
            {
             before(grammarAccess.getEdgeAccess().getSourceNodeCrossReference_1_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1350:1: ( ruleIdentifier )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1351:1: ruleIdentifier
            {
             before(grammarAccess.getEdgeAccess().getSourceNodeIdentifierParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__Edge__SourceAssignment_12660);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getSourceNodeIdentifierParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getSourceNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__SourceAssignment_1"


    // $ANTLR start "rule__Edge__TargetAssignment_2"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1362:1: rule__Edge__TargetAssignment_2 : ( ( ruleIdentifier ) ) ;
    public final void rule__Edge__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1366:1: ( ( ( ruleIdentifier ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1367:1: ( ( ruleIdentifier ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1367:1: ( ( ruleIdentifier ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1368:1: ( ruleIdentifier )
            {
             before(grammarAccess.getEdgeAccess().getTargetNodeCrossReference_2_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1369:1: ( ruleIdentifier )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1370:1: ruleIdentifier
            {
             before(grammarAccess.getEdgeAccess().getTargetNodeIdentifierParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__Edge__TargetAssignment_22699);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getTargetNodeIdentifierParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEdgeAccess().getTargetNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__TargetAssignment_2"


    // $ANTLR start "rule__Edge__SplinePointsAssignment_4"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1381:1: rule__Edge__SplinePointsAssignment_4 : ( rulePoint ) ;
    public final void rule__Edge__SplinePointsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1385:1: ( ( rulePoint ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1386:1: ( rulePoint )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1386:1: ( rulePoint )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1387:1: rulePoint
            {
             before(grammarAccess.getEdgeAccess().getSplinePointsPointParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePoint_in_rule__Edge__SplinePointsAssignment_42734);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getEdgeAccess().getSplinePointsPointParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Edge__SplinePointsAssignment_4"


    // $ANTLR start "rule__Point__XAssignment_0"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1396:1: rule__Point__XAssignment_0 : ( ruleNumber ) ;
    public final void rule__Point__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1400:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1401:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1401:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1402:1: ruleNumber
            {
             before(grammarAccess.getPointAccess().getXNumberParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Point__XAssignment_02765);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getPointAccess().getXNumberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__XAssignment_0"


    // $ANTLR start "rule__Point__YAssignment_1"
    // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1411:1: rule__Point__YAssignment_1 : ( ruleNumber ) ;
    public final void rule__Point__YAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1415:1: ( ( ruleNumber ) )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1416:1: ( ruleNumber )
            {
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1416:1: ( ruleNumber )
            // ../de.uni_paderborn.fujaba.graphviz.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/xtext/ui/contentassist/antlr/internal/InternalPlain.g:1417:1: ruleNumber
            {
             before(grammarAccess.getPointAccess().getYNumberParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Point__YAssignment_12796);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getPointAccess().getYNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__YAssignment_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGraph_in_entryRuleGraph61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGraph68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__Group__0_in_ruleGraph94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_entryRuleNode121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNode128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEdge_in_entryRuleEdge181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEdge188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group__0_in_ruleEdge214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePoint_in_entryRulePoint241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePoint248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__0_in_rulePoint274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__Alternatives479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__Group__0__Impl_in_rule__Graph__Group__0526 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Graph__Group__1_in_rule__Graph__Group__0529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Graph__Group__0__Impl557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__Group__1__Impl_in_rule__Graph__Group__1588 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Graph__Group__2_in_rule__Graph__Group__1591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__ScaleAssignment_1_in_rule__Graph__Group__1__Impl618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__Group__2__Impl_in_rule__Graph__Group__2648 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Graph__Group__3_in_rule__Graph__Group__2651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__WidthAssignment_2_in_rule__Graph__Group__2__Impl678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__Group__3__Impl_in_rule__Graph__Group__3708 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Graph__Group__4_in_rule__Graph__Group__3711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__HeightAssignment_3_in_rule__Graph__Group__3__Impl738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__Group__4__Impl_in_rule__Graph__Group__4768 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Graph__Group__5_in_rule__Graph__Group__4771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__NodesAssignment_4_in_rule__Graph__Group__4__Impl798 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__Graph__Group__5__Impl_in_rule__Graph__Group__5829 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Graph__Group__6_in_rule__Graph__Group__5832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Graph__EdgesAssignment_5_in_rule__Graph__Group__5__Impl859 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Graph__Group__6__Impl_in_rule__Graph__Group__6890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Graph__Group__6__Impl918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__0963 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__0966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Node__Group__0__Impl994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11025 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__NameAssignment_1_in_rule__Node__Group__1__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21085 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__21088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__PositionAssignment_2_in_rule__Node__Group__2__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__31145 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__31148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__WidthAssignment_3_in_rule__Node__Group__3__Impl1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__41205 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__41208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__HeightAssignment_4_in_rule__Node__Group__4__Impl1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__51265 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__51268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__Node__Group__5__Impl1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__61324 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__61327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Node__Group__6__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__71383 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Node__Group__8_in_rule__Node__Group__71386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Node__Group__7__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__81442 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Node__Group__9_in_rule__Node__Group__81445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Node__Group__8__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__91501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Node__Group__9__Impl1528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group__0__Impl_in_rule__Edge__Group__01577 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Edge__Group__1_in_rule__Edge__Group__01580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Edge__Group__0__Impl1608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group__1__Impl_in_rule__Edge__Group__11639 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_rule__Edge__Group__2_in_rule__Edge__Group__11642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__SourceAssignment_1_in_rule__Edge__Group__1__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group__2__Impl_in_rule__Edge__Group__21699 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Edge__Group__3_in_rule__Edge__Group__21702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__TargetAssignment_2_in_rule__Edge__Group__2__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group__3__Impl_in_rule__Edge__Group__31759 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__Edge__Group__4_in_rule__Edge__Group__31762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Edge__Group__3__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group__4__Impl_in_rule__Edge__Group__41818 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__Edge__Group__5_in_rule__Edge__Group__41821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__SplinePointsAssignment_4_in_rule__Edge__Group__4__Impl1848 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Edge__Group__5__Impl_in_rule__Edge__Group__51879 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__Edge__Group__6_in_rule__Edge__Group__51882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group_5__0_in_rule__Edge__Group__5__Impl1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group__6__Impl_in_rule__Edge__Group__61940 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Edge__Group__7_in_rule__Edge__Group__61943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Edge__Group__6__Impl1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group__7__Impl_in_rule__Edge__Group__71999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Edge__Group__7__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group_5__0__Impl_in_rule__Edge__Group_5__02071 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Edge__Group_5__1_in_rule__Edge__Group_5__02074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__Edge__Group_5__0__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group_5__1__Impl_in_rule__Edge__Group_5__12130 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Edge__Group_5__2_in_rule__Edge__Group_5__12133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Edge__Group_5__1__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Edge__Group_5__2__Impl_in_rule__Edge__Group_5__22189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Edge__Group_5__2__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__0__Impl_in_rule__Point__Group__02251 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Point__Group__1_in_rule__Point__Group__02254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__XAssignment_0_in_rule__Point__Group__0__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__Group__1__Impl_in_rule__Point__Group__12311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Point__YAssignment_1_in_rule__Point__Group__1__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Graph__ScaleAssignment_12377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Graph__WidthAssignment_22408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Graph__HeightAssignment_32439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_rule__Graph__NodesAssignment_42470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEdge_in_rule__Graph__EdgesAssignment_52501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__Node__NameAssignment_12532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePoint_in_rule__Node__PositionAssignment_22563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Node__WidthAssignment_32594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Node__HeightAssignment_42625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__Edge__SourceAssignment_12660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__Edge__TargetAssignment_22699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePoint_in_rule__Edge__SplinePointsAssignment_42734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Point__XAssignment_02765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Point__YAssignment_12796 = new BitSet(new long[]{0x0000000000000002L});
    }


}