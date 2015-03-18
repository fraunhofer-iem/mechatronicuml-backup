package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PluginEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PluginEditor(String tab,
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
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) { // Tab General

			addPropertyEditor(createId_GeneralTab_Editor(), false);

			addPropertyEditor(createName_GeneralTab_Editor(), false);

			addPropertyEditor(createVendor_GeneralTab_Editor(), false);

			addPropertyEditor(createVersion_GeneralTab_Editor(), false);

			addPropertyEditor(createRequiredBundles_GeneralTab_Editor(), false);

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorId_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createId_GeneralTab_Editor() {
		if (this.editorId_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_Id();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorId_GeneralTab = editor;
		}
		return this.editorId_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createName_GeneralTab_Editor() {
		if (this.editorName_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorName_GeneralTab = editor;
		}
		return this.editorName_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVendor_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createVendor_GeneralTab_Editor() {
		if (this.editorVendor_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_Vendor();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorVendor_GeneralTab = editor;
		}
		return this.editorVendor_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVersion_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createVersion_GeneralTab_Editor() {
		if (this.editorVersion_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_Version();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorVersion_GeneralTab = editor;
		}
		return this.editorVersion_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRequiredBundles_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createRequiredBundles_GeneralTab_Editor() {
		if (this.editorRequiredBundles_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPlugin_RequiredBundles();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorRequiredBundles_GeneralTab = editor;
		}
		return this.editorRequiredBundles_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PluginEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPlugin());
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
			return new PluginEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
