package org.muml.storydiagram.activities.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.activities.expressions.provider.ExceptionVariableExpressionItemProvider;

public class CustomExceptionVariableExpressionItemProvider extends ExceptionVariableExpressionItemProvider {
	public CustomExceptionVariableExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("activities/expressions/ExceptionVariableExpression.png"); //$NON-NLS-1$
	}
}
