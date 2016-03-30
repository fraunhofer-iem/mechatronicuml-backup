package org.muml.storydiagram.diagram.interpreter.util;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.diagram.interpreter.ConsoleNotificationReceiver;
import org.muml.storydiagram.interpreter.core.mdelab.SDMException;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.NotificationReceiver;
import org.muml.storydiagram.interpreter.core.mdelab.variables.Variable;
import org.muml.storydiagram.interpreter.eclipse.StoryDrivenEclipseInterpreter;

public class InterpreterRunnable implements IRunnableWithProgress {
	private Activity activity;
	private List<Variable<EClassifier>> parameters;
	private NotificationReceiver<EClassifier> receiver;
	private Map<String, Variable<EClassifier>> results;

	public InterpreterRunnable(Activity activity, List<Variable<EClassifier>> parameters, InterpreterConsole console) {
		this.activity = activity;
		this.parameters = parameters;
		receiver = new ConsoleNotificationReceiver(console);
	}

	public Map<String, Variable<EClassifier>> getResults() {
		return results;
	}

	@Override
	public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		StoryDrivenEclipseInterpreter interpreter;
		try {
			interpreter = new StoryDrivenEclipseInterpreter(getClass().getClassLoader());

			interpreter.getNotificationEmitter().addNotificationReceiver(receiver);

			results = interpreter.executeActivity(activity, parameters);

			interpreter.getNotificationEmitter().removeNotificationReceiver(receiver);
		} catch (SDMException e) {
			throw new InvocationTargetException(e);
		}
	}
}