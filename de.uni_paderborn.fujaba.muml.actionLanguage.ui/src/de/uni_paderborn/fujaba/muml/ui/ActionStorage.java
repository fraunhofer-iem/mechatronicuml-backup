package de.uni_paderborn.fujaba.muml.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.ActionLanguageResource;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Block;
import de.uni_paderborn.fujaba.muml.model.core.Attribute;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

public class ActionStorage extends ModelStorage<Action> {
	
	private Expression currentExpression;
	
	public ActionStorage(EObject model) {
		Action action = null;
		List<Attribute> attributeList = null;
		if (model instanceof DoEvent) {
			action = ((DoEvent) model).getAction();
			attributeList = ((RealtimeStatechart) model.eContainer().eContainer()).getAllAvailableAttributes();
		} else if (model instanceof EntryOrExitEvent) {
			action = ((EntryOrExitEvent) model).getAction();
			attributeList = ((RealtimeStatechart) model.eContainer().eContainer()).getAllAvailableAttributes();
		} else if (model instanceof Transition) {
			action = ((Transition) model).getAction();
			attributeList = ((Transition) model).getStatechart().getAllAvailableAttributes();
		} else {
			// shouldn't happen because this is used in an object contribution
			throw new IllegalArgumentException("model has invalid type");
		}
		if (action == null) {
			action = addAction(model);
		}
		setModel(action);
		setAttributeList(attributeList);
	}
		
	private Action addAction(EObject model) {
		Action action = RealtimestatechartFactory.eINSTANCE.createAction();
		action.setName("");
		setFeature(model, "action", action);
		return action;
	}

	public InputStream getContents() throws CoreException {
		String text = "{\n\t\n}";
		for (Expression expression : getModel().getExpressions()) {
			if (expression instanceof Block) {
				currentExpression = expression;
			}
		}
		if (currentExpression != null) {
			text = ActionLanguageResource.serializeEObject(currentExpression, getAttributeList());
		}
		return new ByteArrayInputStream(text.getBytes());
	}

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
		setFeature(getModel(), "expressions", list);
	}

	@Override
	public String getName() {
		if (getModel().getName() == null || getModel().getName().equals("")) {
			return "action";
		}
		return getModel().getName();
	}
	
}
