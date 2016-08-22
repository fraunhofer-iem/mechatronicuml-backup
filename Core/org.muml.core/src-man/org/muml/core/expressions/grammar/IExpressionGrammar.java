package org.muml.core.expressions.grammar;

import org.muml.core.expressions.Expression;

public interface IExpressionGrammar {
	
	public String getName();
	
	public String serialize(Expression expression);

	public Expression parse(String expressionText);
}
