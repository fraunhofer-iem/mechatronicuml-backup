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
			addCommunicationMedia_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMedia_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCommunicationMedia_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMedia_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
				.getCommunicationMediaPart_CommunicationMedia();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

}
