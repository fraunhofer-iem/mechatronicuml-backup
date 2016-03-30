
package org.muml.ontology.properties.ontology.editor;

/**
 * @generated
 */
public class OntologyExtensionEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public OntologyExtensionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorOntologyReference_OntologyTab_Editor(), false);

		} else if ("property.tab.ontology".equals(tab)) { // Tab Ontology

			addPropertyEditor(createEditorOntologyReference_OntologyTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOntologyReference_OntologyTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOntologyReference_OntologyTab_Editor() {
		if (this.editorOntologyReference_OntologyTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ontology.OntologyPackage.eINSTANCE
					.getOntologyExtension_OntologyReference();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ontology.edit.properties.custom.OntologyPropertyEditor(
					adapterFactory, feature);

			this.editorOntologyReference_OntologyTab = editor;
		}
		return this.editorOntologyReference_OntologyTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_ExtensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_ExtensionsTab_Editor() {
		if (this.editorExtension_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_ExtensionsTab = editor;
		}
		return this.editorExtension_ExtensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public OntologyExtensionEditor(String tab) {
		this(tab, org.muml.ontology.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.ontology.OntologyPackage.eINSTANCE.getOntologyExtension());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new OntologyExtensionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.ontology", "property.tab.extensions",
					"property.tab.general", "property.tab.extensions"}).contains(tab);
		}
	}

}
