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
	public ComparisonExpressionEditor() {
		this(org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public ComparisonExpressionEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addComparisonExpressionOperatorEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addComparisonExpressionOperatorEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createComparisonExpressionOperatorEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComparisonExpressionOperatorEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getComparisonExpression_Operator());

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ComparisonExpressionEditor();
		}
	}

}
