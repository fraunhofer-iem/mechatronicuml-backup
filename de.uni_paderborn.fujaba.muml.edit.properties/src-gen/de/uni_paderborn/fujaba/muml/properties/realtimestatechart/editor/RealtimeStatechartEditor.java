package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class RealtimeStatechartEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RealtimeStatechartEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRealtimeStatechartTransitionsEditor(null, true);

		addRealtimeStatechartStatesEditor(null, true);

		addRealtimeStatechartClocksEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addRealtimeStatechartTransitionsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createRealtimeStatechartTransitionsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartTransitionsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_Transitions());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartStatesEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRealtimeStatechartStatesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartStatesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_States());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartClocksEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRealtimeStatechartClocksEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartClocksEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_Clocks());

	}

	//
	// Overwritten property settings
	//

}
