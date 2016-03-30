package org.muml.storydiagram.interpreter.core.facade;

import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IActivityEdgeFacade;

public class StoryDrivenActivityEdgeFacade implements IActivityEdgeFacade<ActivityNode, ActivityEdge>
{

	@Override
	public ActivityNode getSource(ActivityEdge activityEdge)
	{
		assert activityEdge != null;

		return activityEdge.getSource();
	}

	@Override
	public ActivityNode getTarget(ActivityEdge activityEdge)
	{
		assert activityEdge != null;

		return activityEdge.getTarget();
	}

}
