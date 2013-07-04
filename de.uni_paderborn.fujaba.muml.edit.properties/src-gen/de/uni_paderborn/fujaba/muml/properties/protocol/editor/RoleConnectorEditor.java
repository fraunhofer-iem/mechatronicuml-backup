package de.uni_paderborn.fujaba.muml.properties.protocol.editor;

public class RoleConnectorEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RoleConnectorEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRoleConnectorConnectorQualityOfServiceAssumptionsEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addRoleConnectorConnectorQualityOfServiceAssumptionsEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createRoleConnectorConnectorQualityOfServiceAssumptionsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRoleConnectorConnectorQualityOfServiceAssumptionsEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getRoleConnector_ConnectorQualityOfServiceAssumptions());

	}

	//
	// Overwritten property settings
	//

}
