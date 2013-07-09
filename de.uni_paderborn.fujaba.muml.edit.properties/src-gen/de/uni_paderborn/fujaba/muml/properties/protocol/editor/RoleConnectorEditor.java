package de.uni_paderborn.fujaba.muml.properties.protocol.editor;

/**
 * @generated
 */
public class RoleConnectorEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.ConnectorEditor {

	/**
	 * @generated
	 */
	public RoleConnectorEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRoleConnectorConnectorQualityOfServiceAssumptionsEditor(null, false);

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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getRoleConnector_ConnectorQualityOfServiceAssumptions());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new RoleConnectorEditor();
		}
	}

}
