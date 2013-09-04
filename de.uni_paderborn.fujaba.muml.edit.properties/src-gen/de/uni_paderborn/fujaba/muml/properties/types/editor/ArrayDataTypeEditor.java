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
	public ArrayDataTypeEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addArrayDataTypeCardinalityEditor(null, true);

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
		return new de.uni_paderborn.fujaba.muml.common.properties.NaturalNumberTextEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getArrayDataType_Cardinality());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ArrayDataTypeEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getArrayDataType());
	}

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
