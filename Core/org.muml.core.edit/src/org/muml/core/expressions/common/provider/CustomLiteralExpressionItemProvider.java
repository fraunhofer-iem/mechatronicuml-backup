package org.muml.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.core.expressions.common.provider.LiteralExpressionItemProvider;

public class CustomLiteralExpressionItemProvider extends LiteralExpressionItemProvider {
	public CustomLiteralExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		// TODO Auto-generated method stub
		return getImage("core/expressions/common/LiteralExpression.png"); //$NON-NLS-1$
	}
}
