package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.fujaba.properties.runtime.RuntimePlugin;


public abstract class AbstractPropertyEditor implements
		IPropertyEditor {

	protected Object input = null;
	
	protected boolean disposed = false;
		
	protected AdapterFactory adapterFactory = null;
	
	public AbstractPropertyEditor(AdapterFactory adapterFactory) {
		if (adapterFactory == null) {
			adapterFactory = RuntimePlugin.DEFAULT_ADAPTER_FACTORY;
		}
		this.adapterFactory = adapterFactory;
	}

	@Override
	public void setInput(Object object) {
		if (input != object) {
			input = object;
			inputChanged();
		}
	}
	
	protected void inputChanged() {
		refresh();
	}
	
	public void dispose() {
		disposed = true;
	}

	@Override
	public Object getInput() {
		return input;
	}

	@Override
	public void refresh() {
	}

	@Override
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}
	
	@Override
	public boolean isDisposed() {
		return disposed;
	}
	
}
