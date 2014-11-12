package org.storydriven.storydiagrams.properties.patterns.editor;

/**
 * @generated
 */
public class LinkConstraintEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public LinkConstraintEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addIndex_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConstraintType_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addNegative_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addFirstLink_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSecondLink_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addIndex_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createIndex_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createIndex_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getLinkConstraint_Index();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory, feature, 0);

		editor.setTooltipMessage("The index of the linked object in the collection. The semantics of this attribute is only defined if the constraintType of the LinkConstraint is INDEX.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addConstraintType_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createConstraintType_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConstraintType_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getLinkConstraint_ConstraintType();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The constraint type of the LinkConstraint.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addNegative_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createNegative_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createNegative_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getLinkConstraint_Negative();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("If the negative attribute is true, the link constraint may not be fulfilled for the complete pattern application to be successful.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addFirstLink_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createFirstLink_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createFirstLink_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getLinkConstraint_FirstLink();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addSecondLink_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createSecondLink_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createSecondLink_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
				.getLinkConstraint_SecondLink();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public LinkConstraintEditor(String tab) {
		this(
				tab,
				org.storydriven.storydiagrams.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
						.getLinkConstraint());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new LinkConstraintEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
