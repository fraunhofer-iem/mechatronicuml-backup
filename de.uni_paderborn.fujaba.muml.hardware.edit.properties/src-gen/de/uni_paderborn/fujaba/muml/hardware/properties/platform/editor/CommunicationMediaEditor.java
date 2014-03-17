package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

/**
 * @generated
 */
public abstract class CommunicationMediaEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor.CommunicationResourceEditor {

	/**
	 * @generated
	 */
	public CommunicationMediaEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaIsSerial_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaProtocol_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaConnectedHWPortParts_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaConnectedBridges_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaConnectedHWPortInstances_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaIsSerial_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationMediaIsSerial_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaIsSerial_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_IsSerial());

		editor.setTooltipMessage("Determines if this CommunicationMedia uses a serial communication.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaProtocol_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationMediaProtocol_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaProtocol_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_Protocol());

		editor.setTooltipMessage("The protocol this CommunicationMedia uses to transmit data. A CommunicationMedia can only be connected to HWPortInstances that use the same protocol.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaConnectedHWPortParts_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createCommunicationMediaConnectedHWPortParts_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaConnectedHWPortParts_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_ConnectedHWPortParts());

		editor.setTooltipMessage("The connected HWPortInstances.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaConnectedBridges_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationMediaConnectedBridges_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaConnectedBridges_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_ConnectedBridges());

		editor.setTooltipMessage("The Bridges this CommunicationMedia is connected to.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaConnectedHWPortInstances_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createCommunicationMediaConnectedHWPortInstances_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaConnectedHWPortInstances_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_ConnectedHWPortInstances());

		editor.setTooltipMessage("The connected HWPortInstances.");

		return editor;

	}

}
