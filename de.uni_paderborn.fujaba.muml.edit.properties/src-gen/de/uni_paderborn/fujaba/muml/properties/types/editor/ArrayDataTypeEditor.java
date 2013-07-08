package de.uni_paderborn.fujaba.muml.properties.types.editor;

/**
 * @generated
 */
public class ArrayDataTypeEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.types.editor.DataTypeEditor {

	/**
	 * @generated
	 */
	public ArrayDataTypeEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addArrayDataTypeCardinalityEditor(null, false);

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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getArrayDataType_Cardinality());

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
			return new ArrayDataTypeEditor();
		}
	}

}
