package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

/**
 * @generated
 */
public class ConstraintEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

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

		addConstraintCorrectEditor(null, true);

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
	/**
	 * @generated
	 */
	protected void addConstraintCorrectEditor(String category, boolean front) {
		addEditorToCategory(category, createConstraintCorrectEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConstraintCorrectEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstraint_Correct());

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
			return new ConstraintEditor();
		}
	}

}
