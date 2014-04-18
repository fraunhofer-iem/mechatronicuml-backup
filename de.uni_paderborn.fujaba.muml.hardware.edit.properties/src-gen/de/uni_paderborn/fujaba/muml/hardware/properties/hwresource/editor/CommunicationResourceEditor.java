package de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor;

/**
 * @generated
 */
public class CommunicationResourceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor.HWPortEditor {

	/**
	 * @generated
	 */
	public CommunicationResourceEditor(String tab,
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
			addCommunicationResourceProtocol_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationResourceProtocol_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationResourceProtocol_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationResourceProtocol_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getCommunicationResource_Protocol());

		editor.setTooltipMessage("The CommunicationProtocol this HWPort uses to transmit data.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CommunicationResourceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getCommunicationResource());
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
			return new CommunicationResourceEditor(tab);
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
