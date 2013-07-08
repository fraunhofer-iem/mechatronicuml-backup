package org.storydriven.core.properties.common.editor;

/**
 * @generated
 */
public class LogicalExpressionEditor
		extends
			org.storydriven.core.properties.common.editor.BinaryExpressionEditor {

	/**
	 * @generated
	 */
	public LogicalExpressionEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addLogicalExpressionOperatorEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addLogicalExpressionOperatorEditor(String category,
			boolean front) {
		addEditorToCategory(category, createLogicalExpressionOperatorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createLogicalExpressionOperatorEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getLogicalExpression_Operator());

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
			return new LogicalExpressionEditor();
		}
	}

}
