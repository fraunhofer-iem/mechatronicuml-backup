package org.muml.storydiagram.interpreter.core.mdelab.notifications;

import java.util.Collection;

import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

/**
 * Execution of an activity has started.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Activity>
 * @param <Classifier>
 */
public class ActivityExecutionStartedNotification<Activity, Classifier> extends InterpreterNotification<Classifier>
{
	private final Activity							activity;
	private final Collection<Variable<Classifier>>	parameters;

	public ActivityExecutionStartedNotification(final VariablesScope<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> variablesScope,
			final Notifier<Activity, ?, ?, ?, ?, ?, Classifier, ?, ?> notifier, final Activity activity,
			final Collection<Variable<Classifier>> parameters)
	{
		super(NotificationTypeEnum.ACTIVITY_EXECUTION_STARTED, variablesScope, notifier);

		assert activity != null;

		this.activity = activity;
		this.parameters = parameters;
	}

	public Activity getActivity()
	{
		return this.activity;
	}

	public Collection<Variable<Classifier>> getParameters()
	{
		return this.parameters;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getActivity();
	}
}
