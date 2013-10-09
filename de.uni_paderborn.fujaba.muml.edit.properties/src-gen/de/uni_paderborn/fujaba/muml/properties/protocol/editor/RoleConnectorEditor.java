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
	public RoleConnectorEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addRoleConnectorCoordinationProtocolEditor(null, true);
		}

		addRoleConnectorConnectorQualityOfServiceAssumptionsEditor(null, false);

	}

	/**
	 * @generated
	 */
	protected void addRoleConnectorCoordinationProtocolEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createRoleConnectorCoordinationProtocolEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRoleConnectorCoordinationProtocolEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getRoleConnector_CoordinationProtocol());

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
	// instantiation
	//

	/**
	 * @generated
	 */
	public RoleConnectorEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getRoleConnector());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new RoleConnectorEditor(tab);
		}
	}

}
