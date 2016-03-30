package org.muml.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.core.expressions.common.provider.UnaryExpressionItemProvider;

public class CustomUnaryExpressionItemProvider extends UnaryExpressionItemProvider {
	public CustomUnaryExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/UnaryExpression.png"); //$NON-NLS-1$
	}
}
