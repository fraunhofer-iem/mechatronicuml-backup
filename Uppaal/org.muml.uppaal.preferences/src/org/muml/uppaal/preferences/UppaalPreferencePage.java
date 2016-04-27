package org.muml.uppaal.preferences;

import java.io.File;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class UppaalPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	public UppaalPreferencePage() {
		super(GRID);

	}

	@Override
	protected void adjustGridLayout() {
		super.adjustGridLayout();
		((GridLayout) getFieldEditorParent().getLayout()).marginTop = 20;
	}

	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();

		StringFieldEditor uppaalPathEditor = new FileFieldEditor(
				UppaalPreferencesPlugin.VERIFYTA_KEY, "&UPPAAL verifyta path:", parent) {
			protected boolean doCheckState() {
				// Allow empty string
				String fileName = getStringValue();
				fileName = fileName.trim();
				if (fileName.length() == 0 && isEmptyStringAllowed()) {
					return true;
				}

				// Make sure the uppaal binary can be found.
				File verifyta = getVerifyTAFile();
				return isValidVerifyTAFile(verifyta);
			}

			@Override
			protected void doStore() {
				File binary = getVerifyTAFile();
				getPreferenceStore().setValue(getPreferenceName(),
						binary.getAbsolutePath());
			}

			private File getVerifyTAFile() {
				
				return new File(getStringValue());
			
			}
			
			private boolean isValidVerifyTAFile(File file) {
				
				return file.isFile() && file.getName().toLowerCase().startsWith("verifyta");
			}

		};
		uppaalPathEditor
				.setErrorMessage("File is not recognized as UPPAAL verifyta binary.");
		uppaalPathEditor.setEmptyStringAllowed(true);
		addField(uppaalPathEditor);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(UppaalPreferencesPlugin.getDefault()
				.getPreferenceStore());
		setDescription("UPPAAL Preferences");
	}
}