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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'leadsTo'", "'timeInterval'", "'['", "','", "']'", "'implies'", "'and'", "'or'", "'not'", "'forall'", "'('", "')'", "'exists'", "':'", "'EF'", "'E<>'", "'AF'", "'A<>'", "'EG'", "'E[]'", "'AG'", "'A[]'", "'deadlock'", "'stateActive'", "'substateOf'", "'messageInTransit'", "'messageInBuffer'", "'bufferOverflow'", "'transitionFiring'", "'bufferMessageCount'", "'States'", "'Transitions'", "'MessageTypes'", "'Clocks'", "'.'", "'-'", "'=='", "'>'", "'>='", "'<'", "'<='", "'!='"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
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

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||LA1_0==13||(LA1_0>=20 && LA1_0<=22)||LA1_0==24||(LA1_0>=26 && LA1_0<=41)||LA1_0==47) ) {
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:122:1: ruleProperty returns [EObject current=null] : (this_Expression_0= ruleExpression otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        EObject this_Expression_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT");
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:126:28: ( (this_Expression_0= ruleExpression otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:127:1: (this_Expression_0= ruleExpression otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:127:1: (this_Expression_0= ruleExpression otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )? )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:128:5: this_Expression_0= ruleExpression otherlv_1= ';' ( (lv_comment_2_0= RULE_SL_COMMENT ) )?
            {
             
                    newCompositeNode(grammarAccess.getPropertyAccess().getExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleProperty233);
            this_Expression_0=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleProperty244); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getSemicolonKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:140:1: ( (lv_comment_2_0= RULE_SL_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:141:1: (lv_comment_2_0= RULE_SL_COMMENT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:141:1: (lv_comment_2_0= RULE_SL_COMMENT )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:142:3: lv_comment_2_0= RULE_SL_COMMENT
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:169:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:170:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:171:2: iv_ruleExpression= ruleExpression EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:178:1: ruleExpression returns [EObject current=null] : this_LeadsToExpr_0= ruleLeadsToExpr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LeadsToExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:181:28: (this_LeadsToExpr_0= ruleLeadsToExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:183:5: this_LeadsToExpr_0= ruleLeadsToExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:199:1: entryRuleLeadsToExpr returns [EObject current=null] : iv_ruleLeadsToExpr= ruleLeadsToExpr EOF ;
    public final EObject entryRuleLeadsToExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeadsToExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:200:2: (iv_ruleLeadsToExpr= ruleLeadsToExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:201:2: iv_ruleLeadsToExpr= ruleLeadsToExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:208:1: ruleLeadsToExpr returns [EObject current=null] : (this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )* ) ;
    public final EObject ruleLeadsToExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TimeIntervalExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:211:28: ( (this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:212:1: (this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:212:1: (this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:213:5: this_TimeIntervalExpr_0= ruleTimeIntervalExpr ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLeadsToExprAccess().getTimeIntervalExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTimeIntervalExpr_in_ruleLeadsToExpr454);
            this_TimeIntervalExpr_0=ruleTimeIntervalExpr();

            state._fsp--;

             
                    current = this_TimeIntervalExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:221:1: ( () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:221:2: () otherlv_2= 'leadsTo' ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:221:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:222:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLeadsToExprAccess().getLeadsToExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLeadsToExpr475); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLeadsToExprAccess().getLeadsToKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:231:1: ( (lv_rightOpd_3_0= ruleTimeIntervalExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:232:1: (lv_rightOpd_3_0= ruleTimeIntervalExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:232:1: (lv_rightOpd_3_0= ruleTimeIntervalExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:233:3: lv_rightOpd_3_0= ruleTimeIntervalExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:257:1: entryRuleTimeIntervalExpr returns [EObject current=null] : iv_ruleTimeIntervalExpr= ruleTimeIntervalExpr EOF ;
    public final EObject entryRuleTimeIntervalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeIntervalExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:258:2: (iv_ruleTimeIntervalExpr= ruleTimeIntervalExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:259:2: iv_ruleTimeIntervalExpr= ruleTimeIntervalExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:266:1: ruleTimeIntervalExpr returns [EObject current=null] : ( (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) ) | this_ImplyExpr_9= ruleImplyExpr ) ;
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
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:269:28: ( ( (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) ) | this_ImplyExpr_9= ruleImplyExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:270:1: ( (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) ) | this_ImplyExpr_9= ruleImplyExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:270:1: ( (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) ) | this_ImplyExpr_9= ruleImplyExpr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_ID)||(LA4_0>=20 && LA4_0<=22)||LA4_0==24||(LA4_0>=26 && LA4_0<=41)||LA4_0==47) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:270:2: (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:270:2: (otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:270:4: otherlv_0= 'timeInterval' () ( (lv_lhs_2_0= ruleImplyExpr ) ) otherlv_3= '[' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_upper_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_rhs_8_0= ruleImplyExpr ) )
                    {
                    otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimeIntervalExpr582); 

                        	newLeafNode(otherlv_0, grammarAccess.getTimeIntervalExprAccess().getTimeIntervalKeyword_0_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:274:1: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:275:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTimeIntervalExprAccess().getTimeIntervalExprAction_0_1(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:280:2: ( (lv_lhs_2_0= ruleImplyExpr ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:281:1: (lv_lhs_2_0= ruleImplyExpr )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:281:1: (lv_lhs_2_0= ruleImplyExpr )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:282:3: lv_lhs_2_0= ruleImplyExpr
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
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:302:1: ( (lv_lower_4_0= RULE_INT ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:303:1: (lv_lower_4_0= RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:303:1: (lv_lower_4_0= RULE_INT )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:304:3: lv_lower_4_0= RULE_INT
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
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:324:1: ( (lv_upper_6_0= RULE_INT ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:325:1: (lv_upper_6_0= RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:325:1: (lv_upper_6_0= RULE_INT )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:326:3: lv_upper_6_0= RULE_INT
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
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:346:1: ( (lv_rhs_8_0= ruleImplyExpr ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:347:1: (lv_rhs_8_0= ruleImplyExpr )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:347:1: (lv_rhs_8_0= ruleImplyExpr )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:348:3: lv_rhs_8_0= ruleImplyExpr
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:366:5: this_ImplyExpr_9= ruleImplyExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:382:1: entryRuleImplyExpr returns [EObject current=null] : iv_ruleImplyExpr= ruleImplyExpr EOF ;
    public final EObject entryRuleImplyExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplyExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:383:2: (iv_ruleImplyExpr= ruleImplyExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:384:2: iv_ruleImplyExpr= ruleImplyExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:391:1: ruleImplyExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleImplyExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:394:28: ( (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:395:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:395:1: (this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:396:5: this_AndExpr_0= ruleAndExpr ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getImplyExprAccess().getAndExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndExpr_in_ruleImplyExpr834);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;

             
                    current = this_AndExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:404:1: ( () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:404:2: () otherlv_2= 'implies' ( (lv_rightOpd_3_0= ruleAndExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:404:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:405:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getImplyExprAccess().getImplyExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleImplyExpr855); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImplyExprAccess().getImpliesKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:414:1: ( (lv_rightOpd_3_0= ruleAndExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:415:1: (lv_rightOpd_3_0= ruleAndExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:415:1: (lv_rightOpd_3_0= ruleAndExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:416:3: lv_rightOpd_3_0= ruleAndExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:440:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:441:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:442:2: iv_ruleAndExpr= ruleAndExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:449:1: ruleAndExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:452:28: ( (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:453:1: (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:453:1: (this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:454:5: this_OrExpr_0= ruleOrExpr ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExprAccess().getOrExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOrExpr_in_ruleAndExpr971);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;

             
                    current = this_OrExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:462:1: ( () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:462:2: () otherlv_2= 'and' ( (lv_rightOpd_3_0= ruleOrExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:462:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:463:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExprAccess().getAndExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAndExpr992); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExprAccess().getAndKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:472:1: ( (lv_rightOpd_3_0= ruleOrExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:473:1: (lv_rightOpd_3_0= ruleOrExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:473:1: (lv_rightOpd_3_0= ruleOrExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:474:3: lv_rightOpd_3_0= ruleOrExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:498:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:499:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:500:2: iv_ruleOrExpr= ruleOrExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:507:1: ruleOrExpr returns [EObject current=null] : (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NotExpr_0 = null;

        EObject lv_rightOpd_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:510:28: ( (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:511:1: (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:511:1: (this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:512:5: this_NotExpr_0= ruleNotExpr ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExprAccess().getNotExprParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleNotExpr_in_ruleOrExpr1108);
            this_NotExpr_0=ruleNotExpr();

            state._fsp--;

             
                    current = this_NotExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:520:1: ( () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:520:2: () otherlv_2= 'or' ( (lv_rightOpd_3_0= ruleNotExpr ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:520:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:521:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExprAccess().getOrExprLeftOpdAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOrExpr1129); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExprAccess().getOrKeyword_1_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:530:1: ( (lv_rightOpd_3_0= ruleNotExpr ) )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:531:1: (lv_rightOpd_3_0= ruleNotExpr )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:531:1: (lv_rightOpd_3_0= ruleNotExpr )
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:532:3: lv_rightOpd_3_0= ruleNotExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:556:1: entryRuleNotExpr returns [EObject current=null] : iv_ruleNotExpr= ruleNotExpr EOF ;
    public final EObject entryRuleNotExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:557:2: (iv_ruleNotExpr= ruleNotExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:558:2: iv_ruleNotExpr= ruleNotExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:565:1: ruleNotExpr returns [EObject current=null] : ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr ) ;
    public final EObject ruleNotExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_opd_2_0 = null;

        EObject this_QuantifierExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:568:28: ( ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:569:1: ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:569:1: ( (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) ) | this_QuantifierExpr_3= ruleQuantifierExpr )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_ID)||(LA8_0>=21 && LA8_0<=22)||LA8_0==24||(LA8_0>=26 && LA8_0<=41)||LA8_0==47) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:569:2: (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:569:2: (otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:569:4: otherlv_0= 'not' () ( (lv_opd_2_0= ruleNotExpr ) )
                    {
                    otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNotExpr1236); 

                        	newLeafNode(otherlv_0, grammarAccess.getNotExprAccess().getNotKeyword_0_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:573:1: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:574:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getNotExprAccess().getNotExprAction_0_1(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:579:2: ( (lv_opd_2_0= ruleNotExpr ) )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:580:1: (lv_opd_2_0= ruleNotExpr )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:580:1: (lv_opd_2_0= ruleNotExpr )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:581:3: lv_opd_2_0= ruleNotExpr
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:599:5: this_QuantifierExpr_3= ruleQuantifierExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:615:1: entryRuleQuantifierExpr returns [EObject current=null] : iv_ruleQuantifierExpr= ruleQuantifierExpr EOF ;
    public final EObject entryRuleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifierExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:616:2: (iv_ruleQuantifierExpr= ruleQuantifierExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:617:2: iv_ruleQuantifierExpr= ruleQuantifierExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:624:1: ruleQuantifierExpr returns [EObject current=null] : (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr ) ;
    public final EObject ruleQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject this_UniversalQuantExpr_0 = null;

        EObject this_ExistentialQuantExpr_1 = null;

        EObject this_TemporalQuantifierExpr_2 = null;

        EObject this_AtomExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:627:28: ( (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:628:1: (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:628:1: (this_UniversalQuantExpr_0= ruleUniversalQuantExpr | this_ExistentialQuantExpr_1= ruleExistentialQuantExpr | this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr | this_AtomExpr_3= ruleAtomExpr )
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
            case 47:
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:629:5: this_UniversalQuantExpr_0= ruleUniversalQuantExpr
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:639:5: this_ExistentialQuantExpr_1= ruleExistentialQuantExpr
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:649:5: this_TemporalQuantifierExpr_2= ruleTemporalQuantifierExpr
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:659:5: this_AtomExpr_3= ruleAtomExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:675:1: entryRuleUniversalQuantExpr returns [EObject current=null] : iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF ;
    public final EObject entryRuleUniversalQuantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversalQuantExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:676:2: (iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:677:2: iv_ruleUniversalQuantExpr= ruleUniversalQuantExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:684:1: ruleUniversalQuantExpr returns [EObject current=null] : (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) ;
    public final EObject ruleUniversalQuantExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_var_3_0 = null;

        EObject lv_formula_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:687:28: ( (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:688:1: (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:688:1: (otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:688:3: otherlv_0= 'forall' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleUniversalQuantExpr1550); 

                	newLeafNode(otherlv_0, grammarAccess.getUniversalQuantExprAccess().getForallKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleUniversalQuantExpr1562); 

                	newLeafNode(otherlv_1, grammarAccess.getUniversalQuantExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:696:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:697:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUniversalQuantExprAccess().getUniversalQuantExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:702:2: ( (lv_var_3_0= ruleVariableBinding ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:703:1: (lv_var_3_0= ruleVariableBinding )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:703:1: (lv_var_3_0= ruleVariableBinding )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:704:3: lv_var_3_0= ruleVariableBinding
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
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:724:1: ( (lv_formula_5_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:725:1: (lv_formula_5_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:725:1: (lv_formula_5_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:726:3: lv_formula_5_0= ruleNotExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:750:1: entryRuleExistentialQuantExpr returns [EObject current=null] : iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF ;
    public final EObject entryRuleExistentialQuantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistentialQuantExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:751:2: (iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:752:2: iv_ruleExistentialQuantExpr= ruleExistentialQuantExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:759:1: ruleExistentialQuantExpr returns [EObject current=null] : (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) ;
    public final EObject ruleExistentialQuantExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_var_3_0 = null;

        EObject lv_formula_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:762:28: ( (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:763:1: (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:763:1: (otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:763:3: otherlv_0= 'exists' otherlv_1= '(' () ( (lv_var_3_0= ruleVariableBinding ) ) otherlv_4= ')' ( (lv_formula_5_0= ruleNotExpr ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExistentialQuantExpr1708); 

                	newLeafNode(otherlv_0, grammarAccess.getExistentialQuantExprAccess().getExistsKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExistentialQuantExpr1720); 

                	newLeafNode(otherlv_1, grammarAccess.getExistentialQuantExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:771:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:772:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExistentialQuantExprAccess().getExistenceQuantExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:777:2: ( (lv_var_3_0= ruleVariableBinding ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:778:1: (lv_var_3_0= ruleVariableBinding )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:778:1: (lv_var_3_0= ruleVariableBinding )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:779:3: lv_var_3_0= ruleVariableBinding
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
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:799:1: ( (lv_formula_5_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:800:1: (lv_formula_5_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:800:1: (lv_formula_5_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:801:3: lv_formula_5_0= ruleNotExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:825:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:826:2: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:827:2: iv_ruleVariableBinding= ruleVariableBinding EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:834:1: ruleVariableBinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_set_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:837:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:838:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:838:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:838:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_set_2_0= ruleSetExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:838:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:839:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:839:1: (lv_name_0_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:840:3: lv_name_0_0= RULE_ID
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
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:860:1: ( (lv_set_2_0= ruleSetExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:861:1: (lv_set_2_0= ruleSetExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:861:1: (lv_set_2_0= ruleSetExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:862:3: lv_set_2_0= ruleSetExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:886:1: entryRuleTemporalQuantifierExpr returns [EObject current=null] : iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF ;
    public final EObject entryRuleTemporalQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalQuantifierExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:887:2: (iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:888:2: iv_ruleTemporalQuantifierExpr= ruleTemporalQuantifierExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:895:1: ruleTemporalQuantifierExpr returns [EObject current=null] : (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr ) ;
    public final EObject ruleTemporalQuantifierExpr() throws RecognitionException {
        EObject current = null;

        EObject this_EFExpr_0 = null;

        EObject this_AFExpr_1 = null;

        EObject this_EGExpr_2 = null;

        EObject this_AGExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:898:28: ( (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:899:1: (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:899:1: (this_EFExpr_0= ruleEFExpr | this_AFExpr_1= ruleAFExpr | this_EGExpr_2= ruleEGExpr | this_AGExpr_3= ruleAGExpr )
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:900:5: this_EFExpr_0= ruleEFExpr
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:910:5: this_AFExpr_1= ruleAFExpr
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:920:5: this_EGExpr_2= ruleEGExpr
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:930:5: this_AGExpr_3= ruleAGExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:946:1: entryRuleEFExpr returns [EObject current=null] : iv_ruleEFExpr= ruleEFExpr EOF ;
    public final EObject entryRuleEFExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:947:2: (iv_ruleEFExpr= ruleEFExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:948:2: iv_ruleEFExpr= ruleEFExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:955:1: ruleEFExpr returns [EObject current=null] : ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleEFExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:958:28: ( ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:959:1: ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:959:1: ( (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:959:2: (otherlv_0= 'EF' | otherlv_1= 'E<>' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:959:2: (otherlv_0= 'EF' | otherlv_1= 'E<>' )
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:959:4: otherlv_0= 'EF'
                    {
                    otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEFExpr2166); 

                        	newLeafNode(otherlv_0, grammarAccess.getEFExprAccess().getEFKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:964:7: otherlv_1= 'E<>'
                    {
                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEFExpr2184); 

                        	newLeafNode(otherlv_1, grammarAccess.getEFExprAccess().getEKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:968:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:969:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEFExprAccess().getEFExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:974:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:975:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:975:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:976:3: lv_expr_3_0= ruleNotExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1000:1: entryRuleAFExpr returns [EObject current=null] : iv_ruleAFExpr= ruleAFExpr EOF ;
    public final EObject entryRuleAFExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAFExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1001:2: (iv_ruleAFExpr= ruleAFExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1002:2: iv_ruleAFExpr= ruleAFExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1009:1: ruleAFExpr returns [EObject current=null] : ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleAFExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1012:28: ( ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1013:1: ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1013:1: ( (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1013:2: (otherlv_0= 'AF' | otherlv_1= 'A<>' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1013:2: (otherlv_0= 'AF' | otherlv_1= 'A<>' )
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1013:4: otherlv_0= 'AF'
                    {
                    otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAFExpr2299); 

                        	newLeafNode(otherlv_0, grammarAccess.getAFExprAccess().getAFKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1018:7: otherlv_1= 'A<>'
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAFExpr2317); 

                        	newLeafNode(otherlv_1, grammarAccess.getAFExprAccess().getAKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1022:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1023:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAFExprAccess().getAFExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1028:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1029:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1029:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1030:3: lv_expr_3_0= ruleNotExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1054:1: entryRuleEGExpr returns [EObject current=null] : iv_ruleEGExpr= ruleEGExpr EOF ;
    public final EObject entryRuleEGExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1055:2: (iv_ruleEGExpr= ruleEGExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1056:2: iv_ruleEGExpr= ruleEGExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1063:1: ruleEGExpr returns [EObject current=null] : ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleEGExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1066:28: ( ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1067:1: ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1067:1: ( (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1067:2: (otherlv_0= 'EG' | otherlv_1= 'E[]' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1067:2: (otherlv_0= 'EG' | otherlv_1= 'E[]' )
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1067:4: otherlv_0= 'EG'
                    {
                    otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEGExpr2432); 

                        	newLeafNode(otherlv_0, grammarAccess.getEGExprAccess().getEGKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1072:7: otherlv_1= 'E[]'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEGExpr2450); 

                        	newLeafNode(otherlv_1, grammarAccess.getEGExprAccess().getEKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1076:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1077:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEGExprAccess().getEGExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1082:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1083:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1083:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1084:3: lv_expr_3_0= ruleNotExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1108:1: entryRuleAGExpr returns [EObject current=null] : iv_ruleAGExpr= ruleAGExpr EOF ;
    public final EObject entryRuleAGExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAGExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1109:2: (iv_ruleAGExpr= ruleAGExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1110:2: iv_ruleAGExpr= ruleAGExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1117:1: ruleAGExpr returns [EObject current=null] : ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) ;
    public final EObject ruleAGExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1120:28: ( ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1121:1: ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1121:1: ( (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1121:2: (otherlv_0= 'AG' | otherlv_1= 'A[]' ) () ( (lv_expr_3_0= ruleNotExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1121:2: (otherlv_0= 'AG' | otherlv_1= 'A[]' )
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1121:4: otherlv_0= 'AG'
                    {
                    otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAGExpr2565); 

                        	newLeafNode(otherlv_0, grammarAccess.getAGExprAccess().getAGKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1126:7: otherlv_1= 'A[]'
                    {
                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAGExpr2583); 

                        	newLeafNode(otherlv_1, grammarAccess.getAGExprAccess().getAKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1130:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1131:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAGExprAccess().getAGExprAction_1(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1136:2: ( (lv_expr_3_0= ruleNotExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1137:1: (lv_expr_3_0= ruleNotExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1137:1: (lv_expr_3_0= ruleNotExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1138:3: lv_expr_3_0= ruleNotExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1162:1: entryRuleAtomExpr returns [EObject current=null] : iv_ruleAtomExpr= ruleAtomExpr EOF ;
    public final EObject entryRuleAtomExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1163:2: (iv_ruleAtomExpr= ruleAtomExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1164:2: iv_ruleAtomExpr= ruleAtomExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1171:1: ruleAtomExpr returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr ) ;
    public final EObject ruleAtomExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_PredicateExpr_3 = null;

        EObject this_ComparisonExpr_4 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1174:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1175:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1175:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_PredicateExpr_3= rulePredicateExpr | this_ComparisonExpr_4= ruleComparisonExpr )
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
                {
                alt15=2;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 41:
            case 47:
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1175:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1175:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1175:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1194:5: this_PredicateExpr_3= rulePredicateExpr
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1204:5: this_ComparisonExpr_4= ruleComparisonExpr
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1220:1: entryRulePredicateExpr returns [EObject current=null] : iv_rulePredicateExpr= rulePredicateExpr EOF ;
    public final EObject entryRulePredicateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1221:2: (iv_rulePredicateExpr= rulePredicateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1222:2: iv_rulePredicateExpr= rulePredicateExpr EOF
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1229:1: rulePredicateExpr returns [EObject current=null] : (this_DeadlockExpr_0= ruleDeadlockExpr | this_StateExpr_1= ruleStateExpr | this_MessageExpr_2= ruleMessageExpr | this_TransitionExpr_3= ruleTransitionExpr ) ;
    public final EObject rulePredicateExpr() throws RecognitionException {
        EObject current = null;

        EObject this_DeadlockExpr_0 = null;

        EObject this_StateExpr_1 = null;

        EObject this_MessageExpr_2 = null;

        EObject this_TransitionExpr_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1232:28: ( (this_DeadlockExpr_0= ruleDeadlockExpr | this_StateExpr_1= ruleStateExpr | this_MessageExpr_2= ruleMessageExpr | this_TransitionExpr_3= ruleTransitionExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1233:1: (this_DeadlockExpr_0= ruleDeadlockExpr | this_StateExpr_1= ruleStateExpr | this_MessageExpr_2= ruleMessageExpr | this_TransitionExpr_3= ruleTransitionExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1233:1: (this_DeadlockExpr_0= ruleDeadlockExpr | this_StateExpr_1= ruleStateExpr | this_MessageExpr_2= ruleMessageExpr | this_TransitionExpr_3= ruleTransitionExpr )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
            case 36:
                {
                alt16=2;
                }
                break;
            case 37:
            case 38:
            case 39:
                {
                alt16=3;
                }
                break;
            case 40:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1234:5: this_DeadlockExpr_0= ruleDeadlockExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getDeadlockExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeadlockExpr_in_rulePredicateExpr2879);
                    this_DeadlockExpr_0=ruleDeadlockExpr();

                    state._fsp--;

                     
                            current = this_DeadlockExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1244:5: this_StateExpr_1= ruleStateExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getStateExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateExpr_in_rulePredicateExpr2906);
                    this_StateExpr_1=ruleStateExpr();

                    state._fsp--;

                     
                            current = this_StateExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1254:5: this_MessageExpr_2= ruleMessageExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getMessageExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageExpr_in_rulePredicateExpr2933);
                    this_MessageExpr_2=ruleMessageExpr();

                    state._fsp--;

                     
                            current = this_MessageExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1264:5: this_TransitionExpr_3= ruleTransitionExpr
                    {
                     
                            newCompositeNode(grammarAccess.getPredicateExprAccess().getTransitionExprParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTransitionExpr_in_rulePredicateExpr2960);
                    this_TransitionExpr_3=ruleTransitionExpr();

                    state._fsp--;

                     
                            current = this_TransitionExpr_3; 
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1280:1: entryRuleDeadlockExpr returns [EObject current=null] : iv_ruleDeadlockExpr= ruleDeadlockExpr EOF ;
    public final EObject entryRuleDeadlockExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadlockExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1281:2: (iv_ruleDeadlockExpr= ruleDeadlockExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1282:2: iv_ruleDeadlockExpr= ruleDeadlockExpr EOF
            {
             newCompositeNode(grammarAccess.getDeadlockExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeadlockExpr_in_entryRuleDeadlockExpr2995);
            iv_ruleDeadlockExpr=ruleDeadlockExpr();

            state._fsp--;

             current =iv_ruleDeadlockExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeadlockExpr3005); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1289:1: ruleDeadlockExpr returns [EObject current=null] : ( () otherlv_1= 'deadlock' ) ;
    public final EObject ruleDeadlockExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1292:28: ( ( () otherlv_1= 'deadlock' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1293:1: ( () otherlv_1= 'deadlock' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1293:1: ( () otherlv_1= 'deadlock' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1293:2: () otherlv_1= 'deadlock'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1293:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1294:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeadlockExprAccess().getDeadlockExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDeadlockExpr3051); 

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


    // $ANTLR start "entryRuleStateExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1311:1: entryRuleStateExpr returns [EObject current=null] : iv_ruleStateExpr= ruleStateExpr EOF ;
    public final EObject entryRuleStateExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1312:2: (iv_ruleStateExpr= ruleStateExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1313:2: iv_ruleStateExpr= ruleStateExpr EOF
            {
             newCompositeNode(grammarAccess.getStateExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateExpr_in_entryRuleStateExpr3087);
            iv_ruleStateExpr=ruleStateExpr();

            state._fsp--;

             current =iv_ruleStateExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateExpr3097); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1320:1: ruleStateExpr returns [EObject current=null] : (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr ) ;
    public final EObject ruleStateExpr() throws RecognitionException {
        EObject current = null;

        EObject this_StateActiveExpr_0 = null;

        EObject this_SubstateOfExpr_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1323:28: ( (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1324:1: (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1324:1: (this_StateActiveExpr_0= ruleStateActiveExpr | this_SubstateOfExpr_1= ruleSubstateOfExpr )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1325:5: this_StateActiveExpr_0= ruleStateActiveExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getStateActiveExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateActiveExpr_in_ruleStateExpr3144);
                    this_StateActiveExpr_0=ruleStateActiveExpr();

                    state._fsp--;

                     
                            current = this_StateActiveExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1335:5: this_SubstateOfExpr_1= ruleSubstateOfExpr
                    {
                     
                            newCompositeNode(grammarAccess.getStateExprAccess().getSubstateOfExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubstateOfExpr_in_ruleStateExpr3171);
                    this_SubstateOfExpr_1=ruleSubstateOfExpr();

                    state._fsp--;

                     
                            current = this_SubstateOfExpr_1; 
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1351:1: entryRuleStateActiveExpr returns [EObject current=null] : iv_ruleStateActiveExpr= ruleStateActiveExpr EOF ;
    public final EObject entryRuleStateActiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateActiveExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1352:2: (iv_ruleStateActiveExpr= ruleStateActiveExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1353:2: iv_ruleStateActiveExpr= ruleStateActiveExpr EOF
            {
             newCompositeNode(grammarAccess.getStateActiveExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateActiveExpr_in_entryRuleStateActiveExpr3206);
            iv_ruleStateActiveExpr=ruleStateActiveExpr();

            state._fsp--;

             current =iv_ruleStateActiveExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateActiveExpr3216); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1360:1: ruleStateActiveExpr returns [EObject current=null] : (otherlv_0= 'stateActive' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleStateActiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1363:28: ( (otherlv_0= 'stateActive' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1364:1: (otherlv_0= 'stateActive' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1364:1: (otherlv_0= 'stateActive' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1364:3: otherlv_0= 'stateActive' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStateActiveExpr3253); 

                	newLeafNode(otherlv_0, grammarAccess.getStateActiveExprAccess().getStateActiveKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStateActiveExpr3265); 

                	newLeafNode(otherlv_1, grammarAccess.getStateActiveExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1372:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1373:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateActiveExprAccess().getStateActiveExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1378:2: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1379:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1379:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1380:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateActiveExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStateActiveExprAccess().getStateEObjectCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleStateActiveExpr3297);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStateActiveExpr3309); 

                	newLeafNode(otherlv_4, grammarAccess.getStateActiveExprAccess().getRightParenthesisKeyword_4());
                

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1405:1: entryRuleSubstateOfExpr returns [EObject current=null] : iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF ;
    public final EObject entryRuleSubstateOfExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstateOfExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1406:2: (iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1407:2: iv_ruleSubstateOfExpr= ruleSubstateOfExpr EOF
            {
             newCompositeNode(grammarAccess.getSubstateOfExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubstateOfExpr_in_entryRuleSubstateOfExpr3345);
            iv_ruleSubstateOfExpr=ruleSubstateOfExpr();

            state._fsp--;

             current =iv_ruleSubstateOfExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubstateOfExpr3355); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1414:1: ruleSubstateOfExpr returns [EObject current=null] : (otherlv_0= 'substateOf' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')' ) ;
    public final EObject ruleSubstateOfExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1417:28: ( (otherlv_0= 'substateOf' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1418:1: (otherlv_0= 'substateOf' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1418:1: (otherlv_0= 'substateOf' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1418:3: otherlv_0= 'substateOf' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSubstateOfExpr3392); 

                	newLeafNode(otherlv_0, grammarAccess.getSubstateOfExprAccess().getSubstateOfKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSubstateOfExpr3404); 

                	newLeafNode(otherlv_1, grammarAccess.getSubstateOfExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1426:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1427:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubstateOfExprAccess().getSubstateOfExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1432:2: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1433:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1433:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1434:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubstateOfExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSubstateOfExprAccess().getStateEObjectCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSubstateOfExpr3436);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSubstateOfExpr3448); 

                	newLeafNode(otherlv_4, grammarAccess.getSubstateOfExprAccess().getCommaKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1451:1: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1452:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1452:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1453:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubstateOfExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSubstateOfExprAccess().getSuperstateEObjectCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSubstateOfExpr3471);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSubstateOfExpr3483); 

                	newLeafNode(otherlv_6, grammarAccess.getSubstateOfExprAccess().getRightParenthesisKeyword_6());
                

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


    // $ANTLR start "entryRuleMessageExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1478:1: entryRuleMessageExpr returns [EObject current=null] : iv_ruleMessageExpr= ruleMessageExpr EOF ;
    public final EObject entryRuleMessageExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1479:2: (iv_ruleMessageExpr= ruleMessageExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1480:2: iv_ruleMessageExpr= ruleMessageExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageExpr_in_entryRuleMessageExpr3519);
            iv_ruleMessageExpr=ruleMessageExpr();

            state._fsp--;

             current =iv_ruleMessageExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageExpr3529); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1487:1: ruleMessageExpr returns [EObject current=null] : (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr | this_BufferOverflowExpr_2= ruleBufferOverflowExpr ) ;
    public final EObject ruleMessageExpr() throws RecognitionException {
        EObject current = null;

        EObject this_MessageInBufferExpr_0 = null;

        EObject this_MessageInTransitExpr_1 = null;

        EObject this_BufferOverflowExpr_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1490:28: ( (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr | this_BufferOverflowExpr_2= ruleBufferOverflowExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1491:1: (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr | this_BufferOverflowExpr_2= ruleBufferOverflowExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1491:1: (this_MessageInBufferExpr_0= ruleMessageInBufferExpr | this_MessageInTransitExpr_1= ruleMessageInTransitExpr | this_BufferOverflowExpr_2= ruleBufferOverflowExpr )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1492:5: this_MessageInBufferExpr_0= ruleMessageInBufferExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getMessageInBufferExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageInBufferExpr_in_ruleMessageExpr3576);
                    this_MessageInBufferExpr_0=ruleMessageInBufferExpr();

                    state._fsp--;

                     
                            current = this_MessageInBufferExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1502:5: this_MessageInTransitExpr_1= ruleMessageInTransitExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getMessageInTransitExprParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageInTransitExpr_in_ruleMessageExpr3603);
                    this_MessageInTransitExpr_1=ruleMessageInTransitExpr();

                    state._fsp--;

                     
                            current = this_MessageInTransitExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1512:5: this_BufferOverflowExpr_2= ruleBufferOverflowExpr
                    {
                     
                            newCompositeNode(grammarAccess.getMessageExprAccess().getBufferOverflowExprParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBufferOverflowExpr_in_ruleMessageExpr3630);
                    this_BufferOverflowExpr_2=ruleBufferOverflowExpr();

                    state._fsp--;

                     
                            current = this_BufferOverflowExpr_2; 
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1528:1: entryRuleMessageInTransitExpr returns [EObject current=null] : iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF ;
    public final EObject entryRuleMessageInTransitExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInTransitExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1529:2: (iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1530:2: iv_ruleMessageInTransitExpr= ruleMessageInTransitExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageInTransitExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageInTransitExpr_in_entryRuleMessageInTransitExpr3665);
            iv_ruleMessageInTransitExpr=ruleMessageInTransitExpr();

            state._fsp--;

             current =iv_ruleMessageInTransitExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageInTransitExpr3675); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1537:1: ruleMessageInTransitExpr returns [EObject current=null] : (otherlv_0= 'messageInTransit' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleMessageInTransitExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1540:28: ( (otherlv_0= 'messageInTransit' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1541:1: (otherlv_0= 'messageInTransit' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1541:1: (otherlv_0= 'messageInTransit' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1541:3: otherlv_0= 'messageInTransit' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMessageInTransitExpr3712); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageInTransitExprAccess().getMessageInTransitKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMessageInTransitExpr3724); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageInTransitExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1549:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1550:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMessageInTransitExprAccess().getMessageInTransitExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1555:2: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1556:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1556:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1557:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageInTransitExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageInTransitExprAccess().getMessageEObjectCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMessageInTransitExpr3756);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMessageInTransitExpr3768); 

                	newLeafNode(otherlv_4, grammarAccess.getMessageInTransitExprAccess().getRightParenthesisKeyword_4());
                

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1582:1: entryRuleMessageInBufferExpr returns [EObject current=null] : iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF ;
    public final EObject entryRuleMessageInBufferExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageInBufferExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1583:2: (iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1584:2: iv_ruleMessageInBufferExpr= ruleMessageInBufferExpr EOF
            {
             newCompositeNode(grammarAccess.getMessageInBufferExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageInBufferExpr_in_entryRuleMessageInBufferExpr3804);
            iv_ruleMessageInBufferExpr=ruleMessageInBufferExpr();

            state._fsp--;

             current =iv_ruleMessageInBufferExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageInBufferExpr3814); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1591:1: ruleMessageInBufferExpr returns [EObject current=null] : (otherlv_0= 'messageInBuffer' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')' ) ;
    public final EObject ruleMessageInBufferExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1594:28: ( (otherlv_0= 'messageInBuffer' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1595:1: (otherlv_0= 'messageInBuffer' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1595:1: (otherlv_0= 'messageInBuffer' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1595:3: otherlv_0= 'messageInBuffer' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( ( ruleQualifiedName ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMessageInBufferExpr3851); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageInBufferExprAccess().getMessageInBufferKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMessageInBufferExpr3863); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageInBufferExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1603:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1604:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMessageInBufferExprAccess().getMessageInBufferExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1609:2: ( (otherlv_3= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1610:1: (otherlv_3= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1610:1: (otherlv_3= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1611:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageInBufferExprRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMessageInBufferExpr3892); 

            		newLeafNode(otherlv_3, grammarAccess.getMessageInBufferExprAccess().getRoleEObjectCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMessageInBufferExpr3904); 

                	newLeafNode(otherlv_4, grammarAccess.getMessageInBufferExprAccess().getCommaKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1626:1: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1627:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1627:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1628:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageInBufferExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageInBufferExprAccess().getMessageEObjectCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMessageInBufferExpr3927);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMessageInBufferExpr3939); 

                	newLeafNode(otherlv_6, grammarAccess.getMessageInBufferExprAccess().getRightParenthesisKeyword_6());
                

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


    // $ANTLR start "entryRuleBufferOverflowExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1653:1: entryRuleBufferOverflowExpr returns [EObject current=null] : iv_ruleBufferOverflowExpr= ruleBufferOverflowExpr EOF ;
    public final EObject entryRuleBufferOverflowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferOverflowExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1654:2: (iv_ruleBufferOverflowExpr= ruleBufferOverflowExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1655:2: iv_ruleBufferOverflowExpr= ruleBufferOverflowExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferOverflowExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBufferOverflowExpr_in_entryRuleBufferOverflowExpr3975);
            iv_ruleBufferOverflowExpr=ruleBufferOverflowExpr();

            state._fsp--;

             current =iv_ruleBufferOverflowExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBufferOverflowExpr3985); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1662:1: ruleBufferOverflowExpr returns [EObject current=null] : ( () otherlv_1= 'bufferOverflow' ) ;
    public final EObject ruleBufferOverflowExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1665:28: ( ( () otherlv_1= 'bufferOverflow' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1666:1: ( () otherlv_1= 'bufferOverflow' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1666:1: ( () otherlv_1= 'bufferOverflow' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1666:2: () otherlv_1= 'bufferOverflow'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1666:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1667:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBufferOverflowExprAccess().getBufferOverflowExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBufferOverflowExpr4031); 

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


    // $ANTLR start "entryRuleTransitionExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1684:1: entryRuleTransitionExpr returns [EObject current=null] : iv_ruleTransitionExpr= ruleTransitionExpr EOF ;
    public final EObject entryRuleTransitionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1685:2: (iv_ruleTransitionExpr= ruleTransitionExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1686:2: iv_ruleTransitionExpr= ruleTransitionExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransitionExpr_in_entryRuleTransitionExpr4067);
            iv_ruleTransitionExpr=ruleTransitionExpr();

            state._fsp--;

             current =iv_ruleTransitionExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionExpr4077); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1693:1: ruleTransitionExpr returns [EObject current=null] : this_TransitionFiringExpr_0= ruleTransitionFiringExpr ;
    public final EObject ruleTransitionExpr() throws RecognitionException {
        EObject current = null;

        EObject this_TransitionFiringExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1696:28: (this_TransitionFiringExpr_0= ruleTransitionFiringExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1698:5: this_TransitionFiringExpr_0= ruleTransitionFiringExpr
            {
             
                    newCompositeNode(grammarAccess.getTransitionExprAccess().getTransitionFiringExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTransitionFiringExpr_in_ruleTransitionExpr4123);
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1714:1: entryRuleTransitionFiringExpr returns [EObject current=null] : iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF ;
    public final EObject entryRuleTransitionFiringExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFiringExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1715:2: (iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1716:2: iv_ruleTransitionFiringExpr= ruleTransitionFiringExpr EOF
            {
             newCompositeNode(grammarAccess.getTransitionFiringExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransitionFiringExpr_in_entryRuleTransitionFiringExpr4157);
            iv_ruleTransitionFiringExpr=ruleTransitionFiringExpr();

            state._fsp--;

             current =iv_ruleTransitionFiringExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionFiringExpr4167); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1723:1: ruleTransitionFiringExpr returns [EObject current=null] : (otherlv_0= 'transitionFiring' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleTransitionFiringExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1726:28: ( (otherlv_0= 'transitionFiring' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1727:1: (otherlv_0= 'transitionFiring' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1727:1: (otherlv_0= 'transitionFiring' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1727:3: otherlv_0= 'transitionFiring' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleTransitionFiringExpr4204); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionFiringExprAccess().getTransitionFiringKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTransitionFiringExpr4216); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionFiringExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1735:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1736:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransitionFiringExprAccess().getTransitionFiringExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1741:2: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1742:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1742:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1743:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionFiringExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionFiringExprAccess().getTransitionEObjectCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTransitionFiringExpr4248);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTransitionFiringExpr4260); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionFiringExprAccess().getRightParenthesisKeyword_4());
                

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1768:1: entryRuleComparisonExpr returns [EObject current=null] : iv_ruleComparisonExpr= ruleComparisonExpr EOF ;
    public final EObject entryRuleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1769:2: (iv_ruleComparisonExpr= ruleComparisonExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1770:2: iv_ruleComparisonExpr= ruleComparisonExpr EOF
            {
             newCompositeNode(grammarAccess.getComparisonExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr4296);
            iv_ruleComparisonExpr=ruleComparisonExpr();

            state._fsp--;

             current =iv_ruleComparisonExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpr4306); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1777:1: ruleComparisonExpr returns [EObject current=null] : ( () ( ( (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr ) ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( ( (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr ) ) ) ) ;
    public final EObject ruleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_1_1 = null;

        EObject lv_lhs_1_2 = null;

        EObject lv_lhs_1_3 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_rhs_3_1 = null;

        EObject lv_rhs_3_2 = null;

        EObject lv_rhs_3_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1780:28: ( ( () ( ( (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr ) ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( ( (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1781:1: ( () ( ( (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr ) ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( ( (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1781:1: ( () ( ( (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr ) ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( ( (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1781:2: () ( ( (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr ) ) ) ( (lv_op_2_0= ruleComparisonOp ) ) ( ( (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1781:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1782:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComparisonExprAccess().getComparisonExprAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1787:2: ( ( (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1788:1: ( (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1788:1: ( (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1789:1: (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1789:1: (lv_lhs_1_1= rulePrimitiveVariableExpr | lv_lhs_1_2= ruleMapExpr | lv_lhs_1_3= ruleConstExpr )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case RULE_INT:
            case 47:
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1790:3: lv_lhs_1_1= rulePrimitiveVariableExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getLhsPrimitiveVariableExprParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveVariableExpr_in_ruleComparisonExpr4363);
                    lv_lhs_1_1=rulePrimitiveVariableExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"lhs",
                            		lv_lhs_1_1, 
                            		"PrimitiveVariableExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1805:8: lv_lhs_1_2= ruleMapExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getLhsMapExprParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMapExpr_in_ruleComparisonExpr4382);
                    lv_lhs_1_2=ruleMapExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"lhs",
                            		lv_lhs_1_2, 
                            		"MapExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1820:8: lv_lhs_1_3= ruleConstExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getLhsConstExprParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstExpr_in_ruleComparisonExpr4401);
                    lv_lhs_1_3=ruleConstExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"lhs",
                            		lv_lhs_1_3, 
                            		"ConstExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1838:2: ( (lv_op_2_0= ruleComparisonOp ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1839:1: (lv_op_2_0= ruleComparisonOp )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1839:1: (lv_op_2_0= ruleComparisonOp )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1840:3: lv_op_2_0= ruleComparisonOp
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getOpComparisonOpEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparisonOp_in_ruleComparisonExpr4425);
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

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1856:2: ( ( (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1857:1: ( (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1857:1: ( (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1858:1: (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1858:1: (lv_rhs_3_1= rulePrimitiveVariableExpr | lv_rhs_3_2= ruleMapExpr | lv_rhs_3_3= ruleConstExpr )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case 41:
                {
                alt20=2;
                }
                break;
            case RULE_INT:
            case 47:
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
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1859:3: lv_rhs_3_1= rulePrimitiveVariableExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getRhsPrimitiveVariableExprParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveVariableExpr_in_ruleComparisonExpr4448);
                    lv_rhs_3_1=rulePrimitiveVariableExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_3_1, 
                            		"PrimitiveVariableExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1874:8: lv_rhs_3_2= ruleMapExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getRhsMapExprParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMapExpr_in_ruleComparisonExpr4467);
                    lv_rhs_3_2=ruleMapExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_3_2, 
                            		"MapExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1889:8: lv_rhs_3_3= ruleConstExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getRhsConstExprParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstExpr_in_ruleComparisonExpr4486);
                    lv_rhs_3_3=ruleConstExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_3_3, 
                            		"ConstExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1915:1: entryRuleMapExpr returns [EObject current=null] : iv_ruleMapExpr= ruleMapExpr EOF ;
    public final EObject entryRuleMapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1916:2: (iv_ruleMapExpr= ruleMapExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1917:2: iv_ruleMapExpr= ruleMapExpr EOF
            {
             newCompositeNode(grammarAccess.getMapExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMapExpr_in_entryRuleMapExpr4525);
            iv_ruleMapExpr=ruleMapExpr();

            state._fsp--;

             current =iv_ruleMapExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapExpr4535); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1924:1: ruleMapExpr returns [EObject current=null] : this_BufferMessageCountExpr_0= ruleBufferMessageCountExpr ;
    public final EObject ruleMapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BufferMessageCountExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1927:28: (this_BufferMessageCountExpr_0= ruleBufferMessageCountExpr )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1929:5: this_BufferMessageCountExpr_0= ruleBufferMessageCountExpr
            {
             
                    newCompositeNode(grammarAccess.getMapExprAccess().getBufferMessageCountExprParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleBufferMessageCountExpr_in_ruleMapExpr4581);
            this_BufferMessageCountExpr_0=ruleBufferMessageCountExpr();

            state._fsp--;

             
                    current = this_BufferMessageCountExpr_0; 
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
    // $ANTLR end "ruleMapExpr"


    // $ANTLR start "entryRuleBufferMessageCountExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1945:1: entryRuleBufferMessageCountExpr returns [EObject current=null] : iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF ;
    public final EObject entryRuleBufferMessageCountExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBufferMessageCountExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1946:2: (iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1947:2: iv_ruleBufferMessageCountExpr= ruleBufferMessageCountExpr EOF
            {
             newCompositeNode(grammarAccess.getBufferMessageCountExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBufferMessageCountExpr_in_entryRuleBufferMessageCountExpr4615);
            iv_ruleBufferMessageCountExpr=ruleBufferMessageCountExpr();

            state._fsp--;

             current =iv_ruleBufferMessageCountExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBufferMessageCountExpr4625); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1954:1: ruleBufferMessageCountExpr returns [EObject current=null] : (otherlv_0= 'bufferMessageCount' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleBufferMessageCountExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1957:28: ( (otherlv_0= 'bufferMessageCount' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1958:1: (otherlv_0= 'bufferMessageCount' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1958:1: (otherlv_0= 'bufferMessageCount' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1958:3: otherlv_0= 'bufferMessageCount' otherlv_1= '(' () ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBufferMessageCountExpr4662); 

                	newLeafNode(otherlv_0, grammarAccess.getBufferMessageCountExprAccess().getBufferMessageCountKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBufferMessageCountExpr4674); 

                	newLeafNode(otherlv_1, grammarAccess.getBufferMessageCountExprAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1966:1: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1967:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBufferMessageCountExprAccess().getBufferMsgCountExprAction_2(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1972:2: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1973:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1973:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1974:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBufferMessageCountExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBufferMessageCountExprAccess().getBufferEObjectCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleBufferMessageCountExpr4706);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBufferMessageCountExpr4718); 

                	newLeafNode(otherlv_4, grammarAccess.getBufferMessageCountExprAccess().getRightParenthesisKeyword_4());
                

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


    // $ANTLR start "entryRulePrimitiveVariableExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:1999:1: entryRulePrimitiveVariableExpr returns [EObject current=null] : iv_rulePrimitiveVariableExpr= rulePrimitiveVariableExpr EOF ;
    public final EObject entryRulePrimitiveVariableExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveVariableExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2000:2: (iv_rulePrimitiveVariableExpr= rulePrimitiveVariableExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2001:2: iv_rulePrimitiveVariableExpr= rulePrimitiveVariableExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveVariableExprRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveVariableExpr_in_entryRulePrimitiveVariableExpr4754);
            iv_rulePrimitiveVariableExpr=rulePrimitiveVariableExpr();

            state._fsp--;

             current =iv_rulePrimitiveVariableExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveVariableExpr4764); 

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
    // $ANTLR end "entryRulePrimitiveVariableExpr"


    // $ANTLR start "rulePrimitiveVariableExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2008:1: rulePrimitiveVariableExpr returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject rulePrimitiveVariableExpr() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2011:28: ( ( ( ruleQualifiedName ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2012:1: ( ( ruleQualifiedName ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2012:1: ( ( ruleQualifiedName ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2013:1: ( ruleQualifiedName )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2013:1: ( ruleQualifiedName )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2014:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveVariableExprRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPrimitiveVariableExprAccess().getVarEObjectCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rulePrimitiveVariableExpr4811);
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
    // $ANTLR end "rulePrimitiveVariableExpr"


    // $ANTLR start "entryRuleConstExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2035:1: entryRuleConstExpr returns [EObject current=null] : iv_ruleConstExpr= ruleConstExpr EOF ;
    public final EObject entryRuleConstExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2036:2: (iv_ruleConstExpr= ruleConstExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2037:2: iv_ruleConstExpr= ruleConstExpr EOF
            {
             newCompositeNode(grammarAccess.getConstExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstExpr_in_entryRuleConstExpr4846);
            iv_ruleConstExpr=ruleConstExpr();

            state._fsp--;

             current =iv_ruleConstExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstExpr4856); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2044:1: ruleConstExpr returns [EObject current=null] : ( () ( (lv_val_1_0= ruleEInt ) ) ) ;
    public final EObject ruleConstExpr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2047:28: ( ( () ( (lv_val_1_0= ruleEInt ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2048:1: ( () ( (lv_val_1_0= ruleEInt ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2048:1: ( () ( (lv_val_1_0= ruleEInt ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2048:2: () ( (lv_val_1_0= ruleEInt ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2048:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2049:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstExprAccess().getConstExprAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2054:2: ( (lv_val_1_0= ruleEInt ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2055:1: (lv_val_1_0= ruleEInt )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2055:1: (lv_val_1_0= ruleEInt )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2056:3: lv_val_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getConstExprAccess().getValEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleConstExpr4911);
            lv_val_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstExprRule());
            	        }
                   		set(
                   			current, 
                   			"val",
                    		lv_val_1_0, 
                    		"EInt");
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
    // $ANTLR end "ruleConstExpr"


    // $ANTLR start "entryRuleSetExpr"
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2080:1: entryRuleSetExpr returns [EObject current=null] : iv_ruleSetExpr= ruleSetExpr EOF ;
    public final EObject entryRuleSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2081:2: (iv_ruleSetExpr= ruleSetExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2082:2: iv_ruleSetExpr= ruleSetExpr EOF
            {
             newCompositeNode(grammarAccess.getSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetExpr_in_entryRuleSetExpr4947);
            iv_ruleSetExpr=ruleSetExpr();

            state._fsp--;

             current =iv_ruleSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetExpr4957); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2089:1: ruleSetExpr returns [EObject current=null] : (this_IntervalSetExpr_0= ruleIntervalSetExpr | ( () otherlv_2= 'States' ) | ( () otherlv_4= 'Transitions' ) | ( () otherlv_6= 'MessageTypes' ) | ( () otherlv_8= 'Clocks' ) ) ;
    public final EObject ruleSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_IntervalSetExpr_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2092:28: ( (this_IntervalSetExpr_0= ruleIntervalSetExpr | ( () otherlv_2= 'States' ) | ( () otherlv_4= 'Transitions' ) | ( () otherlv_6= 'MessageTypes' ) | ( () otherlv_8= 'Clocks' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2093:1: (this_IntervalSetExpr_0= ruleIntervalSetExpr | ( () otherlv_2= 'States' ) | ( () otherlv_4= 'Transitions' ) | ( () otherlv_6= 'MessageTypes' ) | ( () otherlv_8= 'Clocks' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2093:1: (this_IntervalSetExpr_0= ruleIntervalSetExpr | ( () otherlv_2= 'States' ) | ( () otherlv_4= 'Transitions' ) | ( () otherlv_6= 'MessageTypes' ) | ( () otherlv_8= 'Clocks' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt21=1;
                }
                break;
            case 42:
                {
                alt21=2;
                }
                break;
            case 43:
                {
                alt21=3;
                }
                break;
            case 44:
                {
                alt21=4;
                }
                break;
            case 45:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2094:5: this_IntervalSetExpr_0= ruleIntervalSetExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSetExprAccess().getIntervalSetExprParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntervalSetExpr_in_ruleSetExpr5004);
                    this_IntervalSetExpr_0=ruleIntervalSetExpr();

                    state._fsp--;

                     
                            current = this_IntervalSetExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2103:6: ( () otherlv_2= 'States' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2103:6: ( () otherlv_2= 'States' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2103:7: () otherlv_2= 'States'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2103:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2104:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getStateSetExprAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSetExpr5031); 

                        	newLeafNode(otherlv_2, grammarAccess.getSetExprAccess().getStatesKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2114:6: ( () otherlv_4= 'Transitions' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2114:6: ( () otherlv_4= 'Transitions' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2114:7: () otherlv_4= 'Transitions'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2114:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2115:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getTransitionSetExprAction_2_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSetExpr5060); 

                        	newLeafNode(otherlv_4, grammarAccess.getSetExprAccess().getTransitionsKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2125:6: ( () otherlv_6= 'MessageTypes' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2125:6: ( () otherlv_6= 'MessageTypes' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2125:7: () otherlv_6= 'MessageTypes'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2125:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2126:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getMessageSetExprAction_3_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleSetExpr5089); 

                        	newLeafNode(otherlv_6, grammarAccess.getSetExprAccess().getMessageTypesKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2136:6: ( () otherlv_8= 'Clocks' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2136:6: ( () otherlv_8= 'Clocks' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2136:7: () otherlv_8= 'Clocks'
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2136:7: ()
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2137:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSetExprAccess().getClockSetExprAction_4_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleSetExpr5118); 

                        	newLeafNode(otherlv_8, grammarAccess.getSetExprAccess().getClocksKeyword_4_1());
                        

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2154:1: entryRuleIntervalSetExpr returns [EObject current=null] : iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF ;
    public final EObject entryRuleIntervalSetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervalSetExpr = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2155:2: (iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2156:2: iv_ruleIntervalSetExpr= ruleIntervalSetExpr EOF
            {
             newCompositeNode(grammarAccess.getIntervalSetExprRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntervalSetExpr_in_entryRuleIntervalSetExpr5155);
            iv_ruleIntervalSetExpr=ruleIntervalSetExpr();

            state._fsp--;

             current =iv_ruleIntervalSetExpr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntervalSetExpr5165); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2163:1: ruleIntervalSetExpr returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' ) ;
    public final EObject ruleIntervalSetExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lowerVal_2_0=null;
        Token otherlv_3=null;
        Token lv_upperVal_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2166:28: ( ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2167:1: ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2167:1: ( () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']' )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2167:2: () otherlv_1= '[' ( (lv_lowerVal_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_upperVal_4_0= RULE_INT ) ) otherlv_5= ']'
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2167:2: ()
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2168:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntervalSetExprAccess().getIntervalSetExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntervalSetExpr5211); 

                	newLeafNode(otherlv_1, grammarAccess.getIntervalSetExprAccess().getLeftSquareBracketKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2177:1: ( (lv_lowerVal_2_0= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2178:1: (lv_lowerVal_2_0= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2178:1: (lv_lowerVal_2_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2179:3: lv_lowerVal_2_0= RULE_INT
            {
            lv_lowerVal_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntervalSetExpr5228); 

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

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntervalSetExpr5245); 

                	newLeafNode(otherlv_3, grammarAccess.getIntervalSetExprAccess().getCommaKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2199:1: ( (lv_upperVal_4_0= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2200:1: (lv_upperVal_4_0= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2200:1: (lv_upperVal_4_0= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2201:3: lv_upperVal_4_0= RULE_INT
            {
            lv_upperVal_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntervalSetExpr5262); 

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

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntervalSetExpr5279); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2229:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2230:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2231:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5316);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName5327); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2238:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2241:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2242:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2242:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2242:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName5367); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2249:1: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2250:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleQualifiedName5386); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName5401); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2270:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2271:2: (iv_ruleEInt= ruleEInt EOF )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2272:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt5449);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt5460); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2279:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2282:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2283:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2283:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2283:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2283:2: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2284:2: kw= '-'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEInt5499); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt5516); 

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
    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2304:1: ruleComparisonOp returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2306:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2307:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2307:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt24=1;
                }
                break;
            case 49:
                {
                alt24=2;
                }
                break;
            case 50:
                {
                alt24=3;
                }
                break;
            case 51:
                {
                alt24=4;
                }
                break;
            case 52:
                {
                alt24=5;
                }
                break;
            case 53:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2307:2: (enumLiteral_0= '==' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2307:2: (enumLiteral_0= '==' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2307:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleComparisonOp5575); 

                            current = grammarAccess.getComparisonOpAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOpAccess().getEQUALSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2313:6: (enumLiteral_1= '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2313:6: (enumLiteral_1= '>' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2313:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleComparisonOp5592); 

                            current = grammarAccess.getComparisonOpAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOpAccess().getGREATEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2319:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2319:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2319:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleComparisonOp5609); 

                            current = grammarAccess.getComparisonOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOpAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2325:6: (enumLiteral_3= '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2325:6: (enumLiteral_3= '<' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2325:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleComparisonOp5626); 

                            current = grammarAccess.getComparisonOpAccess().getLESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOpAccess().getLESSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2331:6: (enumLiteral_4= '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2331:6: (enumLiteral_4= '<=' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2331:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleComparisonOp5643); 

                            current = grammarAccess.getComparisonOpAccess().getLESS_OR_EQALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOpAccess().getLESS_OR_EQALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2337:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2337:6: (enumLiteral_5= '!=' )
                    // ../de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.xtext/src-gen/de/uni_paderborn/fujaba/muml/verification/uppaal/parser/antlr/internal/InternalMtctl.g:2337:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleComparisonOp5660); 

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
        public static final BitSet FOLLOW_ruleProperty_in_rulePropertyRepository130 = new BitSet(new long[]{0x000083FFFD702062L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleProperty233 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleProperty244 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleProperty261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeadsToExpr_in_ruleExpression363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeadsToExpr_in_entryRuleLeadsToExpr397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeadsToExpr407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeIntervalExpr_in_ruleLeadsToExpr454 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleLeadsToExpr475 = new BitSet(new long[]{0x000083FFFD703060L});
        public static final BitSet FOLLOW_ruleTimeIntervalExpr_in_ruleLeadsToExpr496 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleTimeIntervalExpr_in_entryRuleTimeIntervalExpr534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeIntervalExpr544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleTimeIntervalExpr582 = new BitSet(new long[]{0x000083FFFD706060L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_ruleTimeIntervalExpr612 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTimeIntervalExpr624 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTimeIntervalExpr641 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTimeIntervalExpr658 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTimeIntervalExpr675 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTimeIntervalExpr692 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_ruleTimeIntervalExpr713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_ruleTimeIntervalExpr742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplyExpr_in_entryRuleImplyExpr777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplyExpr787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpr_in_ruleImplyExpr834 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleImplyExpr855 = new BitSet(new long[]{0x000083FFFD722060L});
        public static final BitSet FOLLOW_ruleAndExpr_in_ruleImplyExpr876 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpr_in_ruleAndExpr971 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleAndExpr992 = new BitSet(new long[]{0x000083FFFD742060L});
        public static final BitSet FOLLOW_ruleOrExpr_in_ruleAndExpr1013 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr1051 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleOrExpr1108 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleOrExpr1129 = new BitSet(new long[]{0x000083FFFD782060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleOrExpr1150 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_ruleNotExpr_in_entryRuleNotExpr1188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpr1198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNotExpr1236 = new BitSet(new long[]{0x000083FFFD702060L});
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
        public static final BitSet FOLLOW_23_in_ruleUniversalQuantExpr1604 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleUniversalQuantExpr1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistentialQuantExpr_in_entryRuleExistentialQuantExpr1661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExistentialQuantExpr1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleExistentialQuantExpr1708 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExistentialQuantExpr1720 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleVariableBinding_in_ruleExistentialQuantExpr1750 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleExistentialQuantExpr1762 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleExistentialQuantExpr1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableBinding_in_entryRuleVariableBinding1819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableBinding1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableBinding1871 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleVariableBinding1888 = new BitSet(new long[]{0x00003C0000004000L});
        public static final BitSet FOLLOW_ruleSetExpr_in_ruleVariableBinding1909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalQuantifierExpr_in_entryRuleTemporalQuantifierExpr1945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemporalQuantifierExpr1955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFExpr_in_ruleTemporalQuantifierExpr2002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAFExpr_in_ruleTemporalQuantifierExpr2029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEGExpr_in_ruleTemporalQuantifierExpr2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAGExpr_in_ruleTemporalQuantifierExpr2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFExpr_in_entryRuleEFExpr2118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFExpr2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEFExpr2166 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_27_in_ruleEFExpr2184 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleEFExpr2215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAFExpr_in_entryRuleAFExpr2251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAFExpr2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAFExpr2299 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_29_in_ruleAFExpr2317 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleAFExpr2348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEGExpr_in_entryRuleEGExpr2384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEGExpr2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEGExpr2432 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_31_in_ruleEGExpr2450 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleEGExpr2481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAGExpr_in_entryRuleAGExpr2517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAGExpr2527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAGExpr2565 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_33_in_ruleAGExpr2583 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_ruleNotExpr_in_ruleAGExpr2614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomExpr_in_entryRuleAtomExpr2650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomExpr2660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAtomExpr2698 = new BitSet(new long[]{0x000083FFFDF02060L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAtomExpr2720 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAtomExpr2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicateExpr_in_ruleAtomExpr2760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpr_in_ruleAtomExpr2787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicateExpr_in_entryRulePredicateExpr2822 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicateExpr2832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadlockExpr_in_rulePredicateExpr2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateExpr_in_rulePredicateExpr2906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageExpr_in_rulePredicateExpr2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionExpr_in_rulePredicateExpr2960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeadlockExpr_in_entryRuleDeadlockExpr2995 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeadlockExpr3005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleDeadlockExpr3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateExpr_in_entryRuleStateExpr3087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateExpr3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateActiveExpr_in_ruleStateExpr3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstateOfExpr_in_ruleStateExpr3171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateActiveExpr_in_entryRuleStateActiveExpr3206 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateActiveExpr3216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleStateActiveExpr3253 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStateActiveExpr3265 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStateActiveExpr3297 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleStateActiveExpr3309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstateOfExpr_in_entryRuleSubstateOfExpr3345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubstateOfExpr3355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleSubstateOfExpr3392 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSubstateOfExpr3404 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubstateOfExpr3436 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSubstateOfExpr3448 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubstateOfExpr3471 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSubstateOfExpr3483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageExpr_in_entryRuleMessageExpr3519 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageExpr3529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInBufferExpr_in_ruleMessageExpr3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInTransitExpr_in_ruleMessageExpr3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferOverflowExpr_in_ruleMessageExpr3630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInTransitExpr_in_entryRuleMessageInTransitExpr3665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageInTransitExpr3675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleMessageInTransitExpr3712 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMessageInTransitExpr3724 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMessageInTransitExpr3756 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMessageInTransitExpr3768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageInBufferExpr_in_entryRuleMessageInBufferExpr3804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageInBufferExpr3814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMessageInBufferExpr3851 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMessageInBufferExpr3863 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMessageInBufferExpr3892 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMessageInBufferExpr3904 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMessageInBufferExpr3927 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMessageInBufferExpr3939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferOverflowExpr_in_entryRuleBufferOverflowExpr3975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBufferOverflowExpr3985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleBufferOverflowExpr4031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionExpr_in_entryRuleTransitionExpr4067 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionExpr4077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionFiringExpr_in_ruleTransitionExpr4123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionFiringExpr_in_entryRuleTransitionFiringExpr4157 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionFiringExpr4167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleTransitionFiringExpr4204 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTransitionFiringExpr4216 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransitionFiringExpr4248 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTransitionFiringExpr4260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr4296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpr4306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveVariableExpr_in_ruleComparisonExpr4363 = new BitSet(new long[]{0x003F000000000000L});
        public static final BitSet FOLLOW_ruleMapExpr_in_ruleComparisonExpr4382 = new BitSet(new long[]{0x003F000000000000L});
        public static final BitSet FOLLOW_ruleConstExpr_in_ruleComparisonExpr4401 = new BitSet(new long[]{0x003F000000000000L});
        public static final BitSet FOLLOW_ruleComparisonOp_in_ruleComparisonExpr4425 = new BitSet(new long[]{0x000083FFFD702060L});
        public static final BitSet FOLLOW_rulePrimitiveVariableExpr_in_ruleComparisonExpr4448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpr_in_ruleComparisonExpr4467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstExpr_in_ruleComparisonExpr4486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapExpr_in_entryRuleMapExpr4525 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapExpr4535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferMessageCountExpr_in_ruleMapExpr4581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBufferMessageCountExpr_in_entryRuleBufferMessageCountExpr4615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBufferMessageCountExpr4625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleBufferMessageCountExpr4662 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleBufferMessageCountExpr4674 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBufferMessageCountExpr4706 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleBufferMessageCountExpr4718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveVariableExpr_in_entryRulePrimitiveVariableExpr4754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveVariableExpr4764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveVariableExpr4811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstExpr_in_entryRuleConstExpr4846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstExpr4856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleConstExpr4911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetExpr_in_entryRuleSetExpr4947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetExpr4957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntervalSetExpr_in_ruleSetExpr5004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleSetExpr5031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleSetExpr5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleSetExpr5089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleSetExpr5118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntervalSetExpr_in_entryRuleIntervalSetExpr5155 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntervalSetExpr5165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleIntervalSetExpr5211 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntervalSetExpr5228 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntervalSetExpr5245 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntervalSetExpr5262 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntervalSetExpr5279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5367 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleQualifiedName5386 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5401 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt5449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEInt5499 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt5516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleComparisonOp5575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleComparisonOp5592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleComparisonOp5609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleComparisonOp5626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleComparisonOp5643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleComparisonOp5660 = new BitSet(new long[]{0x0000000000000002L});
    }


}