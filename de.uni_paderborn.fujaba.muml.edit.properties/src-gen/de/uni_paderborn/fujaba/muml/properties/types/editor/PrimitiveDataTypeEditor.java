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
	public PrimitiveDataTypeEditor(
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

		addPrimitiveDataTypePrimitiveTypeEditor(null, true);

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
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getPrimitiveDataType_PrimitiveType());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PrimitiveDataTypeEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getPrimitiveDataType());
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
