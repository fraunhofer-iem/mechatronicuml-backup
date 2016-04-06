
package org.muml.ape.properties.ape.editor;

/**
 * @generated
 */
public class ReconcilerEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconcilerEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorEnabled_org_muml_ape_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorReconcilePackages_org_muml_ape_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorReconcileClasses_org_muml_ape_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorReconcileProperties_org_muml_ape_tab_generalTab_Editor(), false);

		} else if ("org.muml.ape.tab.general".equals(tab)) { // Tab General

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorEnabled_org_muml_ape_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorReconcilePackages_org_muml_ape_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorReconcileClasses_org_muml_ape_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorReconcileProperties_org_muml_ape_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEnabled_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEnabled_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorEnabled_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getReconciler_Enabled();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorEnabled_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorEnabled_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconcilePackages_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconcilePackages_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorReconcilePackages_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getReconciler_ReconcilePackages();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorReconcilePackages_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorReconcilePackages_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconcileClasses_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconcileClasses_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorReconcileClasses_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getReconciler_ReconcileClasses();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorReconcileClasses_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorReconcileClasses_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconcileProperties_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconcileProperties_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorReconcileProperties_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getReconciler_ReconcileProperties();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorReconcileProperties_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorReconcileProperties_org_muml_ape_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconcilerEditor(String tab) {
		this(tab, org.muml.ape.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.ape.PropertiesPackage.eINSTANCE.getReconciler());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ReconcilerEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.ape.tab.general",
					"org.muml.ape.tab.general", "org.muml.ape.tab.general", "org.muml.ape.tab.general"}).contains(tab);
		}
	}

}
