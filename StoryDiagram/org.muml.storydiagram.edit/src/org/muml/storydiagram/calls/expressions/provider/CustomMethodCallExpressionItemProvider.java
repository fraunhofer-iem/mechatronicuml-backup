package org.muml.storydiagram.calls.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.calls.expressions.provider.MethodCallExpressionItemProvider;

public class CustomMethodCallExpressionItemProvider extends MethodCallExpressionItemProvider {
	public CustomMethodCallExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("calls/expressions/MethodCallExpression.png"); //$NON-NLS-1$
	}
}
