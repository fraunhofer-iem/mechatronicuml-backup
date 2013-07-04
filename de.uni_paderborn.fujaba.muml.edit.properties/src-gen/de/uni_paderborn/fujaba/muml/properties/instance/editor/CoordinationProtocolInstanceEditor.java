package de.uni_paderborn.fujaba.muml.properties.instance.editor;

public class CoordinationProtocolInstanceEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CoordinationProtocolInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addCoordinationProtocolInstancePortInstancesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocolInstancePortInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocolInstancePortInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocolInstancePortInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getCoordinationProtocolInstance_PortInstances());

	}

	//
	// Overwritten property settings
	//

}
