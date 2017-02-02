package org.muml.ape.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.muml.ape.runtime.editors.listener.IVisibilityListener;

public interface IPropertyEditor {
	
	void addVisibilityListener(IVisibilityListener listener);
	
	void removeVisibilityListener(IVisibilityListener listener);

	void createControls(Composite parent, FormToolkit toolkit);

	void setInput(Object object);

	Object getInput();

	void refresh();

	boolean isDisposed();
	
	void dispose();

	AdapterFactory getAdapterFactory();
	
	// Visibility
	void addVisibilityFilter(IFilter filter);
	void removeVisibilityFilter(IFilter filter);
	void setVisible(boolean visible, boolean relayout, boolean force);
	void updateVisibility(boolean relayout);
	boolean isVisible();

	// Enablement
	void addReadOnlyFilter(IFilter filter);
	void removeReadOnlyFilter(IFilter filter);
	void setEnabled(boolean enabled, boolean force);
	void updateEnablement();
	
	
	void setFocus();

	void setTooltipMessage(String message);
	
}
