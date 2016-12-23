package org.muml.graphviz.plain.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.muml.graphviz.plain.xtext.services.GraphvizPlainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphvizPlainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'stop'", "'node'", "'edge'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=6;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalGraphvizPlainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraphvizPlainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraphvizPlainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGraphvizPlain.g"; }



     	private GraphvizPlainGrammarAccess grammarAccess;
     	
        public InternalGraphvizPlainParser(TokenStream input, GraphvizPlainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Graph";	
       	}
       	
       	@Override
       	protected GraphvizPlainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGraph"
    // InternalGraphvizPlain.g:67:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // InternalGraphvizPlain.g:68:2: (iv_ruleGraph= ruleGraph EOF )
            // InternalGraphvizPlain.g:69:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // InternalGraphvizPlain.g:76:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'graph' ( (lv_scale_1_0= ruleNumber ) ) ( (lv_width_2_0= ruleNumber ) ) ( (lv_height_3_0= ruleNumber ) ) ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= 'stop' ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_scale_1_0 = null;

        AntlrDatatypeRuleToken lv_width_2_0 = null;

        AntlrDatatypeRuleToken lv_height_3_0 = null;

        EObject lv_nodes_4_0 = null;

        EObject lv_edges_5_0 = null;


         enterRule(); 
            
        try {
            // InternalGraphvizPlain.g:79:28: ( (otherlv_0= 'graph' ( (lv_scale_1_0= ruleNumber ) ) ( (lv_width_2_0= ruleNumber ) ) ( (lv_height_3_0= ruleNumber ) ) ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= 'stop' ) )
            // InternalGraphvizPlain.g:80:1: (otherlv_0= 'graph' ( (lv_scale_1_0= ruleNumber ) ) ( (lv_width_2_0= ruleNumber ) ) ( (lv_height_3_0= ruleNumber ) ) ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= 'stop' )
            {
            // InternalGraphvizPlain.g:80:1: (otherlv_0= 'graph' ( (lv_scale_1_0= ruleNumber ) ) ( (lv_width_2_0= ruleNumber ) ) ( (lv_height_3_0= ruleNumber ) ) ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= 'stop' )
            // InternalGraphvizPlain.g:80:3: otherlv_0= 'graph' ( (lv_scale_1_0= ruleNumber ) ) ( (lv_width_2_0= ruleNumber ) ) ( (lv_height_3_0= ruleNumber ) ) ( (lv_nodes_4_0= ruleNode ) )* ( (lv_edges_5_0= ruleEdge ) )* otherlv_6= 'stop'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
                
            // InternalGraphvizPlain.g:84:1: ( (lv_scale_1_0= ruleNumber ) )
            // InternalGraphvizPlain.g:85:1: (lv_scale_1_0= ruleNumber )
            {
            // InternalGraphvizPlain.g:85:1: (lv_scale_1_0= ruleNumber )
            // InternalGraphvizPlain.g:86:3: lv_scale_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getGraphAccess().getScaleNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_scale_1_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	        }
                   		set(
                   			current, 
                   			"scale",
                    		lv_scale_1_0, 
                    		"org.muml.graphviz.plain.xtext.GraphvizPlain.Number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGraphvizPlain.g:102:2: ( (lv_width_2_0= ruleNumber ) )
            // InternalGraphvizPlain.g:103:1: (lv_width_2_0= ruleNumber )
            {
            // InternalGraphvizPlain.g:103:1: (lv_width_2_0= ruleNumber )
            // InternalGraphvizPlain.g:104:3: lv_width_2_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getGraphAccess().getWidthNumberParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_width_2_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	        }
                   		set(
                   			current, 
                   			"width",
                    		lv_width_2_0, 
                    		"org.muml.graphviz.plain.xtext.GraphvizPlain.Number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGraphvizPlain.g:120:2: ( (lv_height_3_0= ruleNumber ) )
            // InternalGraphvizPlain.g:121:1: (lv_height_3_0= ruleNumber )
            {
            // InternalGraphvizPlain.g:121:1: (lv_height_3_0= ruleNumber )
            // InternalGraphvizPlain.g:122:3: lv_height_3_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getGraphAccess().getHeightNumberParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            lv_height_3_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	        }
                   		set(
                   			current, 
                   			"height",
                    		lv_height_3_0, 
                    		"org.muml.graphviz.plain.xtext.GraphvizPlain.Number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGraphvizPlain.g:138:2: ( (lv_nodes_4_0= ruleNode ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraphvizPlain.g:139:1: (lv_nodes_4_0= ruleNode )
            	    {
            	    // InternalGraphvizPlain.g:139:1: (lv_nodes_4_0= ruleNode )
            	    // InternalGraphvizPlain.g:140:3: lv_nodes_4_0= ruleNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getNodesNodeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_nodes_4_0=ruleNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_4_0, 
            	            		"org.muml.graphviz.plain.xtext.GraphvizPlain.Node");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGraphvizPlain.g:156:3: ( (lv_edges_5_0= ruleEdge ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGraphvizPlain.g:157:1: (lv_edges_5_0= ruleEdge )
            	    {
            	    // InternalGraphvizPlain.g:157:1: (lv_edges_5_0= ruleEdge )
            	    // InternalGraphvizPlain.g:158:3: lv_edges_5_0= ruleEdge
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphAccess().getEdgesEdgeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_edges_5_0=ruleEdge();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edges",
            	            		lv_edges_5_0, 
            	            		"org.muml.graphviz.plain.xtext.GraphvizPlain.Edge");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getGraphAccess().getStopKeyword_6());
                

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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleNode"
    // InternalGraphvizPlain.g:186:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalGraphvizPlain.g:187:2: (iv_ruleNode= ruleNode EOF )
            // InternalGraphvizPlain.g:188:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalGraphvizPlain.g:195:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_position_2_0= rulePoint ) ) ( (lv_width_3_0= ruleNumber ) ) ( (lv_height_4_0= ruleNumber ) ) ruleIdentifier this_ID_6= RULE_ID this_ID_7= RULE_ID this_ID_8= RULE_ID this_ID_9= RULE_ID ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_6=null;
        Token this_ID_7=null;
        Token this_ID_8=null;
        Token this_ID_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_position_2_0 = null;

        AntlrDatatypeRuleToken lv_width_3_0 = null;

        AntlrDatatypeRuleToken lv_height_4_0 = null;


         enterRule(); 
            
        try {
            // InternalGraphvizPlain.g:198:28: ( (otherlv_0= 'node' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_position_2_0= rulePoint ) ) ( (lv_width_3_0= ruleNumber ) ) ( (lv_height_4_0= ruleNumber ) ) ruleIdentifier this_ID_6= RULE_ID this_ID_7= RULE_ID this_ID_8= RULE_ID this_ID_9= RULE_ID ) )
            // InternalGraphvizPlain.g:199:1: (otherlv_0= 'node' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_position_2_0= rulePoint ) ) ( (lv_width_3_0= ruleNumber ) ) ( (lv_height_4_0= ruleNumber ) ) ruleIdentifier this_ID_6= RULE_ID this_ID_7= RULE_ID this_ID_8= RULE_ID this_ID_9= RULE_ID )
            {
            // InternalGraphvizPlain.g:199:1: (otherlv_0= 'node' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_position_2_0= rulePoint ) ) ( (lv_width_3_0= ruleNumber ) ) ( (lv_height_4_0= ruleNumber ) ) ruleIdentifier this_ID_6= RULE_ID this_ID_7= RULE_ID this_ID_8= RULE_ID this_ID_9= RULE_ID )
            // InternalGraphvizPlain.g:199:3: otherlv_0= 'node' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_position_2_0= rulePoint ) ) ( (lv_width_3_0= ruleNumber ) ) ( (lv_height_4_0= ruleNumber ) ) ruleIdentifier this_ID_6= RULE_ID this_ID_7= RULE_ID this_ID_8= RULE_ID this_ID_9= RULE_ID
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
                
            // InternalGraphvizPlain.g:203:1: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalGraphvizPlain.g:204:1: (lv_name_1_0= ruleIdentifier )
            {
            // InternalGraphvizPlain.g:204:1: (lv_name_1_0= ruleIdentifier )
            // InternalGraphvizPlain.g:205:3: lv_name_1_0= ruleIdentifier
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getNameIdentifierParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.muml.graphviz.plain.xtext.GraphvizPlain.Identifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGraphvizPlain.g:221:2: ( (lv_position_2_0= rulePoint ) )
            // InternalGraphvizPlain.g:222:1: (lv_position_2_0= rulePoint )
            {
            // InternalGraphvizPlain.g:222:1: (lv_position_2_0= rulePoint )
            // InternalGraphvizPlain.g:223:3: lv_position_2_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getPositionPointParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_position_2_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_2_0, 
                    		"org.muml.graphviz.plain.xtext.GraphvizPlain.Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGraphvizPlain.g:239:2: ( (lv_width_3_0= ruleNumber ) )
            // InternalGraphvizPlain.g:240:1: (lv_width_3_0= ruleNumber )
            {
            // InternalGraphvizPlain.g:240:1: (lv_width_3_0= ruleNumber )
            // InternalGraphvizPlain.g:241:3: lv_width_3_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getWidthNumberParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_width_3_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	        }
                   		set(
                   			current, 
                   			"width",
                    		lv_width_3_0, 
                    		"org.muml.graphviz.plain.xtext.GraphvizPlain.Number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGraphvizPlain.g:257:2: ( (lv_height_4_0= ruleNumber ) )
            // InternalGraphvizPlain.g:258:1: (lv_height_4_0= ruleNumber )
            {
            // InternalGraphvizPlain.g:258:1: (lv_height_4_0= ruleNumber )
            // InternalGraphvizPlain.g:259:3: lv_height_4_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getHeightNumberParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_height_4_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	        }
                   		set(
                   			current, 
                   			"height",
                    		lv_height_4_0, 
                    		"org.muml.graphviz.plain.xtext.GraphvizPlain.Number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getNodeAccess().getIdentifierParserRuleCall_5()); 
                
            pushFollow(FollowSets000.FOLLOW_7);
            ruleIdentifier();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 
             
                newLeafNode(this_ID_6, grammarAccess.getNodeAccess().getIDTerminalRuleCall_6()); 
                
            this_ID_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 
             
                newLeafNode(this_ID_7, grammarAccess.getNodeAccess().getIDTerminalRuleCall_7()); 
                
            this_ID_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 
             
                newLeafNode(this_ID_8, grammarAccess.getNodeAccess().getIDTerminalRuleCall_8()); 
                
            this_ID_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             
                newLeafNode(this_ID_9, grammarAccess.getNodeAccess().getIDTerminalRuleCall_9()); 
                

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleEdge"
    // InternalGraphvizPlain.g:307:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalGraphvizPlain.g:308:2: (iv_ruleEdge= ruleEdge EOF )
            // InternalGraphvizPlain.g:309:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
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
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalGraphvizPlain.g:316:1: ruleEdge returns [EObject current=null] : (otherlv_0= 'edge' ( ( ruleIdentifier ) ) ( ( ruleIdentifier ) ) this_INT_3= RULE_INT ( (lv_splinePoints_4_0= rulePoint ) )* ( ruleIdentifier ruleNumber ruleNumber )? this_ID_8= RULE_ID this_ID_9= RULE_ID ) ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_3=null;
        Token this_ID_8=null;
        Token this_ID_9=null;
        EObject lv_splinePoints_4_0 = null;


         enterRule(); 
            
        try {
            // InternalGraphvizPlain.g:319:28: ( (otherlv_0= 'edge' ( ( ruleIdentifier ) ) ( ( ruleIdentifier ) ) this_INT_3= RULE_INT ( (lv_splinePoints_4_0= rulePoint ) )* ( ruleIdentifier ruleNumber ruleNumber )? this_ID_8= RULE_ID this_ID_9= RULE_ID ) )
            // InternalGraphvizPlain.g:320:1: (otherlv_0= 'edge' ( ( ruleIdentifier ) ) ( ( ruleIdentifier ) ) this_INT_3= RULE_INT ( (lv_splinePoints_4_0= rulePoint ) )* ( ruleIdentifier ruleNumber ruleNumber )? this_ID_8= RULE_ID this_ID_9= RULE_ID )
            {
            // InternalGraphvizPlain.g:320:1: (otherlv_0= 'edge' ( ( ruleIdentifier ) ) ( ( ruleIdentifier ) ) this_INT_3= RULE_INT ( (lv_splinePoints_4_0= rulePoint ) )* ( ruleIdentifier ruleNumber ruleNumber )? this_ID_8= RULE_ID this_ID_9= RULE_ID )
            // InternalGraphvizPlain.g:320:3: otherlv_0= 'edge' ( ( ruleIdentifier ) ) ( ( ruleIdentifier ) ) this_INT_3= RULE_INT ( (lv_splinePoints_4_0= rulePoint ) )* ( ruleIdentifier ruleNumber ruleNumber )? this_ID_8= RULE_ID this_ID_9= RULE_ID
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getEdgeAccess().getEdgeKeyword_0());
                
            // InternalGraphvizPlain.g:324:1: ( ( ruleIdentifier ) )
            // InternalGraphvizPlain.g:325:1: ( ruleIdentifier )
            {
            // InternalGraphvizPlain.g:325:1: ( ruleIdentifier )
            // InternalGraphvizPlain.g:326:3: ruleIdentifier
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEdgeAccess().getSourcePlainNodeCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            ruleIdentifier();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGraphvizPlain.g:339:2: ( ( ruleIdentifier ) )
            // InternalGraphvizPlain.g:340:1: ( ruleIdentifier )
            {
            // InternalGraphvizPlain.g:340:1: ( ruleIdentifier )
            // InternalGraphvizPlain.g:341:3: ruleIdentifier
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEdgeAccess().getTargetPlainNodeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_8);
            ruleIdentifier();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_9); 
             
                newLeafNode(this_INT_3, grammarAccess.getEdgeAccess().getINTTerminalRuleCall_3()); 
                
            // InternalGraphvizPlain.g:358:1: ( (lv_splinePoints_4_0= rulePoint ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_DOUBLE)||LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGraphvizPlain.g:359:1: (lv_splinePoints_4_0= rulePoint )
            	    {
            	    // InternalGraphvizPlain.g:359:1: (lv_splinePoints_4_0= rulePoint )
            	    // InternalGraphvizPlain.g:360:3: lv_splinePoints_4_0= rulePoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEdgeAccess().getSplinePointsPointParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_splinePoints_4_0=rulePoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEdgeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"splinePoints",
            	            		lv_splinePoints_4_0, 
            	            		"org.muml.graphviz.plain.xtext.GraphvizPlain.Point");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalGraphvizPlain.g:376:3: ( ruleIdentifier ruleNumber ruleNumber )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=RULE_INT && LA4_1<=RULE_DOUBLE)||LA4_1==16) ) {
                    alt4=1;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphvizPlain.g:377:5: ruleIdentifier ruleNumber ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getEdgeAccess().getIdentifierParserRuleCall_5_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_3);
                    ruleIdentifier();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_3);
                    ruleNumber();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getEdgeAccess().getNumberParserRuleCall_5_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_7);
                    ruleNumber();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_ID_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); 
             
                newLeafNode(this_ID_8, grammarAccess.getEdgeAccess().getIDTerminalRuleCall_6()); 
                
            this_ID_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             
                newLeafNode(this_ID_9, grammarAccess.getEdgeAccess().getIDTerminalRuleCall_7()); 
                

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
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRulePoint"
    // InternalGraphvizPlain.g:416:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalGraphvizPlain.g:417:2: (iv_rulePoint= rulePoint EOF )
            // InternalGraphvizPlain.g:418:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalGraphvizPlain.g:425:1: rulePoint returns [EObject current=null] : ( ( (lv_x_0_0= ruleNumber ) ) ( (lv_y_1_0= ruleNumber ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_x_0_0 = null;

        AntlrDatatypeRuleToken lv_y_1_0 = null;


         enterRule(); 
            
        try {
            // InternalGraphvizPlain.g:428:28: ( ( ( (lv_x_0_0= ruleNumber ) ) ( (lv_y_1_0= ruleNumber ) ) ) )
            // InternalGraphvizPlain.g:429:1: ( ( (lv_x_0_0= ruleNumber ) ) ( (lv_y_1_0= ruleNumber ) ) )
            {
            // InternalGraphvizPlain.g:429:1: ( ( (lv_x_0_0= ruleNumber ) ) ( (lv_y_1_0= ruleNumber ) ) )
            // InternalGraphvizPlain.g:429:2: ( (lv_x_0_0= ruleNumber ) ) ( (lv_y_1_0= ruleNumber ) )
            {
            // InternalGraphvizPlain.g:429:2: ( (lv_x_0_0= ruleNumber ) )
            // InternalGraphvizPlain.g:430:1: (lv_x_0_0= ruleNumber )
            {
            // InternalGraphvizPlain.g:430:1: (lv_x_0_0= ruleNumber )
            // InternalGraphvizPlain.g:431:3: lv_x_0_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getPointAccess().getXNumberParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_x_0_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointRule());
            	        }
                   		set(
                   			current, 
                   			"x",
                    		lv_x_0_0, 
                    		"org.muml.graphviz.plain.xtext.GraphvizPlain.Number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalGraphvizPlain.g:447:2: ( (lv_y_1_0= ruleNumber ) )
            // InternalGraphvizPlain.g:448:1: (lv_y_1_0= ruleNumber )
            {
            // InternalGraphvizPlain.g:448:1: (lv_y_1_0= ruleNumber )
            // InternalGraphvizPlain.g:449:3: lv_y_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getPointAccess().getYNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_y_1_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointRule());
            	        }
                   		set(
                   			current, 
                   			"y",
                    		lv_y_1_0, 
                    		"org.muml.graphviz.plain.xtext.GraphvizPlain.Number");
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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleNumber"
    // InternalGraphvizPlain.g:473:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalGraphvizPlain.g:474:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalGraphvizPlain.g:475:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalGraphvizPlain.g:482:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DOUBLE_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // InternalGraphvizPlain.g:485:28: ( ( (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) ) )
            // InternalGraphvizPlain.g:486:1: ( (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) )
            {
            // InternalGraphvizPlain.g:486:1: ( (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT ) )
            // InternalGraphvizPlain.g:486:2: (kw= '-' )? (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            {
            // InternalGraphvizPlain.g:486:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGraphvizPlain.g:487:2: kw= '-'
                    {
                    kw=(Token)match(input,16,FollowSets000.FOLLOW_10); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // InternalGraphvizPlain.g:492:3: (this_DOUBLE_1= RULE_DOUBLE | this_INT_2= RULE_INT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOUBLE) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGraphvizPlain.g:492:8: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); 

                    		current.merge(this_DOUBLE_1);
                        
                     
                        newLeafNode(this_DOUBLE_1, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalGraphvizPlain.g:500:10: this_INT_2= RULE_INT
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


    // $ANTLR start "entryRuleIdentifier"
    // InternalGraphvizPlain.g:515:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalGraphvizPlain.g:516:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalGraphvizPlain.g:517:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier.getText(); 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalGraphvizPlain.g:524:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // InternalGraphvizPlain.g:527:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // InternalGraphvizPlain.g:528:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // InternalGraphvizPlain.g:528:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGraphvizPlain.g:528:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalGraphvizPlain.g:536:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleIdentifier"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010060L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000100F0L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    }


}