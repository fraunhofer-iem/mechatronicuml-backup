
package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class ClassEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ClassEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorGenClass_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSuperClasses_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(),
					false);

		} else if ("de.uni_paderborn.fujaba.properties.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorGenClass_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSuperClasses_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(),
					false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGenClass_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorGenClass_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorGenClass_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getClass_GenClass();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorGenClass_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorGenClass_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSuperClasses_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSuperClasses_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorSuperClasses_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getClass_SuperClasses();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorSuperClasses_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorSuperClasses_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ClassEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE.getClass_());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ClassEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general", "de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
