package de.uni_paderborn.fujaba.muml.properties.valuetype.editor;

public class CardinalityEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CardinalityEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addCardinalityLowerBoundEditor(null, true);

		addCardinalityUpperBoundEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addCardinalityLowerBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createCardinalityLowerBoundEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCardinalityLowerBoundEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getCardinality_LowerBound());

	}
	/**
	 * @generated
	 */
	protected void addCardinalityUpperBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createCardinalityUpperBoundEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCardinalityUpperBoundEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.eINSTANCE
						.getCardinality_UpperBound());

	}

	//
	// Overwritten property settings
	//

}
