package de.uni_paderborn.fujaba.muml.verification.uppaal.options.properties.options.editor;

/**
 * @generated
 */
public class HideOptionExtensionEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public HideOptionExtensionEditor(String tab,
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

		if (getTab() == null || "options".equals(getTab())) {
			addOption_OptionsTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addOption_OptionsTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createOption_OptionsTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createOption_OptionsTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsPackage.eINSTANCE
				.getHideOptionExtension_Option();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("indicates which option should be hidden");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HideOptionExtensionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.verification.uppaal.options.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsPackage.eINSTANCE
						.getHideOptionExtension());
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
			return new HideOptionExtensionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"options"})
					.contains(tab);
		}
	}

}
