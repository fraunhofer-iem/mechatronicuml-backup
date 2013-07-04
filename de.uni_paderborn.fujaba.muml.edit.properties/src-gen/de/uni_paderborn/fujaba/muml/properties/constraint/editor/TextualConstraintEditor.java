package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

public class TextualConstraintEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public TextualConstraintEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addTextualConstraintTextualExpressionEditor(null, true);

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

}
