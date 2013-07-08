package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class EntryEventEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.EntryOrExitEventEditor {

	/**
	 * @generated
	 */
	public EntryEventEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addEntryOrExitEventClockResetsEditor(null, true);

		addEntryOrExitEventActionEditor(null, false);

		addEventKindEditor(null, true);

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
	/**
	 * @generated
	 */
	protected void addEventKindEditor(String category, boolean front) {
		addEditorToCategory(category, createEventKindEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createEventKindEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEvent_Kind());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new EntryEventEditor();
		}
	}

}
