package de.uni_paderborn.fujaba.muml.storage;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.model.core.Attribute;

public abstract class ModelStorage<T> implements IModelStorage {
	private EObject container;
	private T model;
	private List<Attribute> attributeList;
	
	public ModelStorage(EObject container) {
		this.container = container;
	}
	
	@Override
	public IPath getFullPath() {
		return null;
	}

	@Override
	public boolean isReadOnly() {
		return false;
	}

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attribute> getAttributeList() {
		return attributeList;
	}
	
	@Override
	public EObject getContainer() {
		return container;
	}

	public boolean equals(Object object) {
		if (object instanceof ModelStorage) {
			return getModel().equals(((ModelStorage<T>) object).getModel());
		}
		return false;
	}

	protected void setAttributeList(List<Attribute> attributeList) {
		this.attributeList = attributeList;
	}

	protected T getModel() {
		return model;
	}

	protected void setModel(T model) {
		this.model = model;
	}

	protected Expression parseExpression(String text) throws CoreException {
		Expression expression = (Expression) LanguageResource.loadFromString(text, getAttributeList());
		String error = LanguageResource.getloadErrorMessage();
		if (!error.equals("")) {
			String pluginId = "FIXME"; //ActionLanguageActivator.getInstance().getBundle().getSymbolicName();
			IStatus status = new Status(IStatus.ERROR, pluginId, IStatus.ERROR, error, null);
			throw new CoreException(status);
		}
		return expression;
	}
	
	protected String serializeExpression(EObject object) {
		String text = LanguageResource.serializeEObject(object, getAttributeList());
		return text;
	}
	
	@Override
	public String serialize() {
		InputStream istream = null;
		String text = "";
		try {
			istream = getContents();
		} catch (CoreException e) {
			// should not happen
			e.printStackTrace();
		}
		try {
			int available = istream.available();
			byte[] byteArray = new byte[available];
			istream.read(byteArray);
			text = new String(byteArray);
		} catch (IOException e) {
			// should not happen
			e.printStackTrace();
		}
		return text;
	}

	protected static EStructuralFeature getFeatureByName(EObject object, String name) {
		EStructuralFeature feature = null;
		for (EStructuralFeature it : object.eClass().getEAllStructuralFeatures()) {
			if (it.getName().equals(name)) {
				feature = it;
				break;
			}
		}
		return feature;
	}

	protected static void setFeature(EObject object, String name, Object value) {
		EStructuralFeature feature = getFeatureByName(object, name);
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(object);
		Command command = SetCommand.create(editingDomain, object, feature, value);
		editingDomain.getCommandStack().execute(command);
	}
}