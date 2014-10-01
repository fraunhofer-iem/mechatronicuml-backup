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
			addCommunicationMediaPart_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaPart_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCommunicationMediaPart_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaPart_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
				.getCommunicationMediaInstance_CommunicationMediaPart();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

}
