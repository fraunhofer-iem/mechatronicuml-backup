package de.uni_paderborn.fujaba.muml.verification.uppaal.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uni_paderborn.fujaba.muml.verification.uppaal.services.MtctlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMtctlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'leadsTo'", "'implies'", "'and'", "'or'", "'not'", "'forall'", "'('", "')'", "'exists'", "':'", "'EF'", "'E<>'", "'AF'", "'A<>'", "'EG'", "'E[]'", "'AG'", "'A[]'", "'deadlock'", "'bufferOverflow'", "'true'", "'false'", "'stateActive'", "'substateOf'", "','", "'stateInStatechart'", "'messageInTransit'", "'messageInBuffer'", "'transitionFiring'", "'bufferMessageCount'", "'sourceState'", "'targetState'", "'['", "']'", "'days'", "'hrs'", "'mins'", "'secs'", "'msecs'", "'\\u00B5secs'", "'nsecs'", "'States'", "'Transitions'", "'MessageTypes'", "'Clocks'", "'Buffers'", "'Instances'", "'<'", "'>'", "'Subinstances'", "'.'", "'-'", "'=='", "'>='", "'<='", "'!='"
    };
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMtctlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMtctlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMtctlParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g"; }



     	private MtctlGrammarAccess grammarAccess;
     	
        public InternalMtctlParser(TokenStream input, MtctlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PropertyRepository";	
       	}
       	
       	@Override
       	protected MtctlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePropertyRepository"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:68:1: entryRulePropertyRepository returns [EObject current=null] : iv_rulePropertyRepository= rulePropertyRepository EOF ;
    public final EObject entryRulePropertyRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRepository = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:69:2: (iv_rulePropertyRepository= rulePropertyRepository EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:70:2: iv_rulePropertyRepository= rulePropertyRepository EOF
            {
             newCompositeNode(grammarAccess.getPropertyRepositoryRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyRepository_in_entryRulePropertyRepository75);
            iv_rulePropertyRepository=rulePropertyRepository();

            state._fsp--;

             current =iv_rulePropertyRepository; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyRepository85); 

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
    // $ANTLR end "entryRulePropertyRepository"


    // $ANTLR start "rulePropertyRepository"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:77:1: rulePropertyRepository returns [EObject current=null] : ( (lv_properties_0_0= ruleProperty ) )* ;
    public final EObject rulePropertyRepository() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:80:28: ( ( (lv_properties_0_0= ruleProperty ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:81:1: ( (lv_properties_0_0= ruleProperty ) )*
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:81:1: ( (lv_properties_0_0= ruleProperty ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=16 && LA1_0<=18)||LA1_0==20||(LA1_0>=22 && LA1_0<=35)||(LA1_0>=37 && LA1_0<=43)||LA1_0==63) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:82:1: (lv_properties_0_0= ruleProperty )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:82:1: (lv_properties_0_0= ruleProperty )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:83:3: lv_properties_0_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyRepositoryAccess().getPropertiesPropertyParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_rulePropertyRepository130);
            	    lv_properties_0_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyRepositoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_0_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "rulePropertyRepository"


    // $ANTLR start "entryRuleProperty"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:107:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
        	
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:111:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:112:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty172);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty182); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:122:1: ruleProperty returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:126:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:127:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:127:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:127:2: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:127:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:128:1: (lv_expression_0_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:128:1: (lv_expression_0_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:129:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleProperty232);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleProperty244); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getSemicolonKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:149:1: ( (lv_comment_2_0= RULE_SL_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:150:1: (lv_comment_2_0= RULE_SL_COMMENT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:150:1: (lv_comment_2_0= RULE_SL_COMMENT )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:151:3: lv_comment_2_0= RULE_SL_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_RULE_SL_COMMENT_in_ruleProperty261); 

                    			newLeafNode(lv_comment_2_0, grammarAccess.getPropertyAccess().getCommentSL_COMMENTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_2_0, 
                            		"SL_COMMENT");
                    	    

                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleExpression"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:178:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:179:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:180:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression307);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression317); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:187:1: ruleExpression returns [EObject current=null] : this_LeadsToExpr_0= ruleLeadsToExpr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LeadsToExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:190:28: (this_LeadsToExpr_0= ruleLeadsToExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:192:5: this_LeadsToExpr_0= ruleLeadsToExpr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLeadsToExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLeadsToExpr_in_ruleExpression363);
            this_LeadsToExpr_0=ruleLeadsToExpr();

            state._fsp--;

             
                    current = this_LeadsToExpr_0; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLeadsToExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:208:1: entryRuleLeadsToExpr returns [EObject current=null] : iv_ruleLeadsToExpr= ruleLeadsToExpr EOF ;
    public final EObject entryRuleLeadsToExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeadsToExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:209:2: (iv_ruleLeadsToExpr= ruleLeadsToExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:210:2: iv_ruleLeadsToExpr= ruleLeadsToExpr EOF
            {
             newCompositeNode(grammarAccess.getLeadsToExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeadsToExpr_in_entryRuleLeadsToExpr397);
            iv_ruleLeadsToExpr=ruleLeadsToExpr();

            state._fsp--;

             current =iv_ruleLeadsToExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeadsToExpr407); 

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
    // $ANTLR end "entryRuleLeadsToExpr"


    // $ANTLR start "ruleLeadsToExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:217:1: ruleLeadsToExpr returns [EObject current=null] : (this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )* ) ;
    public final EObject ruleLeadsToExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ImplyExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:220:28: ( (this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:221:1: (this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:221:1: (this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:222:5: this_ImplyExpr_0= ruleImplyExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLeadsToExprAccess().getImplyExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleImplyExpr_in_ruleLeadsToExpr454);
            this_ImplyExpr_0=ruleImplyExpr();

            state._fsp--;

             
                    current = this_ImplyExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:230:1: ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:230:2: () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleImplyExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:230:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:231:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLeadsToExprAccess().getLeadsToExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLeadsToExpr475); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLeadsToExprAccess().getLeadsToKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:240:1: ( (lv_rightOpd_3_0= ruleImplyExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:241:1: (lv_rightOpd_3_0= ruleImplyExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:241:1: (lv_rightOpd_3_0= ruleImplyExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:242:3: lv_rightOpd_3_0= ruleImplyExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLeadsToExprAccess().getRightOpdImplyExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleImplyExpr_in_ruleLeadsToExpr496);
            	    lv_rightOpd_3_0=ruleImplyExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLeadsToExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOpd",
            	            		lv_rightOpd_3_0, 
            	            		"ImplyExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleLeadsToExpr"


    // $ANTLR start "entryRuleImplyExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:266:1: entryRuleImplyExpr returns [EObject current=null] : iv_ruleImplyExpr= ruleImplyExpr EOF ;
    public final EObject entryRuleImplyExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplyExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:267:2: (iv_ruleImplyExpr= ruleImplyExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:268:2: iv_ruleImplyExpr= ruleImplyExpr EOF
            {
             newCompositeNode(grammarAccess.getImplyExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImplyExpr_in_entryRuleImplyExpr534);
            iv_ruleImplyExpr=ruleImplyExpr();

            state._fsp--;

             current =iv_ruleImplyExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplyExpr544); 

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
    // $ANTLR end "entryRuleImplyExpr"


    // $ANTLR start "ruleImplyExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:275:1: ruleImplyExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleImplyExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:278:28: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:279:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:279:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:280:5: this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getImplyExprAccess().getAndExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndExpr_in_ruleImplyExpr591);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;

             
                    current = this_AndExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:288:1: ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:288:2: () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:288:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:289:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getImplyExprAccess().getImplyExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleImplyExpr612); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImplyExprAccess().getImpliesKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:298:1: ( (lv_rightOpd_3_0= ruleAndExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:299:1: (lv_rightOpd_3_0= ruleAndExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:299:1: (lv_rightOpd_3_0= ruleAndExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:300:3: lv_rightOpd_3_0= ruleAndExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplyExprAccess().getRightOpdAndExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpr_in_ruleImplyExpr633);
            	    lv_rightOpd_3_0=ruleAndExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImplyExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOpd",
            	            		lv_rightOpd_3_0, 
            	            		"AndExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleImplyExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:324:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:325:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:326:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpr_in_entryRuleAndExpr671);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpr681); 

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:333:1: ruleAndExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:336:28: ( (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:337:1: (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:337:1: (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:338:5: this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExprAccess().getOrExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOrExpr_in_ruleAndExpr728);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;

             
                    current = this_OrExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:346:1: ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:346:2: () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:346:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:347:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExprAccess().getAndExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAndExpr749); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getAndKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:356:1: ( (lv_rightOpd_3_0= ruleOrExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:357:1: (lv_rightOpd_3_0= ruleOrExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:357:1: (lv_rightOpd_3_0= ruleOrExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:358:3: lv_rightOpd_3_0= ruleOrExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExprAccess().getRightOpdOrExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOrExpr_in_ruleAndExpr770);
            	    lv_rightOpd_3_0=ruleOrExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOpd",
            	            		lv_rightOpd_3_0, 
            	            		"OrExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleOrExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:382:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:383:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:384:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpr_in_entryRuleOrExpr808);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpr818); 

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:391:1: ruleOrExpr returns [EObject current=null] : (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NotExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:394:28: ( (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:395:1: (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:395:1: (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:396:5: this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExprAccess().getNotExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleOrExpr865);
            this_NotExpr_0=ruleNotExpr();

            state._fsp--;

             
                    current = this_NotExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:404:1: ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:404:2: () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:404:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:405:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExprAccess().getOrExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOrExpr886); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOrKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:414:1: ( (lv_rightOpd_3_0= ruleNotExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:415:1: (lv_rightOpd_3_0= ruleNotExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:415:1: (lv_rightOpd_3_0= ruleNotExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:416:3: lv_rightOpd_3_0= ruleNotExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExprAccess().getRightOpdNotExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleOrExpr907);
            	    lv_rightOpd_3_0=ruleNotExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOpd",
            	            		lv_rightOpd_3_0, 
            	            		"NotExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleNotExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:440:1: entryRuleNotExpr returns [EObject current=null] : iv_ruleNotExpr= ruleNotExpr EOF ;
    public final EObject entryRuleNotExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:441:2: (iv_ruleNotExpr= ruleNotExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:442:2: iv_ruleNotExpr= ruleNotExpr EOF
            {
             newCompositeNode(grammarAccess.getNotExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_entryRuleNotExpr945);
            iv_ruleNotExpr=ruleNotExpr();

            state._fsp--;

             current =iv_ruleNotExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpr955); 

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
    // $ANTLR end "entryRuleNotExpr"


    // $ANTLR start "ruleNotExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:449:1: ruleNotExpr returns [EObject current=null] : ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr ) ;
    public final EObject ruleNotExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_opd_2_0 = null;

        EObject this_QuantifierExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:452:28: ( ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:453:1: ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:453:1: ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||(LA7_0>=17 && LA7_0<=18)||LA7_0==20||(LA7_0>=22 && LA7_0<=35)||(LA7_0>=37 && LA7_0<=43)||LA7_0==63) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:453:2: (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:453:2: (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:453:4: otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) )
                    {
                    otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNotExpr993); 

                        	newLeafNode(otherlv_0, grammarAccess.getNotExprAccess().getNotKeyword_0_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:457:1: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:458:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNotExprAccess().getNotExprAction_0_1(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:463:2: ( (lv_opd_2_0= ruleNotExpr ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:464:1: (lv_opd_2_0= ruleNotExpr )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:464:1: (lv_opd_2_0= ruleNotExpr )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:465:3: lv_opd_2_0= ruleNotExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getNotExprAccess().getOpdNotExprParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleNotExpr1023);
                    lv_opd_2_0=ruleNotExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNotExprRule());
                    	        }
                           		set(
                           			current, 
                           			"opd",
                            		lv_opd_2_0, 
                            		"NotExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:483:5: this_QuantifierExpr_3= ruleQuantifierExpr
                    {
                     
                            newCompositeNode(grammarAccess.getNotExprAccess().getQuantifierExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuantifierExpr_in_ruleNotExpr1052);
                    this_QuantifierExpr_3=ruleQuantifierExpr();

                    state._fsp--;

                     
                            current = this_QuantifierExpr_3; 
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
    // $ANTLR end "ruleNotExpr"


    // $ANTLR start "entryRuleQuantifierExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:499:1: entryRuleQuantifierExpr returns [EObject current=null] : iv_ruleQuantifierExpr= ruleQuantifierExpr EOF ;
    public final EObject entryRuleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifierExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:500:2: (iv_ruleQuantifierExpr= ruleQuantifierExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:501:2: iv_ruleQuantifierExpr= ruleQuantifierExpr EOF
            {
             newCompositeNode(grammarAccess.getQuantifierExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuantifierExpr_in_entryRuleQuantifierExpr1087);
            iv_ruleQuantifierExpr=ruleQuantifierExpr();

            state._fsp--;

             current =iv_ruleQuantifierExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuantifierExpr1097); 

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
    // $ANTLR end "entryRuleQuantifierExpr"


    // $ANTLR start "ruleQuantifierExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:508:1: ruleQuantifierExpr returns [EObject current=null] : (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr ) ;
    public final EObject ruleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject this_UniversalQuantExpr_0 = null;

        EObject this_ExistentialQuantExpr_1 = null;

        EObject this_TemporalQuantifierExpr_2 = null;

        EObject this_AtomExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:511:28: ( (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:512:1: (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:512:1: (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 18:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 63:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:513:5: this_UniversalQuantExpr_0= ruleUniversalQuantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getUniversalQuantExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUniversalQuantExpr_in_ruleQuantifierExpr1144);
                    this_UniversalQuantExpr_0=ruleUniversalQuantExpr();

                    state._fsp--;

                     
                            current = this_UniversalQuantExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:523:5: this_ExistentialQuantExpr_1= ruleExistentialQuantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getExistentialQuantExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExistentialQuantExpr_in_ruleQuantifierExpr1171);
                    this_ExistentialQuantExpr_1=ruleExistentialQuantExpr();

                    state._fsp--;

                     
                            current = this_ExistentialQuantExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:533:5: this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getTemporalQuantifierExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemporalQuantifierExpr_in_ruleQuantifierExpr1198);
                    this_TemporalQuantifierExpr_2=ruleTemporalQuantifierExpr();

                    state._fsp--;

                     
                            current = this_TemporalQuantifierExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:543:5: this_AtomExpr_3= ruleAtomExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getAtomExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAtomExpr_in_ruleQuantifierExpr1225);
                    this_AtomExpr_3=ruleAtomExpr();

                    state._fsp--;

                     
                            current = this_AtomExpr_3; 
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
    // $ANTLR end "ruleQuantifierExpr"


    // $ANTLR start "entryRuleUniversalQuantExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:559:1: entryRuleUniversalQuantExpr returns [EObject current=null] : iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF ;
    public final EObject entryRuleUniversalQuantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalQuantExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:560:2: (iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:561:2: iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF
            {
             newCompositeNode(grammarAccess.getUniversalQuantExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUniversalQuantExpr_in_entryRuleUniversalQuantExpr1260);
            iv_ruleUniversalQuantExpr=ruleUniversalQuantExpr();

            state._fsp--;

             current =iv_ruleUniversalQuantExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUniversalQuantExpr1270); 

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
    // $ANTLR end "entryRuleUniversalQuantExpr"


    // $ANTLR start "ruleUniversalQuantExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:568:1: ruleUniversalQuantExpr returns [EObject current=null] : (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) ;
    public final EObject ruleUniversalQuantExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_var_3_0 = null;

        EObject lv_formula_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:571:28: ( (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:572:1: (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:572:1: (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:572:3: otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUniversalQuantExpr1307); 

                	newLeafNode(otherlv_0, grammarAccess.getUniversalQuantExprAccess().getForallKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUniversalQuantExpr1319); 

                	newLeafNode(otherlv_1, grammarAccess.getUniversalQuantExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:580:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:581:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUniversalQuantExprAccess().getUniversalQuantExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:586:2: ( (lv_var_3_0= ruleVariableBinding ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:587:1: (lv_var_3_0= ruleVariableBinding )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:587:1: (lv_var_3_0= ruleVariableBinding )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:588:3: lv_var_3_0= ruleVariableBinding
            {
             
            	        newCompositeNode(grammarAccess.getUniversalQuantExprAccess().getVarVariableBindingParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableBinding_in_ruleUniversalQuantExpr1349);
            lv_var_3_0=ruleVariableBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniversalQuantExprRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_3_0, 
                    		"VariableBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleUniversalQuantExpr1361); 

                	newLeafNode(otherlv_4, grammarAccess.getUniversalQuantExprAccess().getRightParenthesisKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:608:1: ( (lv_formula_5_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:609:1: (lv_formula_5_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:609:1: (lv_formula_5_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:610:3: lv_formula_5_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getUniversalQuantExprAccess().getFormulaNotExprParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleUniversalQuantExpr1382);
            lv_formula_5_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUniversalQuantExprRule());
            	        }
                   		set(
                   			current, 
                   			"formula",
                    		lv_formula_5_0, 
                    		"NotExpr");
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
    // $ANTLR end "ruleUniversalQuantExpr"


    // $ANTLR start "entryRuleExistentialQuantExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:634:1: entryRuleExistentialQuantExpr returns [EObject current=null] : iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF ;
    public final EObject entryRuleExistentialQuantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistentialQuantExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:635:2: (iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:636:2: iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF
            {
             newCompositeNode(grammarAccess.getExistentialQuantExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExistentialQuantExpr_in_entryRuleExistentialQuantExpr1418);
            iv_ruleExistentialQuantExpr=ruleExistentialQuantExpr();

            state._fsp--;

             current =iv_ruleExistentialQuantExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExistentialQuantExpr1428); 

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
    // $ANTLR end "entryRuleExistentialQuantExpr"


    // $ANTLR start "ruleExistentialQuantExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:643:1: ruleExistentialQuantExpr returns [EObject current=null] : (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) ;
    public final EObject ruleExistentialQuantExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_var_3_0 = null;

        EObject lv_formula_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:646:28: ( (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:647:1: (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:647:1: (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:647:3: otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) )
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExistentialQuantExpr1465); 

                	newLeafNode(otherlv_0, grammarAccess.getExistentialQuantExprAccess().getExistsKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExistentialQuantExpr1477); 

                	newLeafNode(otherlv_1, grammarAccess.getExistentialQuantExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:655:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:656:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExistentialQuantExprAccess().getExistenceQuantExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:661:2: ( (lv_var_3_0= ruleVariableBinding ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:662:1: (lv_var_3_0= ruleVariableBinding )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:662:1: (lv_var_3_0= ruleVariableBinding )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:663:3: lv_var_3_0= ruleVariableBinding
            {
             
            	        newCompositeNode(grammarAccess.getExistentialQuantExprAccess().getVarVariableBindingParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableBinding_in_ruleExistentialQuantExpr1507);
            lv_var_3_0=ruleVariableBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExistentialQuantExprRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_3_0, 
                    		"VariableBinding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExistentialQuantExpr1519); 

                	newLeafNode(otherlv_4, grammarAccess.getExistentialQuantExprAccess().getRightParenthesisKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:683:1: ( (lv_formula_5_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:684:1: (lv_formula_5_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:684:1: (lv_formula_5_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:685:3: lv_formula_5_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getExistentialQuantExprAccess().getFormulaNotExprParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleExistentialQuantExpr1540);
            lv_formula_5_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExistentialQuantExprRule());
            	        }
                   		set(
                   			current, 
                   			"formula",
                    		lv_formula_5_0, 
                    		"NotExpr");
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
    // $ANTLR end "ruleExistentialQuantExpr"


    // $ANTLR start "entryRuleVariableBinding"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:709:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:710:2: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:711:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableBinding_in_entryRuleVariableBinding1576);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableBinding1586); 

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
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:718:1: ruleVariableBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_set_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:721:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:722:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:722:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:722:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:722:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:723:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:723:1: (lv_name_0_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:724:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableBinding1628); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableBindingAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleVariableBinding1645); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getColonKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:744:1: ( (lv_set_2_0= ruleSetExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:745:1: (lv_set_2_0= ruleSetExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:745:1: (lv_set_2_0= ruleSetExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:746:3: lv_set_2_0= ruleSetExpr
            {
             
            	        newCompositeNode(grammarAccess.getVariableBindingAccess().getSetSetExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSetExpr_in_ruleVariableBinding1666);
            lv_set_2_0=ruleSetExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            	        }
                   		set(
                   			current, 
                   			"set",
                    		lv_set_2_0, 
                    		"SetExpr");
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
    // $ANTLR end "ruleVariableBinding"


    // $ANTLR start "entryRuleTemporalQuantifierExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:770:1: entryRuleTemporalQuantifierExpr returns [EObject current=null] : iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF ;
    public final EObject entryRuleTemporalQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalQuantifierExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:771:2: (iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:772:2: iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalQuantifierExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemporalQuantifierExpr_in_entryRuleTemporalQuantifierExpr1702);
            iv_ruleTemporalQuantifierExpr=ruleTemporalQuantifierExpr();

            state._fsp--;

             current =iv_ruleTemporalQuantifierExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemporalQuantifierExpr1712); 

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
    // $ANTLR end "entryRuleTemporalQuantifierExpr"


    // $ANTLR start "ruleTemporalQuantifierExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:779:1: ruleTemporalQuantifierExpr returns [EObject current=null] : (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr ) ;
    public final EObject ruleTemporalQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject this_EFExpr_0 = null;

        EObject this_AFExpr_1 = null;

        EObject this_EGExpr_2 = null;

        EObject this_AGExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:782:28: ( (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:783:1: (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:783:1: (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
                {
                alt9=1;
                }
                break;
            case 24:
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
            case 27:
                {
                alt9=3;
                }
                break;
            case 28:
            case 29:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:784:5: this_EFExpr_0= ruleEFExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getEFExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEFExpr_in_ruleTemporalQuantifierExpr1759);
                    this_EFExpr_0=ruleEFExpr();

                    state._fsp--;

                     
                            current = this_EFExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:794:5: this_AFExpr_1= ruleAFExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getAFExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAFExpr_in_ruleTemporalQuantifierExpr1786);
                    this_AFExpr_1=ruleAFExpr();

                    state._fsp--;

                     
                            current = this_AFExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:804:5: this_EGExpr_2= ruleEGExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getEGExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEGExpr_in_ruleTemporalQuantifierExpr1813);
                    this_EGExpr_2=ruleEGExpr();

                    state._fsp--;

                     
                            current = this_EGExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:814:5: this_AGExpr_3= ruleAGExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getAGExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAGExpr_in_ruleTemporalQuantifierExpr1840);
                    this_AGExpr_3=ruleAGExpr();

                    state._fsp--;

                     
                            current = this_AGExpr_3; 
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
    // $ANTLR end "ruleTemporalQuantifierExpr"


    // $ANTLR start "entryRuleEFExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:830:1: entryRuleEFExpr returns [EObject current=null] : iv_ruleEFExpr= ruleEFExpr EOF ;
    public final EObject entryRuleEFExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:831:2: (iv_ruleEFExpr= ruleEFExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:832:2: iv_ruleEFExpr= ruleEFExpr EOF
            {
             newCompositeNode(grammarAccess.getEFExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFExpr_in_entryRuleEFExpr1875);
            iv_ruleEFExpr=ruleEFExpr();

            state._fsp--;

             current =iv_ruleEFExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFExpr1885); 

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
    // $ANTLR end "entryRuleEFExpr"


    // $ANTLR start "ruleEFExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:839:1: ruleEFExpr returns [EObject current=null] : ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleEFExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:842:28: ( ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:843:1: ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:843:1: ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:843:2: (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:843:2: (otherlv_0= 'EF' | otherlv_1= 'E<>' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:843:4: otherlv_0= 'EF'
                    {
                    otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEFExpr1923); 

                        	newLeafNode(otherlv_0, grammarAccess.getEFExprAccess().getEFKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:848:7: otherlv_1= 'E<>'
                    {
                    otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEFExpr1941); 

                        	newLeafNode(otherlv_1, grammarAccess.getEFExprAccess().getEKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:852:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:853:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEFExprAccess().getEFExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:858:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:859:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:859:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:860:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getEFExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleEFExpr1972);
            lv_expr_3_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEFExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"NotExpr");
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
    // $ANTLR end "ruleEFExpr"


    // $ANTLR start "entryRuleAFExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:884:1: entryRuleAFExpr returns [EObject current=null] : iv_ruleAFExpr= ruleAFExpr EOF ;
    public final EObject entryRuleAFExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:885:2: (iv_ruleAFExpr= ruleAFExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:886:2: iv_ruleAFExpr= ruleAFExpr EOF
            {
             newCompositeNode(grammarAccess.getAFExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAFExpr_in_entryRuleAFExpr2008);
            iv_ruleAFExpr=ruleAFExpr();

            state._fsp--;

             current =iv_ruleAFExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAFExpr2018); 

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
    // $ANTLR end "entryRuleAFExpr"


    // $ANTLR start "ruleAFExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:893:1: ruleAFExpr returns [EObject current=null] : ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleAFExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:896:28: ( ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:897:1: ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:897:1: ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:897:2: (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:897:2: (otherlv_0= 'AF' | otherlv_1= 'A<>' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:897:4: otherlv_0= 'AF'
                    {
                    otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAFExpr2056); 

                        	newLeafNode(otherlv_0, grammarAccess.getAFExprAccess().getAFKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:902:7: otherlv_1= 'A<>'
                    {
                    otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAFExpr2074); 

                        	newLeafNode(otherlv_1, grammarAccess.getAFExprAccess().getAKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:906:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:907:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAFExprAccess().getAFExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:912:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:913:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:913:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:914:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getAFExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleAFExpr2105);
            lv_expr_3_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAFExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"NotExpr");
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
    // $ANTLR end "ruleAFExpr"


    // $ANTLR start "entryRuleEGExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:938:1: entryRuleEGExpr returns [EObject current=null] : iv_ruleEGExpr= ruleEGExpr EOF ;
    public final EObject entryRuleEGExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:939:2: (iv_ruleEGExpr= ruleEGExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:940:2: iv_ruleEGExpr= ruleEGExpr EOF
            {
             newCompositeNode(grammarAccess.getEGExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEGExpr_in_entryRuleEGExpr2141);
            iv_ruleEGExpr=ruleEGExpr();

            state._fsp--;

             current =iv_ruleEGExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEGExpr2151); 

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
    // $ANTLR end "entryRuleEGExpr"


    // $ANTLR start "ruleEGExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:947:1: ruleEGExpr returns [EObject current=null] : ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleEGExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:950:28: ( ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:951:1: ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:951:1: ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:951:2: (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:951:2: (otherlv_0= 'EG' | otherlv_1= 'E[]' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:951:4: otherlv_0= 'EG'
                    {
                    otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEGExpr2189); 

                        	newLeafNode(otherlv_0, grammarAccess.getEGExprAccess().getEGKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:956:7: otherlv_1= 'E[]'
                    {
                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEGExpr2207); 

                        	newLeafNode(otherlv_1, grammarAccess.getEGExprAccess().getEKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:960:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:961:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEGExprAccess().getEGExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:966:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:967:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:967:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:968:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getEGExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleEGExpr2238);
            lv_expr_3_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEGExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"NotExpr");
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
    // $ANTLR end "ruleEGExpr"


    // $ANTLR start "entryRuleAGExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:992:1: entryRuleAGExpr returns [EObject current=null] : iv_ruleAGExpr= ruleAGExpr EOF ;
    public final EObject entryRuleAGExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAGExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:993:2: (iv_ruleAGExpr= ruleAGExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:994:2: iv_ruleAGExpr= ruleAGExpr EOF
            {
             newCompositeNode(grammarAccess.getAGExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAGExpr_in_entryRuleAGExpr2274);
            iv_ruleAGExpr=ruleAGExpr();

            state._fsp--;

             current =iv_ruleAGExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAGExpr2284); 

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
    // $ANTLR end "entryRuleAGExpr"


    // $ANTLR start "ruleAGExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1001:1: ruleAGExpr returns [EObject current=null] : ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleAGExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1004:28: ( ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1005:1: ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1005:1: ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1005:2: (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1005:2: (otherlv_0= 'AG' | otherlv_1= 'A[]' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1005:4: otherlv_0= 'AG'
                    {
                    otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAGExpr2322); 

                        	newLeafNode(otherlv_0, grammarAccess.getAGExprAccess().getAGKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1010:7: otherlv_1= 'A[]'
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAGExpr2340); 

                        	newLeafNode(otherlv_1, grammarAccess.getAGExprAccess().getAKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1014:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1015:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAGExprAccess().getAGExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1020:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1021:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1021:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1022:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getAGExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleAGExpr2371);
            lv_expr_3_0=ruleNotExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAGExprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"NotExpr");
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
    // $ANTLR end "ruleAGExpr"


    // $ANTLR start "entryRuleAtomExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1046:1: entryRuleAtomExpr returns [EObject current=null] : iv_ruleAtomExpr= ruleAtomExpr EOF ;
    public final EObject entryRuleAtomExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1047:2: (iv_ruleAtomExpr= ruleAtomExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1048:2: iv_ruleAtomExpr= ruleAtomExpr EOF
            {
             newCompositeNode(grammarAccess.getAtomExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomExpr_in_entryRuleAtomExpr2407);
            iv_ruleAtomExpr=ruleAtomExpr();

            state._fsp--;

             current =iv_ruleAtomExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomExpr2417); 

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
    // $ANTLR end "entryRuleAtomExpr"


    // $ANTLR start "ruleAtomExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1055:1: ruleAtomExpr returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr ) ;
    public final EObject ruleAtomExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_PredicateExpr_3 = null;

        EObject this_ComparisonExpr_4 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1058:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1059:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1059:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt14=1;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 41:
            case 42:
            case 43:
            case 63:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1059:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1059:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1059:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAtomExpr2455); 

                        	newLeafNode(otherlv_0, grammarAccess.getAtomExprAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtomExprAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAtomExpr2477);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAtomExpr2488); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtomExprAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1078:5: this_PredicateExpr_3= rulePredicateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAtomExprAccess().getPredicateExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePredicateExpr_in_ruleAtomExpr2517);
                    this_PredicateExpr_3=rulePredicateExpr();

                    state._fsp--;

                     
                            current = this_PredicateExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1088:5: this_ComparisonExpr_4= ruleComparisonExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAtomExprAccess().getComparisonExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpr_in_ruleAtomExpr2544);
                    this_ComparisonExpr_4=ruleComparisonExpr();

                    state._fsp--;

                     
                            current = this_ComparisonExpr_4; 
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
    // $ANTLR end "ruleAtomExpr"


    // $ANTLR start "entryRulePredicateExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1104:1: entryRulePredicateExpr returns [EObject current=null] : iv_rulePredicateExpr= rulePredicateExpr EOF ;
    public final EObject entryRulePredicateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1105:2: (iv_rulePredicateExpr= rulePredicateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1106:2: iv_rulePredicateExpr= rulePredicateExpr EOF
            {
             newCompositeNode(grammarAccess.getPredicateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicateExpr_in_entryRulePredicateExpr2579);
            iv_rulePredicateExpr=rulePredicateExpr();

            state._fsp--;

             current =iv_rulePredicateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicateExpr2589); 

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
    // $ANTLR end "entryRulePredicateExpr"


    // $ANTLR start "rulePredicateExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1113:1: rulePredicateExpr returns [EObject current=null] : (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_BufferOverflowExpr_3= ruleBufferOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr ) ;
    public final EObject rulePredicateExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TrueExpr_0 = null;

        EObject this_FalseExpr_1 = null;

        EObject this_DeadlockExpr_2 = null;

        EObject this_BufferOverflowExpr_3 = null;

        EObject this_StateExpr_4 = null;

        EObject this_MessageExpr_5 = null;

        EObject this_TransitionExpr_6 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1116:28: ( (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_BufferOverflowExpr_3= ruleBufferOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1117:1: (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_BufferOverflowExpr_3= ruleBufferOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1117:1: (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_BufferOverflowExpr_3= ruleBufferOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 31:
                {
                alt15=4;
                }
                break;
            case 34:
            case 35:
            case 37:
                {
                alt15=5;
                }
                break;
            case 38:
            case 39:
                {
                alt15=6;
                }
                break;
            case 40:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1118:5: this_TrueExpr_0= ruleTrueExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getTrueExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTrueExpr_in_rulePredicateExpr2636);
                    this_TrueExpr_0=ruleTrueExpr();

                    state._fsp--;

                     
                            current = this_TrueExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1128:5: this_FalseExpr_1= ruleFalseExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getFalseExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFalseExpr_in_rulePredicateExpr2663);
                    this_FalseExpr_1=ruleFalseExpr();

                    state._fsp--;

                     
                            current = this_FalseExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1138:5: this_DeadlockExpr_2= ruleDeadlockExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getDeadlockExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeadlockExpr_in_rulePredicateExpr2690);
                    this_DeadlockExpr_2=ruleDeadlockExpr();

                    state._fsp--;

                     
                            current = this_DeadlockExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1148:5: this_BufferOverflowExpr_3= ruleBufferOverflowExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getBufferOverflowExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBufferOverflowExpr_in_rulePredicateExpr2717);
                    this_BufferOverflowExpr_3=ruleBufferOverflowExpr();

                    state._fsp--;

                     
                            current = this_BufferOverflowExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1158:5: this_StateExpr_4= ruleStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getStateExprParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateExpr_in_rulePredicateExpr2744);
                    this_StateExpr_4=ruleStateExpr();

                    state._fsp--;

                     
                            current = this_StateExpr_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1168:5: this_MessageExpr_5= ruleMessageExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getMessageExprParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageExpr_in_rulePredicateExpr2771);
                    this_MessageExpr_5=ruleMessageExpr();

                    state._fsp--;

                     
                            current = this_MessageExpr_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1178:5: this_TransitionExpr_6= ruleTransitionExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getTransitionExprParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTransitionExpr_in_rulePredicateExpr2798);
                    this_TransitionExpr_6=ruleTransitionExpr();

                    state._fsp--;

                     
                            current = this_TransitionExpr_6; 
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
    // $ANTLR end "rulePredicateExpr"


    // $ANTLR start "entryRuleDeadlockExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1194:1: entryRuleDeadlockExpr returns [EObject current=null] : iv_ruleDeadlockExpr= ruleDeadlockExpr EOF ;
    public final EObject entryRuleDeadlockExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadlockExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1195:2: (iv_ruleDeadlockExpr= ruleDeadlockExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1196:2: iv_ruleDeadlockExpr= ruleDeadlockExpr EOF
            {
             newCompositeNode(grammarAccess.getDeadlockExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadlockExpr_in_entryRuleDeadlockExpr2833);
            iv_ruleDeadlockExpr=ruleDeadlockExpr();

            state._fsp--;

             current =iv_ruleDeadlockExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeadlockExpr2843); 

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
    // $ANTLR end "entryRuleDeadlockExpr"


    // $ANTLR start "ruleDeadlockExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1203:1: ruleDeadlockExpr returns [EObject current=null] : ( () otherlv_1= 'deadlock' ) ;
    public final EObject ruleDeadlockExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1206:28: ( ( () otherlv_1= 'deadlock' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1207:1: ( () otherlv_1= 'deadlock' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1207:1: ( () otherlv_1= 'deadlock' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1207:2: () otherlv_1= 'deadlock'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1207:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1208:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeadlockExprAccess().getDeadlockExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDeadlockExpr2889); 

                	newLeafNode(otherlv_1, grammarAccess.getDeadlockExprAccess().getDeadlockKeyword_1());
                

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
    // $ANTLR end "ruleDeadlockExpr"


    // $ANTLR start "entryRuleBufferOverflowExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1225:1: entryRuleBufferOverflowExpr returns [EObject current=null] : iv_ruleBufferOverflowExpr= ruleBufferOverflowExpr EOF ;
    public final EObject entryRuleBufferOverflowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferOverflowExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1226:2: (iv_ruleBufferOverflowExpr= ruleBufferOverflowExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1227:2: iv_ruleBufferOverflowExpr= ruleBufferOverflowExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferOverflowExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBufferOverflowExpr_in_entryRuleBufferOverflowExpr2925);
            iv_ruleBufferOverflowExpr=ruleBufferOverflowExpr();

            state._fsp--;

             current =iv_ruleBufferOverflowExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBufferOverflowExpr2935); 

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
    // $ANTLR end "entryRuleBufferOverflowExpr"


    // $ANTLR start "ruleBufferOverflowExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1234:1: ruleBufferOverflowExpr returns [EObject current=null] : ( () otherlv_1= 'bufferOverflow' ) ;
    public final EObject ruleBufferOverflowExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1237:28: ( ( () otherlv_1= 'bufferOverflow' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1238:1: ( () otherlv_1= 'bufferOverflow' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1238:1: ( () otherlv_1= 'bufferOverflow' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1238:2: () otherlv_1= 'bufferOverflow'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1238:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1239:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBufferOverflowExprAccess().getBufferOverflowExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBufferOverflowExpr2981); 

                	newLeafNode(otherlv_1, grammarAccess.getBufferOverflowExprAccess().getBufferOverflowKeyword_1());
                

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
    // $ANTLR end "ruleBufferOverflowExpr"


    // $ANTLR start "entryRuleTrueExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1256:1: entryRuleTrueExpr returns [EObject current=null] : iv_ruleTrueExpr= ruleTrueExpr EOF ;
    public final EObject entryRuleTrueExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1257:2: (iv_ruleTrueExpr= ruleTrueExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1258:2: iv_ruleTrueExpr= ruleTrueExpr EOF
            {
             newCompositeNode(grammarAccess.getTrueExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTrueExpr_in_entryRuleTrueExpr3017);
            iv_ruleTrueExpr=ruleTrueExpr();

            state._fsp--;

             current =iv_ruleTrueExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTrueExpr3027); 

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
    // $ANTLR end "entryRuleTrueExpr"


    // $ANTLR start "ruleTrueExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1265:1: ruleTrueExpr returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1268:28: ( ( () otherlv_1= 'true' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1269:1: ( () otherlv_1= 'true' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1269:1: ( () otherlv_1= 'true' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1269:2: () otherlv_1= 'true'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1269:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTrueExprAccess().getTrueExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTrueExpr3073); 

                	newLeafNode(otherlv_1, grammarAccess.getTrueExprAccess().getTrueKeyword_1());
                

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
    // $ANTLR end "ruleTrueExpr"


    // $ANTLR start "entryRuleFalseExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1287:1: entryRuleFalseExpr returns [EObject current=null] : iv_ruleFalseExpr= ruleFalseExpr EOF ;
    public final EObject entryRuleFalseExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1288:2: (iv_ruleFalseExpr= ruleFalseExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1289:2: iv_ruleFalseExpr= ruleFalseExpr EOF
            {
             newCompositeNode(grammarAccess.getFalseExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFalseExpr_in_entryRuleFalseExpr3109);
            iv_ruleFalseExpr=ruleFalseExpr();

            state._fsp--;

             current =iv_ruleFalseExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFalseExpr3119); 

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
    // $ANTLR end "entryRuleFalseExpr"


    // $ANTLR start "ruleFalseExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1296:1: ruleFalseExpr returns [EObject current=null] : ( () otherlv_1= 'false' ) ;
    public final EObject ruleFalseExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1299:28: ( ( () otherlv_1= 'false' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1300:1: ( () otherlv_1= 'false' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1300:1: ( () otherlv_1= 'false' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1300:2: () otherlv_1= 'false'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1300:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFalseExprAccess().getFalseExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFalseExpr3165); 

                	newLeafNode(otherlv_1, grammarAccess.getFalseExprAccess().getFalseKeyword_1());
                

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
    // $ANTLR end "ruleFalseExpr"


    // $ANTLR start "entryRuleStateExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1318:1: entryRuleStateExpr returns [EObject current=null] : iv_ruleStateExpr= ruleStateExpr EOF ;
    public final EObject entryRuleStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1319:2: (iv_ruleStateExpr= ruleStateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1320:2: iv_ruleStateExpr= ruleStateExpr EOF
            {
             newCompositeNode(grammarAccess.getStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateExpr_in_entryRuleStateExpr3201);
            iv_ruleStateExpr=ruleStateExpr();

            state._fsp--;

             current =iv_ruleStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateExpr3211); 

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
    // $ANTLR end "entryRuleStateExpr"


    // $ANTLR start "ruleStateExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1327:1: ruleStateExpr returns [EObject current=null] : (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr ) ;
    public final EObject ruleStateExpr() throws RecognitionException {
        EObject current = null;

        EObject this_StateActiveExpr_0 = null;

        EObject this_SubstateOfExpr_1 = null;

        EObject this_StateInStatechartExpr_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1330:28: ( (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1331:1: (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1331:1: (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 37:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1332:5: this_StateActiveExpr_0= ruleStateActiveExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getStateActiveExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateActiveExpr_in_ruleStateExpr3258);
                    this_StateActiveExpr_0=ruleStateActiveExpr();

                    state._fsp--;

                     
                            current = this_StateActiveExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1342:5: this_SubstateOfExpr_1= ruleSubstateOfExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getSubstateOfExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubstateOfExpr_in_ruleStateExpr3285);
                    this_SubstateOfExpr_1=ruleSubstateOfExpr();

                    state._fsp--;

                     
                            current = this_SubstateOfExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1352:5: this_StateInStatechartExpr_2= ruleStateInStatechartExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getStateInStatechartExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateInStatechartExpr_in_ruleStateExpr3312);
                    this_StateInStatechartExpr_2=ruleStateInStatechartExpr();

                    state._fsp--;

                     
                            current = this_StateInStatechartExpr_2; 
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
    // $ANTLR end "ruleStateExpr"


    // $ANTLR start "entryRuleStateActiveExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1368:1: entryRuleStateActiveExpr returns [EObject current=null] : iv_ruleStateActiveExpr= ruleStateActiveExpr EOF ;
    public final EObject entryRuleStateActiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateActiveExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1369:2: (iv_ruleStateActiveExpr= ruleStateActiveExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1370:2: iv_ruleStateActiveExpr= ruleStateActiveExpr EOF
            {
             newCompositeNode(grammarAccess.getStateActiveExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateActiveExpr_in_entryRuleStateActiveExpr3347);
            iv_ruleStateActiveExpr=ruleStateActiveExpr();

            state._fsp--;

             current =iv_ruleStateActiveExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateActiveExpr3357); 

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
    // $ANTLR end "entryRuleStateActiveExpr"


    // $ANTLR start "ruleStateActiveExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1377:1: ruleStateActiveExpr returns [EObject current=null] : (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleStateActiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_state_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1380:28: ( (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1381:1: (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1381:1: (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1381:3: otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleStateActiveExpr3394); 

                	newLeafNode(otherlv_0, grammarAccess.getStateActiveExprAccess().getStateActiveKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStateActiveExpr3406); 

                	newLeafNode(otherlv_1, grammarAccess.getStateActiveExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1389:1: ( (lv_state_2_0= ruleStateMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1390:1: (lv_state_2_0= ruleStateMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1390:1: (lv_state_2_0= ruleStateMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1391:3: lv_state_2_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getStateActiveExprAccess().getStateStateMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_ruleStateActiveExpr3427);
            lv_state_2_0=ruleStateMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateActiveExprRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_2_0, 
                    		"StateMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStateActiveExpr3439); 

                	newLeafNode(otherlv_3, grammarAccess.getStateActiveExprAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleStateActiveExpr"


    // $ANTLR start "entryRuleSubstateOfExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1419:1: entryRuleSubstateOfExpr returns [EObject current=null] : iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF ;
    public final EObject entryRuleSubstateOfExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstateOfExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1420:2: (iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1421:2: iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF
            {
             newCompositeNode(grammarAccess.getSubstateOfExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubstateOfExpr_in_entryRuleSubstateOfExpr3475);
            iv_ruleSubstateOfExpr=ruleSubstateOfExpr();

            state._fsp--;

             current =iv_ruleSubstateOfExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubstateOfExpr3485); 

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
    // $ANTLR end "entryRuleSubstateOfExpr"


    // $ANTLR start "ruleSubstateOfExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1428:1: ruleSubstateOfExpr returns [EObject current=null] : (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' ) ;
    public final EObject ruleSubstateOfExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_state_2_0 = null;

        EObject lv_superstate_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1431:28: ( (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1432:1: (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1432:1: (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1432:3: otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSubstateOfExpr3522); 

                	newLeafNode(otherlv_0, grammarAccess.getSubstateOfExprAccess().getSubstateOfKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSubstateOfExpr3534); 

                	newLeafNode(otherlv_1, grammarAccess.getSubstateOfExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1440:1: ( (lv_state_2_0= ruleStateMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1441:1: (lv_state_2_0= ruleStateMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1441:1: (lv_state_2_0= ruleStateMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1442:3: lv_state_2_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubstateOfExprAccess().getStateStateMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_ruleSubstateOfExpr3555);
            lv_state_2_0=ruleStateMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubstateOfExprRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_2_0, 
                    		"StateMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSubstateOfExpr3567); 

                	newLeafNode(otherlv_3, grammarAccess.getSubstateOfExprAccess().getCommaKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1462:1: ( (lv_superstate_4_0= ruleStateMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1463:1: (lv_superstate_4_0= ruleStateMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1463:1: (lv_superstate_4_0= ruleStateMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1464:3: lv_superstate_4_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubstateOfExprAccess().getSuperstateStateMapExprParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_ruleSubstateOfExpr3588);
            lv_superstate_4_0=ruleStateMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubstateOfExprRule());
            	        }
                   		set(
                   			current, 
                   			"superstate",
                    		lv_superstate_4_0, 
                    		"StateMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSubstateOfExpr3600); 

                	newLeafNode(otherlv_5, grammarAccess.getSubstateOfExprAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleSubstateOfExpr"


    // $ANTLR start "entryRuleStateInStatechartExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1492:1: entryRuleStateInStatechartExpr returns [EObject current=null] : iv_ruleStateInStatechartExpr= ruleStateInStatechartExpr EOF ;
    public final EObject entryRuleStateInStatechartExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateInStatechartExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1493:2: (iv_ruleStateInStatechartExpr= ruleStateInStatechartExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1494:2: iv_ruleStateInStatechartExpr= ruleStateInStatechartExpr EOF
            {
             newCompositeNode(grammarAccess.getStateInStatechartExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateInStatechartExpr_in_entryRuleStateInStatechartExpr3636);
            iv_ruleStateInStatechartExpr=ruleStateInStatechartExpr();

            state._fsp--;

             current =iv_ruleStateInStatechartExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateInStatechartExpr3646); 

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
    // $ANTLR end "entryRuleStateInStatechartExpr"


    // $ANTLR start "ruleStateInStatechartExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1501:1: ruleStateInStatechartExpr returns [EObject current=null] : (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' ) ;
    public final EObject ruleStateInStatechartExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_state_2_0 = null;

        EObject lv_statechart_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1504:28: ( (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1505:1: (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1505:1: (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1505:3: otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleStateInStatechartExpr3683); 

                	newLeafNode(otherlv_0, grammarAccess.getStateInStatechartExprAccess().getStateInStatechartKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStateInStatechartExpr3695); 

                	newLeafNode(otherlv_1, grammarAccess.getStateInStatechartExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1513:1: ( (lv_state_2_0= ruleStateMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1514:1: (lv_state_2_0= ruleStateMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1514:1: (lv_state_2_0= ruleStateMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1515:3: lv_state_2_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getStateInStatechartExprAccess().getStateStateMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_ruleStateInStatechartExpr3716);
            lv_state_2_0=ruleStateMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateInStatechartExprRule());
            	        }
                   		set(
                   			current, 
                   			"state",
                    		lv_state_2_0, 
                    		"StateMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleStateInStatechartExpr3728); 

                	newLeafNode(otherlv_3, grammarAccess.getStateInStatechartExprAccess().getCommaKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1535:1: ( (lv_statechart_4_0= ruleStatechartMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1536:1: (lv_statechart_4_0= ruleStatechartMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1536:1: (lv_statechart_4_0= ruleStatechartMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1537:3: lv_statechart_4_0= ruleStatechartMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getStateInStatechartExprAccess().getStatechartStatechartMapExprParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStatechartMapExpr_in_ruleStateInStatechartExpr3749);
            lv_statechart_4_0=ruleStatechartMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateInStatechartExprRule());
            	        }
                   		set(
                   			current, 
                   			"statechart",
                    		lv_statechart_4_0, 
                    		"StatechartMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleStateInStatechartExpr3761); 

                	newLeafNode(otherlv_5, grammarAccess.getStateInStatechartExprAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleStateInStatechartExpr"


    // $ANTLR start "entryRuleMessageExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1565:1: entryRuleMessageExpr returns [EObject current=null] : iv_ruleMessageExpr= ruleMessageExpr EOF ;
    public final EObject entryRuleMessageExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1566:2: (iv_ruleMessageExpr= ruleMessageExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1567:2: iv_ruleMessageExpr= ruleMessageExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageExpr_in_entryRuleMessageExpr3797);
            iv_ruleMessageExpr=ruleMessageExpr();

            state._fsp--;

             current =iv_ruleMessageExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageExpr3807); 

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
    // $ANTLR end "entryRuleMessageExpr"


    // $ANTLR start "ruleMessageExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1574:1: ruleMessageExpr returns [EObject current=null] : (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr ) ;
    public final EObject ruleMessageExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MessageInBufferExpr_0 = null;

        EObject this_MessageInTransitExpr_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1577:28: ( (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1578:1: (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1578:1: (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            else if ( (LA17_0==38) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1579:5: this_MessageInBufferExpr_0= ruleMessageInBufferExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getMessageInBufferExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageInBufferExpr_in_ruleMessageExpr3854);
                    this_MessageInBufferExpr_0=ruleMessageInBufferExpr();

                    state._fsp--;

                     
                            current = this_MessageInBufferExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1589:5: this_MessageInTransitExpr_1= ruleMessageInTransitExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getMessageInTransitExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageInTransitExpr_in_ruleMessageExpr3881);
                    this_MessageInTransitExpr_1=ruleMessageInTransitExpr();

                    state._fsp--;

                     
                            current = this_MessageInTransitExpr_1; 
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
    // $ANTLR end "ruleMessageExpr"


    // $ANTLR start "entryRuleMessageInTransitExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1605:1: entryRuleMessageInTransitExpr returns [EObject current=null] : iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF ;
    public final EObject entryRuleMessageInTransitExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInTransitExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1606:2: (iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1607:2: iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageInTransitExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageInTransitExpr_in_entryRuleMessageInTransitExpr3916);
            iv_ruleMessageInTransitExpr=ruleMessageInTransitExpr();

            state._fsp--;

             current =iv_ruleMessageInTransitExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageInTransitExpr3926); 

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
    // $ANTLR end "entryRuleMessageInTransitExpr"


    // $ANTLR start "ruleMessageInTransitExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1614:1: ruleMessageInTransitExpr returns [EObject current=null] : (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleMessageInTransitExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_message_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1617:28: ( (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1618:1: (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1618:1: (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1618:3: otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMessageInTransitExpr3963); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageInTransitExprAccess().getMessageInTransitKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMessageInTransitExpr3975); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageInTransitExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1626:1: ( (lv_message_2_0= ruleMessageMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1627:1: (lv_message_2_0= ruleMessageMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1627:1: (lv_message_2_0= ruleMessageMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1628:3: lv_message_2_0= ruleMessageMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageInTransitExprAccess().getMessageMessageMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMessageMapExpr_in_ruleMessageInTransitExpr3996);
            lv_message_2_0=ruleMessageMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageInTransitExprRule());
            	        }
                   		set(
                   			current, 
                   			"message",
                    		lv_message_2_0, 
                    		"MessageMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMessageInTransitExpr4008); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageInTransitExprAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleMessageInTransitExpr"


    // $ANTLR start "entryRuleMessageInBufferExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1656:1: entryRuleMessageInBufferExpr returns [EObject current=null] : iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF ;
    public final EObject entryRuleMessageInBufferExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInBufferExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1657:2: (iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1658:2: iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageInBufferExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageInBufferExpr_in_entryRuleMessageInBufferExpr4044);
            iv_ruleMessageInBufferExpr=ruleMessageInBufferExpr();

            state._fsp--;

             current =iv_ruleMessageInBufferExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageInBufferExpr4054); 

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
    // $ANTLR end "entryRuleMessageInBufferExpr"


    // $ANTLR start "ruleMessageInBufferExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1665:1: ruleMessageInBufferExpr returns [EObject current=null] : (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' ) ;
    public final EObject ruleMessageInBufferExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_message_2_0 = null;

        EObject lv_buffer_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1668:28: ( (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1669:1: (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1669:1: (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1669:3: otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMessageInBufferExpr4091); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageInBufferExprAccess().getMessageInBufferKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMessageInBufferExpr4103); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageInBufferExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1677:1: ( (lv_message_2_0= ruleMessageMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1678:1: (lv_message_2_0= ruleMessageMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1678:1: (lv_message_2_0= ruleMessageMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1679:3: lv_message_2_0= ruleMessageMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageInBufferExprAccess().getMessageMessageMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMessageMapExpr_in_ruleMessageInBufferExpr4124);
            lv_message_2_0=ruleMessageMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageInBufferExprRule());
            	        }
                   		set(
                   			current, 
                   			"message",
                    		lv_message_2_0, 
                    		"MessageMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMessageInBufferExpr4136); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageInBufferExprAccess().getCommaKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1699:1: ( (lv_buffer_4_0= ruleBufferMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1700:1: (lv_buffer_4_0= ruleBufferMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1700:1: (lv_buffer_4_0= ruleBufferMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1701:3: lv_buffer_4_0= ruleBufferMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageInBufferExprAccess().getBufferBufferMapExprParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBufferMapExpr_in_ruleMessageInBufferExpr4157);
            lv_buffer_4_0=ruleBufferMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageInBufferExprRule());
            	        }
                   		set(
                   			current, 
                   			"buffer",
                    		lv_buffer_4_0, 
                    		"BufferMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMessageInBufferExpr4169); 

                	newLeafNode(otherlv_5, grammarAccess.getMessageInBufferExprAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleMessageInBufferExpr"


    // $ANTLR start "entryRuleTransitionExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1729:1: entryRuleTransitionExpr returns [EObject current=null] : iv_ruleTransitionExpr= ruleTransitionExpr EOF ;
    public final EObject entryRuleTransitionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1730:2: (iv_ruleTransitionExpr= ruleTransitionExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1731:2: iv_ruleTransitionExpr= ruleTransitionExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransitionExpr_in_entryRuleTransitionExpr4205);
            iv_ruleTransitionExpr=ruleTransitionExpr();

            state._fsp--;

             current =iv_ruleTransitionExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionExpr4215); 

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
    // $ANTLR end "entryRuleTransitionExpr"


    // $ANTLR start "ruleTransitionExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1738:1: ruleTransitionExpr returns [EObject current=null] : this_TransitionFiringExpr_0= ruleTransitionFiringExpr ;
    public final EObject ruleTransitionExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TransitionFiringExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1741:28: (this_TransitionFiringExpr_0= ruleTransitionFiringExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1743:5: this_TransitionFiringExpr_0= ruleTransitionFiringExpr
            {
             
                    newCompositeNode(grammarAccess.getTransitionExprAccess().getTransitionFiringExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTransitionFiringExpr_in_ruleTransitionExpr4261);
            this_TransitionFiringExpr_0=ruleTransitionFiringExpr();

            state._fsp--;

             
                    current = this_TransitionFiringExpr_0; 
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
    // $ANTLR end "ruleTransitionExpr"


    // $ANTLR start "entryRuleTransitionFiringExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1759:1: entryRuleTransitionFiringExpr returns [EObject current=null] : iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF ;
    public final EObject entryRuleTransitionFiringExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFiringExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1760:2: (iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1761:2: iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionFiringExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransitionFiringExpr_in_entryRuleTransitionFiringExpr4295);
            iv_ruleTransitionFiringExpr=ruleTransitionFiringExpr();

            state._fsp--;

             current =iv_ruleTransitionFiringExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionFiringExpr4305); 

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
    // $ANTLR end "entryRuleTransitionFiringExpr"


    // $ANTLR start "ruleTransitionFiringExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1768:1: ruleTransitionFiringExpr returns [EObject current=null] : (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleTransitionFiringExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transition_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1771:28: ( (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1772:1: (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1772:1: (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1772:3: otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleTransitionFiringExpr4342); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionFiringExprAccess().getTransitionFiringKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTransitionFiringExpr4354); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionFiringExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1780:1: ( (lv_transition_2_0= ruleTransitionMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1781:1: (lv_transition_2_0= ruleTransitionMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1781:1: (lv_transition_2_0= ruleTransitionMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1782:3: lv_transition_2_0= ruleTransitionMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getTransitionFiringExprAccess().getTransitionTransitionMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransitionMapExpr_in_ruleTransitionFiringExpr4375);
            lv_transition_2_0=ruleTransitionMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionFiringExprRule());
            	        }
                   		set(
                   			current, 
                   			"transition",
                    		lv_transition_2_0, 
                    		"TransitionMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTransitionFiringExpr4387); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionFiringExprAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleTransitionFiringExpr"


    // $ANTLR start "entryRuleComparisonExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1810:1: entryRuleComparisonExpr returns [EObject current=null] : iv_ruleComparisonExpr= ruleComparisonExpr EOF ;
    public final EObject entryRuleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1811:2: (iv_ruleComparisonExpr= ruleComparisonExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1812:2: iv_ruleComparisonExpr= ruleComparisonExpr EOF
            {
             newCompositeNode(grammarAccess.getComparisonExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr4423);
            iv_ruleComparisonExpr=ruleComparisonExpr();

            state._fsp--;

             current =iv_ruleComparisonExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpr4433); 

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
    // $ANTLR end "entryRuleComparisonExpr"


    // $ANTLR start "ruleComparisonExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1819:1: ruleComparisonExpr returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) ) ;
    public final EObject ruleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1822:28: ( ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1823:1: ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1823:1: ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1823:2: () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1823:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1824:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComparisonExprAccess().getComparisonExprAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1829:2: ( (lv_lhs_1_0= ruleMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1830:1: (lv_lhs_1_0= ruleMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1830:1: (lv_lhs_1_0= ruleMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1831:3: lv_lhs_1_0= ruleMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getLhsMapExprParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMapExpr_in_ruleComparisonExpr4488);
            lv_lhs_1_0=ruleMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_1_0, 
                    		"MapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1847:2: ( (lv_op_2_0= ruleComparisonOp ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1848:1: (lv_op_2_0= ruleComparisonOp )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1848:1: (lv_op_2_0= ruleComparisonOp )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1849:3: lv_op_2_0= ruleComparisonOp
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getOpComparisonOpEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparisonOp_in_ruleComparisonExpr4509);
            lv_op_2_0=ruleComparisonOp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_2_0, 
                    		"ComparisonOp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1865:2: ( (lv_rhs_3_0= ruleMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1866:1: (lv_rhs_3_0= ruleMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1866:1: (lv_rhs_3_0= ruleMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1867:3: lv_rhs_3_0= ruleMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getRhsMapExprParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMapExpr_in_ruleComparisonExpr4530);
            lv_rhs_3_0=ruleMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"MapExpr");
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
    // $ANTLR end "ruleComparisonExpr"


    // $ANTLR start "entryRuleMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1891:1: entryRuleMapExpr returns [EObject current=null] : iv_ruleMapExpr= ruleMapExpr EOF ;
    public final EObject entryRuleMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1892:2: (iv_ruleMapExpr= ruleMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1893:2: iv_ruleMapExpr= ruleMapExpr EOF
            {
             newCompositeNode(grammarAccess.getMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMapExpr_in_entryRuleMapExpr4566);
            iv_ruleMapExpr=ruleMapExpr();

            state._fsp--;

             current =iv_ruleMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapExpr4576); 

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
    // $ANTLR end "entryRuleMapExpr"


    // $ANTLR start "ruleMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1900:1: ruleMapExpr returns [EObject current=null] : (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr ) ;
    public final EObject ruleMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;

        EObject this_BufferMessageCountExpr_1 = null;

        EObject this_ConstExpr_2 = null;

        EObject this_SourceStateExpr_3 = null;

        EObject this_TargetStateExpr_4 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1903:28: ( (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1904:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1904:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr )
            int alt18=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case 41:
                {
                alt18=2;
                }
                break;
            case RULE_INT:
            case 63:
                {
                alt18=3;
                }
                break;
            case 42:
                {
                alt18=4;
                }
                break;
            case 43:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1905:5: this_MumlElemExpr_0= ruleMumlElemExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getMumlElemExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleMapExpr4623);
                    this_MumlElemExpr_0=ruleMumlElemExpr();

                    state._fsp--;

                     
                            current = this_MumlElemExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1915:5: this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getBufferMessageCountExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBufferMessageCountExpr_in_ruleMapExpr4650);
                    this_BufferMessageCountExpr_1=ruleBufferMessageCountExpr();

                    state._fsp--;

                     
                            current = this_BufferMessageCountExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1925:5: this_ConstExpr_2= ruleConstExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getConstExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstExpr_in_ruleMapExpr4677);
                    this_ConstExpr_2=ruleConstExpr();

                    state._fsp--;

                     
                            current = this_ConstExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1935:5: this_SourceStateExpr_3= ruleSourceStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getSourceStateExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSourceStateExpr_in_ruleMapExpr4704);
                    this_SourceStateExpr_3=ruleSourceStateExpr();

                    state._fsp--;

                     
                            current = this_SourceStateExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1945:5: this_TargetStateExpr_4= ruleTargetStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getTargetStateExprParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTargetStateExpr_in_ruleMapExpr4731);
                    this_TargetStateExpr_4=ruleTargetStateExpr();

                    state._fsp--;

                     
                            current = this_TargetStateExpr_4; 
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
    // $ANTLR end "ruleMapExpr"


    // $ANTLR start "entryRuleTransitionMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1963:1: entryRuleTransitionMapExpr returns [EObject current=null] : iv_ruleTransitionMapExpr= ruleTransitionMapExpr EOF ;
    public final EObject entryRuleTransitionMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1964:2: (iv_ruleTransitionMapExpr= ruleTransitionMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1965:2: iv_ruleTransitionMapExpr= ruleTransitionMapExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransitionMapExpr_in_entryRuleTransitionMapExpr4768);
            iv_ruleTransitionMapExpr=ruleTransitionMapExpr();

            state._fsp--;

             current =iv_ruleTransitionMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionMapExpr4778); 

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
    // $ANTLR end "entryRuleTransitionMapExpr"


    // $ANTLR start "ruleTransitionMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1972:1: ruleTransitionMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleTransitionMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1975:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1977:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getTransitionMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleTransitionMapExpr4824);
            this_MumlElemExpr_0=ruleMumlElemExpr();

            state._fsp--;

             
                    current = this_MumlElemExpr_0; 
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
    // $ANTLR end "ruleTransitionMapExpr"


    // $ANTLR start "entryRuleStateMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1993:1: entryRuleStateMapExpr returns [EObject current=null] : iv_ruleStateMapExpr= ruleStateMapExpr EOF ;
    public final EObject entryRuleStateMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1994:2: (iv_ruleStateMapExpr= ruleStateMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1995:2: iv_ruleStateMapExpr= ruleStateMapExpr EOF
            {
             newCompositeNode(grammarAccess.getStateMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_entryRuleStateMapExpr4858);
            iv_ruleStateMapExpr=ruleStateMapExpr();

            state._fsp--;

             current =iv_ruleStateMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMapExpr4868); 

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
    // $ANTLR end "entryRuleStateMapExpr"


    // $ANTLR start "ruleStateMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2002:1: ruleStateMapExpr returns [EObject current=null] : (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr ) ;
    public final EObject ruleStateMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;

        EObject this_SourceStateExpr_1 = null;

        EObject this_TargetStateExpr_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2005:28: ( (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2006:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2006:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case 42:
                {
                alt19=2;
                }
                break;
            case 43:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2007:5: this_MumlElemExpr_0= ruleMumlElemExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateMapExprAccess().getMumlElemExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleStateMapExpr4915);
                    this_MumlElemExpr_0=ruleMumlElemExpr();

                    state._fsp--;

                     
                            current = this_MumlElemExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2017:5: this_SourceStateExpr_1= ruleSourceStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateMapExprAccess().getSourceStateExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSourceStateExpr_in_ruleStateMapExpr4942);
                    this_SourceStateExpr_1=ruleSourceStateExpr();

                    state._fsp--;

                     
                            current = this_SourceStateExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2027:5: this_TargetStateExpr_2= ruleTargetStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateMapExprAccess().getTargetStateExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTargetStateExpr_in_ruleStateMapExpr4969);
                    this_TargetStateExpr_2=ruleTargetStateExpr();

                    state._fsp--;

                     
                            current = this_TargetStateExpr_2; 
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
    // $ANTLR end "ruleStateMapExpr"


    // $ANTLR start "entryRuleStatechartMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2043:1: entryRuleStatechartMapExpr returns [EObject current=null] : iv_ruleStatechartMapExpr= ruleStatechartMapExpr EOF ;
    public final EObject entryRuleStatechartMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2044:2: (iv_ruleStatechartMapExpr= ruleStatechartMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2045:2: iv_ruleStatechartMapExpr= ruleStatechartMapExpr EOF
            {
             newCompositeNode(grammarAccess.getStatechartMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatechartMapExpr_in_entryRuleStatechartMapExpr5004);
            iv_ruleStatechartMapExpr=ruleStatechartMapExpr();

            state._fsp--;

             current =iv_ruleStatechartMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatechartMapExpr5014); 

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
    // $ANTLR end "entryRuleStatechartMapExpr"


    // $ANTLR start "ruleStatechartMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2052:1: ruleStatechartMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleStatechartMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2055:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2057:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getStatechartMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleStatechartMapExpr5060);
            this_MumlElemExpr_0=ruleMumlElemExpr();

            state._fsp--;

             
                    current = this_MumlElemExpr_0; 
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
    // $ANTLR end "ruleStatechartMapExpr"


    // $ANTLR start "entryRuleBufferMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2073:1: entryRuleBufferMapExpr returns [EObject current=null] : iv_ruleBufferMapExpr= ruleBufferMapExpr EOF ;
    public final EObject entryRuleBufferMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2074:2: (iv_ruleBufferMapExpr= ruleBufferMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2075:2: iv_ruleBufferMapExpr= ruleBufferMapExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBufferMapExpr_in_entryRuleBufferMapExpr5094);
            iv_ruleBufferMapExpr=ruleBufferMapExpr();

            state._fsp--;

             current =iv_ruleBufferMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBufferMapExpr5104); 

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
    // $ANTLR end "entryRuleBufferMapExpr"


    // $ANTLR start "ruleBufferMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2082:1: ruleBufferMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleBufferMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2085:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2087:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getBufferMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleBufferMapExpr5150);
            this_MumlElemExpr_0=ruleMumlElemExpr();

            state._fsp--;

             
                    current = this_MumlElemExpr_0; 
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
    // $ANTLR end "ruleBufferMapExpr"


    // $ANTLR start "entryRuleMessageMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2103:1: entryRuleMessageMapExpr returns [EObject current=null] : iv_ruleMessageMapExpr= ruleMessageMapExpr EOF ;
    public final EObject entryRuleMessageMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2104:2: (iv_ruleMessageMapExpr= ruleMessageMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2105:2: iv_ruleMessageMapExpr= ruleMessageMapExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageMapExpr_in_entryRuleMessageMapExpr5184);
            iv_ruleMessageMapExpr=ruleMessageMapExpr();

            state._fsp--;

             current =iv_ruleMessageMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageMapExpr5194); 

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
    // $ANTLR end "entryRuleMessageMapExpr"


    // $ANTLR start "ruleMessageMapExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2112:1: ruleMessageMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleMessageMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2115:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2117:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getMessageMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleMessageMapExpr5240);
            this_MumlElemExpr_0=ruleMumlElemExpr();

            state._fsp--;

             
                    current = this_MumlElemExpr_0; 
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
    // $ANTLR end "ruleMessageMapExpr"


    // $ANTLR start "entryRuleBufferMessageCountExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2133:1: entryRuleBufferMessageCountExpr returns [EObject current=null] : iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF ;
    public final EObject entryRuleBufferMessageCountExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferMessageCountExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2134:2: (iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2135:2: iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferMessageCountExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBufferMessageCountExpr_in_entryRuleBufferMessageCountExpr5274);
            iv_ruleBufferMessageCountExpr=ruleBufferMessageCountExpr();

            state._fsp--;

             current =iv_ruleBufferMessageCountExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBufferMessageCountExpr5284); 

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
    // $ANTLR end "entryRuleBufferMessageCountExpr"


    // $ANTLR start "ruleBufferMessageCountExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2142:1: ruleBufferMessageCountExpr returns [EObject current=null] : (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleBufferMessageCountExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_buffer_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2145:28: ( (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2146:1: (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2146:1: (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2146:3: otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBufferMessageCountExpr5321); 

                	newLeafNode(otherlv_0, grammarAccess.getBufferMessageCountExprAccess().getBufferMessageCountKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBufferMessageCountExpr5333); 

                	newLeafNode(otherlv_1, grammarAccess.getBufferMessageCountExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2154:1: ( (lv_buffer_2_0= ruleBufferMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2155:1: (lv_buffer_2_0= ruleBufferMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2155:1: (lv_buffer_2_0= ruleBufferMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2156:3: lv_buffer_2_0= ruleBufferMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getBufferMessageCountExprAccess().getBufferBufferMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBufferMapExpr_in_ruleBufferMessageCountExpr5354);
            lv_buffer_2_0=ruleBufferMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBufferMessageCountExprRule());
            	        }
                   		set(
                   			current, 
                   			"buffer",
                    		lv_buffer_2_0, 
                    		"BufferMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBufferMessageCountExpr5366); 

                	newLeafNode(otherlv_3, grammarAccess.getBufferMessageCountExprAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleBufferMessageCountExpr"


    // $ANTLR start "entryRuleSourceStateExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2184:1: entryRuleSourceStateExpr returns [EObject current=null] : iv_ruleSourceStateExpr= ruleSourceStateExpr EOF ;
    public final EObject entryRuleSourceStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceStateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2185:2: (iv_ruleSourceStateExpr= ruleSourceStateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2186:2: iv_ruleSourceStateExpr= ruleSourceStateExpr EOF
            {
             newCompositeNode(grammarAccess.getSourceStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSourceStateExpr_in_entryRuleSourceStateExpr5402);
            iv_ruleSourceStateExpr=ruleSourceStateExpr();

            state._fsp--;

             current =iv_ruleSourceStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSourceStateExpr5412); 

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
    // $ANTLR end "entryRuleSourceStateExpr"


    // $ANTLR start "ruleSourceStateExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2193:1: ruleSourceStateExpr returns [EObject current=null] : (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleSourceStateExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transition_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2196:28: ( (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2197:1: (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2197:1: (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2197:3: otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSourceStateExpr5449); 

                	newLeafNode(otherlv_0, grammarAccess.getSourceStateExprAccess().getSourceStateKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSourceStateExpr5461); 

                	newLeafNode(otherlv_1, grammarAccess.getSourceStateExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2205:1: ( (lv_transition_2_0= ruleTransitionMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2206:1: (lv_transition_2_0= ruleTransitionMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2206:1: (lv_transition_2_0= ruleTransitionMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2207:3: lv_transition_2_0= ruleTransitionMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getSourceStateExprAccess().getTransitionTransitionMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransitionMapExpr_in_ruleSourceStateExpr5482);
            lv_transition_2_0=ruleTransitionMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSourceStateExprRule());
            	        }
                   		set(
                   			current, 
                   			"transition",
                    		lv_transition_2_0, 
                    		"TransitionMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSourceStateExpr5494); 

                	newLeafNode(otherlv_3, grammarAccess.getSourceStateExprAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleSourceStateExpr"


    // $ANTLR start "entryRuleTargetStateExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2235:1: entryRuleTargetStateExpr returns [EObject current=null] : iv_ruleTargetStateExpr= ruleTargetStateExpr EOF ;
    public final EObject entryRuleTargetStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetStateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2236:2: (iv_ruleTargetStateExpr= ruleTargetStateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2237:2: iv_ruleTargetStateExpr= ruleTargetStateExpr EOF
            {
             newCompositeNode(grammarAccess.getTargetStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTargetStateExpr_in_entryRuleTargetStateExpr5530);
            iv_ruleTargetStateExpr=ruleTargetStateExpr();

            state._fsp--;

             current =iv_ruleTargetStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTargetStateExpr5540); 

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
    // $ANTLR end "entryRuleTargetStateExpr"


    // $ANTLR start "ruleTargetStateExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2244:1: ruleTargetStateExpr returns [EObject current=null] : (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleTargetStateExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transition_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2247:28: ( (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2248:1: (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2248:1: (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2248:3: otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTargetStateExpr5577); 

                	newLeafNode(otherlv_0, grammarAccess.getTargetStateExprAccess().getTargetStateKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTargetStateExpr5589); 

                	newLeafNode(otherlv_1, grammarAccess.getTargetStateExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2256:1: ( (lv_transition_2_0= ruleTransitionMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2257:1: (lv_transition_2_0= ruleTransitionMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2257:1: (lv_transition_2_0= ruleTransitionMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2258:3: lv_transition_2_0= ruleTransitionMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getTargetStateExprAccess().getTransitionTransitionMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransitionMapExpr_in_ruleTargetStateExpr5610);
            lv_transition_2_0=ruleTransitionMapExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTargetStateExprRule());
            	        }
                   		set(
                   			current, 
                   			"transition",
                    		lv_transition_2_0, 
                    		"TransitionMapExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTargetStateExpr5622); 

                	newLeafNode(otherlv_3, grammarAccess.getTargetStateExprAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleTargetStateExpr"


    // $ANTLR start "entryRuleMumlElemExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2286:1: entryRuleMumlElemExpr returns [EObject current=null] : iv_ruleMumlElemExpr= ruleMumlElemExpr EOF ;
    public final EObject entryRuleMumlElemExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMumlElemExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2287:2: (iv_ruleMumlElemExpr= ruleMumlElemExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2288:2: iv_ruleMumlElemExpr= ruleMumlElemExpr EOF
            {
             newCompositeNode(grammarAccess.getMumlElemExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_entryRuleMumlElemExpr5658);
            iv_ruleMumlElemExpr=ruleMumlElemExpr();

            state._fsp--;

             current =iv_ruleMumlElemExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMumlElemExpr5668); 

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
    // $ANTLR end "entryRuleMumlElemExpr"


    // $ANTLR start "ruleMumlElemExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2295:1: ruleMumlElemExpr returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleMumlElemExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2298:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )? ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2299:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )? )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2299:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )? )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2299:2: ( ( ruleQualifiedName ) ) (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )?
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2299:2: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2300:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2300:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2301:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMumlElemExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMumlElemExprAccess().getElemEObjectCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMumlElemExpr5716);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2314:2: (otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2314:4: otherlv_1= '[' ( ( ruleQualifiedName ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMumlElemExpr5729); 

                        	newLeafNode(otherlv_1, grammarAccess.getMumlElemExprAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2318:1: ( ( ruleQualifiedName ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2319:1: ( ruleQualifiedName )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2319:1: ( ruleQualifiedName )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2320:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMumlElemExprRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMumlElemExprAccess().getInstanceEObjectCrossReference_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMumlElemExpr5752);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMumlElemExpr5764); 

                        	newLeafNode(otherlv_3, grammarAccess.getMumlElemExprAccess().getRightSquareBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleMumlElemExpr"


    // $ANTLR start "entryRuleConstExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2345:1: entryRuleConstExpr returns [EObject current=null] : iv_ruleConstExpr= ruleConstExpr EOF ;
    public final EObject entryRuleConstExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2346:2: (iv_ruleConstExpr= ruleConstExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2347:2: iv_ruleConstExpr= ruleConstExpr EOF
            {
             newCompositeNode(grammarAccess.getConstExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstExpr_in_entryRuleConstExpr5802);
            iv_ruleConstExpr=ruleConstExpr();

            state._fsp--;

             current =iv_ruleConstExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstExpr5812); 

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
    // $ANTLR end "entryRuleConstExpr"


    // $ANTLR start "ruleConstExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2354:1: ruleConstExpr returns [EObject current=null] : ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? ) ;
    public final EObject ruleConstExpr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;

        AntlrDatatypeRuleToken lv_timeUnit_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2357:28: ( ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2358:1: ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2358:1: ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2358:2: ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2358:2: ( (lv_val_0_0= ruleEInt ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2359:1: (lv_val_0_0= ruleEInt )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2359:1: (lv_val_0_0= ruleEInt )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2360:3: lv_val_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getConstExprAccess().getValEIntParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConstExpr5858);
            lv_val_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstExprRule());
            	        }
                   		set(
                   			current, 
                   			"val",
                    		lv_val_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2376:2: ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=46 && LA21_0<=52)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2377:1: (lv_timeUnit_1_0= ruleTimeUnitExpr )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2377:1: (lv_timeUnit_1_0= ruleTimeUnitExpr )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2378:3: lv_timeUnit_1_0= ruleTimeUnitExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstExprAccess().getTimeUnitTimeUnitExprParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTimeUnitExpr_in_ruleConstExpr5879);
                    lv_timeUnit_1_0=ruleTimeUnitExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstExprRule());
                    	        }
                           		set(
                           			current, 
                           			"timeUnit",
                            		lv_timeUnit_1_0, 
                            		"TimeUnitExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleConstExpr"


    // $ANTLR start "entryRuleTimeUnitExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2402:1: entryRuleTimeUnitExpr returns [String current=null] : iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF ;
    public final String entryRuleTimeUnitExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnitExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2403:2: (iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2404:2: iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnitExpr_in_entryRuleTimeUnitExpr5917);
            iv_ruleTimeUnitExpr=ruleTimeUnitExpr();

            state._fsp--;

             current =iv_ruleTimeUnitExpr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeUnitExpr5928); 

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
    // $ANTLR end "entryRuleTimeUnitExpr"


    // $ANTLR start "ruleTimeUnitExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2411:1: ruleTimeUnitExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00B5secs' | kw= 'nsecs' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnitExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2414:28: ( (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00B5secs' | kw= 'nsecs' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2415:1: (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00B5secs' | kw= 'nsecs' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2415:1: (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00B5secs' | kw= 'nsecs' )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt22=1;
                }
                break;
            case 47:
                {
                alt22=2;
                }
                break;
            case 48:
                {
                alt22=3;
                }
                break;
            case 49:
                {
                alt22=4;
                }
                break;
            case 50:
                {
                alt22=5;
                }
                break;
            case 51:
                {
                alt22=6;
                }
                break;
            case 52:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2416:2: kw= 'days'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTimeUnitExpr5966); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getDaysKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2423:2: kw= 'hrs'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTimeUnitExpr5985); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getHrsKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2430:2: kw= 'mins'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTimeUnitExpr6004); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMinsKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2437:2: kw= 'secs'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTimeUnitExpr6023); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSecsKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2444:2: kw= 'msecs'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTimeUnitExpr6042); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMsecsKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2451:2: kw= '\\u00B5secs'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTimeUnitExpr6061); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSecsKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2458:2: kw= 'nsecs'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTimeUnitExpr6080); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getNsecsKeyword_6()); 
                        

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
    // $ANTLR end "ruleTimeUnitExpr"


    // $ANTLR start "entryRuleSetExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2471:1: entryRuleSetExpr returns [EObject current=null] : iv_ruleSetExpr= ruleSetExpr EOF ;
    public final EObject entryRuleSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2472:2: (iv_ruleSetExpr= ruleSetExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2473:2: iv_ruleSetExpr= ruleSetExpr EOF
            {
             newCompositeNode(grammarAccess.getSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetExpr_in_entryRuleSetExpr6120);
            iv_ruleSetExpr=ruleSetExpr();

            state._fsp--;

             current =iv_ruleSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetExpr6130); 

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
    // $ANTLR end "entryRuleSetExpr"


    // $ANTLR start "ruleSetExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2480:1: ruleSetExpr returns [EObject current=null] : (this_InstanceSetExpr_0= ruleInstanceSetExpr | this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr | this_IntervalSetExpr_2= ruleIntervalSetExpr | ( () otherlv_4= 'States' ) | ( () otherlv_6= 'Transitions' ) | ( () otherlv_8= 'MessageTypes' ) | ( () otherlv_10= 'Clocks' ) | ( () otherlv_12= 'Buffers' ) ) ;
    public final EObject ruleSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_InstanceSetExpr_0 = null;

        EObject this_SubinstanceSetExpr_1 = null;

        EObject this_IntervalSetExpr_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2483:28: ( (this_InstanceSetExpr_0= ruleInstanceSetExpr | this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr | this_IntervalSetExpr_2= ruleIntervalSetExpr | ( () otherlv_4= 'States' ) | ( () otherlv_6= 'Transitions' ) | ( () otherlv_8= 'MessageTypes' ) | ( () otherlv_10= 'Clocks' ) | ( () otherlv_12= 'Buffers' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2484:1: (this_InstanceSetExpr_0= ruleInstanceSetExpr | this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr | this_IntervalSetExpr_2= ruleIntervalSetExpr | ( () otherlv_4= 'States' ) | ( () otherlv_6= 'Transitions' ) | ( () otherlv_8= 'MessageTypes' ) | ( () otherlv_10= 'Clocks' ) | ( () otherlv_12= 'Buffers' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2484:1: (this_InstanceSetExpr_0= ruleInstanceSetExpr | this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr | this_IntervalSetExpr_2= ruleIntervalSetExpr | ( () otherlv_4= 'States' ) | ( () otherlv_6= 'Transitions' ) | ( () otherlv_8= 'MessageTypes' ) | ( () otherlv_10= 'Clocks' ) | ( () otherlv_12= 'Buffers' ) )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt23=1;
                }
                break;
            case 61:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            case 53:
                {
                alt23=4;
                }
                break;
            case 54:
                {
                alt23=5;
                }
                break;
            case 55:
                {
                alt23=6;
                }
                break;
            case 56:
                {
                alt23=7;
                }
                break;
            case 57:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2485:5: this_InstanceSetExpr_0= ruleInstanceSetExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSetExprAccess().getInstanceSetExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInstanceSetExpr_in_ruleSetExpr6177);
                    this_InstanceSetExpr_0=ruleInstanceSetExpr();

                    state._fsp--;

                     
                            current = this_InstanceSetExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2495:5: this_SubinstanceSetExpr_1= ruleSubinstanceSetExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSetExprAccess().getSubinstanceSetExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubinstanceSetExpr_in_ruleSetExpr6204);
                    this_SubinstanceSetExpr_1=ruleSubinstanceSetExpr();

                    state._fsp--;

                     
                            current = this_SubinstanceSetExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2505:5: this_IntervalSetExpr_2= ruleIntervalSetExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSetExprAccess().getIntervalSetExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntervalSetExpr_in_ruleSetExpr6231);
                    this_IntervalSetExpr_2=ruleIntervalSetExpr();

                    state._fsp--;

                     
                            current = this_IntervalSetExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2514:6: ( () otherlv_4= 'States' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2514:6: ( () otherlv_4= 'States' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2514:7: () otherlv_4= 'States'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2514:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2515:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getStateSetExprAction_3_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSetExpr6258); 

                        	newLeafNode(otherlv_4, grammarAccess.getSetExprAccess().getStatesKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2525:6: ( () otherlv_6= 'Transitions' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2525:6: ( () otherlv_6= 'Transitions' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2525:7: () otherlv_6= 'Transitions'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2525:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2526:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getTransitionSetExprAction_4_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSetExpr6287); 

                        	newLeafNode(otherlv_6, grammarAccess.getSetExprAccess().getTransitionsKeyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2536:6: ( () otherlv_8= 'MessageTypes' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2536:6: ( () otherlv_8= 'MessageTypes' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2536:7: () otherlv_8= 'MessageTypes'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2536:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2537:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getMessageSetExprAction_5_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleSetExpr6316); 

                        	newLeafNode(otherlv_8, grammarAccess.getSetExprAccess().getMessageTypesKeyword_5_1());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2547:6: ( () otherlv_10= 'Clocks' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2547:6: ( () otherlv_10= 'Clocks' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2547:7: () otherlv_10= 'Clocks'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2547:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2548:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getClockSetExprAction_6_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleSetExpr6345); 

                        	newLeafNode(otherlv_10, grammarAccess.getSetExprAccess().getClocksKeyword_6_1());
                        

                    }


                    }
                    break;
                case 8 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2558:6: ( () otherlv_12= 'Buffers' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2558:6: ( () otherlv_12= 'Buffers' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2558:7: () otherlv_12= 'Buffers'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2558:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2559:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getBufferSetExprAction_7_0(),
                                current);
                        

                    }

                    otherlv_12=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleSetExpr6374); 

                        	newLeafNode(otherlv_12, grammarAccess.getSetExprAccess().getBuffersKeyword_7_1());
                        

                    }


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
    // $ANTLR end "ruleSetExpr"


    // $ANTLR start "entryRuleIntervalSetExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2576:1: entryRuleIntervalSetExpr returns [EObject current=null] : iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF ;
    public final EObject entryRuleIntervalSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervalSetExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2577:2: (iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2578:2: iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF
            {
             newCompositeNode(grammarAccess.getIntervalSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntervalSetExpr_in_entryRuleIntervalSetExpr6411);
            iv_ruleIntervalSetExpr=ruleIntervalSetExpr();

            state._fsp--;

             current =iv_ruleIntervalSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntervalSetExpr6421); 

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
    // $ANTLR end "entryRuleIntervalSetExpr"


    // $ANTLR start "ruleIntervalSetExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2585:1: ruleIntervalSetExpr returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' ) ;
    public final EObject ruleIntervalSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lowerVal_2_0=null;
        Token otherlv_3=null;
        Token lv_upperVal_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2588:28: ( ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2589:1: ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2589:1: ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2589:2: () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2589:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2590:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntervalSetExprAccess().getIntervalSetExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleIntervalSetExpr6467); 

                	newLeafNode(otherlv_1, grammarAccess.getIntervalSetExprAccess().getLeftSquareBracketKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2599:1: ( (lv_lowerVal_2_0= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2600:1: (lv_lowerVal_2_0= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2600:1: (lv_lowerVal_2_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2601:3: lv_lowerVal_2_0= RULE_INT
            {
            lv_lowerVal_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntervalSetExpr6484); 

            			newLeafNode(lv_lowerVal_2_0, grammarAccess.getIntervalSetExprAccess().getLowerValINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntervalSetExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lowerVal",
                    		lv_lowerVal_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleIntervalSetExpr6501); 

                	newLeafNode(otherlv_3, grammarAccess.getIntervalSetExprAccess().getCommaKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2621:1: ( (lv_upperVal_4_0= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2622:1: (lv_upperVal_4_0= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2622:1: (lv_upperVal_4_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2623:3: lv_upperVal_4_0= RULE_INT
            {
            lv_upperVal_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntervalSetExpr6518); 

            			newLeafNode(lv_upperVal_4_0, grammarAccess.getIntervalSetExprAccess().getUpperValINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntervalSetExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"upperVal",
                    		lv_upperVal_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleIntervalSetExpr6535); 

                	newLeafNode(otherlv_5, grammarAccess.getIntervalSetExprAccess().getRightSquareBracketKeyword_5());
                

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
    // $ANTLR end "ruleIntervalSetExpr"


    // $ANTLR start "entryRuleInstanceSetExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2651:1: entryRuleInstanceSetExpr returns [EObject current=null] : iv_ruleInstanceSetExpr= ruleInstanceSetExpr EOF ;
    public final EObject entryRuleInstanceSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSetExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2652:2: (iv_ruleInstanceSetExpr= ruleInstanceSetExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2653:2: iv_ruleInstanceSetExpr= ruleInstanceSetExpr EOF
            {
             newCompositeNode(grammarAccess.getInstanceSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstanceSetExpr_in_entryRuleInstanceSetExpr6571);
            iv_ruleInstanceSetExpr=ruleInstanceSetExpr();

            state._fsp--;

             current =iv_ruleInstanceSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInstanceSetExpr6581); 

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
    // $ANTLR end "entryRuleInstanceSetExpr"


    // $ANTLR start "ruleInstanceSetExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2660:1: ruleInstanceSetExpr returns [EObject current=null] : ( () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' ) ;
    public final EObject ruleInstanceSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2663:28: ( ( () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2664:1: ( () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2664:1: ( () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2664:2: () otherlv_1= 'Instances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2664:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2665:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInstanceSetExprAccess().getInstanceSetExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleInstanceSetExpr6627); 

                	newLeafNode(otherlv_1, grammarAccess.getInstanceSetExprAccess().getInstancesKeyword_1());
                
            otherlv_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleInstanceSetExpr6639); 

                	newLeafNode(otherlv_2, grammarAccess.getInstanceSetExprAccess().getLessThanSignKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2678:1: ( (lv_type_3_0= ruleMumlElemExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2679:1: (lv_type_3_0= ruleMumlElemExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2679:1: (lv_type_3_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2680:3: lv_type_3_0= ruleMumlElemExpr
            {
             
            	        newCompositeNode(grammarAccess.getInstanceSetExprAccess().getTypeMumlElemExprParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleInstanceSetExpr6660);
            lv_type_3_0=ruleMumlElemExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstanceSetExprRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"MumlElemExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleInstanceSetExpr6672); 

                	newLeafNode(otherlv_4, grammarAccess.getInstanceSetExprAccess().getGreaterThanSignKeyword_4());
                

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
    // $ANTLR end "ruleInstanceSetExpr"


    // $ANTLR start "entryRuleSubinstanceSetExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2708:1: entryRuleSubinstanceSetExpr returns [EObject current=null] : iv_ruleSubinstanceSetExpr= ruleSubinstanceSetExpr EOF ;
    public final EObject entryRuleSubinstanceSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubinstanceSetExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2709:2: (iv_ruleSubinstanceSetExpr= ruleSubinstanceSetExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2710:2: iv_ruleSubinstanceSetExpr= ruleSubinstanceSetExpr EOF
            {
             newCompositeNode(grammarAccess.getSubinstanceSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubinstanceSetExpr_in_entryRuleSubinstanceSetExpr6708);
            iv_ruleSubinstanceSetExpr=ruleSubinstanceSetExpr();

            state._fsp--;

             current =iv_ruleSubinstanceSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubinstanceSetExpr6718); 

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
    // $ANTLR end "entryRuleSubinstanceSetExpr"


    // $ANTLR start "ruleSubinstanceSetExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2717:1: ruleSubinstanceSetExpr returns [EObject current=null] : ( () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' ) ;
    public final EObject ruleSubinstanceSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2720:28: ( ( () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2721:1: ( () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2721:1: ( () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2721:2: () otherlv_1= 'Subinstances' otherlv_2= '<' ( (lv_type_3_0= ruleMumlElemExpr ) ) otherlv_4= '>'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2721:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2722:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubinstanceSetExprAccess().getSubinstanceSetExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleSubinstanceSetExpr6764); 

                	newLeafNode(otherlv_1, grammarAccess.getSubinstanceSetExprAccess().getSubinstancesKeyword_1());
                
            otherlv_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleSubinstanceSetExpr6776); 

                	newLeafNode(otherlv_2, grammarAccess.getSubinstanceSetExprAccess().getLessThanSignKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2735:1: ( (lv_type_3_0= ruleMumlElemExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2736:1: (lv_type_3_0= ruleMumlElemExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2736:1: (lv_type_3_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2737:3: lv_type_3_0= ruleMumlElemExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubinstanceSetExprAccess().getTypeMumlElemExprParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleSubinstanceSetExpr6797);
            lv_type_3_0=ruleMumlElemExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubinstanceSetExprRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"MumlElemExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleSubinstanceSetExpr6809); 

                	newLeafNode(otherlv_4, grammarAccess.getSubinstanceSetExprAccess().getGreaterThanSignKeyword_4());
                

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
    // $ANTLR end "ruleSubinstanceSetExpr"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2765:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2766:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2767:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6846);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName6857); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2774:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2777:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2778:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2778:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2778:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName6897); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2785:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==62) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2786:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleQualifiedName6916); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName6931); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEInt"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2806:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2807:2: (iv_ruleEInt= ruleEInt EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2808:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt6979);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt6990); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2815:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2818:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2819:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2819:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2819:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2819:2: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==63) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2820:2: kw= '-'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleEInt7029); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt7046); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleComparisonOp"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2840:1: ruleComparisonOp returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleComparisonOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2842:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2843:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2843:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt26=1;
                }
                break;
            case 60:
                {
                alt26=2;
                }
                break;
            case 65:
                {
                alt26=3;
                }
                break;
            case 59:
                {
                alt26=4;
                }
                break;
            case 66:
                {
                alt26=5;
                }
                break;
            case 67:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2843:2: (enumLiteral_0= '==' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2843:2: (enumLiteral_0= '==' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2843:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleComparisonOp7105); 

                            current = grammarAccess.getComparisonOpAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpAccess().getEQUALSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2849:6: (enumLiteral_1= '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2849:6: (enumLiteral_1= '>' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2849:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleComparisonOp7122); 

                            current = grammarAccess.getComparisonOpAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpAccess().getGREATEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2855:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2855:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2855:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleComparisonOp7139); 

                            current = grammarAccess.getComparisonOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2861:6: (enumLiteral_3= '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2861:6: (enumLiteral_3= '<' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2861:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleComparisonOp7156); 

                            current = grammarAccess.getComparisonOpAccess().getLESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpAccess().getLESSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2867:6: (enumLiteral_4= '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2867:6: (enumLiteral_4= '<=' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2867:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleComparisonOp7173); 

                            current = grammarAccess.getComparisonOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2873:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2873:6: (enumLiteral_5= '!=' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2873:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleComparisonOp7190); 

                            current = grammarAccess.getComparisonOpAccess().getNOT_EQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getComparisonOpAccess().getNOT_EQUALEnumLiteralDeclaration_5()); 
                        

                    }


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
    // $ANTLR end "ruleComparisonOp"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePropertyRepository_in_entryRulePropertyRepository75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyRepository85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_rulePropertyRepository130 = new BitSet(new long[]{0x80000FEFFFD70062L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleProperty232 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleProperty244 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleProperty261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeadsToExpr_in_ruleExpression363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeadsToExpr_in_entryRuleLeadsToExpr397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeadsToExpr407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_ruleLeadsToExpr454 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleLeadsToExpr475 = new BitSet(new long[]{0x80000FEFFFD71060L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_ruleLeadsToExpr496 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_entryRuleImplyExpr534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplyExpr544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpr_in_ruleImplyExpr591 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_13_in_ruleImplyExpr612 = new BitSet(new long[]{0x80000FEFFFD72060L});
        public static final BitSet FOLLOW_ruleAndExpr_in_ruleImplyExpr633 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpr_in_ruleAndExpr728 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleAndExpr749 = new BitSet(new long[]{0x80000FEFFFD74060L});
        public static final BitSet FOLLOW_ruleOrExpr_in_ruleAndExpr770 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleOrExpr865 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleOrExpr886 = new BitSet(new long[]{0x80000FEFFFD78060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleOrExpr907 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleNotExpr_in_entryRuleNotExpr945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpr955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleNotExpr993 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleNotExpr1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantifierExpr_in_ruleNotExpr1052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantifierExpr_in_entryRuleQuantifierExpr1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuantifierExpr1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUniversalQuantExpr_in_ruleQuantifierExpr1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistentialQuantExpr_in_ruleQuantifierExpr1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalQuantifierExpr_in_ruleQuantifierExpr1198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomExpr_in_ruleQuantifierExpr1225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUniversalQuantExpr_in_entryRuleUniversalQuantExpr1260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUniversalQuantExpr1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleUniversalQuantExpr1307 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleUniversalQuantExpr1319 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVariableBinding_in_ruleUniversalQuantExpr1349 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleUniversalQuantExpr1361 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleUniversalQuantExpr1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistentialQuantExpr_in_entryRuleExistentialQuantExpr1418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExistentialQuantExpr1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleExistentialQuantExpr1465 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleExistentialQuantExpr1477 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleVariableBinding_in_ruleExistentialQuantExpr1507 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExistentialQuantExpr1519 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleExistentialQuantExpr1540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableBinding_in_entryRuleVariableBinding1576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableBinding1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableBinding1628 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleVariableBinding1645 = new BitSet(new long[]{0x27E0100000000000L});
        public static final BitSet FOLLOW_ruleSetExpr_in_ruleVariableBinding1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalQuantifierExpr_in_entryRuleTemporalQuantifierExpr1702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemporalQuantifierExpr1712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFExpr_in_ruleTemporalQuantifierExpr1759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAFExpr_in_ruleTemporalQuantifierExpr1786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEGExpr_in_ruleTemporalQuantifierExpr1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAGExpr_in_ruleTemporalQuantifierExpr1840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFExpr_in_entryRuleEFExpr1875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFExpr1885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEFExpr1923 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_23_in_ruleEFExpr1941 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleEFExpr1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAFExpr_in_entryRuleAFExpr2008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAFExpr2018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAFExpr2056 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_25_in_ruleAFExpr2074 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleAFExpr2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEGExpr_in_entryRuleEGExpr2141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEGExpr2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEGExpr2189 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_27_in_ruleEGExpr2207 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleEGExpr2238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAGExpr_in_entryRuleAGExpr2274 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAGExpr2284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAGExpr2322 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_29_in_ruleAGExpr2340 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleAGExpr2371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomExpr_in_entryRuleAtomExpr2407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomExpr2417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAtomExpr2455 = new BitSet(new long[]{0x80000FEFFFDF0060L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAtomExpr2477 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAtomExpr2488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicateExpr_in_ruleAtomExpr2517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpr_in_ruleAtomExpr2544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicateExpr_in_entryRulePredicateExpr2579 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpr2589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrueExpr_in_rulePredicateExpr2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFalseExpr_in_rulePredicateExpr2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadlockExpr_in_rulePredicateExpr2690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferOverflowExpr_in_rulePredicateExpr2717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateExpr_in_rulePredicateExpr2744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageExpr_in_rulePredicateExpr2771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionExpr_in_rulePredicateExpr2798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadlockExpr_in_entryRuleDeadlockExpr2833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeadlockExpr2843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleDeadlockExpr2889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferOverflowExpr_in_entryRuleBufferOverflowExpr2925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBufferOverflowExpr2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleBufferOverflowExpr2981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrueExpr_in_entryRuleTrueExpr3017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTrueExpr3027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleTrueExpr3073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFalseExpr_in_entryRuleFalseExpr3109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFalseExpr3119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleFalseExpr3165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateExpr_in_entryRuleStateExpr3201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateExpr3211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateActiveExpr_in_ruleStateExpr3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstateOfExpr_in_ruleStateExpr3285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateInStatechartExpr_in_ruleStateExpr3312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateActiveExpr_in_entryRuleStateActiveExpr3347 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateActiveExpr3357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleStateActiveExpr3394 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleStateActiveExpr3406 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_ruleStateActiveExpr3427 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleStateActiveExpr3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstateOfExpr_in_entryRuleSubstateOfExpr3475 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubstateOfExpr3485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleSubstateOfExpr3522 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSubstateOfExpr3534 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_ruleSubstateOfExpr3555 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleSubstateOfExpr3567 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_ruleSubstateOfExpr3588 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSubstateOfExpr3600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateInStatechartExpr_in_entryRuleStateInStatechartExpr3636 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateInStatechartExpr3646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleStateInStatechartExpr3683 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleStateInStatechartExpr3695 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_ruleStateInStatechartExpr3716 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleStateInStatechartExpr3728 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleStatechartMapExpr_in_ruleStateInStatechartExpr3749 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleStateInStatechartExpr3761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageExpr_in_entryRuleMessageExpr3797 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageExpr3807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInBufferExpr_in_ruleMessageExpr3854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInTransitExpr_in_ruleMessageExpr3881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInTransitExpr_in_entryRuleMessageInTransitExpr3916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageInTransitExpr3926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMessageInTransitExpr3963 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMessageInTransitExpr3975 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMessageMapExpr_in_ruleMessageInTransitExpr3996 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMessageInTransitExpr4008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInBufferExpr_in_entryRuleMessageInBufferExpr4044 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageInBufferExpr4054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleMessageInBufferExpr4091 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMessageInBufferExpr4103 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMessageMapExpr_in_ruleMessageInBufferExpr4124 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMessageInBufferExpr4136 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBufferMapExpr_in_ruleMessageInBufferExpr4157 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMessageInBufferExpr4169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionExpr_in_entryRuleTransitionExpr4205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionExpr4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionFiringExpr_in_ruleTransitionExpr4261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionFiringExpr_in_entryRuleTransitionFiringExpr4295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionFiringExpr4305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleTransitionFiringExpr4342 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTransitionFiringExpr4354 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleTransitionMapExpr_in_ruleTransitionFiringExpr4375 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTransitionFiringExpr4387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr4423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpr4433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpr_in_ruleComparisonExpr4488 = new BitSet(new long[]{0x1800000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_ruleComparisonOp_in_ruleComparisonExpr4509 = new BitSet(new long[]{0x80000FEFFFD70060L});
        public static final BitSet FOLLOW_ruleMapExpr_in_ruleComparisonExpr4530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpr_in_entryRuleMapExpr4566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapExpr4576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleMapExpr4623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferMessageCountExpr_in_ruleMapExpr4650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstExpr_in_ruleMapExpr4677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSourceStateExpr_in_ruleMapExpr4704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTargetStateExpr_in_ruleMapExpr4731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionMapExpr_in_entryRuleTransitionMapExpr4768 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionMapExpr4778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleTransitionMapExpr4824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_entryRuleStateMapExpr4858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMapExpr4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleStateMapExpr4915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSourceStateExpr_in_ruleStateMapExpr4942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTargetStateExpr_in_ruleStateMapExpr4969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatechartMapExpr_in_entryRuleStatechartMapExpr5004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatechartMapExpr5014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleStatechartMapExpr5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferMapExpr_in_entryRuleBufferMapExpr5094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBufferMapExpr5104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleBufferMapExpr5150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageMapExpr_in_entryRuleMessageMapExpr5184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageMapExpr5194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleMessageMapExpr5240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferMessageCountExpr_in_entryRuleBufferMessageCountExpr5274 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBufferMessageCountExpr5284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleBufferMessageCountExpr5321 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBufferMessageCountExpr5333 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleBufferMapExpr_in_ruleBufferMessageCountExpr5354 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBufferMessageCountExpr5366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSourceStateExpr_in_entryRuleSourceStateExpr5402 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSourceStateExpr5412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleSourceStateExpr5449 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSourceStateExpr5461 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleTransitionMapExpr_in_ruleSourceStateExpr5482 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSourceStateExpr5494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTargetStateExpr_in_entryRuleTargetStateExpr5530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTargetStateExpr5540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleTargetStateExpr5577 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTargetStateExpr5589 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleTransitionMapExpr_in_ruleTargetStateExpr5610 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTargetStateExpr5622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_entryRuleMumlElemExpr5658 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMumlElemExpr5668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMumlElemExpr5716 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleMumlElemExpr5729 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMumlElemExpr5752 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleMumlElemExpr5764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstExpr_in_entryRuleConstExpr5802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstExpr5812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConstExpr5858 = new BitSet(new long[]{0x001FC00000000002L});
        public static final BitSet FOLLOW_ruleTimeUnitExpr_in_ruleConstExpr5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeUnitExpr_in_entryRuleTimeUnitExpr5917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeUnitExpr5928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTimeUnitExpr5966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTimeUnitExpr5985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTimeUnitExpr6004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTimeUnitExpr6023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTimeUnitExpr6042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTimeUnitExpr6061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTimeUnitExpr6080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetExpr_in_entryRuleSetExpr6120 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetExpr6130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstanceSetExpr_in_ruleSetExpr6177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubinstanceSetExpr_in_ruleSetExpr6204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntervalSetExpr_in_ruleSetExpr6231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleSetExpr6258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleSetExpr6287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleSetExpr6316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleSetExpr6345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleSetExpr6374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntervalSetExpr_in_entryRuleIntervalSetExpr6411 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntervalSetExpr6421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleIntervalSetExpr6467 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntervalSetExpr6484 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleIntervalSetExpr6501 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntervalSetExpr6518 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleIntervalSetExpr6535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstanceSetExpr_in_entryRuleInstanceSetExpr6571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSetExpr6581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleInstanceSetExpr6627 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleInstanceSetExpr6639 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleInstanceSetExpr6660 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruleInstanceSetExpr6672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubinstanceSetExpr_in_entryRuleSubinstanceSetExpr6708 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubinstanceSetExpr6718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleSubinstanceSetExpr6764 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleSubinstanceSetExpr6776 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleSubinstanceSetExpr6797 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruleSubinstanceSetExpr6809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName6857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6897 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleQualifiedName6916 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6931 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt6979 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt6990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleEInt7029 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt7046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleComparisonOp7105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleComparisonOp7122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleComparisonOp7139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleComparisonOp7156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleComparisonOp7173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleComparisonOp7190 = new BitSet(new long[]{0x0000000000000002L});
    }


}