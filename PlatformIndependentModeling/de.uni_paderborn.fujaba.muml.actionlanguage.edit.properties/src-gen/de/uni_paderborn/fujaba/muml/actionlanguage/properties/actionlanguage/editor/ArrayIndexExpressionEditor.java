package de.uni_paderborn.fujaba.muml.actionlanguage.properties.actionlanguage.editor;

/**
 * @generated
 */
public class ArrayIndexExpressionEditor
		extends
			de.uni_paderborn.fujaba.muml.actionlanguage.properties.actionlanguage.editor.ElementAccessorExpressionEditor {

	/**
	 * @generated
	 */
	public ArrayIndexExpressionEditor(String tab,
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
			addIndex_GeneralTab_Editor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addIndex_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createIndex_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createIndex_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
				.getArrayIndexExpression_Index();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("Indices which refer to an concrete index of an array.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ArrayIndexExpressionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.actionlanguage.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
						.getArrayIndexExpression());
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
			return new ArrayIndexExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general"}).contains(
					tab);
		}
	}

}
