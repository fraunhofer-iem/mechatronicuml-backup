package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class MessageEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public MessageEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addMessageParameterBindingEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addMessageParameterBindingEditor(String category,
			boolean front) {
		addEditorToCategory(category, createMessageParameterBindingEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createMessageParameterBindingEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getMessage_ParameterBinding());

	}

	//
	// Overwritten property settings
	//

}
