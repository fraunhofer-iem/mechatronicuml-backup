package de.uni_paderborn.fujaba.umlrt.model.constraint.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.storydriven.modeling.expressions.ExpressionsFactory;
import org.storydriven.modeling.expressions.TextualExpression;

import de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint;

public class TextualConstraintLanguageVersionPropertyDescriptor extends ItemPropertyDescriptor {

	public TextualConstraintLanguageVersionPropertyDescriptor(AdapterFactory adapterFactory,
			ResourceLocator resourceLocator, String displayName,
			String description, EStructuralFeature feature, boolean isSettable,
			boolean multiLine, boolean sortChoices, Object staticImage,
			String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		// Get the TextualConstraint and it's current TextualExpression.
		TextualConstraint c = (TextualConstraint) object;
		TextualExpression oldExpression = c.getTextualExpression();

		// Create a new TextualExpression object.
		TextualExpression newExpression;
		if (oldExpression == null) {
			newExpression = ExpressionsFactory.eINSTANCE.createTextualExpression();
		} else {
			newExpression = EcoreUtil.copy(oldExpression);
		}

		// Set the new Language Version
		newExpression.setLanguageVersion((String) value);
		c.setTextualExpression(newExpression);
	}

	@Override
	protected Object getValue(EObject object, EStructuralFeature feature) {
		TextualConstraint c = (TextualConstraint) object;

		if (c.getTextualExpression() != null) {
			return c.getTextualExpression().getLanguageVersion();
		}

		return null;
	}
}