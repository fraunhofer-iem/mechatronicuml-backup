package org.muml.core.expressions.grammar;

import org.muml.core.expressions.Expression;

public class TestGrammar implements IExpressionGrammar {

	@Override
	public String getName() {
		return "org.muml.TestGrammar";
	}

	@Override
	public String serialize(Expression expression) {
		return null;
	}

	@Override
	public Expression parse(String expressionText) {
		return null;
	}

}
