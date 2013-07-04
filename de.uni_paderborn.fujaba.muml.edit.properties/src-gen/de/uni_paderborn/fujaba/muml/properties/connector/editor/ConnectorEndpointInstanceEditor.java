package de.uni_paderborn.fujaba.muml.properties.connector.editor;

public class ConnectorEndpointInstanceEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConnectorEndpointInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConnectorEndpointInstanceConnectorInstancesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConnectorEndpointInstanceConnectorInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorEndpointInstanceConnectorInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorEndpointInstanceConnectorInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorEndpointInstance_ConnectorInstances());

	}

	//
	// Overwritten property settings
	//

}
