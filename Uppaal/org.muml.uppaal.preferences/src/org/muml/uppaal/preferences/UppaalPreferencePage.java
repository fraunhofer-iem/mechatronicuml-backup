package org.muml.uppaal.preferences;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class UppaalPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	private List<IUppaalPreferencesPageExtension> extensions = new ArrayList<IUppaalPreferencesPageExtension>();
	
	public UppaalPreferencePage() {
		super(GRID);

		for (IConfigurationElement element : Platform.getExtensionRegistry().
		        getConfigurationElementsFor("org.muml.uppaal.preferences.preferencesPageExtension")) {
			Object impl = null;
			try {
				impl = element.createExecutableExtension("implementation");
			} catch (CoreException e) {
				e.printStackTrace();
			}
			if (impl instanceof IUppaalPreferencesPageExtension) {
				extensions.add((IUppaalPreferencesPageExtension) impl);
			}
		}
	}

	@Override
	protected void adjustGridLayout() {
		super.adjustGridLayout();
		((GridLayout) getFieldEditorParent().getLayout()).marginTop = 20;
	}

	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		for (IUppaalPreferencesPageExtension extension : extensions) {
			extension.createTableControls(parent);
		}
	}
	
	// Override to make public
    public void addField(FieldEditor editor) {
    	super.addField(editor);
    }


	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(UppaalPreferencesPlugin.getDefault()
				.getPreferenceStore());
		setDescription("UPPAAL Preferences");
		for (IUppaalPreferencesPageExtension extension : extensions) {
			extension.init(this, workbench);
		}
	}
}