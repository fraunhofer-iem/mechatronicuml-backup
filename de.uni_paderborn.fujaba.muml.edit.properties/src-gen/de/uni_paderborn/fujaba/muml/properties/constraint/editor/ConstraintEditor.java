package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

/**
 * @generated
 */
public abstract class ConstraintEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public ConstraintEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addConstraintCorrectnessEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addConstraintBackgroundEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addConstraintConstrainableElementEditor(null, true);
		}

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
		return new de.fujaba.properties.runtime.editors.OptionPropertyEditor(
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
	protected void addConstraintConstrainableElementEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConstraintConstrainableElementEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConstraintConstrainableElementEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstraint_ConstrainableElement());

	}

}
