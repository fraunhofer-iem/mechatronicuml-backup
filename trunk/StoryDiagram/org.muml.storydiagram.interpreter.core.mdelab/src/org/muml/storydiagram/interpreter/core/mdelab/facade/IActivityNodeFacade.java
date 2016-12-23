package org.muml.storydiagram.interpreter.core.mdelab.facade;

/**
 * This facade provides access to general properties of activity nodes.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityNode>
 */
public interface IActivityNodeFacade<ActivityNode> extends IMetamodelFacade
{
	EActivityNodeType getActivityNodeType(ActivityNode activityNode);

	String getName(ActivityNode activityNode);
}
