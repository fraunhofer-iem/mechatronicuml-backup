/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uni_paderborn.fujaba.muml.services.ActionLanguageGrammarAccess;

public class ActionLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private ActionLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser createParser() {
		de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser result = new de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpressionStartRuleAccess().getAlternatives(), "rule__ExpressionStartRule__Alternatives");
					put(grammarAccess.getAssignmentAccess().getAlternatives_1(), "rule__Assignment__Alternatives_1");
					put(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1(), "rule__ForLoopCountingExpression__Alternatives_1");
					put(grammarAccess.getBinaryLogicExpressionAccess().getAlternatives_0(), "rule__BinaryLogicExpression__Alternatives_0");
					put(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAlternatives_1_1_0(), "rule__BinaryLogicExpression__RightExpressionAlternatives_1_1_0");
					put(grammarAccess.getAttributeExpressionAccess().getAlternatives(), "rule__AttributeExpression__Alternatives");
					put(grammarAccess.getOperationCallAccess().getAlternatives(), "rule__OperationCall__Alternatives");
					put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
					put(grammarAccess.getIdentifierOrValueAccess().getAlternatives(), "rule__IdentifierOrValue__Alternatives");
					put(grammarAccess.getAssignOperatorAccess().getAlternatives(), "rule__AssignOperator__Alternatives");
					put(grammarAccess.getIncrementDecrementOperatorAccess().getAlternatives(), "rule__IncrementDecrementOperator__Alternatives");
					put(grammarAccess.getLogicOperatorAccess().getAlternatives(), "rule__LogicOperator__Alternatives");
					put(grammarAccess.getArithmeticOperatorAccess().getAlternatives(), "rule__ArithmeticOperator__Alternatives");
					put(grammarAccess.getComparingOperatorAccess().getAlternatives(), "rule__ComparingOperator__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getForLoopAccess().getGroup(), "rule__ForLoop__Group__0");
					put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
					put(grammarAccess.getDoWhileLoopAccess().getGroup(), "rule__DoWhileLoop__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_5(), "rule__IfStatement__Group_5__0");
					put(grammarAccess.getIfStatementAccess().getGroup_6(), "rule__IfStatement__Group_6__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup_1_0(), "rule__Assignment__Group_1_0__0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getGroup(), "rule__ForLoopCountingExpression__Group__0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1(), "rule__ForLoopCountingExpression__Group_1_1__0");
					put(grammarAccess.getArithmeticExpressionAccess().getGroup(), "rule__ArithmeticExpression__Group__0");
					put(grammarAccess.getArithmeticExpressionAccess().getGroup_1(), "rule__ArithmeticExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1_0(), "rule__ComparisonExpression__Group_1_0__0");
					put(grammarAccess.getBinaryLogicExpressionAccess().getGroup(), "rule__BinaryLogicExpression__Group__0");
					put(grammarAccess.getBinaryLogicExpressionAccess().getGroup_1(), "rule__BinaryLogicExpression__Group_1__0");
					put(grammarAccess.getBinaryLogicExpressionAccess().getGroup_1_0(), "rule__BinaryLogicExpression__Group_1_0__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup(), "rule__UnaryExpression__Group__0");
					put(grammarAccess.getAttributeExpressionAccess().getGroup_1(), "rule__AttributeExpression__Group_1__0");
					put(grammarAccess.getOperationCallAccess().getGroup_1(), "rule__OperationCall__Group_1__0");
					put(grammarAccess.getOperationCallAccess().getGroup_1_4(), "rule__OperationCall__Group_1_4__0");
					put(grammarAccess.getLiteralExpressionAccess().getGroup_0(), "rule__LiteralExpression__Group_0__0");
					put(grammarAccess.getLiteralExpressionAccess().getGroup_1(), "rule__LiteralExpression__Group_1__0");
					put(grammarAccess.getBlockAccess().getExpressionsAssignment_2(), "rule__Block__ExpressionsAssignment_2");
					put(grammarAccess.getForLoopAccess().getInitalizeExpressionAssignment_2(), "rule__ForLoop__InitalizeExpressionAssignment_2");
					put(grammarAccess.getForLoopAccess().getLoopTestAssignment_3(), "rule__ForLoop__LoopTestAssignment_3");
					put(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5(), "rule__ForLoop__CountingExpressionAssignment_5");
					put(grammarAccess.getForLoopAccess().getBlockAssignment_7(), "rule__ForLoop__BlockAssignment_7");
					put(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2(), "rule__WhileLoop__LoopTestAssignment_2");
					put(grammarAccess.getWhileLoopAccess().getBlockAssignment_4(), "rule__WhileLoop__BlockAssignment_4");
					put(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1(), "rule__DoWhileLoop__BlockAssignment_1");
					put(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4(), "rule__DoWhileLoop__LoopTestAssignment_4");
					put(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2(), "rule__IfStatement__IfConditionAssignment_2");
					put(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4(), "rule__IfStatement__IfBlockAssignment_4");
					put(grammarAccess.getIfStatementAccess().getElseIfConditionsAssignment_5_2(), "rule__IfStatement__ElseIfConditionsAssignment_5_2");
					put(grammarAccess.getIfStatementAccess().getElseIfBlocksAssignment_5_4(), "rule__IfStatement__ElseIfBlocksAssignment_5_4");
					put(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1(), "rule__IfStatement__ElseBlockAssignment_6_1");
					put(grammarAccess.getAssignmentAccess().getAttributeAssignment_0(), "rule__Assignment__AttributeAssignment_0");
					put(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0(), "rule__Assignment__AssignOperatorAssignment_1_0_0");
					put(grammarAccess.getAssignmentAccess().getAssignExpressionAssignment_1_0_1(), "rule__Assignment__AssignExpressionAssignment_1_0_1");
					put(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1(), "rule__Assignment__IncrementDecrementOperatorAssignment_1_1");
					put(grammarAccess.getForLoopCountingExpressionAccess().getAttributeAssignment_0(), "rule__ForLoopCountingExpression__AttributeAssignment_0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0(), "rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0(), "rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0");
					put(grammarAccess.getForLoopCountingExpressionAccess().getAssignExpressionAssignment_1_1_1(), "rule__ForLoopCountingExpression__AssignExpressionAssignment_1_1_1");
					put(grammarAccess.getArithmeticExpressionAccess().getOperatorAssignment_1_1(), "rule__ArithmeticExpression__OperatorAssignment_1_1");
					put(grammarAccess.getArithmeticExpressionAccess().getRightExpressionAssignment_1_2(), "rule__ArithmeticExpression__RightExpressionAssignment_1_2");
					put(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_0_1(), "rule__ComparisonExpression__OperatorAssignment_1_0_1");
					put(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_1(), "rule__ComparisonExpression__RightExpressionAssignment_1_1");
					put(grammarAccess.getBinaryLogicExpressionAccess().getOperatorAssignment_1_0_1(), "rule__BinaryLogicExpression__OperatorAssignment_1_0_1");
					put(grammarAccess.getBinaryLogicExpressionAccess().getRightExpressionAssignment_1_1(), "rule__BinaryLogicExpression__RightExpressionAssignment_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorAssignment_1(), "rule__UnaryExpression__UnaryOperatorAssignment_1");
					put(grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAssignment_2(), "rule__UnaryExpression__UnaryExpressionAssignment_2");
					put(grammarAccess.getAttributeExpressionAccess().getAttributeAssignment_1_1(), "rule__AttributeExpression__AttributeAssignment_1_1");
					put(grammarAccess.getOperationCallAccess().getOperationAssignment_1_1(), "rule__OperationCall__OperationAssignment_1_1");
					put(grammarAccess.getOperationCallAccess().getParameterValuesForBindingAssignment_1_3(), "rule__OperationCall__ParameterValuesForBindingAssignment_1_3");
					put(grammarAccess.getOperationCallAccess().getParameterValuesForBindingAssignment_1_4_1(), "rule__OperationCall__ParameterValuesForBindingAssignment_1_4_1");
					put(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1_1(), "rule__LiteralExpression__ValueAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser typedParser = (de.uni_paderborn.fujaba.muml.ui.contentassist.antlr.internal.InternalActionLanguageParser) parser;
			typedParser.entryRuleBlock();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ActionLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ActionLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
