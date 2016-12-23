package org.muml.pm.hardware.platform.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.gef.rulers.RulerProvider;
import org.eclipse.gmf.runtime.diagram.ui.figures.DiagramColorConstants;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.muml.pm.hardware.platform.diagram.part.PlatformDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();

		store.setDefault(IPreferenceConstants.PREF_SHOW_CONNECTION_HANDLES, true);
		store.setDefault(IPreferenceConstants.PREF_SHOW_POPUP_BARS, true);
		store.setDefault(IPreferenceConstants.PREF_ENABLE_ANIMATED_LAYOUT, true);
		store.setDefault(IPreferenceConstants.PREF_ENABLE_ANIMATED_ZOOM, true);
		store.setDefault(IPreferenceConstants.PREF_ENABLE_ANTIALIAS, true);

		PreferenceConverter.setDefault(store, IPreferenceConstants.PREF_FONT_COLOR,
				DiagramColorConstants.black.getRGB());

		PreferenceConverter.setDefault(store, IPreferenceConstants.PREF_FILL_COLOR,
				DiagramColorConstants.white.getRGB());

		PreferenceConverter.setDefault(store, IPreferenceConstants.PREF_LINE_COLOR,
				DiagramColorConstants.black.getRGB());

		PreferenceConverter.setDefault(store, IPreferenceConstants.PREF_NOTE_FILL_COLOR,
				DiagramColorConstants.yellow.getRGB());

		PreferenceConverter.setDefault(store, IPreferenceConstants.PREF_NOTE_LINE_COLOR,
				DiagramColorConstants.orange.getRGB());
		store.setDefault(IPreferenceConstants.PREF_LINE_STYLE, Routing.MANUAL);
		store.setDefault(IPreferenceConstants.PREF_SHOW_RULERS, false);
		store.setDefault(IPreferenceConstants.PREF_RULER_UNITS, RulerProvider.UNIT_INCHES);
		store.setDefault(IPreferenceConstants.PREF_SHOW_GRID, false);
		store.setDefault(IPreferenceConstants.PREF_SNAP_TO_GRID, true);
		store.setDefault(IPreferenceConstants.PREF_SNAP_TO_GEOMETRY, false);
		store.setDefault(IPreferenceConstants.PREF_GRID_SPACING, 0.125);
		store.setDefault(IPreferenceConstants.PREF_PROMPT_ON_DEL_FROM_MODEL, false);
		store.setDefault(IPreferenceConstants.PREF_PROMPT_ON_DEL_FROM_DIAGRAM, false);
	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return PlatformDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
