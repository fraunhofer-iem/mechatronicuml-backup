package org.storydriven.storydiagrams.properties.patterns.editor;

/**
 * @generated
 */
public abstract class AbstractLinkVariableEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public AbstractLinkVariableEditor(String tab,
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
			addBindingSemantics_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addBindingOperator_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSource_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSecondLinkConstraint_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addFirstLinkConstraint_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTarget_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addBindingSemantics_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createBindingSemantics_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createBindingSemantics_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getAbstractLinkVariable_BindingSemantics();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The binding semantics defines whether the link must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern. The default value is \"mandatory\" (i.e., it must be matched).");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addBindingOperator_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createBindingOperator_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createBindingOperator_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getAbstractLinkVariable_BindingOperator();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The binding operator defines whether this link will be matched, created or destroyed by the story pattern. The default value ist \"check_only\", i.e., the link will be matched.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addSource_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createSource_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createSource_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getAbstractLinkVariable_Source();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addSecondLinkConstraint_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createSecondLinkConstraint_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createSecondLinkConstraint_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getAbstractLinkVariable_SecondLinkConstraint();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addFirstLinkConstraint_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createFirstLinkConstraint_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createFirstLinkConstraint_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getAbstractLinkVariable_FirstLinkConstraint();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addTarget_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createTarget_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createTarget_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getAbstractLinkVariable_Target();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

}
