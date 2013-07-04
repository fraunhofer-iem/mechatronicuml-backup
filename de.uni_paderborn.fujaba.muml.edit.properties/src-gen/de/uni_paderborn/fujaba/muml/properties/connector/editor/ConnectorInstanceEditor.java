package de.uni_paderborn.fujaba.muml.properties.connector.editor;

public class ConnectorInstanceEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConnectorInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConnectorInstanceConnectorEndpointInstancesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConnectorInstanceConnectorEndpointInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorInstanceConnectorEndpointInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorInstanceConnectorEndpointInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorInstance_ConnectorEndpointInstances());

	}

	//
	// Overwritten property settings
	//

}
