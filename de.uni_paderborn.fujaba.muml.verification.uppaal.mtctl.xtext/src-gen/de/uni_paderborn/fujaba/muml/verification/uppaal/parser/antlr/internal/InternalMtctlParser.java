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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'leadsTo'", "'timeInterval'", "'['", "','", "']'", "'implies'", "'and'", "'or'", "'not'", "'forall'", "'('", "')'", "'exists'", "':'", "'EF'", "'E<>'", "'AF'", "'A<>'", "'EG'", "'E[]'", "'AG'", "'A[]'", "'deadlock'", "'bufferOverflow'", "'true'", "'false'", "'stateActive'", "'substateOf'", "'stateInStatechart'", "'messageInTransit'", "'messageInBuffer'", "'transitionFiring'", "'bufferMessageCount'", "'sourceState'", "'targetState'", "'days'", "'hrs'", "'mins'", "'secs'", "'msecs'", "'\\u00B5secs'", "'nsecs'", "'States'", "'Transitions'", "'MessageTypes'", "'Clocks'", "'Buffers'", "'.'", "'-'", "'=='", "'>'", "'>='", "'<'", "'<='", "'!='"
    };
    public static final int RULE_ID=6;
    public static final int T__66=66;
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
    public static final int RULE_INT=5;
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

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||LA1_0==13||(LA1_0>=20 && LA1_0<=22)||LA1_0==24||(LA1_0>=26 && LA1_0<=46)||LA1_0==60) ) {
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:217:1: ruleLeadsToExpr returns [EObject current=null] : (this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )* ) ;
    public final EObject ruleLeadsToExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TimeIntervalExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:220:28: ( (this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:221:1: (this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:221:1: (this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:222:5: this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLeadsToExprAccess().getTimeIntervalExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTimeIntervalExpr_in_ruleLeadsToExpr454);
            this_TimeIntervalExpr_0=ruleTimeIntervalExpr();

            state._fsp--;

             
                    current = this_TimeIntervalExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:230:1: ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:230:2: () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) )
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
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:240:1: ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:241:1: (lv_rightOpd_3_0= ruleTimeIntervalExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:241:1: (lv_rightOpd_3_0= ruleTimeIntervalExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:242:3: lv_rightOpd_3_0= ruleTimeIntervalExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLeadsToExprAccess().getRightOpdTimeIntervalExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleTimeIntervalExpr_in_ruleLeadsToExpr496);
            	    lv_rightOpd_3_0=ruleTimeIntervalExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLeadsToExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOpd",
            	            		lv_rightOpd_3_0, 
            	            		"TimeIntervalExpr");
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


    // $ANTLR start "entryRuleTimeIntervalExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:266:1: entryRuleTimeIntervalExpr returns [EObject current=null] : iv_ruleTimeIntervalExpr= ruleTimeIntervalExpr EOF ;
    public final EObject entryRuleTimeIntervalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeIntervalExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:267:2: (iv_ruleTimeIntervalExpr= ruleTimeIntervalExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:268:2: iv_ruleTimeIntervalExpr= ruleTimeIntervalExpr EOF
            {
             newCompositeNode(grammarAccess.getTimeIntervalExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeIntervalExpr_in_entryRuleTimeIntervalExpr534);
            iv_ruleTimeIntervalExpr=ruleTimeIntervalExpr();

            state._fsp--;

             current =iv_ruleTimeIntervalExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeIntervalExpr544); 

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
    // $ANTLR end "entryRuleTimeIntervalExpr"


    // $ANTLR start "ruleTimeIntervalExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:275:1: ruleTimeIntervalExpr returns [EObject current=null] : ( (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) ) | this_ImplyExpr_9= ruleImplyExpr ) ;
    public final EObject ruleTimeIntervalExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_lower_4_0=null;
        Token otherlv_5=null;
        Token lv_upper_6_0=null;
        Token otherlv_7=null;
        EObject lv_lhs_2_0 = null;

        EObject lv_rhs_8_0 = null;

        EObject this_ImplyExpr_9 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:278:28: ( ( (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) ) | this_ImplyExpr_9= ruleImplyExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:279:1: ( (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) ) | this_ImplyExpr_9= ruleImplyExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:279:1: ( (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) ) | this_ImplyExpr_9= ruleImplyExpr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_ID)||(LA4_0>=20 && LA4_0<=22)||LA4_0==24||(LA4_0>=26 && LA4_0<=46)||LA4_0==60) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:279:2: (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:279:2: (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:279:4: otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) )
                    {
                    otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimeIntervalExpr582); 

                        	newLeafNode(otherlv_0, grammarAccess.getTimeIntervalExprAccess().getTimeIntervalKeyword_0_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:283:1: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:284:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTimeIntervalExprAccess().getTimeIntervalExprAction_0_1(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:289:2: ( (lv_lhs_2_0= ruleImplyExpr ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:290:1: (lv_lhs_2_0= ruleImplyExpr )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:290:1: (lv_lhs_2_0= ruleImplyExpr )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:291:3: lv_lhs_2_0= ruleImplyExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getTimeIntervalExprAccess().getLhsImplyExprParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleImplyExpr_in_ruleTimeIntervalExpr612);
                    lv_lhs_2_0=ruleImplyExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTimeIntervalExprRule());
                    	        }
                           		set(
                           			current, 
                           			"lhs",
                            		lv_lhs_2_0, 
                            		"ImplyExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTimeIntervalExpr624); 

                        	newLeafNode(otherlv_3, grammarAccess.getTimeIntervalExprAccess().getLeftSquareBracketKeyword_0_3());
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:311:1: ( (lv_lower_4_0= RULE_INT ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:312:1: (lv_lower_4_0= RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:312:1: (lv_lower_4_0= RULE_INT )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:313:3: lv_lower_4_0= RULE_INT
                    {
                    lv_lower_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTimeIntervalExpr641); 

                    			newLeafNode(lv_lower_4_0, grammarAccess.getTimeIntervalExprAccess().getLowerINTTerminalRuleCall_0_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeIntervalExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lower",
                            		lv_lower_4_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTimeIntervalExpr658); 

                        	newLeafNode(otherlv_5, grammarAccess.getTimeIntervalExprAccess().getCommaKeyword_0_5());
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:333:1: ( (lv_upper_6_0= RULE_INT ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:334:1: (lv_upper_6_0= RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:334:1: (lv_upper_6_0= RULE_INT )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:335:3: lv_upper_6_0= RULE_INT
                    {
                    lv_upper_6_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTimeIntervalExpr675); 

                    			newLeafNode(lv_upper_6_0, grammarAccess.getTimeIntervalExprAccess().getUpperINTTerminalRuleCall_0_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeIntervalExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"upper",
                            		lv_upper_6_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTimeIntervalExpr692); 

                        	newLeafNode(otherlv_7, grammarAccess.getTimeIntervalExprAccess().getRightSquareBracketKeyword_0_7());
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:355:1: ( (lv_rhs_8_0= ruleImplyExpr ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:356:1: (lv_rhs_8_0= ruleImplyExpr )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:356:1: (lv_rhs_8_0= ruleImplyExpr )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:357:3: lv_rhs_8_0= ruleImplyExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getTimeIntervalExprAccess().getRhsImplyExprParserRuleCall_0_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleImplyExpr_in_ruleTimeIntervalExpr713);
                    lv_rhs_8_0=ruleImplyExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTimeIntervalExprRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_8_0, 
                            		"ImplyExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:375:5: this_ImplyExpr_9= ruleImplyExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTimeIntervalExprAccess().getImplyExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImplyExpr_in_ruleTimeIntervalExpr742);
                    this_ImplyExpr_9=ruleImplyExpr();

                    state._fsp--;

                     
                            current = this_ImplyExpr_9; 
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
    // $ANTLR end "ruleTimeIntervalExpr"


    // $ANTLR start "entryRuleImplyExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:391:1: entryRuleImplyExpr returns [EObject current=null] : iv_ruleImplyExpr= ruleImplyExpr EOF ;
    public final EObject entryRuleImplyExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplyExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:392:2: (iv_ruleImplyExpr= ruleImplyExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:393:2: iv_ruleImplyExpr= ruleImplyExpr EOF
            {
             newCompositeNode(grammarAccess.getImplyExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImplyExpr_in_entryRuleImplyExpr777);
            iv_ruleImplyExpr=ruleImplyExpr();

            state._fsp--;

             current =iv_ruleImplyExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplyExpr787); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:400:1: ruleImplyExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleImplyExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:403:28: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:404:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:404:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:405:5: this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getImplyExprAccess().getAndExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndExpr_in_ruleImplyExpr834);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;

             
                    current = this_AndExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:413:1: ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:413:2: () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:413:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:414:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getImplyExprAccess().getImplyExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleImplyExpr855); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImplyExprAccess().getImpliesKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:423:1: ( (lv_rightOpd_3_0= ruleAndExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:424:1: (lv_rightOpd_3_0= ruleAndExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:424:1: (lv_rightOpd_3_0= ruleAndExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:425:3: lv_rightOpd_3_0= ruleAndExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplyExprAccess().getRightOpdAndExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpr_in_ruleImplyExpr876);
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
    // $ANTLR end "ruleImplyExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:449:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:450:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:451:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpr_in_entryRuleAndExpr914);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpr924); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:458:1: ruleAndExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:461:28: ( (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:462:1: (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:462:1: (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:463:5: this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExprAccess().getOrExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOrExpr_in_ruleAndExpr971);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;

             
                    current = this_OrExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:471:1: ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:471:2: () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:471:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:472:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExprAccess().getAndExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAndExpr992); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getAndKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:481:1: ( (lv_rightOpd_3_0= ruleOrExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:482:1: (lv_rightOpd_3_0= ruleOrExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:482:1: (lv_rightOpd_3_0= ruleOrExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:483:3: lv_rightOpd_3_0= ruleOrExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExprAccess().getRightOpdOrExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOrExpr_in_ruleAndExpr1013);
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleOrExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:507:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:508:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:509:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpr_in_entryRuleOrExpr1051);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpr1061); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:516:1: ruleOrExpr returns [EObject current=null] : (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NotExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:519:28: ( (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:520:1: (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:520:1: (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:521:5: this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExprAccess().getNotExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleOrExpr1108);
            this_NotExpr_0=ruleNotExpr();

            state._fsp--;

             
                    current = this_NotExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:529:1: ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:529:2: () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:529:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:530:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExprAccess().getOrExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOrExpr1129); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOrKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:539:1: ( (lv_rightOpd_3_0= ruleNotExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:540:1: (lv_rightOpd_3_0= ruleNotExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:540:1: (lv_rightOpd_3_0= ruleNotExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:541:3: lv_rightOpd_3_0= ruleNotExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExprAccess().getRightOpdNotExprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleOrExpr1150);
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
            	    break loop7;
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:565:1: entryRuleNotExpr returns [EObject current=null] : iv_ruleNotExpr= ruleNotExpr EOF ;
    public final EObject entryRuleNotExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:566:2: (iv_ruleNotExpr= ruleNotExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:567:2: iv_ruleNotExpr= ruleNotExpr EOF
            {
             newCompositeNode(grammarAccess.getNotExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_entryRuleNotExpr1188);
            iv_ruleNotExpr=ruleNotExpr();

            state._fsp--;

             current =iv_ruleNotExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpr1198); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:574:1: ruleNotExpr returns [EObject current=null] : ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr ) ;
    public final EObject ruleNotExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_opd_2_0 = null;

        EObject this_QuantifierExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:577:28: ( ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:578:1: ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:578:1: ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_ID)||(LA8_0>=21 && LA8_0<=22)||LA8_0==24||(LA8_0>=26 && LA8_0<=46)||LA8_0==60) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:578:2: (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:578:2: (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:578:4: otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) )
                    {
                    otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNotExpr1236); 

                        	newLeafNode(otherlv_0, grammarAccess.getNotExprAccess().getNotKeyword_0_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:582:1: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:583:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNotExprAccess().getNotExprAction_0_1(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:588:2: ( (lv_opd_2_0= ruleNotExpr ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:589:1: (lv_opd_2_0= ruleNotExpr )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:589:1: (lv_opd_2_0= ruleNotExpr )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:590:3: lv_opd_2_0= ruleNotExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getNotExprAccess().getOpdNotExprParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleNotExpr1266);
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:608:5: this_QuantifierExpr_3= ruleQuantifierExpr
                    {
                     
                            newCompositeNode(grammarAccess.getNotExprAccess().getQuantifierExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuantifierExpr_in_ruleNotExpr1295);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:624:1: entryRuleQuantifierExpr returns [EObject current=null] : iv_ruleQuantifierExpr= ruleQuantifierExpr EOF ;
    public final EObject entryRuleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifierExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:625:2: (iv_ruleQuantifierExpr= ruleQuantifierExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:626:2: iv_ruleQuantifierExpr= ruleQuantifierExpr EOF
            {
             newCompositeNode(grammarAccess.getQuantifierExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuantifierExpr_in_entryRuleQuantifierExpr1330);
            iv_ruleQuantifierExpr=ruleQuantifierExpr();

            state._fsp--;

             current =iv_ruleQuantifierExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuantifierExpr1340); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:633:1: ruleQuantifierExpr returns [EObject current=null] : (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr ) ;
    public final EObject ruleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject this_UniversalQuantExpr_0 = null;

        EObject this_ExistentialQuantExpr_1 = null;

        EObject this_TemporalQuantifierExpr_2 = null;

        EObject this_AtomExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:636:28: ( (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:637:1: (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:637:1: (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt9=3;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 22:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 60:
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:638:5: this_UniversalQuantExpr_0= ruleUniversalQuantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getUniversalQuantExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUniversalQuantExpr_in_ruleQuantifierExpr1387);
                    this_UniversalQuantExpr_0=ruleUniversalQuantExpr();

                    state._fsp--;

                     
                            current = this_UniversalQuantExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:648:5: this_ExistentialQuantExpr_1= ruleExistentialQuantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getExistentialQuantExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExistentialQuantExpr_in_ruleQuantifierExpr1414);
                    this_ExistentialQuantExpr_1=ruleExistentialQuantExpr();

                    state._fsp--;

                     
                            current = this_ExistentialQuantExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:658:5: this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getTemporalQuantifierExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemporalQuantifierExpr_in_ruleQuantifierExpr1441);
                    this_TemporalQuantifierExpr_2=ruleTemporalQuantifierExpr();

                    state._fsp--;

                     
                            current = this_TemporalQuantifierExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:668:5: this_AtomExpr_3= ruleAtomExpr
                    {
                     
                            newCompositeNode(grammarAccess.getQuantifierExprAccess().getAtomExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAtomExpr_in_ruleQuantifierExpr1468);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:684:1: entryRuleUniversalQuantExpr returns [EObject current=null] : iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF ;
    public final EObject entryRuleUniversalQuantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalQuantExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:685:2: (iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:686:2: iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF
            {
             newCompositeNode(grammarAccess.getUniversalQuantExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUniversalQuantExpr_in_entryRuleUniversalQuantExpr1503);
            iv_ruleUniversalQuantExpr=ruleUniversalQuantExpr();

            state._fsp--;

             current =iv_ruleUniversalQuantExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUniversalQuantExpr1513); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:693:1: ruleUniversalQuantExpr returns [EObject current=null] : (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) ;
    public final EObject ruleUniversalQuantExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_var_3_0 = null;

        EObject lv_formula_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:696:28: ( (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:697:1: (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:697:1: (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:697:3: otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleUniversalQuantExpr1550); 

                	newLeafNode(otherlv_0, grammarAccess.getUniversalQuantExprAccess().getForallKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleUniversalQuantExpr1562); 

                	newLeafNode(otherlv_1, grammarAccess.getUniversalQuantExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:705:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:706:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUniversalQuantExprAccess().getUniversalQuantExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:711:2: ( (lv_var_3_0= ruleVariableBinding ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:712:1: (lv_var_3_0= ruleVariableBinding )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:712:1: (lv_var_3_0= ruleVariableBinding )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:713:3: lv_var_3_0= ruleVariableBinding
            {
             
            	        newCompositeNode(grammarAccess.getUniversalQuantExprAccess().getVarVariableBindingParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableBinding_in_ruleUniversalQuantExpr1592);
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

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleUniversalQuantExpr1604); 

                	newLeafNode(otherlv_4, grammarAccess.getUniversalQuantExprAccess().getRightParenthesisKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:733:1: ( (lv_formula_5_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:734:1: (lv_formula_5_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:734:1: (lv_formula_5_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:735:3: lv_formula_5_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getUniversalQuantExprAccess().getFormulaNotExprParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleUniversalQuantExpr1625);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:759:1: entryRuleExistentialQuantExpr returns [EObject current=null] : iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF ;
    public final EObject entryRuleExistentialQuantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistentialQuantExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:760:2: (iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:761:2: iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF
            {
             newCompositeNode(grammarAccess.getExistentialQuantExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExistentialQuantExpr_in_entryRuleExistentialQuantExpr1661);
            iv_ruleExistentialQuantExpr=ruleExistentialQuantExpr();

            state._fsp--;

             current =iv_ruleExistentialQuantExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExistentialQuantExpr1671); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:768:1: ruleExistentialQuantExpr returns [EObject current=null] : (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) ;
    public final EObject ruleExistentialQuantExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_var_3_0 = null;

        EObject lv_formula_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:771:28: ( (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:772:1: (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:772:1: (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:772:3: otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExistentialQuantExpr1708); 

                	newLeafNode(otherlv_0, grammarAccess.getExistentialQuantExprAccess().getExistsKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExistentialQuantExpr1720); 

                	newLeafNode(otherlv_1, grammarAccess.getExistentialQuantExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:780:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:781:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExistentialQuantExprAccess().getExistenceQuantExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:786:2: ( (lv_var_3_0= ruleVariableBinding ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:787:1: (lv_var_3_0= ruleVariableBinding )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:787:1: (lv_var_3_0= ruleVariableBinding )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:788:3: lv_var_3_0= ruleVariableBinding
            {
             
            	        newCompositeNode(grammarAccess.getExistentialQuantExprAccess().getVarVariableBindingParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariableBinding_in_ruleExistentialQuantExpr1750);
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

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExistentialQuantExpr1762); 

                	newLeafNode(otherlv_4, grammarAccess.getExistentialQuantExprAccess().getRightParenthesisKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:808:1: ( (lv_formula_5_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:809:1: (lv_formula_5_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:809:1: (lv_formula_5_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:810:3: lv_formula_5_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getExistentialQuantExprAccess().getFormulaNotExprParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleExistentialQuantExpr1783);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:834:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:835:2: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:836:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariableBinding_in_entryRuleVariableBinding1819);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableBinding1829); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:843:1: ruleVariableBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_set_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:846:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:847:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:847:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:847:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:847:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:848:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:848:1: (lv_name_0_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:849:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableBinding1871); 

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

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleVariableBinding1888); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getColonKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:869:1: ( (lv_set_2_0= ruleSetExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:870:1: (lv_set_2_0= ruleSetExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:870:1: (lv_set_2_0= ruleSetExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:871:3: lv_set_2_0= ruleSetExpr
            {
             
            	        newCompositeNode(grammarAccess.getVariableBindingAccess().getSetSetExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSetExpr_in_ruleVariableBinding1909);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:895:1: entryRuleTemporalQuantifierExpr returns [EObject current=null] : iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF ;
    public final EObject entryRuleTemporalQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalQuantifierExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:896:2: (iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:897:2: iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF
            {
             newCompositeNode(grammarAccess.getTemporalQuantifierExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemporalQuantifierExpr_in_entryRuleTemporalQuantifierExpr1945);
            iv_ruleTemporalQuantifierExpr=ruleTemporalQuantifierExpr();

            state._fsp--;

             current =iv_ruleTemporalQuantifierExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemporalQuantifierExpr1955); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:904:1: ruleTemporalQuantifierExpr returns [EObject current=null] : (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr ) ;
    public final EObject ruleTemporalQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject this_EFExpr_0 = null;

        EObject this_AFExpr_1 = null;

        EObject this_EGExpr_2 = null;

        EObject this_AGExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:907:28: ( (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:908:1: (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:908:1: (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
            case 29:
                {
                alt10=2;
                }
                break;
            case 30:
            case 31:
                {
                alt10=3;
                }
                break;
            case 32:
            case 33:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:909:5: this_EFExpr_0= ruleEFExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getEFExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEFExpr_in_ruleTemporalQuantifierExpr2002);
                    this_EFExpr_0=ruleEFExpr();

                    state._fsp--;

                     
                            current = this_EFExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:919:5: this_AFExpr_1= ruleAFExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getAFExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAFExpr_in_ruleTemporalQuantifierExpr2029);
                    this_AFExpr_1=ruleAFExpr();

                    state._fsp--;

                     
                            current = this_AFExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:929:5: this_EGExpr_2= ruleEGExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getEGExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEGExpr_in_ruleTemporalQuantifierExpr2056);
                    this_EGExpr_2=ruleEGExpr();

                    state._fsp--;

                     
                            current = this_EGExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:939:5: this_AGExpr_3= ruleAGExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTemporalQuantifierExprAccess().getAGExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAGExpr_in_ruleTemporalQuantifierExpr2083);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:955:1: entryRuleEFExpr returns [EObject current=null] : iv_ruleEFExpr= ruleEFExpr EOF ;
    public final EObject entryRuleEFExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:956:2: (iv_ruleEFExpr= ruleEFExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:957:2: iv_ruleEFExpr= ruleEFExpr EOF
            {
             newCompositeNode(grammarAccess.getEFExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFExpr_in_entryRuleEFExpr2118);
            iv_ruleEFExpr=ruleEFExpr();

            state._fsp--;

             current =iv_ruleEFExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFExpr2128); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:964:1: ruleEFExpr returns [EObject current=null] : ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleEFExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:967:28: ( ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:968:1: ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:968:1: ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:968:2: (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:968:2: (otherlv_0= 'EF' | otherlv_1= 'E<>' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:968:4: otherlv_0= 'EF'
                    {
                    otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEFExpr2166); 

                        	newLeafNode(otherlv_0, grammarAccess.getEFExprAccess().getEFKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:973:7: otherlv_1= 'E<>'
                    {
                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEFExpr2184); 

                        	newLeafNode(otherlv_1, grammarAccess.getEFExprAccess().getEKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:977:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:978:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEFExprAccess().getEFExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:983:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:984:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:984:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:985:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getEFExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleEFExpr2215);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1009:1: entryRuleAFExpr returns [EObject current=null] : iv_ruleAFExpr= ruleAFExpr EOF ;
    public final EObject entryRuleAFExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1010:2: (iv_ruleAFExpr= ruleAFExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1011:2: iv_ruleAFExpr= ruleAFExpr EOF
            {
             newCompositeNode(grammarAccess.getAFExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAFExpr_in_entryRuleAFExpr2251);
            iv_ruleAFExpr=ruleAFExpr();

            state._fsp--;

             current =iv_ruleAFExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAFExpr2261); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1018:1: ruleAFExpr returns [EObject current=null] : ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleAFExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1021:28: ( ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1022:1: ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1022:1: ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1022:2: (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1022:2: (otherlv_0= 'AF' | otherlv_1= 'A<>' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1022:4: otherlv_0= 'AF'
                    {
                    otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAFExpr2299); 

                        	newLeafNode(otherlv_0, grammarAccess.getAFExprAccess().getAFKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1027:7: otherlv_1= 'A<>'
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAFExpr2317); 

                        	newLeafNode(otherlv_1, grammarAccess.getAFExprAccess().getAKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1031:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1032:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAFExprAccess().getAFExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1037:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1038:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1038:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1039:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getAFExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleAFExpr2348);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1063:1: entryRuleEGExpr returns [EObject current=null] : iv_ruleEGExpr= ruleEGExpr EOF ;
    public final EObject entryRuleEGExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1064:2: (iv_ruleEGExpr= ruleEGExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1065:2: iv_ruleEGExpr= ruleEGExpr EOF
            {
             newCompositeNode(grammarAccess.getEGExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEGExpr_in_entryRuleEGExpr2384);
            iv_ruleEGExpr=ruleEGExpr();

            state._fsp--;

             current =iv_ruleEGExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEGExpr2394); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1072:1: ruleEGExpr returns [EObject current=null] : ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleEGExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1075:28: ( ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1076:1: ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1076:1: ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1076:2: (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1076:2: (otherlv_0= 'EG' | otherlv_1= 'E[]' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1076:4: otherlv_0= 'EG'
                    {
                    otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEGExpr2432); 

                        	newLeafNode(otherlv_0, grammarAccess.getEGExprAccess().getEGKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1081:7: otherlv_1= 'E[]'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEGExpr2450); 

                        	newLeafNode(otherlv_1, grammarAccess.getEGExprAccess().getEKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1085:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1086:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEGExprAccess().getEGExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1091:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1092:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1092:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1093:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getEGExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleEGExpr2481);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1117:1: entryRuleAGExpr returns [EObject current=null] : iv_ruleAGExpr= ruleAGExpr EOF ;
    public final EObject entryRuleAGExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAGExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1118:2: (iv_ruleAGExpr= ruleAGExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1119:2: iv_ruleAGExpr= ruleAGExpr EOF
            {
             newCompositeNode(grammarAccess.getAGExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAGExpr_in_entryRuleAGExpr2517);
            iv_ruleAGExpr=ruleAGExpr();

            state._fsp--;

             current =iv_ruleAGExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAGExpr2527); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1126:1: ruleAGExpr returns [EObject current=null] : ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleAGExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1129:28: ( ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1130:1: ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1130:1: ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1130:2: (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1130:2: (otherlv_0= 'AG' | otherlv_1= 'A[]' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1130:4: otherlv_0= 'AG'
                    {
                    otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAGExpr2565); 

                        	newLeafNode(otherlv_0, grammarAccess.getAGExprAccess().getAGKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1135:7: otherlv_1= 'A[]'
                    {
                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAGExpr2583); 

                        	newLeafNode(otherlv_1, grammarAccess.getAGExprAccess().getAKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1139:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1140:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAGExprAccess().getAGExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1145:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1146:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1146:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1147:3: lv_expr_3_0= ruleNotExpr
            {
             
            	        newCompositeNode(grammarAccess.getAGExprAccess().getExprNotExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleAGExpr2614);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1171:1: entryRuleAtomExpr returns [EObject current=null] : iv_ruleAtomExpr= ruleAtomExpr EOF ;
    public final EObject entryRuleAtomExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1172:2: (iv_ruleAtomExpr= ruleAtomExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1173:2: iv_ruleAtomExpr= ruleAtomExpr EOF
            {
             newCompositeNode(grammarAccess.getAtomExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomExpr_in_entryRuleAtomExpr2650);
            iv_ruleAtomExpr=ruleAtomExpr();

            state._fsp--;

             current =iv_ruleAtomExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomExpr2660); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1180:1: ruleAtomExpr returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr ) ;
    public final EObject ruleAtomExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_PredicateExpr_3 = null;

        EObject this_ComparisonExpr_4 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1183:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1184:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1184:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt15=1;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt15=2;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 44:
            case 45:
            case 46:
            case 60:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1184:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1184:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1184:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAtomExpr2698); 

                        	newLeafNode(otherlv_0, grammarAccess.getAtomExprAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtomExprAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAtomExpr2720);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAtomExpr2731); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtomExprAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1203:5: this_PredicateExpr_3= rulePredicateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAtomExprAccess().getPredicateExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePredicateExpr_in_ruleAtomExpr2760);
                    this_PredicateExpr_3=rulePredicateExpr();

                    state._fsp--;

                     
                            current = this_PredicateExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1213:5: this_ComparisonExpr_4= ruleComparisonExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAtomExprAccess().getComparisonExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpr_in_ruleAtomExpr2787);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1229:1: entryRulePredicateExpr returns [EObject current=null] : iv_rulePredicateExpr= rulePredicateExpr EOF ;
    public final EObject entryRulePredicateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1230:2: (iv_rulePredicateExpr= rulePredicateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1231:2: iv_rulePredicateExpr= rulePredicateExpr EOF
            {
             newCompositeNode(grammarAccess.getPredicateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicateExpr_in_entryRulePredicateExpr2822);
            iv_rulePredicateExpr=rulePredicateExpr();

            state._fsp--;

             current =iv_rulePredicateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicateExpr2832); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1238:1: rulePredicateExpr returns [EObject current=null] : (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_BufferOverflowExpr_3= ruleBufferOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr ) ;
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
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1241:28: ( (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_BufferOverflowExpr_3= ruleBufferOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1242:1: (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_BufferOverflowExpr_3= ruleBufferOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1242:1: (this_TrueExpr_0= ruleTrueExpr | this_FalseExpr_1= ruleFalseExpr | this_DeadlockExpr_2= ruleDeadlockExpr | this_BufferOverflowExpr_3= ruleBufferOverflowExpr | this_StateExpr_4= ruleStateExpr | this_MessageExpr_5= ruleMessageExpr | this_TransitionExpr_6= ruleTransitionExpr )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            case 35:
                {
                alt16=4;
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt16=5;
                }
                break;
            case 41:
            case 42:
                {
                alt16=6;
                }
                break;
            case 43:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1243:5: this_TrueExpr_0= ruleTrueExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getTrueExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTrueExpr_in_rulePredicateExpr2879);
                    this_TrueExpr_0=ruleTrueExpr();

                    state._fsp--;

                     
                            current = this_TrueExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1253:5: this_FalseExpr_1= ruleFalseExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getFalseExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFalseExpr_in_rulePredicateExpr2906);
                    this_FalseExpr_1=ruleFalseExpr();

                    state._fsp--;

                     
                            current = this_FalseExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1263:5: this_DeadlockExpr_2= ruleDeadlockExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getDeadlockExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeadlockExpr_in_rulePredicateExpr2933);
                    this_DeadlockExpr_2=ruleDeadlockExpr();

                    state._fsp--;

                     
                            current = this_DeadlockExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1273:5: this_BufferOverflowExpr_3= ruleBufferOverflowExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getBufferOverflowExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBufferOverflowExpr_in_rulePredicateExpr2960);
                    this_BufferOverflowExpr_3=ruleBufferOverflowExpr();

                    state._fsp--;

                     
                            current = this_BufferOverflowExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1283:5: this_StateExpr_4= ruleStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getStateExprParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateExpr_in_rulePredicateExpr2987);
                    this_StateExpr_4=ruleStateExpr();

                    state._fsp--;

                     
                            current = this_StateExpr_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1293:5: this_MessageExpr_5= ruleMessageExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getMessageExprParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageExpr_in_rulePredicateExpr3014);
                    this_MessageExpr_5=ruleMessageExpr();

                    state._fsp--;

                     
                            current = this_MessageExpr_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1303:5: this_TransitionExpr_6= ruleTransitionExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getTransitionExprParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTransitionExpr_in_rulePredicateExpr3041);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1319:1: entryRuleDeadlockExpr returns [EObject current=null] : iv_ruleDeadlockExpr= ruleDeadlockExpr EOF ;
    public final EObject entryRuleDeadlockExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadlockExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1320:2: (iv_ruleDeadlockExpr= ruleDeadlockExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1321:2: iv_ruleDeadlockExpr= ruleDeadlockExpr EOF
            {
             newCompositeNode(grammarAccess.getDeadlockExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadlockExpr_in_entryRuleDeadlockExpr3076);
            iv_ruleDeadlockExpr=ruleDeadlockExpr();

            state._fsp--;

             current =iv_ruleDeadlockExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeadlockExpr3086); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1328:1: ruleDeadlockExpr returns [EObject current=null] : ( () otherlv_1= 'deadlock' ) ;
    public final EObject ruleDeadlockExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1331:28: ( ( () otherlv_1= 'deadlock' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1332:1: ( () otherlv_1= 'deadlock' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1332:1: ( () otherlv_1= 'deadlock' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1332:2: () otherlv_1= 'deadlock'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1332:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1333:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeadlockExprAccess().getDeadlockExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDeadlockExpr3132); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1350:1: entryRuleBufferOverflowExpr returns [EObject current=null] : iv_ruleBufferOverflowExpr= ruleBufferOverflowExpr EOF ;
    public final EObject entryRuleBufferOverflowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferOverflowExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1351:2: (iv_ruleBufferOverflowExpr= ruleBufferOverflowExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1352:2: iv_ruleBufferOverflowExpr= ruleBufferOverflowExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferOverflowExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBufferOverflowExpr_in_entryRuleBufferOverflowExpr3168);
            iv_ruleBufferOverflowExpr=ruleBufferOverflowExpr();

            state._fsp--;

             current =iv_ruleBufferOverflowExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBufferOverflowExpr3178); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1359:1: ruleBufferOverflowExpr returns [EObject current=null] : ( () otherlv_1= 'bufferOverflow' ) ;
    public final EObject ruleBufferOverflowExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1362:28: ( ( () otherlv_1= 'bufferOverflow' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1363:1: ( () otherlv_1= 'bufferOverflow' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1363:1: ( () otherlv_1= 'bufferOverflow' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1363:2: () otherlv_1= 'bufferOverflow'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1363:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1364:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBufferOverflowExprAccess().getBufferOverflowExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBufferOverflowExpr3224); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1381:1: entryRuleTrueExpr returns [EObject current=null] : iv_ruleTrueExpr= ruleTrueExpr EOF ;
    public final EObject entryRuleTrueExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1382:2: (iv_ruleTrueExpr= ruleTrueExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1383:2: iv_ruleTrueExpr= ruleTrueExpr EOF
            {
             newCompositeNode(grammarAccess.getTrueExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTrueExpr_in_entryRuleTrueExpr3260);
            iv_ruleTrueExpr=ruleTrueExpr();

            state._fsp--;

             current =iv_ruleTrueExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTrueExpr3270); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1390:1: ruleTrueExpr returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1393:28: ( ( () otherlv_1= 'true' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1394:1: ( () otherlv_1= 'true' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1394:1: ( () otherlv_1= 'true' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1394:2: () otherlv_1= 'true'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1394:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1395:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTrueExprAccess().getTrueExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTrueExpr3316); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1412:1: entryRuleFalseExpr returns [EObject current=null] : iv_ruleFalseExpr= ruleFalseExpr EOF ;
    public final EObject entryRuleFalseExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1413:2: (iv_ruleFalseExpr= ruleFalseExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1414:2: iv_ruleFalseExpr= ruleFalseExpr EOF
            {
             newCompositeNode(grammarAccess.getFalseExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFalseExpr_in_entryRuleFalseExpr3352);
            iv_ruleFalseExpr=ruleFalseExpr();

            state._fsp--;

             current =iv_ruleFalseExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFalseExpr3362); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1421:1: ruleFalseExpr returns [EObject current=null] : ( () otherlv_1= 'false' ) ;
    public final EObject ruleFalseExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1424:28: ( ( () otherlv_1= 'false' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1425:1: ( () otherlv_1= 'false' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1425:1: ( () otherlv_1= 'false' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1425:2: () otherlv_1= 'false'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1425:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1426:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFalseExprAccess().getFalseExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFalseExpr3408); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1443:1: entryRuleStateExpr returns [EObject current=null] : iv_ruleStateExpr= ruleStateExpr EOF ;
    public final EObject entryRuleStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1444:2: (iv_ruleStateExpr= ruleStateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1445:2: iv_ruleStateExpr= ruleStateExpr EOF
            {
             newCompositeNode(grammarAccess.getStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateExpr_in_entryRuleStateExpr3444);
            iv_ruleStateExpr=ruleStateExpr();

            state._fsp--;

             current =iv_ruleStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateExpr3454); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1452:1: ruleStateExpr returns [EObject current=null] : (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr ) ;
    public final EObject ruleStateExpr() throws RecognitionException {
        EObject current = null;

        EObject this_StateActiveExpr_0 = null;

        EObject this_SubstateOfExpr_1 = null;

        EObject this_StateInStatechartExpr_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1455:28: ( (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1456:1: (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1456:1: (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr | this_StateInStatechartExpr_2= ruleStateInStatechartExpr )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt17=1;
                }
                break;
            case 39:
                {
                alt17=2;
                }
                break;
            case 40:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1457:5: this_StateActiveExpr_0= ruleStateActiveExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getStateActiveExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateActiveExpr_in_ruleStateExpr3501);
                    this_StateActiveExpr_0=ruleStateActiveExpr();

                    state._fsp--;

                     
                            current = this_StateActiveExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1467:5: this_SubstateOfExpr_1= ruleSubstateOfExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getSubstateOfExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubstateOfExpr_in_ruleStateExpr3528);
                    this_SubstateOfExpr_1=ruleSubstateOfExpr();

                    state._fsp--;

                     
                            current = this_SubstateOfExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1477:5: this_StateInStatechartExpr_2= ruleStateInStatechartExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getStateInStatechartExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateInStatechartExpr_in_ruleStateExpr3555);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1493:1: entryRuleStateActiveExpr returns [EObject current=null] : iv_ruleStateActiveExpr= ruleStateActiveExpr EOF ;
    public final EObject entryRuleStateActiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateActiveExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1494:2: (iv_ruleStateActiveExpr= ruleStateActiveExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1495:2: iv_ruleStateActiveExpr= ruleStateActiveExpr EOF
            {
             newCompositeNode(grammarAccess.getStateActiveExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateActiveExpr_in_entryRuleStateActiveExpr3590);
            iv_ruleStateActiveExpr=ruleStateActiveExpr();

            state._fsp--;

             current =iv_ruleStateActiveExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateActiveExpr3600); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1502:1: ruleStateActiveExpr returns [EObject current=null] : (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleStateActiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_state_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1505:28: ( (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1506:1: (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1506:1: (otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1506:3: otherlv_0= 'stateActive' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleStateActiveExpr3637); 

                	newLeafNode(otherlv_0, grammarAccess.getStateActiveExprAccess().getStateActiveKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStateActiveExpr3649); 

                	newLeafNode(otherlv_1, grammarAccess.getStateActiveExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1514:1: ( (lv_state_2_0= ruleStateMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1515:1: (lv_state_2_0= ruleStateMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1515:1: (lv_state_2_0= ruleStateMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1516:3: lv_state_2_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getStateActiveExprAccess().getStateStateMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_ruleStateActiveExpr3670);
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

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStateActiveExpr3682); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1544:1: entryRuleSubstateOfExpr returns [EObject current=null] : iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF ;
    public final EObject entryRuleSubstateOfExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstateOfExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1545:2: (iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1546:2: iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF
            {
             newCompositeNode(grammarAccess.getSubstateOfExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubstateOfExpr_in_entryRuleSubstateOfExpr3718);
            iv_ruleSubstateOfExpr=ruleSubstateOfExpr();

            state._fsp--;

             current =iv_ruleSubstateOfExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubstateOfExpr3728); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1553:1: ruleSubstateOfExpr returns [EObject current=null] : (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1556:28: ( (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1557:1: (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1557:1: (otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1557:3: otherlv_0= 'substateOf' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_superstate_4_0= ruleStateMapExpr ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSubstateOfExpr3765); 

                	newLeafNode(otherlv_0, grammarAccess.getSubstateOfExprAccess().getSubstateOfKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSubstateOfExpr3777); 

                	newLeafNode(otherlv_1, grammarAccess.getSubstateOfExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1565:1: ( (lv_state_2_0= ruleStateMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1566:1: (lv_state_2_0= ruleStateMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1566:1: (lv_state_2_0= ruleStateMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1567:3: lv_state_2_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubstateOfExprAccess().getStateStateMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_ruleSubstateOfExpr3798);
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

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSubstateOfExpr3810); 

                	newLeafNode(otherlv_3, grammarAccess.getSubstateOfExprAccess().getCommaKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1587:1: ( (lv_superstate_4_0= ruleStateMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1588:1: (lv_superstate_4_0= ruleStateMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1588:1: (lv_superstate_4_0= ruleStateMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1589:3: lv_superstate_4_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubstateOfExprAccess().getSuperstateStateMapExprParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_ruleSubstateOfExpr3831);
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

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSubstateOfExpr3843); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1617:1: entryRuleStateInStatechartExpr returns [EObject current=null] : iv_ruleStateInStatechartExpr= ruleStateInStatechartExpr EOF ;
    public final EObject entryRuleStateInStatechartExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateInStatechartExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1618:2: (iv_ruleStateInStatechartExpr= ruleStateInStatechartExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1619:2: iv_ruleStateInStatechartExpr= ruleStateInStatechartExpr EOF
            {
             newCompositeNode(grammarAccess.getStateInStatechartExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateInStatechartExpr_in_entryRuleStateInStatechartExpr3879);
            iv_ruleStateInStatechartExpr=ruleStateInStatechartExpr();

            state._fsp--;

             current =iv_ruleStateInStatechartExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateInStatechartExpr3889); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1626:1: ruleStateInStatechartExpr returns [EObject current=null] : (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1629:28: ( (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1630:1: (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1630:1: (otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1630:3: otherlv_0= 'stateInStatechart' otherlv_1= '(' ( (lv_state_2_0= ruleStateMapExpr ) ) otherlv_3= ',' ( (lv_statechart_4_0= ruleStatechartMapExpr ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleStateInStatechartExpr3926); 

                	newLeafNode(otherlv_0, grammarAccess.getStateInStatechartExprAccess().getStateInStatechartKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStateInStatechartExpr3938); 

                	newLeafNode(otherlv_1, grammarAccess.getStateInStatechartExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1638:1: ( (lv_state_2_0= ruleStateMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1639:1: (lv_state_2_0= ruleStateMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1639:1: (lv_state_2_0= ruleStateMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1640:3: lv_state_2_0= ruleStateMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getStateInStatechartExprAccess().getStateStateMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_ruleStateInStatechartExpr3959);
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

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateInStatechartExpr3971); 

                	newLeafNode(otherlv_3, grammarAccess.getStateInStatechartExprAccess().getCommaKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1660:1: ( (lv_statechart_4_0= ruleStatechartMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1661:1: (lv_statechart_4_0= ruleStatechartMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1661:1: (lv_statechart_4_0= ruleStatechartMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1662:3: lv_statechart_4_0= ruleStatechartMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getStateInStatechartExprAccess().getStatechartStatechartMapExprParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStatechartMapExpr_in_ruleStateInStatechartExpr3992);
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

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStateInStatechartExpr4004); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1690:1: entryRuleMessageExpr returns [EObject current=null] : iv_ruleMessageExpr= ruleMessageExpr EOF ;
    public final EObject entryRuleMessageExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1691:2: (iv_ruleMessageExpr= ruleMessageExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1692:2: iv_ruleMessageExpr= ruleMessageExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageExpr_in_entryRuleMessageExpr4040);
            iv_ruleMessageExpr=ruleMessageExpr();

            state._fsp--;

             current =iv_ruleMessageExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageExpr4050); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1699:1: ruleMessageExpr returns [EObject current=null] : (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr ) ;
    public final EObject ruleMessageExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MessageInBufferExpr_0 = null;

        EObject this_MessageInTransitExpr_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1702:28: ( (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1703:1: (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1703:1: (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            else if ( (LA18_0==41) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1704:5: this_MessageInBufferExpr_0= ruleMessageInBufferExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getMessageInBufferExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageInBufferExpr_in_ruleMessageExpr4097);
                    this_MessageInBufferExpr_0=ruleMessageInBufferExpr();

                    state._fsp--;

                     
                            current = this_MessageInBufferExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1714:5: this_MessageInTransitExpr_1= ruleMessageInTransitExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getMessageInTransitExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageInTransitExpr_in_ruleMessageExpr4124);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1730:1: entryRuleMessageInTransitExpr returns [EObject current=null] : iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF ;
    public final EObject entryRuleMessageInTransitExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInTransitExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1731:2: (iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1732:2: iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageInTransitExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageInTransitExpr_in_entryRuleMessageInTransitExpr4159);
            iv_ruleMessageInTransitExpr=ruleMessageInTransitExpr();

            state._fsp--;

             current =iv_ruleMessageInTransitExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageInTransitExpr4169); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1739:1: ruleMessageInTransitExpr returns [EObject current=null] : (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleMessageInTransitExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_message_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1742:28: ( (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1743:1: (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1743:1: (otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1743:3: otherlv_0= 'messageInTransit' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMessageInTransitExpr4206); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageInTransitExprAccess().getMessageInTransitKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMessageInTransitExpr4218); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageInTransitExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1751:1: ( (lv_message_2_0= ruleMessageMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1752:1: (lv_message_2_0= ruleMessageMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1752:1: (lv_message_2_0= ruleMessageMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1753:3: lv_message_2_0= ruleMessageMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageInTransitExprAccess().getMessageMessageMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMessageMapExpr_in_ruleMessageInTransitExpr4239);
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

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMessageInTransitExpr4251); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1781:1: entryRuleMessageInBufferExpr returns [EObject current=null] : iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF ;
    public final EObject entryRuleMessageInBufferExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInBufferExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1782:2: (iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1783:2: iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageInBufferExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageInBufferExpr_in_entryRuleMessageInBufferExpr4287);
            iv_ruleMessageInBufferExpr=ruleMessageInBufferExpr();

            state._fsp--;

             current =iv_ruleMessageInBufferExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageInBufferExpr4297); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1790:1: ruleMessageInBufferExpr returns [EObject current=null] : (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1793:28: ( (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1794:1: (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1794:1: (otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1794:3: otherlv_0= 'messageInBuffer' otherlv_1= '(' ( (lv_message_2_0= ruleMessageMapExpr ) ) otherlv_3= ',' ( (lv_buffer_4_0= ruleBufferMapExpr ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMessageInBufferExpr4334); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageInBufferExprAccess().getMessageInBufferKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMessageInBufferExpr4346); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageInBufferExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1802:1: ( (lv_message_2_0= ruleMessageMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1803:1: (lv_message_2_0= ruleMessageMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1803:1: (lv_message_2_0= ruleMessageMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1804:3: lv_message_2_0= ruleMessageMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageInBufferExprAccess().getMessageMessageMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMessageMapExpr_in_ruleMessageInBufferExpr4367);
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

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMessageInBufferExpr4379); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageInBufferExprAccess().getCommaKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1824:1: ( (lv_buffer_4_0= ruleBufferMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1825:1: (lv_buffer_4_0= ruleBufferMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1825:1: (lv_buffer_4_0= ruleBufferMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1826:3: lv_buffer_4_0= ruleBufferMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getMessageInBufferExprAccess().getBufferBufferMapExprParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBufferMapExpr_in_ruleMessageInBufferExpr4400);
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

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMessageInBufferExpr4412); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1854:1: entryRuleTransitionExpr returns [EObject current=null] : iv_ruleTransitionExpr= ruleTransitionExpr EOF ;
    public final EObject entryRuleTransitionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1855:2: (iv_ruleTransitionExpr= ruleTransitionExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1856:2: iv_ruleTransitionExpr= ruleTransitionExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransitionExpr_in_entryRuleTransitionExpr4448);
            iv_ruleTransitionExpr=ruleTransitionExpr();

            state._fsp--;

             current =iv_ruleTransitionExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionExpr4458); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1863:1: ruleTransitionExpr returns [EObject current=null] : this_TransitionFiringExpr_0= ruleTransitionFiringExpr ;
    public final EObject ruleTransitionExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TransitionFiringExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1866:28: (this_TransitionFiringExpr_0= ruleTransitionFiringExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1868:5: this_TransitionFiringExpr_0= ruleTransitionFiringExpr
            {
             
                    newCompositeNode(grammarAccess.getTransitionExprAccess().getTransitionFiringExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTransitionFiringExpr_in_ruleTransitionExpr4504);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1884:1: entryRuleTransitionFiringExpr returns [EObject current=null] : iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF ;
    public final EObject entryRuleTransitionFiringExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFiringExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1885:2: (iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1886:2: iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionFiringExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransitionFiringExpr_in_entryRuleTransitionFiringExpr4538);
            iv_ruleTransitionFiringExpr=ruleTransitionFiringExpr();

            state._fsp--;

             current =iv_ruleTransitionFiringExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionFiringExpr4548); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1893:1: ruleTransitionFiringExpr returns [EObject current=null] : (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleTransitionFiringExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transition_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1896:28: ( (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1897:1: (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1897:1: (otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1897:3: otherlv_0= 'transitionFiring' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTransitionFiringExpr4585); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionFiringExprAccess().getTransitionFiringKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTransitionFiringExpr4597); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionFiringExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1905:1: ( (lv_transition_2_0= ruleTransitionMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1906:1: (lv_transition_2_0= ruleTransitionMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1906:1: (lv_transition_2_0= ruleTransitionMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1907:3: lv_transition_2_0= ruleTransitionMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getTransitionFiringExprAccess().getTransitionTransitionMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransitionMapExpr_in_ruleTransitionFiringExpr4618);
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

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTransitionFiringExpr4630); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1935:1: entryRuleComparisonExpr returns [EObject current=null] : iv_ruleComparisonExpr= ruleComparisonExpr EOF ;
    public final EObject entryRuleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1936:2: (iv_ruleComparisonExpr= ruleComparisonExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1937:2: iv_ruleComparisonExpr= ruleComparisonExpr EOF
            {
             newCompositeNode(grammarAccess.getComparisonExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr4666);
            iv_ruleComparisonExpr=ruleComparisonExpr();

            state._fsp--;

             current =iv_ruleComparisonExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpr4676); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1944:1: ruleComparisonExpr returns [EObject current=null] : ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) ) ;
    public final EObject ruleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1947:28: ( ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1948:1: ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1948:1: ( () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1948:2: () ( (lv_lhs_1_0= ruleMapExpr ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( (lv_rhs_3_0= ruleMapExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1948:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1949:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComparisonExprAccess().getComparisonExprAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1954:2: ( (lv_lhs_1_0= ruleMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1955:1: (lv_lhs_1_0= ruleMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1955:1: (lv_lhs_1_0= ruleMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1956:3: lv_lhs_1_0= ruleMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getLhsMapExprParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMapExpr_in_ruleComparisonExpr4731);
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

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1972:2: ( (lv_op_2_0= ruleComparisonOp ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1973:1: (lv_op_2_0= ruleComparisonOp )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1973:1: (lv_op_2_0= ruleComparisonOp )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1974:3: lv_op_2_0= ruleComparisonOp
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getOpComparisonOpEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparisonOp_in_ruleComparisonExpr4752);
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

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1990:2: ( (lv_rhs_3_0= ruleMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1991:1: (lv_rhs_3_0= ruleMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1991:1: (lv_rhs_3_0= ruleMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1992:3: lv_rhs_3_0= ruleMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getRhsMapExprParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMapExpr_in_ruleComparisonExpr4773);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2016:1: entryRuleMapExpr returns [EObject current=null] : iv_ruleMapExpr= ruleMapExpr EOF ;
    public final EObject entryRuleMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2017:2: (iv_ruleMapExpr= ruleMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2018:2: iv_ruleMapExpr= ruleMapExpr EOF
            {
             newCompositeNode(grammarAccess.getMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMapExpr_in_entryRuleMapExpr4809);
            iv_ruleMapExpr=ruleMapExpr();

            state._fsp--;

             current =iv_ruleMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapExpr4819); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2025:1: ruleMapExpr returns [EObject current=null] : (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr ) ;
    public final EObject ruleMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;

        EObject this_BufferMessageCountExpr_1 = null;

        EObject this_ConstExpr_2 = null;

        EObject this_SourceStateExpr_3 = null;

        EObject this_TargetStateExpr_4 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2028:28: ( (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2029:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2029:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr | this_ConstExpr_2= ruleConstExpr | this_SourceStateExpr_3= ruleSourceStateExpr | this_TargetStateExpr_4= ruleTargetStateExpr )
            int alt19=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case 44:
                {
                alt19=2;
                }
                break;
            case RULE_INT:
            case 60:
                {
                alt19=3;
                }
                break;
            case 45:
                {
                alt19=4;
                }
                break;
            case 46:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2030:5: this_MumlElemExpr_0= ruleMumlElemExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getMumlElemExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleMapExpr4866);
                    this_MumlElemExpr_0=ruleMumlElemExpr();

                    state._fsp--;

                     
                            current = this_MumlElemExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2040:5: this_BufferMessageCountExpr_1= ruleBufferMessageCountExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getBufferMessageCountExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBufferMessageCountExpr_in_ruleMapExpr4893);
                    this_BufferMessageCountExpr_1=ruleBufferMessageCountExpr();

                    state._fsp--;

                     
                            current = this_BufferMessageCountExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2050:5: this_ConstExpr_2= ruleConstExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getConstExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstExpr_in_ruleMapExpr4920);
                    this_ConstExpr_2=ruleConstExpr();

                    state._fsp--;

                     
                            current = this_ConstExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2060:5: this_SourceStateExpr_3= ruleSourceStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getSourceStateExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSourceStateExpr_in_ruleMapExpr4947);
                    this_SourceStateExpr_3=ruleSourceStateExpr();

                    state._fsp--;

                     
                            current = this_SourceStateExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2070:5: this_TargetStateExpr_4= ruleTargetStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMapExprAccess().getTargetStateExprParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTargetStateExpr_in_ruleMapExpr4974);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2088:1: entryRuleTransitionMapExpr returns [EObject current=null] : iv_ruleTransitionMapExpr= ruleTransitionMapExpr EOF ;
    public final EObject entryRuleTransitionMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2089:2: (iv_ruleTransitionMapExpr= ruleTransitionMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2090:2: iv_ruleTransitionMapExpr= ruleTransitionMapExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransitionMapExpr_in_entryRuleTransitionMapExpr5011);
            iv_ruleTransitionMapExpr=ruleTransitionMapExpr();

            state._fsp--;

             current =iv_ruleTransitionMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionMapExpr5021); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2097:1: ruleTransitionMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleTransitionMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2100:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2102:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getTransitionMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleTransitionMapExpr5067);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2118:1: entryRuleStateMapExpr returns [EObject current=null] : iv_ruleStateMapExpr= ruleStateMapExpr EOF ;
    public final EObject entryRuleStateMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2119:2: (iv_ruleStateMapExpr= ruleStateMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2120:2: iv_ruleStateMapExpr= ruleStateMapExpr EOF
            {
             newCompositeNode(grammarAccess.getStateMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMapExpr_in_entryRuleStateMapExpr5101);
            iv_ruleStateMapExpr=ruleStateMapExpr();

            state._fsp--;

             current =iv_ruleStateMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMapExpr5111); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2127:1: ruleStateMapExpr returns [EObject current=null] : (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr ) ;
    public final EObject ruleStateMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;

        EObject this_SourceStateExpr_1 = null;

        EObject this_TargetStateExpr_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2130:28: ( (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2131:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2131:1: (this_MumlElemExpr_0= ruleMumlElemExpr | this_SourceStateExpr_1= ruleSourceStateExpr | this_TargetStateExpr_2= ruleTargetStateExpr )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case 45:
                {
                alt20=2;
                }
                break;
            case 46:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2132:5: this_MumlElemExpr_0= ruleMumlElemExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateMapExprAccess().getMumlElemExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleStateMapExpr5158);
                    this_MumlElemExpr_0=ruleMumlElemExpr();

                    state._fsp--;

                     
                            current = this_MumlElemExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2142:5: this_SourceStateExpr_1= ruleSourceStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateMapExprAccess().getSourceStateExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSourceStateExpr_in_ruleStateMapExpr5185);
                    this_SourceStateExpr_1=ruleSourceStateExpr();

                    state._fsp--;

                     
                            current = this_SourceStateExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2152:5: this_TargetStateExpr_2= ruleTargetStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateMapExprAccess().getTargetStateExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTargetStateExpr_in_ruleStateMapExpr5212);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2168:1: entryRuleStatechartMapExpr returns [EObject current=null] : iv_ruleStatechartMapExpr= ruleStatechartMapExpr EOF ;
    public final EObject entryRuleStatechartMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatechartMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2169:2: (iv_ruleStatechartMapExpr= ruleStatechartMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2170:2: iv_ruleStatechartMapExpr= ruleStatechartMapExpr EOF
            {
             newCompositeNode(grammarAccess.getStatechartMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStatechartMapExpr_in_entryRuleStatechartMapExpr5247);
            iv_ruleStatechartMapExpr=ruleStatechartMapExpr();

            state._fsp--;

             current =iv_ruleStatechartMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStatechartMapExpr5257); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2177:1: ruleStatechartMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleStatechartMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2180:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2182:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getStatechartMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleStatechartMapExpr5303);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2198:1: entryRuleBufferMapExpr returns [EObject current=null] : iv_ruleBufferMapExpr= ruleBufferMapExpr EOF ;
    public final EObject entryRuleBufferMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2199:2: (iv_ruleBufferMapExpr= ruleBufferMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2200:2: iv_ruleBufferMapExpr= ruleBufferMapExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBufferMapExpr_in_entryRuleBufferMapExpr5337);
            iv_ruleBufferMapExpr=ruleBufferMapExpr();

            state._fsp--;

             current =iv_ruleBufferMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBufferMapExpr5347); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2207:1: ruleBufferMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleBufferMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2210:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2212:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getBufferMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleBufferMapExpr5393);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2228:1: entryRuleMessageMapExpr returns [EObject current=null] : iv_ruleMessageMapExpr= ruleMessageMapExpr EOF ;
    public final EObject entryRuleMessageMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2229:2: (iv_ruleMessageMapExpr= ruleMessageMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2230:2: iv_ruleMessageMapExpr= ruleMessageMapExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageMapExpr_in_entryRuleMessageMapExpr5427);
            iv_ruleMessageMapExpr=ruleMessageMapExpr();

            state._fsp--;

             current =iv_ruleMessageMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageMapExpr5437); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2237:1: ruleMessageMapExpr returns [EObject current=null] : this_MumlElemExpr_0= ruleMumlElemExpr ;
    public final EObject ruleMessageMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MumlElemExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2240:28: (this_MumlElemExpr_0= ruleMumlElemExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2242:5: this_MumlElemExpr_0= ruleMumlElemExpr
            {
             
                    newCompositeNode(grammarAccess.getMessageMapExprAccess().getMumlElemExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_ruleMessageMapExpr5483);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2258:1: entryRuleBufferMessageCountExpr returns [EObject current=null] : iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF ;
    public final EObject entryRuleBufferMessageCountExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferMessageCountExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2259:2: (iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2260:2: iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferMessageCountExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBufferMessageCountExpr_in_entryRuleBufferMessageCountExpr5517);
            iv_ruleBufferMessageCountExpr=ruleBufferMessageCountExpr();

            state._fsp--;

             current =iv_ruleBufferMessageCountExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBufferMessageCountExpr5527); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2267:1: ruleBufferMessageCountExpr returns [EObject current=null] : (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleBufferMessageCountExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_buffer_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2270:28: ( (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2271:1: (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2271:1: (otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2271:3: otherlv_0= 'bufferMessageCount' otherlv_1= '(' ( (lv_buffer_2_0= ruleBufferMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleBufferMessageCountExpr5564); 

                	newLeafNode(otherlv_0, grammarAccess.getBufferMessageCountExprAccess().getBufferMessageCountKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBufferMessageCountExpr5576); 

                	newLeafNode(otherlv_1, grammarAccess.getBufferMessageCountExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2279:1: ( (lv_buffer_2_0= ruleBufferMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2280:1: (lv_buffer_2_0= ruleBufferMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2280:1: (lv_buffer_2_0= ruleBufferMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2281:3: lv_buffer_2_0= ruleBufferMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getBufferMessageCountExprAccess().getBufferBufferMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBufferMapExpr_in_ruleBufferMessageCountExpr5597);
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

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBufferMessageCountExpr5609); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2309:1: entryRuleSourceStateExpr returns [EObject current=null] : iv_ruleSourceStateExpr= ruleSourceStateExpr EOF ;
    public final EObject entryRuleSourceStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceStateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2310:2: (iv_ruleSourceStateExpr= ruleSourceStateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2311:2: iv_ruleSourceStateExpr= ruleSourceStateExpr EOF
            {
             newCompositeNode(grammarAccess.getSourceStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSourceStateExpr_in_entryRuleSourceStateExpr5645);
            iv_ruleSourceStateExpr=ruleSourceStateExpr();

            state._fsp--;

             current =iv_ruleSourceStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSourceStateExpr5655); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2318:1: ruleSourceStateExpr returns [EObject current=null] : (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleSourceStateExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transition_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2321:28: ( (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2322:1: (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2322:1: (otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2322:3: otherlv_0= 'sourceState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleSourceStateExpr5692); 

                	newLeafNode(otherlv_0, grammarAccess.getSourceStateExprAccess().getSourceStateKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSourceStateExpr5704); 

                	newLeafNode(otherlv_1, grammarAccess.getSourceStateExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2330:1: ( (lv_transition_2_0= ruleTransitionMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2331:1: (lv_transition_2_0= ruleTransitionMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2331:1: (lv_transition_2_0= ruleTransitionMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2332:3: lv_transition_2_0= ruleTransitionMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getSourceStateExprAccess().getTransitionTransitionMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransitionMapExpr_in_ruleSourceStateExpr5725);
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

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSourceStateExpr5737); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2360:1: entryRuleTargetStateExpr returns [EObject current=null] : iv_ruleTargetStateExpr= ruleTargetStateExpr EOF ;
    public final EObject entryRuleTargetStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetStateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2361:2: (iv_ruleTargetStateExpr= ruleTargetStateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2362:2: iv_ruleTargetStateExpr= ruleTargetStateExpr EOF
            {
             newCompositeNode(grammarAccess.getTargetStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTargetStateExpr_in_entryRuleTargetStateExpr5773);
            iv_ruleTargetStateExpr=ruleTargetStateExpr();

            state._fsp--;

             current =iv_ruleTargetStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTargetStateExpr5783); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2369:1: ruleTargetStateExpr returns [EObject current=null] : (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleTargetStateExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_transition_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2372:28: ( (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2373:1: (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2373:1: (otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2373:3: otherlv_0= 'targetState' otherlv_1= '(' ( (lv_transition_2_0= ruleTransitionMapExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTargetStateExpr5820); 

                	newLeafNode(otherlv_0, grammarAccess.getTargetStateExprAccess().getTargetStateKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTargetStateExpr5832); 

                	newLeafNode(otherlv_1, grammarAccess.getTargetStateExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2381:1: ( (lv_transition_2_0= ruleTransitionMapExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2382:1: (lv_transition_2_0= ruleTransitionMapExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2382:1: (lv_transition_2_0= ruleTransitionMapExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2383:3: lv_transition_2_0= ruleTransitionMapExpr
            {
             
            	        newCompositeNode(grammarAccess.getTargetStateExprAccess().getTransitionTransitionMapExprParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTransitionMapExpr_in_ruleTargetStateExpr5853);
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

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTargetStateExpr5865); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2411:1: entryRuleMumlElemExpr returns [EObject current=null] : iv_ruleMumlElemExpr= ruleMumlElemExpr EOF ;
    public final EObject entryRuleMumlElemExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMumlElemExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2412:2: (iv_ruleMumlElemExpr= ruleMumlElemExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2413:2: iv_ruleMumlElemExpr= ruleMumlElemExpr EOF
            {
             newCompositeNode(grammarAccess.getMumlElemExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMumlElemExpr_in_entryRuleMumlElemExpr5901);
            iv_ruleMumlElemExpr=ruleMumlElemExpr();

            state._fsp--;

             current =iv_ruleMumlElemExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMumlElemExpr5911); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2420:1: ruleMumlElemExpr returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleMumlElemExpr() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2423:28: ( ( ( ruleQualifiedName ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2424:1: ( ( ruleQualifiedName ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2424:1: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2425:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2425:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2426:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMumlElemExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMumlElemExprAccess().getElemEObjectCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMumlElemExpr5958);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2447:1: entryRuleConstExpr returns [EObject current=null] : iv_ruleConstExpr= ruleConstExpr EOF ;
    public final EObject entryRuleConstExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2448:2: (iv_ruleConstExpr= ruleConstExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2449:2: iv_ruleConstExpr= ruleConstExpr EOF
            {
             newCompositeNode(grammarAccess.getConstExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstExpr_in_entryRuleConstExpr5993);
            iv_ruleConstExpr=ruleConstExpr();

            state._fsp--;

             current =iv_ruleConstExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstExpr6003); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2456:1: ruleConstExpr returns [EObject current=null] : ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? ) ;
    public final EObject ruleConstExpr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;

        AntlrDatatypeRuleToken lv_timeUnit_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2459:28: ( ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2460:1: ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2460:1: ( ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )? )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2460:2: ( (lv_val_0_0= ruleEInt ) ) ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2460:2: ( (lv_val_0_0= ruleEInt ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2461:1: (lv_val_0_0= ruleEInt )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2461:1: (lv_val_0_0= ruleEInt )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2462:3: lv_val_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getConstExprAccess().getValEIntParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConstExpr6049);
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

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2478:2: ( (lv_timeUnit_1_0= ruleTimeUnitExpr ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=47 && LA21_0<=53)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2479:1: (lv_timeUnit_1_0= ruleTimeUnitExpr )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2479:1: (lv_timeUnit_1_0= ruleTimeUnitExpr )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2480:3: lv_timeUnit_1_0= ruleTimeUnitExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstExprAccess().getTimeUnitTimeUnitExprParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTimeUnitExpr_in_ruleConstExpr6070);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2504:1: entryRuleTimeUnitExpr returns [String current=null] : iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF ;
    public final String entryRuleTimeUnitExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnitExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2505:2: (iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2506:2: iv_ruleTimeUnitExpr= ruleTimeUnitExpr EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeUnitExpr_in_entryRuleTimeUnitExpr6108);
            iv_ruleTimeUnitExpr=ruleTimeUnitExpr();

            state._fsp--;

             current =iv_ruleTimeUnitExpr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeUnitExpr6119); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2513:1: ruleTimeUnitExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00B5secs' | kw= 'nsecs' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnitExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2516:28: ( (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00B5secs' | kw= 'nsecs' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2517:1: (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00B5secs' | kw= 'nsecs' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2517:1: (kw= 'days' | kw= 'hrs' | kw= 'mins' | kw= 'secs' | kw= 'msecs' | kw= '\\u00B5secs' | kw= 'nsecs' )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt22=1;
                }
                break;
            case 48:
                {
                alt22=2;
                }
                break;
            case 49:
                {
                alt22=3;
                }
                break;
            case 50:
                {
                alt22=4;
                }
                break;
            case 51:
                {
                alt22=5;
                }
                break;
            case 52:
                {
                alt22=6;
                }
                break;
            case 53:
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2518:2: kw= 'days'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTimeUnitExpr6157); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getDaysKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2525:2: kw= 'hrs'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTimeUnitExpr6176); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getHrsKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2532:2: kw= 'mins'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTimeUnitExpr6195); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMinsKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2539:2: kw= 'secs'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTimeUnitExpr6214); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSecsKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2546:2: kw= 'msecs'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTimeUnitExpr6233); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getMsecsKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2553:2: kw= '\\u00B5secs'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTimeUnitExpr6252); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeUnitExprAccess().getSecsKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2560:2: kw= 'nsecs'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTimeUnitExpr6271); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2573:1: entryRuleSetExpr returns [EObject current=null] : iv_ruleSetExpr= ruleSetExpr EOF ;
    public final EObject entryRuleSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2574:2: (iv_ruleSetExpr= ruleSetExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2575:2: iv_ruleSetExpr= ruleSetExpr EOF
            {
             newCompositeNode(grammarAccess.getSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetExpr_in_entryRuleSetExpr6311);
            iv_ruleSetExpr=ruleSetExpr();

            state._fsp--;

             current =iv_ruleSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetExpr6321); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2582:1: ruleSetExpr returns [EObject current=null] : (this_IntervalSetExpr_0= ruleIntervalSetExpr | ( () otherlv_2= 'States' ) | ( () otherlv_4= 'Transitions' ) | ( () otherlv_6= 'MessageTypes' ) | ( () otherlv_8= 'Clocks' ) | ( () otherlv_10= 'Buffers' ) ) ;
    public final EObject ruleSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_IntervalSetExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2585:28: ( (this_IntervalSetExpr_0= ruleIntervalSetExpr | ( () otherlv_2= 'States' ) | ( () otherlv_4= 'Transitions' ) | ( () otherlv_6= 'MessageTypes' ) | ( () otherlv_8= 'Clocks' ) | ( () otherlv_10= 'Buffers' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2586:1: (this_IntervalSetExpr_0= ruleIntervalSetExpr | ( () otherlv_2= 'States' ) | ( () otherlv_4= 'Transitions' ) | ( () otherlv_6= 'MessageTypes' ) | ( () otherlv_8= 'Clocks' ) | ( () otherlv_10= 'Buffers' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2586:1: (this_IntervalSetExpr_0= ruleIntervalSetExpr | ( () otherlv_2= 'States' ) | ( () otherlv_4= 'Transitions' ) | ( () otherlv_6= 'MessageTypes' ) | ( () otherlv_8= 'Clocks' ) | ( () otherlv_10= 'Buffers' ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt23=1;
                }
                break;
            case 54:
                {
                alt23=2;
                }
                break;
            case 55:
                {
                alt23=3;
                }
                break;
            case 56:
                {
                alt23=4;
                }
                break;
            case 57:
                {
                alt23=5;
                }
                break;
            case 58:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2587:5: this_IntervalSetExpr_0= ruleIntervalSetExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSetExprAccess().getIntervalSetExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntervalSetExpr_in_ruleSetExpr6368);
                    this_IntervalSetExpr_0=ruleIntervalSetExpr();

                    state._fsp--;

                     
                            current = this_IntervalSetExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2596:6: ( () otherlv_2= 'States' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2596:6: ( () otherlv_2= 'States' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2596:7: () otherlv_2= 'States'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2596:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2597:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getStateSetExprAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSetExpr6395); 

                        	newLeafNode(otherlv_2, grammarAccess.getSetExprAccess().getStatesKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2607:6: ( () otherlv_4= 'Transitions' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2607:6: ( () otherlv_4= 'Transitions' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2607:7: () otherlv_4= 'Transitions'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2607:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2608:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getTransitionSetExprAction_2_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleSetExpr6424); 

                        	newLeafNode(otherlv_4, grammarAccess.getSetExprAccess().getTransitionsKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2618:6: ( () otherlv_6= 'MessageTypes' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2618:6: ( () otherlv_6= 'MessageTypes' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2618:7: () otherlv_6= 'MessageTypes'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2618:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2619:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getMessageSetExprAction_3_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleSetExpr6453); 

                        	newLeafNode(otherlv_6, grammarAccess.getSetExprAccess().getMessageTypesKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2629:6: ( () otherlv_8= 'Clocks' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2629:6: ( () otherlv_8= 'Clocks' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2629:7: () otherlv_8= 'Clocks'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2629:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2630:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getClockSetExprAction_4_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleSetExpr6482); 

                        	newLeafNode(otherlv_8, grammarAccess.getSetExprAccess().getClocksKeyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2640:6: ( () otherlv_10= 'Buffers' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2640:6: ( () otherlv_10= 'Buffers' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2640:7: () otherlv_10= 'Buffers'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2640:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2641:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getBufferSetExprAction_5_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleSetExpr6511); 

                        	newLeafNode(otherlv_10, grammarAccess.getSetExprAccess().getBuffersKeyword_5_1());
                        

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2658:1: entryRuleIntervalSetExpr returns [EObject current=null] : iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF ;
    public final EObject entryRuleIntervalSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervalSetExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2659:2: (iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2660:2: iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF
            {
             newCompositeNode(grammarAccess.getIntervalSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntervalSetExpr_in_entryRuleIntervalSetExpr6548);
            iv_ruleIntervalSetExpr=ruleIntervalSetExpr();

            state._fsp--;

             current =iv_ruleIntervalSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntervalSetExpr6558); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2667:1: ruleIntervalSetExpr returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' ) ;
    public final EObject ruleIntervalSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lowerVal_2_0=null;
        Token otherlv_3=null;
        Token lv_upperVal_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2670:28: ( ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2671:1: ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2671:1: ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2671:2: () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2671:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2672:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntervalSetExprAccess().getIntervalSetExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntervalSetExpr6604); 

                	newLeafNode(otherlv_1, grammarAccess.getIntervalSetExprAccess().getLeftSquareBracketKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2681:1: ( (lv_lowerVal_2_0= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2682:1: (lv_lowerVal_2_0= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2682:1: (lv_lowerVal_2_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2683:3: lv_lowerVal_2_0= RULE_INT
            {
            lv_lowerVal_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntervalSetExpr6621); 

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

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntervalSetExpr6638); 

                	newLeafNode(otherlv_3, grammarAccess.getIntervalSetExprAccess().getCommaKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2703:1: ( (lv_upperVal_4_0= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2704:1: (lv_upperVal_4_0= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2704:1: (lv_upperVal_4_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2705:3: lv_upperVal_4_0= RULE_INT
            {
            lv_upperVal_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntervalSetExpr6655); 

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

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntervalSetExpr6672); 

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2733:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2734:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2735:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6709);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName6720); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2742:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2745:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2746:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2746:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2746:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName6760); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2753:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==59) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2754:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleQualifiedName6779); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName6794); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2774:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2775:2: (iv_ruleEInt= ruleEInt EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2776:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt6842);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt6853); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2783:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2786:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2787:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2787:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2787:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2787:2: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==60) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2788:2: kw= '-'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleEInt6892); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt6909); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2808:1: ruleComparisonOp returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2810:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2811:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2811:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt26=1;
                }
                break;
            case 62:
                {
                alt26=2;
                }
                break;
            case 63:
                {
                alt26=3;
                }
                break;
            case 64:
                {
                alt26=4;
                }
                break;
            case 65:
                {
                alt26=5;
                }
                break;
            case 66:
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2811:2: (enumLiteral_0= '==' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2811:2: (enumLiteral_0= '==' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2811:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleComparisonOp6968); 

                            current = grammarAccess.getComparisonOpAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpAccess().getEQUALSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2817:6: (enumLiteral_1= '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2817:6: (enumLiteral_1= '>' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2817:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleComparisonOp6985); 

                            current = grammarAccess.getComparisonOpAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpAccess().getGREATEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2823:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2823:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2823:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleComparisonOp7002); 

                            current = grammarAccess.getComparisonOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2829:6: (enumLiteral_3= '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2829:6: (enumLiteral_3= '<' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2829:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleComparisonOp7019); 

                            current = grammarAccess.getComparisonOpAccess().getLESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpAccess().getLESSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2835:6: (enumLiteral_4= '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2835:6: (enumLiteral_4= '<=' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2835:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleComparisonOp7036); 

                            current = grammarAccess.getComparisonOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOpAccess().getLESS_OR_EQUALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2841:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2841:6: (enumLiteral_5= '!=' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2841:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleComparisonOp7053); 

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
        public static final BitSet FOLLOW_ruleProperty_in_rulePropertyRepository130 = new BitSet(new long[]{0x10007FFFFD702062L});
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
        public static final BitSet FOLLOW_ruleTimeIntervalExpr_in_ruleLeadsToExpr454 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleLeadsToExpr475 = new BitSet(new long[]{0x10007FFFFD703060L});
        public static final BitSet FOLLOW_ruleTimeIntervalExpr_in_ruleLeadsToExpr496 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleTimeIntervalExpr_in_entryRuleTimeIntervalExpr534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeIntervalExpr544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleTimeIntervalExpr582 = new BitSet(new long[]{0x10007FFFFD706060L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_ruleTimeIntervalExpr612 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTimeIntervalExpr624 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTimeIntervalExpr641 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTimeIntervalExpr658 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTimeIntervalExpr675 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTimeIntervalExpr692 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_ruleTimeIntervalExpr713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_ruleTimeIntervalExpr742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_entryRuleImplyExpr777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplyExpr787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpr_in_ruleImplyExpr834 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleImplyExpr855 = new BitSet(new long[]{0x10007FFFFD722060L});
        public static final BitSet FOLLOW_ruleAndExpr_in_ruleImplyExpr876 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpr_in_ruleAndExpr971 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleAndExpr992 = new BitSet(new long[]{0x10007FFFFD742060L});
        public static final BitSet FOLLOW_ruleOrExpr_in_ruleAndExpr1013 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr1051 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleOrExpr1108 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleOrExpr1129 = new BitSet(new long[]{0x10007FFFFD782060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleOrExpr1150 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_ruleNotExpr_in_entryRuleNotExpr1188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpr1198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNotExpr1236 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleNotExpr1266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantifierExpr_in_ruleNotExpr1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantifierExpr_in_entryRuleQuantifierExpr1330 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuantifierExpr1340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUniversalQuantExpr_in_ruleQuantifierExpr1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistentialQuantExpr_in_ruleQuantifierExpr1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalQuantifierExpr_in_ruleQuantifierExpr1441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomExpr_in_ruleQuantifierExpr1468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUniversalQuantExpr_in_entryRuleUniversalQuantExpr1503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUniversalQuantExpr1513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleUniversalQuantExpr1550 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleUniversalQuantExpr1562 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleVariableBinding_in_ruleUniversalQuantExpr1592 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleUniversalQuantExpr1604 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleUniversalQuantExpr1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistentialQuantExpr_in_entryRuleExistentialQuantExpr1661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExistentialQuantExpr1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleExistentialQuantExpr1708 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExistentialQuantExpr1720 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleVariableBinding_in_ruleExistentialQuantExpr1750 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleExistentialQuantExpr1762 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleExistentialQuantExpr1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableBinding_in_entryRuleVariableBinding1819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableBinding1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableBinding1871 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleVariableBinding1888 = new BitSet(new long[]{0x07C0000000004000L});
        public static final BitSet FOLLOW_ruleSetExpr_in_ruleVariableBinding1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalQuantifierExpr_in_entryRuleTemporalQuantifierExpr1945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemporalQuantifierExpr1955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFExpr_in_ruleTemporalQuantifierExpr2002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAFExpr_in_ruleTemporalQuantifierExpr2029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEGExpr_in_ruleTemporalQuantifierExpr2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAGExpr_in_ruleTemporalQuantifierExpr2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFExpr_in_entryRuleEFExpr2118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFExpr2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEFExpr2166 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_27_in_ruleEFExpr2184 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleEFExpr2215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAFExpr_in_entryRuleAFExpr2251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAFExpr2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAFExpr2299 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_29_in_ruleAFExpr2317 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleAFExpr2348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEGExpr_in_entryRuleEGExpr2384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEGExpr2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEGExpr2432 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_31_in_ruleEGExpr2450 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleEGExpr2481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAGExpr_in_entryRuleAGExpr2517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAGExpr2527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAGExpr2565 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_33_in_ruleAGExpr2583 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleAGExpr2614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomExpr_in_entryRuleAtomExpr2650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomExpr2660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAtomExpr2698 = new BitSet(new long[]{0x10007FFFFDF02060L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAtomExpr2720 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAtomExpr2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicateExpr_in_ruleAtomExpr2760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpr_in_ruleAtomExpr2787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicateExpr_in_entryRulePredicateExpr2822 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpr2832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrueExpr_in_rulePredicateExpr2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFalseExpr_in_rulePredicateExpr2906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadlockExpr_in_rulePredicateExpr2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferOverflowExpr_in_rulePredicateExpr2960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateExpr_in_rulePredicateExpr2987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageExpr_in_rulePredicateExpr3014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionExpr_in_rulePredicateExpr3041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadlockExpr_in_entryRuleDeadlockExpr3076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeadlockExpr3086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleDeadlockExpr3132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferOverflowExpr_in_entryRuleBufferOverflowExpr3168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBufferOverflowExpr3178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBufferOverflowExpr3224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrueExpr_in_entryRuleTrueExpr3260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTrueExpr3270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleTrueExpr3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFalseExpr_in_entryRuleFalseExpr3352 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFalseExpr3362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleFalseExpr3408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateExpr_in_entryRuleStateExpr3444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateExpr3454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateActiveExpr_in_ruleStateExpr3501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstateOfExpr_in_ruleStateExpr3528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateInStatechartExpr_in_ruleStateExpr3555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateActiveExpr_in_entryRuleStateActiveExpr3590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateActiveExpr3600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleStateActiveExpr3637 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStateActiveExpr3649 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_ruleStateActiveExpr3670 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleStateActiveExpr3682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstateOfExpr_in_entryRuleSubstateOfExpr3718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubstateOfExpr3728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSubstateOfExpr3765 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSubstateOfExpr3777 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_ruleSubstateOfExpr3798 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSubstateOfExpr3810 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_ruleSubstateOfExpr3831 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSubstateOfExpr3843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateInStatechartExpr_in_entryRuleStateInStatechartExpr3879 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateInStatechartExpr3889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleStateInStatechartExpr3926 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStateInStatechartExpr3938 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_ruleStateInStatechartExpr3959 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleStateInStatechartExpr3971 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleStatechartMapExpr_in_ruleStateInStatechartExpr3992 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleStateInStatechartExpr4004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageExpr_in_entryRuleMessageExpr4040 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageExpr4050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInBufferExpr_in_ruleMessageExpr4097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInTransitExpr_in_ruleMessageExpr4124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInTransitExpr_in_entryRuleMessageInTransitExpr4159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageInTransitExpr4169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleMessageInTransitExpr4206 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMessageInTransitExpr4218 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleMessageMapExpr_in_ruleMessageInTransitExpr4239 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMessageInTransitExpr4251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInBufferExpr_in_entryRuleMessageInBufferExpr4287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageInBufferExpr4297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleMessageInBufferExpr4334 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMessageInBufferExpr4346 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleMessageMapExpr_in_ruleMessageInBufferExpr4367 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMessageInBufferExpr4379 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleBufferMapExpr_in_ruleMessageInBufferExpr4400 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMessageInBufferExpr4412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionExpr_in_entryRuleTransitionExpr4448 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionExpr4458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionFiringExpr_in_ruleTransitionExpr4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionFiringExpr_in_entryRuleTransitionFiringExpr4538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionFiringExpr4548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleTransitionFiringExpr4585 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTransitionFiringExpr4597 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleTransitionMapExpr_in_ruleTransitionFiringExpr4618 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTransitionFiringExpr4630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr4666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpr4676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpr_in_ruleComparisonExpr4731 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleComparisonOp_in_ruleComparisonExpr4752 = new BitSet(new long[]{0x10007FFFFD702060L});
        public static final BitSet FOLLOW_ruleMapExpr_in_ruleComparisonExpr4773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpr_in_entryRuleMapExpr4809 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapExpr4819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleMapExpr4866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferMessageCountExpr_in_ruleMapExpr4893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstExpr_in_ruleMapExpr4920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSourceStateExpr_in_ruleMapExpr4947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTargetStateExpr_in_ruleMapExpr4974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionMapExpr_in_entryRuleTransitionMapExpr5011 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionMapExpr5021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleTransitionMapExpr5067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMapExpr_in_entryRuleStateMapExpr5101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMapExpr5111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleStateMapExpr5158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSourceStateExpr_in_ruleStateMapExpr5185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTargetStateExpr_in_ruleStateMapExpr5212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStatechartMapExpr_in_entryRuleStatechartMapExpr5247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStatechartMapExpr5257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleStatechartMapExpr5303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferMapExpr_in_entryRuleBufferMapExpr5337 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBufferMapExpr5347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleBufferMapExpr5393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageMapExpr_in_entryRuleMessageMapExpr5427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageMapExpr5437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_ruleMessageMapExpr5483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferMessageCountExpr_in_entryRuleBufferMessageCountExpr5517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBufferMessageCountExpr5527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleBufferMessageCountExpr5564 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleBufferMessageCountExpr5576 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleBufferMapExpr_in_ruleBufferMessageCountExpr5597 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleBufferMessageCountExpr5609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSourceStateExpr_in_entryRuleSourceStateExpr5645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSourceStateExpr5655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleSourceStateExpr5692 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSourceStateExpr5704 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleTransitionMapExpr_in_ruleSourceStateExpr5725 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSourceStateExpr5737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTargetStateExpr_in_entryRuleTargetStateExpr5773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTargetStateExpr5783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTargetStateExpr5820 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTargetStateExpr5832 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleTransitionMapExpr_in_ruleTargetStateExpr5853 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTargetStateExpr5865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMumlElemExpr_in_entryRuleMumlElemExpr5901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMumlElemExpr5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMumlElemExpr5958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstExpr_in_entryRuleConstExpr5993 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstExpr6003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConstExpr6049 = new BitSet(new long[]{0x003F800000000002L});
        public static final BitSet FOLLOW_ruleTimeUnitExpr_in_ruleConstExpr6070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeUnitExpr_in_entryRuleTimeUnitExpr6108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeUnitExpr6119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTimeUnitExpr6157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTimeUnitExpr6176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTimeUnitExpr6195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTimeUnitExpr6214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTimeUnitExpr6233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTimeUnitExpr6252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTimeUnitExpr6271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetExpr_in_entryRuleSetExpr6311 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetExpr6321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntervalSetExpr_in_ruleSetExpr6368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleSetExpr6395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleSetExpr6424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleSetExpr6453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleSetExpr6482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleSetExpr6511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntervalSetExpr_in_entryRuleIntervalSetExpr6548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntervalSetExpr6558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleIntervalSetExpr6604 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntervalSetExpr6621 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntervalSetExpr6638 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntervalSetExpr6655 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntervalSetExpr6672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName6709 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName6720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6760 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_ruleQualifiedName6779 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName6794 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt6842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt6853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleEInt6892 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt6909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleComparisonOp6968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleComparisonOp6985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleComparisonOp7002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleComparisonOp7019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleComparisonOp7036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleComparisonOp7053 = new BitSet(new long[]{0x0000000000000002L});
    }


}