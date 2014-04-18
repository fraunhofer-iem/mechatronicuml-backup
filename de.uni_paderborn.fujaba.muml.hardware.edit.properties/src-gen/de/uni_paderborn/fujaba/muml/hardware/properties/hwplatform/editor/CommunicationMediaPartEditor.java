package de.uni_paderborn.fujaba.muml.hardware.properties.hwplatform.editor;

/**
 * @generated
 */
public abstract class CommunicationMediaPartEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwplatform.editor.NetworkingHardwarePartEditor {

	/**
	 * @generated
	 */
	public CommunicationMediaPartEditor(String tab,
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
			addCommunicationMediaPartCommunicationMedia_GeneralTab_Editor(null,
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaPartCommunicationMedia_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createCommunicationMediaPartCommunicationMedia_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaPartCommunicationMedia_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
						.getCommunicationMediaPart_CommunicationMedia());

		return editor;

	}

}
