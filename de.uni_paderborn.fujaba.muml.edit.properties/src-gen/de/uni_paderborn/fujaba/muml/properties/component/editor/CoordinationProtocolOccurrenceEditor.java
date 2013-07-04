package de.uni_paderborn.fujaba.muml.properties.component.editor;

public class CoordinationProtocolOccurrenceEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CoordinationProtocolOccurrenceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addCoordinationProtocolOccurrencePortPartsEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolOccurrencePortPartsEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocolOccurrencePortPartsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolOccurrencePortPartsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getCoordinationProtocolOccurrence_PortParts());

	}

	//
	// Overwritten property settings
	//

}
