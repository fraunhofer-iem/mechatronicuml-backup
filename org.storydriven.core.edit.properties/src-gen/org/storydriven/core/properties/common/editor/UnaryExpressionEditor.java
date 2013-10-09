package org.storydriven.core.properties.common.editor;

/**
 * @generated
 */
public class UnaryExpressionEditor
		extends
			org.storydriven.core.properties.expressions.editor.ExpressionEditor {

	/**
	 * @generated
	 */
	public UnaryExpressionEditor(String tab,
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
			addUnaryExpressionOperatorEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addUnaryExpressionOperatorEditor(String category,
			boolean front) {
		addEditorToCategory(category, createUnaryExpressionOperatorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createUnaryExpressionOperatorEditor() {
		return new de.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getUnaryExpression_Operator());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public UnaryExpressionEditor(String tab) {
		this(
				tab,
				org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getUnaryExpression());
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
			return new UnaryExpressionEditor(tab);
		}
	}

}
