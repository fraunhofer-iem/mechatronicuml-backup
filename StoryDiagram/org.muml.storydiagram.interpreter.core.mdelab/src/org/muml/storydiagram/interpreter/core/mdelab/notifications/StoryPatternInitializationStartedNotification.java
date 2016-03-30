package org.muml.storydiagram.interpreter.core.mdelab.notifications;

import org.muml.storydiagram.interpreter.core.mdelab.variables.VariablesScope;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPattern>
 * @param <Classifier>
 */
public class StoryPatternInitializationStartedNotification<StoryPattern, Classifier> extends InterpreterNotification<Classifier>
{
	private final StoryPattern	storyPattern;

	public StoryPatternInitializationStartedNotification(VariablesScope<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> variablesScope,
			Notifier<?, ?, ?, StoryPattern, ?, ?, Classifier, ?, ?> notifier, StoryPattern storyPattern)
	{
		super(NotificationTypeEnum.STORY_PATTERN_INITIALIZATION_STARTED, variablesScope, notifier);

		assert storyPattern != null;

		this.storyPattern = storyPattern;
	}

	public StoryPattern getStoryPattern()
	{
		return this.storyPattern;
	}

	@Override
	public Object getMainStoryDiagramElement()
	{
		return this.getStoryPattern();
	}
}
