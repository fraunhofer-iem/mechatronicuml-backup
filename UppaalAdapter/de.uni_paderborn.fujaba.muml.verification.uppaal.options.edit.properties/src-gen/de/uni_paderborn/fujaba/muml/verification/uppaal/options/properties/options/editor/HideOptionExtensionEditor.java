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
		if (tab == null) {

			addPropertyEditor(createOption_OptionsTab_Editor(), false);

		} else if ("options".equals(tab)) { // Tab Options

			addPropertyEditor(createOption_OptionsTab_Editor(), false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOption_OptionsTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createOption_OptionsTab_Editor() {
		if (this.editorOption_OptionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.uppaal.options.OptionsPackage.eINSTANCE
					.getHideOptionExtension_Option();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("indicates which option should be hidden");

			this.editorOption_OptionsTab = editor;
		}
		return this.editorOption_OptionsTab;
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
