package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;

import de.fujaba.properties.runtime.RuntimePlugin;
import de.fujaba.properties.runtime.sections.ObjectPropertySection;


public abstract class AbstractPropertyEditor implements
		IPropertyEditor {
	
	private ObjectPropertySection propertySection;
	
	private String tab = null;
	
	protected Object input = null;
	
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

	@Override
	public Object getInput() {
		return input;
	}

	@Override
	public void refresh() {
	}
	
	@Override
	public void setTab(String tab) {
		this.tab = tab;
	}

	@Override
	public String getTab() {
		return tab;
	}

	@Override
	public ObjectPropertySection getPropertySection() {
		return propertySection;
	}
	
	@Override
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

}
