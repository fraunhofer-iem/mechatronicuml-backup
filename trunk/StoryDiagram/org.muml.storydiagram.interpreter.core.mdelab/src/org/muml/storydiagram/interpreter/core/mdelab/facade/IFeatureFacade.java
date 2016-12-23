package org.muml.storydiagram.interpreter.core.mdelab.facade;

/**
 * This facade provides access to properties of features (i.e. attributes and
 * references).
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Feature>
 */
public interface IFeatureFacade<Feature> extends IMetamodelFacade
{
	String getName(Feature feature);
}
