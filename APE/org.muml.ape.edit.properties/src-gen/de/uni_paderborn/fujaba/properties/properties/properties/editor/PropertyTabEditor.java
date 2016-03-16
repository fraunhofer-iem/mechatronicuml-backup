
package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PropertyTabEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

			addPropertyEditor(createEditorId_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAfterTab_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

		} else if ("de.uni_paderborn.fujaba.properties.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorId_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAfterTab_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorId_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorId_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorId_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyTab_Id();
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
					.getPropertyTab_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorName_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorName_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAfterTab_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAfterTab_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorAfterTab_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyTab_AfterTab();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorAfterTab_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorAfterTab_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyTabEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE.getPropertyTab());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new PropertyTabEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general", "de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
