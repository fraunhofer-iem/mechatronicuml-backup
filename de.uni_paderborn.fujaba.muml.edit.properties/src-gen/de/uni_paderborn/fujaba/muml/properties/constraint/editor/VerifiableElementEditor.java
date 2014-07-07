package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

/**
 * @generated
 */
public abstract class VerifiableElementEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public VerifiableElementEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addVerificationConstraintRepositories_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addVerificationConstraintRepositories_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createVerificationConstraintRepositories_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createVerificationConstraintRepositories_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
				.getVerifiableElement_VerificationConstraintRepositories();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The referenced repository that contains verifiable constraints for this element.");

		return editor;

	}

}
