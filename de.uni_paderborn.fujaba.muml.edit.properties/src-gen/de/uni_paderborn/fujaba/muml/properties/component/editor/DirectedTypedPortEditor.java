package de.uni_paderborn.fujaba.muml.properties.component.editor;

public class DirectedTypedPortEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DirectedTypedPortEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addDirectedTypedPortKindEditor(null, true);

		addDirectedTypedPortOptionalEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addDirectedTypedPortKindEditor(String category, boolean front) {
		addEditorToCategory(category, createDirectedTypedPortKindEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortKindEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_Kind());

	}
	/**
	 * @generated
	 */
	protected void addDirectedTypedPortOptionalEditor(String category,
			boolean front) {
		addEditorToCategory(category, createDirectedTypedPortOptionalEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortOptionalEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_Optional());

	}

	//
	// Overwritten property settings
	//

}
