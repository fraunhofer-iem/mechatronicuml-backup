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
	public ComparisonExpressionEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addComparisonExpressionOperatorEditor(null, true);

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
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getComparisonExpression_Operator());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ComparisonExpressionEditor() {
		this(
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
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ComparisonExpressionEditor();
		}
	}

}
