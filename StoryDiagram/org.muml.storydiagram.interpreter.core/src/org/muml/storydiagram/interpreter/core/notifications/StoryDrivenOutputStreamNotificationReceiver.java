package org.muml.storydiagram.interpreter.core.notifications;

import java.io.OutputStream;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.interpreter.core.facade.StoryDrivenMetamodelFacadeFactory;
import org.muml.storydiagram.interpreter.core.mdelab.notifications.OutputStreamNotificationReceiver;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.StoryPattern;

public class StoryDrivenOutputStreamNotificationReceiver
		extends
		OutputStreamNotificationReceiver<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractVariable, AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	public StoryDrivenOutputStreamNotificationReceiver(OutputStream outputStream)
	{
		super(StoryDrivenMetamodelFacadeFactory.INSTANCE, outputStream);
	}

	public StoryDrivenOutputStreamNotificationReceiver()
	{
		super(StoryDrivenMetamodelFacadeFactory.INSTANCE);
	}

}
