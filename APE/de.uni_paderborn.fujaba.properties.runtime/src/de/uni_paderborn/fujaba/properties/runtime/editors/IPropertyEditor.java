package de.uni_paderborn.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

public interface IPropertyEditor {

	void createControls(Composite parent, FormToolkit toolkit);

	void setInput(Object object);

	Object getInput();

	void refresh();

	boolean isDisposed();
	
	void dispose();

	AdapterFactory getAdapterFactory();
	
	void addVisibilityFilter(IFilter filter);
	
	void removeVisibilityFilter(IFilter filter);

	void setVisible(boolean visible, boolean relayout, boolean force);
	
	void updateVisibility(boolean relayout);
	
	void setFocus();

	void setTooltipMessage(String message);
	
	boolean isControllingVisibility();
	
	void setControllingVisibility(boolean controllingVisibility);



}
