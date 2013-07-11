package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
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

}
