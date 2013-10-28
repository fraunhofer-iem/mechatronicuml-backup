package de.uni_paderborn.fujaba.properties.editor;

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
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorReconcilerEditor(null, false);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorGenModelEditor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorReferencedGeneratorsEditor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorPluginEditor(null, false);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorDefaultTabEditor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorContributorIdEditor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorSourceFolderEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorReconcilerEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorReconcilerEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorReconcilerEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_Reconciler());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorGenModelEditor(String category,
			boolean front) {
		addEditorToCategory(category, createPropertyGeneratorGenModelEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorGenModelEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_GenModel());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorReferencedGeneratorsEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorReferencedGeneratorsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorReferencedGeneratorsEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_ReferencedGenerators());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorPluginEditor(String category,
			boolean front) {
		addEditorToCategory(category, createPropertyGeneratorPluginEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorPluginEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_Plugin());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorDefaultTabEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorDefaultTabEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorDefaultTabEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_DefaultTab());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorContributorIdEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorContributorIdEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorContributorIdEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_ContributorId(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPropertyGeneratorSourceFolderEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPropertyGeneratorSourceFolderEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorSourceFolderEditor() {
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
		this(tab, de.uni_paderborn.fujaba.properties.util.PropertiesUtil.INSTANCE
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
					new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general"}).contains(tab);
		}
	}

}
