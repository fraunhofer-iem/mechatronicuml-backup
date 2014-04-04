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
	public RangedPrimitiveDataTypeEditor(String tab,
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
			addRangedPrimitiveDataTypeRangedTypeEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addRangedPrimitiveDataTypeRangeEditor(null, false);
		}

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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createRangedPrimitiveDataTypeRangedTypeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getRangedPrimitiveDataType_RangedType());

		editor.setTooltipMessage("The primitive data type that provides a superset of possible values.");

		return editor;

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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createRangedPrimitiveDataTypeRangeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getRangedPrimitiveDataType_Range());

		editor.setTooltipMessage("The range of values provided by this data type.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public RangedPrimitiveDataTypeEditor(String tab) {
		this(
				tab,
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
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new RangedPrimitiveDataTypeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general"})
					.contains(tab);
		}
	}

}
