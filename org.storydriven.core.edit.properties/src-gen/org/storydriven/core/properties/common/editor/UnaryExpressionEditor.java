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
	public UnaryExpressionEditor() {
		this(org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public UnaryExpressionEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addUnaryExpressionOperatorEditor(null, true);

		super.initialize();
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

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new UnaryExpressionEditor();
		}
	}

}
