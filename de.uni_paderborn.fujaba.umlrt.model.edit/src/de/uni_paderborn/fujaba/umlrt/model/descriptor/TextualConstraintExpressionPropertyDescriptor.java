package de.uni_paderborn.fujaba.umlrt.model.descriptor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.storydriven.modeling.expressions.ExpressionsFactory;
import org.storydriven.modeling.expressions.ExpressionsPackage;
import org.storydriven.modeling.expressions.TextualExpression;

import de.uni_paderborn.fujaba.common.descriptor.NavigatedObjectPropertyDescriptor;
import de.uni_paderborn.fujaba.umlrt.model.constraint.TextualConstraint;

/**
 * @generated NOT
 * 
 * @author bingo
 * 
 */
public class TextualConstraintExpressionPropertyDescriptor extends
		NavigatedObjectPropertyDescriptor {

	public TextualConstraintExpressionPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {
		super(adapterFactory, resourceLocator, displayName, description,
				feature, isSettable, multiLine, sortChoices, staticImage,
				category, filterFlags);
	}

	@Override
	protected EObject createNewObject() {
		return ExpressionsFactory.eINSTANCE.createTextualExpression();
	}

	@Override
	protected EObject getNavigatedObject(Object object) {
		return ((TextualConstraint) object).getTextualExpression();
	}

	@Override
	protected void setNavigatedObject(Object object, EObject newObject) {
		((TextualConstraint) object)
				.setTextualExpression((TextualExpression) newObject);
	}

	@Override
	protected void configureObject(EObject newObject,
			EStructuralFeature feature, Object value) {

		if (feature.getContainerClass() == TextualExpression.class) {
			int featureID = feature.getFeatureID();
			switch (featureID) {
			case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
				((TextualExpression) newObject)
						.setExpressionText((String) value);
				break;
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
				((TextualExpression) newObject).setLanguage((String) value);
				break;
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
				((TextualExpression) newObject)
						.setLanguageVersion((String) value);
				break;
			}
		}

	}

	@Override
	protected Object getObjectValue(EObject navigatedObject,
			EStructuralFeature feature) {

		if (feature.getContainerClass() == TextualExpression.class) {
			int featureID = feature.getFeatureID();
			switch (featureID) {
			case ExpressionsPackage.TEXTUAL_EXPRESSION__EXPRESSION_TEXT:
				return ((TextualExpression) navigatedObject)
						.getExpressionText();
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE:
				return ((TextualExpression) navigatedObject).getLanguage();
			case ExpressionsPackage.TEXTUAL_EXPRESSION__LANGUAGE_VERSION:
				return ((TextualExpression) navigatedObject)
						.getLanguageVersion();
			}
		}
		return null;

	}

}
