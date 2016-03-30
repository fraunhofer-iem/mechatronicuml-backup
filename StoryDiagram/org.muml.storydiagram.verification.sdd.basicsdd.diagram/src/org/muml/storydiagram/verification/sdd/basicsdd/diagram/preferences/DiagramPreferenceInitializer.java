package org.muml.storydiagram.verification.sdd.basicsdd.diagram.preferences;

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
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		org.muml.storydiagram.verification.sdd.basicsdd.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return org.muml.storydiagram.verification.sdd.basicsdd.diagram.part.BasicSDDDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
