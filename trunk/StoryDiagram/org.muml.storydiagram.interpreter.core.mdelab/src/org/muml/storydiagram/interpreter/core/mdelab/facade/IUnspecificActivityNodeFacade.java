package org.muml.storydiagram.interpreter.core.mdelab.facade;

/**
 * This facade provides access to properties of activity nodes of unknown types.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <ActivityNode>
 * @param <ActivityEdge>
 */
public interface IUnspecificActivityNodeFacade<ActivityNode, ActivityEdge> extends IActivityNodeFacade<ActivityNode>
{
	ActivityEdge getNextActivityEdge(ActivityNode activityNode);
}
