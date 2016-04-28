package org.muml.storydiagram.diagram.custom.properties.sections;

import org.muml.mumlcore.expressions.Expression;
import org.muml.storydiagram.diagram.custom.properties.AbstractExpressionSection;
import org.muml.storydiagram.patterns.Path;

public class PathExpressionSection extends AbstractExpressionSection {
	@Override
	protected Expression getExpression() {
		return getElement().getPathExpression();
	}

	@Override
	protected Path getElement() {
		return (Path) super.getElement();
	}
}
