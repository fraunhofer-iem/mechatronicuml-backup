package de.uni_paderborn.fujaba.muml.properties.protocol.editor;

/**
 * @generated
 */
public class RoleEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.types.editor.DataTypeEditor {

	/**
	 * @generated
	 */
	public RoleEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addRoleCoordinationProtocolEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointSenderMessageTypesEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointReceiverMessageTypesEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointAdaptationBehaviorEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointRoleAndAdaptationBehaviorEditor(null,
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointCardinalityEditor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointReceiverMessageBufferEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConstrainableElementConstraintEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addBehavioralElementBehaviorEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConnectorEndpointConnectorsEditor(
					"de.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addRoleCoordinationProtocolEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRoleCoordinationProtocolEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRoleCoordinationProtocolEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getRole_CoordinationProtocol());

		editor.setTooltipMessage("The coordination protocol this role belongs to.");

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_SenderMessageTypes());

		editor.setTooltipMessage("The sender message interface defines which messages this discrete port specification sends.");

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_ReceiverMessageTypes());

		editor.setTooltipMessage("The receiver message interface defines which messages this discrete port specification receives.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointAdaptationBehaviorEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteInteractionEndpointAdaptationBehaviorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointAdaptationBehaviorEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_AdaptationBehavior());

		editor.addVisibilityFilter("cardinality.upperBound.value > 1",
				getEClass());

		editor.setTooltipMessage("If this port is a multi-port, this reference points to the real-time statechart that\ncontains the adaptation behavior of the multi-port.  Then, this real-time statechart \nis contained in the only state of the real-time statechart we is obtained by the\nreference roleAndAdaptationBehavior.\nIf this port is a single-port, this reference will be undefined.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointRoleAndAdaptationBehaviorEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteInteractionEndpointRoleAndAdaptationBehaviorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointRoleAndAdaptationBehaviorEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_RoleAndAdaptationBehavior());

		editor.setTooltipMessage("If this port is a multi-port, this reference points to the real-time statechart that\ncontains the adaptation behavior and the sub-port behavior. Thus, this real-time\nstatechart only contains one state which embeds the real-time statecharts\nspecifying the adaptation behavior and the sub-port behavior.");

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_Cardinality());

		editor.setTooltipMessage("The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.");

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_ReceiverMessageBuffer());

		editor.setTooltipMessage("A role contains message buffers to store received messages. If this role can only send messages then no message buffer is allowed; otherwise at least one message buffer must be defined. The maximal number of message buffers is limited to the number of message this role may receive.");

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstrainableElement_Constraint());

		editor.setTooltipMessage("The constraint for this element.");

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavioralElement_Behavior());

		editor.setTooltipMessage("The real-time statechart that defines the behavior of this behavioral element.");

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorEndpoint_Connectors());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public RoleEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getRole());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new RoleEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.documentation",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
