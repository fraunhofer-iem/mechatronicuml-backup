package de.uni_paderborn.fujaba.muml.properties.types.editor;

public class PrimitiveDataTypeEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PrimitiveDataTypeEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addPrimitiveDataTypePrimitiveTypeEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addPrimitiveDataTypePrimitiveTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPrimitiveDataTypePrimitiveTypeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPrimitiveDataTypePrimitiveTypeEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getPrimitiveDataType_PrimitiveType());

	}

	//
	// Overwritten property settings
	//

}
