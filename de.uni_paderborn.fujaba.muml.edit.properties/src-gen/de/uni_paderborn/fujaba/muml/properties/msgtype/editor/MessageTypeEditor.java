package de.uni_paderborn.fujaba.muml.properties.msgtype.editor;

public class MessageTypeEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

}
