package org.muml.pim.actionlanguage.xtext.storage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.TextualExpression;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Transition;

public class GuardStorage extends ModelStorage<Transition> {
	private static final String name = "guard";
	
	public GuardStorage(EObject model) {
		super(model);
		if (!(model instanceof Transition)) {
			throw new IllegalArgumentException("invalid model type");
		}
		Transition transition = (Transition) model;
		setModel(transition);
	}

	@Override
	public InputStream getContents() throws CoreException {
		String text = "";
		Expression expression = getModel().getGuard();
		if (expression instanceof TextualExpression) {
			// just a dummy call to initialize the scope
			// will be removed once the textualexpression is removed
			LanguageResource.loadFromString("{}", getContainer());
			text = ((TextualExpression) expression).getExpressionText();
		} else if (expression != null) {
			text = LanguageResource.serializeEObject(expression, getContainer());
		}
		return new ByteArrayInputStream(text.getBytes());
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	protected EStructuralFeature getFeature() {
		return RealtimestatechartPackage.Literals.TRANSITION__GUARD;
	}

}
