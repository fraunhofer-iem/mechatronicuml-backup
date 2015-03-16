package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public class MessageBufferEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public MessageBufferEditor(String tab,
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

		addPropertyEditor(createComment_DocumentationTab_Editor(), false);

		addPropertyEditor(createExtension_ExtensionsTab_Editor(), false);

		addPropertyEditor(createName_GeneralTab_Editor(), false);

		addPropertyEditor(createBufferSize_GeneralTab_Editor(), false);

		addPropertyEditor(
				createDiscreteInteractionEndpoint_GeneralTab_Editor(), false);

		addPropertyEditor(
				createBufferOverflowAvoidanceStrategy_GeneralTab_Editor(),
				false);

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createMessageType_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBufferSize_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createBufferSize_GeneralTab_Editor() {
		if (this.editorBufferSize_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getMessageBuffer_BufferSize();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The size of the message buffer. ");

			this.editorBufferSize_GeneralTab = editor;
		}
		return this.editorBufferSize_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMessageType_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createMessageType_GeneralTab_Editor() {
		if (this.editorMessageType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getMessageBuffer_MessageType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The message types this message buffer can store.");

			this.editorMessageType_GeneralTab = editor;
		}
		return this.editorMessageType_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDiscreteInteractionEndpoint_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createDiscreteInteractionEndpoint_GeneralTab_Editor() {
		if (this.editorDiscreteInteractionEndpoint_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getMessageBuffer_DiscreteInteractionEndpoint();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The role that contains this message buffer. The lower bound is 0, but semantically has to be 1. This is due to the derived containment feature CoordinationProtocol.gmfMessageBuffers.");

			this.editorDiscreteInteractionEndpoint_GeneralTab = editor;
		}
		return this.editorDiscreteInteractionEndpoint_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBufferOverflowAvoidanceStrategy_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createBufferOverflowAvoidanceStrategy_GeneralTab_Editor() {
		if (this.editorBufferOverflowAvoidanceStrategy_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
					.getMessageBuffer_BufferOverflowAvoidanceStrategy();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			this.editorBufferOverflowAvoidanceStrategy_GeneralTab = editor;
		}
		return this.editorBufferOverflowAvoidanceStrategy_GeneralTab;
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

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public MessageBufferEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getMessageBuffer());
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
			return new MessageBufferEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general"})
					.contains(tab);
		}
	}

}
