package de.uni_paderborn.fujaba.muml.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.modeling.SDMFactory;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.expressions.ExpressionsFactory;
import org.storydriven.modeling.expressions.TextualExpression;

import de.uni_paderborn.fujaba.muml.ActionLanguageResource;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

public class GuardStorage extends ModelStorage<Transition> {
	
	public GuardStorage(EObject model) {
		if (!(model instanceof Transition)) {
			throw new IllegalArgumentException("invalid model type");
		}
		Transition transition = (Transition) model;
		setModel(transition);
		setAttributeList(transition.getStatechart().getAllAvailableAttributes());
	}

	@Override
	public void save(String text) throws CoreException {
		// FIXME: use expression instead of the TextualExpression
		Expression expression = parseExpression(text);
		TextualExpression textualExpression = ExpressionsFactory.eINSTANCE.createTextualExpression();
		textualExpression.setExpressionText(text);
		setFeature(getModel(), "guard", textualExpression);
	}

	@Override
	public InputStream getContents() throws CoreException {
		String text = "";
		Expression expression = getModel().getGuard();
		if (expression instanceof TextualExpression) {
			text = ((TextualExpression) expression).getExpressionText();
		} else if (expression != null) {
			text = ActionLanguageResource.serializeEObject(expression, getAttributeList());
		}
		return new ByteArrayInputStream(text.getBytes());
	}

	@Override
	public String getName() {
		return "guard";
	}

}
