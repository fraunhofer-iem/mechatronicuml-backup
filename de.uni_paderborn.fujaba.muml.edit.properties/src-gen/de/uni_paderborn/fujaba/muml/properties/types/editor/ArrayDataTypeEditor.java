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
	public ArrayDataTypeEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addArrayDataTypeTypeEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addArrayDataTypeCardinalityEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addArrayDataTypeTypeEditor(String category, boolean front) {
		addEditorToCategory(category, createArrayDataTypeTypeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createArrayDataTypeTypeEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getArrayDataType_Type());

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getArrayDataType_Cardinality(), false);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ArrayDataTypeEditor(String tab) {
		this(
				tab,
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
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new ArrayDataTypeEditor(tab);
		}
	}

}
