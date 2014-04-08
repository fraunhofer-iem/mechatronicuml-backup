package de.uni_paderborn.fujaba.muml.reconfiguration.properties.structdatatype.editor;

/**
 * @generated
 */
public class AttributeEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public AttributeEditor(String tab,
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
			addAttributeTypeEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addAttributeTypeEditor(String category, boolean front) {
		addEditorToCategory(category, createAttributeTypeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createAttributeTypeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage.eINSTANCE
						.getAttribute_Type());

		editor.setTooltipMessage("The data type of this attribute. The data type needs to be a primitive data type\nor an array data type, where the array only contains primitives.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public AttributeEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.structdatatype.StructdatatypePackage.eINSTANCE
						.getAttribute());
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
			return new AttributeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
