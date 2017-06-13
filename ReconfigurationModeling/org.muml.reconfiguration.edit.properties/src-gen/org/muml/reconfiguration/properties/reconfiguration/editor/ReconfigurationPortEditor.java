
package org.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public abstract class ReconfigurationPortEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconfigurationPortEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorBehavior_property_tab_behaviorTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSenderMessageTypes_property_tab_messageTab_Editor(), false);

			addPropertyEditor(createEditorReceiverMessageTypes_property_tab_messageTab_Editor(), false);

			addPropertyEditor(createEditorCardinality_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorReceiverMessageBuffer_property_tab_messageTab_Editor(), false);

			addPropertyEditor(createEditorSubroleBehavior_property_tab_behaviorTab_Editor(), false);

			addPropertyEditor(createEditorCoordinatorBehavior_property_tab_behaviorTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

			addPropertyEditor(createEditorSenderMessageTypes_property_tab_messageTab_Editor(), false);

			addPropertyEditor(createEditorReceiverMessageTypes_property_tab_messageTab_Editor(), false);

			addPropertyEditor(createEditorReceiverMessageBuffer_property_tab_messageTab_Editor(), false);

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

			addPropertyEditor(createEditorBehavior_property_tab_behaviorTab_Editor(), false);

			addPropertyEditor(createEditorSubroleBehavior_property_tab_behaviorTab_Editor(), false);

			addPropertyEditor(createEditorCoordinatorBehavior_property_tab_behaviorTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorCardinality_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSenderMessageTypes_property_tab_messageTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSenderMessageTypes_property_tab_messageTab_Editor() {
		if (this.editorSenderMessageTypes_property_tab_messageTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_SenderMessageTypes();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The sender message interface defines which messages this discrete port specification sends.");

			this.editorSenderMessageTypes_property_tab_messageTab = editor;
		}
		return this.editorSenderMessageTypes_property_tab_messageTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReceiverMessageTypes_property_tab_messageTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReceiverMessageTypes_property_tab_messageTab_Editor() {
		if (this.editorReceiverMessageTypes_property_tab_messageTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageTypes();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The receiver message interface defines which messages this discrete port specification receives.");

			this.editorReceiverMessageTypes_property_tab_messageTab = editor;
		}
		return this.editorReceiverMessageTypes_property_tab_messageTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCardinality_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCardinality_property_tab_generalTab_Editor() {
		if (this.editorCardinality_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_Cardinality();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.pim.properties.valuetype.editor.CustomCardinalityPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.");

			this.editorCardinality_property_tab_generalTab = editor;
		}
		return this.editorCardinality_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReceiverMessageBuffer_property_tab_messageTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReceiverMessageBuffer_property_tab_messageTab_Editor() {
		if (this.editorReceiverMessageBuffer_property_tab_messageTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageBuffer();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"A role contains message buffers to store received messages. If this role can only send messages then no message buffer is allowed; otherwise at least one message buffer must be defined. The maximal number of message buffers is limited to the number of message this role may receive.");

			this.editorReceiverMessageBuffer_property_tab_messageTab = editor;
		}
		return this.editorReceiverMessageBuffer_property_tab_messageTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSubroleBehavior_property_tab_behaviorTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSubroleBehavior_property_tab_behaviorTab_Editor() {
		if (this.editorSubroleBehavior_property_tab_behaviorTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_SubroleBehavior();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If this port is a multi-port, this reference points to the real-time statechart that\ncontains the subrole behavior of the multi-port.  Then, this real-time statechart \nis contained in the only state of the real-time statechart obtained by the\nbehavior reference.\nIf this port is a single-port, this reference will be undefined.");

			this.editorSubroleBehavior_property_tab_behaviorTab = editor;
		}
		return this.editorSubroleBehavior_property_tab_behaviorTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCoordinatorBehavior_property_tab_behaviorTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCoordinatorBehavior_property_tab_behaviorTab_Editor() {
		if (this.editorCoordinatorBehavior_property_tab_behaviorTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_CoordinatorBehavior();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If this port is a multi-port, this reference points to the real-time statechart that\ncontains the adaptation behavior of the multi-port.  Then, this real-time statechart \nis contained in the only state of the real-time statechart obtained by the\nbehavior reference.\nIf this port is a single-port, this reference will be undefined.");

			this.editorCoordinatorBehavior_property_tab_behaviorTab = editor;
		}
		return this.editorCoordinatorBehavior_property_tab_behaviorTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBehavior_property_tab_behaviorTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBehavior_property_tab_behaviorTab_Editor() {
		if (this.editorBehavior_property_tab_behaviorTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.behavior.BehaviorPackage.eINSTANCE
					.getBehavioralElement_Behavior();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The behavior of this behavioral element.");

			this.editorBehavior_property_tab_behaviorTab = editor;
		}
		return this.editorBehavior_property_tab_behaviorTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_property_tab_documentationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_property_tab_documentationTab_Editor() {
		if (this.editorComment_property_tab_documentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_property_tab_documentationTab = editor;
		}
		return this.editorComment_property_tab_documentationTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_property_tab_extensionsTab_Editor() {
		if (this.editorExtensions_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtensions_property_tab_extensionsTab = editor;
		}
		return this.editorExtensions_property_tab_extensionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_property_tab_generalTab_Editor() {
		if (this.editorName_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{

				try {
					final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
					org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery(
							"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)");
					editor.setInitializeExpression(oclExpression);
				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
				}
			}

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_property_tab_generalTab = editor;
		}
		return this.editorName_property_tab_generalTab;
	}

}
