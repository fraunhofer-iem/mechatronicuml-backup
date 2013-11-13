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
			addCommunicationMediaIsSerialEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaProtocolEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaConnectedHWPortPartsEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaConnectedBridgesEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaConnectedHWPortInstancesEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaIsSerialEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommunicationMediaIsSerialEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaIsSerialEditor() {
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
	protected void addCommunicationMediaProtocolEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommunicationMediaProtocolEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaProtocolEditor() {
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
	protected void addCommunicationMediaConnectedHWPortPartsEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationMediaConnectedHWPortPartsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaConnectedHWPortPartsEditor() {
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
	protected void addCommunicationMediaConnectedBridgesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCommunicationMediaConnectedBridgesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaConnectedBridgesEditor() {
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
	protected void addCommunicationMediaConnectedHWPortInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationMediaConnectedHWPortInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaConnectedHWPortInstancesEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_ConnectedHWPortInstances());

		editor.setTooltipMessage("The connected HWPortInstances.");

		return editor;

	}

}
