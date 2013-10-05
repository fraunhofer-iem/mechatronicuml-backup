package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public class MessageBufferEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

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
		super.createProperties();

		addMessageBufferBufferSizeEditor(null, false);

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addMessageBufferMessageTypeEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addMessageBufferDiscreteInteractionEndpointEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addNamedElementNameEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addMessageBufferBufferSizeEditor(String category,
			boolean front) {
		addEditorToCategory(category, createMessageBufferBufferSizeEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createMessageBufferBufferSizeEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getMessageBuffer_BufferSize());

	}
	/**
	 * @generated
	 */
	protected void addMessageBufferMessageTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category, createMessageBufferMessageTypeEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createMessageBufferMessageTypeEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getMessageBuffer_MessageType());

	}
	/**
	 * @generated
	 */
	protected void addMessageBufferDiscreteInteractionEndpointEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createMessageBufferDiscreteInteractionEndpointEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createMessageBufferDiscreteInteractionEndpointEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getMessageBuffer_DiscreteInteractionEndpoint());

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
						.getNamedElement_Name(), false);

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
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new MessageBufferEditor(tab);
		}
	}

}
