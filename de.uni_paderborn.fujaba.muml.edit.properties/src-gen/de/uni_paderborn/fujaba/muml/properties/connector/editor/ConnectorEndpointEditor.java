package de.uni_paderborn.fujaba.muml.properties.connector.editor;

public class ConnectorEndpointEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConnectorEndpointEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConnectorEndpointConnectorsEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConnectorEndpointConnectorsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConnectorEndpointConnectorsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorEndpointConnectorsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorEndpoint_Connectors());

	}

	//
	// Overwritten property settings
	//

}
