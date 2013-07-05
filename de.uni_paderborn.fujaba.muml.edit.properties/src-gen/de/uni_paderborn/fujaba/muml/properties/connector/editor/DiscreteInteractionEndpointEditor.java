package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public class DiscreteInteractionEndpointEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.behavior.editor.BehavioralElementEditor {

	/**
	 * @generated
	 */
	public DiscreteInteractionEndpointEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addDiscreteInteractionEndpointSenderMessageTypesEditor(null, true);

		addDiscreteInteractionEndpointReceiverMessageTypesEditor(null, true);

		addDiscreteInteractionEndpointCardinalityEditor(null, false);

		addDiscreteInteractionEndpointReceiverMessageBufferEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointSenderMessageTypesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointSenderMessageTypesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointSenderMessageTypesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_SenderMessageTypes());

	}
	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointReceiverMessageTypesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointReceiverMessageTypesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointReceiverMessageTypesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_ReceiverMessageTypes());

	}
	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointCardinalityEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointCardinalityEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointCardinalityEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_Cardinality());

	}
	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointReceiverMessageBufferEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointReceiverMessageBufferEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointReceiverMessageBufferEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_ReceiverMessageBuffer());

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
			return new DiscreteInteractionEndpointEditor();
		}
	}

}
