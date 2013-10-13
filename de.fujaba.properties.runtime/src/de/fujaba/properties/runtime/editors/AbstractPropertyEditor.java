package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.fujaba.properties.runtime.RuntimePlugin;


public abstract class AbstractPropertyEditor implements
		IPropertyEditor {
	
	protected Composite parentComposite = null;

	protected Object input = null;
	
	protected boolean disposed = false;
		
	protected AdapterFactory adapterFactory = null;
	
	protected List<IFilter> visibilityFilters = new ArrayList<IFilter>();
	
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
	public void createControls(Composite parent, FormToolkit toolkit) {
		parentComposite = parent;
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

	@Override
	public void addVisibilityFilter(IFilter filter) {
		visibilityFilters.add(filter);
	}

	@Override
	public void removeVisibilityFilter(IFilter filter) {
		visibilityFilters.remove(filter);
	}

	public void setVisible(boolean visible) {
		// Abstract implementation relayouts parent
		if (parentComposite != null) {
			RuntimePlugin.revalidateLayout(parentComposite);
		}
	}
	
	public void show() {
		setVisible(true);
	}
	
	public void hide() {
		setVisible(false);
	}
}
