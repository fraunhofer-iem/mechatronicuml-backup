package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class CoordinationProtocolOccurrenceEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getCoordinationProtocolOccurrence_PortParts());

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new CoordinationProtocolOccurrenceEditor();
		}
	}

}
