package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class EventEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EventEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addEventKindEditor(null, true);

		super.initialize();
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

}
