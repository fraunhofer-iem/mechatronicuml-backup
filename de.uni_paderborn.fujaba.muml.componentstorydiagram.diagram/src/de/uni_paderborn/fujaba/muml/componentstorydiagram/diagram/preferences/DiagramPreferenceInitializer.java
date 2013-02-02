package de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.preferences;

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
		de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram.part.ComponentStoryDiagramDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
