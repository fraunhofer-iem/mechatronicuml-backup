package org.muml.storydiagram.interpreter.core.facade;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IStoryPatternLinkFacade;
import org.muml.storydiagram.patterns.AbstractLinkVariable;
import org.muml.storydiagram.patterns.AbstractVariable;

public class StoryDrivenAbstractLinkVariableFacade implements
		IStoryPatternLinkFacade<AbstractVariable, AbstractLinkVariable, EStructuralFeature>
{

	@Override
	public String getName(AbstractLinkVariable spl)
	{
		return spl.getName();
	}

}
