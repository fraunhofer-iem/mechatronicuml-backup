package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.Comparables.editor;

/**
 * @generated
 */
public class MumlElemExprEditor
		extends
			de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.Comparables.editor.MapExprEditor {

	/**
	 * @generated
	 */
	public MumlElemExprEditor(String tab,
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

		if (getTab() == null || "property.tab.mtctl".equals(getTab())) {
			addConnectorEndpointInstance_MtctlTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addConnectorEndpointInstance_MtctlTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorEndpointInstance_MtctlTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorEndpointInstance_MtctlTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage.eINSTANCE
				.getMumlElemExpr_ConnectorEndpointInstance();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public MumlElemExprEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage.eINSTANCE
						.getMumlElemExpr());
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
			return new MumlElemExprEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.mtctl",
							"property.tab.mtctl"}).contains(tab);
		}
	}

}
