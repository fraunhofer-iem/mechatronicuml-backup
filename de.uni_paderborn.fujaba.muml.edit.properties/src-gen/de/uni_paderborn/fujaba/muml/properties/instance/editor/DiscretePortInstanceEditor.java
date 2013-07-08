package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class DiscretePortInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.DiscreteInteractionEndpointInstanceEditor {

	/**
	 * @generated
	 */
	public DiscretePortInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addDiscretePortInstanceReceiverMessageTypesEditor(null, true);

		addDiscretePortInstanceSenderMessageTypesEditor(null, true);

		addDiscretePortInstanceReceiverMessageBufferEditor(null, true);

		addPortInstancePortConnectorInstancesEditor(null, true);

		addConnectorEndpointInstanceConnectorInstancesEditor(null, true);

		addNamedElementNameEditor(null, true);

		addCommentableElementCommentEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addDiscretePortInstanceReceiverMessageTypesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscretePortInstanceReceiverMessageTypesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscretePortInstanceReceiverMessageTypesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getDiscretePortInstance_ReceiverMessageTypes());

	}
	/**
	 * @generated
	 */
	protected void addDiscretePortInstanceSenderMessageTypesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscretePortInstanceSenderMessageTypesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscretePortInstanceSenderMessageTypesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getDiscretePortInstance_SenderMessageTypes());

	}
	/**
	 * @generated
	 */
	protected void addDiscretePortInstanceReceiverMessageBufferEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscretePortInstanceReceiverMessageBufferEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscretePortInstanceReceiverMessageBufferEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getDiscretePortInstance_ReceiverMessageBuffer());

	}
	/**
	 * @generated
	 */
	protected void addPortInstancePortConnectorInstancesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPortInstancePortConnectorInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPortInstancePortConnectorInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getPortInstance_PortConnectorInstances());

	}
	/**
	 * @generated
	 */
	protected void addConnectorEndpointInstanceConnectorInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorEndpointInstanceConnectorInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorEndpointInstanceConnectorInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorEndpointInstance_ConnectorInstances());

	}
	/**
	 * @generated
	 */
	protected void addNamedElementNameEditor(String category, boolean front) {
		addEditorToCategory(category, createNamedElementNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createNamedElementNameEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				org.storydriven.core.CorePackage.eINSTANCE
						.getNamedElement_Name());

	}
	/**
	 * @generated
	 */
	protected void addCommentableElementCommentEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommentableElementCommentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementCommentEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new DiscretePortInstanceEditor();
		}
	}

}
