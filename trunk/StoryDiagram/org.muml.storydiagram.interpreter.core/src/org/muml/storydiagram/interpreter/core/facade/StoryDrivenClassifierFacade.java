package org.muml.storydiagram.interpreter.core.facade;

import org.eclipse.emf.ecore.EClassifier;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IClassifierFacade;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class StoryDrivenClassifierFacade implements IClassifierFacade<EClassifier>
{

	@Override
	public boolean isInstance(EClassifier classifier, Object value)
	{
		return classifier.isInstance(value);
	}

}
