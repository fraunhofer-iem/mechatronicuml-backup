package de.uni_paderborn.fujaba.muml.properties.types.editor;

public class RangedPrimitiveDataTypeEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RangedPrimitiveDataTypeEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRangedPrimitiveDataTypeRangeEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addRangedPrimitiveDataTypeRangeEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createRangedPrimitiveDataTypeRangeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRangedPrimitiveDataTypeRangeEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getRangedPrimitiveDataType_Range());

	}

	//
	// Overwritten property settings
	//

}
