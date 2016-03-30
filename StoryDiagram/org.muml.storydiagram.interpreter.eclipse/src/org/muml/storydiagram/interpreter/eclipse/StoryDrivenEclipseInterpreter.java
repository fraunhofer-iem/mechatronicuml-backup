package org.muml.storydiagram.interpreter.eclipse;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.interpreter.core.StoryDrivenInterpreter;
import org.muml.storydiagram.interpreter.core.eclipse.EclipseExpressionInterpreterManager;
import org.muml.storydiagram.interpreter.core.facade.StoryDrivenMetamodelFacadeFactory;
import org.muml.storydiagram.interpreter.core.mdelab.SDMException;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.NotificationEmitter;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.StoryPattern;

public class StoryDrivenEclipseInterpreter extends StoryDrivenInterpreter
{
	public StoryDrivenEclipseInterpreter(

			ClassLoader classLoader,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression> notificationEmitter)
			throws SDMException
	{
		super(
				new EclipseExpressionInterpreterManager<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>(
						StoryDrivenMetamodelFacadeFactory.INSTANCE, classLoader, notificationEmitter), notificationEmitter);
	}

	public StoryDrivenEclipseInterpreter(ClassLoader classLoader) throws SDMException
	{
		this(
				classLoader,
				new NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>());
	}
}
