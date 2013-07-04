package de.uni_paderborn.fujaba.muml.properties.instance.editor;

public class ComponentInstanceConfigurationEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addComponentInstanceConfigurationComponentInstancesEditor(null, true);

		addComponentInstanceConfigurationPortConnectorInstancesEditor(null,
				true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addComponentInstanceConfigurationComponentInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createComponentInstanceConfigurationComponentInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstanceConfigurationComponentInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstanceConfiguration_ComponentInstances());

	}
	/**
	 * @generated
	 */
	protected void addComponentInstanceConfigurationPortConnectorInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createComponentInstanceConfigurationPortConnectorInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstanceConfigurationPortConnectorInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstanceConfiguration_PortConnectorInstances());

	}

	//
	// Overwritten property settings
	//

}
