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
			addCoordinationProtocol_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConnectorQualityOfServiceAssumptions_GeneralTab_Editor(null,
					false);
		}

	}

	/**
	 * @generated
	 */
	protected void addCoordinationProtocol_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCoordinationProtocol_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCoordinationProtocol_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getRoleConnector_CoordinationProtocol();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The coordination protocol this role connector is part of.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addConnectorQualityOfServiceAssumptions_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorQualityOfServiceAssumptions_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorQualityOfServiceAssumptions_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getRoleConnector_ConnectorQualityOfServiceAssumptions();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("A role connector has exactly one reference for defining its quality of service assumptions like message delay and message loss.");

		return editor;

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
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new RoleConnectorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
