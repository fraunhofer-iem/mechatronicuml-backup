package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public abstract class AtomicComponentEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.behavior.editor.BehavioralElementEditor {

	/**
	 * @generated
	 */
	public AtomicComponentEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPorts_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addComponentKind_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.documentation".equals(getTab())) {
			addComment_DocumentationTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.extensions".equals(getTab())) {
			addExtension_ExtensionsTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addName_GeneralTab_Editor(null, true);
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

	/**
	 * @generated
	 */
	protected void addPorts_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createPorts_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPorts_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getComponent_Ports();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The ports of a component represent the interaction points between the component and its environment.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addComponentKind_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createComponentKind_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentKind_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
				.getComponent_ComponentKind();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("This attribute specifies the kind of the component. A component may be either\ndiscrete software component, a continuous component, a hybrid component \nor a hardware component.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addComment_DocumentationTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createComment_DocumentationTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComment_DocumentationTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
				.getCommentableElement_Comment();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, true);

		editor.setTooltipMessage("The comment string that can be used to attach arbitrary information to CommentableElements.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addExtension_ExtensionsTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createExtension_ExtensionsTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExtension_ExtensionsTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
				.getExtendableElement_Extension();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addName_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createName_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createName_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
				.getNamedElement_Name();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("The name attribute of a meta-model element.");

		return editor;

	}

}
