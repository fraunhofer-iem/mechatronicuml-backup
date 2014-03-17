package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

/**
 * @generated
 */
public class HWPlatformPartEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor.PlatformPartEditor {

	/**
	 * @generated
	 */
	public HWPlatformPartEditor(String tab,
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
			addHWPlatformPartHwplatformType_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addHWPlatformPartHwplatformType_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPlatformPartHwplatformType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPlatformPartHwplatformType_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPlatformPart_HwplatformType());

		editor.setTooltipMessage("The HWPlatform type of this HWPlatformPart.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HWPlatformPartEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPlatformPart());
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
			return new HWPlatformPartEditor(tab);
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
