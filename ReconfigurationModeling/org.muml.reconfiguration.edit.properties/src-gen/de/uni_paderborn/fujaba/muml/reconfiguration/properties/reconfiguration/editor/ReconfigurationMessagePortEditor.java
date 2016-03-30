
package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ReconfigurationMessagePortEditor
		extends
			org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconfigurationMessagePortEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorBehavior_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(), false);

			addPropertyEditor(createEditorConnectors_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorCardinality_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSubroleBehavior_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorSenderMessageTypes_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorReceiverMessageTypes_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorReceiverMessageBuffer_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorCoordinatorBehavior_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(), false);

			addPropertyEditor(createEditorConnectors_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorComponent_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorBehavior_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorConnectors_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorCardinality_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSubroleBehavior_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorSenderMessageTypes_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorReceiverMessageTypes_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorReceiverMessageBuffer_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorCoordinatorBehavior_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorConnectors_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorComponent_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(), false);

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(), false);

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSenderMessageTypes_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSenderMessageTypes_GeneralTab_Editor() {
		if (this.editorSenderMessageTypes_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_SenderMessageTypes();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The sender message interface defines which messages this discrete port specification sends.");

			this.editorSenderMessageTypes_GeneralTab = editor;
		}
		return this.editorSenderMessageTypes_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReceiverMessageTypes_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReceiverMessageTypes_GeneralTab_Editor() {
		if (this.editorReceiverMessageTypes_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageTypes();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The receiver message interface defines which messages this discrete port specification receives.");

			this.editorReceiverMessageTypes_GeneralTab = editor;
		}
		return this.editorReceiverMessageTypes_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCardinality_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCardinality_GeneralTab_Editor() {
		if (this.editorCardinality_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_Cardinality();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.pim.properties.valuetype.editor.CustomCardinalityPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.");

			this.editorCardinality_GeneralTab = editor;
		}
		return this.editorCardinality_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReceiverMessageBuffer_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReceiverMessageBuffer_GeneralTab_Editor() {
		if (this.editorReceiverMessageBuffer_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_ReceiverMessageBuffer();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"A role contains message buffers to store received messages. If this role can only send messages then no message buffer is allowed; otherwise at least one message buffer must be defined. The maximal number of message buffers is limited to the number of message this role may receive.");

			this.editorReceiverMessageBuffer_GeneralTab = editor;
		}
		return this.editorReceiverMessageBuffer_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSubroleBehavior_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSubroleBehavior_GeneralTab_Editor() {
		if (this.editorSubroleBehavior_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_SubroleBehavior();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If this port is a multi-port, this reference points to the real-time statechart that\ncontains the subrole behavior of the multi-port.  Then, this real-time statechart \nis contained in the only state of the real-time statechart obtained by the\nbehavior reference.\nIf this port is a single-port, this reference will be undefined.");

			this.editorSubroleBehavior_GeneralTab = editor;
		}
		return this.editorSubroleBehavior_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCoordinatorBehavior_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCoordinatorBehavior_GeneralTab_Editor() {
		if (this.editorCoordinatorBehavior_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getDiscreteInteractionEndpoint_CoordinatorBehavior();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If this port is a multi-port, this reference points to the real-time statechart that\ncontains the adaptation behavior of the multi-port.  Then, this real-time statechart \nis contained in the only state of the real-time statechart obtained by the\nbehavior reference.\nIf this port is a single-port, this reference will be undefined.");

			this.editorCoordinatorBehavior_GeneralTab = editor;
		}
		return this.editorCoordinatorBehavior_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBehavior_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBehavior_GeneralTab_Editor() {
		if (this.editorBehavior_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.behavior.BehaviorPackage.eINSTANCE
					.getBehavioralElement_Behavior();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The behavior of this behavioral element.");

			this.editorBehavior_GeneralTab = editor;
		}
		return this.editorBehavior_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorConnectors_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorConnectors_GeneralTab_Editor() {
		if (this.editorConnectors_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.connector.ConnectorPackage.eINSTANCE
					.getConnectorEndpoint_Connectors();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The connectors attached to this endpoint.");

			this.editorConnectors_GeneralTab = editor;
		}
		return this.editorConnectors_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_DocumentationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_DocumentationTab_Editor() {
		if (this.editorComment_DocumentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_DocumentationTab = editor;
		}
		return this.editorComment_DocumentationTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_ExtensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_ExtensionsTab_Editor() {
		if (this.editorExtension_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_ExtensionsTab = editor;
		}
		return this.editorExtension_ExtensionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_GeneralTab_Editor() {
		if (this.editorName_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.ecore.OCLExpression initExpression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression(
								"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)",
								feature, getEClass());
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(initExpression);
				if (query != null) {
					editor.setInitializeQuery(query);
				}
			}

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_GeneralTab = editor;
		}
		return this.editorName_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComponent_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComponent_GeneralTab_Editor() {
		if (this.editorComponent_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.component.ComponentPackage.eINSTANCE
					.getPort_Component();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression("false", feature, getEClass());
				editor.setInput(input);
				editor.registerOCLAdapter(expression, new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

					@Override
					public boolean select(Object object) {
						return object != null && Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null) {
					editor.addVisibilityFilter(filter);
				}
			}

			editor.setTooltipMessage(
					"The component, this port belongs to. Theoretically the bounds\nshould be 1..1, but that would prevent the possibility for\nComponentPart.portsDerived to be a containment reference\n(see ComponentPart.portsDerived)");

			this.editorComponent_GeneralTab = editor;
		}
		return this.editorComponent_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurationMessagePortEditor(String tab) {
		this(tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationMessagePort());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ReconfigurationMessagePortEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.documentation",
					"property.tab.extensions", "property.tab.general", "property.tab.general"}).contains(tab);
		}
	}

}
