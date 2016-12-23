package org.muml.storydiagram.interpreter.core.facade;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IFeatureFacade;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class StoryDrivenFeatureFacade implements IFeatureFacade<EStructuralFeature>
{

	@Override
	public String getName(EStructuralFeature feature)
	{
		return feature.getName();
	}

}
