package de.fujaba.properties.runtime.editors;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

public interface IPropertyEditor {

	void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory toolkit);

	void setInput(Object object);

	Object getInput();

	void refresh();

	void dispose();

}
