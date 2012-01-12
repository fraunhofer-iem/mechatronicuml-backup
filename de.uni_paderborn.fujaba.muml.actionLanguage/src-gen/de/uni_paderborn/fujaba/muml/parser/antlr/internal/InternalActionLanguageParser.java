package de.uni_paderborn.fujaba.muml.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import de.uni_paderborn.fujaba.muml.services.ActionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActionLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'for'", "'('", "';'", "')'", "'while'", "'do'", "'if'", "'elseif'", "'else'", "':'", "'='", "':='", "'+='", "'=+'", "'-='", "'=-'", "'++'", "'--'", "'&'", "'&&'", "'|'", "'||'", "'xor'", "'=>'", "'<=>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'<'", "'<='", "'=='", "'>='", "'>'", "'<>'", "'not'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_NUMBER=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalActionLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g"; }



     	private ActionLanguageGrammarAccess grammarAccess;
     	
        public InternalActionLanguageParser(TokenStream input, IAstFactory factory, ActionLanguageGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Block";	
       	}
       	
       	@Override
       	protected ActionLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleBlock
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:78:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:79:2: (iv_ruleBlock= ruleBlock EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:80:2: iv_ruleBlock= ruleBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_entryRuleBlock75);
            iv_ruleBlock=ruleBlock();
            _fsp--;

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
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:87:1: ruleBlock returns [EObject current=null] : ( '{' ( (lv_expressions_1_0= ruleExpressionStartRule ) )* '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:92:6: ( ( '{' ( (lv_expressions_1_0= ruleExpressionStartRule ) )* '}' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:93:1: ( '{' ( (lv_expressions_1_0= ruleExpressionStartRule ) )* '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:93:1: ( '{' ( (lv_expressions_1_0= ruleExpressionStartRule ) )* '}' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:93:3: '{' ( (lv_expressions_1_0= ruleExpressionStartRule ) )* '}'
            {
            match(input,12,FollowSets000.FOLLOW_12_in_ruleBlock120); 

                    createLeafNode(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:97:1: ( (lv_expressions_1_0= ruleExpressionStartRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14||(LA1_0>=18 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:98:1: (lv_expressions_1_0= ruleExpressionStartRule )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:98:1: (lv_expressions_1_0= ruleExpressionStartRule )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:99:3: lv_expressions_1_0= ruleExpressionStartRule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_ruleBlock141);
            	    lv_expressions_1_0=ruleExpressionStartRule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"expressions",
            	    	        		lv_expressions_1_0, 
            	    	        		"ExpressionStartRule", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,13,FollowSets000.FOLLOW_13_in_ruleBlock152); 

                    createLeafNode(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleForLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:133:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:134:2: (iv_ruleForLoop= ruleForLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:135:2: iv_ruleForLoop= ruleForLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForLoopRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_entryRuleForLoop188);
            iv_ruleForLoop=ruleForLoop();
            _fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoop198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleForLoop


    // $ANTLR start ruleForLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:142:1: ruleForLoop returns [EObject current=null] : ( 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) ) ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_initalizeExpression_2_0 = null;

        EObject lv_loopTest_3_0 = null;

        EObject lv_countingExpression_5_0 = null;

        EObject lv_block_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:147:6: ( ( 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:148:1: ( 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:148:1: ( 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:148:3: 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) )
            {
            match(input,14,FollowSets000.FOLLOW_14_in_ruleForLoop233); 

                    createLeafNode(grammarAccess.getForLoopAccess().getForKeyword_0(), null); 
                
            match(input,15,FollowSets000.FOLLOW_15_in_ruleForLoop243); 

                    createLeafNode(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:156:1: ( (lv_initalizeExpression_2_0= ruleAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:157:1: (lv_initalizeExpression_2_0= ruleAssignment )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:157:1: (lv_initalizeExpression_2_0= ruleAssignment )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:158:3: lv_initalizeExpression_2_0= ruleAssignment
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopAccess().getInitalizeExpressionAssignmentParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleForLoop264);
            lv_initalizeExpression_2_0=ruleAssignment();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"initalizeExpression",
            	        		lv_initalizeExpression_2_0, 
            	        		"Assignment", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:180:2: ( (lv_loopTest_3_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:181:1: (lv_loopTest_3_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:181:1: (lv_loopTest_3_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:182:3: lv_loopTest_3_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoop285);
            lv_loopTest_3_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"loopTest",
            	        		lv_loopTest_3_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleForLoop295); 

                    createLeafNode(grammarAccess.getForLoopAccess().getSemicolonKeyword_4(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:208:1: ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:209:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:209:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:210:3: lv_countingExpression_5_0= ruleForLoopCountingExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop316);
            lv_countingExpression_5_0=ruleForLoopCountingExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"countingExpression",
            	        		lv_countingExpression_5_0, 
            	        		"ForLoopCountingExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleForLoop326); 

                    createLeafNode(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:236:1: ( (lv_block_7_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:237:1: (lv_block_7_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:237:1: (lv_block_7_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:238:3: lv_block_7_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleForLoop347);
            lv_block_7_0=ruleBlock();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getForLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"block",
            	        		lv_block_7_0, 
            	        		"Block", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleForLoop


    // $ANTLR start entryRuleWhileLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:268:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:269:2: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:270:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWhileLoopRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop383);
            iv_ruleWhileLoop=ruleWhileLoop();
            _fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhileLoop393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWhileLoop


    // $ANTLR start ruleWhileLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:277:1: ruleWhileLoop returns [EObject current=null] : ( 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_loopTest_2_0 = null;

        EObject lv_block_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:282:6: ( ( 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:283:1: ( 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:283:1: ( 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:283:3: 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) )
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleWhileLoop428); 

                    createLeafNode(grammarAccess.getWhileLoopAccess().getWhileKeyword_0(), null); 
                
            match(input,15,FollowSets000.FOLLOW_15_in_ruleWhileLoop438); 

                    createLeafNode(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:291:1: ( (lv_loopTest_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:292:1: (lv_loopTest_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:292:1: (lv_loopTest_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:293:3: lv_loopTest_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWhileLoop459);
            lv_loopTest_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWhileLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"loopTest",
            	        		lv_loopTest_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleWhileLoop469); 

                    createLeafNode(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:319:1: ( (lv_block_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:320:1: (lv_block_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:320:1: (lv_block_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:321:3: lv_block_4_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleWhileLoop490);
            lv_block_4_0=ruleBlock();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWhileLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"block",
            	        		lv_block_4_0, 
            	        		"Block", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWhileLoop


    // $ANTLR start entryRuleDoWhileLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:351:1: entryRuleDoWhileLoop returns [EObject current=null] : iv_ruleDoWhileLoop= ruleDoWhileLoop EOF ;
    public final EObject entryRuleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:352:2: (iv_ruleDoWhileLoop= ruleDoWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:353:2: iv_ruleDoWhileLoop= ruleDoWhileLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoWhileLoopRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop526);
            iv_ruleDoWhileLoop=ruleDoWhileLoop();
            _fsp--;

             current =iv_ruleDoWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoWhileLoop536); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoWhileLoop


    // $ANTLR start ruleDoWhileLoop
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:360:1: ruleDoWhileLoop returns [EObject current=null] : ( 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')' ) ;
    public final EObject ruleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_block_1_0 = null;

        EObject lv_loopTest_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:365:6: ( ( 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:366:1: ( 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:366:1: ( 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:366:3: 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')'
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleDoWhileLoop571); 

                    createLeafNode(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:370:1: ( (lv_block_1_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:371:1: (lv_block_1_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:371:1: (lv_block_1_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:372:3: lv_block_1_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleDoWhileLoop592);
            lv_block_1_0=ruleBlock();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoWhileLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"block",
            	        		lv_block_1_0, 
            	        		"Block", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FollowSets000.FOLLOW_18_in_ruleDoWhileLoop602); 

                    createLeafNode(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2(), null); 
                
            match(input,15,FollowSets000.FOLLOW_15_in_ruleDoWhileLoop612); 

                    createLeafNode(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:402:1: ( (lv_loopTest_4_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:403:1: (lv_loopTest_4_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:403:1: (lv_loopTest_4_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:404:3: lv_loopTest_4_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDoWhileLoop633);
            lv_loopTest_4_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoWhileLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"loopTest",
            	        		lv_loopTest_4_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleDoWhileLoop643); 

                    createLeafNode(grammarAccess.getDoWhileLoopAccess().getRightParenthesisKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDoWhileLoop


    // $ANTLR start entryRuleIfStatement
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:438:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:439:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:440:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIfStatementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_entryRuleIfStatement679);
            iv_ruleIfStatement=ruleIfStatement();
            _fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfStatement689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIfStatement


    // $ANTLR start ruleIfStatement
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:447:1: ruleIfStatement returns [EObject current=null] : ( 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifCondition_2_0 = null;

        EObject lv_ifBlock_4_0 = null;

        EObject lv_elseIfConditions_7_0 = null;

        EObject lv_elseIfBlocks_9_0 = null;

        EObject lv_elseBlock_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:452:6: ( ( 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:453:1: ( 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:453:1: ( 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:453:3: 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleIfStatement724); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getIfKeyword_0(), null); 
                
            match(input,15,FollowSets000.FOLLOW_15_in_ruleIfStatement734); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:461:1: ( (lv_ifCondition_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:462:1: (lv_ifCondition_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:462:1: (lv_ifCondition_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:463:3: lv_ifCondition_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement755);
            lv_ifCondition_2_0=ruleExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ifCondition",
            	        		lv_ifCondition_2_0, 
            	        		"Expression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleIfStatement765); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:489:1: ( (lv_ifBlock_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:490:1: (lv_ifBlock_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:490:1: (lv_ifBlock_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:491:3: lv_ifBlock_4_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement786);
            lv_ifBlock_4_0=ruleBlock();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"ifBlock",
            	        		lv_ifBlock_4_0, 
            	        		"Block", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:513:2: ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:513:4: 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    {
            	    match(input,21,FollowSets000.FOLLOW_21_in_ruleIfStatement797); 

            	            createLeafNode(grammarAccess.getIfStatementAccess().getElseifKeyword_5_0(), null); 
            	        
            	    match(input,15,FollowSets000.FOLLOW_15_in_ruleIfStatement807); 

            	            createLeafNode(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_5_1(), null); 
            	        
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:521:1: ( (lv_elseIfConditions_7_0= ruleExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:522:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:522:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:523:3: lv_elseIfConditions_7_0= ruleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getElseIfConditionsExpressionParserRuleCall_5_2_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement828);
            	    lv_elseIfConditions_7_0=ruleExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elseIfConditions",
            	    	        		lv_elseIfConditions_7_0, 
            	    	        		"Expression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,17,FollowSets000.FOLLOW_17_in_ruleIfStatement838); 

            	            createLeafNode(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_5_3(), null); 
            	        
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:549:1: ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:550:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:550:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:551:3: lv_elseIfBlocks_9_0= ruleBlock
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getElseIfBlocksBlockParserRuleCall_5_4_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement859);
            	    lv_elseIfBlocks_9_0=ruleBlock();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elseIfBlocks",
            	    	        		lv_elseIfBlocks_9_0, 
            	    	        		"Block", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:573:4: ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:573:6: 'else' ( (lv_elseBlock_11_0= ruleBlock ) )
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleIfStatement872); 

                            createLeafNode(grammarAccess.getIfStatementAccess().getElseKeyword_6_0(), null); 
                        
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:577:1: ( (lv_elseBlock_11_0= ruleBlock ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:578:1: (lv_elseBlock_11_0= ruleBlock )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:578:1: (lv_elseBlock_11_0= ruleBlock )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:579:3: lv_elseBlock_11_0= ruleBlock
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement893);
                    lv_elseBlock_11_0=ruleBlock();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfStatementRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"elseBlock",
                    	        		lv_elseBlock_11_0, 
                    	        		"Block", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIfStatement


    // $ANTLR start entryRuleExpressionStartRule
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:609:1: entryRuleExpressionStartRule returns [EObject current=null] : iv_ruleExpressionStartRule= ruleExpressionStartRule EOF ;
    public final EObject entryRuleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStartRule = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:610:2: (iv_ruleExpressionStartRule= ruleExpressionStartRule EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:611:2: iv_ruleExpressionStartRule= ruleExpressionStartRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionStartRuleRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule931);
            iv_ruleExpressionStartRule=ruleExpressionStartRule();
            _fsp--;

             current =iv_ruleExpressionStartRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionStartRule941); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpressionStartRule


    // $ANTLR start ruleExpressionStartRule
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:618:1: ruleExpressionStartRule returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement ) ;
    public final EObject ruleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_ForLoop_1 = null;

        EObject this_WhileLoop_2 = null;

        EObject this_DoWhileLoop_3 = null;

        EObject this_IfStatement_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:623:6: ( (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:624:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:624:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("624:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:625:5: this_Assignment_0= ruleAssignment
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleExpressionStartRule988);
                    this_Assignment_0=ruleAssignment();
                    _fsp--;

                     
                            current = this_Assignment_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:635:5: this_ForLoop_1= ruleForLoop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_ruleExpressionStartRule1015);
                    this_ForLoop_1=ruleForLoop();
                    _fsp--;

                     
                            current = this_ForLoop_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:645:5: this_WhileLoop_2= ruleWhileLoop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1042);
                    this_WhileLoop_2=ruleWhileLoop();
                    _fsp--;

                     
                            current = this_WhileLoop_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:655:5: this_DoWhileLoop_3= ruleDoWhileLoop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1069);
                    this_DoWhileLoop_3=ruleDoWhileLoop();
                    _fsp--;

                     
                            current = this_DoWhileLoop_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:665:5: this_IfStatement_4= ruleIfStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1096);
                    this_IfStatement_4=ruleIfStatement();
                    _fsp--;

                     
                            current = this_IfStatement_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpressionStartRule


    // $ANTLR start entryRuleAssignment
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:681:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:682:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:683:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment1131);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment1141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:690:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Enumerator lv_assignOperator_1_0 = null;

        EObject lv_assignExpression_2_0 = null;

        Enumerator lv_incrementDecrementOperator_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:695:6: ( ( ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:696:1: ( ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:696:1: ( ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:696:2: ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';'
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:696:2: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:697:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:697:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:698:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment1184); 

            		createLeafNode(grammarAccess.getAssignmentAccess().getAttributeEAttributeCrossReference_0_0(), "attribute"); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:710:2: ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=24 && LA5_0<=29)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=30 && LA5_0<=31)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("710:2: ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:710:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:710:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:710:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:710:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:711:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:711:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:712:3: lv_assignOperator_1_0= ruleAssignOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleAssignment1207);
                    lv_assignOperator_1_0=ruleAssignOperator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"assignOperator",
                    	        		lv_assignOperator_1_0, 
                    	        		"AssignOperator", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:734:2: ( (lv_assignExpression_2_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:735:1: (lv_assignExpression_2_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:735:1: (lv_assignExpression_2_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:736:3: lv_assignExpression_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getAssignExpressionExpressionParserRuleCall_1_0_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment1228);
                    lv_assignExpression_2_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"assignExpression",
                    	        		lv_assignExpression_2_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:759:6: ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:759:6: ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:760:1: (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:760:1: (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:761:3: lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperator_in_ruleAssignment1256);
                    lv_incrementDecrementOperator_3_0=ruleIncrementDecrementOperator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"incrementDecrementOperator",
                    	        		lv_incrementDecrementOperator_3_0, 
                    	        		"IncrementDecrementOperator", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleAssignment1267); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleForLoopCountingExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:795:1: entryRuleForLoopCountingExpression returns [EObject current=null] : iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF ;
    public final EObject entryRuleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopCountingExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:796:2: (iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:797:2: iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForLoopCountingExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression1303);
            iv_ruleForLoopCountingExpression=ruleForLoopCountingExpression();
            _fsp--;

             current =iv_ruleForLoopCountingExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoopCountingExpression1313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleForLoopCountingExpression


    // $ANTLR start ruleForLoopCountingExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:804:1: ruleForLoopCountingExpression returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_incrementDecrementOperator_1_0 = null;

        Enumerator lv_assignOperator_2_0 = null;

        EObject lv_assignExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:809:6: ( ( ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:810:1: ( ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:810:1: ( ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:810:2: ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:810:2: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:811:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:811:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:812:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getForLoopCountingExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleForLoopCountingExpression1356); 

            		createLeafNode(grammarAccess.getForLoopCountingExpressionAccess().getAttributeEAttributeCrossReference_0_0(), "attribute"); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:824:2: ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=30 && LA6_0<=31)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=24 && LA6_0<=29)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("824:2: ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:824:3: ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:824:3: ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:825:1: (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:825:1: (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:826:3: lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperator_in_ruleForLoopCountingExpression1378);
                    lv_incrementDecrementOperator_1_0=ruleIncrementDecrementOperator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getForLoopCountingExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"incrementDecrementOperator",
                    	        		lv_incrementDecrementOperator_1_0, 
                    	        		"IncrementDecrementOperator", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:849:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:849:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:849:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:849:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:850:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:850:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:851:3: lv_assignOperator_2_0= ruleAssignOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression1406);
                    lv_assignOperator_2_0=ruleAssignOperator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getForLoopCountingExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"assignOperator",
                    	        		lv_assignOperator_2_0, 
                    	        		"AssignOperator", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:873:2: ( (lv_assignExpression_3_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:874:1: (lv_assignExpression_3_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:874:1: (lv_assignExpression_3_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:875:3: lv_assignExpression_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignExpressionExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoopCountingExpression1427);
                    lv_assignExpression_3_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getForLoopCountingExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"assignExpression",
                    	        		lv_assignExpression_3_0, 
                    	        		"Expression", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleForLoopCountingExpression


    // $ANTLR start entryRuleExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:905:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:906:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:907:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1465);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1475); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:914:1: ruleExpression returns [EObject current=null] : this_ArithmeticExpression_0= ruleArithmeticExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:919:6: (this_ArithmeticExpression_0= ruleArithmeticExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:921:5: this_ArithmeticExpression_0= ruleArithmeticExpression
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArithmeticExpressionParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleExpression1521);
            this_ArithmeticExpression_0=ruleArithmeticExpression();
            _fsp--;

             
                    current = this_ArithmeticExpression_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleArithmeticExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:937:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:938:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:939:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArithmeticExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression1555);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();
            _fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArithmeticExpression1565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArithmeticExpression


    // $ANTLR start ruleArithmeticExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:946:1: ruleArithmeticExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:951:6: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:952:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:952:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:953:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getArithmeticExpressionAccess().getComparisonExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1612);
            this_ComparisonExpression_0=ruleComparisonExpression();
            _fsp--;

             
                    current = this_ComparisonExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:961:1: ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=39 && LA7_0<=44)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:961:2: () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:961:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:962:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftExpression", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getArithmeticExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:977:2: ( (lv_operator_2_0= ruleArithmeticOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:978:1: (lv_operator_2_0= ruleArithmeticOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:978:1: (lv_operator_2_0= ruleArithmeticOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:979:3: lv_operator_2_0= ruleArithmeticOperator
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArithmeticExpressionAccess().getOperatorArithmeticOperatorEnumRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArithmeticOperator_in_ruleArithmeticExpression1642);
            	    lv_operator_2_0=ruleArithmeticOperator();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArithmeticExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"operator",
            	    	        		lv_operator_2_0, 
            	    	        		"ArithmeticOperator", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1001:2: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1002:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1002:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1003:3: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArithmeticExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1663);
            	    lv_rightExpression_3_0=ruleComparisonExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getArithmeticExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightExpression",
            	    	        		lv_rightExpression_3_0, 
            	    	        		"ComparisonExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArithmeticExpression


    // $ANTLR start entryRuleComparisonExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1033:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1034:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1035:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComparisonExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1701);
            iv_ruleComparisonExpression=ruleComparisonExpression();
            _fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression1711); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComparisonExpression


    // $ANTLR start ruleComparisonExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1042:1: ruleComparisonExpression returns [EObject current=null] : (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryLogicExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1047:6: ( (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1048:1: (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1048:1: (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1049:5: this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getComparisonExpressionAccess().getBinaryLogicExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1758);
            this_BinaryLogicExpression_0=ruleBinaryLogicExpression();
            _fsp--;

             
                    current = this_BinaryLogicExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1057:1: ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=45 && LA8_0<=50)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1057:2: ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1057:2: ( () ( (lv_operator_2_0= ruleComparingOperator ) ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1057:3: () ( (lv_operator_2_0= ruleComparingOperator ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1057:3: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1058:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftExpression", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1073:2: ( (lv_operator_2_0= ruleComparingOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1074:1: (lv_operator_2_0= ruleComparingOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1074:1: (lv_operator_2_0= ruleComparingOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1075:3: lv_operator_2_0= ruleComparingOperator
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingOperatorEnumRuleCall_1_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_ruleComparisonExpression1789);
            	    lv_operator_2_0=ruleComparingOperator();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getComparisonExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"operator",
            	    	        		lv_operator_2_0, 
            	    	        		"ComparingOperator", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1097:3: ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1098:1: (lv_rightExpression_3_0= ruleBinaryLogicExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1098:1: (lv_rightExpression_3_0= ruleBinaryLogicExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1099:3: lv_rightExpression_3_0= ruleBinaryLogicExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionBinaryLogicExpressionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1811);
            	    lv_rightExpression_3_0=ruleBinaryLogicExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getComparisonExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"rightExpression",
            	    	        		lv_rightExpression_3_0, 
            	    	        		"BinaryLogicExpression", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComparisonExpression


    // $ANTLR start entryRuleBinaryLogicExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1129:1: entryRuleBinaryLogicExpression returns [EObject current=null] : iv_ruleBinaryLogicExpression= ruleBinaryLogicExpression EOF ;
    public final EObject entryRuleBinaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryLogicExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1130:2: (iv_ruleBinaryLogicExpression= ruleBinaryLogicExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1131:2: iv_ruleBinaryLogicExpression= ruleBinaryLogicExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBinaryLogicExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_entryRuleBinaryLogicExpression1849);
            iv_ruleBinaryLogicExpression=ruleBinaryLogicExpression();
            _fsp--;

             current =iv_ruleBinaryLogicExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryLogicExpression1859); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBinaryLogicExpression


    // $ANTLR start ruleBinaryLogicExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1138:1: ruleBinaryLogicExpression returns [EObject current=null] : ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* ) ;
    public final EObject ruleBinaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject this_AttributeExpression_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_1 = null;

        EObject lv_rightExpression_4_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1143:6: ( ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1144:1: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1144:1: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1144:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )*
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1144:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=39 && LA9_0<=40)||LA9_0==51) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_NUMBER)||LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1144:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1145:5: this_UnaryExpression_0= ruleUnaryExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getUnaryExpressionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1907);
                    this_UnaryExpression_0=ruleUnaryExpression();
                    _fsp--;

                     
                            current = this_UnaryExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1155:5: this_AttributeExpression_1= ruleAttributeExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getAttributeExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression1934);
                    this_AttributeExpression_1=ruleAttributeExpression();
                    _fsp--;

                     
                            current = this_AttributeExpression_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1163:2: ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=32 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1163:3: ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1163:3: ( () ( (lv_operator_3_0= ruleLogicOperator ) ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1163:4: () ( (lv_operator_3_0= ruleLogicOperator ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1163:4: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1164:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getBinaryLogicExpressionAccess().getBinaryLogicExpressionLeftExpressionAction_1_0_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "leftExpression", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getBinaryLogicExpressionLeftExpressionAction_1_0_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1179:2: ( (lv_operator_3_0= ruleLogicOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1180:1: (lv_operator_3_0= ruleLogicOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1180:1: (lv_operator_3_0= ruleLogicOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1181:3: lv_operator_3_0= ruleLogicOperator
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicOperator_in_ruleBinaryLogicExpression1966);
            	    lv_operator_3_0=ruleLogicOperator();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBinaryLogicExpressionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"operator",
            	    	        		lv_operator_3_0, 
            	    	        		"LogicOperator", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1203:3: ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1204:1: ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1204:1: ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1205:1: (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1205:1: (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>=39 && LA10_0<=40)||LA10_0==51) ) {
            	        alt10=1;
            	    }
            	    else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_NUMBER)||LA10_0==15) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1205:1: (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression )", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1206:3: lv_rightExpression_4_1= ruleUnaryExpression
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_1_0_0(), currentNode); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1990);
            	            lv_rightExpression_4_1=ruleUnaryExpression();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getBinaryLogicExpressionRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		set(
            	            	       			current, 
            	            	       			"rightExpression",
            	            	        		lv_rightExpression_4_1, 
            	            	        		"UnaryExpression", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1227:8: lv_rightExpression_4_2= ruleAttributeExpression
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAttributeExpressionParserRuleCall_1_1_0_1(), currentNode); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression2009);
            	            lv_rightExpression_4_2=ruleAttributeExpression();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getBinaryLogicExpressionRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        try {
            	            	       		set(
            	            	       			current, 
            	            	       			"rightExpression",
            	            	        		lv_rightExpression_4_2, 
            	            	        		"AttributeExpression", 
            	            	        		currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBinaryLogicExpression


    // $ANTLR start entryRuleUnaryExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1259:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1260:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1261:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2050);
            iv_ruleUnaryExpression=ruleUnaryExpression();
            _fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression2060); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnaryExpression


    // $ANTLR start ruleUnaryExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1268:1: ruleUnaryExpression returns [EObject current=null] : ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unaryOperator_1_0 = null;

        EObject lv_unaryExpression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1273:6: ( ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1274:1: ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1274:1: ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1274:2: () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1274:2: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1275:5: 
            {
             
                    temp=factory.create(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1285:2: ( (lv_unaryOperator_1_0= ruleUnaryOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1286:1: (lv_unaryOperator_1_0= ruleUnaryOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1286:1: (lv_unaryOperator_1_0= ruleUnaryOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1287:3: lv_unaryOperator_1_0= ruleUnaryOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression2115);
            lv_unaryOperator_1_0=ruleUnaryOperator();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUnaryExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"unaryOperator",
            	        		lv_unaryOperator_1_0, 
            	        		"UnaryOperator", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1309:2: ( (lv_unaryExpression_2_0= ruleAttributeExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1310:1: (lv_unaryExpression_2_0= ruleAttributeExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1310:1: (lv_unaryExpression_2_0= ruleAttributeExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1311:3: lv_unaryExpression_2_0= ruleAttributeExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAttributeExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_ruleUnaryExpression2136);
            lv_unaryExpression_2_0=ruleAttributeExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUnaryExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"unaryExpression",
            	        		lv_unaryExpression_2_0, 
            	        		"AttributeExpression", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnaryExpression


    // $ANTLR start entryRuleLiteralExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1341:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1342:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1343:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2172);
            iv_ruleLiteralExpression=ruleLiteralExpression();
            _fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralExpression2182); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLiteralExpression


    // $ANTLR start ruleLiteralExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1350:1: ruleLiteralExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ':' ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1355:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ':' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1356:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ':' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1356:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ':' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_NUMBER) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1356:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ':' ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1356:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1356:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1356:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleLiteralExpression2218); 

                            createLeafNode(grammarAccess.getLiteralExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLiteralExpression2240);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleLiteralExpression2249); 

                            createLeafNode(grammarAccess.getLiteralExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1374:6: ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ':' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1374:6: ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ':' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1374:7: () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ':'
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1374:7: ()
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1375:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1385:2: ( (lv_value_4_0= ruleIdentifierOrValue ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1386:1: (lv_value_4_0= ruleIdentifierOrValue )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1386:1: (lv_value_4_0= ruleIdentifierOrValue )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1387:3: lv_value_4_0= ruleIdentifierOrValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralExpressionAccess().getValueIdentifierOrValueParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifierOrValue_in_ruleLiteralExpression2287);
                    lv_value_4_0=ruleIdentifierOrValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLiteralExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_4_0, 
                    	        		"IdentifierOrValue", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,23,FollowSets000.FOLLOW_23_in_ruleLiteralExpression2297); 

                            createLeafNode(grammarAccess.getLiteralExpressionAccess().getColonKeyword_1_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLiteralExpression


    // $ANTLR start entryRuleAttributeExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1421:1: entryRuleAttributeExpression returns [EObject current=null] : iv_ruleAttributeExpression= ruleAttributeExpression EOF ;
    public final EObject entryRuleAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1422:2: (iv_ruleAttributeExpression= ruleAttributeExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1423:2: iv_ruleAttributeExpression= ruleAttributeExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_entryRuleAttributeExpression2334);
            iv_ruleAttributeExpression=ruleAttributeExpression();
            _fsp--;

             current =iv_ruleAttributeExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeExpression2344); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttributeExpression


    // $ANTLR start ruleAttributeExpression
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1430:1: ruleAttributeExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) ) ;
    public final EObject ruleAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1435:6: ( (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1436:1: (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1436:1: (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_NUMBER||LA13_0==15) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1436:1: (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1437:5: this_LiteralExpression_0= ruleLiteralExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeExpressionAccess().getLiteralExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_ruleAttributeExpression2391);
                    this_LiteralExpression_0=ruleLiteralExpression();
                    _fsp--;

                     
                            current = this_LiteralExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1446:6: ( () ( ( RULE_ID ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1446:6: ( () ( ( RULE_ID ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1446:7: () ( ( RULE_ID ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1446:7: ()
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1447:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getAttributeExpressionAccess().getAttributeExpressionAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getAttributeExpressionAccess().getAttributeExpressionAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1457:2: ( ( RULE_ID ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1458:1: ( RULE_ID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1458:1: ( RULE_ID )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1459:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAttributeExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeExpression2424); 

                    		createLeafNode(grammarAccess.getAttributeExpressionAccess().getAttributeEAttributeCrossReference_1_1_0(), "attribute"); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttributeExpression


    // $ANTLR start entryRuleIdentifierOrValue
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1479:1: entryRuleIdentifierOrValue returns [String current=null] : iv_ruleIdentifierOrValue= ruleIdentifierOrValue EOF ;
    public final String entryRuleIdentifierOrValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifierOrValue = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1480:2: (iv_ruleIdentifierOrValue= ruleIdentifierOrValue EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1481:2: iv_ruleIdentifierOrValue= ruleIdentifierOrValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIdentifierOrValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifierOrValue_in_entryRuleIdentifierOrValue2462);
            iv_ruleIdentifierOrValue=ruleIdentifierOrValue();
            _fsp--;

             current =iv_ruleIdentifierOrValue.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifierOrValue2473); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIdentifierOrValue


    // $ANTLR start ruleIdentifierOrValue
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1488:1: ruleIdentifierOrValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NUMBER_0= RULE_NUMBER ;
    public final AntlrDatatypeRuleToken ruleIdentifierOrValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUMBER_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1493:6: (this_NUMBER_0= RULE_NUMBER )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1494:5: this_NUMBER_0= RULE_NUMBER
            {
            this_NUMBER_0=(Token)input.LT(1);
            match(input,RULE_NUMBER,FollowSets000.FOLLOW_RULE_NUMBER_in_ruleIdentifierOrValue2512); 

            		current.merge(this_NUMBER_0);
                
             
                createLeafNode(grammarAccess.getIdentifierOrValueAccess().getNUMBERTerminalRuleCall(), null); 
                

            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIdentifierOrValue


    // $ANTLR start ruleAssignOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1509:1: ruleAssignOperator returns [Enumerator current=null] : ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1513:6: ( ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1514:1: ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1514:1: ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt14=1;
                }
                break;
            case 25:
                {
                alt14=2;
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            case 27:
                {
                alt14=4;
                }
                break;
            case 28:
                {
                alt14=5;
                }
                break;
            case 29:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1514:1: ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1514:2: ( '=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1514:2: ( '=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1514:4: '='
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleAssignOperator2568); 

                            current = grammarAccess.getAssignOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getEQUALEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1520:6: ( ':=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1520:6: ( ':=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1520:8: ':='
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_ruleAssignOperator2583); 

                            current = grammarAccess.getAssignOperatorAccess().getASSIGN2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getASSIGN2EnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1526:6: ( '+=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1526:6: ( '+=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1526:8: '+='
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleAssignOperator2598); 

                            current = grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1532:6: ( '=+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1532:6: ( '=+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1532:8: '=+'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleAssignOperator2613); 

                            current = grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1538:6: ( '-=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1538:6: ( '-=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1538:8: '-='
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleAssignOperator2628); 

                            current = grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1544:6: ( '=-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1544:6: ( '=-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1544:8: '=-'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleAssignOperator2643); 

                            current = grammarAccess.getAssignOperatorAccess().getEQUAL_MINUSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getEQUAL_MINUSEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignOperator


    // $ANTLR start ruleIncrementDecrementOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1554:1: ruleIncrementDecrementOperator returns [Enumerator current=null] : ( ( '++' ) | ( '--' ) ) ;
    public final Enumerator ruleIncrementDecrementOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1558:6: ( ( ( '++' ) | ( '--' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1559:1: ( ( '++' ) | ( '--' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1559:1: ( ( '++' ) | ( '--' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==31) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1559:1: ( ( '++' ) | ( '--' ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1559:2: ( '++' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1559:2: ( '++' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1559:4: '++'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleIncrementDecrementOperator2686); 

                            current = grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1565:6: ( '--' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1565:6: ( '--' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1565:8: '--'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleIncrementDecrementOperator2701); 

                            current = grammarAccess.getIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIncrementDecrementOperator


    // $ANTLR start ruleLogicOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1575:1: ruleLogicOperator returns [Enumerator current=null] : ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1579:6: ( ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:1: ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:1: ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
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
            case 36:
                {
                alt16=5;
                }
                break;
            case 37:
                {
                alt16=6;
                }
                break;
            case 38:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1580:1: ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:2: ( '&' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:2: ( '&' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:4: '&'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleLogicOperator2744); 

                            current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1586:6: ( '&&' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1586:6: ( '&&' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1586:8: '&&'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleLogicOperator2759); 

                            current = grammarAccess.getLogicOperatorAccess().getAND_ANDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getAND_ANDEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1592:6: ( '|' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1592:6: ( '|' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1592:8: '|'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleLogicOperator2774); 

                            current = grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1598:6: ( '||' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1598:6: ( '||' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1598:8: '||'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleLogicOperator2789); 

                            current = grammarAccess.getLogicOperatorAccess().getOR_OREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getOR_OREnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1604:6: ( 'xor' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1604:6: ( 'xor' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1604:8: 'xor'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleLogicOperator2804); 

                            current = grammarAccess.getLogicOperatorAccess().getXOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getXOREnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1610:6: ( '=>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1610:6: ( '=>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1610:8: '=>'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleLogicOperator2819); 

                            current = grammarAccess.getLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1616:6: ( '<=>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1616:6: ( '<=>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1616:8: '<=>'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleLogicOperator2834); 

                            current = grammarAccess.getLogicOperatorAccess().getEQUIVALENTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getEQUIVALENTEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLogicOperator


    // $ANTLR start ruleArithmeticOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1626:1: ruleArithmeticOperator returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) ) ;
    public final Enumerator ruleArithmeticOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1630:6: ( ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1631:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1631:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            case 42:
                {
                alt17=4;
                }
                break;
            case 43:
                {
                alt17=5;
                }
                break;
            case 44:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1631:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1631:2: ( '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1631:2: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1631:4: '+'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleArithmeticOperator2877); 

                            current = grammarAccess.getArithmeticOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getPLUSEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1637:6: ( '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1637:6: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1637:8: '-'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleArithmeticOperator2892); 

                            current = grammarAccess.getArithmeticOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getMINUSEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1643:6: ( '*' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1643:6: ( '*' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1643:8: '*'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleArithmeticOperator2907); 

                            current = grammarAccess.getArithmeticOperatorAccess().getTIMESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getTIMESEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1649:6: ( '/' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1649:6: ( '/' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1649:8: '/'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleArithmeticOperator2922); 

                            current = grammarAccess.getArithmeticOperatorAccess().getDIVIDEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getDIVIDEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1655:6: ( '%' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1655:6: ( '%' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1655:8: '%'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleArithmeticOperator2937); 

                            current = grammarAccess.getArithmeticOperatorAccess().getMODULOEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getMODULOEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1661:6: ( '^' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1661:6: ( '^' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1661:8: '^'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleArithmeticOperator2952); 

                            current = grammarAccess.getArithmeticOperatorAccess().getEXPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getEXPEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArithmeticOperator


    // $ANTLR start ruleComparingOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1671:1: ruleComparingOperator returns [Enumerator current=null] : ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) ) ;
    public final Enumerator ruleComparingOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1675:6: ( ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1676:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1676:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt18=1;
                }
                break;
            case 46:
                {
                alt18=2;
                }
                break;
            case 47:
                {
                alt18=3;
                }
                break;
            case 48:
                {
                alt18=4;
                }
                break;
            case 49:
                {
                alt18=5;
                }
                break;
            case 50:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1676:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1676:2: ( '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1676:2: ( '<' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1676:4: '<'
                    {
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleComparingOperator2995); 

                            current = grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1682:6: ( '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1682:6: ( '<=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1682:8: '<='
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleComparingOperator3010); 

                            current = grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1688:6: ( '==' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1688:6: ( '==' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1688:8: '=='
                    {
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleComparingOperator3025); 

                            current = grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1694:6: ( '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1694:6: ( '>=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1694:8: '>='
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleComparingOperator3040); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1700:6: ( '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1700:6: ( '>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1700:8: '>'
                    {
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleComparingOperator3055); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1706:6: ( '<>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1706:6: ( '<>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1706:8: '<>'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleComparingOperator3070); 

                            current = grammarAccess.getComparingOperatorAccess().getUNEQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getUNEQUALEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComparingOperator


    // $ANTLR start ruleUnaryOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1716:1: ruleUnaryOperator returns [Enumerator current=null] : ( ( 'not' ) | ( '-' ) | ( '+' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1720:6: ( ( ( 'not' ) | ( '-' ) | ( '+' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1721:1: ( ( 'not' ) | ( '-' ) | ( '+' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1721:1: ( ( 'not' ) | ( '-' ) | ( '+' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt19=1;
                }
                break;
            case 40:
                {
                alt19=2;
                }
                break;
            case 39:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1721:1: ( ( 'not' ) | ( '-' ) | ( '+' ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1721:2: ( 'not' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1721:2: ( 'not' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1721:4: 'not'
                    {
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleUnaryOperator3113); 

                            current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1727:6: ( '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1727:6: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1727:8: '-'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleUnaryOperator3128); 

                            current = grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1733:6: ( '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1733:6: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1733:8: '+'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleUnaryOperator3143); 

                            current = grammarAccess.getUnaryOperatorAccess().getPLUSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnaryOperatorAccess().getPLUSEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnaryOperator


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlock85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleBlock120 = new BitSet(new long[]{0x00000000001C6010L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_ruleBlock141 = new BitSet(new long[]{0x00000000001C6010L});
        public static final BitSet FOLLOW_13_in_ruleBlock152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_entryRuleForLoop188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoop198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleForLoop233 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleForLoop243 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleForLoop264 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoop285 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleForLoop295 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop316 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleForLoop326 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleForLoop347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoop393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleWhileLoop428 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWhileLoop438 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWhileLoop459 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleWhileLoop469 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleWhileLoop490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop526 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileLoop536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleDoWhileLoop571 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleDoWhileLoop592 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDoWhileLoop602 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDoWhileLoop612 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDoWhileLoop633 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDoWhileLoop643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleIfStatement724 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIfStatement734 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement755 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleIfStatement765 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement786 = new BitSet(new long[]{0x0000000000600002L});
        public static final BitSet FOLLOW_21_in_ruleIfStatement797 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIfStatement807 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement828 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleIfStatement838 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement859 = new BitSet(new long[]{0x0000000000600002L});
        public static final BitSet FOLLOW_22_in_ruleIfStatement872 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStartRule941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleExpressionStartRule988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_ruleExpressionStartRule1015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1184 = new BitSet(new long[]{0x00000000FF000000L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleAssignment1207 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1228 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperator_in_ruleAssignment1256 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAssignment1267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression1303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoopCountingExpression1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForLoopCountingExpression1356 = new BitSet(new long[]{0x00000000FF000000L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperator_in_ruleForLoopCountingExpression1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression1406 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopCountingExpression1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleExpression1521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression1555 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression1565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1612 = new BitSet(new long[]{0x00001F8000000002L});
        public static final BitSet FOLLOW_ruleArithmeticOperator_in_ruleArithmeticExpression1642 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1663 = new BitSet(new long[]{0x00001F8000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression1711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1758 = new BitSet(new long[]{0x0007E00000000002L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_ruleComparisonExpression1789 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1811 = new BitSet(new long[]{0x0007E00000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_entryRuleBinaryLogicExpression1849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryLogicExpression1859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1907 = new BitSet(new long[]{0x0000007F00000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression1934 = new BitSet(new long[]{0x0000007F00000002L});
        public static final BitSet FOLLOW_ruleLogicOperator_in_ruleBinaryLogicExpression1966 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1990 = new BitSet(new long[]{0x0000007F00000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression2009 = new BitSet(new long[]{0x0000007F00000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression2115 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_ruleUnaryExpression2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleLiteralExpression2218 = new BitSet(new long[]{0x0008018000008030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLiteralExpression2240 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLiteralExpression2249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifierOrValue_in_ruleLiteralExpression2287 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleLiteralExpression2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_entryRuleAttributeExpression2334 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeExpression2344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleAttributeExpression2391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeExpression2424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifierOrValue_in_entryRuleIdentifierOrValue2462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierOrValue2473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifierOrValue2512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAssignOperator2568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleAssignOperator2583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAssignOperator2598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAssignOperator2613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAssignOperator2628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAssignOperator2643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleIncrementDecrementOperator2686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleIncrementDecrementOperator2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleLogicOperator2744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleLogicOperator2759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleLogicOperator2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleLogicOperator2789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleLogicOperator2804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleLogicOperator2819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLogicOperator2834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleArithmeticOperator2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleArithmeticOperator2892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleArithmeticOperator2907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleArithmeticOperator2922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleArithmeticOperator2937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleArithmeticOperator2952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleComparingOperator2995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleComparingOperator3010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleComparingOperator3025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleComparingOperator3040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleComparingOperator3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleComparingOperator3070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleUnaryOperator3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleUnaryOperator3128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleUnaryOperator3143 = new BitSet(new long[]{0x0000000000000002L});
    }


}