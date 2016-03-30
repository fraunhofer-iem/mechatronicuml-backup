package org.muml.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.core.expressions.common.provider.LogicalExpressionItemProvider;

public class CustomLogicalExpressionItemProvider extends LogicalExpressionItemProvider {
	public CustomLogicalExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/LogicalExpression.png"); //$NON-NLS-1$
	}
}
