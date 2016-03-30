package org.muml.storydiagram.interpreter.core.mdelab.notifications;

import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

/**
 * An expression is about to be evaluated.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 * @param <Expression>
 */
public class EvaluatingExpressionNotification<Classifier, Expression> extends InterpreterNotification<Classifier>
{
	private final Expression	expression;

	public EvaluatingExpressionNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> variablesScope,
			Notifier<?, ?, ?, ?, ?, ?, Classifier, ?, Expression> notifier, Expression expression)
	{
		super(NotificationTypeEnum.EVALUATING_EXPRESSION, variablesScope, notifier);

		assert expression != null;

		this.expression = expression;
	}

	public Expression getExpression()
	{
		return this.expression;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getExpression();
	}
}
