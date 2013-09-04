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
	public RangedPrimitiveDataTypeEditor(
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

		addRangedPrimitiveDataTypeRangedTypeEditor(null, true);

	}

	/**
	 * @generated
	 */
	protected void addRangedPrimitiveDataTypeRangedTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createRangedPrimitiveDataTypeRangedTypeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRangedPrimitiveDataTypeRangedTypeEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getRangedPrimitiveDataType_RangedType());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public RangedPrimitiveDataTypeEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getRangedPrimitiveDataType());
	}

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
