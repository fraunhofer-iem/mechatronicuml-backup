package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class DiscretePortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.PortEditor {

	/**
	 * @generated
	 */
	public DiscretePortEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addDiscreteInteractionEndpointSenderMessageTypesEditor(
				"de.fujaba.properties.category.Lists", true);

		addDiscreteInteractionEndpointReceiverMessageTypesEditor(
				"de.fujaba.properties.category.Lists", true);

		addDiscreteInteractionEndpointCardinalityEditor(null, false);

		addDiscreteInteractionEndpointReceiverMessageBufferEditor(
				"de.fujaba.properties.category.Lists", true);

		addBehavioralElementBehaviorEditor(null, true);

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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
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
				adapterFactory,
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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_ReceiverMessageBuffer());

	}
	/**
	 * @generated
	 */
	protected void addBehavioralElementBehaviorEditor(String category,
			boolean front) {
		addEditorToCategory(category, createBehavioralElementBehaviorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBehavioralElementBehaviorEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavioralElement_Behavior());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DiscretePortEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDiscretePort());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new DiscretePortEditor();
		}
	}

}
