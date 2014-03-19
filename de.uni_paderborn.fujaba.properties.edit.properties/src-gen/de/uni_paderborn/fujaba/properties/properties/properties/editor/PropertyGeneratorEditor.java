package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PropertyGeneratorEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyGeneratorEditor(String tab,
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

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) {
			addPropertyGeneratorReconciler_GeneralTab_Editor(null, false);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) {
			addPropertyGeneratorGenModel_GeneralTab_Editor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) {
			addPropertyGeneratorReferencedGenerators_GeneralTab_Editor(null,
					true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) {
			addPropertyGeneratorPlugin_GeneralTab_Editor(null, false);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) {
			addPropertyGeneratorDefaultTab_GeneralTab_Editor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) {
			addPropertyGeneratorContributorId_GeneralTab_Editor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) {
			addPropertyGeneratorSourceFolder_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorReconciler_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorReconciler_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorReconciler_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_Reconciler());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorGenModel_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorGenModel_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorGenModel_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_GenModel());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorReferencedGenerators_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createPropertyGeneratorReferencedGenerators_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorReferencedGenerators_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_ReferencedGenerators());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorPlugin_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorPlugin_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorPlugin_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_Plugin());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorDefaultTab_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorDefaultTab_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorDefaultTab_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_DefaultTab());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorContributorId_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorContributorId_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorContributorId_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_ContributorId(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorSourceFolder_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorSourceFolder_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorSourceFolder_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_SourceFolder(), false);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyGeneratorEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator());
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
			return new PropertyGeneratorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
