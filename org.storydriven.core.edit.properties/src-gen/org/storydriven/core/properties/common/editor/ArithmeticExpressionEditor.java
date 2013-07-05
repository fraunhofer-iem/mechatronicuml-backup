package org.storydriven.core.properties.common.editor;

/**
 * @generated
 */
public class ArithmeticExpressionEditor
		extends
			org.storydriven.core.properties.common.editor.BinaryExpressionEditor {

	/**
	 * @generated
	 */
	public ArithmeticExpressionEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addArithmeticExpressionOperatorEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addArithmeticExpressionOperatorEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createArithmeticExpressionOperatorEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createArithmeticExpressionOperatorEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getArithmeticExpression_Operator());

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
			return new ArithmeticExpressionEditor();
		}
	}

}
