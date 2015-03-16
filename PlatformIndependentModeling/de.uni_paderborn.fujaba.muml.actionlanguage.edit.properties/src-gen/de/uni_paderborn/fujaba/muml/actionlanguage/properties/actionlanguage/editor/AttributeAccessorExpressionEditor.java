package de.uni_paderborn.fujaba.muml.actionlanguage.properties.actionlanguage.editor;

/**
 * @generated
 */
public class AttributeAccessorExpressionEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public AttributeAccessorExpressionEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		addPropertyEditor(createAttribute_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAttribute_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createAttribute_GeneralTab_Editor() {
		if (this.editorAttribute_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
					.getAttributeAccessorExpression_Attribute();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorAttribute_GeneralTab = editor;
		}
		return this.editorAttribute_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public AttributeAccessorExpressionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.actionlanguage.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
						.getAttributeAccessorExpression());
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
			return new AttributeAccessorExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general"}).contains(
					tab);
		}
	}

}
