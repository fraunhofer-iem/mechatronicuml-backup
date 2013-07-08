package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.fujaba.properties.runtime.sections.ObjectPropertySection;

public interface IPropertyEditor {

	void createControls(Composite parent,
			TabbedPropertySheetWidgetFactory toolkit);

	void setInput(Object object);

	Object getInput();

	void refresh();

	void dispose();
	
	String getTab();
	
	void setTab(String tab);
	
	ObjectPropertySection getPropertySection();
	
	AdapterFactory getAdapterFactory();

}
