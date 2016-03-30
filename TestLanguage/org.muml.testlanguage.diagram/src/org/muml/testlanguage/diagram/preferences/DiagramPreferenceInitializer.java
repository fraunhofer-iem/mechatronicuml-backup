package org.muml.testlanguage.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		org.muml.testlanguage.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		org.muml.testlanguage.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		org.muml.testlanguage.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		org.muml.testlanguage.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		org.muml.testlanguage.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return org.muml.testlanguage.diagram.part.TestLanguageDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
