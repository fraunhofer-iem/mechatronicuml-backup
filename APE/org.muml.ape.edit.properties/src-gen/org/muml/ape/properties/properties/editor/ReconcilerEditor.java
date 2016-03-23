
package org.muml.ape.properties.properties.editor;

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

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans", "Booleans",
					org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorReconcilePackages_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorReconcileClasses_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorReconcileProperties_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

		} else if ("de.uni_paderborn.fujaba.properties.tab.general".equals(tab)) { // Tab General

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans", "Booleans",
					org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorReconcilePackages_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorReconcileClasses_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorReconcileProperties_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getReconciler_Enabled();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorEnabled_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconcilePackages_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconcilePackages_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorReconcilePackages_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getReconciler_ReconcilePackages();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorReconcilePackages_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorReconcilePackages_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconcileClasses_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconcileClasses_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorReconcileClasses_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getReconciler_ReconcileClasses();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorReconcileClasses_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorReconcileClasses_de_uni_paderborn_fujaba_properties_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconcileProperties_de_uni_paderborn_fujaba_properties_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconcileProperties_de_uni_paderborn_fujaba_properties_tab_generalTab_Editor() {
		if (this.editorReconcileProperties_de_uni_paderborn_fujaba_properties_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getReconciler_ReconcileProperties();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorReconcileProperties_de_uni_paderborn_fujaba_properties_tab_generalTab = editor;
		}
		return this.editorReconcileProperties_de_uni_paderborn_fujaba_properties_tab_generalTab;
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
			return java.util.Arrays.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general", "de.uni_paderborn.fujaba.properties.tab.general",
					"de.uni_paderborn.fujaba.properties.tab.general"}).contains(tab);
		}
	}

}
