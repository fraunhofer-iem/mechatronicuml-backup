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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'for'", "'('", "';'", "')'", "'while'", "'do'", "');'", "'if'", "'elseif'", "'else'", "'return'", "':='", "'.'", "'['", "']'", "','", "'++'", "'--'", "'+='", "'=+'", "'-='", "'=-'", "'||'", "'&&'", "'=='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'not'", "'self'", "'first'", "'last'", "'prev'", "'next'"
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
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
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
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g"; }



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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:68:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:72:2: (iv_ruleBlock= ruleBlock EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:73:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock81);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlock91); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:83:1: ruleBlock returns [EObject current=null] : ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) | ( (lv_expressions_4_0= ruleExpression ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:87:28: ( ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) | ( (lv_expressions_4_0= ruleExpression ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:88:1: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) | ( (lv_expressions_4_0= ruleExpression ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:88:1: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' ) | ( (lv_expressions_4_0= ruleExpression ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||LA2_0==16||(LA2_0>=45 && LA2_0<=46)||(LA2_0>=49 && LA2_0<=54)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:88:2: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:88:2: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:88:3: () otherlv_1= '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* otherlv_3= '}'
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:88:3: ()
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:89:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBlockAccess().getBlockAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleBlock142); 

                        	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:98:1: ( (lv_expressions_2_0= ruleExpressionStartRule ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID||LA1_0==15||(LA1_0>=19 && LA1_0<=20)||LA1_0==22||LA1_0==25) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:99:1: (lv_expressions_2_0= ruleExpressionStartRule )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:99:1: (lv_expressions_2_0= ruleExpressionStartRule )
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:100:3: lv_expressions_2_0= ruleExpressionStartRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_ruleBlock163);
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

                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBlock176); 

                        	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:121:6: ( (lv_expressions_4_0= ruleExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:121:6: ( (lv_expressions_4_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:122:1: (lv_expressions_4_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:122:1: (lv_expressions_4_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:123:3: lv_expressions_4_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBlock204);
                    lv_expressions_4_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		add(
                           			current, 
                           			"expressions",
                            		lv_expressions_4_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleForLoop"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:150:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:151:2: (iv_ruleForLoop= ruleForLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:152:2: iv_ruleForLoop= ruleForLoop EOF
            {
             newCompositeNode(grammarAccess.getForLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_entryRuleForLoop244);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoop254); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:159:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_initializeExpression_2_0 = null;

        EObject lv_loopTest_3_0 = null;

        EObject lv_countingExpression_5_0 = null;

        EObject lv_block_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:162:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:163:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:163:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:163:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initializeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) otherlv_4= ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) otherlv_6= ')' ( (lv_block_7_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleForLoop291); 

                	newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleForLoop303); 

                	newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:171:1: ( (lv_initializeExpression_2_0= ruleAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:172:1: (lv_initializeExpression_2_0= ruleAssignment )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:172:1: (lv_initializeExpression_2_0= ruleAssignment )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:173:3: lv_initializeExpression_2_0= ruleAssignment
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getInitializeExpressionAssignmentParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleForLoop324);
            lv_initializeExpression_2_0=ruleAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopRule());
            	        }
                   		set(
                   			current, 
                   			"initializeExpression",
                    		lv_initializeExpression_2_0, 
                    		"Assignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:189:2: ( (lv_loopTest_3_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:190:1: (lv_loopTest_3_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:190:1: (lv_loopTest_3_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:191:3: lv_loopTest_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoop345);
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

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleForLoop357); 

                	newLeafNode(otherlv_4, grammarAccess.getForLoopAccess().getSemicolonKeyword_4());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:211:1: ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:212:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:212:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:213:3: lv_countingExpression_5_0= ruleForLoopCountingExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop378);
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

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleForLoop390); 

                	newLeafNode(otherlv_6, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:233:1: ( (lv_block_7_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:234:1: (lv_block_7_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:234:1: (lv_block_7_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:235:3: lv_block_7_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleForLoop411);
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


    // $ANTLR start "entryRuleForLoopCountingExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:259:1: entryRuleForLoopCountingExpression returns [EObject current=null] : iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF ;
    public final EObject entryRuleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopCountingExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:260:2: (iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:261:2: iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF
            {
             newCompositeNode(grammarAccess.getForLoopCountingExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression447);
            iv_ruleForLoopCountingExpression=ruleForLoopCountingExpression();

            state._fsp--;

             current =iv_ruleForLoopCountingExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoopCountingExpression457); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:268:1: ruleForLoopCountingExpression returns [EObject current=null] : ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_typedNamedElementExpression_0_0 = null;

        Enumerator lv_incrementDecrementOperator_1_0 = null;

        Enumerator lv_assignOperator_2_0 = null;

        EObject lv_rhs_assignExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:271:28: ( ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:272:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:272:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:272:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:272:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:273:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:273:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:274:3: lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression
            {
             
            	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_ruleForLoopCountingExpression503);
            lv_lhs_typedNamedElementExpression_0_0=ruleTypedNamedElementExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"lhs_typedNamedElementExpression",
                    		lv_lhs_typedNamedElementExpression_0_0, 
                    		"TypedNamedElementExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:290:2: ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=31 && LA3_0<=32)) ) {
                alt3=1;
            }
            else if ( (LA3_0==26||(LA3_0>=33 && LA3_0<=36)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:290:3: ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:290:3: ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:291:1: (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:291:1: (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:292:3: lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperator_in_ruleForLoopCountingExpression525);
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
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:309:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:309:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:309:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_3_0= ruleExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:309:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:310:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:310:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:311:3: lv_assignOperator_2_0= ruleAssignOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression553);
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

                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:327:2: ( (lv_rhs_assignExpression_3_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:328:1: (lv_rhs_assignExpression_3_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:328:1: (lv_rhs_assignExpression_3_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:329:3: lv_rhs_assignExpression_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoopCountingExpression574);
                    lv_rhs_assignExpression_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForLoopCountingExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs_assignExpression",
                            		lv_rhs_assignExpression_3_0, 
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


    // $ANTLR start "entryRuleWhileLoop"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:353:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:354:2: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:355:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop612);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhileLoop622); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:362:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_loopTest_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:365:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:366:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:366:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:366:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_loopTest_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleWhileLoop659); 

                	newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWhileLoop671); 

                	newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:374:1: ( (lv_loopTest_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:375:1: (lv_loopTest_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:375:1: (lv_loopTest_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:376:3: lv_loopTest_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWhileLoop692);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWhileLoop704); 

                	newLeafNode(otherlv_3, grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:396:1: ( (lv_block_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:397:1: (lv_block_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:397:1: (lv_block_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:398:3: lv_block_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleWhileLoop725);
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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:422:1: entryRuleDoWhileLoop returns [EObject current=null] : iv_ruleDoWhileLoop= ruleDoWhileLoop EOF ;
    public final EObject entryRuleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:423:2: (iv_ruleDoWhileLoop= ruleDoWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:424:2: iv_ruleDoWhileLoop= ruleDoWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getDoWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop761);
            iv_ruleDoWhileLoop=ruleDoWhileLoop();

            state._fsp--;

             current =iv_ruleDoWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoWhileLoop771); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:431:1: ruleDoWhileLoop returns [EObject current=null] : (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) ;
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
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:434:28: ( (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:435:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:435:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');' )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:435:3: otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_loopTest_4_0= ruleExpression ) ) otherlv_5= ');'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDoWhileLoop808); 

                	newLeafNode(otherlv_0, grammarAccess.getDoWhileLoopAccess().getDoKeyword_0());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:439:1: ( (lv_block_1_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:440:1: (lv_block_1_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:440:1: (lv_block_1_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:441:3: lv_block_1_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleDoWhileLoop829);
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

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDoWhileLoop841); 

                	newLeafNode(otherlv_2, grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2());
                
            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDoWhileLoop853); 

                	newLeafNode(otherlv_3, grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:465:1: ( (lv_loopTest_4_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:466:1: (lv_loopTest_4_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:466:1: (lv_loopTest_4_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:467:3: lv_loopTest_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDoWhileLoop874);
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

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDoWhileLoop886); 

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:495:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:496:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:497:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_entryRuleIfStatement922);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfStatement932); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:504:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) ;
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
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:507:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:508:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:508:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:508:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_ifBlock_4_0= ruleBlock ) ) (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIfStatement969); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIfStatement981); 

                	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:516:1: ( (lv_ifCondition_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:517:1: (lv_ifCondition_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:517:1: (lv_ifCondition_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:518:3: lv_ifCondition_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement1002);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIfStatement1014); 

                	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:538:1: ( (lv_ifBlock_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:539:1: (lv_ifBlock_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:539:1: (lv_ifBlock_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:540:3: lv_ifBlock_4_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement1035);
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

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:556:2: (otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:556:4: otherlv_5= 'elseif' otherlv_6= '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) otherlv_8= ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleIfStatement1048); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseifKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIfStatement1060); 

            	        	newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_5_1());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:564:1: ( (lv_elseIfConditions_7_0= ruleExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:565:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:565:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:566:3: lv_elseIfConditions_7_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfConditionsExpressionParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement1081);
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

            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIfStatement1093); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_5_3());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:586:1: ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:587:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:587:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:588:3: lv_elseIfBlocks_9_0= ruleBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfBlocksBlockParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement1114);
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
            	    break loop4;
                }
            } while (true);

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:604:4: (otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:604:6: otherlv_10= 'else' ( (lv_elseBlock_11_0= ruleBlock ) )
                    {
                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIfStatement1129); 

                        	newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getElseKeyword_6_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:608:1: ( (lv_elseBlock_11_0= ruleBlock ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:609:1: (lv_elseBlock_11_0= ruleBlock )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:609:1: (lv_elseBlock_11_0= ruleBlock )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:610:3: lv_elseBlock_11_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement1150);
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


    // $ANTLR start "entryRuleReturnStatement"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:634:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:635:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:636:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
             newCompositeNode(grammarAccess.getReturnStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement1188);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;

             current =iv_ruleReturnStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReturnStatement1198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:643:1: ruleReturnStatement returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:646:28: ( ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:647:1: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:647:1: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:647:2: () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:647:2: ()
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:648:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReturnStatementAccess().getReturnStatementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleReturnStatement1244); 

                	newLeafNode(otherlv_1, grammarAccess.getReturnStatementAccess().getReturnKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:657:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:658:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:658:1: (lv_expression_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:659:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleReturnStatement1265);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReturnStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleReturnStatement1277); 

                	newLeafNode(otherlv_3, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleOperationCallStatement"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:687:1: entryRuleOperationCallStatement returns [EObject current=null] : iv_ruleOperationCallStatement= ruleOperationCallStatement EOF ;
    public final EObject entryRuleOperationCallStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCallStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:688:2: (iv_ruleOperationCallStatement= ruleOperationCallStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:689:2: iv_ruleOperationCallStatement= ruleOperationCallStatement EOF
            {
             newCompositeNode(grammarAccess.getOperationCallStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperationCallStatement_in_entryRuleOperationCallStatement1313);
            iv_ruleOperationCallStatement=ruleOperationCallStatement();

            state._fsp--;

             current =iv_ruleOperationCallStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperationCallStatement1323); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationCallStatement"


    // $ANTLR start "ruleOperationCallStatement"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:696:1: ruleOperationCallStatement returns [EObject current=null] : (this_OperationCall_0= ruleOperationCall otherlv_1= ';' ) ;
    public final EObject ruleOperationCallStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_OperationCall_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:699:28: ( (this_OperationCall_0= ruleOperationCall otherlv_1= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:700:1: (this_OperationCall_0= ruleOperationCall otherlv_1= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:700:1: (this_OperationCall_0= ruleOperationCall otherlv_1= ';' )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:701:5: this_OperationCall_0= ruleOperationCall otherlv_1= ';'
            {
             
                    newCompositeNode(grammarAccess.getOperationCallStatementAccess().getOperationCallParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_ruleOperationCallStatement1370);
            this_OperationCall_0=ruleOperationCall();

            state._fsp--;

             
                    current = this_OperationCall_0; 
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOperationCallStatement1381); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationCallStatementAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleOperationCallStatement"


    // $ANTLR start "entryRuleExpressionStartRule"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:721:1: entryRuleExpressionStartRule returns [EObject current=null] : iv_ruleExpressionStartRule= ruleExpressionStartRule EOF ;
    public final EObject entryRuleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStartRule = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:722:2: (iv_ruleExpressionStartRule= ruleExpressionStartRule EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:723:2: iv_ruleExpressionStartRule= ruleExpressionStartRule EOF
            {
             newCompositeNode(grammarAccess.getExpressionStartRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule1417);
            iv_ruleExpressionStartRule=ruleExpressionStartRule();

            state._fsp--;

             current =iv_ruleExpressionStartRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionStartRule1427); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:730:1: ruleExpressionStartRule returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableDeclarationStatement_6= ruleLocalVariableDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement ) ;
    public final EObject ruleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_ForLoop_1 = null;

        EObject this_WhileLoop_2 = null;

        EObject this_DoWhileLoop_3 = null;

        EObject this_IfStatement_4 = null;

        EObject this_ReturnStatement_5 = null;

        EObject this_LocalVariableDeclarationStatement_6 = null;

        EObject this_OperationCallStatement_7 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:733:28: ( (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableDeclarationStatement_6= ruleLocalVariableDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:734:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableDeclarationStatement_6= ruleLocalVariableDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:734:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableDeclarationStatement_6= ruleLocalVariableDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement )
            int alt6=8;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:735:5: this_Assignment_0= ruleAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleExpressionStartRule1474);
                    this_Assignment_0=ruleAssignment();

                    state._fsp--;

                     
                            current = this_Assignment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:745:5: this_ForLoop_1= ruleForLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_ruleExpressionStartRule1501);
                    this_ForLoop_1=ruleForLoop();

                    state._fsp--;

                     
                            current = this_ForLoop_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:755:5: this_WhileLoop_2= ruleWhileLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1528);
                    this_WhileLoop_2=ruleWhileLoop();

                    state._fsp--;

                     
                            current = this_WhileLoop_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:765:5: this_DoWhileLoop_3= ruleDoWhileLoop
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1555);
                    this_DoWhileLoop_3=ruleDoWhileLoop();

                    state._fsp--;

                     
                            current = this_DoWhileLoop_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:775:5: this_IfStatement_4= ruleIfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1582);
                    this_IfStatement_4=ruleIfStatement();

                    state._fsp--;

                     
                            current = this_IfStatement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:785:5: this_ReturnStatement_5= ruleReturnStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getReturnStatementParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReturnStatement_in_ruleExpressionStartRule1609);
                    this_ReturnStatement_5=ruleReturnStatement();

                    state._fsp--;

                     
                            current = this_ReturnStatement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:795:5: this_LocalVariableDeclarationStatement_6= ruleLocalVariableDeclarationStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getLocalVariableDeclarationStatementParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclarationStatement_in_ruleExpressionStartRule1636);
                    this_LocalVariableDeclarationStatement_6=ruleLocalVariableDeclarationStatement();

                    state._fsp--;

                     
                            current = this_LocalVariableDeclarationStatement_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:805:5: this_OperationCallStatement_7= ruleOperationCallStatement
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionStartRuleAccess().getOperationCallStatementParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOperationCallStatement_in_ruleExpressionStartRule1663);
                    this_OperationCallStatement_7=ruleOperationCallStatement();

                    state._fsp--;

                     
                            current = this_OperationCallStatement_7; 
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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:821:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:822:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:823:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment1698);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment1708); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:830:1: ruleAssignment returns [EObject current=null] : ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_lhs_typedNamedElementExpression_0_0 = null;

        Enumerator lv_assignOperator_1_0 = null;

        EObject lv_rhs_assignExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:833:28: ( ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:834:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:834:1: ( ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:834:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) ) ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_rhs_assignExpression_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:834:2: ( (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:835:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:835:1: (lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:836:3: lv_lhs_typedNamedElementExpression_0_0= ruleTypedNamedElementExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_ruleAssignment1754);
            lv_lhs_typedNamedElementExpression_0_0=ruleTypedNamedElementExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"lhs_typedNamedElementExpression",
                    		lv_lhs_typedNamedElementExpression_0_0, 
                    		"TypedNamedElementExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:852:2: ( (lv_assignOperator_1_0= ruleAssignOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:853:1: (lv_assignOperator_1_0= ruleAssignOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:853:1: (lv_assignOperator_1_0= ruleAssignOperator )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:854:3: lv_assignOperator_1_0= ruleAssignOperator
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleAssignment1775);
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

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:870:2: ( (lv_rhs_assignExpression_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:871:1: (lv_rhs_assignExpression_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:871:1: (lv_rhs_assignExpression_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:872:3: lv_rhs_assignExpression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getRhs_assignExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment1796);
            lv_rhs_assignExpression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"rhs_assignExpression",
                    		lv_rhs_assignExpression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAssignment1808); 

                	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRuleLocalVariableDeclarationStatement"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:900:1: entryRuleLocalVariableDeclarationStatement returns [EObject current=null] : iv_ruleLocalVariableDeclarationStatement= ruleLocalVariableDeclarationStatement EOF ;
    public final EObject entryRuleLocalVariableDeclarationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableDeclarationStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:901:2: (iv_ruleLocalVariableDeclarationStatement= ruleLocalVariableDeclarationStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:902:2: iv_ruleLocalVariableDeclarationStatement= ruleLocalVariableDeclarationStatement EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableDeclarationStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclarationStatement_in_entryRuleLocalVariableDeclarationStatement1844);
            iv_ruleLocalVariableDeclarationStatement=ruleLocalVariableDeclarationStatement();

            state._fsp--;

             current =iv_ruleLocalVariableDeclarationStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalVariableDeclarationStatement1854); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariableDeclarationStatement"


    // $ANTLR start "ruleLocalVariableDeclarationStatement"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:909:1: ruleLocalVariableDeclarationStatement returns [EObject current=null] : ( ( (lv_variable_0_0= ruleLocalVariableDeclaration ) ) (otherlv_1= ':=' ( (lv_initializeExpression_2_0= ruleExpression ) ) )? otherlv_3= ';' ) ;
    public final EObject ruleLocalVariableDeclarationStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_0_0 = null;

        EObject lv_initializeExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:912:28: ( ( ( (lv_variable_0_0= ruleLocalVariableDeclaration ) ) (otherlv_1= ':=' ( (lv_initializeExpression_2_0= ruleExpression ) ) )? otherlv_3= ';' ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:913:1: ( ( (lv_variable_0_0= ruleLocalVariableDeclaration ) ) (otherlv_1= ':=' ( (lv_initializeExpression_2_0= ruleExpression ) ) )? otherlv_3= ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:913:1: ( ( (lv_variable_0_0= ruleLocalVariableDeclaration ) ) (otherlv_1= ':=' ( (lv_initializeExpression_2_0= ruleExpression ) ) )? otherlv_3= ';' )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:913:2: ( (lv_variable_0_0= ruleLocalVariableDeclaration ) ) (otherlv_1= ':=' ( (lv_initializeExpression_2_0= ruleExpression ) ) )? otherlv_3= ';'
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:913:2: ( (lv_variable_0_0= ruleLocalVariableDeclaration ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:914:1: (lv_variable_0_0= ruleLocalVariableDeclaration )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:914:1: (lv_variable_0_0= ruleLocalVariableDeclaration )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:915:3: lv_variable_0_0= ruleLocalVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getLocalVariableDeclarationStatementAccess().getVariableLocalVariableDeclarationParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclaration_in_ruleLocalVariableDeclarationStatement1900);
            lv_variable_0_0=ruleLocalVariableDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalVariableDeclarationStatementRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"LocalVariableDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:931:2: (otherlv_1= ':=' ( (lv_initializeExpression_2_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:931:4: otherlv_1= ':=' ( (lv_initializeExpression_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLocalVariableDeclarationStatement1913); 

                        	newLeafNode(otherlv_1, grammarAccess.getLocalVariableDeclarationStatementAccess().getColonEqualsSignKeyword_1_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:935:1: ( (lv_initializeExpression_2_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:936:1: (lv_initializeExpression_2_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:936:1: (lv_initializeExpression_2_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:937:3: lv_initializeExpression_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVariableDeclarationStatementAccess().getInitializeExpressionExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLocalVariableDeclarationStatement1934);
                    lv_initializeExpression_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVariableDeclarationStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"initializeExpression",
                            		lv_initializeExpression_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLocalVariableDeclarationStatement1948); 

                	newLeafNode(otherlv_3, grammarAccess.getLocalVariableDeclarationStatementAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleLocalVariableDeclarationStatement"


    // $ANTLR start "entryRuleLocalVariableDeclaration"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:965:1: entryRuleLocalVariableDeclaration returns [EObject current=null] : iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF ;
    public final EObject entryRuleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableDeclaration = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:966:2: (iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:967:2: iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLocalVariableDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration1984);
            iv_ruleLocalVariableDeclaration=ruleLocalVariableDeclaration();

            state._fsp--;

             current =iv_ruleLocalVariableDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalVariableDeclaration1994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalVariableDeclaration"


    // $ANTLR start "ruleLocalVariableDeclaration"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:974:1: ruleLocalVariableDeclaration returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:977:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:978:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:978:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:978:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:978:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:979:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:979:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:980:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration2039); 

            		newLeafNode(otherlv_0, grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:991:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:992:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:992:1: (lv_name_1_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:993:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration2056); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleLocalVariableDeclaration"


    // $ANTLR start "entryRuleExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1017:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1018:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1019:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression2097);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression2107); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1026:1: ruleExpression returns [EObject current=null] : this_LogicalExpression_0= ruleLogicalExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1029:28: (this_LogicalExpression_0= ruleLogicalExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1031:5: this_LogicalExpression_0= ruleLogicalExpression
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogicalExpression_in_ruleExpression2153);
            this_LogicalExpression_0=ruleLogicalExpression();

            state._fsp--;

             
                    current = this_LogicalExpression_0; 
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


    // $ANTLR start "entryRuleLogicalExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1047:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1048:2: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1049:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalExpression_in_entryRuleLogicalExpression2187);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;

             current =iv_ruleLogicalExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalExpression2197); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1056:1: ruleLogicalExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1059:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1061:5: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
             
                    newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleLogicalExpression2243);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;

             
                    current = this_LogicalOrExpression_0; 
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
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1077:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1078:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1079:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression2277);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;

             current =iv_ruleLogicalOrExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression2287); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1086:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1089:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1090:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1090:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1091:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2334);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;

             
                    current = this_LogicalAndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1099:1: ( () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1099:2: () ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1099:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1100:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1105:2: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1106:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1106:1: (lv_operator_2_0= ruleLogicalOrOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1107:3: lv_operator_2_0= ruleLogicalOrOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression2364);
            	    lv_operator_2_0=ruleLogicalOrOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"LogicalOrOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1123:2: ( (lv_rightExpression_3_0= ruleLogicalAndExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1124:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1124:1: (lv_rightExpression_3_0= ruleLogicalAndExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1125:3: lv_rightExpression_3_0= ruleLogicalAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2385);
            	    lv_rightExpression_3_0=ruleLogicalAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExpression",
            	            		lv_rightExpression_3_0, 
            	            		"LogicalAndExpression");
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1149:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1150:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1151:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression2423);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;

             current =iv_ruleLogicalAndExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression2433); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1158:1: ruleLogicalAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1161:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1162:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1162:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1163:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression2480);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1171:1: ( () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1171:2: () ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1171:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1172:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1177:2: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1178:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1178:1: (lv_operator_2_0= ruleLogicalAndOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1179:3: lv_operator_2_0= ruleLogicalAndOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression2510);
            	    lv_operator_2_0=ruleLogicalAndOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"LogicalAndOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1195:2: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1196:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1196:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1197:3: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression2531);
            	    lv_rightExpression_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
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
            	    break loop9;
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1221:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1222:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1223:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression2569);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression2579); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1230:1: ruleComparisonExpression returns [EObject current=null] : (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonHigherOpExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1233:28: ( (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1234:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1234:1: (this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1235:5: this_ComparisonHigherOpExpression_0= ruleComparisonHigherOpExpression ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression2626);
            this_ComparisonHigherOpExpression_0=ruleComparisonHigherOpExpression();

            state._fsp--;

             
                    current = this_ComparisonHigherOpExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1243:1: ( () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=39 && LA10_0<=40)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1243:2: () ( (lv_operator_2_0= ruleComparingEQNEQOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1243:2: ()
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1244:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1249:2: ( (lv_operator_2_0= ruleComparingEQNEQOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1250:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1250:1: (lv_operator_2_0= ruleComparingEQNEQOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1251:3: lv_operator_2_0= ruleComparingEQNEQOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparingEQNEQOperator_in_ruleComparisonExpression2656);
                    lv_operator_2_0=ruleComparingEQNEQOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"ComparingEQNEQOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1267:2: ( (lv_rightExpression_3_0= ruleComparisonHigherOpExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1268:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1268:1: (lv_rightExpression_3_0= ruleComparisonHigherOpExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1269:3: lv_rightExpression_3_0= ruleComparisonHigherOpExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression2677);
                    lv_rightExpression_3_0=ruleComparisonHigherOpExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_3_0, 
                            		"ComparisonHigherOpExpression");
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonHigherOpExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1293:1: entryRuleComparisonHigherOpExpression returns [EObject current=null] : iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF ;
    public final EObject entryRuleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonHigherOpExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1294:2: (iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1295:2: iv_ruleComparisonHigherOpExpression= ruleComparisonHigherOpExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonHigherOpExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonHigherOpExpression_in_entryRuleComparisonHigherOpExpression2715);
            iv_ruleComparisonHigherOpExpression=ruleComparisonHigherOpExpression();

            state._fsp--;

             current =iv_ruleComparisonHigherOpExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonHigherOpExpression2725); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonHigherOpExpression"


    // $ANTLR start "ruleComparisonHigherOpExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1302:1: ruleComparisonHigherOpExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) ;
    public final EObject ruleComparisonHigherOpExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1305:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1306:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1306:1: (this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1307:5: this_ArithmeticExpression_0= ruleArithmeticExpression ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression2772);
            this_ArithmeticExpression_0=ruleArithmeticExpression();

            state._fsp--;

             
                    current = this_ArithmeticExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1315:1: ( () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=41 && LA11_0<=44)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1315:2: () ( (lv_operator_2_0= ruleComparingRelOperator ) ) ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1315:2: ()
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1316:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1321:2: ( (lv_operator_2_0= ruleComparingRelOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1322:1: (lv_operator_2_0= ruleComparingRelOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1322:1: (lv_operator_2_0= ruleComparingRelOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1323:3: lv_operator_2_0= ruleComparingRelOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparingRelOperator_in_ruleComparisonHigherOpExpression2802);
                    lv_operator_2_0=ruleComparingRelOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"ComparingRelOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1339:2: ( (lv_rightExpression_3_0= ruleArithmeticExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1340:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1340:1: (lv_rightExpression_3_0= ruleArithmeticExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1341:3: lv_rightExpression_3_0= ruleArithmeticExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression2823);
                    lv_rightExpression_3_0=ruleArithmeticExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonHigherOpExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_3_0, 
                            		"ArithmeticExpression");
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
    // $ANTLR end "ruleComparisonHigherOpExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1365:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1366:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1367:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression2861);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArithmeticExpression2871); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1374:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditionExpression_0= ruleAdditionExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1377:28: (this_AdditionExpression_0= ruleAdditionExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1379:5: this_AdditionExpression_0= ruleAdditionExpression
            {
             
                    newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_ruleArithmeticExpression2917);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;

             
                    current = this_AdditionExpression_0; 
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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1395:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1396:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1397:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression2951);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;

             current =iv_ruleAdditionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditionExpression2961); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1404:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1407:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1408:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1408:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1409:5: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3008);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;

             
                    current = this_MultiplicationExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1417:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=45 && LA12_0<=46)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1417:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1417:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1418:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1423:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1424:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1424:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1425:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression3038);
            	    lv_operator_2_0=ruleAdditionOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"AdditionOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1441:2: ( (lv_rightExpression_3_0= ruleMultiplicationExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1442:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1442:1: (lv_rightExpression_3_0= ruleMultiplicationExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1443:3: lv_rightExpression_3_0= ruleMultiplicationExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3059);
            	    lv_rightExpression_3_0=ruleMultiplicationExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExpression",
            	            		lv_rightExpression_3_0, 
            	            		"MultiplicationExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1467:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1468:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1469:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression3097);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;

             current =iv_ruleMultiplicationExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicationExpression3107); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1476:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_UnaryPostExpression_1= ruleUnaryPostExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) ) )* ) ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryPreExpression_0 = null;

        EObject this_UnaryPostExpression_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_1 = null;

        EObject lv_rightExpression_4_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1479:28: ( (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_UnaryPostExpression_1= ruleUnaryPostExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) ) )* ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1480:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_UnaryPostExpression_1= ruleUnaryPostExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) ) )* ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1480:1: (this_UnaryPreExpression_0= ruleUnaryPreExpression | (this_UnaryPostExpression_1= ruleUnaryPostExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) ) )* ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=45 && LA15_0<=46)||LA15_0==49) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==16||(LA15_0>=50 && LA15_0<=54)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1481:5: this_UnaryPreExpression_0= ruleUnaryPreExpression
                    {
                     
                            newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression3154);
                    this_UnaryPreExpression_0=ruleUnaryPreExpression();

                    state._fsp--;

                     
                            current = this_UnaryPreExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1490:6: (this_UnaryPostExpression_1= ruleUnaryPostExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) ) )* )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1490:6: (this_UnaryPostExpression_1= ruleUnaryPostExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) ) )* )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1491:5: this_UnaryPostExpression_1= ruleUnaryPostExpression ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) ) )*
                    {
                     
                            newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryPostExpressionParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryPostExpression_in_ruleMultiplicationExpression3182);
                    this_UnaryPostExpression_1=ruleUnaryPostExpression();

                    state._fsp--;

                     
                            current = this_UnaryPostExpression_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1499:1: ( () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=47 && LA14_0<=48)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1499:2: () ( (lv_operator_3_0= ruleMultiplicationOperator ) ) ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1499:2: ()
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1500:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0(),
                    	                current);
                    	        

                    	    }

                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1505:2: ( (lv_operator_3_0= ruleMultiplicationOperator ) )
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1506:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1506:1: (lv_operator_3_0= ruleMultiplicationOperator )
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1507:3: lv_operator_3_0= ruleMultiplicationOperator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression3212);
                    	    lv_operator_3_0=ruleMultiplicationOperator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"operator",
                    	            		lv_operator_3_0, 
                    	            		"MultiplicationOperator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1523:2: ( ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) ) )
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1524:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1524:1: ( (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression ) )
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1525:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1525:1: (lv_rightExpression_4_1= ruleUnaryPreExpression | lv_rightExpression_4_2= ruleUnaryPostExpression )
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( ((LA13_0>=45 && LA13_0<=46)||LA13_0==49) ) {
                    	        alt13=1;
                    	    }
                    	    else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||LA13_0==16||(LA13_0>=50 && LA13_0<=54)) ) {
                    	        alt13=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 13, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1526:3: lv_rightExpression_4_1= ruleUnaryPreExpression
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPreExpressionParserRuleCall_1_1_2_0_0()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression3235);
                    	            lv_rightExpression_4_1=ruleUnaryPreExpression();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"rightExpression",
                    	                    		lv_rightExpression_4_1, 
                    	                    		"UnaryPreExpression");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1541:8: lv_rightExpression_4_2= ruleUnaryPostExpression
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPostExpressionParserRuleCall_1_1_2_0_1()); 
                    	            	    
                    	            pushFollow(FollowSets000.FOLLOW_ruleUnaryPostExpression_in_ruleMultiplicationExpression3254);
                    	            lv_rightExpression_4_2=ruleUnaryPostExpression();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"rightExpression",
                    	                    		lv_rightExpression_4_2, 
                    	                    		"UnaryPostExpression");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;

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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleUnaryPreExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1567:1: entryRuleUnaryPreExpression returns [EObject current=null] : iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF ;
    public final EObject entryRuleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPreExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1568:2: (iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1569:2: iv_ruleUnaryPreExpression= ruleUnaryPreExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryPreExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryPreExpression_in_entryRuleUnaryPreExpression3296);
            iv_ruleUnaryPreExpression=ruleUnaryPreExpression();

            state._fsp--;

             current =iv_ruleUnaryPreExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryPreExpression3306); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryPreExpression"


    // $ANTLR start "ruleUnaryPreExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1576:1: ruleUnaryPreExpression returns [EObject current=null] : ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) ;
    public final EObject ruleUnaryPreExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_enclosedExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1579:28: ( ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:1: ( () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:2: () ( (lv_operator_1_0= ruleUnaryPreOperator ) ) ( (lv_enclosedExpression_2_0= ruleOperand ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:2: ()
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1581:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1586:2: ( (lv_operator_1_0= ruleUnaryPreOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1587:1: (lv_operator_1_0= ruleUnaryPreOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1587:1: (lv_operator_1_0= ruleUnaryPreOperator )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1588:3: lv_operator_1_0= ruleUnaryPreOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryPreOperator_in_ruleUnaryPreExpression3361);
            lv_operator_1_0=ruleUnaryPreOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"UnaryPreOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1604:2: ( (lv_enclosedExpression_2_0= ruleOperand ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1605:1: (lv_enclosedExpression_2_0= ruleOperand )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1605:1: (lv_enclosedExpression_2_0= ruleOperand )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1606:3: lv_enclosedExpression_2_0= ruleOperand
            {
             
            	        newCompositeNode(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionOperandParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleUnaryPreExpression3382);
            lv_enclosedExpression_2_0=ruleOperand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryPreExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"enclosedExpression",
                    		lv_enclosedExpression_2_0, 
                    		"Operand");
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
    // $ANTLR end "ruleUnaryPreExpression"


    // $ANTLR start "entryRuleUnaryPostExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1630:1: entryRuleUnaryPostExpression returns [EObject current=null] : iv_ruleUnaryPostExpression= ruleUnaryPostExpression EOF ;
    public final EObject entryRuleUnaryPostExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryPostExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1631:2: (iv_ruleUnaryPostExpression= ruleUnaryPostExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1632:2: iv_ruleUnaryPostExpression= ruleUnaryPostExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryPostExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryPostExpression_in_entryRuleUnaryPostExpression3418);
            iv_ruleUnaryPostExpression=ruleUnaryPostExpression();

            state._fsp--;

             current =iv_ruleUnaryPostExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryPostExpression3428); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryPostExpression"


    // $ANTLR start "ruleUnaryPostExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1639:1: ruleUnaryPostExpression returns [EObject current=null] : (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleUnaryPostOperator ) ) )? ) ;
    public final EObject ruleUnaryPostExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Operand_0 = null;

        Enumerator lv_operator_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1642:28: ( (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleUnaryPostOperator ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1643:1: (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleUnaryPostOperator ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1643:1: (this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleUnaryPostOperator ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1644:5: this_Operand_0= ruleOperand ( () ( (lv_operator_2_0= ruleUnaryPostOperator ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getUnaryPostExpressionAccess().getOperandParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_ruleUnaryPostExpression3475);
            this_Operand_0=ruleOperand();

            state._fsp--;

             
                    current = this_Operand_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1652:1: ( () ( (lv_operator_2_0= ruleUnaryPostOperator ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=31 && LA16_0<=32)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1652:2: () ( (lv_operator_2_0= ruleUnaryPostOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1652:2: ()
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1653:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getUnaryPostExpressionAccess().getUnaryExpressionEnclosedExpressionAction_1_0(),
                                current);
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1658:2: ( (lv_operator_2_0= ruleUnaryPostOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1659:1: (lv_operator_2_0= ruleUnaryPostOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1659:1: (lv_operator_2_0= ruleUnaryPostOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1660:3: lv_operator_2_0= ruleUnaryPostOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryPostExpressionAccess().getOperatorUnaryPostOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryPostOperator_in_ruleUnaryPostExpression3505);
                    lv_operator_2_0=ruleUnaryPostOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryPostExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"UnaryPostOperator");
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
    // $ANTLR end "ruleUnaryPostExpression"


    // $ANTLR start "entryRuleOperand"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1684:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1685:2: (iv_ruleOperand= ruleOperand EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1686:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_entryRuleOperand3543);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperand3553); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1693:1: ruleOperand returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_LiteralExpression_3 = null;

        EObject this_ExtendedTypedNamedElementExpression_4 = null;

        EObject this_OperationCall_5 = null;

        EObject this_TriggerMessageExpression_6 = null;

        EObject this_NoAttributeSelectorExpression_7 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1696:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1697:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1697:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_LiteralExpression_3= ruleLiteralExpression | this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression | this_OperationCall_5= ruleOperationCall | this_TriggerMessageExpression_6= ruleTriggerMessageExpression | this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt17=1;
                }
                break;
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case RULE_INT:
            case RULE_STRING:
                {
                alt17=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 14:
                case 15:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
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
                case 47:
                case 48:
                    {
                    alt17=3;
                    }
                    break;
                case 27:
                    {
                    int LA17_6 = input.LA(3);

                    if ( ((LA17_6>=50 && LA17_6<=54)) ) {
                        alt17=3;
                    }
                    else if ( (LA17_6==RULE_ID) ) {
                        alt17=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 16:
                    {
                    alt17=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }

                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1697:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1697:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1697:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOperand3591); 

                        	newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleOperand3613);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOperand3624); 

                        	newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1716:5: this_LiteralExpression_3= ruleLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getLiteralExpressionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_ruleOperand3653);
                    this_LiteralExpression_3=ruleLiteralExpression();

                    state._fsp--;

                     
                            current = this_LiteralExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1726:5: this_ExtendedTypedNamedElementExpression_4= ruleExtendedTypedNamedElementExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getExtendedTypedNamedElementExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedTypedNamedElementExpression_in_ruleOperand3680);
                    this_ExtendedTypedNamedElementExpression_4=ruleExtendedTypedNamedElementExpression();

                    state._fsp--;

                     
                            current = this_ExtendedTypedNamedElementExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1736:5: this_OperationCall_5= ruleOperationCall
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getOperationCallParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_ruleOperand3707);
                    this_OperationCall_5=ruleOperationCall();

                    state._fsp--;

                     
                            current = this_OperationCall_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1746:5: this_TriggerMessageExpression_6= ruleTriggerMessageExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getTriggerMessageExpressionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTriggerMessageExpression_in_ruleOperand3734);
                    this_TriggerMessageExpression_6=ruleTriggerMessageExpression();

                    state._fsp--;

                     
                            current = this_TriggerMessageExpression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1756:5: this_NoAttributeSelectorExpression_7= ruleNoAttributeSelectorExpression
                    {
                     
                            newCompositeNode(grammarAccess.getOperandAccess().getNoAttributeSelectorExpressionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNoAttributeSelectorExpression_in_ruleOperand3761);
                    this_NoAttributeSelectorExpression_7=ruleNoAttributeSelectorExpression();

                    state._fsp--;

                     
                            current = this_NoAttributeSelectorExpression_7; 
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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteralExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1772:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1773:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1774:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression3796);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralExpression3806); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1781:1: ruleLiteralExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1784:28: ( ( () ( (lv_value_1_0= ruleLiteral ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1785:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1785:1: ( () ( (lv_value_1_0= ruleLiteral ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1785:2: () ( (lv_value_1_0= ruleLiteral ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1785:2: ()
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1786:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1791:2: ( (lv_value_1_0= ruleLiteral ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1792:1: (lv_value_1_0= ruleLiteral )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1792:1: (lv_value_1_0= ruleLiteral )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1793:3: lv_value_1_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_ruleLiteralExpression3861);
            lv_value_1_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLiteralExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Literal");
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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1817:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1818:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1819:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral3898);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral3909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1826:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUMBER_0=null;
        Token this_BOOLEAN_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1829:28: ( (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1830:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1830:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
            int alt18=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt18=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt18=2;
                }
                break;
            case RULE_INT:
                {
                alt18=3;
                }
                break;
            case RULE_STRING:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1830:6: this_NUMBER_0= RULE_NUMBER
                    {
                    this_NUMBER_0=(Token)match(input,RULE_NUMBER,FollowSets000.FOLLOW_RULE_NUMBER_in_ruleLiteral3949); 

                    		current.merge(this_NUMBER_0);
                        
                     
                        newLeafNode(this_NUMBER_0, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1838:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleLiteral3975); 

                    		current.merge(this_BOOLEAN_1);
                        
                     
                        newLeafNode(this_BOOLEAN_1, grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1846:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLiteral4001); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1854:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteral4027); 

                    		current.merge(this_STRING_3);
                        
                     
                        newLeafNode(this_STRING_3, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleExtendedTypedNamedElementExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1869:1: entryRuleExtendedTypedNamedElementExpression returns [EObject current=null] : iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF ;
    public final EObject entryRuleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedTypedNamedElementExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1870:2: (iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1871:2: iv_ruleExtendedTypedNamedElementExpression= ruleExtendedTypedNamedElementExpression EOF
            {
             newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedTypedNamedElementExpression_in_entryRuleExtendedTypedNamedElementExpression4072);
            iv_ruleExtendedTypedNamedElementExpression=ruleExtendedTypedNamedElementExpression();

            state._fsp--;

             current =iv_ruleExtendedTypedNamedElementExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedTypedNamedElementExpression4082); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedTypedNamedElementExpression"


    // $ANTLR start "ruleExtendedTypedNamedElementExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1878:1: ruleExtendedTypedNamedElementExpression returns [EObject current=null] : (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )? ) ;
    public final EObject ruleExtendedTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TypedNamedElementExpression_0 = null;

        EObject lv_position_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1881:28: ( (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1882:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1882:1: (this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1883:5: this_TypedNamedElementExpression_0= ruleTypedNamedElementExpression ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getTypedNamedElementExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_ruleExtendedTypedNamedElementExpression4129);
            this_TypedNamedElementExpression_0=ruleTypedNamedElementExpression();

            state._fsp--;

             
                    current = this_TypedNamedElementExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1891:1: ( () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1891:2: () otherlv_2= '.' ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1891:2: ()
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1892:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleExtendedTypedNamedElementExpression4150); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtendedTypedNamedElementExpressionAccess().getFullStopKeyword_1_1());
                        
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1901:1: ( (lv_position_3_0= rulePositionSelectorExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1902:1: (lv_position_3_0= rulePositionSelectorExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1902:1: (lv_position_3_0= rulePositionSelectorExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1903:3: lv_position_3_0= rulePositionSelectorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_ruleExtendedTypedNamedElementExpression4171);
                    lv_position_3_0=rulePositionSelectorExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtendedTypedNamedElementExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_3_0, 
                            		"PositionSelectorExpression");
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
    // $ANTLR end "ruleExtendedTypedNamedElementExpression"


    // $ANTLR start "entryRuleTypedNamedElementExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1927:1: entryRuleTypedNamedElementExpression returns [EObject current=null] : iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF ;
    public final EObject entryRuleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedNamedElementExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1928:2: (iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1929:2: iv_ruleTypedNamedElementExpression= ruleTypedNamedElementExpression EOF
            {
             newCompositeNode(grammarAccess.getTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedNamedElementExpression_in_entryRuleTypedNamedElementExpression4209);
            iv_ruleTypedNamedElementExpression=ruleTypedNamedElementExpression();

            state._fsp--;

             current =iv_ruleTypedNamedElementExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedNamedElementExpression4219); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedNamedElementExpression"


    // $ANTLR start "ruleTypedNamedElementExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1936:1: ruleTypedNamedElementExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleTypedNamedElementExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1939:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1940:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1940:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )* )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1940:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )*
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1940:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1941:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1941:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1942:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypedNamedElementExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypedNamedElementExpression4264); 

            		newLeafNode(otherlv_0, grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1953:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1953:4: otherlv_1= '[' ( (lv_indices_2_0= ruleArithmeticExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTypedNamedElementExpression4277); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTypedNamedElementExpressionAccess().getLeftSquareBracketKeyword_1_0());
            	        
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1957:1: ( (lv_indices_2_0= ruleArithmeticExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1958:1: (lv_indices_2_0= ruleArithmeticExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1958:1: (lv_indices_2_0= ruleArithmeticExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1959:3: lv_indices_2_0= ruleArithmeticExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypedNamedElementExpressionAccess().getIndicesArithmeticExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleTypedNamedElementExpression4298);
            	    lv_indices_2_0=ruleArithmeticExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTypedNamedElementExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indices",
            	            		lv_indices_2_0, 
            	            		"ArithmeticExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTypedNamedElementExpression4310); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTypedNamedElementExpressionAccess().getRightSquareBracketKeyword_1_2());
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleTypedNamedElementExpression"


    // $ANTLR start "entryRuleNoAttributeSelectorExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1987:1: entryRuleNoAttributeSelectorExpression returns [EObject current=null] : iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF ;
    public final EObject entryRuleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoAttributeSelectorExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1988:2: (iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1989:2: iv_ruleNoAttributeSelectorExpression= ruleNoAttributeSelectorExpression EOF
            {
             newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoAttributeSelectorExpression_in_entryRuleNoAttributeSelectorExpression4348);
            iv_ruleNoAttributeSelectorExpression=ruleNoAttributeSelectorExpression();

            state._fsp--;

             current =iv_ruleNoAttributeSelectorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoAttributeSelectorExpression4358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoAttributeSelectorExpression"


    // $ANTLR start "ruleNoAttributeSelectorExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1996:1: ruleNoAttributeSelectorExpression returns [EObject current=null] : ( (lv_position_0_0= rulePositionSelectorExpression ) ) ;
    public final EObject ruleNoAttributeSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_position_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1999:28: ( ( (lv_position_0_0= rulePositionSelectorExpression ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2000:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2000:1: ( (lv_position_0_0= rulePositionSelectorExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2001:1: (lv_position_0_0= rulePositionSelectorExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2001:1: (lv_position_0_0= rulePositionSelectorExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2002:3: lv_position_0_0= rulePositionSelectorExpression
            {
             
            	        newCompositeNode(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_ruleNoAttributeSelectorExpression4403);
            lv_position_0_0=rulePositionSelectorExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNoAttributeSelectorExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"position",
                    		lv_position_0_0, 
                    		"PositionSelectorExpression");
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
    // $ANTLR end "ruleNoAttributeSelectorExpression"


    // $ANTLR start "entryRulePositionSelectorExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2026:1: entryRulePositionSelectorExpression returns [EObject current=null] : iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF ;
    public final EObject entryRulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionSelectorExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2027:2: (iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2028:2: iv_rulePositionSelectorExpression= rulePositionSelectorExpression EOF
            {
             newCompositeNode(grammarAccess.getPositionSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_entryRulePositionSelectorExpression4438);
            iv_rulePositionSelectorExpression=rulePositionSelectorExpression();

            state._fsp--;

             current =iv_rulePositionSelectorExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositionSelectorExpression4448); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositionSelectorExpression"


    // $ANTLR start "rulePositionSelectorExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2035:1: rulePositionSelectorExpression returns [EObject current=null] : ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) ;
    public final EObject rulePositionSelectorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_kind_0_0 = null;

        EObject lv_successor_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2038:28: ( ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2039:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2039:1: ( ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2039:2: ( (lv_kind_0_0= rulePositionSelectorKind ) ) (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2039:2: ( (lv_kind_0_0= rulePositionSelectorKind ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2040:1: (lv_kind_0_0= rulePositionSelectorKind )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2040:1: (lv_kind_0_0= rulePositionSelectorKind )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2041:3: lv_kind_0_0= rulePositionSelectorKind
            {
             
            	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getKindPositionSelectorKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePositionSelectorKind_in_rulePositionSelectorExpression4494);
            lv_kind_0_0=rulePositionSelectorKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPositionSelectorExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_0_0, 
                    		"PositionSelectorKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2057:2: (otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2057:4: otherlv_1= '.' ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    {
                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePositionSelectorExpression4507); 

                        	newLeafNode(otherlv_1, grammarAccess.getPositionSelectorExpressionAccess().getFullStopKeyword_1_0());
                        
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2061:1: ( (lv_successor_2_0= rulePositionSelectorExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2062:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2062:1: (lv_successor_2_0= rulePositionSelectorExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2063:3: lv_successor_2_0= rulePositionSelectorExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorPositionSelectorExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePositionSelectorExpression_in_rulePositionSelectorExpression4528);
                    lv_successor_2_0=rulePositionSelectorExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPositionSelectorExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"successor",
                            		lv_successor_2_0, 
                            		"PositionSelectorExpression");
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
    // $ANTLR end "rulePositionSelectorExpression"


    // $ANTLR start "entryRuleOperationCall"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2087:1: entryRuleOperationCall returns [EObject current=null] : iv_ruleOperationCall= ruleOperationCall EOF ;
    public final EObject entryRuleOperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationCall = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2088:2: (iv_ruleOperationCall= ruleOperationCall EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2089:2: iv_ruleOperationCall= ruleOperationCall EOF
            {
             newCompositeNode(grammarAccess.getOperationCallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperationCall_in_entryRuleOperationCall4566);
            iv_ruleOperationCall=ruleOperationCall();

            state._fsp--;

             current =iv_ruleOperationCall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperationCall4576); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2096:1: ruleOperationCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterBinding_2_0 = null;

        EObject lv_parameterBinding_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2099:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2100:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2100:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')' )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2100:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )? otherlv_5= ')'
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2100:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2101:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2101:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2102:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperationCall4621); 

            		newLeafNode(otherlv_0, grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOperationCall4633); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2117:1: ( ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2117:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) ) (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2117:2: ( (lv_parameterBinding_2_0= ruleParamaterBinding ) )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2118:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2118:1: (lv_parameterBinding_2_0= ruleParamaterBinding )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2119:3: lv_parameterBinding_2_0= ruleParamaterBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_ruleOperationCall4655);
                    lv_parameterBinding_2_0=ruleParamaterBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterBinding",
                            		lv_parameterBinding_2_0, 
                            		"ParamaterBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2135:2: (otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==30) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2135:4: otherlv_3= ',' ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    {
                    	    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOperationCall4668); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2139:1: ( (lv_parameterBinding_4_0= ruleParamaterBinding ) )
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2140:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    {
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2140:1: (lv_parameterBinding_4_0= ruleParamaterBinding )
                    	    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2141:3: lv_parameterBinding_4_0= ruleParamaterBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_ruleOperationCall4689);
                    	    lv_parameterBinding_4_0=ruleParamaterBinding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterBinding",
                    	            		lv_parameterBinding_4_0, 
                    	            		"ParamaterBinding");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOperationCall4705); 

                	newLeafNode(otherlv_5, grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3());
                

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


    // $ANTLR start "entryRuleParamaterBinding"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2169:1: entryRuleParamaterBinding returns [EObject current=null] : iv_ruleParamaterBinding= ruleParamaterBinding EOF ;
    public final EObject entryRuleParamaterBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamaterBinding = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2170:2: (iv_ruleParamaterBinding= ruleParamaterBinding EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2171:2: iv_ruleParamaterBinding= ruleParamaterBinding EOF
            {
             newCompositeNode(grammarAccess.getParamaterBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParamaterBinding_in_entryRuleParamaterBinding4741);
            iv_ruleParamaterBinding=ruleParamaterBinding();

            state._fsp--;

             current =iv_ruleParamaterBinding; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParamaterBinding4751); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamaterBinding"


    // $ANTLR start "ruleParamaterBinding"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2178:1: ruleParamaterBinding returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleParamaterBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2181:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2182:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2182:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2182:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2182:2: ()
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2183:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0(),
                        current);
                

            }

            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2188:2: ( (otherlv_1= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2189:1: (otherlv_1= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2189:1: (otherlv_1= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2190:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParamaterBindingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParamaterBinding4805); 

            		newLeafNode(otherlv_1, grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleParamaterBinding4817); 

                	newLeafNode(otherlv_2, grammarAccess.getParamaterBindingAccess().getColonEqualsSignKeyword_2());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2205:1: ( (lv_value_3_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2206:1: (lv_value_3_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2206:1: (lv_value_3_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2207:3: lv_value_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParamaterBinding4838);
            lv_value_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParamaterBindingRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Expression");
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
    // $ANTLR end "ruleParamaterBinding"


    // $ANTLR start "entryRuleTriggerMessageExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2231:1: entryRuleTriggerMessageExpression returns [EObject current=null] : iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF ;
    public final EObject entryRuleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerMessageExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2232:2: (iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2233:2: iv_ruleTriggerMessageExpression= ruleTriggerMessageExpression EOF
            {
             newCompositeNode(grammarAccess.getTriggerMessageExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTriggerMessageExpression_in_entryRuleTriggerMessageExpression4874);
            iv_ruleTriggerMessageExpression=ruleTriggerMessageExpression();

            state._fsp--;

             current =iv_ruleTriggerMessageExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTriggerMessageExpression4884); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerMessageExpression"


    // $ANTLR start "ruleTriggerMessageExpression"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2240:1: ruleTriggerMessageExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTriggerMessageExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2243:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2244:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2244:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2244:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2244:2: ( (otherlv_0= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2245:1: (otherlv_0= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2245:1: (otherlv_0= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2246:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTriggerMessageExpression4929); 

            		newLeafNode(otherlv_0, grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTriggerMessageExpression4941); 

                	newLeafNode(otherlv_1, grammarAccess.getTriggerMessageExpressionAccess().getFullStopKeyword_1());
                
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2261:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2262:1: (otherlv_2= RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2262:1: (otherlv_2= RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2263:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerMessageExpressionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTriggerMessageExpression4961); 

            		newLeafNode(otherlv_2, grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleTriggerMessageExpression"


    // $ANTLR start "ruleIncrementDecrementOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2282:1: ruleIncrementDecrementOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleIncrementDecrementOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2284:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2285:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2285:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2285:2: (enumLiteral_0= '++' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2285:2: (enumLiteral_0= '++' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2285:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleIncrementDecrementOperator5011); 

                            current = grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2291:6: (enumLiteral_1= '--' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2291:6: (enumLiteral_1= '--' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2291:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleIncrementDecrementOperator5028); 

                            current = grammarAccess.getIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                        

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


    // $ANTLR start "ruleAssignOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2301:1: ruleAssignOperator returns [Enumerator current=null] : ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '=+' ) | (enumLiteral_3= '-=' ) | (enumLiteral_4= '=-' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2303:28: ( ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '=+' ) | (enumLiteral_3= '-=' ) | (enumLiteral_4= '=-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2304:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '=+' ) | (enumLiteral_3= '-=' ) | (enumLiteral_4= '=-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2304:1: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '+=' ) | (enumLiteral_2= '=+' ) | (enumLiteral_3= '-=' ) | (enumLiteral_4= '=-' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt25=1;
                }
                break;
            case 33:
                {
                alt25=2;
                }
                break;
            case 34:
                {
                alt25=3;
                }
                break;
            case 35:
                {
                alt25=4;
                }
                break;
            case 36:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2304:2: (enumLiteral_0= ':=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2304:2: (enumLiteral_0= ':=' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2304:4: enumLiteral_0= ':='
                    {
                    enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAssignOperator5073); 

                            current = grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2310:6: (enumLiteral_1= '+=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2310:6: (enumLiteral_1= '+=' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2310:8: enumLiteral_1= '+='
                    {
                    enumLiteral_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAssignOperator5090); 

                            current = grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2316:6: (enumLiteral_2= '=+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2316:6: (enumLiteral_2= '=+' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2316:8: enumLiteral_2= '=+'
                    {
                    enumLiteral_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAssignOperator5107); 

                            current = grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2322:6: (enumLiteral_3= '-=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2322:6: (enumLiteral_3= '-=' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2322:8: enumLiteral_3= '-='
                    {
                    enumLiteral_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAssignOperator5124); 

                            current = grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2328:6: (enumLiteral_4= '=-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2328:6: (enumLiteral_4= '=-' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2328:8: enumLiteral_4= '=-'
                    {
                    enumLiteral_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAssignOperator5141); 

                            current = grammarAccess.getAssignOperatorAccess().getEQUAL_MINUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAssignOperatorAccess().getEQUAL_MINUSEnumLiteralDeclaration_4()); 
                        

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


    // $ANTLR start "ruleLogicalOrOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2338:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2340:28: ( (enumLiteral_0= '||' ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2341:1: (enumLiteral_0= '||' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2341:1: (enumLiteral_0= '||' )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2341:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleLogicalOrOperator5185); 

                    current = grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2351:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2353:28: ( (enumLiteral_0= '&&' ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2354:1: (enumLiteral_0= '&&' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2354:1: (enumLiteral_0= '&&' )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2354:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLogicalAndOperator5228); 

                    current = grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleComparingEQNEQOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2364:1: ruleComparingEQNEQOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleComparingEQNEQOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2366:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2367:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2367:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2367:2: (enumLiteral_0= '==' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2367:2: (enumLiteral_0= '==' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2367:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleComparingEQNEQOperator5272); 

                            current = grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2373:6: (enumLiteral_1= '<>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2373:6: (enumLiteral_1= '<>' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2373:8: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleComparingEQNEQOperator5289); 

                            current = grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleComparingEQNEQOperator"


    // $ANTLR start "ruleComparingRelOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2383:1: ruleComparingRelOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleComparingRelOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2385:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2386:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2386:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt27=1;
                }
                break;
            case 42:
                {
                alt27=2;
                }
                break;
            case 43:
                {
                alt27=3;
                }
                break;
            case 44:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2386:2: (enumLiteral_0= '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2386:2: (enumLiteral_0= '<' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2386:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleComparingRelOperator5334); 

                            current = grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2392:6: (enumLiteral_1= '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2392:6: (enumLiteral_1= '<=' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2392:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleComparingRelOperator5351); 

                            current = grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2398:6: (enumLiteral_2= '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2398:6: (enumLiteral_2= '>=' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2398:8: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleComparingRelOperator5368); 

                            current = grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2404:6: (enumLiteral_3= '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2404:6: (enumLiteral_3= '>' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2404:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleComparingRelOperator5385); 

                            current = grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleComparingRelOperator"


    // $ANTLR start "ruleAdditionOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2414:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2416:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2417:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2417:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            else if ( (LA28_0==46) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2417:2: (enumLiteral_0= '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2417:2: (enumLiteral_0= '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2417:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAdditionOperator5430); 

                            current = grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2423:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2423:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2423:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAdditionOperator5447); 

                            current = grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2433:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2435:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2436:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2436:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            else if ( (LA29_0==48) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2436:2: (enumLiteral_0= '*' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2436:2: (enumLiteral_0= '*' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2436:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMultiplicationOperator5492); 

                            current = grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2442:6: (enumLiteral_1= '/' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2442:6: (enumLiteral_1= '/' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2442:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMultiplicationOperator5509); 

                            current = grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "ruleUnaryPreOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2452:1: ruleUnaryPreOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '+' ) ) ;
    public final Enumerator ruleUnaryPreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2454:28: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '+' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2455:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '+' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2455:1: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '+' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt30=1;
                }
                break;
            case 46:
                {
                alt30=2;
                }
                break;
            case 45:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2455:2: (enumLiteral_0= 'not' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2455:2: (enumLiteral_0= 'not' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2455:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleUnaryPreOperator5554); 

                            current = grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2461:6: (enumLiteral_1= '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2461:6: (enumLiteral_1= '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2461:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleUnaryPreOperator5571); 

                            current = grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2467:6: (enumLiteral_2= '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2467:6: (enumLiteral_2= '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2467:8: enumLiteral_2= '+'
                    {
                    enumLiteral_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleUnaryPreOperator5588); 

                            current = grammarAccess.getUnaryPreOperatorAccess().getPLUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getUnaryPreOperatorAccess().getPLUSEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleUnaryPreOperator"


    // $ANTLR start "ruleUnaryPostOperator"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2477:1: ruleUnaryPostOperator returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleUnaryPostOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2479:28: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2480:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2480:1: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            else if ( (LA31_0==32) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2480:2: (enumLiteral_0= '++' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2480:2: (enumLiteral_0= '++' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2480:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleUnaryPostOperator5633); 

                            current = grammarAccess.getUnaryPostOperatorAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryPostOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2486:6: (enumLiteral_1= '--' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2486:6: (enumLiteral_1= '--' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2486:8: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleUnaryPostOperator5650); 

                            current = grammarAccess.getUnaryPostOperatorAccess().getDECREMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryPostOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleUnaryPostOperator"


    // $ANTLR start "rulePositionSelectorKind"
    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2496:1: rulePositionSelectorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) ;
    public final Enumerator rulePositionSelectorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2498:28: ( ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2499:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2499:1: ( (enumLiteral_0= 'self' ) | (enumLiteral_1= 'first' ) | (enumLiteral_2= 'last' ) | (enumLiteral_3= 'prev' ) | (enumLiteral_4= 'next' ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt32=1;
                }
                break;
            case 51:
                {
                alt32=2;
                }
                break;
            case 52:
                {
                alt32=3;
                }
                break;
            case 53:
                {
                alt32=4;
                }
                break;
            case 54:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2499:2: (enumLiteral_0= 'self' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2499:2: (enumLiteral_0= 'self' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2499:4: enumLiteral_0= 'self'
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulePositionSelectorKind5695); 

                            current = grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2505:6: (enumLiteral_1= 'first' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2505:6: (enumLiteral_1= 'first' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2505:8: enumLiteral_1= 'first'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulePositionSelectorKind5712); 

                            current = grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2511:6: (enumLiteral_2= 'last' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2511:6: (enumLiteral_2= 'last' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2511:8: enumLiteral_2= 'last'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulePositionSelectorKind5729); 

                            current = grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2517:6: (enumLiteral_3= 'prev' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2517:6: (enumLiteral_3= 'prev' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2517:8: enumLiteral_3= 'prev'
                    {
                    enumLiteral_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulePositionSelectorKind5746); 

                            current = grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2523:6: (enumLiteral_4= 'next' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2523:6: (enumLiteral_4= 'next' )
                    // ../de.uni_paderborn.fujaba.muml.actionlanguage.xtext/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:2523:8: enumLiteral_4= 'next'
                    {
                    enumLiteral_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePositionSelectorKind5763); 

                            current = grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "rulePositionSelectorKind"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\2\4\10\uffff";
    static final String DFA6_maxS =
        "\1\31\1\44\10\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\1\1\7\1\10";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\12\uffff\1\2\3\uffff\1\3\1\4\1\uffff\1\5\2\uffff\1\6",
            "\1\10\13\uffff\1\11\11\uffff\1\7\1\uffff\1\7\4\uffff\4\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "734:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement | this_ReturnStatement_5= ruleReturnStatement | this_LocalVariableDeclarationStatement_6= ruleLocalVariableDeclarationStatement | this_OperationCallStatement_7= ruleOperationCallStatement )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleBlock142 = new BitSet(new long[]{0x000000000258C010L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_ruleBlock163 = new BitSet(new long[]{0x000000000258C010L});
        public static final BitSet FOLLOW_14_in_ruleBlock176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBlock204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_entryRuleForLoop244 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoop254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleForLoop291 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleForLoop303 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleForLoop324 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoop345 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleForLoop357 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop378 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleForLoop390 = new BitSet(new long[]{0x007E60000259A1F0L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleForLoop411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoopCountingExpression457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_ruleForLoopCountingExpression503 = new BitSet(new long[]{0x0000001F84000000L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperator_in_ruleForLoopCountingExpression525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression553 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopCountingExpression574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop612 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoop622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleWhileLoop659 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleWhileLoop671 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWhileLoop692 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWhileLoop704 = new BitSet(new long[]{0x007E60000259A1F0L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleWhileLoop725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop761 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileLoop771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleDoWhileLoop808 = new BitSet(new long[]{0x007E60000259A1F0L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleDoWhileLoop829 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDoWhileLoop841 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDoWhileLoop853 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDoWhileLoop874 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleDoWhileLoop886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleIfStatement969 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIfStatement981 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement1002 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfStatement1014 = new BitSet(new long[]{0x007E60000259A1F0L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement1035 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleIfStatement1048 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIfStatement1060 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement1081 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfStatement1093 = new BitSet(new long[]{0x007E60000259A1F0L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement1114 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_24_in_ruleIfStatement1129 = new BitSet(new long[]{0x007E60000259A1F0L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement1188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement1198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleReturnStatement1244 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStatement1265 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleReturnStatement1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCallStatement_in_entryRuleOperationCallStatement1313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationCallStatement1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_ruleOperationCallStatement1370 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOperationCallStatement1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule1417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStartRule1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleExpressionStartRule1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_ruleExpressionStartRule1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnStatement_in_ruleExpressionStartRule1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclarationStatement_in_ruleExpressionStartRule1636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCallStatement_in_ruleExpressionStartRule1663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1698 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_ruleAssignment1754 = new BitSet(new long[]{0x0000001F84000000L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleAssignment1775 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1796 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAssignment1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclarationStatement_in_entryRuleLocalVariableDeclarationStatement1844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariableDeclarationStatement1854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_ruleLocalVariableDeclarationStatement1900 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_26_in_ruleLocalVariableDeclarationStatement1913 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLocalVariableDeclarationStatement1934 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLocalVariableDeclarationStatement1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration1984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariableDeclaration1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration2039 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression2107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalExpression_in_ruleExpression2153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalExpression_in_entryRuleLogicalExpression2187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalExpression2197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalExpression2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression2277 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression2287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2334 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression2364 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression2385 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression2423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression2433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression2480 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression2510 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleLogicalAndExpression2531 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression2569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression2579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression2626 = new BitSet(new long[]{0x0000018000000002L});
        public static final BitSet FOLLOW_ruleComparingEQNEQOperator_in_ruleComparisonExpression2656 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleComparisonHigherOpExpression_in_ruleComparisonExpression2677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonHigherOpExpression_in_entryRuleComparisonHigherOpExpression2715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonHigherOpExpression2725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression2772 = new BitSet(new long[]{0x00001E0000000002L});
        public static final BitSet FOLLOW_ruleComparingRelOperator_in_ruleComparisonHigherOpExpression2802 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparisonHigherOpExpression2823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression2861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression2871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleArithmeticExpression2917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression2951 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression2961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3008 = new BitSet(new long[]{0x0000600000000002L});
        public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression3038 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3059 = new BitSet(new long[]{0x0000600000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression3097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression3107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPostExpression_in_ruleMultiplicationExpression3182 = new BitSet(new long[]{0x0001800000000002L});
        public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression3212 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleUnaryPreExpression_in_ruleMultiplicationExpression3235 = new BitSet(new long[]{0x0001800000000002L});
        public static final BitSet FOLLOW_ruleUnaryPostExpression_in_ruleMultiplicationExpression3254 = new BitSet(new long[]{0x0001800000000002L});
        public static final BitSet FOLLOW_ruleUnaryPreExpression_in_entryRuleUnaryPreExpression3296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryPreExpression3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPreOperator_in_ruleUnaryPreExpression3361 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleUnaryPreExpression3382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryPostExpression_in_entryRuleUnaryPostExpression3418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryPostExpression3428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_ruleUnaryPostExpression3475 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_ruleUnaryPostOperator_in_ruleUnaryPostExpression3505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand3543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperand3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleOperand3591 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleOperand3613 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOperand3624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleOperand3653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedTypedNamedElementExpression_in_ruleOperand3680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_ruleOperand3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTriggerMessageExpression_in_ruleOperand3734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoAttributeSelectorExpression_in_ruleOperand3761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression3796 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression3806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_ruleLiteralExpression3861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3898 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMBER_in_ruleLiteral3949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleLiteral3975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral4001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral4027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedTypedNamedElementExpression_in_entryRuleExtendedTypedNamedElementExpression4072 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedTypedNamedElementExpression4082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_ruleExtendedTypedNamedElementExpression4129 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleExtendedTypedNamedElementExpression4150 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_ruleExtendedTypedNamedElementExpression4171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedNamedElementExpression_in_entryRuleTypedNamedElementExpression4209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedNamedElementExpression4219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypedNamedElementExpression4264 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleTypedNamedElementExpression4277 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleTypedNamedElementExpression4298 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleTypedNamedElementExpression4310 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleNoAttributeSelectorExpression_in_entryRuleNoAttributeSelectorExpression4348 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoAttributeSelectorExpression4358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_ruleNoAttributeSelectorExpression4403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_entryRulePositionSelectorExpression4438 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositionSelectorExpression4448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionSelectorKind_in_rulePositionSelectorExpression4494 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_rulePositionSelectorExpression4507 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_rulePositionSelectorExpression_in_rulePositionSelectorExpression4528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationCall_in_entryRuleOperationCall4566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationCall4576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperationCall4621 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOperationCall4633 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_ruleOperationCall4655 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_30_in_ruleOperationCall4668 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_ruleOperationCall4689 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_18_in_ruleOperationCall4705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParamaterBinding_in_entryRuleParamaterBinding4741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParamaterBinding4751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParamaterBinding4805 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleParamaterBinding4817 = new BitSet(new long[]{0x007E6000025981F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParamaterBinding4838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTriggerMessageExpression_in_entryRuleTriggerMessageExpression4874 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTriggerMessageExpression4884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTriggerMessageExpression4929 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTriggerMessageExpression4941 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTriggerMessageExpression4961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleIncrementDecrementOperator5011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleIncrementDecrementOperator5028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAssignOperator5073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAssignOperator5090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleAssignOperator5107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleAssignOperator5124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleAssignOperator5141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleLogicalOrOperator5185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLogicalAndOperator5228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleComparingEQNEQOperator5272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleComparingEQNEQOperator5289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleComparingRelOperator5334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleComparingRelOperator5351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleComparingRelOperator5368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleComparingRelOperator5385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleAdditionOperator5430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleAdditionOperator5447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleMultiplicationOperator5492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleMultiplicationOperator5509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleUnaryPreOperator5554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleUnaryPreOperator5571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleUnaryPreOperator5588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleUnaryPostOperator5633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleUnaryPostOperator5650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulePositionSelectorKind5695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulePositionSelectorKind5712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulePositionSelectorKind5729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulePositionSelectorKind5746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePositionSelectorKind5763 = new BitSet(new long[]{0x0000000000000002L});
    }


}