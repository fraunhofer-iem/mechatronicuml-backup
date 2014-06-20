package de.uni_paderborn.fujaba.muml.reconfiguration.properties.protocolinstantiation.editor;

/**
 * @generated
 */
public class BroadcastPortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.PortEditor {

	/**
	 * @generated
	 */
	public BroadcastPortEditor(String tab,
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
			addBroadcastPortKind_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointSenderMessageTypes_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointReceiverMessageTypes_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointAdaptationBehavior_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointRoleAndAdaptationBehavior_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointCardinality_GeneralTab_Editor(null,
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteInteractionEndpointReceiverMessageBuffer_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addBehavioralElementBehavior_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addBroadcastPortKind_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createBroadcastPortKind_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createBroadcastPortKind_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage.eINSTANCE
						.getBroadcastPort_Kind());

		editor.setTooltipMessage("Defines the kind of broadcast port. The kind either denotes that this port executes\na discovery protocol or that it is used for instantiating real-time coordination \nprotocols.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointSenderMessageTypes_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteInteractionEndpointSenderMessageTypes_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointSenderMessageTypes_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_SenderMessageTypes());

		editor.setTooltipMessage("The sender message interface defines which messages this discrete port specification sends.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointReceiverMessageTypes_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteInteractionEndpointReceiverMessageTypes_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointReceiverMessageTypes_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_ReceiverMessageTypes());

		editor.setTooltipMessage("The receiver message interface defines which messages this discrete port specification receives.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointAdaptationBehavior_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteInteractionEndpointAdaptationBehavior_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointAdaptationBehavior_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
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
	protected void addDiscreteInteractionEndpointRoleAndAdaptationBehavior_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteInteractionEndpointRoleAndAdaptationBehavior_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointRoleAndAdaptationBehavior_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_RoleAndAdaptationBehavior());

		editor.setTooltipMessage("If this port is a multi-port, this reference points to the real-time statechart that\ncontains the adaptation behavior and the sub-port behavior. Thus, this real-time\nstatechart only contains one state which embeds the real-time statecharts\nspecifying the adaptation behavior and the sub-port behavior.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointCardinality_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteInteractionEndpointCardinality_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointCardinality_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.properties.valuetype.editor.CustomCardinalityPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_Cardinality());

		editor.setTooltipMessage("The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteInteractionEndpointReceiverMessageBuffer_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteInteractionEndpointReceiverMessageBuffer_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteInteractionEndpointReceiverMessageBuffer_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteInteractionEndpoint_ReceiverMessageBuffer());

		editor.setTooltipMessage("A role contains message buffers to store received messages. If this role can only send messages then no message buffer is allowed; otherwise at least one message buffer must be defined. The maximal number of message buffers is limited to the number of message this role may receive.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addBehavioralElementBehavior_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createBehavioralElementBehavior_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createBehavioralElementBehavior_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavioralElement_Behavior());

		editor.setTooltipMessage("The behavior of this behavioral element.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public BroadcastPortEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage.eINSTANCE
						.getBroadcastPort());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new BroadcastPortEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
