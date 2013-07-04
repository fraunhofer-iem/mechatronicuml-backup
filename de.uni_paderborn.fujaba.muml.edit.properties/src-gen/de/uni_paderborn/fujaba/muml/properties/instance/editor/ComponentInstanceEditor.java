package de.uni_paderborn.fujaba.muml.properties.instance.editor;

public class ComponentInstanceEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ComponentInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addComponentInstancePortInstancesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addComponentInstancePortInstancesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createComponentInstancePortInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstancePortInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstance_PortInstances());

	}

	//
	// Overwritten property settings
	//

}
