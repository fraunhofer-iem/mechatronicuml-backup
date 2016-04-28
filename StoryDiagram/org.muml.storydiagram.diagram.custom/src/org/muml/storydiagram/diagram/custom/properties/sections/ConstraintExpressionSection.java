package org.muml.storydiagram.diagram.custom.properties.sections;

import org.eclipse.emf.ecore.EClassifier;
import org.muml.mumlcore.expressions.Expression;
import org.muml.storydiagram.patterns.Constraint;
import org.muml.storydiagram.ui.properties.AbstractExtendedExpressionSection;

public class ConstraintExpressionSection extends AbstractExtendedExpressionSection {
	@Override
	protected Expression getExpression() {
		return getElement().getConstraintExpression();
	}

	@Override
	protected void setExpression(Expression expression) {
		getElement().setConstraintExpression(expression);
	}

	@Override
	protected EClassifier getContextClassifier() {
		if (getElement().getObjectVariable() != null) {
			return getElement().getObjectVariable().getClassifier();
		}
		return super.getContextClassifier();
	}

	@Override
	protected Constraint getElement() {
		return (Constraint) super.getElement();
	}

	@Override
	protected String getLabelText() {
		return "Constraint Expression";
	}
}
