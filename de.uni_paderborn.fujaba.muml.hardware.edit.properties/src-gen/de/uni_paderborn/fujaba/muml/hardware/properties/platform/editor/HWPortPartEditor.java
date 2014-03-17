package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

/**
 * @generated
 */
public class HWPortPartEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public HWPortPartEditor(String tab,
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
			addHWPortPartHwPortInstance_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPortPartConnectedMedia_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addHWPortPartHwPortInstance_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPortPartHwPortInstance_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPortPartHwPortInstance_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortPart_HwPortInstance());

		editor.setTooltipMessage("The HWPortInstance from which this HWPortPart is derived.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPortPartConnectedMedia_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPortPartConnectedMedia_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPortPartConnectedMedia_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortPart_ConnectedMedia());

		editor.setTooltipMessage("The communication media to which this HWPortPart is connected.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HWPortPartEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortPart());
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
			return new HWPortPartEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
