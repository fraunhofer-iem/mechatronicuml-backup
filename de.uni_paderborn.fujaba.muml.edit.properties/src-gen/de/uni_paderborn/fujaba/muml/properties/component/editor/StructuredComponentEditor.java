package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class StructuredComponentEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.ComponentEditor {

	/**
	 * @generated
	 */
	public StructuredComponentEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addStructuredComponentEmbeddedComponentPartsEditor(null, true);

		addStructuredComponentConnectorsEditor(null, true);

		addStructuredComponentCoordinationProtocolOccurencesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addStructuredComponentEmbeddedComponentPartsEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createStructuredComponentEmbeddedComponentPartsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStructuredComponentEmbeddedComponentPartsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getStructuredComponent_EmbeddedComponentParts());

	}
	/**
	 * @generated
	 */
	protected void addStructuredComponentConnectorsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createStructuredComponentConnectorsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStructuredComponentConnectorsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getStructuredComponent_Connectors());

	}
	/**
	 * @generated
	 */
	protected void addStructuredComponentCoordinationProtocolOccurencesEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createStructuredComponentCoordinationProtocolOccurencesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStructuredComponentCoordinationProtocolOccurencesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getStructuredComponent_CoordinationProtocolOccurences());

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
			return new StructuredComponentEditor();
		}
	}

}
