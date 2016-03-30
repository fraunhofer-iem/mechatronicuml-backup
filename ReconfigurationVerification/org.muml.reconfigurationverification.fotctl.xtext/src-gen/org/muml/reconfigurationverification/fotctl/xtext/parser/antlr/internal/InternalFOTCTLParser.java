package org.muml.reconfigurationverification.fotctl.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.muml.reconfigurationverification.fotctl.xtext.services.FOTCTLGrammarAccess;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFOTCTLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NODE_PREDICATE_NAME", "RULE_EDGE_PREDICATE_NAME", "RULE_CONSTANT_NAME", "RULE_VARIABLE_NAME", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Declaration\\n'", "'NodeLabelPredicates {'", "','", "'}\\n'", "'EdgeLabelPredicates {'", "'Constants {'", "'Formulas\\n'", "';\\n'", "'('", "')'", "' '", "'NOT '", "'['", "'] '", "'exists'", "'forall'", "' & '", "' <=> '", "' => '", "' | '", "' ^ '", "' = '", "' > '", "' >= '", "' < '", "' <= '", "'AF'", "'AG'", "'AU'", "'EF'", "'EG'", "'EU'"
    };
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=8;
    public static final int RULE_NODE_PREDICATE_NAME=4;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_EDGE_PREDICATE_NAME=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_CONSTANT_NAME=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=10;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_VARIABLE_NAME=7;
    public static final int RULE_WS=13;

    // delegates
    // delegators


        public InternalFOTCTLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFOTCTLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFOTCTLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FOTCTLGrammarAccess grammarAccess;
     	
        public InternalFOTCTLParser(TokenStream input, FOTCTLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "FoTCTLSpec";	
       	}
       	
       	@Override
       	protected FOTCTLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFoTCTLSpec"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:74:1: entryRuleFoTCTLSpec returns [EObject current=null] : iv_ruleFoTCTLSpec= ruleFoTCTLSpec EOF ;
    public final EObject entryRuleFoTCTLSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoTCTLSpec = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:75:2: (iv_ruleFoTCTLSpec= ruleFoTCTLSpec EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:76:2: iv_ruleFoTCTLSpec= ruleFoTCTLSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFoTCTLSpecRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFoTCTLSpec_in_entryRuleFoTCTLSpec81);
            iv_ruleFoTCTLSpec=ruleFoTCTLSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFoTCTLSpec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFoTCTLSpec91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFoTCTLSpec"


    // $ANTLR start "ruleFoTCTLSpec"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:83:1: ruleFoTCTLSpec returns [EObject current=null] : ( () otherlv_1= 'Declaration\\n' (otherlv_2= 'NodeLabelPredicates {' ( (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl ) ) (otherlv_4= ',' ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) ) )* otherlv_6= '}\\n' )? (otherlv_7= 'EdgeLabelPredicates {' ( (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl ) ) (otherlv_9= ',' ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) ) )* otherlv_11= '}\\n' )? (otherlv_12= 'Constants {' ( (lv_constants_13_0= ruleConstantSymbolDecl ) ) (otherlv_14= ',' ( (lv_constants_15_0= ruleConstantSymbolDecl ) ) )* otherlv_16= '}\\n' )? otherlv_17= 'Formulas\\n' ( (lv_formulas_18_0= ruleFoTCTLFormula ) )+ ) ;
    public final EObject ruleFoTCTLSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_nodeLabelPredicates_3_0 = null;

        EObject lv_nodeLabelPredicates_5_0 = null;

        EObject lv_edgeLabelPredicates_8_0 = null;

        EObject lv_edgeLabelPredicates_10_0 = null;

        EObject lv_constants_13_0 = null;

        EObject lv_constants_15_0 = null;

        EObject lv_formulas_18_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:86:28: ( ( () otherlv_1= 'Declaration\\n' (otherlv_2= 'NodeLabelPredicates {' ( (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl ) ) (otherlv_4= ',' ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) ) )* otherlv_6= '}\\n' )? (otherlv_7= 'EdgeLabelPredicates {' ( (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl ) ) (otherlv_9= ',' ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) ) )* otherlv_11= '}\\n' )? (otherlv_12= 'Constants {' ( (lv_constants_13_0= ruleConstantSymbolDecl ) ) (otherlv_14= ',' ( (lv_constants_15_0= ruleConstantSymbolDecl ) ) )* otherlv_16= '}\\n' )? otherlv_17= 'Formulas\\n' ( (lv_formulas_18_0= ruleFoTCTLFormula ) )+ ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:87:1: ( () otherlv_1= 'Declaration\\n' (otherlv_2= 'NodeLabelPredicates {' ( (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl ) ) (otherlv_4= ',' ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) ) )* otherlv_6= '}\\n' )? (otherlv_7= 'EdgeLabelPredicates {' ( (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl ) ) (otherlv_9= ',' ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) ) )* otherlv_11= '}\\n' )? (otherlv_12= 'Constants {' ( (lv_constants_13_0= ruleConstantSymbolDecl ) ) (otherlv_14= ',' ( (lv_constants_15_0= ruleConstantSymbolDecl ) ) )* otherlv_16= '}\\n' )? otherlv_17= 'Formulas\\n' ( (lv_formulas_18_0= ruleFoTCTLFormula ) )+ )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:87:1: ( () otherlv_1= 'Declaration\\n' (otherlv_2= 'NodeLabelPredicates {' ( (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl ) ) (otherlv_4= ',' ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) ) )* otherlv_6= '}\\n' )? (otherlv_7= 'EdgeLabelPredicates {' ( (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl ) ) (otherlv_9= ',' ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) ) )* otherlv_11= '}\\n' )? (otherlv_12= 'Constants {' ( (lv_constants_13_0= ruleConstantSymbolDecl ) ) (otherlv_14= ',' ( (lv_constants_15_0= ruleConstantSymbolDecl ) ) )* otherlv_16= '}\\n' )? otherlv_17= 'Formulas\\n' ( (lv_formulas_18_0= ruleFoTCTLFormula ) )+ )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:87:2: () otherlv_1= 'Declaration\\n' (otherlv_2= 'NodeLabelPredicates {' ( (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl ) ) (otherlv_4= ',' ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) ) )* otherlv_6= '}\\n' )? (otherlv_7= 'EdgeLabelPredicates {' ( (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl ) ) (otherlv_9= ',' ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) ) )* otherlv_11= '}\\n' )? (otherlv_12= 'Constants {' ( (lv_constants_13_0= ruleConstantSymbolDecl ) ) (otherlv_14= ',' ( (lv_constants_15_0= ruleConstantSymbolDecl ) ) )* otherlv_16= '}\\n' )? otherlv_17= 'Formulas\\n' ( (lv_formulas_18_0= ruleFoTCTLFormula ) )+
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:87:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:88:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFoTCTLSpecAccess().getFoTCTLSpecAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFoTCTLSpec140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFoTCTLSpecAccess().getDeclarationKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:100:1: (otherlv_2= 'NodeLabelPredicates {' ( (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl ) ) (otherlv_4= ',' ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) ) )* otherlv_6= '}\\n' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:100:3: otherlv_2= 'NodeLabelPredicates {' ( (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl ) ) (otherlv_4= ',' ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) ) )* otherlv_6= '}\\n'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFoTCTLSpec153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesKeyword_2_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:104:1: ( (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:105:1: (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:105:1: (lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:106:3: lv_nodeLabelPredicates_3_0= ruleNodeLabelPredicateDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesNodeLabelPredicateDeclParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNodeLabelPredicateDecl_in_ruleFoTCTLSpec174);
                    lv_nodeLabelPredicates_3_0=ruleNodeLabelPredicateDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFoTCTLSpecRule());
                      	        }
                             		add(
                             			current, 
                             			"nodeLabelPredicates",
                              		lv_nodeLabelPredicates_3_0, 
                              		"NodeLabelPredicateDecl");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:122:2: (otherlv_4= ',' ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:122:4: otherlv_4= ',' ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFoTCTLSpec187); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFoTCTLSpecAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:126:1: ( (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl ) )
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:127:1: (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:127:1: (lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl )
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:128:3: lv_nodeLabelPredicates_5_0= ruleNodeLabelPredicateDecl
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFoTCTLSpecAccess().getNodeLabelPredicatesNodeLabelPredicateDeclParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNodeLabelPredicateDecl_in_ruleFoTCTLSpec208);
                    	    lv_nodeLabelPredicates_5_0=ruleNodeLabelPredicateDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFoTCTLSpecRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"nodeLabelPredicates",
                    	              		lv_nodeLabelPredicates_5_0, 
                    	              		"NodeLabelPredicateDecl");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFoTCTLSpec222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFoTCTLSpecAccess().getRightCurlyBracketControl000aKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:148:3: (otherlv_7= 'EdgeLabelPredicates {' ( (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl ) ) (otherlv_9= ',' ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) ) )* otherlv_11= '}\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:148:5: otherlv_7= 'EdgeLabelPredicates {' ( (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl ) ) (otherlv_9= ',' ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) ) )* otherlv_11= '}\\n'
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFoTCTLSpec237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesKeyword_3_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:152:1: ( (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:153:1: (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:153:1: (lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:154:3: lv_edgeLabelPredicates_8_0= ruleEdgeLabelPredicateDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesEdgeLabelPredicateDeclParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEdgeLabelPredicateDecl_in_ruleFoTCTLSpec258);
                    lv_edgeLabelPredicates_8_0=ruleEdgeLabelPredicateDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFoTCTLSpecRule());
                      	        }
                             		add(
                             			current, 
                             			"edgeLabelPredicates",
                              		lv_edgeLabelPredicates_8_0, 
                              		"EdgeLabelPredicateDecl");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:170:2: (otherlv_9= ',' ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:170:4: otherlv_9= ',' ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFoTCTLSpec271); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getFoTCTLSpecAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:174:1: ( (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl ) )
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:175:1: (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:175:1: (lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl )
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:176:3: lv_edgeLabelPredicates_10_0= ruleEdgeLabelPredicateDecl
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFoTCTLSpecAccess().getEdgeLabelPredicatesEdgeLabelPredicateDeclParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEdgeLabelPredicateDecl_in_ruleFoTCTLSpec292);
                    	    lv_edgeLabelPredicates_10_0=ruleEdgeLabelPredicateDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFoTCTLSpecRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"edgeLabelPredicates",
                    	              		lv_edgeLabelPredicates_10_0, 
                    	              		"EdgeLabelPredicateDecl");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFoTCTLSpec306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getFoTCTLSpecAccess().getRightCurlyBracketControl000aKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:196:3: (otherlv_12= 'Constants {' ( (lv_constants_13_0= ruleConstantSymbolDecl ) ) (otherlv_14= ',' ( (lv_constants_15_0= ruleConstantSymbolDecl ) ) )* otherlv_16= '}\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:196:5: otherlv_12= 'Constants {' ( (lv_constants_13_0= ruleConstantSymbolDecl ) ) (otherlv_14= ',' ( (lv_constants_15_0= ruleConstantSymbolDecl ) ) )* otherlv_16= '}\\n'
                    {
                    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFoTCTLSpec321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getFoTCTLSpecAccess().getConstantsKeyword_4_0());
                          
                    }
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:200:1: ( (lv_constants_13_0= ruleConstantSymbolDecl ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:201:1: (lv_constants_13_0= ruleConstantSymbolDecl )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:201:1: (lv_constants_13_0= ruleConstantSymbolDecl )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:202:3: lv_constants_13_0= ruleConstantSymbolDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFoTCTLSpecAccess().getConstantsConstantSymbolDeclParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantSymbolDecl_in_ruleFoTCTLSpec342);
                    lv_constants_13_0=ruleConstantSymbolDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFoTCTLSpecRule());
                      	        }
                             		add(
                             			current, 
                             			"constants",
                              		lv_constants_13_0, 
                              		"ConstantSymbolDecl");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:218:2: (otherlv_14= ',' ( (lv_constants_15_0= ruleConstantSymbolDecl ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:218:4: otherlv_14= ',' ( (lv_constants_15_0= ruleConstantSymbolDecl ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFoTCTLSpec355); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getFoTCTLSpecAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:222:1: ( (lv_constants_15_0= ruleConstantSymbolDecl ) )
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:223:1: (lv_constants_15_0= ruleConstantSymbolDecl )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:223:1: (lv_constants_15_0= ruleConstantSymbolDecl )
                    	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:224:3: lv_constants_15_0= ruleConstantSymbolDecl
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFoTCTLSpecAccess().getConstantsConstantSymbolDeclParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstantSymbolDecl_in_ruleFoTCTLSpec376);
                    	    lv_constants_15_0=ruleConstantSymbolDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFoTCTLSpecRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constants",
                    	              		lv_constants_15_0, 
                    	              		"ConstantSymbolDecl");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFoTCTLSpec390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getFoTCTLSpecAccess().getRightCurlyBracketControl000aKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFoTCTLSpec404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getFoTCTLSpecAccess().getFormulasKeyword_5());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:248:1: ( (lv_formulas_18_0= ruleFoTCTLFormula ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_NODE_PREDICATE_NAME && LA7_0<=RULE_EDGE_PREDICATE_NAME)||LA7_0==23||LA7_0==26||(LA7_0>=29 && LA7_0<=30)||(LA7_0>=41 && LA7_0<=46)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:249:1: (lv_formulas_18_0= ruleFoTCTLFormula )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:249:1: (lv_formulas_18_0= ruleFoTCTLFormula )
            	    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:250:3: lv_formulas_18_0= ruleFoTCTLFormula
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFoTCTLSpecAccess().getFormulasFoTCTLFormulaParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFoTCTLFormula_in_ruleFoTCTLSpec425);
            	    lv_formulas_18_0=ruleFoTCTLFormula();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFoTCTLSpecRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"formulas",
            	              		lv_formulas_18_0, 
            	              		"FoTCTLFormula");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFoTCTLSpec"


    // $ANTLR start "entryRuleFoTCTLFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:274:1: entryRuleFoTCTLFormula returns [EObject current=null] : iv_ruleFoTCTLFormula= ruleFoTCTLFormula EOF ;
    public final EObject entryRuleFoTCTLFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoTCTLFormula = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:275:2: (iv_ruleFoTCTLFormula= ruleFoTCTLFormula EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:276:2: iv_ruleFoTCTLFormula= ruleFoTCTLFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFoTCTLFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFoTCTLFormula_in_entryRuleFoTCTLFormula462);
            iv_ruleFoTCTLFormula=ruleFoTCTLFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFoTCTLFormula; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFoTCTLFormula472); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFoTCTLFormula"


    // $ANTLR start "ruleFoTCTLFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:283:1: ruleFoTCTLFormula returns [EObject current=null] : ( () ( (lv_formula_1_0= ruleFormulaDefinition ) ) otherlv_2= ';\\n' ) ;
    public final EObject ruleFoTCTLFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_formula_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:286:28: ( ( () ( (lv_formula_1_0= ruleFormulaDefinition ) ) otherlv_2= ';\\n' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:287:1: ( () ( (lv_formula_1_0= ruleFormulaDefinition ) ) otherlv_2= ';\\n' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:287:1: ( () ( (lv_formula_1_0= ruleFormulaDefinition ) ) otherlv_2= ';\\n' )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:287:2: () ( (lv_formula_1_0= ruleFormulaDefinition ) ) otherlv_2= ';\\n'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:287:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:288:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFoTCTLFormulaAccess().getFoTCTLFormulaAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:296:2: ( (lv_formula_1_0= ruleFormulaDefinition ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:297:1: (lv_formula_1_0= ruleFormulaDefinition )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:297:1: (lv_formula_1_0= ruleFormulaDefinition )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:298:3: lv_formula_1_0= ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFoTCTLFormulaAccess().getFormulaFormulaDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormulaDefinition_in_ruleFoTCTLFormula530);
            lv_formula_1_0=ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFoTCTLFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"formula",
                      		lv_formula_1_0, 
                      		"FormulaDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFoTCTLFormula542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFoTCTLFormulaAccess().getSemicolonControl000aKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFoTCTLFormula"


    // $ANTLR start "entryRuleFormulaDefinition"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:326:1: entryRuleFormulaDefinition returns [EObject current=null] : iv_ruleFormulaDefinition= ruleFormulaDefinition EOF ;
    public final EObject entryRuleFormulaDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaDefinition = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:327:2: (iv_ruleFormulaDefinition= ruleFormulaDefinition EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:328:2: iv_ruleFormulaDefinition= ruleFormulaDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormulaDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormulaDefinition_in_entryRuleFormulaDefinition578);
            iv_ruleFormulaDefinition=ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormulaDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormulaDefinition588); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFormulaDefinition"


    // $ANTLR start "ruleFormulaDefinition"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:335:1: ruleFormulaDefinition returns [EObject current=null] : (this_AtomicFormula_0= ruleAtomicFormula | this_UnaryFormula_1= ruleUnaryFormula | this_BinaryFormula_2= ruleBinaryFormula ) ;
    public final EObject ruleFormulaDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicFormula_0 = null;

        EObject this_UnaryFormula_1 = null;

        EObject this_BinaryFormula_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:338:28: ( (this_AtomicFormula_0= ruleAtomicFormula | this_UnaryFormula_1= ruleUnaryFormula | this_BinaryFormula_2= ruleBinaryFormula ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:339:1: (this_AtomicFormula_0= ruleAtomicFormula | this_UnaryFormula_1= ruleUnaryFormula | this_BinaryFormula_2= ruleBinaryFormula )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:339:1: (this_AtomicFormula_0= ruleAtomicFormula | this_UnaryFormula_1= ruleUnaryFormula | this_BinaryFormula_2= ruleBinaryFormula )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_NODE_PREDICATE_NAME:
            case RULE_EDGE_PREDICATE_NAME:
                {
                alt8=1;
                }
                break;
            case 26:
            case 29:
            case 30:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:340:2: this_AtomicFormula_0= ruleAtomicFormula
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFormulaDefinitionAccess().getAtomicFormulaParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicFormula_in_ruleFormulaDefinition638);
                    this_AtomicFormula_0=ruleAtomicFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicFormula_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:353:2: this_UnaryFormula_1= ruleUnaryFormula
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFormulaDefinitionAccess().getUnaryFormulaParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryFormula_in_ruleFormulaDefinition668);
                    this_UnaryFormula_1=ruleUnaryFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryFormula_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:366:2: this_BinaryFormula_2= ruleBinaryFormula
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFormulaDefinitionAccess().getBinaryFormulaParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryFormula_in_ruleFormulaDefinition698);
                    this_BinaryFormula_2=ruleBinaryFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BinaryFormula_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFormulaDefinition"


    // $ANTLR start "entryRuleNodeLabelPredicateDecl"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:385:1: entryRuleNodeLabelPredicateDecl returns [EObject current=null] : iv_ruleNodeLabelPredicateDecl= ruleNodeLabelPredicateDecl EOF ;
    public final EObject entryRuleNodeLabelPredicateDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeLabelPredicateDecl = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:386:2: (iv_ruleNodeLabelPredicateDecl= ruleNodeLabelPredicateDecl EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:387:2: iv_ruleNodeLabelPredicateDecl= ruleNodeLabelPredicateDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeLabelPredicateDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNodeLabelPredicateDecl_in_entryRuleNodeLabelPredicateDecl733);
            iv_ruleNodeLabelPredicateDecl=ruleNodeLabelPredicateDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeLabelPredicateDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNodeLabelPredicateDecl743); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeLabelPredicateDecl"


    // $ANTLR start "ruleNodeLabelPredicateDecl"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:394:1: ruleNodeLabelPredicateDecl returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_NODE_PREDICATE_NAME ) ) ) ;
    public final EObject ruleNodeLabelPredicateDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:397:28: ( ( () ( (lv_name_1_0= RULE_NODE_PREDICATE_NAME ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:398:1: ( () ( (lv_name_1_0= RULE_NODE_PREDICATE_NAME ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:398:1: ( () ( (lv_name_1_0= RULE_NODE_PREDICATE_NAME ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:398:2: () ( (lv_name_1_0= RULE_NODE_PREDICATE_NAME ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:398:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:399:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeLabelPredicateDeclAccess().getNodeLabelPredicateDeclAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:407:2: ( (lv_name_1_0= RULE_NODE_PREDICATE_NAME ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:408:1: (lv_name_1_0= RULE_NODE_PREDICATE_NAME )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:408:1: (lv_name_1_0= RULE_NODE_PREDICATE_NAME )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:409:3: lv_name_1_0= RULE_NODE_PREDICATE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NODE_PREDICATE_NAME,FollowSets000.FOLLOW_RULE_NODE_PREDICATE_NAME_in_ruleNodeLabelPredicateDecl797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getNodeLabelPredicateDeclAccess().getNameNode_predicate_nameTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeLabelPredicateDeclRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"node_predicate_name");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNodeLabelPredicateDecl"


    // $ANTLR start "entryRuleEdgeLabelPredicateDecl"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:433:1: entryRuleEdgeLabelPredicateDecl returns [EObject current=null] : iv_ruleEdgeLabelPredicateDecl= ruleEdgeLabelPredicateDecl EOF ;
    public final EObject entryRuleEdgeLabelPredicateDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeLabelPredicateDecl = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:434:2: (iv_ruleEdgeLabelPredicateDecl= ruleEdgeLabelPredicateDecl EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:435:2: iv_ruleEdgeLabelPredicateDecl= ruleEdgeLabelPredicateDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeLabelPredicateDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEdgeLabelPredicateDecl_in_entryRuleEdgeLabelPredicateDecl838);
            iv_ruleEdgeLabelPredicateDecl=ruleEdgeLabelPredicateDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeLabelPredicateDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEdgeLabelPredicateDecl848); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeLabelPredicateDecl"


    // $ANTLR start "ruleEdgeLabelPredicateDecl"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:442:1: ruleEdgeLabelPredicateDecl returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_EDGE_PREDICATE_NAME ) ) ) ;
    public final EObject ruleEdgeLabelPredicateDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:445:28: ( ( () ( (lv_name_1_0= RULE_EDGE_PREDICATE_NAME ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:446:1: ( () ( (lv_name_1_0= RULE_EDGE_PREDICATE_NAME ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:446:1: ( () ( (lv_name_1_0= RULE_EDGE_PREDICATE_NAME ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:446:2: () ( (lv_name_1_0= RULE_EDGE_PREDICATE_NAME ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:446:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:447:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeLabelPredicateDeclAccess().getEdgeLabelPredicateDeclAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:455:2: ( (lv_name_1_0= RULE_EDGE_PREDICATE_NAME ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:456:1: (lv_name_1_0= RULE_EDGE_PREDICATE_NAME )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:456:1: (lv_name_1_0= RULE_EDGE_PREDICATE_NAME )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:457:3: lv_name_1_0= RULE_EDGE_PREDICATE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_EDGE_PREDICATE_NAME,FollowSets000.FOLLOW_RULE_EDGE_PREDICATE_NAME_in_ruleEdgeLabelPredicateDecl902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEdgeLabelPredicateDeclAccess().getNameEdge_predicate_nameTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeLabelPredicateDeclRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"edge_predicate_name");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEdgeLabelPredicateDecl"


    // $ANTLR start "entryRuleConstantSymbolDecl"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:481:1: entryRuleConstantSymbolDecl returns [EObject current=null] : iv_ruleConstantSymbolDecl= ruleConstantSymbolDecl EOF ;
    public final EObject entryRuleConstantSymbolDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantSymbolDecl = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:482:2: (iv_ruleConstantSymbolDecl= ruleConstantSymbolDecl EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:483:2: iv_ruleConstantSymbolDecl= ruleConstantSymbolDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantSymbolDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantSymbolDecl_in_entryRuleConstantSymbolDecl943);
            iv_ruleConstantSymbolDecl=ruleConstantSymbolDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantSymbolDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantSymbolDecl953); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantSymbolDecl"


    // $ANTLR start "ruleConstantSymbolDecl"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:490:1: ruleConstantSymbolDecl returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_CONSTANT_NAME ) ) ) ;
    public final EObject ruleConstantSymbolDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:493:28: ( ( () ( (lv_name_1_0= RULE_CONSTANT_NAME ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:494:1: ( () ( (lv_name_1_0= RULE_CONSTANT_NAME ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:494:1: ( () ( (lv_name_1_0= RULE_CONSTANT_NAME ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:494:2: () ( (lv_name_1_0= RULE_CONSTANT_NAME ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:494:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:495:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstantSymbolDeclAccess().getConstantSymbolDeclAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:503:2: ( (lv_name_1_0= RULE_CONSTANT_NAME ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:504:1: (lv_name_1_0= RULE_CONSTANT_NAME )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:504:1: (lv_name_1_0= RULE_CONSTANT_NAME )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:505:3: lv_name_1_0= RULE_CONSTANT_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT_NAME,FollowSets000.FOLLOW_RULE_CONSTANT_NAME_in_ruleConstantSymbolDecl1007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantSymbolDeclAccess().getNameConstant_nameTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantSymbolDeclRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"constant_name");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstantSymbolDecl"


    // $ANTLR start "entryRuleConstant"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:529:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:530:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:531:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstant_in_entryRuleConstant1048);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstant1058); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:538:1: ruleConstant returns [EObject current=null] : ( () ( (otherlv_1= RULE_CONSTANT_NAME ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:541:28: ( ( () ( (otherlv_1= RULE_CONSTANT_NAME ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:542:1: ( () ( (otherlv_1= RULE_CONSTANT_NAME ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:542:1: ( () ( (otherlv_1= RULE_CONSTANT_NAME ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:542:2: () ( (otherlv_1= RULE_CONSTANT_NAME ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:542:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:543:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConstantAccess().getConstantAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:551:2: ( (otherlv_1= RULE_CONSTANT_NAME ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:552:1: (otherlv_1= RULE_CONSTANT_NAME )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:552:1: (otherlv_1= RULE_CONSTANT_NAME )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:553:3: otherlv_1= RULE_CONSTANT_NAME
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_CONSTANT_NAME,FollowSets000.FOLLOW_RULE_CONSTANT_NAME_in_ruleConstant1119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getDeclarationConstantSymbolDeclCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVariable"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:575:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:576:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:577:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable1155);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable1165); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:584:1: ruleVariable returns [EObject current=null] : ( () ( (otherlv_1= RULE_VARIABLE_NAME ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:587:28: ( ( () ( (otherlv_1= RULE_VARIABLE_NAME ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:588:1: ( () ( (otherlv_1= RULE_VARIABLE_NAME ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:588:1: ( () ( (otherlv_1= RULE_VARIABLE_NAME ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:588:2: () ( (otherlv_1= RULE_VARIABLE_NAME ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:588:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:589:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableAccess().getVariableAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:597:2: ( (otherlv_1= RULE_VARIABLE_NAME ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:598:1: (otherlv_1= RULE_VARIABLE_NAME )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:598:1: (otherlv_1= RULE_VARIABLE_NAME )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:599:3: otherlv_1= RULE_VARIABLE_NAME
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_VARIABLE_NAME,FollowSets000.FOLLOW_RULE_VARIABLE_NAME_in_ruleVariable1226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getDeclarationQuantifiedFormulaCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleUnaryFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:621:1: entryRuleUnaryFormula returns [EObject current=null] : iv_ruleUnaryFormula= ruleUnaryFormula EOF ;
    public final EObject entryRuleUnaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryFormula = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:622:2: (iv_ruleUnaryFormula= ruleUnaryFormula EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:623:2: iv_ruleUnaryFormula= ruleUnaryFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryFormula_in_entryRuleUnaryFormula1262);
            iv_ruleUnaryFormula=ruleUnaryFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryFormula; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryFormula1272); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryFormula"


    // $ANTLR start "ruleUnaryFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:630:1: ruleUnaryFormula returns [EObject current=null] : (this_NotFormula_0= ruleNotFormula | this_UnaryTemporalFormula_1= ruleUnaryTemporalFormula | this_QuantifiedFormula_2= ruleQuantifiedFormula ) ;
    public final EObject ruleUnaryFormula() throws RecognitionException {
        EObject current = null;

        EObject this_NotFormula_0 = null;

        EObject this_UnaryTemporalFormula_1 = null;

        EObject this_QuantifiedFormula_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:633:28: ( (this_NotFormula_0= ruleNotFormula | this_UnaryTemporalFormula_1= ruleUnaryTemporalFormula | this_QuantifiedFormula_2= ruleQuantifiedFormula ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:634:1: (this_NotFormula_0= ruleNotFormula | this_UnaryTemporalFormula_1= ruleUnaryTemporalFormula | this_QuantifiedFormula_2= ruleQuantifiedFormula )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:634:1: (this_NotFormula_0= ruleNotFormula | this_UnaryTemporalFormula_1= ruleUnaryTemporalFormula | this_QuantifiedFormula_2= ruleQuantifiedFormula )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt9=2;
                }
                break;
            case 29:
            case 30:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:635:2: this_NotFormula_0= ruleNotFormula
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryFormulaAccess().getNotFormulaParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotFormula_in_ruleUnaryFormula1322);
                    this_NotFormula_0=ruleNotFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotFormula_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:648:2: this_UnaryTemporalFormula_1= ruleUnaryTemporalFormula
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryFormulaAccess().getUnaryTemporalFormulaParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryTemporalFormula_in_ruleUnaryFormula1352);
                    this_UnaryTemporalFormula_1=ruleUnaryTemporalFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnaryTemporalFormula_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:661:2: this_QuantifiedFormula_2= ruleQuantifiedFormula
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryFormulaAccess().getQuantifiedFormulaParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQuantifiedFormula_in_ruleUnaryFormula1382);
                    this_QuantifiedFormula_2=ruleQuantifiedFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_QuantifiedFormula_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnaryFormula"


    // $ANTLR start "entryRuleBinaryFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:680:1: entryRuleBinaryFormula returns [EObject current=null] : iv_ruleBinaryFormula= ruleBinaryFormula EOF ;
    public final EObject entryRuleBinaryFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryFormula = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:681:2: (iv_ruleBinaryFormula= ruleBinaryFormula EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:682:2: iv_ruleBinaryFormula= ruleBinaryFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryFormula_in_entryRuleBinaryFormula1417);
            iv_ruleBinaryFormula=ruleBinaryFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryFormula; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryFormula1427); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryFormula"


    // $ANTLR start "ruleBinaryFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:689:1: ruleBinaryFormula returns [EObject current=null] : (this_BinaryLogicFormula_0= ruleBinaryLogicFormula | this_BinaryTemporalFormula_1= ruleBinaryTemporalFormula ) ;
    public final EObject ruleBinaryFormula() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryLogicFormula_0 = null;

        EObject this_BinaryTemporalFormula_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:692:28: ( (this_BinaryLogicFormula_0= ruleBinaryLogicFormula | this_BinaryTemporalFormula_1= ruleBinaryTemporalFormula ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:693:1: (this_BinaryLogicFormula_0= ruleBinaryLogicFormula | this_BinaryTemporalFormula_1= ruleBinaryTemporalFormula )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:693:1: (this_BinaryLogicFormula_0= ruleBinaryLogicFormula | this_BinaryTemporalFormula_1= ruleBinaryTemporalFormula )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred12_InternalFOTCTL()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:694:2: this_BinaryLogicFormula_0= ruleBinaryLogicFormula
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryFormulaAccess().getBinaryLogicFormulaParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicFormula_in_ruleBinaryFormula1477);
                    this_BinaryLogicFormula_0=ruleBinaryLogicFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BinaryLogicFormula_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:707:2: this_BinaryTemporalFormula_1= ruleBinaryTemporalFormula
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryFormulaAccess().getBinaryTemporalFormulaParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryTemporalFormula_in_ruleBinaryFormula1507);
                    this_BinaryTemporalFormula_1=ruleBinaryTemporalFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BinaryTemporalFormula_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBinaryFormula"


    // $ANTLR start "entryRuleAtomicFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:726:1: entryRuleAtomicFormula returns [EObject current=null] : iv_ruleAtomicFormula= ruleAtomicFormula EOF ;
    public final EObject entryRuleAtomicFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicFormula = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:727:2: (iv_ruleAtomicFormula= ruleAtomicFormula EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:728:2: iv_ruleAtomicFormula= ruleAtomicFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicFormula_in_entryRuleAtomicFormula1542);
            iv_ruleAtomicFormula=ruleAtomicFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicFormula; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicFormula1552); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicFormula"


    // $ANTLR start "ruleAtomicFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:735:1: ruleAtomicFormula returns [EObject current=null] : (this_NodeLabelPredicate_0= ruleNodeLabelPredicate | this_EdgeLabelPredicate_1= ruleEdgeLabelPredicate ) ;
    public final EObject ruleAtomicFormula() throws RecognitionException {
        EObject current = null;

        EObject this_NodeLabelPredicate_0 = null;

        EObject this_EdgeLabelPredicate_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:738:28: ( (this_NodeLabelPredicate_0= ruleNodeLabelPredicate | this_EdgeLabelPredicate_1= ruleEdgeLabelPredicate ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:739:1: (this_NodeLabelPredicate_0= ruleNodeLabelPredicate | this_EdgeLabelPredicate_1= ruleEdgeLabelPredicate )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:739:1: (this_NodeLabelPredicate_0= ruleNodeLabelPredicate | this_EdgeLabelPredicate_1= ruleEdgeLabelPredicate )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_NODE_PREDICATE_NAME) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_EDGE_PREDICATE_NAME) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:740:2: this_NodeLabelPredicate_0= ruleNodeLabelPredicate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicFormulaAccess().getNodeLabelPredicateParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNodeLabelPredicate_in_ruleAtomicFormula1602);
                    this_NodeLabelPredicate_0=ruleNodeLabelPredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NodeLabelPredicate_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:753:2: this_EdgeLabelPredicate_1= ruleEdgeLabelPredicate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicFormulaAccess().getEdgeLabelPredicateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEdgeLabelPredicate_in_ruleAtomicFormula1632);
                    this_EdgeLabelPredicate_1=ruleEdgeLabelPredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EdgeLabelPredicate_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtomicFormula"


    // $ANTLR start "entryRuleNodeLabelPredicate"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:772:1: entryRuleNodeLabelPredicate returns [EObject current=null] : iv_ruleNodeLabelPredicate= ruleNodeLabelPredicate EOF ;
    public final EObject entryRuleNodeLabelPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeLabelPredicate = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:773:2: (iv_ruleNodeLabelPredicate= ruleNodeLabelPredicate EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:774:2: iv_ruleNodeLabelPredicate= ruleNodeLabelPredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeLabelPredicateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNodeLabelPredicate_in_entryRuleNodeLabelPredicate1667);
            iv_ruleNodeLabelPredicate=ruleNodeLabelPredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeLabelPredicate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNodeLabelPredicate1677); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeLabelPredicate"


    // $ANTLR start "ruleNodeLabelPredicate"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:781:1: ruleNodeLabelPredicate returns [EObject current=null] : ( () ( (otherlv_1= RULE_NODE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ')' ) ;
    public final EObject ruleNodeLabelPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_term_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:784:28: ( ( () ( (otherlv_1= RULE_NODE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:785:1: ( () ( (otherlv_1= RULE_NODE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:785:1: ( () ( (otherlv_1= RULE_NODE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:785:2: () ( (otherlv_1= RULE_NODE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ')'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:785:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:786:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNodeLabelPredicateAccess().getNodeLabelPredicateAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:794:2: ( (otherlv_1= RULE_NODE_PREDICATE_NAME ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:795:1: (otherlv_1= RULE_NODE_PREDICATE_NAME )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:795:1: (otherlv_1= RULE_NODE_PREDICATE_NAME )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:796:3: otherlv_1= RULE_NODE_PREDICATE_NAME
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeLabelPredicateRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_NODE_PREDICATE_NAME,FollowSets000.FOLLOW_RULE_NODE_PREDICATE_NAME_in_ruleNodeLabelPredicate1738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getNodeLabelPredicateAccess().getDeclarationNodeLabelPredicateDeclCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNodeLabelPredicate1750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNodeLabelPredicateAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:814:1: ( (lv_term_3_0= ruleTerm ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:815:1: (lv_term_3_0= ruleTerm )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:815:1: (lv_term_3_0= ruleTerm )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:816:3: lv_term_3_0= ruleTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeLabelPredicateAccess().getTermTermParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleNodeLabelPredicate1771);
            lv_term_3_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeLabelPredicateRule());
              	        }
                     		set(
                     			current, 
                     			"term",
                      		lv_term_3_0, 
                      		"Term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNodeLabelPredicate1783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNodeLabelPredicateAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNodeLabelPredicate"


    // $ANTLR start "entryRuleEdgeLabelPredicate"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:844:1: entryRuleEdgeLabelPredicate returns [EObject current=null] : iv_ruleEdgeLabelPredicate= ruleEdgeLabelPredicate EOF ;
    public final EObject entryRuleEdgeLabelPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeLabelPredicate = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:845:2: (iv_ruleEdgeLabelPredicate= ruleEdgeLabelPredicate EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:846:2: iv_ruleEdgeLabelPredicate= ruleEdgeLabelPredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeLabelPredicateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEdgeLabelPredicate_in_entryRuleEdgeLabelPredicate1819);
            iv_ruleEdgeLabelPredicate=ruleEdgeLabelPredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeLabelPredicate; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEdgeLabelPredicate1829); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeLabelPredicate"


    // $ANTLR start "ruleEdgeLabelPredicate"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:853:1: ruleEdgeLabelPredicate returns [EObject current=null] : ( () ( (otherlv_1= RULE_EDGE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_secondTerm_5_0= ruleTerm ) ) otherlv_6= ')' ) ;
    public final EObject ruleEdgeLabelPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_term_3_0 = null;

        EObject lv_secondTerm_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:856:28: ( ( () ( (otherlv_1= RULE_EDGE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_secondTerm_5_0= ruleTerm ) ) otherlv_6= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:857:1: ( () ( (otherlv_1= RULE_EDGE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_secondTerm_5_0= ruleTerm ) ) otherlv_6= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:857:1: ( () ( (otherlv_1= RULE_EDGE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_secondTerm_5_0= ruleTerm ) ) otherlv_6= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:857:2: () ( (otherlv_1= RULE_EDGE_PREDICATE_NAME ) ) otherlv_2= '(' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ',' ( (lv_secondTerm_5_0= ruleTerm ) ) otherlv_6= ')'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:857:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:858:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEdgeLabelPredicateAccess().getEdgeLabelPredicateAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:866:2: ( (otherlv_1= RULE_EDGE_PREDICATE_NAME ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:867:1: (otherlv_1= RULE_EDGE_PREDICATE_NAME )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:867:1: (otherlv_1= RULE_EDGE_PREDICATE_NAME )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:868:3: otherlv_1= RULE_EDGE_PREDICATE_NAME
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEdgeLabelPredicateRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_EDGE_PREDICATE_NAME,FollowSets000.FOLLOW_RULE_EDGE_PREDICATE_NAME_in_ruleEdgeLabelPredicate1890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEdgeLabelPredicateAccess().getDeclarationEdgeLabelPredicateDeclCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEdgeLabelPredicate1902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEdgeLabelPredicateAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:886:1: ( (lv_term_3_0= ruleTerm ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:887:1: (lv_term_3_0= ruleTerm )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:887:1: (lv_term_3_0= ruleTerm )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:888:3: lv_term_3_0= ruleTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeLabelPredicateAccess().getTermTermParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleEdgeLabelPredicate1923);
            lv_term_3_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeLabelPredicateRule());
              	        }
                     		set(
                     			current, 
                     			"term",
                      		lv_term_3_0, 
                      		"Term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEdgeLabelPredicate1935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEdgeLabelPredicateAccess().getCommaKeyword_4());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:908:1: ( (lv_secondTerm_5_0= ruleTerm ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:909:1: (lv_secondTerm_5_0= ruleTerm )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:909:1: (lv_secondTerm_5_0= ruleTerm )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:910:3: lv_secondTerm_5_0= ruleTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeLabelPredicateAccess().getSecondTermTermParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleEdgeLabelPredicate1956);
            lv_secondTerm_5_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeLabelPredicateRule());
              	        }
                     		set(
                     			current, 
                     			"secondTerm",
                      		lv_secondTerm_5_0, 
                      		"Term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEdgeLabelPredicate1968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEdgeLabelPredicateAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEdgeLabelPredicate"


    // $ANTLR start "entryRuleQuantifiedFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:938:1: entryRuleQuantifiedFormula returns [EObject current=null] : iv_ruleQuantifiedFormula= ruleQuantifiedFormula EOF ;
    public final EObject entryRuleQuantifiedFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedFormula = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:939:2: (iv_ruleQuantifiedFormula= ruleQuantifiedFormula EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:940:2: iv_ruleQuantifiedFormula= ruleQuantifiedFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantifiedFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQuantifiedFormula_in_entryRuleQuantifiedFormula2004);
            iv_ruleQuantifiedFormula=ruleQuantifiedFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantifiedFormula; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuantifiedFormula2014); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuantifiedFormula"


    // $ANTLR start "ruleQuantifiedFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:947:1: ruleQuantifiedFormula returns [EObject current=null] : ( () ( (lv_quantifier_1_0= ruleQuantifier ) ) otherlv_2= ' ' ( (lv_name_3_0= RULE_VARIABLE_NAME ) ) otherlv_4= ' ' ( (lv_subformula_5_0= ruleFormulaDefinition ) ) ) ;
    public final EObject ruleQuantifiedFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_quantifier_1_0 = null;

        EObject lv_subformula_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:950:28: ( ( () ( (lv_quantifier_1_0= ruleQuantifier ) ) otherlv_2= ' ' ( (lv_name_3_0= RULE_VARIABLE_NAME ) ) otherlv_4= ' ' ( (lv_subformula_5_0= ruleFormulaDefinition ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:951:1: ( () ( (lv_quantifier_1_0= ruleQuantifier ) ) otherlv_2= ' ' ( (lv_name_3_0= RULE_VARIABLE_NAME ) ) otherlv_4= ' ' ( (lv_subformula_5_0= ruleFormulaDefinition ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:951:1: ( () ( (lv_quantifier_1_0= ruleQuantifier ) ) otherlv_2= ' ' ( (lv_name_3_0= RULE_VARIABLE_NAME ) ) otherlv_4= ' ' ( (lv_subformula_5_0= ruleFormulaDefinition ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:951:2: () ( (lv_quantifier_1_0= ruleQuantifier ) ) otherlv_2= ' ' ( (lv_name_3_0= RULE_VARIABLE_NAME ) ) otherlv_4= ' ' ( (lv_subformula_5_0= ruleFormulaDefinition ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:951:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:952:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getQuantifiedFormulaAccess().getQuantifiedFormulaAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:960:2: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:961:1: (lv_quantifier_1_0= ruleQuantifier )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:961:1: (lv_quantifier_1_0= ruleQuantifier )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:962:3: lv_quantifier_1_0= ruleQuantifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuantifiedFormulaAccess().getQuantifierQuantifierEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQuantifier_in_ruleQuantifiedFormula2072);
            lv_quantifier_1_0=ruleQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuantifiedFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"quantifier",
                      		lv_quantifier_1_0, 
                      		"Quantifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleQuantifiedFormula2084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuantifiedFormulaAccess().getSpaceKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:982:1: ( (lv_name_3_0= RULE_VARIABLE_NAME ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:983:1: (lv_name_3_0= RULE_VARIABLE_NAME )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:983:1: (lv_name_3_0= RULE_VARIABLE_NAME )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:984:3: lv_name_3_0= RULE_VARIABLE_NAME
            {
            lv_name_3_0=(Token)match(input,RULE_VARIABLE_NAME,FollowSets000.FOLLOW_RULE_VARIABLE_NAME_in_ruleQuantifiedFormula2101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getQuantifiedFormulaAccess().getNameVariable_nameTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuantifiedFormulaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"variable_name");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleQuantifiedFormula2118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuantifiedFormulaAccess().getSpaceKeyword_4());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1004:1: ( (lv_subformula_5_0= ruleFormulaDefinition ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1005:1: (lv_subformula_5_0= ruleFormulaDefinition )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1005:1: (lv_subformula_5_0= ruleFormulaDefinition )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1006:3: lv_subformula_5_0= ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuantifiedFormulaAccess().getSubformulaFormulaDefinitionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormulaDefinition_in_ruleQuantifiedFormula2139);
            lv_subformula_5_0=ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuantifiedFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"subformula",
                      		lv_subformula_5_0, 
                      		"FormulaDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQuantifiedFormula"


    // $ANTLR start "entryRuleNotFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1032:1: entryRuleNotFormula returns [EObject current=null] : iv_ruleNotFormula= ruleNotFormula EOF ;
    public final EObject entryRuleNotFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotFormula = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1033:2: (iv_ruleNotFormula= ruleNotFormula EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1034:2: iv_ruleNotFormula= ruleNotFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotFormula_in_entryRuleNotFormula2177);
            iv_ruleNotFormula=ruleNotFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotFormula; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotFormula2187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotFormula"


    // $ANTLR start "ruleNotFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1041:1: ruleNotFormula returns [EObject current=null] : (otherlv_0= 'NOT ' () ( (lv_subformula_2_0= ruleFormulaDefinition ) ) ) ;
    public final EObject ruleNotFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_subformula_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1044:28: ( (otherlv_0= 'NOT ' () ( (lv_subformula_2_0= ruleFormulaDefinition ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1045:1: (otherlv_0= 'NOT ' () ( (lv_subformula_2_0= ruleFormulaDefinition ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1045:1: (otherlv_0= 'NOT ' () ( (lv_subformula_2_0= ruleFormulaDefinition ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1045:3: otherlv_0= 'NOT ' () ( (lv_subformula_2_0= ruleFormulaDefinition ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNotFormula2224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNotFormulaAccess().getNOTKeyword_0());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1049:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1050:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotFormulaAccess().getNotFormulaAction_1(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1058:2: ( (lv_subformula_2_0= ruleFormulaDefinition ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1059:1: (lv_subformula_2_0= ruleFormulaDefinition )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1059:1: (lv_subformula_2_0= ruleFormulaDefinition )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1060:3: lv_subformula_2_0= ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotFormulaAccess().getSubformulaFormulaDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormulaDefinition_in_ruleNotFormula2257);
            lv_subformula_2_0=ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"subformula",
                      		lv_subformula_2_0, 
                      		"FormulaDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotFormula"


    // $ANTLR start "entryRuleUnaryTemporalFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1086:1: entryRuleUnaryTemporalFormula returns [EObject current=null] : iv_ruleUnaryTemporalFormula= ruleUnaryTemporalFormula EOF ;
    public final EObject entryRuleUnaryTemporalFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryTemporalFormula = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1087:2: (iv_ruleUnaryTemporalFormula= ruleUnaryTemporalFormula EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1088:2: iv_ruleUnaryTemporalFormula= ruleUnaryTemporalFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryTemporalFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryTemporalFormula_in_entryRuleUnaryTemporalFormula2295);
            iv_ruleUnaryTemporalFormula=ruleUnaryTemporalFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryTemporalFormula; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryTemporalFormula2305); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryTemporalFormula"


    // $ANTLR start "ruleUnaryTemporalFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1095:1: ruleUnaryTemporalFormula returns [EObject current=null] : ( () ( (lv_temporalOperator_1_0= ruleTemporalOperator ) ) otherlv_2= '[' ( (lv_comparisonOperator_3_0= ruleComparisonOperator ) ) ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '] ' ( (lv_subformula_6_0= ruleFormulaDefinition ) ) ) ;
    public final EObject ruleUnaryTemporalFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_temporalOperator_1_0 = null;

        Enumerator lv_comparisonOperator_3_0 = null;

        EObject lv_subformula_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1098:28: ( ( () ( (lv_temporalOperator_1_0= ruleTemporalOperator ) ) otherlv_2= '[' ( (lv_comparisonOperator_3_0= ruleComparisonOperator ) ) ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '] ' ( (lv_subformula_6_0= ruleFormulaDefinition ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1099:1: ( () ( (lv_temporalOperator_1_0= ruleTemporalOperator ) ) otherlv_2= '[' ( (lv_comparisonOperator_3_0= ruleComparisonOperator ) ) ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '] ' ( (lv_subformula_6_0= ruleFormulaDefinition ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1099:1: ( () ( (lv_temporalOperator_1_0= ruleTemporalOperator ) ) otherlv_2= '[' ( (lv_comparisonOperator_3_0= ruleComparisonOperator ) ) ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '] ' ( (lv_subformula_6_0= ruleFormulaDefinition ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1099:2: () ( (lv_temporalOperator_1_0= ruleTemporalOperator ) ) otherlv_2= '[' ( (lv_comparisonOperator_3_0= ruleComparisonOperator ) ) ( (lv_value_4_0= RULE_INT ) ) otherlv_5= '] ' ( (lv_subformula_6_0= ruleFormulaDefinition ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1099:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1100:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnaryTemporalFormulaAccess().getUnaryTemporalFormulaAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1108:2: ( (lv_temporalOperator_1_0= ruleTemporalOperator ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1109:1: (lv_temporalOperator_1_0= ruleTemporalOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1109:1: (lv_temporalOperator_1_0= ruleTemporalOperator )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1110:3: lv_temporalOperator_1_0= ruleTemporalOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryTemporalFormulaAccess().getTemporalOperatorTemporalOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemporalOperator_in_ruleUnaryTemporalFormula2363);
            lv_temporalOperator_1_0=ruleTemporalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryTemporalFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"temporalOperator",
                      		lv_temporalOperator_1_0, 
                      		"TemporalOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleUnaryTemporalFormula2375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUnaryTemporalFormulaAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1130:1: ( (lv_comparisonOperator_3_0= ruleComparisonOperator ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1131:1: (lv_comparisonOperator_3_0= ruleComparisonOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1131:1: (lv_comparisonOperator_3_0= ruleComparisonOperator )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1132:3: lv_comparisonOperator_3_0= ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryTemporalFormulaAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisonOperator_in_ruleUnaryTemporalFormula2396);
            lv_comparisonOperator_3_0=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryTemporalFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"comparisonOperator",
                      		lv_comparisonOperator_3_0, 
                      		"ComparisonOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1148:2: ( (lv_value_4_0= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1149:1: (lv_value_4_0= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1149:1: (lv_value_4_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1150:3: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUnaryTemporalFormula2413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_4_0, grammarAccess.getUnaryTemporalFormulaAccess().getValueINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUnaryTemporalFormulaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleUnaryTemporalFormula2430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUnaryTemporalFormulaAccess().getRightSquareBracketSpaceKeyword_5());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1170:1: ( (lv_subformula_6_0= ruleFormulaDefinition ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1171:1: (lv_subformula_6_0= ruleFormulaDefinition )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1171:1: (lv_subformula_6_0= ruleFormulaDefinition )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1172:3: lv_subformula_6_0= ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryTemporalFormulaAccess().getSubformulaFormulaDefinitionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormulaDefinition_in_ruleUnaryTemporalFormula2451);
            lv_subformula_6_0=ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryTemporalFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"subformula",
                      		lv_subformula_6_0, 
                      		"FormulaDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnaryTemporalFormula"


    // $ANTLR start "entryRuleBinaryTemporalFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1196:1: entryRuleBinaryTemporalFormula returns [EObject current=null] : iv_ruleBinaryTemporalFormula= ruleBinaryTemporalFormula EOF ;
    public final EObject entryRuleBinaryTemporalFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryTemporalFormula = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1197:2: (iv_ruleBinaryTemporalFormula= ruleBinaryTemporalFormula EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1198:2: iv_ruleBinaryTemporalFormula= ruleBinaryTemporalFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryTemporalFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryTemporalFormula_in_entryRuleBinaryTemporalFormula2487);
            iv_ruleBinaryTemporalFormula=ruleBinaryTemporalFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryTemporalFormula; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryTemporalFormula2497); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryTemporalFormula"


    // $ANTLR start "ruleBinaryTemporalFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1205:1: ruleBinaryTemporalFormula returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) otherlv_3= ' ' ( (lv_temporalOperator_4_0= ruleTemporalOperator ) ) otherlv_5= '[' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '] ' ( (lv_rightSubformula_9_0= ruleFormulaDefinition ) ) otherlv_10= ')' ) ;
    public final EObject ruleBinaryTemporalFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_leftSubformula_2_0 = null;

        Enumerator lv_temporalOperator_4_0 = null;

        Enumerator lv_comparisonOperator_6_0 = null;

        EObject lv_rightSubformula_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1208:28: ( ( () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) otherlv_3= ' ' ( (lv_temporalOperator_4_0= ruleTemporalOperator ) ) otherlv_5= '[' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '] ' ( (lv_rightSubformula_9_0= ruleFormulaDefinition ) ) otherlv_10= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1209:1: ( () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) otherlv_3= ' ' ( (lv_temporalOperator_4_0= ruleTemporalOperator ) ) otherlv_5= '[' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '] ' ( (lv_rightSubformula_9_0= ruleFormulaDefinition ) ) otherlv_10= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1209:1: ( () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) otherlv_3= ' ' ( (lv_temporalOperator_4_0= ruleTemporalOperator ) ) otherlv_5= '[' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '] ' ( (lv_rightSubformula_9_0= ruleFormulaDefinition ) ) otherlv_10= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1209:2: () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) otherlv_3= ' ' ( (lv_temporalOperator_4_0= ruleTemporalOperator ) ) otherlv_5= '[' ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) ) ( (lv_value_7_0= RULE_INT ) ) otherlv_8= '] ' ( (lv_rightSubformula_9_0= ruleFormulaDefinition ) ) otherlv_10= ')'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1209:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1210:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBinaryTemporalFormulaAccess().getBinaryTemporalFormulaAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBinaryTemporalFormula2546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBinaryTemporalFormulaAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1222:1: ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1223:1: (lv_leftSubformula_2_0= ruleFormulaDefinition )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1223:1: (lv_leftSubformula_2_0= ruleFormulaDefinition )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1224:3: lv_leftSubformula_2_0= ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinaryTemporalFormulaAccess().getLeftSubformulaFormulaDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormulaDefinition_in_ruleBinaryTemporalFormula2567);
            lv_leftSubformula_2_0=ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBinaryTemporalFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"leftSubformula",
                      		lv_leftSubformula_2_0, 
                      		"FormulaDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBinaryTemporalFormula2579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBinaryTemporalFormulaAccess().getSpaceKeyword_3());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1244:1: ( (lv_temporalOperator_4_0= ruleTemporalOperator ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1245:1: (lv_temporalOperator_4_0= ruleTemporalOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1245:1: (lv_temporalOperator_4_0= ruleTemporalOperator )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1246:3: lv_temporalOperator_4_0= ruleTemporalOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinaryTemporalFormulaAccess().getTemporalOperatorTemporalOperatorEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemporalOperator_in_ruleBinaryTemporalFormula2600);
            lv_temporalOperator_4_0=ruleTemporalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBinaryTemporalFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"temporalOperator",
                      		lv_temporalOperator_4_0, 
                      		"TemporalOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBinaryTemporalFormula2612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBinaryTemporalFormulaAccess().getLeftSquareBracketKeyword_5());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1266:1: ( (lv_comparisonOperator_6_0= ruleComparisonOperator ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1267:1: (lv_comparisonOperator_6_0= ruleComparisonOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1267:1: (lv_comparisonOperator_6_0= ruleComparisonOperator )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1268:3: lv_comparisonOperator_6_0= ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinaryTemporalFormulaAccess().getComparisonOperatorComparisonOperatorEnumRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisonOperator_in_ruleBinaryTemporalFormula2633);
            lv_comparisonOperator_6_0=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBinaryTemporalFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"comparisonOperator",
                      		lv_comparisonOperator_6_0, 
                      		"ComparisonOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1284:2: ( (lv_value_7_0= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1285:1: (lv_value_7_0= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1285:1: (lv_value_7_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1286:3: lv_value_7_0= RULE_INT
            {
            lv_value_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleBinaryTemporalFormula2650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_7_0, grammarAccess.getBinaryTemporalFormulaAccess().getValueINTTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBinaryTemporalFormulaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_7_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleBinaryTemporalFormula2667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getBinaryTemporalFormulaAccess().getRightSquareBracketSpaceKeyword_8());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1306:1: ( (lv_rightSubformula_9_0= ruleFormulaDefinition ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1307:1: (lv_rightSubformula_9_0= ruleFormulaDefinition )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1307:1: (lv_rightSubformula_9_0= ruleFormulaDefinition )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1308:3: lv_rightSubformula_9_0= ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinaryTemporalFormulaAccess().getRightSubformulaFormulaDefinitionParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormulaDefinition_in_ruleBinaryTemporalFormula2688);
            lv_rightSubformula_9_0=ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBinaryTemporalFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"rightSubformula",
                      		lv_rightSubformula_9_0, 
                      		"FormulaDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBinaryTemporalFormula2700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getBinaryTemporalFormulaAccess().getRightParenthesisKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBinaryTemporalFormula"


    // $ANTLR start "entryRuleBinaryLogicFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1336:1: entryRuleBinaryLogicFormula returns [EObject current=null] : iv_ruleBinaryLogicFormula= ruleBinaryLogicFormula EOF ;
    public final EObject entryRuleBinaryLogicFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryLogicFormula = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1337:2: (iv_ruleBinaryLogicFormula= ruleBinaryLogicFormula EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1338:2: iv_ruleBinaryLogicFormula= ruleBinaryLogicFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryLogicFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicFormula_in_entryRuleBinaryLogicFormula2736);
            iv_ruleBinaryLogicFormula=ruleBinaryLogicFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryLogicFormula; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryLogicFormula2746); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryLogicFormula"


    // $ANTLR start "ruleBinaryLogicFormula"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1345:1: ruleBinaryLogicFormula returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) ( (lv_operator_3_0= ruleBinaryLogicOperator ) ) ( (lv_rightSubformula_4_0= ruleFormulaDefinition ) ) otherlv_5= ')' ) ;
    public final EObject ruleBinaryLogicFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_leftSubformula_2_0 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightSubformula_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1348:28: ( ( () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) ( (lv_operator_3_0= ruleBinaryLogicOperator ) ) ( (lv_rightSubformula_4_0= ruleFormulaDefinition ) ) otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1349:1: ( () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) ( (lv_operator_3_0= ruleBinaryLogicOperator ) ) ( (lv_rightSubformula_4_0= ruleFormulaDefinition ) ) otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1349:1: ( () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) ( (lv_operator_3_0= ruleBinaryLogicOperator ) ) ( (lv_rightSubformula_4_0= ruleFormulaDefinition ) ) otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1349:2: () otherlv_1= '(' ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) ) ( (lv_operator_3_0= ruleBinaryLogicOperator ) ) ( (lv_rightSubformula_4_0= ruleFormulaDefinition ) ) otherlv_5= ')'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1349:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1350:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBinaryLogicFormulaAccess().getBinaryLogicFormulaAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBinaryLogicFormula2795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBinaryLogicFormulaAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1362:1: ( (lv_leftSubformula_2_0= ruleFormulaDefinition ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1363:1: (lv_leftSubformula_2_0= ruleFormulaDefinition )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1363:1: (lv_leftSubformula_2_0= ruleFormulaDefinition )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1364:3: lv_leftSubformula_2_0= ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinaryLogicFormulaAccess().getLeftSubformulaFormulaDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormulaDefinition_in_ruleBinaryLogicFormula2816);
            lv_leftSubformula_2_0=ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBinaryLogicFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"leftSubformula",
                      		lv_leftSubformula_2_0, 
                      		"FormulaDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1380:2: ( (lv_operator_3_0= ruleBinaryLogicOperator ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1381:1: (lv_operator_3_0= ruleBinaryLogicOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1381:1: (lv_operator_3_0= ruleBinaryLogicOperator )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1382:3: lv_operator_3_0= ruleBinaryLogicOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinaryLogicFormulaAccess().getOperatorBinaryLogicOperatorEnumRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicOperator_in_ruleBinaryLogicFormula2837);
            lv_operator_3_0=ruleBinaryLogicOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBinaryLogicFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_3_0, 
                      		"BinaryLogicOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1398:2: ( (lv_rightSubformula_4_0= ruleFormulaDefinition ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1399:1: (lv_rightSubformula_4_0= ruleFormulaDefinition )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1399:1: (lv_rightSubformula_4_0= ruleFormulaDefinition )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1400:3: lv_rightSubformula_4_0= ruleFormulaDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBinaryLogicFormulaAccess().getRightSubformulaFormulaDefinitionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormulaDefinition_in_ruleBinaryLogicFormula2858);
            lv_rightSubformula_4_0=ruleFormulaDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBinaryLogicFormulaRule());
              	        }
                     		set(
                     			current, 
                     			"rightSubformula",
                      		lv_rightSubformula_4_0, 
                      		"FormulaDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBinaryLogicFormula2870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBinaryLogicFormulaAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBinaryLogicFormula"


    // $ANTLR start "entryRuleTerm"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1428:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1429:2: (iv_ruleTerm= ruleTerm EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1430:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_entryRuleTerm2906);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm2916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1437:1: ruleTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Constant_1= ruleConstant | this_AtomicProposition_2= ruleAtomicProposition ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Constant_1 = null;

        EObject this_AtomicProposition_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1440:28: ( (this_Variable_0= ruleVariable | this_Constant_1= ruleConstant | this_AtomicProposition_2= ruleAtomicProposition ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1441:1: (this_Variable_0= ruleVariable | this_Constant_1= ruleConstant | this_AtomicProposition_2= ruleAtomicProposition )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1441:1: (this_Variable_0= ruleVariable | this_Constant_1= ruleConstant | this_AtomicProposition_2= ruleAtomicProposition )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_VARIABLE_NAME) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred14_InternalFOTCTL()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_CONSTANT_NAME) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1442:2: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleTerm2966);
                    this_Variable_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1455:2: this_Constant_1= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getConstantParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstant_in_ruleTerm2996);
                    this_Constant_1=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constant_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1468:2: this_AtomicProposition_2= ruleAtomicProposition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAccess().getAtomicPropositionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicProposition_in_ruleTerm3026);
                    this_AtomicProposition_2=ruleAtomicProposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicProposition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtomicProposition"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1487:1: entryRuleAtomicProposition returns [EObject current=null] : iv_ruleAtomicProposition= ruleAtomicProposition EOF ;
    public final EObject entryRuleAtomicProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicProposition = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1488:2: (iv_ruleAtomicProposition= ruleAtomicProposition EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1489:2: iv_ruleAtomicProposition= ruleAtomicProposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicPropositionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicProposition_in_entryRuleAtomicProposition3061);
            iv_ruleAtomicProposition=ruleAtomicProposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicProposition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicProposition3071); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicProposition"


    // $ANTLR start "ruleAtomicProposition"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1496:1: ruleAtomicProposition returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_VARIABLE_NAME ) ) ) ;
    public final EObject ruleAtomicProposition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1499:28: ( ( () ( (lv_name_1_0= RULE_VARIABLE_NAME ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1500:1: ( () ( (lv_name_1_0= RULE_VARIABLE_NAME ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1500:1: ( () ( (lv_name_1_0= RULE_VARIABLE_NAME ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1500:2: () ( (lv_name_1_0= RULE_VARIABLE_NAME ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1500:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1501:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAtomicPropositionAccess().getAtomicPropositionAction_0(),
                          current);
                  
            }

            }

            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1509:2: ( (lv_name_1_0= RULE_VARIABLE_NAME ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1510:1: (lv_name_1_0= RULE_VARIABLE_NAME )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1510:1: (lv_name_1_0= RULE_VARIABLE_NAME )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1511:3: lv_name_1_0= RULE_VARIABLE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_VARIABLE_NAME,FollowSets000.FOLLOW_RULE_VARIABLE_NAME_in_ruleAtomicProposition3125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAtomicPropositionAccess().getNameVariable_nameTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAtomicPropositionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"variable_name");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtomicProposition"


    // $ANTLR start "ruleQuantifier"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1535:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forall' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1537:28: ( ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forall' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1538:1: ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forall' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1538:1: ( (enumLiteral_0= 'exists' ) | (enumLiteral_1= 'forall' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1538:2: (enumLiteral_0= 'exists' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1538:2: (enumLiteral_0= 'exists' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1538:4: enumLiteral_0= 'exists'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleQuantifier3180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getQuantifierAccess().getEXISTSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getEXISTSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1544:6: (enumLiteral_1= 'forall' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1544:6: (enumLiteral_1= 'forall' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1544:8: enumLiteral_1= 'forall'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleQuantifier3197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getQuantifierAccess().getFORALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getFORALLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "ruleBinaryLogicOperator"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1554:1: ruleBinaryLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= ' & ' ) | (enumLiteral_1= ' <=> ' ) | (enumLiteral_2= ' => ' ) | (enumLiteral_3= ' | ' ) | (enumLiteral_4= ' ^ ' ) ) ;
    public final Enumerator ruleBinaryLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1556:28: ( ( (enumLiteral_0= ' & ' ) | (enumLiteral_1= ' <=> ' ) | (enumLiteral_2= ' => ' ) | (enumLiteral_3= ' | ' ) | (enumLiteral_4= ' ^ ' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1557:1: ( (enumLiteral_0= ' & ' ) | (enumLiteral_1= ' <=> ' ) | (enumLiteral_2= ' => ' ) | (enumLiteral_3= ' | ' ) | (enumLiteral_4= ' ^ ' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1557:1: ( (enumLiteral_0= ' & ' ) | (enumLiteral_1= ' <=> ' ) | (enumLiteral_2= ' => ' ) | (enumLiteral_3= ' | ' ) | (enumLiteral_4= ' ^ ' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            case 34:
                {
                alt14=4;
                }
                break;
            case 35:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1557:2: (enumLiteral_0= ' & ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1557:2: (enumLiteral_0= ' & ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1557:4: enumLiteral_0= ' & '
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBinaryLogicOperator3242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBinaryLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1563:6: (enumLiteral_1= ' <=> ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1563:6: (enumLiteral_1= ' <=> ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1563:8: enumLiteral_1= ' <=> '
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryLogicOperator3259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryLogicOperatorAccess().getEQUIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBinaryLogicOperatorAccess().getEQUIVEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1569:6: (enumLiteral_2= ' => ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1569:6: (enumLiteral_2= ' => ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1569:8: enumLiteral_2= ' => '
                    {
                    enumLiteral_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryLogicOperator3276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getBinaryLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1575:6: (enumLiteral_3= ' | ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1575:6: (enumLiteral_3= ' | ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1575:8: enumLiteral_3= ' | '
                    {
                    enumLiteral_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryLogicOperator3293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryLogicOperatorAccess().getOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getBinaryLogicOperatorAccess().getOREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1581:6: (enumLiteral_4= ' ^ ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1581:6: (enumLiteral_4= ' ^ ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1581:8: enumLiteral_4= ' ^ '
                    {
                    enumLiteral_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBinaryLogicOperator3310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBinaryLogicOperatorAccess().getXOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getBinaryLogicOperatorAccess().getXOREnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBinaryLogicOperator"


    // $ANTLR start "ruleComparisonOperator"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1591:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= ' = ' ) | (enumLiteral_1= ' > ' ) | (enumLiteral_2= ' >= ' ) | (enumLiteral_3= ' < ' ) | (enumLiteral_4= ' <= ' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1593:28: ( ( (enumLiteral_0= ' = ' ) | (enumLiteral_1= ' > ' ) | (enumLiteral_2= ' >= ' ) | (enumLiteral_3= ' < ' ) | (enumLiteral_4= ' <= ' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1594:1: ( (enumLiteral_0= ' = ' ) | (enumLiteral_1= ' > ' ) | (enumLiteral_2= ' >= ' ) | (enumLiteral_3= ' < ' ) | (enumLiteral_4= ' <= ' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1594:1: ( (enumLiteral_0= ' = ' ) | (enumLiteral_1= ' > ' ) | (enumLiteral_2= ' >= ' ) | (enumLiteral_3= ' < ' ) | (enumLiteral_4= ' <= ' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            case 39:
                {
                alt15=4;
                }
                break;
            case 40:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1594:2: (enumLiteral_0= ' = ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1594:2: (enumLiteral_0= ' = ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1594:4: enumLiteral_0= ' = '
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleComparisonOperator3355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1600:6: (enumLiteral_1= ' > ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1600:6: (enumLiteral_1= ' > ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1600:8: enumLiteral_1= ' > '
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleComparisonOperator3372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1606:6: (enumLiteral_2= ' >= ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1606:6: (enumLiteral_2= ' >= ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1606:8: enumLiteral_2= ' >= '
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleComparisonOperator3389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1612:6: (enumLiteral_3= ' < ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1612:6: (enumLiteral_3= ' < ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1612:8: enumLiteral_3= ' < '
                    {
                    enumLiteral_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleComparisonOperator3406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLESSEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1618:6: (enumLiteral_4= ' <= ' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1618:6: (enumLiteral_4= ' <= ' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1618:8: enumLiteral_4= ' <= '
                    {
                    enumLiteral_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleComparisonOperator3423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleTemporalOperator"
    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1628:1: ruleTemporalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AF' ) | (enumLiteral_1= 'AG' ) | (enumLiteral_2= 'AU' ) | (enumLiteral_3= 'EF' ) | (enumLiteral_4= 'EG' ) | (enumLiteral_5= 'EU' ) ) ;
    public final Enumerator ruleTemporalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1630:28: ( ( (enumLiteral_0= 'AF' ) | (enumLiteral_1= 'AG' ) | (enumLiteral_2= 'AU' ) | (enumLiteral_3= 'EF' ) | (enumLiteral_4= 'EG' ) | (enumLiteral_5= 'EU' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1631:1: ( (enumLiteral_0= 'AF' ) | (enumLiteral_1= 'AG' ) | (enumLiteral_2= 'AU' ) | (enumLiteral_3= 'EF' ) | (enumLiteral_4= 'EG' ) | (enumLiteral_5= 'EU' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1631:1: ( (enumLiteral_0= 'AF' ) | (enumLiteral_1= 'AG' ) | (enumLiteral_2= 'AU' ) | (enumLiteral_3= 'EF' ) | (enumLiteral_4= 'EG' ) | (enumLiteral_5= 'EU' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt16=1;
                }
                break;
            case 42:
                {
                alt16=2;
                }
                break;
            case 43:
                {
                alt16=3;
                }
                break;
            case 44:
                {
                alt16=4;
                }
                break;
            case 45:
                {
                alt16=5;
                }
                break;
            case 46:
                {
                alt16=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1631:2: (enumLiteral_0= 'AF' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1631:2: (enumLiteral_0= 'AF' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1631:4: enumLiteral_0= 'AF'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTemporalOperator3468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTemporalOperatorAccess().getAFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTemporalOperatorAccess().getAFEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1637:6: (enumLiteral_1= 'AG' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1637:6: (enumLiteral_1= 'AG' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1637:8: enumLiteral_1= 'AG'
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTemporalOperator3485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTemporalOperatorAccess().getAGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTemporalOperatorAccess().getAGEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1643:6: (enumLiteral_2= 'AU' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1643:6: (enumLiteral_2= 'AU' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1643:8: enumLiteral_2= 'AU'
                    {
                    enumLiteral_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTemporalOperator3502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTemporalOperatorAccess().getAUEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTemporalOperatorAccess().getAUEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1649:6: (enumLiteral_3= 'EF' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1649:6: (enumLiteral_3= 'EF' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1649:8: enumLiteral_3= 'EF'
                    {
                    enumLiteral_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTemporalOperator3519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTemporalOperatorAccess().getEFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTemporalOperatorAccess().getEFEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1655:6: (enumLiteral_4= 'EG' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1655:6: (enumLiteral_4= 'EG' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1655:8: enumLiteral_4= 'EG'
                    {
                    enumLiteral_4=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTemporalOperator3536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTemporalOperatorAccess().getEGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getTemporalOperatorAccess().getEGEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1661:6: (enumLiteral_5= 'EU' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1661:6: (enumLiteral_5= 'EU' )
                    // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1661:8: enumLiteral_5= 'EU'
                    {
                    enumLiteral_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTemporalOperator3553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTemporalOperatorAccess().getEUEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getTemporalOperatorAccess().getEUEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemporalOperator"

    // $ANTLR start synpred12_InternalFOTCTL
    public final void synpred12_InternalFOTCTL_fragment() throws RecognitionException {   
        EObject this_BinaryLogicFormula_0 = null;


        // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:694:2: (this_BinaryLogicFormula_0= ruleBinaryLogicFormula )
        // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:694:2: this_BinaryLogicFormula_0= ruleBinaryLogicFormula
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicFormula_in_synpred12_InternalFOTCTL1477);
        this_BinaryLogicFormula_0=ruleBinaryLogicFormula();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalFOTCTL

    // $ANTLR start synpred14_InternalFOTCTL
    public final void synpred14_InternalFOTCTL_fragment() throws RecognitionException {   
        EObject this_Variable_0 = null;


        // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1442:2: (this_Variable_0= ruleVariable )
        // ../de.uni_paderborn.fujaba.muml.verification.fotctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/parser/antlr/internal/InternalFOTCTL.g:1442:2: this_Variable_0= ruleVariable
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleVariable_in_synpred14_InternalFOTCTL2966);
        this_Variable_0=ruleVariable();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalFOTCTL

    // Delegated rules

    public final boolean synpred12_InternalFOTCTL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFOTCTL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalFOTCTL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalFOTCTL_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleFoTCTLSpec_in_entryRuleFoTCTLSpec81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFoTCTLSpec91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleFoTCTLSpec140 = new BitSet(new long[]{0x0000000000390000L});
        public static final BitSet FOLLOW_16_in_ruleFoTCTLSpec153 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNodeLabelPredicateDecl_in_ruleFoTCTLSpec174 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFoTCTLSpec187 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNodeLabelPredicateDecl_in_ruleFoTCTLSpec208 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleFoTCTLSpec222 = new BitSet(new long[]{0x0000000000380000L});
        public static final BitSet FOLLOW_19_in_ruleFoTCTLSpec237 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEdgeLabelPredicateDecl_in_ruleFoTCTLSpec258 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFoTCTLSpec271 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEdgeLabelPredicateDecl_in_ruleFoTCTLSpec292 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleFoTCTLSpec306 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleFoTCTLSpec321 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleConstantSymbolDecl_in_ruleFoTCTLSpec342 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFoTCTLSpec355 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleConstantSymbolDecl_in_ruleFoTCTLSpec376 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleFoTCTLSpec390 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleFoTCTLSpec404 = new BitSet(new long[]{0x00007E0064800030L});
        public static final BitSet FOLLOW_ruleFoTCTLFormula_in_ruleFoTCTLSpec425 = new BitSet(new long[]{0x00007E0064800032L});
        public static final BitSet FOLLOW_ruleFoTCTLFormula_in_entryRuleFoTCTLFormula462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFoTCTLFormula472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormulaDefinition_in_ruleFoTCTLFormula530 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleFoTCTLFormula542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormulaDefinition_in_entryRuleFormulaDefinition578 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormulaDefinition588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicFormula_in_ruleFormulaDefinition638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryFormula_in_ruleFormulaDefinition668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryFormula_in_ruleFormulaDefinition698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNodeLabelPredicateDecl_in_entryRuleNodeLabelPredicateDecl733 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNodeLabelPredicateDecl743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NODE_PREDICATE_NAME_in_ruleNodeLabelPredicateDecl797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEdgeLabelPredicateDecl_in_entryRuleEdgeLabelPredicateDecl838 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEdgeLabelPredicateDecl848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EDGE_PREDICATE_NAME_in_ruleEdgeLabelPredicateDecl902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantSymbolDecl_in_entryRuleConstantSymbolDecl943 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantSymbolDecl953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CONSTANT_NAME_in_ruleConstantSymbolDecl1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant1048 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstant1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CONSTANT_NAME_in_ruleConstant1119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1155 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable1165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_VARIABLE_NAME_in_ruleVariable1226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryFormula_in_entryRuleUnaryFormula1262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryFormula1272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotFormula_in_ruleUnaryFormula1322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryTemporalFormula_in_ruleUnaryFormula1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantifiedFormula_in_ruleUnaryFormula1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryFormula_in_entryRuleBinaryFormula1417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryFormula1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicFormula_in_ruleBinaryFormula1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryTemporalFormula_in_ruleBinaryFormula1507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicFormula_in_entryRuleAtomicFormula1542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicFormula1552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNodeLabelPredicate_in_ruleAtomicFormula1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEdgeLabelPredicate_in_ruleAtomicFormula1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNodeLabelPredicate_in_entryRuleNodeLabelPredicate1667 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNodeLabelPredicate1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NODE_PREDICATE_NAME_in_ruleNodeLabelPredicate1738 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleNodeLabelPredicate1750 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleNodeLabelPredicate1771 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleNodeLabelPredicate1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEdgeLabelPredicate_in_entryRuleEdgeLabelPredicate1819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEdgeLabelPredicate1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_EDGE_PREDICATE_NAME_in_ruleEdgeLabelPredicate1890 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEdgeLabelPredicate1902 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleEdgeLabelPredicate1923 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEdgeLabelPredicate1935 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleEdgeLabelPredicate1956 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEdgeLabelPredicate1968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantifiedFormula_in_entryRuleQuantifiedFormula2004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedFormula2014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantifier_in_ruleQuantifiedFormula2072 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleQuantifiedFormula2084 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_VARIABLE_NAME_in_ruleQuantifiedFormula2101 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleQuantifiedFormula2118 = new BitSet(new long[]{0x00007E0064800030L});
        public static final BitSet FOLLOW_ruleFormulaDefinition_in_ruleQuantifiedFormula2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotFormula_in_entryRuleNotFormula2177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotFormula2187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleNotFormula2224 = new BitSet(new long[]{0x00007E0064800030L});
        public static final BitSet FOLLOW_ruleFormulaDefinition_in_ruleNotFormula2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryTemporalFormula_in_entryRuleUnaryTemporalFormula2295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryTemporalFormula2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalOperator_in_ruleUnaryTemporalFormula2363 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleUnaryTemporalFormula2375 = new BitSet(new long[]{0x000001F000000000L});
        public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleUnaryTemporalFormula2396 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUnaryTemporalFormula2413 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleUnaryTemporalFormula2430 = new BitSet(new long[]{0x00007E0064800030L});
        public static final BitSet FOLLOW_ruleFormulaDefinition_in_ruleUnaryTemporalFormula2451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryTemporalFormula_in_entryRuleBinaryTemporalFormula2487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryTemporalFormula2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBinaryTemporalFormula2546 = new BitSet(new long[]{0x00007E0064800030L});
        public static final BitSet FOLLOW_ruleFormulaDefinition_in_ruleBinaryTemporalFormula2567 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleBinaryTemporalFormula2579 = new BitSet(new long[]{0x00007E0000000000L});
        public static final BitSet FOLLOW_ruleTemporalOperator_in_ruleBinaryTemporalFormula2600 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleBinaryTemporalFormula2612 = new BitSet(new long[]{0x000001F000000000L});
        public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleBinaryTemporalFormula2633 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleBinaryTemporalFormula2650 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleBinaryTemporalFormula2667 = new BitSet(new long[]{0x00007E0064800030L});
        public static final BitSet FOLLOW_ruleFormulaDefinition_in_ruleBinaryTemporalFormula2688 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleBinaryTemporalFormula2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicFormula_in_entryRuleBinaryLogicFormula2736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryLogicFormula2746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBinaryLogicFormula2795 = new BitSet(new long[]{0x00007E0064800030L});
        public static final BitSet FOLLOW_ruleFormulaDefinition_in_ruleBinaryLogicFormula2816 = new BitSet(new long[]{0x0000000F80000000L});
        public static final BitSet FOLLOW_ruleBinaryLogicOperator_in_ruleBinaryLogicFormula2837 = new BitSet(new long[]{0x00007E0064800030L});
        public static final BitSet FOLLOW_ruleFormulaDefinition_in_ruleBinaryLogicFormula2858 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleBinaryLogicFormula2870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleTerm2966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstant_in_ruleTerm2996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicProposition_in_ruleTerm3026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicProposition_in_entryRuleAtomicProposition3061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicProposition3071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_VARIABLE_NAME_in_ruleAtomicProposition3125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleQuantifier3180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleQuantifier3197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleBinaryLogicOperator3242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleBinaryLogicOperator3259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleBinaryLogicOperator3276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleBinaryLogicOperator3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBinaryLogicOperator3310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleComparisonOperator3355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleComparisonOperator3372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleComparisonOperator3389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleComparisonOperator3406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleComparisonOperator3423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleTemporalOperator3468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleTemporalOperator3485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleTemporalOperator3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleTemporalOperator3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleTemporalOperator3536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTemporalOperator3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicFormula_in_synpred12_InternalFOTCTL1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_synpred14_InternalFOTCTL2966 = new BitSet(new long[]{0x0000000000000002L});
    }


}