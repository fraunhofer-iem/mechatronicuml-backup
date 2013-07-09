package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public class MessageBufferEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public MessageBufferEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addMessageBufferBufferSizeEditor(null, false);

		addMessageBufferMessageTypeEditor(null, true);

		addCommentableElementCommentEditor(null, true);

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
						.getCommentableElement_Comment(), true);

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new MessageBufferEditor();
		}
	}

}
