package de.uni_paderborn.fujaba.muml.properties.connector.editor;

public class MessageBufferEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public MessageBufferEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addMessageBufferBufferSizeEditor(null, true);

		addMessageBufferMessageTypeEditor(null, true);

		super.initialize();
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
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getMessageBuffer_MessageType());

	}

	//
	// Overwritten property settings
	//

}
