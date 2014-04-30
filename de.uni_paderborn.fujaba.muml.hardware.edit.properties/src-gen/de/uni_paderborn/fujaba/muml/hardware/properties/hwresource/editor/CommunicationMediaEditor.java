package de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor;

/**
 * @generated
 */
public abstract class CommunicationMediaEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaDataFrameSize_GeneralTab_Editor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaBandwidth_GeneralTab_Editor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaProtocol_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationMediaIsSerial_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaDataFrameSize_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationMediaDataFrameSize_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaDataFrameSize_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getCommunicationMedia_DataFrameSize());

		editor.setTooltipMessage("The size of a data frame.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommunicationMediaBandwidth_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationMediaBandwidth_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationMediaBandwidth_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getCommunicationMedia_Bandwidth());

		editor.setTooltipMessage("The bandwidth of this CommunicationMedia.");

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
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getCommunicationMedia_Protocol());

		editor.setTooltipMessage("The protocol this CommunicationMedia uses to transmit data. A CommunicationMedia can only be connected to HWPortInstances that use the same protocol.");

		return editor;

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
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getCommunicationMedia_IsSerial());

		editor.setTooltipMessage("Determines if this CommunicationMedia uses a serial communication.");

		return editor;

	}

}
