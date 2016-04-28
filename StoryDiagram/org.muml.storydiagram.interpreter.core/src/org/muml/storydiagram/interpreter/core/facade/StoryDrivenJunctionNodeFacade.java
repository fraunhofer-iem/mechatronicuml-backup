package org.muml.storydiagram.interpreter.core.facade;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.EdgeGuard;
import org.muml.storydiagram.activities.JunctionNode;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IDecisionNodeFacade;

public class StoryDrivenJunctionNodeFacade extends StoryDrivenActivityNodeFacade implements
		IDecisionNodeFacade<ActivityNode, ActivityEdge, Expression>
{

	@Override
	public Map<Expression, ActivityEdge> getConditionalNextEdges(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof JunctionNode;

		Map<Expression, ActivityEdge> map = new HashMap<Expression, ActivityEdge>();

		if (activityNode.getOutgoings().size() == 1)
		{
			/*
			 * Merge Node
			 */
			return Collections.emptyMap();
		}

		for (ActivityEdge edge : activityNode.getOutgoings())
		{
			if (edge.getGuard() == EdgeGuard.BOOL)
			{
				map.put(edge.getGuardExpression(), edge);
			}
			else
			{
				assert edge.getGuard() == EdgeGuard.ELSE;
			}
		}

		return map;
	}

	@Override
	public ActivityEdge getUnconditionalNextEdge(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof JunctionNode;

		if (activityNode.getOutgoings().size() == 1)
		{
			/*
			 * Merge Node
			 */
			return activityNode.getOutgoings().get(0);
		}
		else
		{
			for (ActivityEdge edge : activityNode.getOutgoings())
			{
				if (edge.getGuard() == EdgeGuard.ELSE)
				{
					return edge;
				}
				else
				{
					assert edge.getGuard() == EdgeGuard.BOOL;
				}
			}

			return null;
		}
	}

}
