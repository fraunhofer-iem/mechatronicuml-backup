package org.muml.storydiagram.diagram.custom.properties.sections;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.muml.mumlcore.expressions.Expression;
import org.muml.mumlcore.expressions.ExpressionsFactory;
import org.muml.mumlcore.expressions.TextualExpression;
import org.muml.storydiagram.activities.StatementNode;
import org.muml.storydiagram.diagram.custom.properties.AbstractExpressionSection;

public class StatementNodeExpressionSection extends AbstractExpressionSection {
	@Override
	protected Expression getExpression() {
		if (getElement().getStatementExpression() == null) {
			final TextualExpression expression = ExpressionsFactory.eINSTANCE.createTextualExpression();
			expression.setLanguage("OCL");
			expression.setLanguageVersion("1.0");

			RecordingCommand command = new RecordingCommand((TransactionalEditingDomain) getEditingDomain()) {
				@Override
				protected void doExecute() {
					getElement().setStatementExpression(expression);
				}
			};
			execute(command);
		}
		return getElement().getStatementExpression();
	}

	@Override
	protected StatementNode getElement() {
		return (StatementNode) super.getElement();
	}

	@Override
	protected void postUpdate() {
		Expression expression = getElement().getStatementExpression();

		// TODO: ugly
		getElement().setStatementExpression(null);
		getElement().setStatementExpression(expression);
	}
}
