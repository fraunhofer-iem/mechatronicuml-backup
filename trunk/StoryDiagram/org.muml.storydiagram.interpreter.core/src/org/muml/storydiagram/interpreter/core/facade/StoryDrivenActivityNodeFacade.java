package org.muml.storydiagram.interpreter.core.facade;

import org.muml.storydiagram.activities.ActivityCallNode;
import org.muml.storydiagram.activities.ActivityFinalNode;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.InitialNode;
import org.muml.storydiagram.activities.JunctionNode;
import org.muml.storydiagram.activities.StatementNode;
import org.muml.storydiagram.activities.StoryNode;
import org.muml.storydiagram.interpreter.core.mdelab.facade.EActivityNodeType;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IActivityNodeFacade;

public abstract class StoryDrivenActivityNodeFacade implements IActivityNodeFacade<ActivityNode>
{
	@Override
	public EActivityNodeType getActivityNodeType(ActivityNode activityNode)
	{
		assert activityNode != null;

		if (activityNode instanceof StoryNode)
		{
			return EActivityNodeType.STORY_NODE;
		}
		else if (activityNode instanceof StatementNode)
		{
			return EActivityNodeType.STATEMENT_NODE;
		}
		else if (activityNode instanceof JunctionNode)
		{
			return EActivityNodeType.DECISION_NODE;
		}
		else if (activityNode instanceof ActivityFinalNode)
		{
			return EActivityNodeType.ACTIVITY_FINAL_NODE;
		}
		else if (activityNode instanceof InitialNode)
		{
			return EActivityNodeType.NON_EXECUTABLE_NODE;
		}
		else if (activityNode instanceof ActivityCallNode)
		{
			return EActivityNodeType.CUSTOM_NODE;
		}
		else
		{
			throw new UnsupportedOperationException(
					"Activity nodes of type '"
							+ activityNode.eClass().getName()
							+ "' are not yet supported. Extend the getActivityNodeType() operation in StoryDrivenActivityNodeFacade to return CUSTOM_NODE for this node type and provide an appropriate implementation in StoryDrivenInterpreter.executeCustomNode() to execute these nodes.");
		}
	}

	@Override
	public String getName(ActivityNode activityNode)
	{
		assert activityNode != null;

		return activityNode.getName();
	}
}
