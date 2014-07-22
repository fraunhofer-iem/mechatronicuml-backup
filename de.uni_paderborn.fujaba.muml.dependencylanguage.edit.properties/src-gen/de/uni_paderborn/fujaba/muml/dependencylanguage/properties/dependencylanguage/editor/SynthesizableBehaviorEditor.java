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
		super.createProperties();

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.muml.dependencylanguage"
						.equals(getTab())) {
			addDependencyModel_DependenciesTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addDependencyModel_DependenciesTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createDependencyModel_DependenciesTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDependencyModel_DependenciesTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage.eINSTANCE
				.getSynthesizableBehavior_DependencyModel();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.ui.properties.DependencyModelLanguageXtextPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("Container for all Dependency of one Atomic Component, Input for the XText Editor.");

		return editor;

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
