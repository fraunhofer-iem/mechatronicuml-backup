package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class EntryOrExitEventEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EntryOrExitEventEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addEntryOrExitEventClockResetsEditor(null, true);

		addEntryOrExitEventActionEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addEntryOrExitEventClockResetsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEntryOrExitEventClockResetsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createEntryOrExitEventClockResetsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEntryOrExitEvent_ClockResets());

	}
	/**
	 * @generated
	 */
	protected void addEntryOrExitEventActionEditor(String category,
			boolean front) {
		addEditorToCategory(category, createEntryOrExitEventActionEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createEntryOrExitEventActionEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEntryOrExitEvent_Action());

	}

	//
	// Overwritten property settings
	//

}
