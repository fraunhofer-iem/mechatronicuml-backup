package org.muml.uppaal.adapter.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.muml.uppaal.preferences.UppaalPreferencePage;

public class UppaalAdapterPreferencesExtension implements org.muml.uppaal.preferences.IUppaalPreferencesPageExtension {
	private UppaalPreferencePage page;
	private BooleanFieldEditor checkboxEditor;
	private IntegerFieldEditor integerEditor;
	
	@Override
	public void init(UppaalPreferencePage page, IWorkbench workbench) {
		this.page = page;
	}

	@Override
	public void createTableControls(final Composite parent) {
		checkboxEditor = new BooleanFieldEditor("org.muml.uppaal.adapter.preferences.measure_statistics", "Measure statistics", parent) {
			@Override
			protected void doLoad() {
				super.doLoad();
				update();
			}
			@Override
			protected void doLoadDefault() {
				super.doLoadDefault();
				update();
			}
			@Override
			protected void valueChanged(boolean oldValue, boolean newValue) {
				super.valueChanged(oldValue, newValue);
				update();
			}
			public void update() {
				integerEditor.setEnabled(getBooleanValue(), parent);
			}
		};
		integerEditor = new IntegerFieldEditor("org.muml.uppaal.adapter.preferences.num_iterations", "Number of Statistical Iterations", parent);
		page.addField(checkboxEditor); 
		page.addField(integerEditor);
	}
	
}
