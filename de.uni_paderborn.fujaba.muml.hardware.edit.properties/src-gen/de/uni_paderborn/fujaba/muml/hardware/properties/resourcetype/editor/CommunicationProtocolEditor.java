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

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationProtocolIsTimeTriggeredEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationProtocolIsEventTriggeredEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCommunicationProtocolFurtherInformationEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationProtocolIsTimeTriggeredEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationProtocolIsTimeTriggeredEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationProtocolIsTimeTriggeredEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCommunicationProtocol_IsTimeTriggered());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommunicationProtocolIsEventTriggeredEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationProtocolIsEventTriggeredEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationProtocolIsEventTriggeredEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCommunicationProtocol_IsEventTriggered());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommunicationProtocolFurtherInformationEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommunicationProtocolFurtherInformationEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationProtocolFurtherInformationEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getCommunicationProtocol_FurtherInformation(), false);

		return editor;

	}

}
