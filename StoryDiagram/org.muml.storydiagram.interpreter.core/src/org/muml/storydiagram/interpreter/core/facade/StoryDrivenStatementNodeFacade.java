package org.muml.storydiagram.interpreter.core.facade;

import java.util.Collection;
import java.util.Collections;

import org.muml.mumlcore.expressions.Expression;
import org.muml.storydiagram.activities.ActivityEdge;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.activities.StatementNode;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IExpressionNodeFacade;

public class StoryDrivenStatementNodeFacade extends StoryDrivenActivityNodeFacade implements
		IExpressionNodeFacade<ActivityNode, ActivityEdge, Expression>
{

	@Override
	public Collection<Expression> getExpressions(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode instanceof StatementNode;

		return Collections.singletonList(((StatementNode) activityNode).getStatementExpression());
	}

	@Override
	public ActivityEdge getNextActivityEdge(ActivityNode activityNode)
	{
		assert activityNode != null;
		assert activityNode.getOutgoings().size() == 1;

		return activityNode.getOutgoings().get(0);
	}

}
