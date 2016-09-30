
package org.muml.ape.properties.ape.editor;

/**
 * @generated
 */
public class PropertyTabEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyTabEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorId_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAfterTab_org_muml_ape_tab_generalTab_Editor(), false);

		} else if ("org.muml.ape.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorId_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAfterTab_org_muml_ape_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorId_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorId_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorId_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyTab_Id();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorId_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorId_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorName_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyTab_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorName_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorName_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAfterTab_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAfterTab_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorAfterTab_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getPropertyTab_AfterTab();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorAfterTab_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorAfterTab_org_muml_ape_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyTabEditor(String tab) {
		this(tab, org.muml.ape.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.ape.PropertiesPackage.eINSTANCE.getPropertyTab());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new PropertyTabEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.ape.tab.general",
					"org.muml.ape.tab.general", "org.muml.ape.tab.general"}).contains(tab);
		}
	}

}
