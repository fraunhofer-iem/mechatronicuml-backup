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

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaIsSerialEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaProtocolEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaConnectedHWPortPartsEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaConnectedBridgesEditor(
					"de.fujaba.properties.category.Lists", true);
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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaIsSerialEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_IsSerial());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaProtocolEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_Protocol());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaConnectedHWPortPartsEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_ConnectedHWPortParts());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaConnectedBridgesEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getCommunicationMedia_ConnectedBridges());

		return editor;

	}

}
