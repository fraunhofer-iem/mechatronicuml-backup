package org.muml.storydiagram.interpreter.core.mdelab.notifications;

import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 */
public class VariableCreatedNotification<Classifier> extends InterpreterNotification<Classifier>
{

	private final Variable<Classifier>	variable;

	public VariableCreatedNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope, Variable<Classifier> variable)
	{
		super(NotificationTypeEnum.VARIABLE_CREATED, variablesScope, variablesScope);

		assert variable != null;

		this.variable = variable;
	}

	public Variable<Classifier> getVariable()
	{
		return this.variable;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return null;
	}
}
