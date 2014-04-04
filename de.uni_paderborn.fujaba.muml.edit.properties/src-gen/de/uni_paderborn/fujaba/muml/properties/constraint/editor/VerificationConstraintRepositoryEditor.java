package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

/**
 * @generated
 */
public abstract class VerificationConstraintRepositoryEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public VerificationConstraintRepositoryEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addVerificationConstraintRepositoryVerificationConstraintEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addVerificationConstraintRepositoryVerificationConstraintEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createVerificationConstraintRepositoryVerificationConstraintEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createVerificationConstraintRepositoryVerificationConstraintEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getVerificationConstraintRepository_VerificationConstraint());

		editor.setTooltipMessage("The non-empty list of verification constraints this repository contains.");

		return editor;

	}

}
