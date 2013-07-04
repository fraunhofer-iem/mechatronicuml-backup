package de.uni_paderborn.fujaba.muml.properties.types.editor;

public class ArrayDataTypeEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ArrayDataTypeEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addArrayDataTypeCardinalityEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addArrayDataTypeCardinalityEditor(String category,
			boolean front) {
		addEditorToCategory(category, createArrayDataTypeCardinalityEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createArrayDataTypeCardinalityEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getArrayDataType_Cardinality());

	}

	//
	// Overwritten property settings
	//

}
