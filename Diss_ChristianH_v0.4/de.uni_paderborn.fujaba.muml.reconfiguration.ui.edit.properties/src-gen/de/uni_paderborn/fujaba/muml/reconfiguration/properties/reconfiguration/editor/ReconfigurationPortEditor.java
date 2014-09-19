package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public abstract class ReconfigurationPortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.PortEditor {

	/**
	 * @generated
	 */
	public ReconfigurationPortEditor(String tab,
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
			addSenderMessageTypes_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addReceiverMessageTypes_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addAdaptationBehavior_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCardinality_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addReceiverMessageBuffer_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSubroleBehavior_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addBehavior_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addSenderMessageTypes_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createSenderMessageTypes_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createSenderMessageTypes_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getDiscreteInteractionEndpoint_SenderMessageTypes();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The sender message interface defines which messages this discrete port specification sends.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addReceiverMessageTypes_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createReceiverMessageTypes_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReceiverMessageTypes_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getDiscreteInteractionEndpoint_ReceiverMessageTypes();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The receiver message interface defines which messages this discrete port specification receives.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addAdaptationBehavior_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createAdaptationBehavior_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createAdaptationBehavior_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getDiscreteInteractionEndpoint_AdaptationBehavior();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("If this port is a multi-port, this reference points to the real-time statechart that\ncontains the adaptation behavior of the multi-port.  Then, this real-time statechart \nis contained in the only state of the real-time statechart obtained by the\nbehavior reference.\nIf this port is a single-port, this reference will be undefined.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCardinality_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createCardinality_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCardinality_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getDiscreteInteractionEndpoint_Cardinality();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.properties.valuetype.editor.CustomCardinalityPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addReceiverMessageBuffer_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createReceiverMessageBuffer_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReceiverMessageBuffer_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getDiscreteInteractionEndpoint_ReceiverMessageBuffer();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("A role contains message buffers to store received messages. If this role can only send messages then no message buffer is allowed; otherwise at least one message buffer must be defined. The maximal number of message buffers is limited to the number of message this role may receive.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addSubroleBehavior_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createSubroleBehavior_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createSubroleBehavior_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
				.getDiscreteInteractionEndpoint_SubroleBehavior();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("If this port is a multi-port, this reference points to the real-time statechart that\ncontains the subrole behavior of the multi-port.  Then, this real-time statechart \nis contained in the only state of the real-time statechart obtained by the\nbehavior reference.\nIf this port is a single-port, this reference will be undefined.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addBehavior_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createBehavior_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createBehavior_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
				.getBehavioralElement_Behavior();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The behavior of this behavioral element.");

		return editor;

	}

}
