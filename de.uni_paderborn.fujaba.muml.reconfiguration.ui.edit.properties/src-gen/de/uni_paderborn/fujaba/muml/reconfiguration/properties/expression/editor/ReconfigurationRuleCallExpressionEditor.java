package de.uni_paderborn.fujaba.muml.reconfiguration.properties.expression.editor;

/**
 * @generated
 */
public class ReconfigurationRuleCallExpressionEditor
		extends
			org.storydriven.core.properties.expressions.editor.ExpressionEditor {

	/**
	 * @generated
	 */
	public ReconfigurationRuleCallExpressionEditor(String tab,
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
			addReconfigurationRuleCallExpressionReconfigurationRuleEditor(null,
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addReconfigurationRuleCallExpressionReconfigurationRuleEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createReconfigurationRuleCallExpressionReconfigurationRuleEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurationRuleCallExpressionReconfigurationRuleEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage.eINSTANCE
						.getReconfigurationRuleCallExpression_ReconfigurationRule());

		editor.setTooltipMessage("The reconfiguration rule that is called by this expression.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurationRuleCallExpressionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage.eINSTANCE
						.getReconfigurationRuleCallExpression());
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
			return new ReconfigurationRuleCallExpressionEditor(tab);
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
