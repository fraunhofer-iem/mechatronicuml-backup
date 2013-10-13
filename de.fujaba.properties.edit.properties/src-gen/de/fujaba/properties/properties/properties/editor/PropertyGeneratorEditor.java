package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PropertyGeneratorEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addPropertyGeneratorReconcilerEditor(null, false);

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorGenModelEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorReferencedGeneratorsEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		addPropertyGeneratorPluginEditor(null, false);

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorDefaultTabEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGeneratorContributorIdEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorReconcilerEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_Reconciler());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorGenModelEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_GenModel());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorReferencedGeneratorsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_ReferencedGenerators());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorPluginEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_Plugin());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorDefaultTabEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_DefaultTab());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorContributorIdEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_ContributorId(), false);

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGeneratorSourceFolderEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator_SourceFolder(), false);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyGeneratorEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new PropertyGeneratorEditor(tab);
		}
	}

}
