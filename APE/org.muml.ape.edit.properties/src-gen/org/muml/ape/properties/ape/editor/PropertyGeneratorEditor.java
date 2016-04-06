
package org.muml.ape.properties.ape.editor;

/**
 * @generated
 */
public class PropertyGeneratorEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyGeneratorEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorReconciler_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorGenModel_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorReferencedGenerators_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPlugin_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorDefaultTab_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorContributorId_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSourceFolder_org_muml_ape_tab_generalTab_Editor(), false);

		} else if ("org.muml.ape.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorReconciler_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorGenModel_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorReferencedGenerators_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPlugin_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorDefaultTab_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorContributorId_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSourceFolder_org_muml_ape_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconciler_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconciler_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorReconciler_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_Reconciler();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			this.editorReconciler_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorReconciler_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGenModel_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorGenModel_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorGenModel_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_GenModel();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorGenModel_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorGenModel_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReferencedGenerators_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReferencedGenerators_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorReferencedGenerators_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_ReferencedGenerators();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorReferencedGenerators_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorReferencedGenerators_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPlugin_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPlugin_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorPlugin_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_Plugin();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			this.editorPlugin_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorPlugin_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDefaultTab_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDefaultTab_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorDefaultTab_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_DefaultTab();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorDefaultTab_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorDefaultTab_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorContributorId_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorContributorId_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorContributorId_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_ContributorId();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorContributorId_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorContributorId_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSourceFolder_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSourceFolder_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorSourceFolder_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_SourceFolder();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorSourceFolder_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorSourceFolder_org_muml_ape_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyGeneratorEditor(String tab) {
		this(tab, org.muml.ape.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.ape.PropertiesPackage.eINSTANCE.getPropertyGenerator());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new PropertyGeneratorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.ape.tab.general",
					"org.muml.ape.tab.general", "org.muml.ape.tab.general", "org.muml.ape.tab.general",
					"org.muml.ape.tab.general", "org.muml.ape.tab.general", "org.muml.ape.tab.general"}).contains(tab);
		}
	}

}
