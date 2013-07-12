package de.uni_paderborn.fujaba.muml.properties.types.editor;

/**
 * @generated
 */
public class PrimitiveDataTypeEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.types.editor.DataTypeEditor {

	/**
	 * @generated
	 */
	public PrimitiveDataTypeEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public PrimitiveDataTypeEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
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
		return new de.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getPrimitiveDataType_PrimitiveType());

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new PrimitiveDataTypeEditor();
		}
	}

}
