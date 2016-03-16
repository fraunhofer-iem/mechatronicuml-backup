
package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class CustomTransformationEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CustomTransformationEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorUri_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPosition_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

		} else if ("de.uni_paderborn.fujaba.properties.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorUri_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPosition_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUri_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUri_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorUri_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getCustomTransformation_Uri();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorUri_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorUri_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getCustomTransformation_Enabled();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPosition_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPosition_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorPosition_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getCustomTransformation_Position();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			this.editorPosition_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorPosition_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CustomTransformationEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE.getCustomTransformation());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new CustomTransformationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general", "de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
