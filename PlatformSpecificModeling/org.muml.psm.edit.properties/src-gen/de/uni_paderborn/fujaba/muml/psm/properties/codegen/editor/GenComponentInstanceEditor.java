
package de.uni_paderborn.fujaba.muml.psm.properties.codegen.editor;

/**
 * @generated
 */
public class GenComponentInstanceEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public GenComponentInstanceEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorComponentInstance_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorInitCommands_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorComponentInstance_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorInitCommands_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComponentInstance_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComponentInstance_property_tab_psmTab_Editor() {
		if (this.editorComponentInstance_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenComponentInstance_ComponentInstance();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorComponentInstance_property_tab_psmTab = editor;
		}
		return this.editorComponentInstance_property_tab_psmTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInitCommands_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInitCommands_property_tab_psmTab_Editor() {
		if (this.editorInitCommands_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenComponentInstance_InitCommands();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorInitCommands_property_tab_psmTab = editor;
		}
		return this.editorInitCommands_property_tab_psmTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public GenComponentInstanceEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE.getGenComponentInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new GenComponentInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.psm", "property.tab.psm"})
					.contains(tab);
		}
	}

}
