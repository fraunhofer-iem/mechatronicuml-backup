package org.muml.storydiagram.interpreter.core.mdelab.facade;

/**
 * This facade provides access to properties of story pattern links.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <StoryPatternObject>
 * @param <StoryPatternLink>
 * @param <Feature>
 */
public interface IStoryPatternLinkFacade<StoryPatternObject, StoryPatternLink, Feature> extends IMetamodelFacade
{

	String getName(StoryPatternLink spl);
}
