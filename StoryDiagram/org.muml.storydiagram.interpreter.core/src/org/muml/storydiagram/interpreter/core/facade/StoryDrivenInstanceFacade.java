package org.muml.storydiagram.interpreter.core.facade;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.mumlcore.expressions.Expression;
import org.muml.storydiagram.interpreter.core.mdelab.facade.IInstanceFacade;
import org.muml.storydiagram.patterns.AbstractLinkVariable;

/**
 * 
 * @author Stephan Hildebrandt
 * 
 */
public class StoryDrivenInstanceFacade implements IInstanceFacade<AbstractLinkVariable, EClassifier, EStructuralFeature, Expression>
{

	@Override
	public void setAttributeValue(Object sourceInstanceObject, EStructuralFeature feature, Object value)
	{
		assert sourceInstanceObject != null;
		assert feature != null;
		assert sourceInstanceObject instanceof EObject;

		assert feature.isChangeable();

		((EObject) sourceInstanceObject).eSet(feature, value);
	}

}
