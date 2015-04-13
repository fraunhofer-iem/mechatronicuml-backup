package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.Comparables.editor;

/**
 * @generated
 */
public class MumlElemExprEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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
		if (tab == null) {

			addPropertyEditor(createInstance_MtctlTab_Editor(), false);

		} else if ("property.tab.mtctl".equals(tab)) { // Tab Mtctl

			addPropertyEditor(createInstance_MtctlTab_Editor(), false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInstance_MtctlTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createInstance_MtctlTab_Editor() {
		if (this.editorInstance_MtctlTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage.eINSTANCE
					.getMumlElemExpr_Instance();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The concrete instance which this Muml element belongs to (in case there are multiple at runtime). E.g., a ConnectorEndpointInstance for Role RTSC elements");

			this.editorInstance_MtctlTab = editor;
		}
		return this.editorInstance_MtctlTab;
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
