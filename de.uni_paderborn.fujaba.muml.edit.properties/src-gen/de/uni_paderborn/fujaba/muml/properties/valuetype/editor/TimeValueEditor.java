package de.uni_paderborn.fujaba.muml.properties.valuetype.editor;

public class TimeValueEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public TimeValueEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addTimeValueValueEditor(null, true);

		addTimeValueUnitEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addTimeValueValueEditor(String category, boolean front) {
		addEditorToCategory(category, createTimeValueValueEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTimeValueValueEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getTimeValue_Value());

	}
	/**
	 * @generated
	 */
	protected void addTimeValueUnitEditor(String category, boolean front) {
		addEditorToCategory(category, createTimeValueUnitEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTimeValueUnitEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getTimeValue_Unit());

	}

	//
	// Overwritten property settings
	//

}
