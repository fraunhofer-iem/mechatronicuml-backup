package de.fujaba.properties.runtime.editors;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.fujaba.properties.runtime.sections.ObjectPropertySection;

public interface IPropertyEditor {

	void createControls(Composite parent, FormToolkit toolkit);

	void setInput(Object object);

	Object getInput();

	void refresh();

	void dispose();
	
	String getTab();
	
	void setTab(String tab);
	
	ObjectPropertySection getPropertySection();
	
	AdapterFactory getAdapterFactory();

}
