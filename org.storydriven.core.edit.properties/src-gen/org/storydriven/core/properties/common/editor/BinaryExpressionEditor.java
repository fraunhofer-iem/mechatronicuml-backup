package org.storydriven.core.properties.common.editor;

/**
 * @generated
 */
public class BinaryExpressionEditor
		extends
			org.storydriven.core.properties.expressions.editor.ExpressionEditor {

	/**
	 * @generated
	 */
	public BinaryExpressionEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addBinaryExpressionLeftExpressionEditor(null, false);

		addBinaryExpressionRightExpressionEditor(null, false);

		addCommentableElementCommentEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addBinaryExpressionLeftExpressionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createBinaryExpressionLeftExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBinaryExpressionLeftExpressionEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getBinaryExpression_LeftExpression());

	}
	/**
	 * @generated
	 */
	protected void addBinaryExpressionRightExpressionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createBinaryExpressionRightExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBinaryExpressionRightExpressionEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getBinaryExpression_RightExpression());

	}
	/**
	 * @generated
	 */
	protected void addCommentableElementCommentEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommentableElementCommentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementCommentEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment());

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
			return new BinaryExpressionEditor();
		}
	}

}
