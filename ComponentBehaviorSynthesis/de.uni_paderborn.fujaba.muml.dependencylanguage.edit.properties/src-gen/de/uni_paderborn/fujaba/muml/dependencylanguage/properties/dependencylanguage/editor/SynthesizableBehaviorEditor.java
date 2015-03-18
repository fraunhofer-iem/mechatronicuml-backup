package de.uni_paderborn.fujaba.muml.dependencylanguage.properties.dependencylanguage.editor;

/**
 * @generated
 */
public class SynthesizableBehaviorEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

		if (tab == null
				|| "de.uni_paderborn.fujaba.muml.dependencylanguage"
						.equals(getTab())) { // Tab Dependencies

			addPropertyEditor(createDependencyModel_DependenciesTab_Editor(),
					false);

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDependencyModel_DependenciesTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createDependencyModel_DependenciesTab_Editor() {
		if (this.editorDependencyModel_DependenciesTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage.eINSTANCE
					.getSynthesizableBehavior_DependencyModel();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.ui.properties.DependencyModelLanguageXtextPropertyEditor(
					adapterFactory, feature);

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
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
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
