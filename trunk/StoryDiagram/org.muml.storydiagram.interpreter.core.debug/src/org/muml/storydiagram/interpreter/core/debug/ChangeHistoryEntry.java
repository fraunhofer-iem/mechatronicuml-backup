package org.muml.storydiagram.interpreter.core.debug;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.InterpreterNotification;

public class ChangeHistoryEntry
{

	private final ChangeDescription						changeDescription;

	private final InterpreterNotification<EClassifier>	interpreterNotification;

	public ChangeHistoryEntry(ChangeDescription changeDescription, InterpreterNotification<EClassifier> interpreterNotification)
	{
		this.changeDescription = changeDescription;

		this.interpreterNotification = interpreterNotification;
	}

	public ChangeDescription getChangeDescription()
	{
		return this.changeDescription;
	}

	public InterpreterNotification<EClassifier> getInterpreterNotification()
	{
		return this.interpreterNotification;
	}
}
