package de.uni_paderborn.fujaba.muml.hardware.properties.hwplatforminstance.editor;

/**
 * @generated
 */
public abstract class CommunicationMediaInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwplatforminstance.editor.NetworkingHardwareInstanceEditor {

	/**
	 * @generated
	 */
	public CommunicationMediaInstanceEditor(String tab,
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
			addCommunicationMediaInstanceCommunicationMediaPart_GeneralTab_Editor(
					null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaInstanceCommunicationMediaPart_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createCommunicationMediaInstanceCommunicationMediaPart_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaInstanceCommunicationMediaPart_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
						.getCommunicationMediaInstance_CommunicationMediaPart());

		return editor;

	}

}
