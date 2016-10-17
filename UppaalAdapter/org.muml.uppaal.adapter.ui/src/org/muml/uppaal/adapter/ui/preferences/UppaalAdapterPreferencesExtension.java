package org.muml.uppaal.adapter.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.muml.uppaal.preferences.UppaalPreferencePage;

public class UppaalAdapterPreferencesExtension implements org.muml.uppaal.preferences.IUppaalPreferencesPageExtension {
	private UppaalPreferencePage page;
	
	@Override
	public void init(UppaalPreferencePage page, IWorkbench workbench) {
		this.page = page;
	}

	@Override
	public void createTableControls(Composite parent) {
		BooleanFieldEditor editor = new BooleanFieldEditor("org.muml.uppaal.adapter.preferences.measure_statistics", "Measure statistics", parent); 
		page.addField(editor);
	}
	

}
