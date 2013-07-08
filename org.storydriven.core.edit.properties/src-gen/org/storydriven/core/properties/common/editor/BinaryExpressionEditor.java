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

		super.initialize();
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
