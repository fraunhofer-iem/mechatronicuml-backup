package de.uni_paderborn.fujaba.muml.hardware.properties.hwplatforminstance.editor;

/**
 * @generated
 */
public class HWPlatformInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public HWPlatformInstanceEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHwplatformType_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addEmbeddedHPIC_GeneralTab_Editor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addParentHPIC_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addHwplatformType_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createHwplatformType_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHwplatformType_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
				.getHWPlatformInstance_HwplatformType();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The HWPlatform type of which this instance is derived.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEmbeddedHPIC_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createEmbeddedHPIC_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEmbeddedHPIC_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
				.getHWPlatformInstance_EmbeddedHPIC();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addParentHPIC_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createParentHPIC_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createParentHPIC_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
				.getHWPlatformInstance_ParentHPIC();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HWPlatformInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
						.getHWPlatformInstance());
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
			return new HWPlatformInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
