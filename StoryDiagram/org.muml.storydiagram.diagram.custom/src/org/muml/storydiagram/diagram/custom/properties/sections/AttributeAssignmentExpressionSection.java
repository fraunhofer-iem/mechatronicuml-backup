package org.muml.storydiagram.diagram.custom.properties.sections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.ExpressionsFactory;
import org.muml.core.expressions.TextualExpression;
import org.muml.storydiagram.diagram.custom.properties.AbstractExpressionSection;
import org.muml.storydiagram.patterns.AttributeAssignment;
import org.muml.storydiagram.patterns.PatternsPackage;

public class AttributeAssignmentExpressionSection extends AbstractExpressionSection {
	@Override
	protected Expression getExpression() {
		if (getElement().getValueExpression() == null) {
			final TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			expression.setLanguage("OCL");
			expression.setLanguageVersion("1.0");

			RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
				@Override
				protected void doExecute() {
					getElement().setValueExpression(expression);
				}
			};
			execute(command);
		}
		return getElement().getValueExpression();
	}

	@Override
	protected EClassifier getContextClassifier() {
		if (getElement() != null && getElement().getAttribute() != null) {
			return getElement().getAttribute().getEType();
		}
		return super.getContextClassifier();
	}

	@Override
	protected void postUpdate() {
		// TODO: ugly
		Expression expression = getElement().getValueExpression();

		getElement().setValueExpression(null);
		getElement().setValueExpression(expression);
	}

	@Override
	protected AttributeAssignment getElement() {
		return (AttributeAssignment) super.getElement();
	}

	@Override
	protected boolean shouldRefresh(Notification msg) {
		return super.shouldRefresh(msg)
				&& PatternsPackage.Literals.ATTRIBUTE_ASSIGNMENT__ATTRIBUTE.equals(msg.getFeature());
	}
}
