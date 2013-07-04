package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class DeadlineEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DeadlineEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addDeadlineUpperBoundEditor(null, true);

		addDeadlineLowerBoundEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addDeadlineUpperBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createDeadlineUpperBoundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDeadlineUpperBoundEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getDeadline_UpperBound());

	}
	/**
	 * @generated
	 */
	protected void addDeadlineLowerBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createDeadlineLowerBoundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDeadlineLowerBoundEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getDeadline_LowerBound());

	}

	//
	// Overwritten property settings
	//

}
