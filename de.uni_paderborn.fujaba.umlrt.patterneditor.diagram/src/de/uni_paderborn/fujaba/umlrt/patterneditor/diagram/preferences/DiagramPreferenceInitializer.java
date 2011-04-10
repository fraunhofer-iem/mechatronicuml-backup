package de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.preferences;

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
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return de.uni_paderborn.fujaba.umlrt.patterneditor.diagram.part.PatternDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
