package org.muml.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.core.expressions.common.provider.ComparisonExpressionItemProvider;

public class CustomComparisonExpressionItemProvider extends ComparisonExpressionItemProvider {
	public CustomComparisonExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/ComparisonExpression.png"); //$NON-NLS-1$
	}
}
