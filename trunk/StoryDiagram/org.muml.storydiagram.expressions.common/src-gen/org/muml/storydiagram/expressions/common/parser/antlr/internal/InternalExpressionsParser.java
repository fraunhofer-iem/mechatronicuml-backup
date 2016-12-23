package org.muml.storydiagram.expressions.common.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.muml.storydiagram.expressions.common.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'equiv'", "'imply'", "'or'", "'xor'", "'and'", "'not'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'='", "'!='", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpressions.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LExpression";	
       	}
       	
       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLExpression"
    // InternalExpressions.g:73:1: entryRuleLExpression returns [EObject current=null] : iv_ruleLExpression= ruleLExpression EOF ;
    public final EObject entryRuleLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpression = null;


        try {
            // InternalExpressions.g:74:2: (iv_ruleLExpression= ruleLExpression EOF )
            // InternalExpressions.g:75:2: iv_ruleLExpression= ruleLExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLExpression=ruleLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLExpression"


    // $ANTLR start "ruleLExpression"
    // InternalExpressions.g:82:1: ruleLExpression returns [EObject current=null] : this_Equivalent_0= ruleEquivalent ;
    public final EObject ruleLExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Equivalent_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:85:28: (this_Equivalent_0= ruleEquivalent )
            // InternalExpressions.g:87:2: this_Equivalent_0= ruleEquivalent
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_Equivalent_0=ruleEquivalent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Equivalent_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleLExpression"


    // $ANTLR start "entryRuleEquivalent"
    // InternalExpressions.g:106:1: entryRuleEquivalent returns [EObject current=null] : iv_ruleEquivalent= ruleEquivalent EOF ;
    public final EObject entryRuleEquivalent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalent = null;


        try {
            // InternalExpressions.g:107:2: (iv_ruleEquivalent= ruleEquivalent EOF )
            // InternalExpressions.g:108:2: iv_ruleEquivalent= ruleEquivalent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquivalentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquivalent=ruleEquivalent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquivalent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEquivalent"


    // $ANTLR start "ruleEquivalent"
    // InternalExpressions.g:115:1: ruleEquivalent returns [EObject current=null] : (this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? ) ;
    public final EObject ruleEquivalent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:118:28: ( (this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? ) )
            // InternalExpressions.g:119:1: (this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? )
            {
            // InternalExpressions.g:119:1: (this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? )
            // InternalExpressions.g:120:2: this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_3);
            this_Implication_0=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Implication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalExpressions.g:131:1: ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalExpressions.g:131:2: () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) )
                    {
                    // InternalExpressions.g:131:2: ()
                    // InternalExpressions.g:132:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEquivalentAccess().getEquivKeyword_1_1());
                          
                    }
                    // InternalExpressions.g:144:1: ( (lv_right_3_0= ruleEquivalent ) )
                    // InternalExpressions.g:145:1: (lv_right_3_0= ruleEquivalent )
                    {
                    // InternalExpressions.g:145:1: (lv_right_3_0= ruleEquivalent )
                    // InternalExpressions.g:146:3: lv_right_3_0= ruleEquivalent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleEquivalent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquivalentRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"org.muml.storydiagram.expressions.common.Expressions.Equivalent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleEquivalent"


    // $ANTLR start "entryRuleImplication"
    // InternalExpressions.g:170:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // InternalExpressions.g:171:2: (iv_ruleImplication= ruleImplication EOF )
            // InternalExpressions.g:172:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // InternalExpressions.g:179:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )? ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Disjunction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:182:28: ( (this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )? ) )
            // InternalExpressions.g:183:1: (this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )? )
            {
            // InternalExpressions.g:183:1: (this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )? )
            // InternalExpressions.g:184:2: this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_5);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalExpressions.g:195:1: ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpressions.g:195:2: () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) )
                    {
                    // InternalExpressions.g:195:2: ()
                    // InternalExpressions.g:196:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImplicationAccess().getImplyLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImplicationAccess().getImplyKeyword_1_1());
                          
                    }
                    // InternalExpressions.g:208:1: ( (lv_right_3_0= ruleImplication ) )
                    // InternalExpressions.g:209:1: (lv_right_3_0= ruleImplication )
                    {
                    // InternalExpressions.g:209:1: (lv_right_3_0= ruleImplication )
                    // InternalExpressions.g:210:3: lv_right_3_0= ruleImplication
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleImplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplicationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"org.muml.storydiagram.expressions.common.Expressions.Implication");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // InternalExpressions.g:234:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // InternalExpressions.g:235:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // InternalExpressions.g:236:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // InternalExpressions.g:243:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:246:28: ( (this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? ) )
            // InternalExpressions.g:247:1: (this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? )
            {
            // InternalExpressions.g:247:1: (this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? )
            // InternalExpressions.g:248:2: this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_6);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalExpressions.g:259:1: ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalExpressions.g:259:2: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) )
                    {
                    // InternalExpressions.g:259:2: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==15) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalExpressions.g:259:3: ( () otherlv_2= 'or' )
                            {
                            // InternalExpressions.g:259:3: ( () otherlv_2= 'or' )
                            // InternalExpressions.g:259:4: () otherlv_2= 'or'
                            {
                            // InternalExpressions.g:259:4: ()
                            // InternalExpressions.g:260:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_2=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalExpressions.g:273:6: ( () otherlv_4= 'xor' )
                            {
                            // InternalExpressions.g:273:6: ( () otherlv_4= 'xor' )
                            // InternalExpressions.g:273:7: () otherlv_4= 'xor'
                            {
                            // InternalExpressions.g:273:7: ()
                            // InternalExpressions.g:274:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_4=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // InternalExpressions.g:286:3: ( (lv_right_5_0= ruleDisjunction ) )
                    // InternalExpressions.g:287:1: (lv_right_5_0= ruleDisjunction )
                    {
                    // InternalExpressions.g:287:1: (lv_right_5_0= ruleDisjunction )
                    // InternalExpressions.g:288:3: lv_right_5_0= ruleDisjunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_5_0=ruleDisjunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_5_0, 
                              		"org.muml.storydiagram.expressions.common.Expressions.Disjunction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // InternalExpressions.g:312:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // InternalExpressions.g:313:2: (iv_ruleConjunction= ruleConjunction EOF )
            // InternalExpressions.g:314:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalExpressions.g:321:1: ruleConjunction returns [EObject current=null] : (this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )? ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:324:28: ( (this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )? ) )
            // InternalExpressions.g:325:1: (this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )? )
            {
            // InternalExpressions.g:325:1: (this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )? )
            // InternalExpressions.g:326:2: this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_7);
            this_Negation_0=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Negation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalExpressions.g:337:1: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExpressions.g:337:2: () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) )
                    {
                    // InternalExpressions.g:337:2: ()
                    // InternalExpressions.g:338:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConjunctionAccess().getAndLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConjunctionAccess().getAndKeyword_1_1());
                          
                    }
                    // InternalExpressions.g:350:1: ( (lv_right_3_0= ruleConjunction ) )
                    // InternalExpressions.g:351:1: (lv_right_3_0= ruleConjunction )
                    {
                    // InternalExpressions.g:351:1: (lv_right_3_0= ruleConjunction )
                    // InternalExpressions.g:352:3: lv_right_3_0= ruleConjunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleConjunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"org.muml.storydiagram.expressions.common.Expressions.Conjunction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // InternalExpressions.g:376:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalExpressions.g:377:2: (iv_ruleNegation= ruleNegation EOF )
            // InternalExpressions.g:378:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalExpressions.g:385:1: ruleNegation returns [EObject current=null] : ( (otherlv_0= 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Negated_1 = null;

        EObject this_CExpression_2 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:388:28: ( ( (otherlv_0= 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression ) )
            // InternalExpressions.g:389:1: ( (otherlv_0= 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression )
            {
            // InternalExpressions.g:389:1: ( (otherlv_0= 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_ID)||LA6_0==18) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalExpressions.g:389:2: (otherlv_0= 'not' this_Negated_1= ruleNegated )
                    {
                    // InternalExpressions.g:389:2: (otherlv_0= 'not' this_Negated_1= ruleNegated )
                    // InternalExpressions.g:389:4: otherlv_0= 'not' this_Negated_1= ruleNegated
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNotKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Negated_1=ruleNegated();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Negated_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:407:2: this_CExpression_2= ruleCExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_CExpression_2=ruleCExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CExpression_2; 
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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleNegated"
    // InternalExpressions.g:426:1: entryRuleNegated returns [EObject current=null] : iv_ruleNegated= ruleNegated EOF ;
    public final EObject entryRuleNegated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegated = null;


        try {
            // InternalExpressions.g:427:2: (iv_ruleNegated= ruleNegated EOF )
            // InternalExpressions.g:428:2: iv_ruleNegated= ruleNegated EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegatedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNegated=ruleNegated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegated; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegated"


    // $ANTLR start "ruleNegated"
    // InternalExpressions.g:435:1: ruleNegated returns [EObject current=null] : ( () ( (lv_not_1_0= ruleCExpression ) ) ) ;
    public final EObject ruleNegated() throws RecognitionException {
        EObject current = null;

        EObject lv_not_1_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:438:28: ( ( () ( (lv_not_1_0= ruleCExpression ) ) ) )
            // InternalExpressions.g:439:1: ( () ( (lv_not_1_0= ruleCExpression ) ) )
            {
            // InternalExpressions.g:439:1: ( () ( (lv_not_1_0= ruleCExpression ) ) )
            // InternalExpressions.g:439:2: () ( (lv_not_1_0= ruleCExpression ) )
            {
            // InternalExpressions.g:439:2: ()
            // InternalExpressions.g:440:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNegatedAccess().getNotAction_0(),
                          current);
                  
            }

            }

            // InternalExpressions.g:448:2: ( (lv_not_1_0= ruleCExpression ) )
            // InternalExpressions.g:449:1: (lv_not_1_0= ruleCExpression )
            {
            // InternalExpressions.g:449:1: (lv_not_1_0= ruleCExpression )
            // InternalExpressions.g:450:3: lv_not_1_0= ruleCExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_not_1_0=ruleCExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegatedRule());
              	        }
                     		set(
                     			current, 
                     			"not",
                      		lv_not_1_0, 
                      		"org.muml.storydiagram.expressions.common.Expressions.CExpression");
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
    // $ANTLR end "ruleNegated"


    // $ANTLR start "entryRuleCExpression"
    // InternalExpressions.g:474:1: entryRuleCExpression returns [EObject current=null] : iv_ruleCExpression= ruleCExpression EOF ;
    public final EObject entryRuleCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCExpression = null;


        try {
            // InternalExpressions.g:475:2: (iv_ruleCExpression= ruleCExpression EOF )
            // InternalExpressions.g:476:2: iv_ruleCExpression= ruleCExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCExpression=ruleCExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCExpression"


    // $ANTLR start "ruleCExpression"
    // InternalExpressions.g:483:1: ruleCExpression returns [EObject current=null] : ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable ) ;
    public final EObject ruleCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_LExpression_1 = null;

        EObject this_Compare_3 = null;

        EObject this_BooleanValue_4 = null;

        EObject this_Variable_5 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:486:28: ( ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable ) )
            // InternalExpressions.g:487:1: ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )
            {
            // InternalExpressions.g:487:1: ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred7_InternalExpressions()) ) {
                    alt7=1;
                }
                else if ( (synpred8_InternalExpressions()) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred8_InternalExpressions()) ) {
                    alt7=2;
                }
                else if ( (synpred9_InternalExpressions()) ) {
                    alt7=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA7_5 = input.LA(2);

                if ( (synpred8_InternalExpressions()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExpressions.g:487:2: (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' )
                    {
                    // InternalExpressions.g:487:2: (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' )
                    // InternalExpressions.g:487:4: otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_8);
                    this_LExpression_1=ruleLExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:509:2: this_Compare_3= ruleCompare
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Compare_3=ruleCompare();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Compare_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalExpressions.g:522:2: this_BooleanValue_4= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_4=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanValue_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalExpressions.g:535:2: this_Variable_5= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_5=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_5; 
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
    // $ANTLR end "ruleCExpression"


    // $ANTLR start "entryRuleCompare"
    // InternalExpressions.g:554:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalExpressions.g:555:2: (iv_ruleCompare= ruleCompare EOF )
            // InternalExpressions.g:556:2: iv_ruleCompare= ruleCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompare; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalExpressions.g:563:1: ruleCompare returns [EObject current=null] : (this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_SomeValue_0 = null;

        EObject lv_right_15_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:566:28: ( (this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) ) )
            // InternalExpressions.g:567:1: (this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) )
            {
            // InternalExpressions.g:567:1: (this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) )
            // InternalExpressions.g:568:2: this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_9);
            this_SomeValue_0=ruleSomeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SomeValue_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalExpressions.g:579:1: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            case 26:
                {
                alt8=7;
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
                    // InternalExpressions.g:579:2: ( () otherlv_2= '<=' )
                    {
                    // InternalExpressions.g:579:2: ( () otherlv_2= '<=' )
                    // InternalExpressions.g:579:3: () otherlv_2= '<='
                    {
                    // InternalExpressions.g:579:3: ()
                    // InternalExpressions.g:580:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:593:6: ( () otherlv_4= '<' )
                    {
                    // InternalExpressions.g:593:6: ( () otherlv_4= '<' )
                    // InternalExpressions.g:593:7: () otherlv_4= '<'
                    {
                    // InternalExpressions.g:593:7: ()
                    // InternalExpressions.g:594:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getLessLeftAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:607:6: ( () otherlv_6= '>=' )
                    {
                    // InternalExpressions.g:607:6: ( () otherlv_6= '>=' )
                    // InternalExpressions.g:607:7: () otherlv_6= '>='
                    {
                    // InternalExpressions.g:607:7: ()
                    // InternalExpressions.g:608:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:621:6: ( () otherlv_8= '>' )
                    {
                    // InternalExpressions.g:621:6: ( () otherlv_8= '>' )
                    // InternalExpressions.g:621:7: () otherlv_8= '>'
                    {
                    // InternalExpressions.g:621:7: ()
                    // InternalExpressions.g:622:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalExpressions.g:635:6: ( () otherlv_10= '=' )
                    {
                    // InternalExpressions.g:635:6: ( () otherlv_10= '=' )
                    // InternalExpressions.g:635:7: () otherlv_10= '='
                    {
                    // InternalExpressions.g:635:7: ()
                    // InternalExpressions.g:636:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_10=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalExpressions.g:649:6: ( () otherlv_12= '!=' )
                    {
                    // InternalExpressions.g:649:6: ( () otherlv_12= '!=' )
                    // InternalExpressions.g:649:7: () otherlv_12= '!='
                    {
                    // InternalExpressions.g:649:7: ()
                    // InternalExpressions.g:650:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,25,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalExpressions.g:663:6: ( () otherlv_14= '~' )
                    {
                    // InternalExpressions.g:663:6: ( () otherlv_14= '~' )
                    // InternalExpressions.g:663:7: () otherlv_14= '~'
                    {
                    // InternalExpressions.g:663:7: ()
                    // InternalExpressions.g:664:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCompareAccess().getTildeKeyword_1_6_1());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalExpressions.g:676:3: ( (lv_right_15_0= ruleSomeValue ) )
            // InternalExpressions.g:677:1: (lv_right_15_0= ruleSomeValue )
            {
            // InternalExpressions.g:677:1: (lv_right_15_0= ruleSomeValue )
            // InternalExpressions.g:678:3: lv_right_15_0= ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_right_15_0=ruleSomeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompareRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_15_0, 
                      		"org.muml.storydiagram.expressions.common.Expressions.SomeValue");
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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleSomeValue"
    // InternalExpressions.g:702:1: entryRuleSomeValue returns [EObject current=null] : iv_ruleSomeValue= ruleSomeValue EOF ;
    public final EObject entryRuleSomeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeValue = null;


        try {
            // InternalExpressions.g:703:2: (iv_ruleSomeValue= ruleSomeValue EOF )
            // InternalExpressions.g:704:2: iv_ruleSomeValue= ruleSomeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSomeValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSomeValue=ruleSomeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSomeValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSomeValue"


    // $ANTLR start "ruleSomeValue"
    // InternalExpressions.g:711:1: ruleSomeValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression ) ;
    public final EObject ruleSomeValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_AExpression_2 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:714:28: ( (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression ) )
            // InternalExpressions.g:715:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression )
            {
            // InternalExpressions.g:715:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 18:
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
                    // InternalExpressions.g:716:2: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:729:2: this_BooleanValue_1= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalExpressions.g:742:2: this_AExpression_2= ruleAExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_AExpression_2=ruleAExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AExpression_2; 
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
    // $ANTLR end "ruleSomeValue"


    // $ANTLR start "entryRuleAExpression"
    // InternalExpressions.g:761:1: entryRuleAExpression returns [EObject current=null] : iv_ruleAExpression= ruleAExpression EOF ;
    public final EObject entryRuleAExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExpression = null;


        try {
            // InternalExpressions.g:762:2: (iv_ruleAExpression= ruleAExpression EOF )
            // InternalExpressions.g:763:2: iv_ruleAExpression= ruleAExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAExpression=ruleAExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAExpression"


    // $ANTLR start "ruleAExpression"
    // InternalExpressions.g:770:1: ruleAExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleAExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:773:28: (this_Addition_0= ruleAddition )
            // InternalExpressions.g:775:2: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleAExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalExpressions.g:794:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalExpressions.g:795:2: (iv_ruleAddition= ruleAddition EOF )
            // InternalExpressions.g:796:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalExpressions.g:803:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:806:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalExpressions.g:807:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalExpressions.g:807:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalExpressions.g:808:2: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_11);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalExpressions.g:819:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=27 && LA11_0<=28)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExpressions.g:819:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalExpressions.g:819:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==27) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==28) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalExpressions.g:819:3: ( () otherlv_2= '+' )
            	            {
            	            // InternalExpressions.g:819:3: ( () otherlv_2= '+' )
            	            // InternalExpressions.g:819:4: () otherlv_2= '+'
            	            {
            	            // InternalExpressions.g:819:4: ()
            	            // InternalExpressions.g:820:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalExpressions.g:833:6: ( () otherlv_4= '-' )
            	            {
            	            // InternalExpressions.g:833:6: ( () otherlv_4= '-' )
            	            // InternalExpressions.g:833:7: () otherlv_4= '-'
            	            {
            	            // InternalExpressions.g:833:7: ()
            	            // InternalExpressions.g:834:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,28,FOLLOW_10); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalExpressions.g:846:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalExpressions.g:847:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalExpressions.g:847:1: (lv_right_5_0= ruleMultiplication )
            	    // InternalExpressions.g:848:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"org.muml.storydiagram.expressions.common.Expressions.Multiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalExpressions.g:872:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalExpressions.g:873:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalExpressions.g:874:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalExpressions.g:881:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Power_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:884:28: ( (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )* ) )
            // InternalExpressions.g:885:1: (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )* )
            {
            // InternalExpressions.g:885:1: (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )* )
            // InternalExpressions.g:886:2: this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_12);
            this_Power_0=rulePower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Power_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalExpressions.g:897:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExpressions.g:897:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) )
            	    {
            	    // InternalExpressions.g:897:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt12=3;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // InternalExpressions.g:897:3: ( () otherlv_2= '*' )
            	            {
            	            // InternalExpressions.g:897:3: ( () otherlv_2= '*' )
            	            // InternalExpressions.g:897:4: () otherlv_2= '*'
            	            {
            	            // InternalExpressions.g:897:4: ()
            	            // InternalExpressions.g:898:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,29,FOLLOW_10); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalExpressions.g:911:6: ( () otherlv_4= '/' )
            	            {
            	            // InternalExpressions.g:911:6: ( () otherlv_4= '/' )
            	            // InternalExpressions.g:911:7: () otherlv_4= '/'
            	            {
            	            // InternalExpressions.g:911:7: ()
            	            // InternalExpressions.g:912:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,30,FOLLOW_10); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalExpressions.g:925:6: ( () otherlv_6= '%' )
            	            {
            	            // InternalExpressions.g:925:6: ( () otherlv_6= '%' )
            	            // InternalExpressions.g:925:7: () otherlv_6= '%'
            	            {
            	            // InternalExpressions.g:925:7: ()
            	            // InternalExpressions.g:926:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,31,FOLLOW_10); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalExpressions.g:938:3: ( (lv_right_7_0= rulePower ) )
            	    // InternalExpressions.g:939:1: (lv_right_7_0= rulePower )
            	    {
            	    // InternalExpressions.g:939:1: (lv_right_7_0= rulePower )
            	    // InternalExpressions.g:940:3: lv_right_7_0= rulePower
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_right_7_0=rulePower();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_7_0, 
            	              		"org.muml.storydiagram.expressions.common.Expressions.Power");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePower"
    // InternalExpressions.g:964:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // InternalExpressions.g:965:2: (iv_rulePower= rulePower EOF )
            // InternalExpressions.g:966:2: iv_rulePower= rulePower EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePower=rulePower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePower; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalExpressions.g:973:1: rulePower returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:976:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalExpressions.g:977:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalExpressions.g:977:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalExpressions.g:978:2: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_13);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalExpressions.g:989:1: ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExpressions.g:989:2: ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalExpressions.g:989:2: ( () otherlv_2= '^' )
            	    // InternalExpressions.g:989:3: () otherlv_2= '^'
            	    {
            	    // InternalExpressions.g:989:3: ()
            	    // InternalExpressions.g:990:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPowerAccess().getPowLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1());
            	          
            	    }

            	    }

            	    // InternalExpressions.g:1002:2: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalExpressions.g:1003:1: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalExpressions.g:1003:1: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalExpressions.g:1004:3: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPowerRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"org.muml.storydiagram.expressions.common.Expressions.PrimaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
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
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalExpressions.g:1028:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalExpressions.g:1029:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalExpressions.g:1030:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalExpressions.g:1037:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AExpression_1 = null;

        EObject this_NumberValue_3 = null;

        EObject this_Variable_4 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:1040:28: ( ( (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable ) )
            // InternalExpressions.g:1041:1: ( (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable )
            {
            // InternalExpressions.g:1041:1: ( (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
                {
                alt15=2;
                }
                break;
            case RULE_ID:
                {
                alt15=3;
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
                    // InternalExpressions.g:1041:2: (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' )
                    {
                    // InternalExpressions.g:1041:2: (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' )
                    // InternalExpressions.g:1041:4: otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_8);
                    this_AExpression_1=ruleAExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:1063:2: this_NumberValue_3= ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberValue_3=ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberValue_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalExpressions.g:1076:2: this_Variable_4= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Variable_4=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_4; 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNumberValue"
    // InternalExpressions.g:1095:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalExpressions.g:1096:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalExpressions.g:1097:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalExpressions.g:1104:1: ruleNumberValue returns [EObject current=null] : ( (lv_numValue_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numValue_0_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:1107:28: ( ( (lv_numValue_0_0= ruleNUMBER ) ) )
            // InternalExpressions.g:1108:1: ( (lv_numValue_0_0= ruleNUMBER ) )
            {
            // InternalExpressions.g:1108:1: ( (lv_numValue_0_0= ruleNUMBER ) )
            // InternalExpressions.g:1109:1: (lv_numValue_0_0= ruleNUMBER )
            {
            // InternalExpressions.g:1109:1: (lv_numValue_0_0= ruleNUMBER )
            // InternalExpressions.g:1110:3: lv_numValue_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_numValue_0_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberValueRule());
              	        }
                     		set(
                     			current, 
                     			"numValue",
                      		lv_numValue_0_0, 
                      		"org.muml.storydiagram.expressions.common.Expressions.NUMBER");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleNUMBER"
    // InternalExpressions.g:1134:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalExpressions.g:1135:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalExpressions.g:1136:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalExpressions.g:1143:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // InternalExpressions.g:1146:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalExpressions.g:1147:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalExpressions.g:1147:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalExpressions.g:1147:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // InternalExpressions.g:1154:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalExpressions.g:1155:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,33,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalExpressions.g:1175:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalExpressions.g:1176:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalExpressions.g:1177:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalExpressions.g:1184:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalExpressions.g:1187:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalExpressions.g:1188:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalExpressions.g:1188:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalExpressions.g:1189:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalExpressions.g:1189:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalExpressions.g:1190:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.muml.storydiagram.expressions.common.Expressions.BOOLEAN");
              	    
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalExpressions.g:1214:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalExpressions.g:1215:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalExpressions.g:1216:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalExpressions.g:1223:1: ruleStringValue returns [EObject current=null] : ( (lv_strValue_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_strValue_0_0=null;

         enterRule(); 
            
        try {
            // InternalExpressions.g:1226:28: ( ( (lv_strValue_0_0= RULE_STRING ) ) )
            // InternalExpressions.g:1227:1: ( (lv_strValue_0_0= RULE_STRING ) )
            {
            // InternalExpressions.g:1227:1: ( (lv_strValue_0_0= RULE_STRING ) )
            // InternalExpressions.g:1228:1: (lv_strValue_0_0= RULE_STRING )
            {
            // InternalExpressions.g:1228:1: (lv_strValue_0_0= RULE_STRING )
            // InternalExpressions.g:1229:3: lv_strValue_0_0= RULE_STRING
            {
            lv_strValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_strValue_0_0, grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"strValue",
                      		lv_strValue_0_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleVariable"
    // InternalExpressions.g:1253:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalExpressions.g:1254:2: (iv_ruleVariable= ruleVariable EOF )
            // InternalExpressions.g:1255:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalExpressions.g:1262:1: ruleVariable returns [EObject current=null] : ( (lv_varName_0_0= ruleVARIABLE_VALUE ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_varName_0_0 = null;


         enterRule(); 
            
        try {
            // InternalExpressions.g:1265:28: ( ( (lv_varName_0_0= ruleVARIABLE_VALUE ) ) )
            // InternalExpressions.g:1266:1: ( (lv_varName_0_0= ruleVARIABLE_VALUE ) )
            {
            // InternalExpressions.g:1266:1: ( (lv_varName_0_0= ruleVARIABLE_VALUE ) )
            // InternalExpressions.g:1267:1: (lv_varName_0_0= ruleVARIABLE_VALUE )
            {
            // InternalExpressions.g:1267:1: (lv_varName_0_0= ruleVARIABLE_VALUE )
            // InternalExpressions.g:1268:3: lv_varName_0_0= ruleVARIABLE_VALUE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_varName_0_0=ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableRule());
              	        }
                     		set(
                     			current, 
                     			"varName",
                      		lv_varName_0_0, 
                      		"org.muml.storydiagram.expressions.common.Expressions.VARIABLE_VALUE");
              	        afterParserOrEnumRuleCall();
              	    
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


    // $ANTLR start "entryRuleVARIABLE_VALUE"
    // InternalExpressions.g:1292:1: entryRuleVARIABLE_VALUE returns [String current=null] : iv_ruleVARIABLE_VALUE= ruleVARIABLE_VALUE EOF ;
    public final String entryRuleVARIABLE_VALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVARIABLE_VALUE = null;


        try {
            // InternalExpressions.g:1293:2: (iv_ruleVARIABLE_VALUE= ruleVARIABLE_VALUE EOF )
            // InternalExpressions.g:1294:2: iv_ruleVARIABLE_VALUE= ruleVARIABLE_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVARIABLE_VALUERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVARIABLE_VALUE=ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVARIABLE_VALUE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVARIABLE_VALUE"


    // $ANTLR start "ruleVARIABLE_VALUE"
    // InternalExpressions.g:1301:1: ruleVARIABLE_VALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleVARIABLE_VALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // InternalExpressions.g:1304:28: ( (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) ) )
            // InternalExpressions.g:1305:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )
            {
            // InternalExpressions.g:1305:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==EOF||(LA17_1>=12 && LA17_1<=16)||(LA17_1>=19 && LA17_1<=32)) ) {
                    alt17=1;
                }
                else if ( (LA17_1==33) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalExpressions.g:1305:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalExpressions.g:1313:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    {
                    // InternalExpressions.g:1313:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    // InternalExpressions.g:1313:11: this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    kw=(Token)match(input,33,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
                          
                    }
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
                          
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
    // $ANTLR end "ruleVARIABLE_VALUE"

    // $ANTLR start synpred7_InternalExpressions
    public final void synpred7_InternalExpressions_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_LExpression_1 = null;


        // InternalExpressions.g:487:2: ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) )
        // InternalExpressions.g:487:2: (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' )
        {
        // InternalExpressions.g:487:2: (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' )
        // InternalExpressions.g:487:4: otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')'
        {
        otherlv_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return ;
        pushFollow(FOLLOW_8);
        this_LExpression_1=ruleLExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalExpressions

    // $ANTLR start synpred8_InternalExpressions
    public final void synpred8_InternalExpressions_fragment() throws RecognitionException {   
        EObject this_Compare_3 = null;


        // InternalExpressions.g:509:2: (this_Compare_3= ruleCompare )
        // InternalExpressions.g:509:2: this_Compare_3= ruleCompare
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_Compare_3=ruleCompare();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalExpressions

    // $ANTLR start synpred9_InternalExpressions
    public final void synpred9_InternalExpressions_fragment() throws RecognitionException {   
        EObject this_BooleanValue_4 = null;


        // InternalExpressions.g:522:2: (this_BooleanValue_4= ruleBooleanValue )
        // InternalExpressions.g:522:2: this_BooleanValue_4= ruleBooleanValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_BooleanValue_4=ruleBooleanValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalExpressions

    // Delegated rules

    public final boolean synpred7_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});

}