
package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EFactoryEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EFactoryEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorEAnnotations_DocumentationTab_Editor(), false);

			addPropertyEditor(createEditorEPackage_DefaultTab_Editor(), false);

		} else if ("tab.default".equals(tab)) { // Tab Default

			addPropertyEditor(createEditorEPackage_DefaultTab_Editor(), false);

		} else if ("tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorEAnnotations_DocumentationTab_Editor(), false);

		} else if ("tab.ocl".equals(tab)) { // Tab OCL

		} else if ("tab.filter".equals(tab)) { // Tab Filter

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEPackage_DefaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEPackage_DefaultTab_Editor() {
		if (this.editorEPackage_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEFactory_EPackage();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorEPackage_DefaultTab = editor;
		}
		return this.editorEPackage_DefaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_DocumentationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_DocumentationTab_Editor() {
		if (this.editorEAnnotations_DocumentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.DocumentationAnnotationPropertyEditor(
					adapterFactory, feature);

			this.editorEAnnotations_DocumentationTab = editor;
		}
		return this.editorEAnnotations_DocumentationTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EFactoryEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEFactory());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new EFactoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"tab.default", "tab.documentation"}).contains(tab);
		}
	}

}
