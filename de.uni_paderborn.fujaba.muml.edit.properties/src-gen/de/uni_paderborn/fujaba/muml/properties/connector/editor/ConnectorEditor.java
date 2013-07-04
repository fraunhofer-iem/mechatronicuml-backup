package de.uni_paderborn.fujaba.muml.properties.connector.editor;

public class ConnectorEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConnectorEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConnectorConnectorEndpointsEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConnectorConnectorEndpointsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConnectorConnectorEndpointsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorConnectorEndpointsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnector_ConnectorEndpoints());

	}

	//
	// Overwritten property settings
	//

}
