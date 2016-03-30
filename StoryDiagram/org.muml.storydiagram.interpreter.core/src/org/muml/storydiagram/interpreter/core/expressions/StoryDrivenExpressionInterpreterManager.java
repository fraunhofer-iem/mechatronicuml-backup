package org.muml.storydiagram.interpreter.core.expressions;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.interpreter.core.facade.StoryDrivenMetamodelFacadeFactory;
import org.muml.storydiagram.interpreter.core.mdelab.expressions.ExpressionInterpreterManager;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.NotificationEmitter;
import org.muml.storydiagram.interpreter.core.notifications.StoryDrivenNotificationEmitter;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.StoryPattern;

public class StoryDrivenExpressionInterpreterManager
		extends
		ExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	public StoryDrivenExpressionInterpreterManager(
			ClassLoader classLoader,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
	{
		super(StoryDrivenMetamodelFacadeFactory.INSTANCE, classLoader, notificationEmitter);
	}

	public StoryDrivenExpressionInterpreterManager(ClassLoader classLoader)
	{
		this(classLoader, new StoryDrivenNotificationEmitter());
	}

}
