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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'for'", "'('", "';'", "')'", "'while'", "'do'", "'if'", "'elseif'", "'else'", "'='", "':='", "'+='", "'=+'", "'-='", "'=-'", "'++'", "'--'", "'&'", "'&&'", "'|'", "'||'", "'xor'", "'=>'", "'<=>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'<'", "'<='", "'=='", "'>='", "'>'", "'<>'", "'not'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=8;
    public static final int RULE_NUMBER=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=7;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:87:1: ruleBlock returns [EObject current=null] : ( () '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:92:6: ( ( () '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* '}' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:93:1: ( () '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* '}' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:93:1: ( () '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* '}' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:93:2: () '{' ( (lv_expressions_2_0= ruleExpressionStartRule ) )* '}'
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:93:2: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:94:5: 
            {
             
                    temp=factory.create(grammarAccess.getBlockAccess().getBlockAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBlockAccess().getBlockAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleBlock129); 

                    createLeafNode(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:108:1: ( (lv_expressions_2_0= ruleExpressionStartRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==15||(LA1_0>=19 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:109:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:109:1: (lv_expressions_2_0= ruleExpressionStartRule )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:110:3: lv_expressions_2_0= ruleExpressionStartRule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_ruleBlock150);
            	    lv_expressions_2_0=ruleExpressionStartRule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"expressions",
            	    	        		lv_expressions_2_0, 
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

            match(input,14,FollowSets000.FOLLOW_14_in_ruleBlock161); 

                    createLeafNode(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3(), null); 
                

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:144:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:145:2: (iv_ruleForLoop= ruleForLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:146:2: iv_ruleForLoop= ruleForLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForLoopRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_entryRuleForLoop197);
            iv_ruleForLoop=ruleForLoop();
            _fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoop207); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:153:1: ruleForLoop returns [EObject current=null] : ( 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) ) ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_initalizeExpression_2_0 = null;

        EObject lv_loopTest_3_0 = null;

        EObject lv_countingExpression_5_0 = null;

        EObject lv_block_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:158:6: ( ( 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:159:1: ( 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:159:1: ( 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:159:3: 'for' '(' ( (lv_initalizeExpression_2_0= ruleAssignment ) ) ( (lv_loopTest_3_0= ruleExpression ) ) ';' ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) ) ')' ( (lv_block_7_0= ruleBlock ) )
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleForLoop242); 

                    createLeafNode(grammarAccess.getForLoopAccess().getForKeyword_0(), null); 
                
            match(input,16,FollowSets000.FOLLOW_16_in_ruleForLoop252); 

                    createLeafNode(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:167:1: ( (lv_initalizeExpression_2_0= ruleAssignment ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:168:1: (lv_initalizeExpression_2_0= ruleAssignment )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:168:1: (lv_initalizeExpression_2_0= ruleAssignment )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:169:3: lv_initalizeExpression_2_0= ruleAssignment
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopAccess().getInitalizeExpressionAssignmentParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleForLoop273);
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

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:191:2: ( (lv_loopTest_3_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:192:1: (lv_loopTest_3_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:192:1: (lv_loopTest_3_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:193:3: lv_loopTest_3_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoop294);
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

            match(input,17,FollowSets000.FOLLOW_17_in_ruleForLoop304); 

                    createLeafNode(grammarAccess.getForLoopAccess().getSemicolonKeyword_4(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:219:1: ( (lv_countingExpression_5_0= ruleForLoopCountingExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:220:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:220:1: (lv_countingExpression_5_0= ruleForLoopCountingExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:221:3: lv_countingExpression_5_0= ruleForLoopCountingExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop325);
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

            match(input,18,FollowSets000.FOLLOW_18_in_ruleForLoop335); 

                    createLeafNode(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:247:1: ( (lv_block_7_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:248:1: (lv_block_7_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:248:1: (lv_block_7_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:249:3: lv_block_7_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleForLoop356);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:279:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:280:2: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:281:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWhileLoopRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop392);
            iv_ruleWhileLoop=ruleWhileLoop();
            _fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhileLoop402); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:288:1: ruleWhileLoop returns [EObject current=null] : ( 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) ) ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_loopTest_2_0 = null;

        EObject lv_block_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:293:6: ( ( 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:294:1: ( 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:294:1: ( 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:294:3: 'while' '(' ( (lv_loopTest_2_0= ruleExpression ) ) ')' ( (lv_block_4_0= ruleBlock ) )
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleWhileLoop437); 

                    createLeafNode(grammarAccess.getWhileLoopAccess().getWhileKeyword_0(), null); 
                
            match(input,16,FollowSets000.FOLLOW_16_in_ruleWhileLoop447); 

                    createLeafNode(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:302:1: ( (lv_loopTest_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:303:1: (lv_loopTest_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:303:1: (lv_loopTest_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:304:3: lv_loopTest_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleWhileLoop468);
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

            match(input,18,FollowSets000.FOLLOW_18_in_ruleWhileLoop478); 

                    createLeafNode(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:330:1: ( (lv_block_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:331:1: (lv_block_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:331:1: (lv_block_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:332:3: lv_block_4_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleWhileLoop499);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:362:1: entryRuleDoWhileLoop returns [EObject current=null] : iv_ruleDoWhileLoop= ruleDoWhileLoop EOF ;
    public final EObject entryRuleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileLoop = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:363:2: (iv_ruleDoWhileLoop= ruleDoWhileLoop EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:364:2: iv_ruleDoWhileLoop= ruleDoWhileLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoWhileLoopRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop535);
            iv_ruleDoWhileLoop=ruleDoWhileLoop();
            _fsp--;

             current =iv_ruleDoWhileLoop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoWhileLoop545); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:371:1: ruleDoWhileLoop returns [EObject current=null] : ( 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')' ) ;
    public final EObject ruleDoWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_block_1_0 = null;

        EObject lv_loopTest_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:376:6: ( ( 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:377:1: ( 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:377:1: ( 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:377:3: 'do' ( (lv_block_1_0= ruleBlock ) ) 'while' '(' ( (lv_loopTest_4_0= ruleExpression ) ) ')'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleDoWhileLoop580); 

                    createLeafNode(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:381:1: ( (lv_block_1_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:382:1: (lv_block_1_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:382:1: (lv_block_1_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:383:3: lv_block_1_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleDoWhileLoop601);
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

            match(input,19,FollowSets000.FOLLOW_19_in_ruleDoWhileLoop611); 

                    createLeafNode(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2(), null); 
                
            match(input,16,FollowSets000.FOLLOW_16_in_ruleDoWhileLoop621); 

                    createLeafNode(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:413:1: ( (lv_loopTest_4_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:414:1: (lv_loopTest_4_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:414:1: (lv_loopTest_4_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:415:3: lv_loopTest_4_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDoWhileLoop642);
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

            match(input,18,FollowSets000.FOLLOW_18_in_ruleDoWhileLoop652); 

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:449:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:450:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:451:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIfStatementRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_entryRuleIfStatement688);
            iv_ruleIfStatement=ruleIfStatement();
            _fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfStatement698); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:458:1: ruleIfStatement returns [EObject current=null] : ( 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifCondition_2_0 = null;

        EObject lv_ifBlock_4_0 = null;

        EObject lv_elseIfConditions_7_0 = null;

        EObject lv_elseIfBlocks_9_0 = null;

        EObject lv_elseBlock_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:463:6: ( ( 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:464:1: ( 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:464:1: ( 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )? )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:464:3: 'if' '(' ( (lv_ifCondition_2_0= ruleExpression ) ) ')' ( (lv_ifBlock_4_0= ruleBlock ) ) ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )* ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleIfStatement733); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getIfKeyword_0(), null); 
                
            match(input,16,FollowSets000.FOLLOW_16_in_ruleIfStatement743); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:472:1: ( (lv_ifCondition_2_0= ruleExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:473:1: (lv_ifCondition_2_0= ruleExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:473:1: (lv_ifCondition_2_0= ruleExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:474:3: lv_ifCondition_2_0= ruleExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement764);
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

            match(input,18,FollowSets000.FOLLOW_18_in_ruleIfStatement774); 

                    createLeafNode(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3(), null); 
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:500:1: ( (lv_ifBlock_4_0= ruleBlock ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:501:1: (lv_ifBlock_4_0= ruleBlock )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:501:1: (lv_ifBlock_4_0= ruleBlock )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:502:3: lv_ifBlock_4_0= ruleBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement795);
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

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:524:2: ( 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:524:4: 'elseif' '(' ( (lv_elseIfConditions_7_0= ruleExpression ) ) ')' ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    {
            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleIfStatement806); 

            	            createLeafNode(grammarAccess.getIfStatementAccess().getElseifKeyword_5_0(), null); 
            	        
            	    match(input,16,FollowSets000.FOLLOW_16_in_ruleIfStatement816); 

            	            createLeafNode(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_5_1(), null); 
            	        
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:532:1: ( (lv_elseIfConditions_7_0= ruleExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:533:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:533:1: (lv_elseIfConditions_7_0= ruleExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:534:3: lv_elseIfConditions_7_0= ruleExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getElseIfConditionsExpressionParserRuleCall_5_2_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfStatement837);
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

            	    match(input,18,FollowSets000.FOLLOW_18_in_ruleIfStatement847); 

            	            createLeafNode(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_5_3(), null); 
            	        
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:560:1: ( (lv_elseIfBlocks_9_0= ruleBlock ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:561:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:561:1: (lv_elseIfBlocks_9_0= ruleBlock )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:562:3: lv_elseIfBlocks_9_0= ruleBlock
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getElseIfBlocksBlockParserRuleCall_5_4_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement868);
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

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:584:4: ( 'else' ( (lv_elseBlock_11_0= ruleBlock ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:584:6: 'else' ( (lv_elseBlock_11_0= ruleBlock ) )
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_ruleIfStatement881); 

                            createLeafNode(grammarAccess.getIfStatementAccess().getElseKeyword_6_0(), null); 
                        
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:588:1: ( (lv_elseBlock_11_0= ruleBlock ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:589:1: (lv_elseBlock_11_0= ruleBlock )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:589:1: (lv_elseBlock_11_0= ruleBlock )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:590:3: lv_elseBlock_11_0= ruleBlock
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBlock_in_ruleIfStatement902);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:620:1: entryRuleExpressionStartRule returns [EObject current=null] : iv_ruleExpressionStartRule= ruleExpressionStartRule EOF ;
    public final EObject entryRuleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStartRule = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:621:2: (iv_ruleExpressionStartRule= ruleExpressionStartRule EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:622:2: iv_ruleExpressionStartRule= ruleExpressionStartRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionStartRuleRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule940);
            iv_ruleExpressionStartRule=ruleExpressionStartRule();
            _fsp--;

             current =iv_ruleExpressionStartRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionStartRule950); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:629:1: ruleExpressionStartRule returns [EObject current=null] : (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement ) ;
    public final EObject ruleExpressionStartRule() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;

        EObject this_ForLoop_1 = null;

        EObject this_WhileLoop_2 = null;

        EObject this_DoWhileLoop_3 = null;

        EObject this_IfStatement_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:634:6: ( (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:635:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:635:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement )
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
            case 21:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("635:1: (this_Assignment_0= ruleAssignment | this_ForLoop_1= ruleForLoop | this_WhileLoop_2= ruleWhileLoop | this_DoWhileLoop_3= ruleDoWhileLoop | this_IfStatement_4= ruleIfStatement )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:636:5: this_Assignment_0= ruleAssignment
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleExpressionStartRule997);
                    this_Assignment_0=ruleAssignment();
                    _fsp--;

                     
                            current = this_Assignment_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:646:5: this_ForLoop_1= ruleForLoop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleForLoop_in_ruleExpressionStartRule1024);
                    this_ForLoop_1=ruleForLoop();
                    _fsp--;

                     
                            current = this_ForLoop_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:656:5: this_WhileLoop_2= ruleWhileLoop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1051);
                    this_WhileLoop_2=ruleWhileLoop();
                    _fsp--;

                     
                            current = this_WhileLoop_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:666:5: this_DoWhileLoop_3= ruleDoWhileLoop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1078);
                    this_DoWhileLoop_3=ruleDoWhileLoop();
                    _fsp--;

                     
                            current = this_DoWhileLoop_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:676:5: this_IfStatement_4= ruleIfStatement
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1105);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:692:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:693:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:694:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment1140);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment1150); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:701:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Enumerator lv_assignOperator_1_0 = null;

        EObject lv_assignExpression_2_0 = null;

        Enumerator lv_incrementDecrementOperator_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:706:6: ( ( ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';' ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:707:1: ( ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';' )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:707:1: ( ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';' )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:707:2: ( ( RULE_ID ) ) ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) ) ';'
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:707:2: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:708:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:708:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:709:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment1193); 

            		createLeafNode(grammarAccess.getAssignmentAccess().getAttributeEAttributeCrossReference_0_0(), "attribute"); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:721:2: ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) )
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
                    new NoViableAltException("721:2: ( ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) ) | ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:721:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:721:3: ( ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:721:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) ) ( (lv_assignExpression_2_0= ruleExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:721:4: ( (lv_assignOperator_1_0= ruleAssignOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:722:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:722:1: (lv_assignOperator_1_0= ruleAssignOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:723:3: lv_assignOperator_1_0= ruleAssignOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleAssignment1216);
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

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:745:2: ( (lv_assignExpression_2_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:746:1: (lv_assignExpression_2_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:746:1: (lv_assignExpression_2_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:747:3: lv_assignExpression_2_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getAssignExpressionExpressionParserRuleCall_1_0_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment1237);
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
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:770:6: ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:770:6: ( (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:771:1: (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:771:1: (lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:772:3: lv_incrementDecrementOperator_3_0= ruleIncrementDecrementOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperator_in_ruleAssignment1265);
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

            match(input,17,FollowSets000.FOLLOW_17_in_ruleAssignment1276); 

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:806:1: entryRuleForLoopCountingExpression returns [EObject current=null] : iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF ;
    public final EObject entryRuleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopCountingExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:807:2: (iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:808:2: iv_ruleForLoopCountingExpression= ruleForLoopCountingExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getForLoopCountingExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression1312);
            iv_ruleForLoopCountingExpression=ruleForLoopCountingExpression();
            _fsp--;

             current =iv_ruleForLoopCountingExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForLoopCountingExpression1322); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:815:1: ruleForLoopCountingExpression returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleForLoopCountingExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_incrementDecrementOperator_1_0 = null;

        Enumerator lv_assignOperator_2_0 = null;

        EObject lv_assignExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:820:6: ( ( ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:821:1: ( ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:821:1: ( ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:821:2: ( ( RULE_ID ) ) ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:821:2: ( ( RULE_ID ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:822:1: ( RULE_ID )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:822:1: ( RULE_ID )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:823:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getForLoopCountingExpressionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleForLoopCountingExpression1365); 

            		createLeafNode(grammarAccess.getForLoopCountingExpressionAccess().getAttributeEAttributeCrossReference_0_0(), "attribute"); 
            	

            }


            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:835:2: ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) )
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
                    new NoViableAltException("835:2: ( ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) ) | ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:835:3: ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:835:3: ( (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:836:1: (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:836:1: (lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:837:3: lv_incrementDecrementOperator_1_0= ruleIncrementDecrementOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorEnumRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIncrementDecrementOperator_in_ruleForLoopCountingExpression1387);
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
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:860:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:860:6: ( ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:860:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) ) ( (lv_assignExpression_3_0= ruleExpression ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:860:7: ( (lv_assignOperator_2_0= ruleAssignOperator ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:861:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:861:1: (lv_assignOperator_2_0= ruleAssignOperator )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:862:3: lv_assignOperator_2_0= ruleAssignOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression1415);
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

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:884:2: ( (lv_assignExpression_3_0= ruleExpression ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:885:1: (lv_assignExpression_3_0= ruleExpression )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:885:1: (lv_assignExpression_3_0= ruleExpression )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:886:3: lv_assignExpression_3_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getForLoopCountingExpressionAccess().getAssignExpressionExpressionParserRuleCall_1_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleForLoopCountingExpression1436);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:916:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:917:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:918:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1474);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1484); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:925:1: ruleExpression returns [EObject current=null] : this_ArithmeticExpression_0= ruleArithmeticExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:930:6: (this_ArithmeticExpression_0= ruleArithmeticExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:932:5: this_ArithmeticExpression_0= ruleArithmeticExpression
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArithmeticExpressionParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_ruleExpression1530);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:948:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:949:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:950:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArithmeticExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression1564);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();
            _fsp--;

             current =iv_ruleArithmeticExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArithmeticExpression1574); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:957:1: ruleArithmeticExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:962:6: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:963:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:963:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:964:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getArithmeticExpressionAccess().getComparisonExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1621);
            this_ComparisonExpression_0=ruleComparisonExpression();
            _fsp--;

             
                    current = this_ComparisonExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:972:1: ( () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=39 && LA7_0<=44)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:972:2: () ( (lv_operator_2_0= ruleArithmeticOperator ) ) ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:972:2: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:973:5: 
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

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:988:2: ( (lv_operator_2_0= ruleArithmeticOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:989:1: (lv_operator_2_0= ruleArithmeticOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:989:1: (lv_operator_2_0= ruleArithmeticOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:990:3: lv_operator_2_0= ruleArithmeticOperator
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArithmeticExpressionAccess().getOperatorArithmeticOperatorEnumRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArithmeticOperator_in_ruleArithmeticExpression1651);
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

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1012:2: ( (lv_rightExpression_3_0= ruleComparisonExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1013:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1013:1: (lv_rightExpression_3_0= ruleComparisonExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1014:3: lv_rightExpression_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getArithmeticExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1672);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1044:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1045:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1046:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComparisonExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1710);
            iv_ruleComparisonExpression=ruleComparisonExpression();
            _fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression1720); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1053:1: ruleComparisonExpression returns [EObject current=null] : (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryLogicExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1058:6: ( (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1059:1: (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1059:1: (this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1060:5: this_BinaryLogicExpression_0= ruleBinaryLogicExpression ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getComparisonExpressionAccess().getBinaryLogicExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1767);
            this_BinaryLogicExpression_0=ruleBinaryLogicExpression();
            _fsp--;

             
                    current = this_BinaryLogicExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1068:1: ( ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=45 && LA8_0<=50)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1068:2: ( () ( (lv_operator_2_0= ruleComparingOperator ) ) ) ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1068:2: ( () ( (lv_operator_2_0= ruleComparingOperator ) ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1068:3: () ( (lv_operator_2_0= ruleComparingOperator ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1068:3: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1069:5: 
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

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1084:2: ( (lv_operator_2_0= ruleComparingOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1085:1: (lv_operator_2_0= ruleComparingOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1085:1: (lv_operator_2_0= ruleComparingOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1086:3: lv_operator_2_0= ruleComparingOperator
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparingOperatorEnumRuleCall_1_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparingOperator_in_ruleComparisonExpression1798);
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

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1108:3: ( (lv_rightExpression_3_0= ruleBinaryLogicExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1109:1: (lv_rightExpression_3_0= ruleBinaryLogicExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1109:1: (lv_rightExpression_3_0= ruleBinaryLogicExpression )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1110:3: lv_rightExpression_3_0= ruleBinaryLogicExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExpressionBinaryLogicExpressionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1820);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1140:1: entryRuleBinaryLogicExpression returns [EObject current=null] : iv_ruleBinaryLogicExpression= ruleBinaryLogicExpression EOF ;
    public final EObject entryRuleBinaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryLogicExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1141:2: (iv_ruleBinaryLogicExpression= ruleBinaryLogicExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1142:2: iv_ruleBinaryLogicExpression= ruleBinaryLogicExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBinaryLogicExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryLogicExpression_in_entryRuleBinaryLogicExpression1858);
            iv_ruleBinaryLogicExpression=ruleBinaryLogicExpression();
            _fsp--;

             current =iv_ruleBinaryLogicExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryLogicExpression1868); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1149:1: ruleBinaryLogicExpression returns [EObject current=null] : ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* ) ;
    public final EObject ruleBinaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        EObject this_AttributeExpression_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rightExpression_4_1 = null;

        EObject lv_rightExpression_4_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1154:6: ( ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1155:1: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1155:1: ( (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )* )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1155:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression ) ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )*
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1155:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=39 && LA9_0<=40)||LA9_0==51) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_BOOLEAN)||LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1155:2: (this_UnaryExpression_0= ruleUnaryExpression | this_AttributeExpression_1= ruleAttributeExpression )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1156:5: this_UnaryExpression_0= ruleUnaryExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getUnaryExpressionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1916);
                    this_UnaryExpression_0=ruleUnaryExpression();
                    _fsp--;

                     
                            current = this_UnaryExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1166:5: this_AttributeExpression_1= ruleAttributeExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getAttributeExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression1943);
                    this_AttributeExpression_1=ruleAttributeExpression();
                    _fsp--;

                     
                            current = this_AttributeExpression_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1174:2: ( ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=32 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1174:3: ( () ( (lv_operator_3_0= ruleLogicOperator ) ) ) ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1174:3: ( () ( (lv_operator_3_0= ruleLogicOperator ) ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1174:4: () ( (lv_operator_3_0= ruleLogicOperator ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1174:4: ()
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1175:5: 
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

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1190:2: ( (lv_operator_3_0= ruleLogicOperator ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1191:1: (lv_operator_3_0= ruleLogicOperator )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1191:1: (lv_operator_3_0= ruleLogicOperator )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1192:3: lv_operator_3_0= ruleLogicOperator
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicOperator_in_ruleBinaryLogicExpression1975);
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

            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1214:3: ( ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1215:1: ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1215:1: ( (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression ) )
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1216:1: (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression )
            	    {
            	    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1216:1: (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>=39 && LA10_0<=40)||LA10_0==51) ) {
            	        alt10=1;
            	    }
            	    else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_BOOLEAN)||LA10_0==16) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1216:1: (lv_rightExpression_4_1= ruleUnaryExpression | lv_rightExpression_4_2= ruleAttributeExpression )", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1217:3: lv_rightExpression_4_1= ruleUnaryExpression
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionUnaryExpressionParserRuleCall_1_1_0_0(), currentNode); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1999);
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
            	            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1238:8: lv_rightExpression_4_2= ruleAttributeExpression
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAttributeExpressionParserRuleCall_1_1_0_1(), currentNode); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression2018);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1270:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1271:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1272:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnaryExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2059);
            iv_ruleUnaryExpression=ruleUnaryExpression();
            _fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression2069); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1279:1: ruleUnaryExpression returns [EObject current=null] : ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unaryOperator_1_0 = null;

        EObject lv_unaryExpression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1284:6: ( ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1285:1: ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1285:1: ( () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1285:2: () ( (lv_unaryOperator_1_0= ruleUnaryOperator ) ) ( (lv_unaryExpression_2_0= ruleAttributeExpression ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1285:2: ()
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1286:5: 
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

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1296:2: ( (lv_unaryOperator_1_0= ruleUnaryOperator ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1297:1: (lv_unaryOperator_1_0= ruleUnaryOperator )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1297:1: (lv_unaryOperator_1_0= ruleUnaryOperator )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1298:3: lv_unaryOperator_1_0= ruleUnaryOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression2124);
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

            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1320:2: ( (lv_unaryExpression_2_0= ruleAttributeExpression ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1321:1: (lv_unaryExpression_2_0= ruleAttributeExpression )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1321:1: (lv_unaryExpression_2_0= ruleAttributeExpression )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1322:3: lv_unaryExpression_2_0= ruleAttributeExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAttributeExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_ruleUnaryExpression2145);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1352:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1353:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1354:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLiteralExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2181);
            iv_ruleLiteralExpression=ruleLiteralExpression();
            _fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralExpression2191); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1361:1: ruleLiteralExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1366:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1367:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1367:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_NUMBER && LA12_0<=RULE_BOOLEAN)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1367:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1367:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1367:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1367:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralExpression2227); 

                            createLeafNode(grammarAccess.getLiteralExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getLiteralExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLiteralExpression2249);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleLiteralExpression2258); 

                            createLeafNode(grammarAccess.getLiteralExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1385:6: ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1385:6: ( () ( (lv_value_4_0= ruleIdentifierOrValue ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1385:7: () ( (lv_value_4_0= ruleIdentifierOrValue ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1385:7: ()
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1386:5: 
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

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1396:2: ( (lv_value_4_0= ruleIdentifierOrValue ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1397:1: (lv_value_4_0= ruleIdentifierOrValue )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1397:1: (lv_value_4_0= ruleIdentifierOrValue )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1398:3: lv_value_4_0= ruleIdentifierOrValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLiteralExpressionAccess().getValueIdentifierOrValueParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifierOrValue_in_ruleLiteralExpression2296);
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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1428:1: entryRuleAttributeExpression returns [EObject current=null] : iv_ruleAttributeExpression= ruleAttributeExpression EOF ;
    public final EObject entryRuleAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeExpression = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1429:2: (iv_ruleAttributeExpression= ruleAttributeExpression EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1430:2: iv_ruleAttributeExpression= ruleAttributeExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeExpressionRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeExpression_in_entryRuleAttributeExpression2333);
            iv_ruleAttributeExpression=ruleAttributeExpression();
            _fsp--;

             current =iv_ruleAttributeExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeExpression2343); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1437:1: ruleAttributeExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) ) ;
    public final EObject ruleAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1442:6: ( (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1443:1: (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1443:1: (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_NUMBER && LA13_0<=RULE_BOOLEAN)||LA13_0==16) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1443:1: (this_LiteralExpression_0= ruleLiteralExpression | ( () ( ( RULE_ID ) ) ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1444:5: this_LiteralExpression_0= ruleLiteralExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAttributeExpressionAccess().getLiteralExpressionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_ruleAttributeExpression2390);
                    this_LiteralExpression_0=ruleLiteralExpression();
                    _fsp--;

                     
                            current = this_LiteralExpression_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1453:6: ( () ( ( RULE_ID ) ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1453:6: ( () ( ( RULE_ID ) ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1453:7: () ( ( RULE_ID ) )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1453:7: ()
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1454:5: 
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

                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1464:2: ( ( RULE_ID ) )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1465:1: ( RULE_ID )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1465:1: ( RULE_ID )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1466:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAttributeExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeExpression2423); 

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1486:1: entryRuleIdentifierOrValue returns [String current=null] : iv_ruleIdentifierOrValue= ruleIdentifierOrValue EOF ;
    public final String entryRuleIdentifierOrValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifierOrValue = null;


        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1487:2: (iv_ruleIdentifierOrValue= ruleIdentifierOrValue EOF )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1488:2: iv_ruleIdentifierOrValue= ruleIdentifierOrValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIdentifierOrValueRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifierOrValue_in_entryRuleIdentifierOrValue2461);
            iv_ruleIdentifierOrValue=ruleIdentifierOrValue();
            _fsp--;

             current =iv_ruleIdentifierOrValue.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifierOrValue2472); 

            }

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1495:1: ruleIdentifierOrValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleIdentifierOrValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUMBER_0=null;
        Token this_BOOLEAN_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1500:6: ( (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1501:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1501:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_NUMBER) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_BOOLEAN) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1501:1: (this_NUMBER_0= RULE_NUMBER | this_BOOLEAN_1= RULE_BOOLEAN )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1501:6: this_NUMBER_0= RULE_NUMBER
                    {
                    this_NUMBER_0=(Token)input.LT(1);
                    match(input,RULE_NUMBER,FollowSets000.FOLLOW_RULE_NUMBER_in_ruleIdentifierOrValue2512); 

                    		current.merge(this_NUMBER_0);
                        
                     
                        createLeafNode(grammarAccess.getIdentifierOrValueAccess().getNUMBERTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1509:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleIdentifierOrValue2538); 

                    		current.merge(this_BOOLEAN_1);
                        
                     
                        createLeafNode(grammarAccess.getIdentifierOrValueAccess().getBOOLEANTerminalRuleCall_1(), null); 
                        

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
    // $ANTLR end ruleIdentifierOrValue


    // $ANTLR start ruleAssignOperator
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1524:1: ruleAssignOperator returns [Enumerator current=null] : ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) ) ;
    public final Enumerator ruleAssignOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1528:6: ( ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1529:1: ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1529:1: ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            case 28:
                {
                alt15=5;
                }
                break;
            case 29:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1529:1: ( ( '=' ) | ( ':=' ) | ( '+=' ) | ( '=+' ) | ( '-=' ) | ( '=-' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1529:2: ( '=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1529:2: ( '=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1529:4: '='
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleAssignOperator2595); 

                            current = grammarAccess.getAssignOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getEQUALEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1535:6: ( ':=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1535:6: ( ':=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1535:8: ':='
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_ruleAssignOperator2610); 

                            current = grammarAccess.getAssignOperatorAccess().getASSIGN2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getASSIGN2EnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1541:6: ( '+=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1541:6: ( '+=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1541:8: '+='
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleAssignOperator2625); 

                            current = grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1547:6: ( '=+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1547:6: ( '=+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1547:8: '=+'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleAssignOperator2640); 

                            current = grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getEQUAL_PLUSEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1553:6: ( '-=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1553:6: ( '-=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1553:8: '-='
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleAssignOperator2655); 

                            current = grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1559:6: ( '=-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1559:6: ( '=-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1559:8: '=-'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleAssignOperator2670); 

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1569:1: ruleIncrementDecrementOperator returns [Enumerator current=null] : ( ( '++' ) | ( '--' ) ) ;
    public final Enumerator ruleIncrementDecrementOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1573:6: ( ( ( '++' ) | ( '--' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1574:1: ( ( '++' ) | ( '--' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1574:1: ( ( '++' ) | ( '--' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1574:1: ( ( '++' ) | ( '--' ) )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1574:2: ( '++' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1574:2: ( '++' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1574:4: '++'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleIncrementDecrementOperator2713); 

                            current = grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:6: ( '--' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:6: ( '--' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1580:8: '--'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleIncrementDecrementOperator2728); 

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1590:1: ruleLogicOperator returns [Enumerator current=null] : ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1594:6: ( ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1595:1: ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1595:1: ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            case 35:
                {
                alt17=4;
                }
                break;
            case 36:
                {
                alt17=5;
                }
                break;
            case 37:
                {
                alt17=6;
                }
                break;
            case 38:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1595:1: ( ( '&' ) | ( '&&' ) | ( '|' ) | ( '||' ) | ( 'xor' ) | ( '=>' ) | ( '<=>' ) )", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1595:2: ( '&' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1595:2: ( '&' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1595:4: '&'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleLogicOperator2771); 

                            current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1601:6: ( '&&' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1601:6: ( '&&' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1601:8: '&&'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleLogicOperator2786); 

                            current = grammarAccess.getLogicOperatorAccess().getAND_ANDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getAND_ANDEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1607:6: ( '|' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1607:6: ( '|' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1607:8: '|'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleLogicOperator2801); 

                            current = grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1613:6: ( '||' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1613:6: ( '||' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1613:8: '||'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleLogicOperator2816); 

                            current = grammarAccess.getLogicOperatorAccess().getOR_OREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getOR_OREnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1619:6: ( 'xor' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1619:6: ( 'xor' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1619:8: 'xor'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleLogicOperator2831); 

                            current = grammarAccess.getLogicOperatorAccess().getXOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getXOREnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1625:6: ( '=>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1625:6: ( '=>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1625:8: '=>'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleLogicOperator2846); 

                            current = grammarAccess.getLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getLogicOperatorAccess().getIMPLYEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1631:6: ( '<=>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1631:6: ( '<=>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1631:8: '<=>'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleLogicOperator2861); 

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1641:1: ruleArithmeticOperator returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) ) ;
    public final Enumerator ruleArithmeticOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1645:6: ( ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1646:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1646:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt18=1;
                }
                break;
            case 40:
                {
                alt18=2;
                }
                break;
            case 41:
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
            case 44:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1646:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1646:2: ( '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1646:2: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1646:4: '+'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleArithmeticOperator2904); 

                            current = grammarAccess.getArithmeticOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getPLUSEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1652:6: ( '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1652:6: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1652:8: '-'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleArithmeticOperator2919); 

                            current = grammarAccess.getArithmeticOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getMINUSEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1658:6: ( '*' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1658:6: ( '*' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1658:8: '*'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleArithmeticOperator2934); 

                            current = grammarAccess.getArithmeticOperatorAccess().getTIMESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getTIMESEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1664:6: ( '/' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1664:6: ( '/' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1664:8: '/'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleArithmeticOperator2949); 

                            current = grammarAccess.getArithmeticOperatorAccess().getDIVIDEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getDIVIDEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1670:6: ( '%' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1670:6: ( '%' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1670:8: '%'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleArithmeticOperator2964); 

                            current = grammarAccess.getArithmeticOperatorAccess().getMODULOEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getArithmeticOperatorAccess().getMODULOEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1676:6: ( '^' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1676:6: ( '^' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1676:8: '^'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleArithmeticOperator2979); 

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1686:1: ruleComparingOperator returns [Enumerator current=null] : ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) ) ;
    public final Enumerator ruleComparingOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1690:6: ( ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1691:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1691:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt19=1;
                }
                break;
            case 46:
                {
                alt19=2;
                }
                break;
            case 47:
                {
                alt19=3;
                }
                break;
            case 48:
                {
                alt19=4;
                }
                break;
            case 49:
                {
                alt19=5;
                }
                break;
            case 50:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1691:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) | ( '<>' ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1691:2: ( '<' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1691:2: ( '<' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1691:4: '<'
                    {
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleComparingOperator3022); 

                            current = grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getLESSEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1697:6: ( '<=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1697:6: ( '<=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1697:8: '<='
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleComparingOperator3037); 

                            current = grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1703:6: ( '==' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1703:6: ( '==' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1703:8: '=='
                    {
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleComparingOperator3052); 

                            current = grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getEQUALEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1709:6: ( '>=' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1709:6: ( '>=' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1709:8: '>='
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleComparingOperator3067); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1715:6: ( '>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1715:6: ( '>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1715:8: '>'
                    {
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleComparingOperator3082); 

                            current = grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getComparingOperatorAccess().getGREATEREnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1721:6: ( '<>' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1721:6: ( '<>' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1721:8: '<>'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleComparingOperator3097); 

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
    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1731:1: ruleUnaryOperator returns [Enumerator current=null] : ( ( 'not' ) | ( '-' ) | ( '+' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1735:6: ( ( ( 'not' ) | ( '-' ) | ( '+' ) ) )
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1736:1: ( ( 'not' ) | ( '-' ) | ( '+' ) )
            {
            // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1736:1: ( ( 'not' ) | ( '-' ) | ( '+' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case 39:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1736:1: ( ( 'not' ) | ( '-' ) | ( '+' ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1736:2: ( 'not' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1736:2: ( 'not' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1736:4: 'not'
                    {
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleUnaryOperator3140); 

                            current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1742:6: ( '-' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1742:6: ( '-' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1742:8: '-'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleUnaryOperator3155); 

                            current = grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getUnaryOperatorAccess().getMINUSEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1748:6: ( '+' )
                    {
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1748:6: ( '+' )
                    // ../de.uni_paderborn.fujaba.muml.actionLanguage/src-gen/de/uni_paderborn/fujaba/muml/parser/antlr/internal/InternalActionLanguage.g:1748:8: '+'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleUnaryOperator3170); 

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
        public static final BitSet FOLLOW_13_in_ruleBlock129 = new BitSet(new long[]{0x000000000038C010L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_ruleBlock150 = new BitSet(new long[]{0x000000000038C010L});
        public static final BitSet FOLLOW_14_in_ruleBlock161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_entryRuleForLoop197 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoop207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleForLoop242 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleForLoop252 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleForLoop273 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoop294 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleForLoop304 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_ruleForLoop325 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleForLoop335 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleForLoop356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_entryRuleWhileLoop392 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhileLoop402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleWhileLoop437 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleWhileLoop447 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleWhileLoop468 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWhileLoop478 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleWhileLoop499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_entryRuleDoWhileLoop535 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoWhileLoop545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleDoWhileLoop580 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleDoWhileLoop601 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDoWhileLoop611 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDoWhileLoop621 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDoWhileLoop642 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDoWhileLoop652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleIfStatement733 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIfStatement743 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement764 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfStatement774 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement795 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_22_in_ruleIfStatement806 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIfStatement816 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement837 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfStatement847 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement868 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_23_in_ruleIfStatement881 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleBlock_in_ruleIfStatement902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionStartRule_in_entryRuleExpressionStartRule940 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStartRule950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleExpressionStartRule997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoop_in_ruleExpressionStartRule1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhileLoop_in_ruleExpressionStartRule1051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoWhileLoop_in_ruleExpressionStartRule1078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfStatement_in_ruleExpressionStartRule1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1140 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1193 = new BitSet(new long[]{0x00000000FF000000L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleAssignment1216 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment1237 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperator_in_ruleAssignment1265 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAssignment1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForLoopCountingExpression_in_entryRuleForLoopCountingExpression1312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForLoopCountingExpression1322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForLoopCountingExpression1365 = new BitSet(new long[]{0x00000000FF000000L});
        public static final BitSet FOLLOW_ruleIncrementDecrementOperator_in_ruleForLoopCountingExpression1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignOperator_in_ruleForLoopCountingExpression1415 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleForLoopCountingExpression1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1474 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleExpression1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression1564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression1574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1621 = new BitSet(new long[]{0x00001F8000000002L});
        public static final BitSet FOLLOW_ruleArithmeticOperator_in_ruleArithmeticExpression1651 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleArithmeticExpression1672 = new BitSet(new long[]{0x00001F8000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1710 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1767 = new BitSet(new long[]{0x0007E00000000002L});
        public static final BitSet FOLLOW_ruleComparingOperator_in_ruleComparisonExpression1798 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_ruleComparisonExpression1820 = new BitSet(new long[]{0x0007E00000000002L});
        public static final BitSet FOLLOW_ruleBinaryLogicExpression_in_entryRuleBinaryLogicExpression1858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryLogicExpression1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1916 = new BitSet(new long[]{0x0000007F00000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression1943 = new BitSet(new long[]{0x0000007F00000002L});
        public static final BitSet FOLLOW_ruleLogicOperator_in_ruleBinaryLogicExpression1975 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleBinaryLogicExpression1999 = new BitSet(new long[]{0x0000007F00000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_ruleBinaryLogicExpression2018 = new BitSet(new long[]{0x0000007F00000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2059 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression2124 = new BitSet(new long[]{0x0000000000010070L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_ruleUnaryExpression2145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression2191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleLiteralExpression2227 = new BitSet(new long[]{0x0008018000010070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLiteralExpression2249 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLiteralExpression2258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifierOrValue_in_ruleLiteralExpression2296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeExpression_in_entryRuleAttributeExpression2333 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeExpression2343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleAttributeExpression2390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeExpression2423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifierOrValue_in_entryRuleIdentifierOrValue2461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifierOrValue2472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifierOrValue2512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleIdentifierOrValue2538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAssignOperator2595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleAssignOperator2610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAssignOperator2625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAssignOperator2640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAssignOperator2655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAssignOperator2670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleIncrementDecrementOperator2713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleIncrementDecrementOperator2728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleLogicOperator2771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleLogicOperator2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleLogicOperator2801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleLogicOperator2816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleLogicOperator2831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleLogicOperator2846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleLogicOperator2861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleArithmeticOperator2904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleArithmeticOperator2919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleArithmeticOperator2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleArithmeticOperator2949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleArithmeticOperator2964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleArithmeticOperator2979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleComparingOperator3022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleComparingOperator3037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleComparingOperator3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleComparingOperator3067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleComparingOperator3082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleComparingOperator3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleUnaryOperator3140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleUnaryOperator3155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleUnaryOperator3170 = new BitSet(new long[]{0x0000000000000002L});
    }


}