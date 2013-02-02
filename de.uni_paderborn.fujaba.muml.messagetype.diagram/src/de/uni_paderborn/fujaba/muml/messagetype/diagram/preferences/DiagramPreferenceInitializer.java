package de.uni_paderborn.fujaba.muml.messagetype.diagram.preferences;

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
		de.uni_paderborn.fujaba.muml.messagetype.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.muml.messagetype.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.muml.messagetype.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.muml.messagetype.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.muml.messagetype.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return de.uni_paderborn.fujaba.muml.messagetype.diagram.part.MessageTypeDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
