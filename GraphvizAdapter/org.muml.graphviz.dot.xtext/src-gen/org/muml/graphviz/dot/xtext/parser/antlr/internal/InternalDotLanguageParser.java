package org.muml.graphviz.dot.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.muml.graphviz.dot.xtext.services.DotLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOTSTRINGTERM", "RULE_NUMPREFIXEDID", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'digraph'", "'graph'", "'{'", "'['", "','", "']'", "';'", "'node'", "'edge'", "'}'", "'subgraph'", "'->'", "'--'", "'='", "'-'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_NUMPREFIXEDID=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_DOTSTRINGTERM=4;
    public static final int RULE_ID=6;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDotLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDotLanguage.g"; }



     	private DotLanguageGrammarAccess grammarAccess;
     	
        public InternalDotLanguageParser(TokenStream input, DotLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DotGraph";	
       	}
       	
       	@Override
       	protected DotLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDotGraph"
    // InternalDotLanguage.g:67:1: entryRuleDotGraph returns [EObject current=null] : iv_ruleDotGraph= ruleDotGraph EOF ;
    public final EObject entryRuleDotGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotGraph = null;


        try {
            // InternalDotLanguage.g:68:2: (iv_ruleDotGraph= ruleDotGraph EOF )
            // InternalDotLanguage.g:69:2: iv_ruleDotGraph= ruleDotGraph EOF
            {
             newCompositeNode(grammarAccess.getDotGraphRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDotGraph=ruleDotGraph();

            state._fsp--;

             current =iv_ruleDotGraph; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotGraph"


    // $ANTLR start "ruleDotGraph"
    // InternalDotLanguage.g:76:1: ruleDotGraph returns [EObject current=null] : ( () ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotGraphID ) )? otherlv_4= '{' ( (otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )? ) | (otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )? ) | (otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )? ) | ( (lv_subgraphs_26_0= ruleDotSubGraph ) ) | ( (lv_nodes_27_0= ruleDotNode ) ) | ( (lv_edges_28_0= ruleDotEdge ) ) )* otherlv_29= '}' ) ;
    public final EObject ruleDotGraph() throws RecognitionException {
        EObject current = null;

        Token lv_directedGraph_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_graphSettings_7_0 = null;

        EObject lv_graphSettings_9_0 = null;

        EObject lv_nodeSettings_14_0 = null;

        EObject lv_nodeSettings_16_0 = null;

        EObject lv_edgeSettings_21_0 = null;

        EObject lv_edgeSettings_23_0 = null;

        EObject lv_subgraphs_26_0 = null;

        EObject lv_nodes_27_0 = null;

        EObject lv_edges_28_0 = null;


         enterRule(); 
            
        try {
            // InternalDotLanguage.g:79:28: ( ( () ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotGraphID ) )? otherlv_4= '{' ( (otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )? ) | (otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )? ) | (otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )? ) | ( (lv_subgraphs_26_0= ruleDotSubGraph ) ) | ( (lv_nodes_27_0= ruleDotNode ) ) | ( (lv_edges_28_0= ruleDotEdge ) ) )* otherlv_29= '}' ) )
            // InternalDotLanguage.g:80:1: ( () ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotGraphID ) )? otherlv_4= '{' ( (otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )? ) | (otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )? ) | (otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )? ) | ( (lv_subgraphs_26_0= ruleDotSubGraph ) ) | ( (lv_nodes_27_0= ruleDotNode ) ) | ( (lv_edges_28_0= ruleDotEdge ) ) )* otherlv_29= '}' )
            {
            // InternalDotLanguage.g:80:1: ( () ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotGraphID ) )? otherlv_4= '{' ( (otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )? ) | (otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )? ) | (otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )? ) | ( (lv_subgraphs_26_0= ruleDotSubGraph ) ) | ( (lv_nodes_27_0= ruleDotNode ) ) | ( (lv_edges_28_0= ruleDotEdge ) ) )* otherlv_29= '}' )
            // InternalDotLanguage.g:80:2: () ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotGraphID ) )? otherlv_4= '{' ( (otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )? ) | (otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )? ) | (otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )? ) | ( (lv_subgraphs_26_0= ruleDotSubGraph ) ) | ( (lv_nodes_27_0= ruleDotNode ) ) | ( (lv_edges_28_0= ruleDotEdge ) ) )* otherlv_29= '}'
            {
            // InternalDotLanguage.g:80:2: ()
            // InternalDotLanguage.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDotGraphAccess().getDotGraphAction_0(),
                        current);
                

            }

            // InternalDotLanguage.g:86:2: ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' )
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
                    // InternalDotLanguage.g:86:3: ( (lv_directedGraph_1_0= 'digraph' ) )
                    {
                    // InternalDotLanguage.g:86:3: ( (lv_directedGraph_1_0= 'digraph' ) )
                    // InternalDotLanguage.g:87:1: (lv_directedGraph_1_0= 'digraph' )
                    {
                    // InternalDotLanguage.g:87:1: (lv_directedGraph_1_0= 'digraph' )
                    // InternalDotLanguage.g:88:3: lv_directedGraph_1_0= 'digraph'
                    {
                    lv_directedGraph_1_0=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                            newLeafNode(lv_directedGraph_1_0, grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDotGraphRule());
                    	        }
                           		setWithLastConsumed(current, "directedGraph", true, "digraph");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:102:7: otherlv_2= 'graph'
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getDotGraphAccess().getGraphKeyword_1_1());
                        

                    }
                    break;

            }

            // InternalDotLanguage.g:106:2: ( (lv_id_3_0= ruleDotGraphID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_DOTSTRINGTERM && LA2_0<=RULE_INT)||LA2_0==28) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDotLanguage.g:107:1: (lv_id_3_0= ruleDotGraphID )
                    {
                    // InternalDotLanguage.g:107:1: (lv_id_3_0= ruleDotGraphID )
                    // InternalDotLanguage.g:108:3: lv_id_3_0= ruleDotGraphID
                    {
                     
                    	        newCompositeNode(grammarAccess.getDotGraphAccess().getIdDotGraphIDParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_id_3_0=ruleDotGraphID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"org.muml.graphviz.dot.xtext.DotLanguage.DotGraphID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_4, grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDotLanguage.g:128:1: ( (otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )? ) | (otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )? ) | (otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )? ) | ( (lv_subgraphs_26_0= ruleDotSubGraph ) ) | ( (lv_nodes_27_0= ruleDotNode ) ) | ( (lv_edges_28_0= ruleDotEdge ) ) )*
            loop9:
            do {
                int alt9=7;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalDotLanguage.g:128:2: (otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )? )
            	    {
            	    // InternalDotLanguage.g:128:2: (otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )? )
            	    // InternalDotLanguage.g:128:4: otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )?
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_6); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDotGraphAccess().getGraphKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_4_0_1());
            	        
            	    // InternalDotLanguage.g:136:1: ( (lv_graphSettings_7_0= ruleSetting ) )
            	    // InternalDotLanguage.g:137:1: (lv_graphSettings_7_0= ruleSetting )
            	    {
            	    // InternalDotLanguage.g:137:1: (lv_graphSettings_7_0= ruleSetting )
            	    // InternalDotLanguage.g:138:3: lv_graphSettings_7_0= ruleSetting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_graphSettings_7_0=ruleSetting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"graphSettings",
            	            		lv_graphSettings_7_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalDotLanguage.g:154:2: (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==18) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalDotLanguage.g:154:4: otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            	    	        	newLeafNode(otherlv_8, grammarAccess.getDotGraphAccess().getCommaKeyword_4_0_3_0());
            	    	        
            	    	    // InternalDotLanguage.g:158:1: ( (lv_graphSettings_9_0= ruleSetting ) )
            	    	    // InternalDotLanguage.g:159:1: (lv_graphSettings_9_0= ruleSetting )
            	    	    {
            	    	    // InternalDotLanguage.g:159:1: (lv_graphSettings_9_0= ruleSetting )
            	    	    // InternalDotLanguage.g:160:3: lv_graphSettings_9_0= ruleSetting
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_8);
            	    	    lv_graphSettings_9_0=ruleSetting();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"graphSettings",
            	    	            		lv_graphSettings_9_0, 
            	    	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_4_0_4());
            	        
            	    // InternalDotLanguage.g:180:1: (otherlv_11= ';' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==20) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalDotLanguage.g:180:3: otherlv_11= ';'
            	            {
            	            otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            	                	newLeafNode(otherlv_11, grammarAccess.getDotGraphAccess().getSemicolonKeyword_4_0_5());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDotLanguage.g:185:6: (otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )? )
            	    {
            	    // InternalDotLanguage.g:185:6: (otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )? )
            	    // InternalDotLanguage.g:185:8: otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )?
            	    {
            	    otherlv_12=(Token)match(input,21,FollowSets000.FOLLOW_6); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDotGraphAccess().getNodeKeyword_4_1_0());
            	        
            	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_4_1_1());
            	        
            	    // InternalDotLanguage.g:193:1: ( (lv_nodeSettings_14_0= ruleSetting ) )
            	    // InternalDotLanguage.g:194:1: (lv_nodeSettings_14_0= ruleSetting )
            	    {
            	    // InternalDotLanguage.g:194:1: (lv_nodeSettings_14_0= ruleSetting )
            	    // InternalDotLanguage.g:195:3: lv_nodeSettings_14_0= ruleSetting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_nodeSettings_14_0=ruleSetting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodeSettings",
            	            		lv_nodeSettings_14_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalDotLanguage.g:211:2: (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==18) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalDotLanguage.g:211:4: otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            	    	        	newLeafNode(otherlv_15, grammarAccess.getDotGraphAccess().getCommaKeyword_4_1_3_0());
            	    	        
            	    	    // InternalDotLanguage.g:215:1: ( (lv_nodeSettings_16_0= ruleSetting ) )
            	    	    // InternalDotLanguage.g:216:1: (lv_nodeSettings_16_0= ruleSetting )
            	    	    {
            	    	    // InternalDotLanguage.g:216:1: (lv_nodeSettings_16_0= ruleSetting )
            	    	    // InternalDotLanguage.g:217:3: lv_nodeSettings_16_0= ruleSetting
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_8);
            	    	    lv_nodeSettings_16_0=ruleSetting();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"nodeSettings",
            	    	            		lv_nodeSettings_16_0, 
            	    	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            	        	newLeafNode(otherlv_17, grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_4_1_4());
            	        
            	    // InternalDotLanguage.g:237:1: (otherlv_18= ';' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==20) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalDotLanguage.g:237:3: otherlv_18= ';'
            	            {
            	            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            	                	newLeafNode(otherlv_18, grammarAccess.getDotGraphAccess().getSemicolonKeyword_4_1_5());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDotLanguage.g:242:6: (otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )? )
            	    {
            	    // InternalDotLanguage.g:242:6: (otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )? )
            	    // InternalDotLanguage.g:242:8: otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )?
            	    {
            	    otherlv_19=(Token)match(input,22,FollowSets000.FOLLOW_6); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDotGraphAccess().getEdgeKeyword_4_2_0());
            	        
            	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            	        	newLeafNode(otherlv_20, grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_4_2_1());
            	        
            	    // InternalDotLanguage.g:250:1: ( (lv_edgeSettings_21_0= ruleSetting ) )
            	    // InternalDotLanguage.g:251:1: (lv_edgeSettings_21_0= ruleSetting )
            	    {
            	    // InternalDotLanguage.g:251:1: (lv_edgeSettings_21_0= ruleSetting )
            	    // InternalDotLanguage.g:252:3: lv_edgeSettings_21_0= ruleSetting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_edgeSettings_21_0=ruleSetting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edgeSettings",
            	            		lv_edgeSettings_21_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalDotLanguage.g:268:2: (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==18) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalDotLanguage.g:268:4: otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) )
            	    	    {
            	    	    otherlv_22=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            	    	        	newLeafNode(otherlv_22, grammarAccess.getDotGraphAccess().getCommaKeyword_4_2_3_0());
            	    	        
            	    	    // InternalDotLanguage.g:272:1: ( (lv_edgeSettings_23_0= ruleSetting ) )
            	    	    // InternalDotLanguage.g:273:1: (lv_edgeSettings_23_0= ruleSetting )
            	    	    {
            	    	    // InternalDotLanguage.g:273:1: (lv_edgeSettings_23_0= ruleSetting )
            	    	    // InternalDotLanguage.g:274:3: lv_edgeSettings_23_0= ruleSetting
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_8);
            	    	    lv_edgeSettings_23_0=ruleSetting();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"edgeSettings",
            	    	            		lv_edgeSettings_23_0, 
            	    	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            	        	newLeafNode(otherlv_24, grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_4_2_4());
            	        
            	    // InternalDotLanguage.g:294:1: (otherlv_25= ';' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==20) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalDotLanguage.g:294:3: otherlv_25= ';'
            	            {
            	            otherlv_25=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            	                	newLeafNode(otherlv_25, grammarAccess.getDotGraphAccess().getSemicolonKeyword_4_2_5());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDotLanguage.g:299:6: ( (lv_subgraphs_26_0= ruleDotSubGraph ) )
            	    {
            	    // InternalDotLanguage.g:299:6: ( (lv_subgraphs_26_0= ruleDotSubGraph ) )
            	    // InternalDotLanguage.g:300:1: (lv_subgraphs_26_0= ruleDotSubGraph )
            	    {
            	    // InternalDotLanguage.g:300:1: (lv_subgraphs_26_0= ruleDotSubGraph )
            	    // InternalDotLanguage.g:301:3: lv_subgraphs_26_0= ruleDotSubGraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getSubgraphsDotSubGraphParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_subgraphs_26_0=ruleDotSubGraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subgraphs",
            	            		lv_subgraphs_26_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.DotSubGraph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDotLanguage.g:318:6: ( (lv_nodes_27_0= ruleDotNode ) )
            	    {
            	    // InternalDotLanguage.g:318:6: ( (lv_nodes_27_0= ruleDotNode ) )
            	    // InternalDotLanguage.g:319:1: (lv_nodes_27_0= ruleDotNode )
            	    {
            	    // InternalDotLanguage.g:319:1: (lv_nodes_27_0= ruleDotNode )
            	    // InternalDotLanguage.g:320:3: lv_nodes_27_0= ruleDotNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getNodesDotNodeParserRuleCall_4_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_nodes_27_0=ruleDotNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_27_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.DotNode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDotLanguage.g:337:6: ( (lv_edges_28_0= ruleDotEdge ) )
            	    {
            	    // InternalDotLanguage.g:337:6: ( (lv_edges_28_0= ruleDotEdge ) )
            	    // InternalDotLanguage.g:338:1: (lv_edges_28_0= ruleDotEdge )
            	    {
            	    // InternalDotLanguage.g:338:1: (lv_edges_28_0= ruleDotEdge )
            	    // InternalDotLanguage.g:339:3: lv_edges_28_0= ruleDotEdge
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getEdgesDotEdgeParserRuleCall_4_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_edges_28_0=ruleDotEdge();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edges",
            	            		lv_edges_28_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.DotEdge");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_29=(Token)match(input,23,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_29, grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotGraph"


    // $ANTLR start "entryRuleDotSubGraph"
    // InternalDotLanguage.g:367:1: entryRuleDotSubGraph returns [EObject current=null] : iv_ruleDotSubGraph= ruleDotSubGraph EOF ;
    public final EObject entryRuleDotSubGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotSubGraph = null;


        try {
            // InternalDotLanguage.g:368:2: (iv_ruleDotSubGraph= ruleDotSubGraph EOF )
            // InternalDotLanguage.g:369:2: iv_ruleDotSubGraph= ruleDotSubGraph EOF
            {
             newCompositeNode(grammarAccess.getDotSubGraphRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDotSubGraph=ruleDotSubGraph();

            state._fsp--;

             current =iv_ruleDotSubGraph; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotSubGraph"


    // $ANTLR start "ruleDotSubGraph"
    // InternalDotLanguage.g:376:1: ruleDotSubGraph returns [EObject current=null] : ( () otherlv_1= 'subgraph' ( (lv_id_2_0= ruleDotGraphID ) )? otherlv_3= '{' ( (otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )? ) | (otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )? ) | (otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )? ) | ( (lv_subgraphs_25_0= ruleDotSubGraph ) ) | ( (lv_nodes_26_0= ruleDotNode ) ) | ( (lv_edges_27_0= ruleDotEdge ) ) )+ otherlv_28= '}' ) ;
    public final EObject ruleDotSubGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        EObject lv_graphSettings_6_0 = null;

        EObject lv_graphSettings_8_0 = null;

        EObject lv_nodeSettings_13_0 = null;

        EObject lv_nodeSettings_15_0 = null;

        EObject lv_edgeSettings_20_0 = null;

        EObject lv_edgeSettings_22_0 = null;

        EObject lv_subgraphs_25_0 = null;

        EObject lv_nodes_26_0 = null;

        EObject lv_edges_27_0 = null;


         enterRule(); 
            
        try {
            // InternalDotLanguage.g:379:28: ( ( () otherlv_1= 'subgraph' ( (lv_id_2_0= ruleDotGraphID ) )? otherlv_3= '{' ( (otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )? ) | (otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )? ) | (otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )? ) | ( (lv_subgraphs_25_0= ruleDotSubGraph ) ) | ( (lv_nodes_26_0= ruleDotNode ) ) | ( (lv_edges_27_0= ruleDotEdge ) ) )+ otherlv_28= '}' ) )
            // InternalDotLanguage.g:380:1: ( () otherlv_1= 'subgraph' ( (lv_id_2_0= ruleDotGraphID ) )? otherlv_3= '{' ( (otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )? ) | (otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )? ) | (otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )? ) | ( (lv_subgraphs_25_0= ruleDotSubGraph ) ) | ( (lv_nodes_26_0= ruleDotNode ) ) | ( (lv_edges_27_0= ruleDotEdge ) ) )+ otherlv_28= '}' )
            {
            // InternalDotLanguage.g:380:1: ( () otherlv_1= 'subgraph' ( (lv_id_2_0= ruleDotGraphID ) )? otherlv_3= '{' ( (otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )? ) | (otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )? ) | (otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )? ) | ( (lv_subgraphs_25_0= ruleDotSubGraph ) ) | ( (lv_nodes_26_0= ruleDotNode ) ) | ( (lv_edges_27_0= ruleDotEdge ) ) )+ otherlv_28= '}' )
            // InternalDotLanguage.g:380:2: () otherlv_1= 'subgraph' ( (lv_id_2_0= ruleDotGraphID ) )? otherlv_3= '{' ( (otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )? ) | (otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )? ) | (otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )? ) | ( (lv_subgraphs_25_0= ruleDotSubGraph ) ) | ( (lv_nodes_26_0= ruleDotNode ) ) | ( (lv_edges_27_0= ruleDotEdge ) ) )+ otherlv_28= '}'
            {
            // InternalDotLanguage.g:380:2: ()
            // InternalDotLanguage.g:381:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDotSubGraphAccess().getDotGraphAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getDotSubGraphAccess().getSubgraphKeyword_1());
                
            // InternalDotLanguage.g:390:1: ( (lv_id_2_0= ruleDotGraphID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_DOTSTRINGTERM && LA10_0<=RULE_INT)||LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDotLanguage.g:391:1: (lv_id_2_0= ruleDotGraphID )
                    {
                    // InternalDotLanguage.g:391:1: (lv_id_2_0= ruleDotGraphID )
                    // InternalDotLanguage.g:392:3: lv_id_2_0= ruleDotGraphID
                    {
                     
                    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getIdDotGraphIDParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_id_2_0=ruleDotGraphID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_2_0, 
                            		"org.muml.graphviz.dot.xtext.DotLanguage.DotGraphID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getDotSubGraphAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalDotLanguage.g:412:1: ( (otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )? ) | (otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )? ) | (otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )? ) | ( (lv_subgraphs_25_0= ruleDotSubGraph ) ) | ( (lv_nodes_26_0= ruleDotNode ) ) | ( (lv_edges_27_0= ruleDotEdge ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=7;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalDotLanguage.g:412:2: (otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )? )
            	    {
            	    // InternalDotLanguage.g:412:2: (otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )? )
            	    // InternalDotLanguage.g:412:4: otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )?
            	    {
            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_6); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDotSubGraphAccess().getGraphKeyword_4_0_0());
            	        
            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDotSubGraphAccess().getLeftSquareBracketKeyword_4_0_1());
            	        
            	    // InternalDotLanguage.g:420:1: ( (lv_graphSettings_6_0= ruleSetting ) )
            	    // InternalDotLanguage.g:421:1: (lv_graphSettings_6_0= ruleSetting )
            	    {
            	    // InternalDotLanguage.g:421:1: (lv_graphSettings_6_0= ruleSetting )
            	    // InternalDotLanguage.g:422:3: lv_graphSettings_6_0= ruleSetting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_graphSettings_6_0=ruleSetting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"graphSettings",
            	            		lv_graphSettings_6_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalDotLanguage.g:438:2: (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==18) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalDotLanguage.g:438:4: otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getDotSubGraphAccess().getCommaKeyword_4_0_3_0());
            	    	        
            	    	    // InternalDotLanguage.g:442:1: ( (lv_graphSettings_8_0= ruleSetting ) )
            	    	    // InternalDotLanguage.g:443:1: (lv_graphSettings_8_0= ruleSetting )
            	    	    {
            	    	    // InternalDotLanguage.g:443:1: (lv_graphSettings_8_0= ruleSetting )
            	    	    // InternalDotLanguage.g:444:3: lv_graphSettings_8_0= ruleSetting
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_8);
            	    	    lv_graphSettings_8_0=ruleSetting();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"graphSettings",
            	    	            		lv_graphSettings_8_0, 
            	    	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDotSubGraphAccess().getRightSquareBracketKeyword_4_0_4());
            	        
            	    // InternalDotLanguage.g:464:1: (otherlv_10= ';' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==20) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalDotLanguage.g:464:3: otherlv_10= ';'
            	            {
            	            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            	                	newLeafNode(otherlv_10, grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_0_5());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDotLanguage.g:469:6: (otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )? )
            	    {
            	    // InternalDotLanguage.g:469:6: (otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )? )
            	    // InternalDotLanguage.g:469:8: otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )?
            	    {
            	    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_6); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDotSubGraphAccess().getNodeKeyword_4_1_0());
            	        
            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDotSubGraphAccess().getLeftSquareBracketKeyword_4_1_1());
            	        
            	    // InternalDotLanguage.g:477:1: ( (lv_nodeSettings_13_0= ruleSetting ) )
            	    // InternalDotLanguage.g:478:1: (lv_nodeSettings_13_0= ruleSetting )
            	    {
            	    // InternalDotLanguage.g:478:1: (lv_nodeSettings_13_0= ruleSetting )
            	    // InternalDotLanguage.g:479:3: lv_nodeSettings_13_0= ruleSetting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_nodeSettings_13_0=ruleSetting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodeSettings",
            	            		lv_nodeSettings_13_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalDotLanguage.g:495:2: (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==18) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalDotLanguage.g:495:4: otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            	    	        	newLeafNode(otherlv_14, grammarAccess.getDotSubGraphAccess().getCommaKeyword_4_1_3_0());
            	    	        
            	    	    // InternalDotLanguage.g:499:1: ( (lv_nodeSettings_15_0= ruleSetting ) )
            	    	    // InternalDotLanguage.g:500:1: (lv_nodeSettings_15_0= ruleSetting )
            	    	    {
            	    	    // InternalDotLanguage.g:500:1: (lv_nodeSettings_15_0= ruleSetting )
            	    	    // InternalDotLanguage.g:501:3: lv_nodeSettings_15_0= ruleSetting
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_8);
            	    	    lv_nodeSettings_15_0=ruleSetting();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"nodeSettings",
            	    	            		lv_nodeSettings_15_0, 
            	    	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            	        	newLeafNode(otherlv_16, grammarAccess.getDotSubGraphAccess().getRightSquareBracketKeyword_4_1_4());
            	        
            	    // InternalDotLanguage.g:521:1: (otherlv_17= ';' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==20) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalDotLanguage.g:521:3: otherlv_17= ';'
            	            {
            	            otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            	                	newLeafNode(otherlv_17, grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_1_5());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDotLanguage.g:526:6: (otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )? )
            	    {
            	    // InternalDotLanguage.g:526:6: (otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )? )
            	    // InternalDotLanguage.g:526:8: otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )?
            	    {
            	    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_6); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDotSubGraphAccess().getEdgeKeyword_4_2_0());
            	        
            	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDotSubGraphAccess().getLeftSquareBracketKeyword_4_2_1());
            	        
            	    // InternalDotLanguage.g:534:1: ( (lv_edgeSettings_20_0= ruleSetting ) )
            	    // InternalDotLanguage.g:535:1: (lv_edgeSettings_20_0= ruleSetting )
            	    {
            	    // InternalDotLanguage.g:535:1: (lv_edgeSettings_20_0= ruleSetting )
            	    // InternalDotLanguage.g:536:3: lv_edgeSettings_20_0= ruleSetting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_edgeSettings_20_0=ruleSetting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edgeSettings",
            	            		lv_edgeSettings_20_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalDotLanguage.g:552:2: (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==18) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalDotLanguage.g:552:4: otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            	    	        	newLeafNode(otherlv_21, grammarAccess.getDotSubGraphAccess().getCommaKeyword_4_2_3_0());
            	    	        
            	    	    // InternalDotLanguage.g:556:1: ( (lv_edgeSettings_22_0= ruleSetting ) )
            	    	    // InternalDotLanguage.g:557:1: (lv_edgeSettings_22_0= ruleSetting )
            	    	    {
            	    	    // InternalDotLanguage.g:557:1: (lv_edgeSettings_22_0= ruleSetting )
            	    	    // InternalDotLanguage.g:558:3: lv_edgeSettings_22_0= ruleSetting
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_8);
            	    	    lv_edgeSettings_22_0=ruleSetting();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"edgeSettings",
            	    	            		lv_edgeSettings_22_0, 
            	    	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,19,FollowSets000.FOLLOW_9); 

            	        	newLeafNode(otherlv_23, grammarAccess.getDotSubGraphAccess().getRightSquareBracketKeyword_4_2_4());
            	        
            	    // InternalDotLanguage.g:578:1: (otherlv_24= ';' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==20) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalDotLanguage.g:578:3: otherlv_24= ';'
            	            {
            	            otherlv_24=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            	                	newLeafNode(otherlv_24, grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_2_5());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDotLanguage.g:583:6: ( (lv_subgraphs_25_0= ruleDotSubGraph ) )
            	    {
            	    // InternalDotLanguage.g:583:6: ( (lv_subgraphs_25_0= ruleDotSubGraph ) )
            	    // InternalDotLanguage.g:584:1: (lv_subgraphs_25_0= ruleDotSubGraph )
            	    {
            	    // InternalDotLanguage.g:584:1: (lv_subgraphs_25_0= ruleDotSubGraph )
            	    // InternalDotLanguage.g:585:3: lv_subgraphs_25_0= ruleDotSubGraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getSubgraphsDotSubGraphParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_subgraphs_25_0=ruleDotSubGraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subgraphs",
            	            		lv_subgraphs_25_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.DotSubGraph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDotLanguage.g:602:6: ( (lv_nodes_26_0= ruleDotNode ) )
            	    {
            	    // InternalDotLanguage.g:602:6: ( (lv_nodes_26_0= ruleDotNode ) )
            	    // InternalDotLanguage.g:603:1: (lv_nodes_26_0= ruleDotNode )
            	    {
            	    // InternalDotLanguage.g:603:1: (lv_nodes_26_0= ruleDotNode )
            	    // InternalDotLanguage.g:604:3: lv_nodes_26_0= ruleDotNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getNodesDotNodeParserRuleCall_4_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_nodes_26_0=ruleDotNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_26_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.DotNode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDotLanguage.g:621:6: ( (lv_edges_27_0= ruleDotEdge ) )
            	    {
            	    // InternalDotLanguage.g:621:6: ( (lv_edges_27_0= ruleDotEdge ) )
            	    // InternalDotLanguage.g:622:1: (lv_edges_27_0= ruleDotEdge )
            	    {
            	    // InternalDotLanguage.g:622:1: (lv_edges_27_0= ruleDotEdge )
            	    // InternalDotLanguage.g:623:3: lv_edges_27_0= ruleDotEdge
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotSubGraphAccess().getEdgesDotEdgeParserRuleCall_4_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_edges_27_0=ruleDotEdge();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotSubGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edges",
            	            		lv_edges_27_0, 
            	            		"org.muml.graphviz.dot.xtext.DotLanguage.DotEdge");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_28=(Token)match(input,23,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_28, grammarAccess.getDotSubGraphAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotSubGraph"


    // $ANTLR start "entryRuleDotNode"
    // InternalDotLanguage.g:651:1: entryRuleDotNode returns [EObject current=null] : iv_ruleDotNode= ruleDotNode EOF ;
    public final EObject entryRuleDotNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotNode = null;


        try {
            // InternalDotLanguage.g:652:2: (iv_ruleDotNode= ruleDotNode EOF )
            // InternalDotLanguage.g:653:2: iv_ruleDotNode= ruleDotNode EOF
            {
             newCompositeNode(grammarAccess.getDotNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDotNode=ruleDotNode();

            state._fsp--;

             current =iv_ruleDotNode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotNode"


    // $ANTLR start "ruleDotNode"
    // InternalDotLanguage.g:660:1: ruleDotNode returns [EObject current=null] : ( ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )? ) ;
    public final EObject ruleDotNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_settings_2_0 = null;

        EObject lv_settings_4_0 = null;


         enterRule(); 
            
        try {
            // InternalDotLanguage.g:663:28: ( ( ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )? ) )
            // InternalDotLanguage.g:664:1: ( ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )? )
            {
            // InternalDotLanguage.g:664:1: ( ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )? )
            // InternalDotLanguage.g:664:2: ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )?
            {
            // InternalDotLanguage.g:664:2: ( (lv_name_0_0= ruleDotID ) )
            // InternalDotLanguage.g:665:1: (lv_name_0_0= ruleDotID )
            {
            // InternalDotLanguage.g:665:1: (lv_name_0_0= ruleDotID )
            // InternalDotLanguage.g:666:3: lv_name_0_0= ruleDotID
            {
             
            	        newCompositeNode(grammarAccess.getDotNodeAccess().getNameDotIDParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_11);
            lv_name_0_0=ruleDotID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDotNodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.muml.graphviz.dot.xtext.DotLanguage.DotID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDotLanguage.g:682:2: (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDotLanguage.g:682:4: otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_1, grammarAccess.getDotNodeAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // InternalDotLanguage.g:686:1: ( (lv_settings_2_0= ruleSetting ) )
                    // InternalDotLanguage.g:687:1: (lv_settings_2_0= ruleSetting )
                    {
                    // InternalDotLanguage.g:687:1: (lv_settings_2_0= ruleSetting )
                    // InternalDotLanguage.g:688:3: lv_settings_2_0= ruleSetting
                    {
                     
                    	        newCompositeNode(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_settings_2_0=ruleSetting();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDotNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"settings",
                            		lv_settings_2_0, 
                            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDotLanguage.g:704:2: (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==18) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDotLanguage.g:704:4: otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getDotNodeAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // InternalDotLanguage.g:708:1: ( (lv_settings_4_0= ruleSetting ) )
                    	    // InternalDotLanguage.g:709:1: (lv_settings_4_0= ruleSetting )
                    	    {
                    	    // InternalDotLanguage.g:709:1: (lv_settings_4_0= ruleSetting )
                    	    // InternalDotLanguage.g:710:3: lv_settings_4_0= ruleSetting
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_settings_4_0=ruleSetting();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDotNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"settings",
                    	            		lv_settings_4_0, 
                    	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_12); 

                        	newLeafNode(otherlv_5, grammarAccess.getDotNodeAccess().getRightSquareBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // InternalDotLanguage.g:730:3: (otherlv_6= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDotLanguage.g:730:5: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getDotNodeAccess().getSemicolonKeyword_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotNode"


    // $ANTLR start "entryRuleDotEdge"
    // InternalDotLanguage.g:742:1: entryRuleDotEdge returns [EObject current=null] : iv_ruleDotEdge= ruleDotEdge EOF ;
    public final EObject entryRuleDotEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotEdge = null;


        try {
            // InternalDotLanguage.g:743:2: (iv_ruleDotEdge= ruleDotEdge EOF )
            // InternalDotLanguage.g:744:2: iv_ruleDotEdge= ruleDotEdge EOF
            {
             newCompositeNode(grammarAccess.getDotEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDotEdge=ruleDotEdge();

            state._fsp--;

             current =iv_ruleDotEdge; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotEdge"


    // $ANTLR start "ruleDotEdge"
    // InternalDotLanguage.g:751:1: ruleDotEdge returns [EObject current=null] : (this_DirectedDotEdge_0= ruleDirectedDotEdge | this_UndirectedDotEdge_1= ruleUndirectedDotEdge ) ;
    public final EObject ruleDotEdge() throws RecognitionException {
        EObject current = null;

        EObject this_DirectedDotEdge_0 = null;

        EObject this_UndirectedDotEdge_1 = null;


         enterRule(); 
            
        try {
            // InternalDotLanguage.g:754:28: ( (this_DirectedDotEdge_0= ruleDirectedDotEdge | this_UndirectedDotEdge_1= ruleUndirectedDotEdge ) )
            // InternalDotLanguage.g:755:1: (this_DirectedDotEdge_0= ruleDirectedDotEdge | this_UndirectedDotEdge_1= ruleUndirectedDotEdge )
            {
            // InternalDotLanguage.g:755:1: (this_DirectedDotEdge_0= ruleDirectedDotEdge | this_UndirectedDotEdge_1= ruleUndirectedDotEdge )
            int alt21=2;
            switch ( input.LA(1) ) {
            case RULE_DOTSTRINGTERM:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==25) ) {
                    alt21=1;
                }
                else if ( (LA21_1==26) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUMPREFIXEDID:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==26) ) {
                    alt21=2;
                }
                else if ( (LA21_2==25) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==RULE_DOUBLE) ) {
                    int LA21_4 = input.LA(3);

                    if ( (LA21_4==25) ) {
                        alt21=1;
                    }
                    else if ( (LA21_4==26) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA21_3==RULE_INT) ) {
                    int LA21_5 = input.LA(3);

                    if ( (LA21_5==26) ) {
                        alt21=2;
                    }
                    else if ( (LA21_5==25) ) {
                        alt21=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DOUBLE:
                {
                int LA21_4 = input.LA(2);

                if ( (LA21_4==25) ) {
                    alt21=1;
                }
                else if ( (LA21_4==26) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA21_5 = input.LA(2);

                if ( (LA21_5==26) ) {
                    alt21=2;
                }
                else if ( (LA21_5==25) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA21_6 = input.LA(2);

                if ( (LA21_6==26) ) {
                    alt21=2;
                }
                else if ( (LA21_6==25) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalDotLanguage.g:756:5: this_DirectedDotEdge_0= ruleDirectedDotEdge
                    {
                     
                            newCompositeNode(grammarAccess.getDotEdgeAccess().getDirectedDotEdgeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DirectedDotEdge_0=ruleDirectedDotEdge();

                    state._fsp--;

                     
                            current = this_DirectedDotEdge_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:766:5: this_UndirectedDotEdge_1= ruleUndirectedDotEdge
                    {
                     
                            newCompositeNode(grammarAccess.getDotEdgeAccess().getUndirectedDotEdgeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UndirectedDotEdge_1=ruleUndirectedDotEdge();

                    state._fsp--;

                     
                            current = this_UndirectedDotEdge_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotEdge"


    // $ANTLR start "entryRuleDirectedDotEdge"
    // InternalDotLanguage.g:782:1: entryRuleDirectedDotEdge returns [EObject current=null] : iv_ruleDirectedDotEdge= ruleDirectedDotEdge EOF ;
    public final EObject entryRuleDirectedDotEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedDotEdge = null;


        try {
            // InternalDotLanguage.g:783:2: (iv_ruleDirectedDotEdge= ruleDirectedDotEdge EOF )
            // InternalDotLanguage.g:784:2: iv_ruleDirectedDotEdge= ruleDirectedDotEdge EOF
            {
             newCompositeNode(grammarAccess.getDirectedDotEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDirectedDotEdge=ruleDirectedDotEdge();

            state._fsp--;

             current =iv_ruleDirectedDotEdge; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectedDotEdge"


    // $ANTLR start "ruleDirectedDotEdge"
    // InternalDotLanguage.g:791:1: ruleDirectedDotEdge returns [EObject current=null] : ( ( ( ruleDotID ) ) otherlv_1= '->' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )? ) ;
    public final EObject ruleDirectedDotEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_settings_4_0 = null;

        EObject lv_settings_6_0 = null;


         enterRule(); 
            
        try {
            // InternalDotLanguage.g:794:28: ( ( ( ( ruleDotID ) ) otherlv_1= '->' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )? ) )
            // InternalDotLanguage.g:795:1: ( ( ( ruleDotID ) ) otherlv_1= '->' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )? )
            {
            // InternalDotLanguage.g:795:1: ( ( ( ruleDotID ) ) otherlv_1= '->' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )? )
            // InternalDotLanguage.g:795:2: ( ( ruleDotID ) ) otherlv_1= '->' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )?
            {
            // InternalDotLanguage.g:795:2: ( ( ruleDotID ) )
            // InternalDotLanguage.g:796:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:796:1: ( ruleDotID )
            // InternalDotLanguage.g:797:3: ruleDotID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDirectedDotEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_13);
            ruleDotID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectedDotEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // InternalDotLanguage.g:814:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:815:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:815:1: ( ruleDotID )
            // InternalDotLanguage.g:816:3: ruleDotID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDirectedDotEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_11);
            ruleDotID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDotLanguage.g:829:2: (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDotLanguage.g:829:4: otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_3, grammarAccess.getDirectedDotEdgeAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // InternalDotLanguage.g:833:1: ( (lv_settings_4_0= ruleSetting ) )
                    // InternalDotLanguage.g:834:1: (lv_settings_4_0= ruleSetting )
                    {
                    // InternalDotLanguage.g:834:1: (lv_settings_4_0= ruleSetting )
                    // InternalDotLanguage.g:835:3: lv_settings_4_0= ruleSetting
                    {
                     
                    	        newCompositeNode(grammarAccess.getDirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_settings_4_0=ruleSetting();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDirectedDotEdgeRule());
                    	        }
                           		add(
                           			current, 
                           			"settings",
                            		lv_settings_4_0, 
                            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDotLanguage.g:851:2: (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==18) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDotLanguage.g:851:4: otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getDirectedDotEdgeAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // InternalDotLanguage.g:855:1: ( (lv_settings_6_0= ruleSetting ) )
                    	    // InternalDotLanguage.g:856:1: (lv_settings_6_0= ruleSetting )
                    	    {
                    	    // InternalDotLanguage.g:856:1: (lv_settings_6_0= ruleSetting )
                    	    // InternalDotLanguage.g:857:3: lv_settings_6_0= ruleSetting
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_settings_6_0=ruleSetting();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDirectedDotEdgeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"settings",
                    	            		lv_settings_6_0, 
                    	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_12); 

                        	newLeafNode(otherlv_7, grammarAccess.getDirectedDotEdgeAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // InternalDotLanguage.g:877:3: (otherlv_8= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDotLanguage.g:877:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_8, grammarAccess.getDirectedDotEdgeAccess().getSemicolonKeyword_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectedDotEdge"


    // $ANTLR start "entryRuleUndirectedDotEdge"
    // InternalDotLanguage.g:889:1: entryRuleUndirectedDotEdge returns [EObject current=null] : iv_ruleUndirectedDotEdge= ruleUndirectedDotEdge EOF ;
    public final EObject entryRuleUndirectedDotEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndirectedDotEdge = null;


        try {
            // InternalDotLanguage.g:890:2: (iv_ruleUndirectedDotEdge= ruleUndirectedDotEdge EOF )
            // InternalDotLanguage.g:891:2: iv_ruleUndirectedDotEdge= ruleUndirectedDotEdge EOF
            {
             newCompositeNode(grammarAccess.getUndirectedDotEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUndirectedDotEdge=ruleUndirectedDotEdge();

            state._fsp--;

             current =iv_ruleUndirectedDotEdge; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUndirectedDotEdge"


    // $ANTLR start "ruleUndirectedDotEdge"
    // InternalDotLanguage.g:898:1: ruleUndirectedDotEdge returns [EObject current=null] : ( ( ( ruleDotID ) ) otherlv_1= '--' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )? ) ;
    public final EObject ruleUndirectedDotEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_settings_4_0 = null;

        EObject lv_settings_6_0 = null;


         enterRule(); 
            
        try {
            // InternalDotLanguage.g:901:28: ( ( ( ( ruleDotID ) ) otherlv_1= '--' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )? ) )
            // InternalDotLanguage.g:902:1: ( ( ( ruleDotID ) ) otherlv_1= '--' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )? )
            {
            // InternalDotLanguage.g:902:1: ( ( ( ruleDotID ) ) otherlv_1= '--' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )? )
            // InternalDotLanguage.g:902:2: ( ( ruleDotID ) ) otherlv_1= '--' ( ( ruleDotID ) ) (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )? (otherlv_8= ';' )?
            {
            // InternalDotLanguage.g:902:2: ( ( ruleDotID ) )
            // InternalDotLanguage.g:903:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:903:1: ( ruleDotID )
            // InternalDotLanguage.g:904:3: ruleDotID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUndirectedDotEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getUndirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_14);
            ruleDotID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getUndirectedDotEdgeAccess().getHyphenMinusHyphenMinusKeyword_1());
                
            // InternalDotLanguage.g:921:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:922:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:922:1: ( ruleDotID )
            // InternalDotLanguage.g:923:3: ruleDotID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUndirectedDotEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getUndirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_11);
            ruleDotID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDotLanguage.g:936:2: (otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDotLanguage.g:936:4: otherlv_3= '[' ( (lv_settings_4_0= ruleSetting ) ) (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_3, grammarAccess.getUndirectedDotEdgeAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // InternalDotLanguage.g:940:1: ( (lv_settings_4_0= ruleSetting ) )
                    // InternalDotLanguage.g:941:1: (lv_settings_4_0= ruleSetting )
                    {
                    // InternalDotLanguage.g:941:1: (lv_settings_4_0= ruleSetting )
                    // InternalDotLanguage.g:942:3: lv_settings_4_0= ruleSetting
                    {
                     
                    	        newCompositeNode(grammarAccess.getUndirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_settings_4_0=ruleSetting();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUndirectedDotEdgeRule());
                    	        }
                           		add(
                           			current, 
                           			"settings",
                            		lv_settings_4_0, 
                            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDotLanguage.g:958:2: (otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalDotLanguage.g:958:4: otherlv_5= ',' ( (lv_settings_6_0= ruleSetting ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getUndirectedDotEdgeAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // InternalDotLanguage.g:962:1: ( (lv_settings_6_0= ruleSetting ) )
                    	    // InternalDotLanguage.g:963:1: (lv_settings_6_0= ruleSetting )
                    	    {
                    	    // InternalDotLanguage.g:963:1: (lv_settings_6_0= ruleSetting )
                    	    // InternalDotLanguage.g:964:3: lv_settings_6_0= ruleSetting
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUndirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_settings_6_0=ruleSetting();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUndirectedDotEdgeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"settings",
                    	            		lv_settings_6_0, 
                    	            		"org.muml.graphviz.dot.xtext.DotLanguage.Setting");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_12); 

                        	newLeafNode(otherlv_7, grammarAccess.getUndirectedDotEdgeAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // InternalDotLanguage.g:984:3: (otherlv_8= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDotLanguage.g:984:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_8, grammarAccess.getUndirectedDotEdgeAccess().getSemicolonKeyword_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUndirectedDotEdge"


    // $ANTLR start "entryRuleSetting"
    // InternalDotLanguage.g:996:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalDotLanguage.g:997:2: (iv_ruleSetting= ruleSetting EOF )
            // InternalDotLanguage.g:998:2: iv_ruleSetting= ruleSetting EOF
            {
             newCompositeNode(grammarAccess.getSettingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSetting=ruleSetting();

            state._fsp--;

             current =iv_ruleSetting; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalDotLanguage.g:1005:1: ruleSetting returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_attribute_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // InternalDotLanguage.g:1008:28: ( ( ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) ) ) )
            // InternalDotLanguage.g:1009:1: ( ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) ) )
            {
            // InternalDotLanguage.g:1009:1: ( ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) ) )
            // InternalDotLanguage.g:1009:2: ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) )
            {
            // InternalDotLanguage.g:1009:2: ( (lv_attribute_0_0= ruleDotID ) )
            // InternalDotLanguage.g:1010:1: (lv_attribute_0_0= ruleDotID )
            {
            // InternalDotLanguage.g:1010:1: (lv_attribute_0_0= ruleDotID )
            // InternalDotLanguage.g:1011:3: lv_attribute_0_0= ruleDotID
            {
             
            	        newCompositeNode(grammarAccess.getSettingAccess().getAttributeDotIDParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_15);
            lv_attribute_0_0=ruleDotID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSettingRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_0_0, 
                    		"org.muml.graphviz.dot.xtext.DotLanguage.DotID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getSettingAccess().getEqualsSignKeyword_1());
                
            // InternalDotLanguage.g:1031:1: ( (lv_value_2_0= ruleDotID ) )
            // InternalDotLanguage.g:1032:1: (lv_value_2_0= ruleDotID )
            {
            // InternalDotLanguage.g:1032:1: (lv_value_2_0= ruleDotID )
            // InternalDotLanguage.g:1033:3: lv_value_2_0= ruleDotID
            {
             
            	        newCompositeNode(grammarAccess.getSettingAccess().getValueDotIDParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDotID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSettingRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"org.muml.graphviz.dot.xtext.DotLanguage.DotID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleDotGraphID"
    // InternalDotLanguage.g:1057:1: entryRuleDotGraphID returns [String current=null] : iv_ruleDotGraphID= ruleDotGraphID EOF ;
    public final String entryRuleDotGraphID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotGraphID = null;


        try {
            // InternalDotLanguage.g:1058:2: (iv_ruleDotGraphID= ruleDotGraphID EOF )
            // InternalDotLanguage.g:1059:2: iv_ruleDotGraphID= ruleDotGraphID EOF
            {
             newCompositeNode(grammarAccess.getDotGraphIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDotGraphID=ruleDotGraphID();

            state._fsp--;

             current =iv_ruleDotGraphID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotGraphID"


    // $ANTLR start "ruleDotGraphID"
    // InternalDotLanguage.g:1066:1: ruleDotGraphID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DotID_0= ruleDotID ;
    public final AntlrDatatypeRuleToken ruleDotGraphID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DotID_0 = null;


         enterRule(); 
            
        try {
            // InternalDotLanguage.g:1069:28: (this_DotID_0= ruleDotID )
            // InternalDotLanguage.g:1071:5: this_DotID_0= ruleDotID
            {
             
                    newCompositeNode(grammarAccess.getDotGraphIDAccess().getDotIDParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_DotID_0=ruleDotID();

            state._fsp--;


            		current.merge(this_DotID_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotGraphID"


    // $ANTLR start "entryRuleDotID"
    // InternalDotLanguage.g:1089:1: entryRuleDotID returns [String current=null] : iv_ruleDotID= ruleDotID EOF ;
    public final String entryRuleDotID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotID = null;


        try {
            // InternalDotLanguage.g:1090:2: (iv_ruleDotID= ruleDotID EOF )
            // InternalDotLanguage.g:1091:2: iv_ruleDotID= ruleDotID EOF
            {
             newCompositeNode(grammarAccess.getDotIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDotID=ruleDotID();

            state._fsp--;

             current =iv_ruleDotID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDotID"


    // $ANTLR start "ruleDotID"
    // InternalDotLanguage.g:1098:1: ruleDotID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM | this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID | this_Number_2= ruleNumber | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDotID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOTSTRINGTERM_0=null;
        Token this_NUMPREFIXEDID_1=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_Number_2 = null;


         enterRule(); 
            
        try {
            // InternalDotLanguage.g:1101:28: ( (this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM | this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID | this_Number_2= ruleNumber | this_ID_3= RULE_ID ) )
            // InternalDotLanguage.g:1102:1: (this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM | this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID | this_Number_2= ruleNumber | this_ID_3= RULE_ID )
            {
            // InternalDotLanguage.g:1102:1: (this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM | this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID | this_Number_2= ruleNumber | this_ID_3= RULE_ID )
            int alt28=4;
            switch ( input.LA(1) ) {
            case RULE_DOTSTRINGTERM:
                {
                alt28=1;
                }
                break;
            case RULE_NUMPREFIXEDID:
                {
                alt28=2;
                }
                break;
            case RULE_DOUBLE:
            case RULE_INT:
            case 28:
                {
                alt28=3;
                }
                break;
            case RULE_ID:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDotLanguage.g:1102:6: this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM
                    {
                    this_DOTSTRINGTERM_0=(Token)match(input,RULE_DOTSTRINGTERM,FollowSets000.FOLLOW_2); 

                    		current.merge(this_DOTSTRINGTERM_0);
                        
                     
                        newLeafNode(this_DOTSTRINGTERM_0, grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:1110:10: this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID
                    {
                    this_NUMPREFIXEDID_1=(Token)match(input,RULE_NUMPREFIXEDID,FollowSets000.FOLLOW_2); 

                    		current.merge(this_NUMPREFIXEDID_1);
                        
                     
                        newLeafNode(this_NUMPREFIXEDID_1, grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:1119:5: this_Number_2= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getDotIDAccess().getNumberParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Number_2=ruleNumber();

                    state._fsp--;


                    		current.merge(this_Number_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalDotLanguage.g:1130:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getDotIDAccess().getIDTerminalRuleCall_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDotID"


    // $ANTLR start "entryRuleNumber"
    // InternalDotLanguage.g:1145:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalDotLanguage.g:1146:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalDotLanguage.g:1147:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalDotLanguage.g:1154:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DOUBLE_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // InternalDotLanguage.g:1157:28: ( ( (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) ) )
            // InternalDotLanguage.g:1158:1: ( (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) )
            {
            // InternalDotLanguage.g:1158:1: ( (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) )
            // InternalDotLanguage.g:1158:2: (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            {
            // InternalDotLanguage.g:1158:2: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDotLanguage.g:1159:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_16); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // InternalDotLanguage.g:1164:3: (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DOUBLE) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_INT) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDotLanguage.g:1164:8: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); 

                    		current.merge(this_DOUBLE_1);
                        
                     
                        newLeafNode(this_DOUBLE_1, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:1172:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\5\uffff\2\4\1\7\3\4\2\uffff";
    static final String dfa_3s = "\1\34\5\uffff\2\34\1\10\3\34\2\uffff";
    static final String dfa_4s = "\1\uffff\1\7\1\1\1\2\1\3\1\4\6\uffff\1\6\1\5";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\7\1\13\1\11\1\12\6\uffff\1\2\5\uffff\1\3\1\4\1\1\1\5\3\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "\5\15\6\uffff\1\15\1\uffff\1\15\2\uffff\5\15\2\14\1\uffff\1\15",
            "\5\15\6\uffff\1\15\1\uffff\1\15\2\uffff\5\15\2\14\1\uffff\1\15",
            "\1\11\1\12",
            "\5\15\6\uffff\1\15\1\uffff\1\15\2\uffff\5\15\2\14\1\uffff\1\15",
            "\5\15\6\uffff\1\15\1\uffff\1\15\2\uffff\5\15\2\14\1\uffff\1\15",
            "\5\15\6\uffff\1\15\1\uffff\1\15\2\uffff\5\15\2\14\1\uffff\1\15",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 128:1: ( (otherlv_5= 'graph' otherlv_6= '[' ( (lv_graphSettings_7_0= ruleSetting ) ) (otherlv_8= ',' ( (lv_graphSettings_9_0= ruleSetting ) ) )* otherlv_10= ']' (otherlv_11= ';' )? ) | (otherlv_12= 'node' otherlv_13= '[' ( (lv_nodeSettings_14_0= ruleSetting ) ) (otherlv_15= ',' ( (lv_nodeSettings_16_0= ruleSetting ) ) )* otherlv_17= ']' (otherlv_18= ';' )? ) | (otherlv_19= 'edge' otherlv_20= '[' ( (lv_edgeSettings_21_0= ruleSetting ) ) (otherlv_22= ',' ( (lv_edgeSettings_23_0= ruleSetting ) ) )* otherlv_24= ']' (otherlv_25= ';' )? ) | ( (lv_subgraphs_26_0= ruleDotSubGraph ) ) | ( (lv_nodes_27_0= ruleDotNode ) ) | ( (lv_edges_28_0= ruleDotEdge ) ) )*";
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 412:1: ( (otherlv_4= 'graph' otherlv_5= '[' ( (lv_graphSettings_6_0= ruleSetting ) ) (otherlv_7= ',' ( (lv_graphSettings_8_0= ruleSetting ) ) )* otherlv_9= ']' (otherlv_10= ';' )? ) | (otherlv_11= 'node' otherlv_12= '[' ( (lv_nodeSettings_13_0= ruleSetting ) ) (otherlv_14= ',' ( (lv_nodeSettings_15_0= ruleSetting ) ) )* otherlv_16= ']' (otherlv_17= ';' )? ) | (otherlv_18= 'edge' otherlv_19= '[' ( (lv_edgeSettings_20_0= ruleSetting ) ) (otherlv_21= ',' ( (lv_edgeSettings_22_0= ruleSetting ) ) )* otherlv_23= ']' (otherlv_24= ';' )? ) | ( (lv_subgraphs_25_0= ruleDotSubGraph ) ) | ( (lv_nodes_26_0= ruleDotNode ) ) | ( (lv_edges_27_0= ruleDotEdge ) ) )+";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000100101F0L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000011E081F0L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000100001F0L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000011F081F0L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000116081F0L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000120002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000180L});
    }


}