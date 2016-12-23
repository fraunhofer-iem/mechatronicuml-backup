package org.muml.storydiagram.patterns.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.expressions.provider.ObjectVariableExpressionItemProvider;

public class CustomObjectVariableExpressionItemProvider extends ObjectVariableExpressionItemProvider {
	public CustomObjectVariableExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/expressions/ObjectVariableExpression.png"); //$NON-NLS-1$
	}
}
