package de.uni_paderborn.fujaba.graphviz.dot.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uni_paderborn.fujaba.graphviz.dot.xtext.services.DotLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOTSTRINGTERM", "RULE_NUMPREFIXEDID", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'digraph'", "'graph'", "'subgraph'", "'{'", "'['", "','", "']'", "';'", "'node'", "'edge'", "'}'", "'--'", "'->'", "'='"
    };
    public static final int RULE_ID=7;
    public static final int RULE_NUMPREFIXEDID=5;
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
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_DOTSTRINGTERM=4;

    // delegates
    // delegators


        public InternalDotLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g"; }



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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:67:1: entryRuleDotGraph returns [EObject current=null] : iv_ruleDotGraph= ruleDotGraph EOF ;
    public final EObject entryRuleDotGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotGraph = null;


        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:68:2: (iv_ruleDotGraph= ruleDotGraph EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:69:2: iv_ruleDotGraph= ruleDotGraph EOF
            {
             newCompositeNode(grammarAccess.getDotGraphRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotGraph_in_entryRuleDotGraph75);
            iv_ruleDotGraph=ruleDotGraph();

            state._fsp--;

             current =iv_ruleDotGraph; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotGraph85); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:76:1: ruleDotGraph returns [EObject current=null] : ( () ( ( ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotID ) )? ) | (otherlv_4= 'subgraph' ( (lv_id_5_0= ruleDotID ) )? ) ) otherlv_6= '{' ( (otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )? ) | (otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )? ) | (otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )? ) | ( (lv_subgraphs_28_0= ruleDotGraph ) ) | ( (lv_nodes_29_0= ruleDotNode ) ) | ( (lv_edges_30_0= ruleDotEdge ) ) )* otherlv_31= '}' ) ;
    public final EObject ruleDotGraph() throws RecognitionException {
        EObject current = null;

        Token lv_directedGraph_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_graphSettings_9_0 = null;

        EObject lv_graphSettings_11_0 = null;

        EObject lv_nodeSettings_16_0 = null;

        EObject lv_nodeSettings_18_0 = null;

        EObject lv_edgeSettings_23_0 = null;

        EObject lv_edgeSettings_25_0 = null;

        EObject lv_subgraphs_28_0 = null;

        EObject lv_nodes_29_0 = null;

        EObject lv_edges_30_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:79:28: ( ( () ( ( ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotID ) )? ) | (otherlv_4= 'subgraph' ( (lv_id_5_0= ruleDotID ) )? ) ) otherlv_6= '{' ( (otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )? ) | (otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )? ) | (otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )? ) | ( (lv_subgraphs_28_0= ruleDotGraph ) ) | ( (lv_nodes_29_0= ruleDotNode ) ) | ( (lv_edges_30_0= ruleDotEdge ) ) )* otherlv_31= '}' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:80:1: ( () ( ( ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotID ) )? ) | (otherlv_4= 'subgraph' ( (lv_id_5_0= ruleDotID ) )? ) ) otherlv_6= '{' ( (otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )? ) | (otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )? ) | (otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )? ) | ( (lv_subgraphs_28_0= ruleDotGraph ) ) | ( (lv_nodes_29_0= ruleDotNode ) ) | ( (lv_edges_30_0= ruleDotEdge ) ) )* otherlv_31= '}' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:80:1: ( () ( ( ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotID ) )? ) | (otherlv_4= 'subgraph' ( (lv_id_5_0= ruleDotID ) )? ) ) otherlv_6= '{' ( (otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )? ) | (otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )? ) | (otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )? ) | ( (lv_subgraphs_28_0= ruleDotGraph ) ) | ( (lv_nodes_29_0= ruleDotNode ) ) | ( (lv_edges_30_0= ruleDotEdge ) ) )* otherlv_31= '}' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:80:2: () ( ( ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotID ) )? ) | (otherlv_4= 'subgraph' ( (lv_id_5_0= ruleDotID ) )? ) ) otherlv_6= '{' ( (otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )? ) | (otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )? ) | (otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )? ) | ( (lv_subgraphs_28_0= ruleDotGraph ) ) | ( (lv_nodes_29_0= ruleDotNode ) ) | ( (lv_edges_30_0= ruleDotEdge ) ) )* otherlv_31= '}'
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:80:2: ()
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDotGraphAccess().getDotGraphAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:86:2: ( ( ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotID ) )? ) | (otherlv_4= 'subgraph' ( (lv_id_5_0= ruleDotID ) )? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:86:3: ( ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotID ) )? )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:86:3: ( ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotID ) )? )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:86:4: ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' ) ( (lv_id_3_0= ruleDotID ) )?
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:86:4: ( ( (lv_directedGraph_1_0= 'digraph' ) ) | otherlv_2= 'graph' )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==13) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==14) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:86:5: ( (lv_directedGraph_1_0= 'digraph' ) )
                            {
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:86:5: ( (lv_directedGraph_1_0= 'digraph' ) )
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:87:1: (lv_directedGraph_1_0= 'digraph' )
                            {
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:87:1: (lv_directedGraph_1_0= 'digraph' )
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:88:3: lv_directedGraph_1_0= 'digraph'
                            {
                            lv_directedGraph_1_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDotGraph140); 

                                    newLeafNode(lv_directedGraph_1_0, grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDotGraphRule());
                            	        }
                                   		setWithLastConsumed(current, "directedGraph", true, "digraph");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:102:7: otherlv_2= 'graph'
                            {
                            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDotGraph171); 

                                	newLeafNode(otherlv_2, grammarAccess.getDotGraphAccess().getGraphKeyword_1_0_0_1());
                                

                            }
                            break;

                    }

                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:106:2: ( (lv_id_3_0= ruleDotID ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=RULE_DOTSTRINGTERM && LA2_0<=RULE_ID)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:107:1: (lv_id_3_0= ruleDotID )
                            {
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:107:1: (lv_id_3_0= ruleDotID )
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:108:3: lv_id_3_0= ruleDotID
                            {
                             
                            	        newCompositeNode(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_0_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_ruleDotGraph193);
                            lv_id_3_0=ruleDotID();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"id",
                                    		lv_id_3_0, 
                                    		"DotID");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:125:6: (otherlv_4= 'subgraph' ( (lv_id_5_0= ruleDotID ) )? )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:125:6: (otherlv_4= 'subgraph' ( (lv_id_5_0= ruleDotID ) )? )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:125:8: otherlv_4= 'subgraph' ( (lv_id_5_0= ruleDotID ) )?
                    {
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDotGraph214); 

                        	newLeafNode(otherlv_4, grammarAccess.getDotGraphAccess().getSubgraphKeyword_1_1_0());
                        
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:129:1: ( (lv_id_5_0= ruleDotID ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=RULE_DOTSTRINGTERM && LA3_0<=RULE_ID)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:130:1: (lv_id_5_0= ruleDotID )
                            {
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:130:1: (lv_id_5_0= ruleDotID )
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:131:3: lv_id_5_0= ruleDotID
                            {
                             
                            	        newCompositeNode(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_ruleDotGraph235);
                            lv_id_5_0=ruleDotID();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"id",
                                    		lv_id_5_0, 
                                    		"DotID");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDotGraph250); 

                	newLeafNode(otherlv_6, grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:151:1: ( (otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )? ) | (otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )? ) | (otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )? ) | ( (lv_subgraphs_28_0= ruleDotGraph ) ) | ( (lv_nodes_29_0= ruleDotNode ) ) | ( (lv_edges_30_0= ruleDotEdge ) ) )*
            loop11:
            do {
                int alt11=7;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:151:2: (otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )? )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:151:2: (otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )? )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:151:4: otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )?
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDotGraph264); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDotGraphAccess().getGraphKeyword_3_0_0());
            	        
            	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDotGraph276); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_0_1());
            	        
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:159:1: ( (lv_graphSettings_9_0= ruleSetting ) )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:160:1: (lv_graphSettings_9_0= ruleSetting )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:160:1: (lv_graphSettings_9_0= ruleSetting )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:161:3: lv_graphSettings_9_0= ruleSetting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotGraph297);
            	    lv_graphSettings_9_0=ruleSetting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"graphSettings",
            	            		lv_graphSettings_9_0, 
            	            		"Setting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:177:2: (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==18) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:177:4: otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDotGraph310); 

            	    	        	newLeafNode(otherlv_10, grammarAccess.getDotGraphAccess().getCommaKeyword_3_0_3_0());
            	    	        
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:181:1: ( (lv_graphSettings_11_0= ruleSetting ) )
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:182:1: (lv_graphSettings_11_0= ruleSetting )
            	    	    {
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:182:1: (lv_graphSettings_11_0= ruleSetting )
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:183:3: lv_graphSettings_11_0= ruleSetting
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotGraph331);
            	    	    lv_graphSettings_11_0=ruleSetting();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"graphSettings",
            	    	            		lv_graphSettings_11_0, 
            	    	            		"Setting");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDotGraph345); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_0_4());
            	        
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:203:1: (otherlv_13= ';' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==20) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:203:3: otherlv_13= ';'
            	            {
            	            otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDotGraph358); 

            	                	newLeafNode(otherlv_13, grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_0_5());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:208:6: (otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )? )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:208:6: (otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )? )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:208:8: otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )?
            	    {
            	    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDotGraph380); 

            	        	newLeafNode(otherlv_14, grammarAccess.getDotGraphAccess().getNodeKeyword_3_1_0());
            	        
            	    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDotGraph392); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:216:1: ( (lv_nodeSettings_16_0= ruleSetting ) )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:217:1: (lv_nodeSettings_16_0= ruleSetting )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:217:1: (lv_nodeSettings_16_0= ruleSetting )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:218:3: lv_nodeSettings_16_0= ruleSetting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotGraph413);
            	    lv_nodeSettings_16_0=ruleSetting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodeSettings",
            	            		lv_nodeSettings_16_0, 
            	            		"Setting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:234:2: (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==18) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:234:4: otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDotGraph426); 

            	    	        	newLeafNode(otherlv_17, grammarAccess.getDotGraphAccess().getCommaKeyword_3_1_3_0());
            	    	        
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:238:1: ( (lv_nodeSettings_18_0= ruleSetting ) )
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:239:1: (lv_nodeSettings_18_0= ruleSetting )
            	    	    {
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:239:1: (lv_nodeSettings_18_0= ruleSetting )
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:240:3: lv_nodeSettings_18_0= ruleSetting
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotGraph447);
            	    	    lv_nodeSettings_18_0=ruleSetting();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"nodeSettings",
            	    	            		lv_nodeSettings_18_0, 
            	    	            		"Setting");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDotGraph461); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_1_4());
            	        
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:260:1: (otherlv_20= ';' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==20) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:260:3: otherlv_20= ';'
            	            {
            	            otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDotGraph474); 

            	                	newLeafNode(otherlv_20, grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_1_5());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:265:6: (otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )? )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:265:6: (otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )? )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:265:8: otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )?
            	    {
            	    otherlv_21=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDotGraph496); 

            	        	newLeafNode(otherlv_21, grammarAccess.getDotGraphAccess().getEdgeKeyword_3_2_0());
            	        
            	    otherlv_22=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDotGraph508); 

            	        	newLeafNode(otherlv_22, grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_2_1());
            	        
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:273:1: ( (lv_edgeSettings_23_0= ruleSetting ) )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:274:1: (lv_edgeSettings_23_0= ruleSetting )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:274:1: (lv_edgeSettings_23_0= ruleSetting )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:275:3: lv_edgeSettings_23_0= ruleSetting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotGraph529);
            	    lv_edgeSettings_23_0=ruleSetting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edgeSettings",
            	            		lv_edgeSettings_23_0, 
            	            		"Setting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:291:2: (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==18) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:291:4: otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDotGraph542); 

            	    	        	newLeafNode(otherlv_24, grammarAccess.getDotGraphAccess().getCommaKeyword_3_2_3_0());
            	    	        
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:295:1: ( (lv_edgeSettings_25_0= ruleSetting ) )
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:296:1: (lv_edgeSettings_25_0= ruleSetting )
            	    	    {
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:296:1: (lv_edgeSettings_25_0= ruleSetting )
            	    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:297:3: lv_edgeSettings_25_0= ruleSetting
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotGraph563);
            	    	    lv_edgeSettings_25_0=ruleSetting();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"edgeSettings",
            	    	            		lv_edgeSettings_25_0, 
            	    	            		"Setting");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_26=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDotGraph577); 

            	        	newLeafNode(otherlv_26, grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_2_4());
            	        
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:317:1: (otherlv_27= ';' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==20) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:317:3: otherlv_27= ';'
            	            {
            	            otherlv_27=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDotGraph590); 

            	                	newLeafNode(otherlv_27, grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_2_5());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:322:6: ( (lv_subgraphs_28_0= ruleDotGraph ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:322:6: ( (lv_subgraphs_28_0= ruleDotGraph ) )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:323:1: (lv_subgraphs_28_0= ruleDotGraph )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:323:1: (lv_subgraphs_28_0= ruleDotGraph )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:324:3: lv_subgraphs_28_0= ruleDotGraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getSubgraphsDotGraphParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDotGraph_in_ruleDotGraph620);
            	    lv_subgraphs_28_0=ruleDotGraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subgraphs",
            	            		lv_subgraphs_28_0, 
            	            		"DotGraph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:341:6: ( (lv_nodes_29_0= ruleDotNode ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:341:6: ( (lv_nodes_29_0= ruleDotNode ) )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:342:1: (lv_nodes_29_0= ruleDotNode )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:342:1: (lv_nodes_29_0= ruleDotNode )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:343:3: lv_nodes_29_0= ruleDotNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getNodesDotNodeParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDotNode_in_ruleDotGraph647);
            	    lv_nodes_29_0=ruleDotNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_29_0, 
            	            		"DotNode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:360:6: ( (lv_edges_30_0= ruleDotEdge ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:360:6: ( (lv_edges_30_0= ruleDotEdge ) )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:361:1: (lv_edges_30_0= ruleDotEdge )
            	    {
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:361:1: (lv_edges_30_0= ruleDotEdge )
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:362:3: lv_edges_30_0= ruleDotEdge
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDotGraphAccess().getEdgesDotEdgeParserRuleCall_3_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDotEdge_in_ruleDotGraph674);
            	    lv_edges_30_0=ruleDotEdge();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edges",
            	            		lv_edges_30_0, 
            	            		"DotEdge");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_31=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDotGraph688); 

                	newLeafNode(otherlv_31, grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleDotNode"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:390:1: entryRuleDotNode returns [EObject current=null] : iv_ruleDotNode= ruleDotNode EOF ;
    public final EObject entryRuleDotNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotNode = null;


        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:391:2: (iv_ruleDotNode= ruleDotNode EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:392:2: iv_ruleDotNode= ruleDotNode EOF
            {
             newCompositeNode(grammarAccess.getDotNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotNode_in_entryRuleDotNode724);
            iv_ruleDotNode=ruleDotNode();

            state._fsp--;

             current =iv_ruleDotNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotNode734); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:399:1: ruleDotNode returns [EObject current=null] : ( ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )? ) ;
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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:402:28: ( ( ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:403:1: ( ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:403:1: ( ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:403:2: ( (lv_name_0_0= ruleDotID ) ) (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )? (otherlv_6= ';' )?
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:403:2: ( (lv_name_0_0= ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:404:1: (lv_name_0_0= ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:404:1: (lv_name_0_0= ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:405:3: lv_name_0_0= ruleDotID
            {
             
            	        newCompositeNode(grammarAccess.getDotNodeAccess().getNameDotIDParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_ruleDotNode780);
            lv_name_0_0=ruleDotID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDotNodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"DotID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:421:2: (otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:421:4: otherlv_1= '[' ( (lv_settings_2_0= ruleSetting ) ) (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDotNode793); 

                        	newLeafNode(otherlv_1, grammarAccess.getDotNodeAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:425:1: ( (lv_settings_2_0= ruleSetting ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:426:1: (lv_settings_2_0= ruleSetting )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:426:1: (lv_settings_2_0= ruleSetting )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:427:3: lv_settings_2_0= ruleSetting
                    {
                     
                    	        newCompositeNode(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotNode814);
                    lv_settings_2_0=ruleSetting();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDotNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"settings",
                            		lv_settings_2_0, 
                            		"Setting");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:443:2: (otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:443:4: otherlv_3= ',' ( (lv_settings_4_0= ruleSetting ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDotNode827); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getDotNodeAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:447:1: ( (lv_settings_4_0= ruleSetting ) )
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:448:1: (lv_settings_4_0= ruleSetting )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:448:1: (lv_settings_4_0= ruleSetting )
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:449:3: lv_settings_4_0= ruleSetting
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotNode848);
                    	    lv_settings_4_0=ruleSetting();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDotNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"settings",
                    	            		lv_settings_4_0, 
                    	            		"Setting");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDotNode862); 

                        	newLeafNode(otherlv_5, grammarAccess.getDotNodeAccess().getRightSquareBracketKeyword_1_3());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:469:3: (otherlv_6= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:469:5: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDotNode877); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:481:1: entryRuleDotEdge returns [EObject current=null] : iv_ruleDotEdge= ruleDotEdge EOF ;
    public final EObject entryRuleDotEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotEdge = null;


        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:482:2: (iv_ruleDotEdge= ruleDotEdge EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:483:2: iv_ruleDotEdge= ruleDotEdge EOF
            {
             newCompositeNode(grammarAccess.getDotEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotEdge_in_entryRuleDotEdge915);
            iv_ruleDotEdge=ruleDotEdge();

            state._fsp--;

             current =iv_ruleDotEdge; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotEdge925); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:490:1: ruleDotEdge returns [EObject current=null] : ( ( ( ruleDotID ) ) (otherlv_1= '--' | otherlv_2= '->' ) ( ( ruleDotID ) ) (otherlv_4= '[' ( (lv_settings_5_0= ruleSetting ) ) (otherlv_6= ',' ( (lv_settings_7_0= ruleSetting ) ) )* otherlv_8= ']' )? (otherlv_9= ';' )? ) ;
    public final EObject ruleDotEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_settings_5_0 = null;

        EObject lv_settings_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:493:28: ( ( ( ( ruleDotID ) ) (otherlv_1= '--' | otherlv_2= '->' ) ( ( ruleDotID ) ) (otherlv_4= '[' ( (lv_settings_5_0= ruleSetting ) ) (otherlv_6= ',' ( (lv_settings_7_0= ruleSetting ) ) )* otherlv_8= ']' )? (otherlv_9= ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:494:1: ( ( ( ruleDotID ) ) (otherlv_1= '--' | otherlv_2= '->' ) ( ( ruleDotID ) ) (otherlv_4= '[' ( (lv_settings_5_0= ruleSetting ) ) (otherlv_6= ',' ( (lv_settings_7_0= ruleSetting ) ) )* otherlv_8= ']' )? (otherlv_9= ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:494:1: ( ( ( ruleDotID ) ) (otherlv_1= '--' | otherlv_2= '->' ) ( ( ruleDotID ) ) (otherlv_4= '[' ( (lv_settings_5_0= ruleSetting ) ) (otherlv_6= ',' ( (lv_settings_7_0= ruleSetting ) ) )* otherlv_8= ']' )? (otherlv_9= ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:494:2: ( ( ruleDotID ) ) (otherlv_1= '--' | otherlv_2= '->' ) ( ( ruleDotID ) ) (otherlv_4= '[' ( (lv_settings_5_0= ruleSetting ) ) (otherlv_6= ',' ( (lv_settings_7_0= ruleSetting ) ) )* otherlv_8= ']' )? (otherlv_9= ';' )?
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:494:2: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:495:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:495:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:496:3: ruleDotID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDotEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_ruleDotEdge973);
            ruleDotID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:509:2: (otherlv_1= '--' | otherlv_2= '->' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:509:4: otherlv_1= '--'
                    {
                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDotEdge986); 

                        	newLeafNode(otherlv_1, grammarAccess.getDotEdgeAccess().getHyphenMinusHyphenMinusKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:514:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDotEdge1004); 

                        	newLeafNode(otherlv_2, grammarAccess.getDotEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:518:2: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:519:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:519:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:520:3: ruleDotID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDotEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_ruleDotEdge1028);
            ruleDotID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:533:2: (otherlv_4= '[' ( (lv_settings_5_0= ruleSetting ) ) (otherlv_6= ',' ( (lv_settings_7_0= ruleSetting ) ) )* otherlv_8= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:533:4: otherlv_4= '[' ( (lv_settings_5_0= ruleSetting ) ) (otherlv_6= ',' ( (lv_settings_7_0= ruleSetting ) ) )* otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDotEdge1041); 

                        	newLeafNode(otherlv_4, grammarAccess.getDotEdgeAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:537:1: ( (lv_settings_5_0= ruleSetting ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:538:1: (lv_settings_5_0= ruleSetting )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:538:1: (lv_settings_5_0= ruleSetting )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:539:3: lv_settings_5_0= ruleSetting
                    {
                     
                    	        newCompositeNode(grammarAccess.getDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotEdge1062);
                    lv_settings_5_0=ruleSetting();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDotEdgeRule());
                    	        }
                           		add(
                           			current, 
                           			"settings",
                            		lv_settings_5_0, 
                            		"Setting");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:555:2: (otherlv_6= ',' ( (lv_settings_7_0= ruleSetting ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:555:4: otherlv_6= ',' ( (lv_settings_7_0= ruleSetting ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDotEdge1075); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getDotEdgeAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:559:1: ( (lv_settings_7_0= ruleSetting ) )
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:560:1: (lv_settings_7_0= ruleSetting )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:560:1: (lv_settings_7_0= ruleSetting )
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:561:3: lv_settings_7_0= ruleSetting
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSetting_in_ruleDotEdge1096);
                    	    lv_settings_7_0=ruleSetting();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDotEdgeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"settings",
                    	            		lv_settings_7_0, 
                    	            		"Setting");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDotEdge1110); 

                        	newLeafNode(otherlv_8, grammarAccess.getDotEdgeAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:581:3: (otherlv_9= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:581:5: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDotEdge1125); 

                        	newLeafNode(otherlv_9, grammarAccess.getDotEdgeAccess().getSemicolonKeyword_4());
                        

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
    // $ANTLR end "ruleDotEdge"


    // $ANTLR start "entryRuleSetting"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:593:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:594:2: (iv_ruleSetting= ruleSetting EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:595:2: iv_ruleSetting= ruleSetting EOF
            {
             newCompositeNode(grammarAccess.getSettingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_entryRuleSetting1163);
            iv_ruleSetting=ruleSetting();

            state._fsp--;

             current =iv_ruleSetting; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetting1173); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:602:1: ruleSetting returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) ) ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_attribute_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:605:28: ( ( ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:606:1: ( ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:606:1: ( ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:606:2: ( (lv_attribute_0_0= ruleDotID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDotID ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:606:2: ( (lv_attribute_0_0= ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:607:1: (lv_attribute_0_0= ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:607:1: (lv_attribute_0_0= ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:608:3: lv_attribute_0_0= ruleDotID
            {
             
            	        newCompositeNode(grammarAccess.getSettingAccess().getAttributeDotIDParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_ruleSetting1219);
            lv_attribute_0_0=ruleDotID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSettingRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_0_0, 
                    		"DotID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSetting1231); 

                	newLeafNode(otherlv_1, grammarAccess.getSettingAccess().getEqualsSignKeyword_1());
                
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:628:1: ( (lv_value_2_0= ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:629:1: (lv_value_2_0= ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:629:1: (lv_value_2_0= ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:630:3: lv_value_2_0= ruleDotID
            {
             
            	        newCompositeNode(grammarAccess.getSettingAccess().getValueDotIDParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_ruleSetting1252);
            lv_value_2_0=ruleDotID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSettingRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"DotID");
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


    // $ANTLR start "entryRuleDotID"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:654:1: entryRuleDotID returns [String current=null] : iv_ruleDotID= ruleDotID EOF ;
    public final String entryRuleDotID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDotID = null;


        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:655:2: (iv_ruleDotID= ruleDotID EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:656:2: iv_ruleDotID= ruleDotID EOF
            {
             newCompositeNode(grammarAccess.getDotIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_entryRuleDotID1289);
            iv_ruleDotID=ruleDotID();

            state._fsp--;

             current =iv_ruleDotID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotID1300); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:663:1: ruleDotID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM | this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID | this_INT_2= RULE_INT | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDotID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOTSTRINGTERM_0=null;
        Token this_NUMPREFIXEDID_1=null;
        Token this_INT_2=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:666:28: ( (this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM | this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID | this_INT_2= RULE_INT | this_ID_3= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:667:1: (this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM | this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID | this_INT_2= RULE_INT | this_ID_3= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:667:1: (this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM | this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID | this_INT_2= RULE_INT | this_ID_3= RULE_ID )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_DOTSTRINGTERM:
                {
                alt19=1;
                }
                break;
            case RULE_NUMPREFIXEDID:
                {
                alt19=2;
                }
                break;
            case RULE_INT:
                {
                alt19=3;
                }
                break;
            case RULE_ID:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:667:6: this_DOTSTRINGTERM_0= RULE_DOTSTRINGTERM
                    {
                    this_DOTSTRINGTERM_0=(Token)match(input,RULE_DOTSTRINGTERM,FollowSets000.FOLLOW_RULE_DOTSTRINGTERM_in_ruleDotID1340); 

                    		current.merge(this_DOTSTRINGTERM_0);
                        
                     
                        newLeafNode(this_DOTSTRINGTERM_0, grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:675:10: this_NUMPREFIXEDID_1= RULE_NUMPREFIXEDID
                    {
                    this_NUMPREFIXEDID_1=(Token)match(input,RULE_NUMPREFIXEDID,FollowSets000.FOLLOW_RULE_NUMPREFIXEDID_in_ruleDotID1366); 

                    		current.merge(this_NUMPREFIXEDID_1);
                        
                     
                        newLeafNode(this_NUMPREFIXEDID_1, grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:683:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleDotID1392); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDotIDAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/parser/antlr/internal/InternalDotLanguage.g:691:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDotID1418); 

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

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\15\uffff";
    static final String DFA11_eofS =
        "\15\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\1\4\3\uffff\4\4\3\uffff";
    static final String DFA11_maxS =
        "\1\27\1\uffff\1\21\3\uffff\4\31\3\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\7\1\uffff\1\2\1\3\1\4\4\uffff\1\1\1\6\1\5";
    static final String DFA11_specialS =
        "\15\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\6\1\7\1\10\1\11\5\uffff\1\5\1\2\1\5\5\uffff\1\3\1\4\1\1",
            "",
            "\4\5\10\uffff\1\5\1\12",
            "",
            "",
            "",
            "\4\14\5\uffff\3\14\1\uffff\1\14\2\uffff\4\14\2\13",
            "\4\14\5\uffff\3\14\1\uffff\1\14\2\uffff\4\14\2\13",
            "\4\14\5\uffff\3\14\1\uffff\1\14\2\uffff\4\14\2\13",
            "\4\14\5\uffff\3\14\1\uffff\1\14\2\uffff\4\14\2\13",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 151:1: ( (otherlv_7= 'graph' otherlv_8= '[' ( (lv_graphSettings_9_0= ruleSetting ) ) (otherlv_10= ',' ( (lv_graphSettings_11_0= ruleSetting ) ) )* otherlv_12= ']' (otherlv_13= ';' )? ) | (otherlv_14= 'node' otherlv_15= '[' ( (lv_nodeSettings_16_0= ruleSetting ) ) (otherlv_17= ',' ( (lv_nodeSettings_18_0= ruleSetting ) ) )* otherlv_19= ']' (otherlv_20= ';' )? ) | (otherlv_21= 'edge' otherlv_22= '[' ( (lv_edgeSettings_23_0= ruleSetting ) ) (otherlv_24= ',' ( (lv_edgeSettings_25_0= ruleSetting ) ) )* otherlv_26= ']' (otherlv_27= ';' )? ) | ( (lv_subgraphs_28_0= ruleDotGraph ) ) | ( (lv_nodes_29_0= ruleDotNode ) ) | ( (lv_edges_30_0= ruleDotEdge ) ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDotGraph_in_entryRuleDotGraph75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotGraph85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleDotGraph140 = new BitSet(new long[]{0x00000000000100F0L});
        public static final BitSet FOLLOW_14_in_ruleDotGraph171 = new BitSet(new long[]{0x00000000000100F0L});
        public static final BitSet FOLLOW_ruleDotID_in_ruleDotGraph193 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_15_in_ruleDotGraph214 = new BitSet(new long[]{0x00000000000100F0L});
        public static final BitSet FOLLOW_ruleDotID_in_ruleDotGraph235 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDotGraph250 = new BitSet(new long[]{0x0000000000E0E0F0L});
        public static final BitSet FOLLOW_14_in_ruleDotGraph264 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDotGraph276 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotGraph297 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDotGraph310 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotGraph331 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleDotGraph345 = new BitSet(new long[]{0x0000000000F0E0F0L});
        public static final BitSet FOLLOW_20_in_ruleDotGraph358 = new BitSet(new long[]{0x0000000000E0E0F0L});
        public static final BitSet FOLLOW_21_in_ruleDotGraph380 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDotGraph392 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotGraph413 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDotGraph426 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotGraph447 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleDotGraph461 = new BitSet(new long[]{0x0000000000F0E0F0L});
        public static final BitSet FOLLOW_20_in_ruleDotGraph474 = new BitSet(new long[]{0x0000000000E0E0F0L});
        public static final BitSet FOLLOW_22_in_ruleDotGraph496 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDotGraph508 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotGraph529 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDotGraph542 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotGraph563 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleDotGraph577 = new BitSet(new long[]{0x0000000000F0E0F0L});
        public static final BitSet FOLLOW_20_in_ruleDotGraph590 = new BitSet(new long[]{0x0000000000E0E0F0L});
        public static final BitSet FOLLOW_ruleDotGraph_in_ruleDotGraph620 = new BitSet(new long[]{0x0000000000E0E0F0L});
        public static final BitSet FOLLOW_ruleDotNode_in_ruleDotGraph647 = new BitSet(new long[]{0x0000000000E0E0F0L});
        public static final BitSet FOLLOW_ruleDotEdge_in_ruleDotGraph674 = new BitSet(new long[]{0x0000000000E0E0F0L});
        public static final BitSet FOLLOW_23_in_ruleDotGraph688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotNode_in_entryRuleDotNode724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotNode734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_ruleDotNode780 = new BitSet(new long[]{0x0000000000120002L});
        public static final BitSet FOLLOW_17_in_ruleDotNode793 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotNode814 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDotNode827 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotNode848 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleDotNode862 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleDotNode877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotEdge_in_entryRuleDotEdge915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotEdge925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_ruleDotEdge973 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleDotEdge986 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_25_in_ruleDotEdge1004 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleDotID_in_ruleDotEdge1028 = new BitSet(new long[]{0x0000000000120002L});
        public static final BitSet FOLLOW_17_in_ruleDotEdge1041 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotEdge1062 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDotEdge1075 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleSetting_in_ruleDotEdge1096 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleDotEdge1110 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleDotEdge1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_entryRuleSetting1163 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetting1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_ruleSetting1219 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleSetting1231 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_ruleDotID_in_ruleSetting1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_entryRuleDotID1289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotID1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOTSTRINGTERM_in_ruleDotID1340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMPREFIXEDID_in_ruleDotID1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleDotID1392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDotID1418 = new BitSet(new long[]{0x0000000000000002L});
    }


}