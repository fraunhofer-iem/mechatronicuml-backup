package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

/**
 * @generated
 */
public class TextualConstraintEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public TextualConstraintEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addTextualConstraintTextualExpressionEditor(null, false);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addTextualConstraintTextualExpressionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createTextualConstraintTextualExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTextualConstraintTextualExpressionEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getTextualConstraint_TextualExpression());

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
			return new TextualConstraintEditor();
		}
	}

}
