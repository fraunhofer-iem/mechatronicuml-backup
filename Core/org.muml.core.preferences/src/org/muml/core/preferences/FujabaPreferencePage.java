package org.muml.core.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class FujabaPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(FujabaPreferencesPlugin.getDefault()
				.getPreferenceStore());
		setDescription("See sub-pages for settings.");
	}

	@Override
	protected Control createContents(Composite parent) {
		return new Composite(parent, SWT.NONE);
	}
}