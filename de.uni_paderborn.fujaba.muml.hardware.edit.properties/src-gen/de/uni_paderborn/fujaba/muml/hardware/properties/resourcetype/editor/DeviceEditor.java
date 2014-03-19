package de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor;

/**
 * @generated
 */
public class DeviceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor.ResourceTypeEditor {

	/**
	 * @generated
	 */
	public DeviceEditor(String tab,
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
			addDeviceDeviceType_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addDeviceDeviceType_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createDeviceDeviceType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDeviceDeviceType_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getDevice_DeviceType());

		editor.setTooltipMessage("Determines the type of the Device: Sensor or Actuator.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DeviceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getDevice());
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
			return new DeviceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
