package org.muml.storydiagram.interpreter.core.facade;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.activities.ActivityNode;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IActivityFacade;

public class StoryDrivenActivityFacade implements IActivityFacade<Activity, ActivityNode>
{

	@Override
	public ActivityNode getInitialNode(Activity activity)
	{
		assert activity != null;

		for (ActivityNode n : activity.getOwnedActivityNodes())
		{
			if (n.eClass() == ActivitiesPackage.Literals.INITIAL_NODE)
			{
				return n;
			}
		}

		return null;
	}

	@Override
	public String getName(Activity activity)
	{
		assert activity != null;

		return activity.getName();
	}

	@Override
	public Map<String, Map<String, List<String>>> getExpressionImports(Activity activity)
	{
		return Collections.emptyMap();
	}

}
