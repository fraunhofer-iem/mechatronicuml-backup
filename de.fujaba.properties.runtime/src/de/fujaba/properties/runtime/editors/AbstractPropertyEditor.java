package de.fujaba.properties.runtime.editors;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;

public abstract class AbstractPropertyEditor implements
		IPropertyEditor {

	protected Object input = null;
	
	public AbstractPropertyEditor() {
	}

	@Override
	public void setInput(Object object) {
		input = object;
		inputChanged();
	}
	
	protected void inputChanged() {
	}

	@Override
	public Object getInput() {
		return input;
	}

	@Override
	public void refresh() {
	}

}
