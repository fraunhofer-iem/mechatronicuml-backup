package org.muml.pim.actionlanguage.xtext.storage;

import java.io.IOException;
import java.io.InputStream;

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
import org.muml.core.common.xtext.ILoadResult;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.actionlanguage.xtext.common.LanguageResource;

public abstract class ModelStorage<T extends EObject> implements IModelStorage {
	private EObject container;
	private T model;
	
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
	public EObject getContainer() {
		return container;
	}

	public boolean equals(Object object) {
		if (object instanceof ModelStorage) {
			return getModel().equals(((ModelStorage<T>) object).getModel());
		}
		return false;
	}

	protected T getModel() {
		return model;
	}

	protected void setModel(T model) {
		this.model = model;
	}

	protected Expression parseExpression(String text) throws CoreException {
		ILoadResult loadResult = LanguageResource.loadFromString(text, getContainer());
		if (loadResult.hasError()) {
			String pluginId = "FIXME"; //ActionLanguageActivator.getInstance().getBundle().getSymbolicName();
			IStatus status = new Status(IStatus.ERROR, pluginId, IStatus.ERROR, loadResult.getError(), null);
			throw new CoreException(status);
		}
		return (Expression) loadResult.getEObject();
	}
	
	protected String serializeExpression(EObject object) {
		String text = LanguageResource.serializeEObject(object, getContainer());
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
	

	@Override
	public void save(String text) throws CoreException {
		Expression expression = parseExpression(text);
		//TextualExpression textualExpression = ExpressionsFactory.eINSTANCE.createTextualExpression();
		//textualExpression.setExpressionText(text);
		setFeature(getModel(), getFeature(), expression);
	}
	
	@Override
	public void save(EObject object) throws CoreException {
		String text = serializeExpression(object);
		save(text);
	}
	
	protected abstract EStructuralFeature getFeature();

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
	
	protected static void setFeature(EObject object, EStructuralFeature feature, Object value) {
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(object);
		Command command = SetCommand.create(editingDomain, object, feature, value);
		editingDomain.getCommandStack().execute(command);
	}
}