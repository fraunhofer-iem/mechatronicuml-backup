
package org.muml.cbs.dependencylanguage.properties.dependencylanguage.editor;

/**
 * @generated
 */
public class SynthesizableBehaviorEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public SynthesizableBehaviorEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorDependencyModel_org_muml_dependencylanguageTab_Editor(), false);

		} else if ("org.muml.dependencylanguage".equals(tab)) { // Tab Dependencies

			addPropertyEditor(createEditorDependencyModel_org_muml_dependencylanguageTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDependencyModel_org_muml_dependencylanguageTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDependencyModel_org_muml_dependencylanguageTab_Editor() {
		if (this.editorDependencyModel_org_muml_dependencylanguageTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.cbs.dependencylanguage.DependencylanguagePackage.eINSTANCE
					.getSynthesizableBehavior_DependencyModel();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.cbs.dependencylanguage.xtext.ui.properties.DependencyModelLanguageXtextPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"Container for all Dependency of one Atomic Component, Input for the XText Editor.");

			this.editorDependencyModel_org_muml_dependencylanguageTab = editor;
		}
		return this.editorDependencyModel_org_muml_dependencylanguageTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SynthesizableBehaviorEditor(String tab) {
		this(tab, org.muml.cbs.dependencylanguage.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.cbs.dependencylanguage.DependencylanguagePackage.eINSTANCE.getSynthesizableBehavior());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new SynthesizableBehaviorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.dependencylanguage"}).contains(tab);
		}
	}

}
