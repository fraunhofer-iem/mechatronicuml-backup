package org.muml.core.expressions.common.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.core.expressions.common.provider.ArithmeticExpressionItemProvider;

public class CustomArithmeticExpressionItemProvider extends ArithmeticExpressionItemProvider {
	public CustomArithmeticExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("core/expressions/common/ArithmeticExpression.png"); //$NON-NLS-1$
	}
}
