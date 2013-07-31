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
	public MessageBufferEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public MessageBufferEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addMessageBufferBufferSizeEditor(null, true);

		addMessageBufferMessageTypeEditor(
				"de.fujaba.properties.category.Lists", true);

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
		return new de.uni_paderborn.fujaba.muml.common.properties.NaturalNumberTextEditor(
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
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new MessageBufferEditor();
		}
	}

}
