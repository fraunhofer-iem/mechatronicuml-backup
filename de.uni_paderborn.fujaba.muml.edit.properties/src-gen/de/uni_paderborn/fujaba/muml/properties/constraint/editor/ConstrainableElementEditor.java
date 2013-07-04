package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

public class ConstrainableElementEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConstrainableElementEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConstrainableElementConstraintEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConstrainableElementConstraintEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConstrainableElementConstraintEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConstrainableElementConstraintEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstrainableElement_Constraint());

	}

	//
	// Overwritten property settings
	//

}
