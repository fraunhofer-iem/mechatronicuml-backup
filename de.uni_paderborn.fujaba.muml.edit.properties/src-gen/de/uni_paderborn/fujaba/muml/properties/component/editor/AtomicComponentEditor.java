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
			addVerifiableElementVerificationConstraintRepository_GeneralTab_Editor(
					null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addComponentPorts_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addComponentComponentKind_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addNamedElementName_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.extensions".equals(getTab())) {
			addExtendableElementExtension_ExtensionsTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.documentation".equals(getTab())) {
			addCommentableElementComment_DocumentationTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addVerifiableElementVerificationConstraintRepository_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createVerifiableElementVerificationConstraintRepository_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createVerifiableElementVerificationConstraintRepository_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getVerifiableElement_VerificationConstraintRepository());

		editor.setTooltipMessage("The referenced repository that contains verifiable constraints for this element.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addComponentPorts_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createComponentPorts_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentPorts_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponent_Ports());

		editor.setTooltipMessage("The ports of a component represent the interaction points between the component and its environment.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addComponentComponentKind_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createComponentComponentKind_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentComponentKind_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponent_ComponentKind());

		editor.setTooltipMessage("This attribute specifies the kind of the component. A component may be either\ndiscrete software component, a continuous component, a hybrid component \nor a hardware component.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addNamedElementName_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createNamedElementName_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createNamedElementName_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getNamedElement_Name(), false);

		editor.setTooltipMessage("The name attribute of a meta-model element.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addExtendableElementExtension_ExtensionsTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createExtendableElementExtension_ExtensionsTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExtendableElementExtension_ExtensionsTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getExtendableElement_Extension());

		editor.addVisibilityFilter("not extension->isEmpty()", getEClass());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommentableElementComment_DocumentationTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommentableElementComment_DocumentationTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementComment_DocumentationTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment(), true);

		editor.setTooltipMessage("The comment string that can be used to attach arbitrary information to CommentableElements.");

		return editor;

	}

}
