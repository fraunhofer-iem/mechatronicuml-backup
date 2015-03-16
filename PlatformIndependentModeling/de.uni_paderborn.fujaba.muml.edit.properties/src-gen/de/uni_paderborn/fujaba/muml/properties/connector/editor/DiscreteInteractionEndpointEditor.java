package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public abstract class DiscreteInteractionEndpointEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DiscreteInteractionEndpointEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		addPropertyEditor(createExtension_ExtensionsTab_Editor(), false);

		addPropertyEditor(createName_GeneralTab_Editor(), false);

		addPropertyEditor(createBehavior_GeneralTab_Editor(), false);

		addPropertyEditor(createExtension_ExtensionsTab_Editor(), false);

		addPropertyEditor(createComment_DocumentationTab_Editor(), false);

		addPropertyEditor(createConnectors_GeneralTab_Editor(), false);

		addPropertyEditor(createAdaptationBehavior_GeneralTab_Editor(), false);

		addPropertyEditor(createCardinality_GeneralTab_Editor(), false);

		addPropertyEditor(createSubroleBehavior_GeneralTab_Editor(), false);

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createSenderMessageTypes_GeneralTab_Editor(), false);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createReceiverMessageTypes_GeneralTab_Editor(), false);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createReceiverMessageBuffer_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSenderMessageTypes_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createSenderMessageTypes_GeneralTab_Editor() {
		if (this.editorSenderMessageTypes_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_SenderMessageTypes();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The sender message interface defines which messages this discrete port specification sends.");

			this.editorSenderMessageTypes_GeneralTab = editor;
		}
		return this.editorSenderMessageTypes_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReceiverMessageTypes_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createReceiverMessageTypes_GeneralTab_Editor() {
		if (this.editorReceiverMessageTypes_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageTypes();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The receiver message interface defines which messages this discrete port specification receives.");

			this.editorReceiverMessageTypes_GeneralTab = editor;
		}
		return this.editorReceiverMessageTypes_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAdaptationBehavior_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createAdaptationBehavior_GeneralTab_Editor() {
		if (this.editorAdaptationBehavior_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_AdaptationBehavior();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("If this port is a multi-port, this reference points to the real-time statechart that\ncontains the adaptation behavior of the multi-port.  Then, this real-time statechart \nis contained in the only state of the real-time statechart obtained by the\nbehavior reference.\nIf this port is a single-port, this reference will be undefined.");

			this.editorAdaptationBehavior_GeneralTab = editor;
		}
		return this.editorAdaptationBehavior_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCardinality_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createCardinality_GeneralTab_Editor() {
		if (this.editorCardinality_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_Cardinality();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.properties.valuetype.editor.CustomCardinalityPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.");

			this.editorCardinality_GeneralTab = editor;
		}
		return this.editorCardinality_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReceiverMessageBuffer_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createReceiverMessageBuffer_GeneralTab_Editor() {
		if (this.editorReceiverMessageBuffer_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageBuffer();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("A role contains message buffers to store received messages. If this role can only send messages then no message buffer is allowed; otherwise at least one message buffer must be defined. The maximal number of message buffers is limited to the number of message this role may receive.");

			this.editorReceiverMessageBuffer_GeneralTab = editor;
		}
		return this.editorReceiverMessageBuffer_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSubroleBehavior_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createSubroleBehavior_GeneralTab_Editor() {
		if (this.editorSubroleBehavior_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_SubroleBehavior();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("If this port is a multi-port, this reference points to the real-time statechart that\ncontains the subrole behavior of the multi-port.  Then, this real-time statechart \nis contained in the only state of the real-time statechart obtained by the\nbehavior reference.\nIf this port is a single-port, this reference will be undefined.");

			this.editorSubroleBehavior_GeneralTab = editor;
		}
		return this.editorSubroleBehavior_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createName_GeneralTab_Editor() {
		if (this.editorName_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_GeneralTab = editor;
		}
		return this.editorName_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_ExtensionsTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createExtension_ExtensionsTab_Editor() {
		if (this.editorExtension_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_ExtensionsTab = editor;
		}
		return this.editorExtension_ExtensionsTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBehavior_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createBehavior_GeneralTab_Editor() {
		if (this.editorBehavior_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getBehavioralElement_Behavior();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The behavior of this behavioral element.");

			this.editorBehavior_GeneralTab = editor;
		}
		return this.editorBehavior_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorConnectors_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createConnectors_GeneralTab_Editor() {
		if (this.editorConnectors_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getConnectorEndpoint_Connectors();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The connectors attached to this endpoint.");

			this.editorConnectors_GeneralTab = editor;
		}
		return this.editorConnectors_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_DocumentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createComment_DocumentationTab_Editor() {
		if (this.editorComment_DocumentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_DocumentationTab = editor;
		}
		return this.editorComment_DocumentationTab;
	}

}
