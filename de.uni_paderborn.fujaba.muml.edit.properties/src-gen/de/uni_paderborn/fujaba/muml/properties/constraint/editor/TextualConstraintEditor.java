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
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public TextualConstraintEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addTextualConstraintTextualExpressionEditor(null, false);

		addConstraintCorrectnessEditor(null, true);

		addConstraintBackgroundEditor(
				"de.fujaba.properties.category.Constraint.Booleans", true);

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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getTextualConstraint_TextualExpression());

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
				adapterFactory,
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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstraint_Background());

	}

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
