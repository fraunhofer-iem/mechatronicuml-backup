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
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getComparisonExpression_Operator());

	}

	//
	// Overwritten property settings
	//

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
