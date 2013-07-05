package de.uni_paderborn.fujaba.muml.properties.msgtype.editor;

/**
 * @generated
 */
public class MessageTypeEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public MessageTypeEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addMessageTypeParametersEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addMessageTypeParametersEditor(String category, boolean front) {
		addEditorToCategory(category, createMessageTypeParametersEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createMessageTypeParametersEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE
						.getMessageType_Parameters());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new MessageTypeEditor();
		}
	}

}
