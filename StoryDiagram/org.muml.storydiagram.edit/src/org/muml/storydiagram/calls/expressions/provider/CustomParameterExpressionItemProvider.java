package org.muml.storydiagram.calls.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.calls.expressions.provider.ParameterExpressionItemProvider;

public class CustomParameterExpressionItemProvider extends ParameterExpressionItemProvider {
	public CustomParameterExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("calls/expressions/ParameterExpression.png"); //$NON-NLS-1$
	}
}
