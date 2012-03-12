package de.uni_paderborn.fujaba.muml.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.storydriven.modeling.expressions.Expression;

import de.uni_paderborn.fujaba.muml.ActionLanguageResource;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Block;
import de.uni_paderborn.fujaba.muml.model.core.Attribute;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.ui.internal.ActionLanguageActivator;

public class ActionStorage implements IStorage {
	
	private Action action;
	private List<Attribute> attributeList;
	private Expression currentExpression;
	
	public ActionStorage(EObject model) {
		if (model instanceof DoEvent) {
			action = ((DoEvent) model).getAction();
			attributeList = ((RealtimeStatechart) model.eContainer().eContainer()).getAllAvailableAttributes();
		} else if (model instanceof EntryOrExitEvent) {
			action = ((EntryOrExitEvent) model).getAction();
			attributeList = ((RealtimeStatechart) model.eContainer().eContainer()).getAllAvailableAttributes();
		} else if (model instanceof Transition) {
			action = ((Transition) model).getAction();
			attributeList = ((Transition) model).getStatechart().getAllAvailableAttributes();
		}
		if (action == null) {
			addAction(model);
		}
	}
		
	private void addAction(EObject model) {
		action = RealtimestatechartFactory.eINSTANCE.createAction();
		action.setName("");
		setFeature(model, "action", action);
	}
	
	private static EStructuralFeature getFeatureByName(EObject object, String name) {
		EStructuralFeature feature = null;
		for (EStructuralFeature it : object.eClass().getEAllStructuralFeatures()) {
			if (it.getName().equals(name)) {
				feature = it;
				break;
			}
		}
		return feature;
	}
	
	private static void setFeature(EObject object, String name, Object value) {
		EStructuralFeature feature = getFeatureByName(object, name);
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(object);
		Command command = SetCommand.create(editingDomain, object, feature, value);
		editingDomain.getCommandStack().execute(command);
	}

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Attribute> getAttributeList() {
		return attributeList;
	}

	@Override
	public InputStream getContents() throws CoreException {
		String string = "{\n\t\n}";
		for (Expression expression : action.getExpressions()) {
			if (expression instanceof Block) {
				currentExpression = expression;
			}
		}
		if (currentExpression != null) {
			string = ActionLanguageResource.serializeEObject(currentExpression, attributeList);
		}
		return new ByteArrayInputStream(string.getBytes());
	}

	public void save(String text) throws CoreException {
		Expression expression = (Expression) ActionLanguageResource.loadFromString(text, getAttributeList());
		String error = ActionLanguageResource.getloadErrorMessage();
		if (!error.equals("")) {
			String pluginId = ActionLanguageActivator.getInstance().getBundle().getSymbolicName();
			IStatus status = new Status(IStatus.ERROR, pluginId, IStatus.ERROR, error, null);
			throw new CoreException(status);
		}
		List<Expression> list = new ArrayList<Expression>();
		// keep all old expressions except currentExpression
		int index = 0;
		list.addAll(action.getExpressions());
		if (currentExpression != null) {
			index = list.indexOf(currentExpression);
			list.remove(index);
		}
		list.add(index, expression);
		setFeature(action, "expressions", list);
	}

	@Override
	public IPath getFullPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		if (action.getName() == null || action.getName().equals("")) {
			return "action";
		}
		return action.getName();
	}

	@Override
	public boolean isReadOnly() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean equals(Object object) {
		if (object instanceof ActionStorage) {
			return action.equals(((ActionStorage) object).action);
		}
		return false;
	}
	
}
