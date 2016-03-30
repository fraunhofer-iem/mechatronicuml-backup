package org.muml.storydiagram.interpreter.core.facade;

import java.util.ArrayList;
import java.util.Collection;

import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.StoryNode;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IStoryPatternFacade;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;
import org.muml.storydiagram.patterns.Constraint;
import org.muml.storydiagram.patterns.StoryPattern;

public class StoryDrivenStoryPatternFacade implements IStoryPatternFacade<StoryPattern, AbstractVariable, AbstractLinkVariable, Expression>
{

	@Override
	public Collection<AbstractVariable> getStoryPatternObjects(StoryPattern sp)
	{
		assert sp != null;

		return sp.getVariables();
	}

	@Override
	public String getName(StoryPattern sp)
	{
		assert sp != null;

		if (sp.eContainer() instanceof StoryNode)
		{
			return ((StoryNode) sp.eContainer()).getName();
		}

		return null;
	}

	@Override
	public Collection<Expression> getConstraints(StoryPattern sp)
	{
		assert sp != null;

		Collection<Expression> constraints = new ArrayList<Expression>(sp.getConstraints().size());

		for (Constraint constraint : sp.getConstraints())
		{
			constraints.add(constraint.getConstraintExpression());
		}

		return constraints;
	}

}
