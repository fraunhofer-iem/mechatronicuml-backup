package de.uni_paderborn.fujaba.muml.properties.valuetype.editor;

/**
 * @generated
 */
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

		addCardinalityLowerBoundEditor(null, false);

		addCardinalityUpperBoundEditor(null, false);

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

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new CardinalityEditor();
		}
	}

}
