package de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor;

/**
 * @generated
 */
public abstract class CommunicationProtocolEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public CommunicationProtocolEditor(String tab,
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
			addCommunicationProtocolIsTimeTriggered_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationProtocolIsEventTriggered_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationProtocolFurtherInformation_GeneralTab_Editor(null,
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationProtocolIsTimeTriggered_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationProtocolIsTimeTriggered_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationProtocolIsTimeTriggered_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCommunicationProtocol_IsTimeTriggered());

		editor.setTooltipMessage("Determines if the protocol is time triggered. ");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommunicationProtocolIsEventTriggered_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createCommunicationProtocolIsEventTriggered_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationProtocolIsEventTriggered_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCommunicationProtocol_IsEventTriggered());

		editor.setTooltipMessage("Determines if this protocol is event triggered.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommunicationProtocolFurtherInformation_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createCommunicationProtocolFurtherInformation_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationProtocolFurtherInformation_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCommunicationProtocol_FurtherInformation(), false);

		editor.setTooltipMessage("Further information for this protocol (i.e. Version, or another Protocol).");

		return editor;

	}

}
