
package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PluginEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PluginEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorId_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVendor_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVersion_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorRequiredBundles_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(),
					false);

			addPropertyEditor(
					createEditorRequiredExecutionEnvironment_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(),
					false);

		} else if ("de.uni_paderborn.fujaba.properties.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorId_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVendor_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVersion_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorRequiredBundles_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(),
					false);

			addPropertyEditor(
					createEditorRequiredExecutionEnvironment_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(),
					false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorId_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorId_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorId_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_Id();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorId_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorId_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorName_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorName_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorName_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVendor_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVendor_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorVendor_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_Vendor();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorVendor_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorVendor_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVersion_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVersion_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorVersion_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_Version();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorVersion_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorVersion_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRequiredBundles_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorRequiredBundles_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorRequiredBundles_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_RequiredBundles();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorRequiredBundles_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorRequiredBundles_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRequiredExecutionEnvironment_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorRequiredExecutionEnvironment_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorRequiredExecutionEnvironment_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_RequiredExecutionEnvironment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorRequiredExecutionEnvironment_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorRequiredExecutionEnvironment_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PluginEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE.getPlugin());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new PluginEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general", "de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general", "de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general"}).contains(tab);
		}
	}

}
