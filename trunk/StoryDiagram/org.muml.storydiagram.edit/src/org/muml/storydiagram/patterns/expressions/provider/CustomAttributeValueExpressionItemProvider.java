package org.muml.storydiagram.patterns.expressions.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.muml.storydiagram.patterns.expressions.provider.AttributeValueExpressionItemProvider;

public class CustomAttributeValueExpressionItemProvider extends AttributeValueExpressionItemProvider {
	public CustomAttributeValueExpressionItemProvider(AdapterFactory af) {
		super(af);
	}

	@Override
	public Object getImage(Object object) {
		return getImage("patterns/expressions/AttributeValueExpression.png"); //$NON-NLS-1$
	}
}
