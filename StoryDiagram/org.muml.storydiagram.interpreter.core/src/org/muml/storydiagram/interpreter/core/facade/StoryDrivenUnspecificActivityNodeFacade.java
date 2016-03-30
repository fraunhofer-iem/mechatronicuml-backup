package org.muml.storydiagram.interpreter.core.facade;

import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IUnspecificActivityNodeFacade;

public class StoryDrivenUnspecificActivityNodeFacade extends StoryDrivenActivityNodeFacade implements
		IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge>
{

	@Override
	public ActivityEdge getNextActivityEdge(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode.getOutgoings().size() == 1;

		return activityNode.getOutgoings().get(0);
	}

}
