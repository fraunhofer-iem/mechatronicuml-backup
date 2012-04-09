package de.uni_paderborn.fujaba.muml.storage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.ExpressionsFactory;
import org.storydriven.core.expressions.TextualExpression;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

public class GuardStorage extends ModelStorage<Transition> {
	
	public GuardStorage(EObject model) {
		super(model);
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
	public void save(EObject object) throws CoreException {
		String text = serializeExpression(object);
		save(text);
	}

	@Override
	public InputStream getContents() throws CoreException {
		String text = "";
		Expression expression = getModel().getGuard();
		if (expression instanceof TextualExpression) {
			// just a dummy call to initialize the scope
			// will be removed once the textualexpression is removed
			LanguageResource.loadFromString("{}", getAttributeList());
			text = ((TextualExpression) expression).getExpressionText();
		} else if (expression != null) {
			text = LanguageResource.serializeEObject(expression, getAttributeList());
		}
		return new ByteArrayInputStream(text.getBytes());
	}

	@Override
	public String getName() {
		return "guard";
	}

}
