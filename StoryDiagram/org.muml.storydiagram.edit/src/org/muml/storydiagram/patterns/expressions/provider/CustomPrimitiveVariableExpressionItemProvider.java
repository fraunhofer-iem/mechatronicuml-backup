package org.muml.storydiagram.patterns.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.expressions.provider.PrimitiveVariableExpressionItemProvider;

public class CustomPrimitiveVariableExpressionItemProvider extends PrimitiveVariableExpressionItemProvider {
	public CustomPrimitiveVariableExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/expressions/PrimitiveVariableExpression.png"); //$NON-NLS-1$
	}
}
