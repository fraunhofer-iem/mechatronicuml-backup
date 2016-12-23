package org.muml.storydiagram.interpreter.core.mdelab.notifications;

import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 */
public class VariableValueChangedNotification<Classifier> extends InterpreterNotification<Classifier>
{

	private final Variable<Classifier>	variable;
	private final Object				oldValue;

	public VariableValueChangedNotification(VariablesScope<?, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			Variable<Classifier> variable, Object oldValue)
	{
		super(NotificationTypeEnum.VARIABLE_VALUE_CHANGED, variablesScope, variablesScope);

		assert variable != null;

		this.variable = variable;
		this.oldValue = oldValue;
	}

	public Variable<Classifier> getVariable()
	{
		return this.variable;
	}

	public Object getOldValue()
	{
		return this.oldValue;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return null;
	}
}
