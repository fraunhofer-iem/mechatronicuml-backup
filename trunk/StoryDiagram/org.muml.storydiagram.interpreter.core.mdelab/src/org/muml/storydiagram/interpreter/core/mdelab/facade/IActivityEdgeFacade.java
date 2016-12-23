package org.muml.storydiagram.interpreter.core.mdelab.facade;

/**
 * This facade provides access to the source and target nodes of activity edges.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityNode>
 * @param <ActivityEdge>
 */
public interface IActivityEdgeFacade<ActivityNode, ActivityEdge> extends IMetamodelFacade
{
	public ActivityNode getSource(ActivityEdge activityEdge);

	public ActivityNode getTarget(ActivityEdge activityEdge);
}
