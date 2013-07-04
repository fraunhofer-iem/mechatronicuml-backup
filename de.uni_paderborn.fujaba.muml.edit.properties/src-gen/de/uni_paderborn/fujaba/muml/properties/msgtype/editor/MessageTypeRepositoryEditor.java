package de.uni_paderborn.fujaba.muml.properties.msgtype.editor;

public class MessageTypeRepositoryEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public MessageTypeRepositoryEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addMessageTypeRepositoryMessageTypesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addMessageTypeRepositoryMessageTypesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createMessageTypeRepositoryMessageTypesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createMessageTypeRepositoryMessageTypesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage.eINSTANCE
						.getMessageTypeRepository_MessageTypes());

	}

	//
	// Overwritten property settings
	//

}
