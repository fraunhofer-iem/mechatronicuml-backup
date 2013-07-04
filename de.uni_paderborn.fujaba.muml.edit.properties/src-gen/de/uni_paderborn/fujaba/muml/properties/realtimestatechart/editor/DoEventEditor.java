package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class DoEventEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DoEventEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addDoEventActionEditor(null, true);

		addDoEventPeriodEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addDoEventActionEditor(String category, boolean front) {
		addEditorToCategory(category, createDoEventActionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDoEventActionEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getDoEvent_Action());

	}
	/**
	 * @generated
	 */
	protected void addDoEventPeriodEditor(String category, boolean front) {
		addEditorToCategory(category, createDoEventPeriodEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDoEventPeriodEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getDoEvent_Period());

	}

	//
	// Overwritten property settings
	//

}
