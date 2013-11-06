package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;

public abstract class AbstractPropertyEditor implements IPropertyEditor {

	private boolean visible = true;

	protected Composite parentComposite = null;

	protected Object input = null;

	protected boolean disposed = false;

	protected AdapterFactory adapterFactory = null;

	protected List<IFilter> visibilityFilters = new ArrayList<IFilter>();

	protected String tooltipMessage = "";

	public AbstractPropertyEditor(AdapterFactory adapterFactory) {
		if (adapterFactory == null) {
			adapterFactory = RuntimePlugin.DEFAULT_ADAPTER_FACTORY;
		}
		this.adapterFactory = adapterFactory;
	}

	@Override
	public void setInput(Object object) {
		Object oldObject = input;
		if (oldObject != object) {
			input = object;
			inputChanged(oldObject);
		}
	}

	protected void inputChanged(Object oldObject) {
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
			layout();
		}
	}

	public boolean isVisible() {
		return visible;
	}

	public void show() {
		setVisible(true);
	}

	public void hide() {
		setVisible(false);
	}

	public void layout() {
		if (parentComposite != null) {
			RuntimePlugin.revalidateLayout(parentComposite);
		}
	}

	protected abstract void doSetVisible(boolean visible);

	@Override
	public void setTooltipMessage(String message) {
		this.tooltipMessage = message;
	}
	
	protected void installTooltip(Control control) {
		control.setToolTipText(tooltipMessage);
	}

}
