package de.uni_paderborn.fujaba.muml.properties.valuetype.editor;

public class RangeEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RangeEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRangeLowerBoundEditor(null, true);

		addRangeUpperBoundEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addRangeLowerBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createRangeLowerBoundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRangeLowerBoundEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getRange_LowerBound());

	}
	/**
	 * @generated
	 */
	protected void addRangeUpperBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createRangeUpperBoundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRangeUpperBoundEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getRange_UpperBound());

	}

	//
	// Overwritten property settings
	//

}
