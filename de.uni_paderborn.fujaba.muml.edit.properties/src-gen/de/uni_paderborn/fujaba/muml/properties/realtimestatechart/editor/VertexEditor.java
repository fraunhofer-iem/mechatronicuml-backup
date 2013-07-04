package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class VertexEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public VertexEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addVertexOutgoingTransitionsEditor(null, true);

		addVertexIncomingTransitionsEditor(null, true);

		addVertexAllSuperVerticesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addVertexOutgoingTransitionsEditor(String category,
			boolean front) {
		addEditorToCategory(category, createVertexOutgoingTransitionsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createVertexOutgoingTransitionsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getVertex_OutgoingTransitions());

	}
	/**
	 * @generated
	 */
	protected void addVertexIncomingTransitionsEditor(String category,
			boolean front) {
		addEditorToCategory(category, createVertexIncomingTransitionsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createVertexIncomingTransitionsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getVertex_IncomingTransitions());

	}
	/**
	 * @generated
	 */
	protected void addVertexAllSuperVerticesEditor(String category,
			boolean front) {
		addEditorToCategory(category, createVertexAllSuperVerticesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createVertexAllSuperVerticesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getVertex_AllSuperVertices());

	}

	//
	// Overwritten property settings
	//

}
