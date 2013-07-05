package de.uni_paderborn.fujaba.muml.properties.types.editor;

/**
 * @generated
 */
public class RangedPrimitiveDataTypeEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.types.editor.DataTypeEditor {

	/**
	 * @generated
	 */
	public RangedPrimitiveDataTypeEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRangedPrimitiveDataTypeRangeEditor(null, false);

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

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new RangedPrimitiveDataTypeEditor();
		}
	}

}
