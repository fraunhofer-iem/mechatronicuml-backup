
package org.muml.ape.properties.ape.editor;

/**
 * @generated
 */
public class TextPropertyEditorEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public TextPropertyEditorEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorMultiLine_org_muml_ape_tab_generalTab_Editor(), false);

		} else if ("org.muml.ape.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorMultiLine_org_muml_ape_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMultiLine_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMultiLine_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorMultiLine_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getTextPropertyEditor_MultiLine();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorMultiLine_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorMultiLine_org_muml_ape_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TextPropertyEditorEditor(String tab) {
		this(tab, org.muml.ape.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.ape.PropertiesPackage.eINSTANCE.getTextPropertyEditor());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new TextPropertyEditorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.ape.tab.general"}).contains(tab);
		}
	}

}
