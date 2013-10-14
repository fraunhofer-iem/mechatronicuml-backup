package de.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.ocl.examples.eventmanager.EventFilter;
import org.eclipse.ocl.examples.eventmanager.EventManager;
import org.eclipse.ocl.examples.eventmanager.EventManagerFactory;
import org.eclipse.ocl.examples.impactanalyzer.ImpactAnalyzer;
import org.eclipse.ocl.examples.impactanalyzer.ImpactAnalyzerFactory;
import org.eclipse.ocl.examples.impactanalyzer.util.OCLFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.fujaba.properties.runtime.RuntimePlugin;

public abstract class AbstractPropertyEditor implements IPropertyEditor {

	private boolean visible = true;
	
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
		updateVisibility(true);
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

	public void updateVisibility(boolean relayout) {
		boolean visibility = true;
		for (IFilter filter : visibilityFilters) {
			if (!filter.select(input)) {
				visibility = false;
				break;
			}
		}
		setVisible(visibility, relayout, false);
	}

	public void setVisible(boolean visible) {
		setVisible(visible, true, false);
	}

	public void setVisible(boolean visible, boolean relayout, boolean force) {
		if (this.visible == visible && !force) {
			return;
		}
		this.visible = visible;
		doSetVisible(visible);

		// Relayout parent if requested
		if (relayout && parentComposite != null) {
			RuntimePlugin.revalidateLayout(parentComposite);
		}
	}

	public void show() {
		setVisible(true);
	}

	public void hide() {
		setVisible(false);
	}

	protected abstract void doSetVisible(boolean visible);
}
