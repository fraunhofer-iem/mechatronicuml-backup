package org.muml.pim.actionlanguage.xtext.storage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.actionlanguage.Block;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.DoEvent;
import org.muml.pim.realtimestatechart.EntryOrExitEvent;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Transition;

public class ActionStorage extends ModelStorage<Action> {
	private static final String name = "action";
	private Expression currentExpression;
	
	public ActionStorage(EObject model) {
		super(model);
		Action action = null;
		EReference reference;
		if (model instanceof DoEvent) {
			action = ((DoEvent) model).getAction();
			reference = RealtimestatechartPackage.Literals.DO_EVENT__ACTION;
		} else if (model instanceof EntryOrExitEvent) {
			action = ((EntryOrExitEvent) model).getAction();
			reference = RealtimestatechartPackage.Literals.ENTRY_OR_EXIT_EVENT__ACTION;
		} else if (model instanceof Transition) {
			action = ((Transition) model).getAction();
			reference = RealtimestatechartPackage.Literals.TRANSITION__ACTION;
		} else {
			// shouldn't happen because this is used in an object contribution
			throw new IllegalArgumentException("model has invalid type");
		}
		if (action == null) {
			action = addAction(model, reference);
		}
		setModel(action);
	}

	private Action addAction(EObject model, EReference reference) {
		Action action = RealtimestatechartFactory.eINSTANCE.createAction();
		action.setName("");
		setFeature(model, reference, action);
		return action;
	}

	@Override
	public InputStream getContents() throws CoreException {
		String text = "{\n\t\n}";
		for (Expression expression : getModel().getExpressions()) {
			if (expression instanceof Block) {
				currentExpression = expression;
			}
		}
		if (currentExpression != null) {
			text = LanguageResource.serializeEObject(currentExpression, getContainer());
		}
		return new ByteArrayInputStream(text.getBytes());
	}

	@Override
	public void save(String text) throws CoreException {
		Expression expression = parseExpression(text);
		List<Expression> list = new ArrayList<Expression>();
		// keep all old expressions except currentExpression
		int index = 0;
		list.addAll(getModel().getExpressions());
		if (currentExpression != null) {
			index = list.indexOf(currentExpression);
			list.remove(index);
		}
		list.add(index, expression);
		currentExpression = expression;
		setFeature(getModel(), getFeature(), list);
	}

	@Override
	public String getName() {
		if (getModel().getName() == null || getModel().getName().equals("")) {
			return name;
		}
		return getModel().getName();
	}
	
	@Override
	public EStructuralFeature getFeature() {
		return RealtimestatechartPackage.Literals.ACTION__EXPRESSIONS;
	}
	
}