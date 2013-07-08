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
	public DiscretePortEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addDiscretePortIsDiscreteInPortEditor(null, true);

		addDiscretePortIsDiscreteOutPortEditor(null, true);

		addDiscretePortIsDiscreteInOutPortEditor(null, true);

		addDiscretePortMultiPortEditor(null, true);

		addDiscreteInteractionEndpointSenderMessageTypesEditor(null, true);

		addDiscreteInteractionEndpointReceiverMessageTypesEditor(null, true);

		addDiscreteInteractionEndpointCardinalityEditor(null, false);

		addDiscreteInteractionEndpointReceiverMessageBufferEditor(null, true);

		addConstrainableElementConstraintEditor(null, true);

		addConnectorEndpointConnectorsEditor(null, true);

		addNamedElementNameEditor(null, true);

		addCommentableElementCommentEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addDiscretePortIsDiscreteInPortEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createDiscretePortIsDiscreteInPortEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscretePortIsDiscreteInPortEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDiscretePort_IsDiscreteInPort());

	}
	/**
	 * @generated
	 */
	protected void addDiscretePortIsDiscreteOutPortEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createDiscretePortIsDiscreteOutPortEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscretePortIsDiscreteOutPortEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDiscretePort_IsDiscreteOutPort());

	}
	/**
	 * @generated
	 */
	protected void addDiscretePortIsDiscreteInOutPortEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createDiscretePortIsDiscreteInOutPortEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscretePortIsDiscreteInOutPortEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDiscretePort_IsDiscreteInOutPort());

	}
	/**
	 * @generated
	 */
	protected void addDiscretePortMultiPortEditor(String category, boolean front) {
		addEditorToCategory(category, createDiscretePortMultiPortEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscretePortMultiPortEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDiscretePort_MultiPort());

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
	protected void addConstrainableElementConstraintEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConstrainableElementConstraintEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConstrainableElementConstraintEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstrainableElement_Constraint());

	}
	/**
	 * @generated
	 */
	protected void addConnectorEndpointConnectorsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConnectorEndpointConnectorsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorEndpointConnectorsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorEndpoint_Connectors());

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
				adapterFactory,
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
				adapterFactory,
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
			return new DiscretePortEditor();
		}
	}

}
