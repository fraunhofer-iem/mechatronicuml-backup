package org.storydriven.core.properties.common.editor;

/**
 * @generated
 */
public class ComparisonExpressionEditor
		extends
			org.storydriven.core.properties.common.editor.BinaryExpressionEditor {

	/**
	 * @generated
	 */
	public ComparisonExpressionEditor(String tab,
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
			addOperator_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addOperator_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createOperator_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createOperator_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
				.getComparisonExpression_Operator();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("Specifies the expression's comparing operator, e.g. <, >=, !=.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ComparisonExpressionEditor(String tab) {
		this(
				tab,
				org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getComparisonExpression());
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
			return new ComparisonExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
