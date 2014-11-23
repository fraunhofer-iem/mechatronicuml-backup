package de.uni_paderborn.fujaba.muml.ontology.properties.ontology.editor;

/**
 * @generated
 */
public class OntologyExtensionEditor
		extends
			org.storydriven.core.properties.core.editor.ExtensionEditor {

	/**
	 * @generated
	 */
	public OntologyExtensionEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		if (getTab() == null || "property.tab.ontology".equals(getTab())) {
			addOntologyReference_OntologyTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addOntologyReference_OntologyTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createOntologyReference_OntologyTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createOntologyReference_OntologyTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.ontology.OntologyPackage.eINSTANCE
				.getOntologyExtension_OntologyReference();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.ontology.edit.properties.custom.OntologyPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public OntologyExtensionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.ontology.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.ontology.OntologyPackage.eINSTANCE
						.getOntologyExtension());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new OntologyExtensionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.ontology",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
