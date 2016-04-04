
package org.muml.psm.properties.properties.editor;

/**
 * @generated
 */
public class RequiredMemoryEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RequiredMemoryEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorRequiredMemory_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorResourceInstance_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorRequiredMemory_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorResourceInstance_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRequiredMemory_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorRequiredMemory_property_tab_psmTab_Editor() {
		if (this.editorRequiredMemory_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.psm.properties.PropertiesPackage.eINSTANCE
					.getRequiredMemory_RequiredMemory();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The required amount of memory.");

			this.editorRequiredMemory_property_tab_psmTab = editor;
		}
		return this.editorRequiredMemory_property_tab_psmTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorResourceInstance_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorResourceInstance_property_tab_psmTab_Editor() {
		if (this.editorResourceInstance_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.psm.properties.PropertiesPackage.eINSTANCE
					.getRequiredMemory_ResourceInstance();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The used Resource Instance.");

			this.editorResourceInstance_property_tab_psmTab = editor;
		}
		return this.editorResourceInstance_property_tab_psmTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_property_tab_extensionsTab_Editor() {
		if (this.editorExtension_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_property_tab_extensionsTab = editor;
		}
		return this.editorExtension_property_tab_extensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public RequiredMemoryEditor(String tab) {
		this(tab, org.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.psm.properties.PropertiesPackage.eINSTANCE.getRequiredMemory());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new RequiredMemoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.psm", "property.tab.psm",
					"property.tab.extensions", "property.tab.general", "property.tab.extensions"}).contains(tab);
		}
	}

}