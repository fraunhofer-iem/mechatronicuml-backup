package de.uni_paderborn.fujaba.muml.parser.antlr.internal; 

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
import de.uni_paderborn.fujaba.muml.services.ActionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActionLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'for'", "'('", "';'", "')'", "'while'", "'do'", "');'", "'if'", "'elseif'", "'else'", "'UNSET'", "':='", "'+='", "'=+'", "'-='", "'=-'", "'++'", "'--'", "'&'", "'&&'", "'|'", "'||'", "'xor'", "'=>'", "'<=>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'=='", "'>='", "'>'", "'<>'", "'not'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
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
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalActionLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActionLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActionLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g"; }



     	private ActionLanguageGrammarAccess grammarAccess;
     	
        public InternalActionLanguageParser(TokenStream input, ActionLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Block";	
       	}
       	
       	@Override
       	protected ActionLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBlock"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:68:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:69:2: (iv_ruleBlock= ruleBlock EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:70:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock75);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock85); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:77:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:80:28: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:81:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:81:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:81:2: () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}'
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:81:2: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBlock131); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:91:1: ( (lv_expressions_2_0= ruleExpressionStartRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==15||(LA1_0>=19 && LA1_0<=20)||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:92:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:92:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:93:3: lv_expressions_2_0= ruleExpressionStartRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_ruleBlock152);
            	    lv_expressions_2_0=ruleExpressionStartRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"ExpressionStartRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBlock165); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleForLoop"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:121:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:122:2: (iv_ruleForLoop= ruleForLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:123:2: iv_ruleForLoop= ruleForLoop EOF
            {
             newCompositeNode(grammarAccess.getForLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_entryRuleForLoop201);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoop211); 

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
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:130:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_initalizeExpression_2_0 = null;

        EObject lv_loopTest_3_0 = null;

        EObject lv_countingExpression_5_0 = null;

        EObject lv_block_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:133:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:134:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:134:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:134:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleForLoop248); 

                	newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleForLoop260); 

                	newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:142:1: ( (lv_initalizeExpression_2_0= ruleAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:143:1: (lv_initalizeExpression_2_0= ruleAssignment )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:143:1: (lv_initalizeExpression_2_0= ruleAssignment )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:144:3: lv_initalizeExpression_2_0= ruleAssignment
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getInitalizeExpressionAssignmentParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleForLoop281);
            lv_initalizeExpression_2_0=ruleAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"initalizeExpression",
                    		lv_initalizeExpression_2_0, 
                    		"Assignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:160:2: ( (lv_loopTest_3_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:161:1: (lv_loopTest_3_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:161:1: (lv_loopTest_3_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:162:3: lv_loopTest_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoop302);
            lv_loopTest_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"loopTest",
                    		lv_loopTest_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleForLoop314); 

                	newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getSemicolonKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:182:1: ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:183:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:183:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:184:3: lv_countingExpression_5_0= ruleForLoopCountingExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop335);
            lv_countingExpression_5_0=ruleForLoopCountingExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"countingExpression",
                    		lv_countingExpression_5_0, 
                    		"ForLoopCountingExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleForLoop347); 

                	newLeafNode(otherlv_6, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:204:1: ( (lv_block_7_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:205:1: (lv_block_7_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:205:1: (lv_block_7_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:206:3: lv_block_7_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleForLoop368);
            lv_block_7_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_7_0, 
                    		"Block");
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
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleWhileLoop"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:230:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:231:2: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:232:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop404);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhileLoop414); 

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
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:239:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_loopTest_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:242:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:243:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:243:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:243:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleWhileLoop451); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWhileLoop463); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:251:1: ( (lv_loopTest_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:252:1: (lv_loopTest_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:252:1: (lv_loopTest_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:253:3: lv_loopTest_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWhileLoop484);
            lv_loopTest_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"loopTest",
                    		lv_loopTest_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWhileLoop496); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:273:1: ( (lv_block_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:274:1: (lv_block_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:274:1: (lv_block_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:275:3: lv_block_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleWhileLoop517);
            lv_block_4_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_4_0, 
                    		"Block");
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
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleDoWhileLoop"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:299:1: entryRuleDoWhileLoop returns [EObject current=null] : iv_ruleDoWhileLoop= ruleDoWhileLoop EOF ;
    public final EObject entryRuleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:300:2: (iv_ruleDoWhileLoop= ruleDoWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:301:2: iv_ruleDoWhileLoop= ruleDoWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getDoWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop553);
            iv_ruleDoWhileLoop=ruleDoWhileLoop();

            state._fsp--;

             current =iv_ruleDoWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoWhileLoop563); 

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
    // $ANTLR end "entryRuleDoWhileLoop"


    // $ANTLR start "ruleDoWhileLoop"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:308:1: ruleDoWhileLoop returns [EObject current=null] : (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
    public final EObject ruleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_block_1_0 = null;

        EObject lv_loopTest_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:311:28: ( (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:312:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:312:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:312:3: otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDoWhileLoop600); 

                	newLeafNode(otherlv_0, grammarAccess.getDoWhileLoopAccess().getDoKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:316:1: ( (lv_block_1_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:317:1: (lv_block_1_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:317:1: (lv_block_1_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:318:3: lv_block_1_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleDoWhileLoop621);
            lv_block_1_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_1_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDoWhileLoop633); 

                	newLeafNode(otherlv_2, grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2());
                
            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDoWhileLoop645); 

                	newLeafNode(otherlv_3, grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:342:1: ( (lv_loopTest_4_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:343:1: (lv_loopTest_4_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:343:1: (lv_loopTest_4_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:344:3: lv_loopTest_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDoWhileLoop666);
            lv_loopTest_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoWhileLoopRule());
            	        }
                   		set(
                   			current, 
                   			"loopTest",
                    		lv_loopTest_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDoWhileLoop678); 

                	newLeafNode(otherlv_5, grammarAccess.getDoWhileLoopAccess().getRightParenthesisSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleDoWhileLoop"


    // $ANTLR start "entryRuleIfStatement"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:372:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:373:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:374:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_entryRuleIfStatement714);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfStatement724); 

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:381:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ifCondition_2_0 = null;

        EObject lv_ifBlock_4_0 = null;

        EObject lv_elseIfConditions_7_0 = null;

        EObject lv_elseIfBlocks_9_0 = null;

        EObject lv_elseBlock_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:384:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:385:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:385:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:385:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIfStatement761); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIfStatement773); 

                	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:393:1: ( (lv_ifCondition_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:394:1: (lv_ifCondition_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:394:1: (lv_ifCondition_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:395:3: lv_ifCondition_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement794);
            lv_ifCondition_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	        }
                   		set(
                   			current, 
                   			"ifCondition",
                    		lv_ifCondition_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIfStatement806); 

                	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:415:1: ( (lv_ifBlock_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:416:1: (lv_ifBlock_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:416:1: (lv_ifBlock_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:417:3: lv_ifBlock_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement827);
            lv_ifBlock_4_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	        }
                   		set(
                   			current, 
                   			"ifBlock",
                    		lv_ifBlock_4_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:433:2: (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:433:4: otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleIfStatement840); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseifKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIfStatement852); 

            	        	newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_5_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:441:1: ( (lv_elseIfConditions_7_0= ruleExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:442:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:442:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:443:3: lv_elseIfConditions_7_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfConditionsExpressionParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement873);
            	    lv_elseIfConditions_7_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elseIfConditions",
            	            		lv_elseIfConditions_7_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIfStatement885); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_5_3());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:463:1: ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:464:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:464:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:465:3: lv_elseIfBlocks_9_0= ruleBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfBlocksBlockParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement906);
            	    lv_elseIfBlocks_9_0=ruleBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elseIfBlocks",
            	            		lv_elseIfBlocks_9_0, 
            	            		"Block");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:481:4: (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:481:6: otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) )
                    {
                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIfStatement921); 

                        	newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:485:1: ( (lv_elseBlock_11_0= ruleBlock ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:486:1: (lv_elseBlock_11_0= ruleBlock )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:486:1: (lv_elseBlock_11_0= ruleBlock )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:487:3: lv_elseBlock_11_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement942);
                    lv_elseBlock_11_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"elseBlock",
                            		lv_elseBlock_11_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleExpressionStartRule"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:511:1: entryRuleExpressionStartRule returns [EObject current=null] : iv_ruleExpressionStartRule= ruleExpressionStartRule EOF ;
    public final EObject entryRuleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStartRule = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:512:2: (iv_ruleExpressionStartRule= ruleExpressionStartRule EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:513:2: iv_ruleExpressionStartRule= ruleExpressionStartRule EOF
            {
             newCompositeNode(grammarAccess.getExpressionStartRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule980);
            iv_ruleExpressionStartRule=ruleExpressionStartRule();

            state._fsp--;

             current =iv_ruleExpressionStartRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionStartRule990); 

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
    // $ANTLR end "entryRuleExpressionStartRule"


    // $ANTLR start "ruleExpressionStartRule"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:520:1: ruleExpressionStartRule returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement ) ;
    public final EObject ruleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_ForLoop_1 = null;

        EObject this_WhileLoop_2 = null;

        EObject this_DoWhileLoop_3 = null;

        EObject this_IfStatement_4 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:523:28: ( (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:524:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:524:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:525:5: this_Assignment_0= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleExpressionStartRule1037);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:535:5: this_ForLoop_1= ruleForLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_ruleExpressionStartRule1064);
                    this_ForLoop_1=ruleForLoop();

                    state._fsp--;

                     
                            current = this_ForLoop_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:545:5: this_WhileLoop_2= ruleWhileLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1091);
                    this_WhileLoop_2=ruleWhileLoop();

                    state._fsp--;

                     
                            current = this_WhileLoop_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:555:5: this_DoWhileLoop_3= ruleDoWhileLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1118);
                    this_DoWhileLoop_3=ruleDoWhileLoop();

                    state._fsp--;

                     
                            current = this_DoWhileLoop_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:565:5: this_IfStatement_4= ruleIfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1145);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;

                     
                            current = this_IfStatement_4; 
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
    // $ANTLR end "ruleExpressionStartRule"


    // $ANTLR start "entryRuleAssignment"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:581:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:582:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:583:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment1180);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment1190); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:590:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_assignOperator_1_0 = null;

        EObject lv_assignExpression_2_0 = null;

        Enumerator lv_incrementDecrementOperator_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:593:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) otherlv_4= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:594:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) otherlv_4= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:594:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) otherlv_4= ';' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:594:2: ( (otherlv_0= RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) otherlv_4= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:594:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:595:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:595:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:596:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment1235); 

            		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getAttributeAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:607:2: ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=RULE_ID && LA5_1<=RULE_INT)||LA5_1==16||(LA5_1>=40 && LA5_1<=41)||LA5_1==51) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt5=1;
                }
                break;
            case 31:
            case 32:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:607:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:607:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:607:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:607:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:608:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:608:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:609:3: lv_assignOperator_1_0= ruleAssignOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleAssignment1258);
                    lv_assignOperator_1_0=ruleAssignOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"assignOperator",
                            		lv_assignOperator_1_0, 
                            		"AssignOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:625:2: ( (lv_assignExpression_2_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:626:1: (lv_assignExpression_2_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:626:1: (lv_assignExpression_2_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:627:3: lv_assignExpression_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getAssignExpressionExpressionParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment1279);
                    lv_assignExpression_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"assignExpression",
                            		lv_assignExpression_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:644:6: ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:644:6: ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:645:1: (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:645:1: (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:646:3: lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperator_in_ruleAssignment1307);
                    lv_incrementDecrementOperator_3_0=ruleIncrementDecrementOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"incrementDecrementOperator",
                            		lv_incrementDecrementOperator_3_0, 
                            		"IncrementDecrementOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAssignment1320); 

                	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleForLoopCountingExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:674:1: entryRuleForLoopCountingExpression returns [EObject current=null] : iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF ;
    public final EObject entryRuleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopCountingExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:675:2: (iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:676:2: iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF
            {
             newCompositeNode(grammarAccess.getForLoopCountingExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression1356);
            iv_ruleForLoopCountingExpression=ruleForLoopCountingExpression();

            state._fsp--;

             current =iv_ruleForLoopCountingExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoopCountingExpression1366); 

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
    // $ANTLR end "entryRuleForLoopCountingExpression"


    // $ANTLR start "ruleForLoopCountingExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:683:1: ruleForLoopCountingExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_incrementDecrementOperator_1_0 = null;

        Enumerator lv_assignOperator_2_0 = null;

        EObject lv_assignExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:686:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:687:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:687:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:687:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:687:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:688:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:688:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:689:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForLoopCountingExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleForLoopCountingExpression1411); 

            		newLeafNode(otherlv_0, grammarAccess.getForLoopCountingExpressionAccess().getAttributeAttributeCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:700:2: ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==18) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=RULE_ID && LA6_1<=RULE_INT)||LA6_1==16||(LA6_1>=40 && LA6_1<=41)||LA6_1==51) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 32:
                {
                alt6=1;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:700:3: ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:700:3: ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:701:1: (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:701:1: (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:702:3: lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperator_in_ruleForLoopCountingExpression1433);
                    lv_incrementDecrementOperator_1_0=ruleIncrementDecrementOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"incrementDecrementOperator",
                            		lv_incrementDecrementOperator_1_0, 
                            		"IncrementDecrementOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:719:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:719:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:719:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:719:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:720:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:720:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:721:3: lv_assignOperator_2_0= ruleAssignOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression1461);
                    lv_assignOperator_2_0=ruleAssignOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"assignOperator",
                            		lv_assignOperator_2_0, 
                            		"AssignOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:737:2: ( (lv_assignExpression_3_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:738:1: (lv_assignExpression_3_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:738:1: (lv_assignExpression_3_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:739:3: lv_assignExpression_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignExpressionExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoopCountingExpression1482);
                    lv_assignExpression_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"assignExpression",
                            		lv_assignExpression_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleForLoopCountingExpression"


    // $ANTLR start "entryRuleExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:763:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:764:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:765:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1520);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1530); 

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:772:1: ruleExpression returns [EObject current=null] : this_ArithmeticExpression_0= ruleArithmeticExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:775:28: (this_ArithmeticExpression_0= ruleArithmeticExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:777:5: this_ArithmeticExpression_0= ruleArithmeticExpression
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getArithmeticExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleExpression1576);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;

             
                    current = this_ArithmeticExpression_0; 
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


    // $ANTLR start "entryRuleArithmeticExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:793:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:794:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:795:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression1610);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArithmeticExpression1620); 

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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:802:1: ruleArithmeticExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:805:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:806:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:806:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:807:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1667);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:815:1: ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=40 && LA7_0<=44)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:815:2: () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:815:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:816:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:821:2: ( (lv_operator_2_0= ruleArithmeticOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:822:1: (lv_operator_2_0= ruleArithmeticOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:822:1: (lv_operator_2_0= ruleArithmeticOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:823:3: lv_operator_2_0= ruleArithmeticOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getOperatorArithmeticOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArithmeticOperator_in_ruleArithmeticExpression1697);
            	    lv_operator_2_0=ruleArithmeticOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"ArithmeticOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:839:2: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:840:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:840:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:841:3: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1718);
            	    lv_rightExpression_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArithmeticExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExpression",
            	            		lv_rightExpression_3_0, 
            	            		"ComparisonExpression");
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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:865:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:866:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:867:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1756);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression1766); 

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:874:1: ruleComparisonExpression returns [EObject current=null] : (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryLogicExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:877:28: ( (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:878:1: (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:878:1: (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:879:5: this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getBinaryLogicExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1813);
            this_BinaryLogicExpression_0=ruleBinaryLogicExpression();

            state._fsp--;

             
                    current = this_BinaryLogicExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:887:1: ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=45 && LA8_0<=50)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:887:2: ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:887:2: ( () ( (lv_operator_2_0= ruleComparingOperator ) ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:887:3: () ( (lv_operator_2_0= ruleComparingOperator ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:887:3: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:888:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:893:2: ( (lv_operator_2_0= ruleComparingOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:894:1: (lv_operator_2_0= ruleComparingOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:894:1: (lv_operator_2_0= ruleComparingOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:895:3: lv_operator_2_0= ruleComparingOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingOperatorEnumRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_ruleComparisonExpression1844);
            	    lv_operator_2_0=ruleComparingOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"ComparingOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:911:3: ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:912:1: (lv_rightExpression_3_0= ruleBinaryLogicExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:912:1: (lv_rightExpression_3_0= ruleBinaryLogicExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:913:3: lv_rightExpression_3_0= ruleBinaryLogicExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionBinaryLogicExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1866);
            	    lv_rightExpression_3_0=ruleBinaryLogicExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExpression",
            	            		lv_rightExpression_3_0, 
            	            		"BinaryLogicExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBinaryLogicExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:937:1: entryRuleBinaryLogicExpression returns [EObject current=null] : iv_ruleBinaryLogicExpression= ruleBinaryLogicExpression EOF ;
    public final EObject entryRuleBinaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryLogicExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:938:2: (iv_ruleBinaryLogicExpression= ruleBinaryLogicExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:939:2: iv_ruleBinaryLogicExpression= ruleBinaryLogicExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryLogicExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_entryRuleBinaryLogicExpression1904);
            iv_ruleBinaryLogicExpression=ruleBinaryLogicExpression();

            state._fsp--;

             current =iv_ruleBinaryLogicExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryLogicExpression1914); 

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
    // $ANTLR end "entryRuleBinaryLogicExpression"


    // $ANTLR start "ruleBinaryLogicExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:946:1: ruleBinaryLogicExpression returns [EObject current=null] : ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* ) ;
    public final EObject ruleBinaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject this_AttributeExpression_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_1 = null;

        EObject lv_rightExpression_4_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:949:28: ( ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:950:1: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:950:1: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:950:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )*
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:950:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=40 && LA9_0<=41)||LA9_0==51) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_INT)||LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:951:5: this_UnaryExpression_0= ruleUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getUnaryExpressionParserRuleCall_0_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1962);
                    this_UnaryExpression_0=ruleUnaryExpression();

                    state._fsp--;

                     
                            current = this_UnaryExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:961:5: this_AttributeExpression_1= ruleAttributeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getAttributeExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression1989);
                    this_AttributeExpression_1=ruleAttributeExpression();

                    state._fsp--;

                     
                            current = this_AttributeExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:969:2: ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=33 && LA11_0<=39)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:969:3: ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:969:3: ( () ( (lv_operator_3_0= ruleLogicOperator ) ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:969:4: () ( (lv_operator_3_0= ruleLogicOperator ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:969:4: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:970:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryLogicExpressionAccess().getBinaryLogicExpressionLeftExpressionAction_1_0_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:975:2: ( (lv_operator_3_0= ruleLogicOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:976:1: (lv_operator_3_0= ruleLogicOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:976:1: (lv_operator_3_0= ruleLogicOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:977:3: lv_operator_3_0= ruleLogicOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicOperator_in_ruleBinaryLogicExpression2021);
            	    lv_operator_3_0=ruleLogicOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryLogicExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_3_0, 
            	            		"LogicOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:993:3: ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:994:1: ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:994:1: ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:995:1: (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:995:1: (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>=40 && LA10_0<=41)||LA10_0==51) ) {
            	        alt10=1;
            	    }
            	    else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==16) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:996:3: lv_rightExpression_4_1= ruleUnaryExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_1_0_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression2045);
            	            lv_rightExpression_4_1=ruleUnaryExpression();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBinaryLogicExpressionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"rightExpression",
            	                    		lv_rightExpression_4_1, 
            	                    		"UnaryExpression");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1011:8: lv_rightExpression_4_2= ruleAttributeExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAttributeExpressionParserRuleCall_1_1_0_1()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression2064);
            	            lv_rightExpression_4_2=ruleAttributeExpression();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBinaryLogicExpressionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"rightExpression",
            	                    		lv_rightExpression_4_2, 
            	                    		"AttributeExpression");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

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
    // $ANTLR end "ruleBinaryLogicExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1037:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1038:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1039:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2105);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression2115); 

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1046:1: ruleUnaryExpression returns [EObject current=null] : ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unaryOperator_1_0 = null;

        EObject lv_unaryExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1049:28: ( ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1050:1: ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1050:1: ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1050:2: () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1050:2: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1051:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1056:2: ( (lv_unaryOperator_1_0= ruleUnaryOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1057:1: (lv_unaryOperator_1_0= ruleUnaryOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1057:1: (lv_unaryOperator_1_0= ruleUnaryOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1058:3: lv_unaryOperator_1_0= ruleUnaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression2170);
            lv_unaryOperator_1_0=ruleUnaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"unaryOperator",
                    		lv_unaryOperator_1_0, 
                    		"UnaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1074:2: ( (lv_unaryExpression_2_0= ruleAttributeExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1075:1: (lv_unaryExpression_2_0= ruleAttributeExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1075:1: (lv_unaryExpression_2_0= ruleAttributeExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1076:3: lv_unaryExpression_2_0= ruleAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAttributeExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_ruleUnaryExpression2191);
            lv_unaryExpression_2_0=ruleAttributeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"unaryExpression",
                    		lv_unaryExpression_2_0, 
                    		"AttributeExpression");
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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleAttributeExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1100:1: entryRuleAttributeExpression returns [EObject current=null] : iv_ruleAttributeExpression= ruleAttributeExpression EOF ;
    public final EObject entryRuleAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1101:2: (iv_ruleAttributeExpression= ruleAttributeExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1102:2: iv_ruleAttributeExpression= ruleAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getAttributeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_entryRuleAttributeExpression2227);
            iv_ruleAttributeExpression=ruleAttributeExpression();

            state._fsp--;

             current =iv_ruleAttributeExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeExpression2237); 

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
    // $ANTLR end "entryRuleAttributeExpression"


    // $ANTLR start "ruleAttributeExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1109:1: ruleAttributeExpression returns [EObject current=null] : (this_OperationCall_0= ruleOperationCall | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OperationCall_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1112:28: ( (this_OperationCall_0= ruleOperationCall | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1113:1: (this_OperationCall_0= ruleOperationCall | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1113:1: (this_OperationCall_0= ruleOperationCall | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_NUMBER && LA12_0<=RULE_INT)||LA12_0==16) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==EOF||(LA12_2>=17 && LA12_2<=18)||LA12_2==21||(LA12_2>=33 && LA12_2<=50)) ) {
                    alt12=2;
                }
                else if ( (LA12_2==16) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1114:5: this_OperationCall_0= ruleOperationCall
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeExpressionAccess().getOperationCallParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_ruleAttributeExpression2284);
                    this_OperationCall_0=ruleOperationCall();

                    state._fsp--;

                     
                            current = this_OperationCall_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1123:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1123:6: ( () ( (otherlv_2= RULE_ID ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1123:7: () ( (otherlv_2= RULE_ID ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1123:7: ()
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1124:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttributeExpressionAccess().getAttributeExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1129:2: ( (otherlv_2= RULE_ID ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1130:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1130:1: (otherlv_2= RULE_ID )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1131:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeExpressionRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeExpression2319); 

                    		newLeafNode(otherlv_2, grammarAccess.getAttributeExpressionAccess().getAttributeAttributeCrossReference_1_1_0()); 
                    	

                    }


                    }


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
    // $ANTLR end "ruleAttributeExpression"


    // $ANTLR start "entryRuleOperationCall"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1150:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1151:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1152:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
             newCompositeNode(grammarAccess.getOperationCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_entryRuleOperationCall2356);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;

             current =iv_ruleOperationCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperationCall2366); 

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
    // $ANTLR end "entryRuleOperationCall"


    // $ANTLR start "ruleOperationCall"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1159:1: ruleOperationCall returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ) ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_LiteralExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1162:28: ( (this_LiteralExpression_0= ruleLiteralExpression | ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1163:1: (this_LiteralExpression_0= ruleLiteralExpression | ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1163:1: (this_LiteralExpression_0= ruleLiteralExpression | ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_NUMBER && LA13_0<=RULE_INT)||LA13_0==16) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1164:5: this_LiteralExpression_0= ruleLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperationCallAccess().getLiteralExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_ruleOperationCall2413);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;

                     
                            current = this_LiteralExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1173:6: ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1173:6: ( () ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1173:7: () ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')'
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1173:7: ()
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1174:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOperationCallAccess().getOperationCallAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1179:2: ( (otherlv_2= RULE_ID ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1180:1: (otherlv_2= RULE_ID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1180:1: (otherlv_2= RULE_ID )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1181:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationCallRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperationCall2448); 

                    		newLeafNode(otherlv_2, grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_1_1_0()); 
                    	

                    }


                    }

                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOperationCall2460); 

                        	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1_2());
                        
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOperationCall2472); 

                        	newLeafNode(otherlv_4, grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_1_3());
                        

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
    // $ANTLR end "ruleOperationCall"


    // $ANTLR start "entryRuleLiteralExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1208:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1209:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1210:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2509);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralExpression2519); 

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1217:1: ruleLiteralExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1220:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1221:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1221:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_NUMBER && LA14_0<=RULE_INT)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1221:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1221:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1221:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralExpression2557); 

                        	newLeafNode(otherlv_0, grammarAccess.getLiteralExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getLiteralExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLiteralExpression2579);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLiteralExpression2590); 

                        	newLeafNode(otherlv_2, grammarAccess.getLiteralExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1239:6: ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1239:6: ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1239:7: () ( (lv_value_4_0= ruleIdentifierOrValue ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1239:7: ()
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1240:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1245:2: ( (lv_value_4_0= ruleIdentifierOrValue ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1246:1: (lv_value_4_0= ruleIdentifierOrValue )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1246:1: (lv_value_4_0= ruleIdentifierOrValue )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1247:3: lv_value_4_0= ruleIdentifierOrValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getValueIdentifierOrValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifierOrValue_in_ruleLiteralExpression2628);
                    lv_value_4_0=ruleIdentifierOrValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"IdentifierOrValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleIdentifierOrValue"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1271:1: entryRuleIdentifierOrValue returns [String current=null] : iv_ruleIdentifierOrValue= ruleIdentifierOrValue EOF ;
    public final String entryRuleIdentifierOrValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifierOrValue = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1272:2: (iv_ruleIdentifierOrValue= ruleIdentifierOrValue EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1273:2: iv_ruleIdentifierOrValue= ruleIdentifierOrValue EOF
            {
             newCompositeNode(grammarAccess.getIdentifierOrValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifierOrValue_in_entryRuleIdentifierOrValue2666);
            iv_ruleIdentifierOrValue=ruleIdentifierOrValue();

            state._fsp--;

             current =iv_ruleIdentifierOrValue.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifierOrValue2677); 

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
    // $ANTLR end "entryRuleIdentifierOrValue"


    // $ANTLR start "ruleIdentifierOrValue"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1280:1: ruleIdentifierOrValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleIdentifierOrValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUMBER_0=null;
        Token this_BOOLEAN_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1283:28: ( (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1284:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1284:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt15=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt15=2;
                }
                break;
            case RULE_INT:
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
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1284:6: this_NUMBER_0= RULE_NUMBER
                    {
                    this_NUMBER_0=(Token)match(input,RULE_NUMBER,FollowSets000.FOLLOW_RULE_NUMBER_in_ruleIdentifierOrValue2717); 

                    		current.merge(this_NUMBER_0);
                        
                     
                        newLeafNode(this_NUMBER_0, grammarAccess.getIdentifierOrValueAccess().getNUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1292:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleIdentifierOrValue2743); 

                    		current.merge(this_BOOLEAN_1);
                        
                     
                        newLeafNode(this_BOOLEAN_1, grammarAccess.getIdentifierOrValueAccess().getBOOLEANTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1300:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIdentifierOrValue2769); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getIdentifierOrValueAccess().getINTTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleIdentifierOrValue"


    // $ANTLR start "ruleAssignOperator"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1315:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= ':=' ) | (enumLiteral_2= '+=' ) | (enumLiteral_3= '=+' ) | (enumLiteral_4= '-=' ) | (enumLiteral_5= '=-' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1317:28: ( ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= ':=' ) | (enumLiteral_2= '+=' ) | (enumLiteral_3= '=+' ) | (enumLiteral_4= '-=' ) | (enumLiteral_5= '=-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1318:1: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= ':=' ) | (enumLiteral_2= '+=' ) | (enumLiteral_3= '=+' ) | (enumLiteral_4= '-=' ) | (enumLiteral_5= '=-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1318:1: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= ':=' ) | (enumLiteral_2= '+=' ) | (enumLiteral_3= '=+' ) | (enumLiteral_4= '-=' ) | (enumLiteral_5= '=-' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            case 28:
                {
                alt16=4;
                }
                break;
            case 29:
                {
                alt16=5;
                }
                break;
            case 30:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1318:2: (enumLiteral_0= 'UNSET' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1318:2: (enumLiteral_0= 'UNSET' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1318:4: enumLiteral_0= 'UNSET'
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAssignOperator2828); 

                            current = grammarAccess.getAssignOperatorAccess().getUNSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getUNSETEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1324:6: (enumLiteral_1= ':=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1324:6: (enumLiteral_1= ':=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1324:8: enumLiteral_1= ':='
                    {
                    enumLiteral_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAssignOperator2845); 

                            current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1330:6: (enumLiteral_2= '+=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1330:6: (enumLiteral_2= '+=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1330:8: enumLiteral_2= '+='
                    {
                    enumLiteral_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAssignOperator2862); 

                            current = grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1336:6: (enumLiteral_3= '=+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1336:6: (enumLiteral_3= '=+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1336:8: enumLiteral_3= '=+'
                    {
                    enumLiteral_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAssignOperator2879); 

                            current = grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1342:6: (enumLiteral_4= '-=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1342:6: (enumLiteral_4= '-=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1342:8: enumLiteral_4= '-='
                    {
                    enumLiteral_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAssignOperator2896); 

                            current = grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1348:6: (enumLiteral_5= '=-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1348:6: (enumLiteral_5= '=-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1348:8: enumLiteral_5= '=-'
                    {
                    enumLiteral_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAssignOperator2913); 

                            current = grammarAccess.getAssignOperatorAccess().getEQUAL_MINUSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAssignOperatorAccess().getEQUAL_MINUSEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "ruleIncrementDecrementOperator"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1358:1: ruleIncrementDecrementOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '++' ) | (enumLiteral_2= '--' ) ) ;
    public final Enumerator ruleIncrementDecrementOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1360:28: ( ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '++' ) | (enumLiteral_2= '--' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1361:1: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '++' ) | (enumLiteral_2= '--' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1361:1: ( (enumLiteral_0= 'UNSET' ) | (enumLiteral_1= '++' ) | (enumLiteral_2= '--' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
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
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1361:2: (enumLiteral_0= 'UNSET' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1361:2: (enumLiteral_0= 'UNSET' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1361:4: enumLiteral_0= 'UNSET'
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIncrementDecrementOperator2958); 

                            current = grammarAccess.getIncrementDecrementOperatorAccess().getUNSETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIncrementDecrementOperatorAccess().getUNSETEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1367:6: (enumLiteral_1= '++' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1367:6: (enumLiteral_1= '++' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1367:8: enumLiteral_1= '++'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleIncrementDecrementOperator2975); 

                            current = grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1373:6: (enumLiteral_2= '--' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1373:6: (enumLiteral_2= '--' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1373:8: enumLiteral_2= '--'
                    {
                    enumLiteral_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleIncrementDecrementOperator2992); 

                            current = grammarAccess.getIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleIncrementDecrementOperator"


    // $ANTLR start "ruleLogicOperator"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1383:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '&&' ) | (enumLiteral_2= '|' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= 'xor' ) | (enumLiteral_5= '=>' ) | (enumLiteral_6= '<=>' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1385:28: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '&&' ) | (enumLiteral_2= '|' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= 'xor' ) | (enumLiteral_5= '=>' ) | (enumLiteral_6= '<=>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1386:1: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '&&' ) | (enumLiteral_2= '|' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= 'xor' ) | (enumLiteral_5= '=>' ) | (enumLiteral_6= '<=>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1386:1: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '&&' ) | (enumLiteral_2= '|' ) | (enumLiteral_3= '||' ) | (enumLiteral_4= 'xor' ) | (enumLiteral_5= '=>' ) | (enumLiteral_6= '<=>' ) )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            case 36:
                {
                alt18=4;
                }
                break;
            case 37:
                {
                alt18=5;
                }
                break;
            case 38:
                {
                alt18=6;
                }
                break;
            case 39:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1386:2: (enumLiteral_0= '&' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1386:2: (enumLiteral_0= '&' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1386:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleLogicOperator3037); 

                            current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1392:6: (enumLiteral_1= '&&' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1392:6: (enumLiteral_1= '&&' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1392:8: enumLiteral_1= '&&'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLogicOperator3054); 

                            current = grammarAccess.getLogicOperatorAccess().getAND_ANDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLogicOperatorAccess().getAND_ANDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1398:6: (enumLiteral_2= '|' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1398:6: (enumLiteral_2= '|' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1398:8: enumLiteral_2= '|'
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleLogicOperator3071); 

                            current = grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1404:6: (enumLiteral_3= '||' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1404:6: (enumLiteral_3= '||' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1404:8: enumLiteral_3= '||'
                    {
                    enumLiteral_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleLogicOperator3088); 

                            current = grammarAccess.getLogicOperatorAccess().getOR_OREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLogicOperatorAccess().getOR_OREnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1410:6: (enumLiteral_4= 'xor' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1410:6: (enumLiteral_4= 'xor' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1410:8: enumLiteral_4= 'xor'
                    {
                    enumLiteral_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleLogicOperator3105); 

                            current = grammarAccess.getLogicOperatorAccess().getXOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLogicOperatorAccess().getXOREnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1416:6: (enumLiteral_5= '=>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1416:6: (enumLiteral_5= '=>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1416:8: enumLiteral_5= '=>'
                    {
                    enumLiteral_5=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLogicOperator3122); 

                            current = grammarAccess.getLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1422:6: (enumLiteral_6= '<=>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1422:6: (enumLiteral_6= '<=>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1422:8: enumLiteral_6= '<=>'
                    {
                    enumLiteral_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleLogicOperator3139); 

                            current = grammarAccess.getLogicOperatorAccess().getEQUIVALENTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getLogicOperatorAccess().getEQUIVALENTEnumLiteralDeclaration_6()); 
                        

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
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleArithmeticOperator"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1432:1: ruleArithmeticOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '%' ) ) ;
    public final Enumerator ruleArithmeticOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1434:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '%' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1435:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '%' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1435:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) | (enumLiteral_4= '%' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            case 43:
                {
                alt19=4;
                }
                break;
            case 44:
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
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1435:2: (enumLiteral_0= '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1435:2: (enumLiteral_0= '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1435:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleArithmeticOperator3184); 

                            current = grammarAccess.getArithmeticOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArithmeticOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1441:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1441:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1441:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleArithmeticOperator3201); 

                            current = grammarAccess.getArithmeticOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArithmeticOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1447:6: (enumLiteral_2= '*' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1447:6: (enumLiteral_2= '*' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1447:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleArithmeticOperator3218); 

                            current = grammarAccess.getArithmeticOperatorAccess().getTIMESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArithmeticOperatorAccess().getTIMESEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1453:6: (enumLiteral_3= '/' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1453:6: (enumLiteral_3= '/' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1453:8: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleArithmeticOperator3235); 

                            current = grammarAccess.getArithmeticOperatorAccess().getDIVIDEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getArithmeticOperatorAccess().getDIVIDEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1459:6: (enumLiteral_4= '%' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1459:6: (enumLiteral_4= '%' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1459:8: enumLiteral_4= '%'
                    {
                    enumLiteral_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleArithmeticOperator3252); 

                            current = grammarAccess.getArithmeticOperatorAccess().getMODULOEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getArithmeticOperatorAccess().getMODULOEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleArithmeticOperator"


    // $ANTLR start "ruleComparingOperator"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1469:1: ruleComparingOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<>' ) ) ;
    public final Enumerator ruleComparingOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1471:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1472:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1472:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '<>' ) )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt20=1;
                }
                break;
            case 46:
                {
                alt20=2;
                }
                break;
            case 47:
                {
                alt20=3;
                }
                break;
            case 48:
                {
                alt20=4;
                }
                break;
            case 49:
                {
                alt20=5;
                }
                break;
            case 50:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1472:2: (enumLiteral_0= '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1472:2: (enumLiteral_0= '<' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1472:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleComparingOperator3297); 

                            current = grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1478:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1478:6: (enumLiteral_1= '<=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1478:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleComparingOperator3314); 

                            current = grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1484:6: (enumLiteral_2= '==' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1484:6: (enumLiteral_2= '==' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1484:8: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleComparingOperator3331); 

                            current = grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1490:6: (enumLiteral_3= '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1490:6: (enumLiteral_3= '>=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1490:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleComparingOperator3348); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1496:6: (enumLiteral_4= '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1496:6: (enumLiteral_4= '>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1496:8: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleComparingOperator3365); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1502:6: (enumLiteral_5= '<>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1502:6: (enumLiteral_5= '<>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1502:8: enumLiteral_5= '<>'
                    {
                    enumLiteral_5=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleComparingOperator3382); 

                            current = grammarAccess.getComparingOperatorAccess().getUNEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getComparingOperatorAccess().getUNEQUALEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleComparingOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1512:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '+' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1514:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '+' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1515:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '+' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1515:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '+' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 40:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1515:2: (enumLiteral_0= 'not' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1515:2: (enumLiteral_0= 'not' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1515:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleUnaryOperator3427); 

                            current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1521:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1521:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1521:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleUnaryOperator3444); 

                            current = grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1527:6: (enumLiteral_2= '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1527:6: (enumLiteral_2= '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1527:8: enumLiteral_2= '+'
                    {
                    enumLiteral_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleUnaryOperator3461); 

                            current = grammarAccess.getUnaryOperatorAccess().getPLUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getPLUSEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleUnaryOperator"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleBlock131 = new BitSet(new long[]{0x000000000058C010L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_ruleBlock152 = new BitSet(new long[]{0x000000000058C010L});
        public static final BitSet FOLLOW_14_in_ruleBlock165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_entryRuleForLoop201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoop211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleForLoop248 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleForLoop260 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleForLoop281 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoop302 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleForLoop314 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop335 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleForLoop347 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleForLoop368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoop414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleWhileLoop451 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleWhileLoop463 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWhileLoop484 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWhileLoop496 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleWhileLoop517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop553 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileLoop563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleDoWhileLoop600 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleDoWhileLoop621 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDoWhileLoop633 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDoWhileLoop645 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDoWhileLoop666 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleDoWhileLoop678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement714 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleIfStatement761 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIfStatement773 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement794 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfStatement806 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement827 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleIfStatement840 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIfStatement852 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement873 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfStatement885 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement906 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_24_in_ruleIfStatement921 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStartRule990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleExpressionStartRule1037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_ruleExpressionStartRule1064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1235 = new BitSet(new long[]{0x00000001FE000000L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleAssignment1258 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1279 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperator_in_ruleAssignment1307 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAssignment1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression1356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoopCountingExpression1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForLoopCountingExpression1411 = new BitSet(new long[]{0x00000001FE000000L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperator_in_ruleForLoopCountingExpression1433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression1461 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopCountingExpression1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1520 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleExpression1576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression1610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1667 = new BitSet(new long[]{0x00001F0000000002L});
        public static final BitSet FOLLOW_ruleArithmeticOperator_in_ruleArithmeticExpression1697 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1718 = new BitSet(new long[]{0x00001F0000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1756 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression1766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1813 = new BitSet(new long[]{0x0007E00000000002L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_ruleComparisonExpression1844 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1866 = new BitSet(new long[]{0x0007E00000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_entryRuleBinaryLogicExpression1904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryLogicExpression1914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1962 = new BitSet(new long[]{0x000000FE00000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression1989 = new BitSet(new long[]{0x000000FE00000002L});
        public static final BitSet FOLLOW_ruleLogicOperator_in_ruleBinaryLogicExpression2021 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression2045 = new BitSet(new long[]{0x000000FE00000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression2064 = new BitSet(new long[]{0x000000FE00000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression2170 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_ruleUnaryExpression2191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_entryRuleAttributeExpression2227 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeExpression2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_ruleAttributeExpression2284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeExpression2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_entryRuleOperationCall2356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationCall2366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleOperationCall2413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperationCall2448 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOperationCall2460 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOperationCall2472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleLiteralExpression2557 = new BitSet(new long[]{0x00080300000100F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLiteralExpression2579 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLiteralExpression2590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifierOrValue_in_ruleLiteralExpression2628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifierOrValue_in_entryRuleIdentifierOrValue2666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierOrValue2677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifierOrValue2717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleIdentifierOrValue2743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIdentifierOrValue2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleAssignOperator2828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAssignOperator2845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAssignOperator2862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAssignOperator2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAssignOperator2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAssignOperator2913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleIncrementDecrementOperator2958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleIncrementDecrementOperator2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleIncrementDecrementOperator2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleLogicOperator3037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleLogicOperator3054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleLogicOperator3071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleLogicOperator3088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleLogicOperator3105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLogicOperator3122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleLogicOperator3139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleArithmeticOperator3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleArithmeticOperator3201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleArithmeticOperator3218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleArithmeticOperator3235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleArithmeticOperator3252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleComparingOperator3297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleComparingOperator3314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleComparingOperator3331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleComparingOperator3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleComparingOperator3365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleComparingOperator3382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleUnaryOperator3427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleUnaryOperator3444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleUnaryOperator3461 = new BitSet(new long[]{0x0000000000000002L});
    }


}