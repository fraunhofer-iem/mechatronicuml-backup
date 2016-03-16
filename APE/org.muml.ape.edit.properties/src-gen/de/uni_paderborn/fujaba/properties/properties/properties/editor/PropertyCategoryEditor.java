
package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PropertyCategoryEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyCategoryEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorTitle_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorProperties_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans", "Booleans",
					org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorVertical_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorOpen_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

		} else if ("de.uni_paderborn.fujaba.properties.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorTitle_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorProperties_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans", "Booleans",
					org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorVertical_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorOpen_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTitle_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTitle_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorTitle_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyCategory_Title();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorTitle_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorTitle_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVertical_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVertical_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorVertical_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyCategory_Vertical();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorVertical_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorVertical_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOpen_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOpen_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorOpen_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyCategory_Open();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorOpen_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorOpen_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorProperties_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorProperties_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorProperties_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyCategory_Properties();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorProperties_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorProperties_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyCategoryEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE.getPropertyCategory());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new PropertyCategoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general", "de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general", "de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
