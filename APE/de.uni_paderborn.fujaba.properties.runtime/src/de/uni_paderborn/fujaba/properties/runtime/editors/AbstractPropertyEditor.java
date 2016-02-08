package de.uni_paderborn.fujaba.properties.runtime.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin;

public abstract class AbstractPropertyEditor implements IPropertyEditor {


	protected Composite parentComposite = null;
	protected Object input = null;
	protected boolean disposed = false;
	protected AdapterFactory adapterFactory = null;
	protected String tooltipMessage = "";

	// Visibility
	protected List<IFilter> visibilityFilters = new ArrayList<IFilter>();
	private boolean visible = true;

	// Enablement
	protected List<IFilter> readOnlyFilters = new ArrayList<IFilter>();
	private boolean enabled = true;
	
	protected FocusListener focusListener = new FocusAdapter() {
		public void focusGained(org.eclipse.swt.events.FocusEvent e) {
			// Write to status bar
			// IActionBars bars = getViewSite().getActionBars();
			// bars.getStatusLineManager().setMessage("Hello");
		};
	};

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
		} else {
			refresh();
		}
	}

	protected void inputChanged(Object oldObject) {
		updateVisibility(true);
		updateEnablement();
		refresh();
	}

	
	@Override
	public final void createControls(Composite parent, FormToolkit toolkit) {
		parentComposite = parent;
		doCreateControls(parent, toolkit);
		updateVisibility(true, true);
		updateEnablement(true);
	}
	
	protected abstract void doCreateControls(Composite parent, FormToolkit toolkit);

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
		updateVisibility(true);
	}

	@Override
	public void removeVisibilityFilter(IFilter filter) {
		visibilityFilters.remove(filter);
		updateVisibility(true);
	}

	public void updateVisibility(boolean relayout) {
		updateVisibility(relayout, false);
	}

	public void updateVisibility(boolean relayout, boolean force) {
		boolean visibility = true;
		for (IFilter filter : visibilityFilters) {
			if (!filter.select(input)) {
				visibility = false;
				break;
			}
		}
		setVisible(visibility, relayout, force);
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

	protected void doSetVisible(boolean visible) {
		for (Control control : getControls()) {
			if (control != null && !control.isDisposed()) { // elements can be null, see javadoc of getControls()
				control.setVisible(visible);
				if (control.getLayoutData() instanceof GridData) {
					((GridData) control.getLayoutData()).exclude = !visible;
				}
			}
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
	
	@Override
	public void addReadOnlyFilter(IFilter filter) {
		readOnlyFilters.add(filter);
		updateEnablement();
	}
	
	@Override
	public void removeReadOnlyFilter(IFilter filter) {
		readOnlyFilters.remove(filter);
		updateEnablement();
	}

	@Override
	public void updateEnablement() {
		updateEnablement(false);
	}

	public void updateEnablement(boolean force) {
		boolean enablement = true;
		for (IFilter filter : readOnlyFilters) {
			if (filter.select(input)) {
				enablement = false;
				break;
			}
		}
		setEnabled(enablement, force);
	}

	public void setEnabled(boolean enabled) {
		setEnabled(enabled, false);
	}

	@Override
	public void setEnabled(boolean enabled, boolean force) {
	
		if (this.enabled == enabled && !force) {
			return;
		}
		this.enabled = enabled;
		doSetEnabled(enabled);
		
	}
	protected void doSetEnabled(boolean enabled) {
		for (Control control : getControls()) {
			if (control != null && !control.isDisposed()) { // elements can be null, see javadoc of getControls()
				control.setEnabled(enabled);
			}
		}
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void layout() {
		if (parentComposite != null) {
			RuntimePlugin.revalidateLayout(parentComposite);
		}
	}

	@Override
	public void setTooltipMessage(String message) {
		this.tooltipMessage = message;
	}

	protected void installTooltip() {
		for (Control control : getControls()) {
			if (control != null && !control.isDisposed()) { // elements can be null, see javadoc of getControls()
				installTooltip(control);
			}
		}
	}

	protected void installTooltip(Control control) {
		control.setToolTipText(tooltipMessage);
		control.removeFocusListener(focusListener);
		control.addFocusListener(focusListener);
	}

	/**
	 * Returns the GUI elements that this editor consists of. They are used to
	 * call setVisible() on them, or to set a tooltip.
	 * 
	 * <b>
	 * Elements in this list are allowed to be null.
	 * The caller of this method is responsible for null checks.
	 * </b>
	 * 
	 * @return the gui control elements of this editor.
	 */
	protected abstract Collection<Control> getControls();

}
