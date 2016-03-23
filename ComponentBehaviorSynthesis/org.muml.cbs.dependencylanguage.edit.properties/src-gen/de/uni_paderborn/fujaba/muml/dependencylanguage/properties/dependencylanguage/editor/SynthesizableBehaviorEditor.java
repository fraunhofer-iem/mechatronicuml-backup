package de.uni_paderborn.fujaba.muml.dependencylanguage.properties.dependencylanguage.editor;

/**
 * @generated
 */
public class SynthesizableBehaviorEditor
		extends
			org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public SynthesizableBehaviorEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createDependencyModel_DependenciesTab_Editor(),
					false);

		} else if ("de.uni_paderborn.fujaba.muml.dependencylanguage"
				.equals(tab)) { // Tab Dependencies

			addPropertyEditor(createDependencyModel_DependenciesTab_Editor(),
					false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDependencyModel_DependenciesTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createDependencyModel_DependenciesTab_Editor() {
		if (this.editorDependencyModel_DependenciesTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage.eINSTANCE
					.getSynthesizableBehavior_DependencyModel();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.ui.properties.DependencyModelLanguageXtextPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Container for all Dependency of one Atomic Component, Input for the XText Editor.");

			this.editorDependencyModel_DependenciesTab = editor;
		}
		return this.editorDependencyModel_DependenciesTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SynthesizableBehaviorEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.dependencylanguage.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage.eINSTANCE
						.getSynthesizableBehavior());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new SynthesizableBehaviorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.muml.dependencylanguage"})
					.contains(tab);
		}
	}

}
