package de.uni_paderborn.fujaba.muml.properties.component.editor;

public class ComponentEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ComponentEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addComponentPortsEditor(null, true);

		addComponentComponentTypeEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addComponentPortsEditor(String category, boolean front) {
		addEditorToCategory(category, createComponentPortsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentPortsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponent_Ports());

	}
	/**
	 * @generated
	 */
	protected void addComponentComponentTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category, createComponentComponentTypeEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentComponentTypeEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponent_ComponentType());

	}

	//
	// Overwritten property settings
	//

}
