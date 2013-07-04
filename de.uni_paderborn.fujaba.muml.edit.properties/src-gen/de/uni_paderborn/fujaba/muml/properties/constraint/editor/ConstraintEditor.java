package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

public class ConstraintEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConstraintEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConstraintCorrectnessEditor(null, true);

		addConstraintBackgroundEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConstraintCorrectnessEditor(String category, boolean front) {
		addEditorToCategory(category, createConstraintCorrectnessEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConstraintCorrectnessEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstraint_Correctness());

	}
	/**
	 * @generated
	 */
	protected void addConstraintBackgroundEditor(String category, boolean front) {
		addEditorToCategory(category, createConstraintBackgroundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConstraintBackgroundEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstraint_Background());

	}

	//
	// Overwritten property settings
	//

}
