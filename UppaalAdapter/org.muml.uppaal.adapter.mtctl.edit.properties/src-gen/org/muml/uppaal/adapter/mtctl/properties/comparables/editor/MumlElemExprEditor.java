
package org.muml.uppaal.adapter.mtctl.properties.comparables.editor;

/**
 * @generated
 */
public class MumlElemExprEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public MumlElemExprEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorInstance_property_tab_mtctlTab_Editor(), false);

		} else if ("property.tab.mtctl".equals(tab)) { // Tab Mtctl

			addPropertyEditor(createEditorInstance_property_tab_mtctlTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInstance_property_tab_mtctlTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInstance_property_tab_mtctlTab_Editor() {
		if (this.editorInstance_property_tab_mtctlTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage.eINSTANCE
					.getMumlElemExpr_Instance();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The concrete instance which this Muml element belongs to (in case there are multiple at runtime). E.g., a ConnectorEndpointInstance for Role RTSC elements");

			this.editorInstance_property_tab_mtctlTab = editor;
		}
		return this.editorInstance_property_tab_mtctlTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public MumlElemExprEditor(String tab) {
		this(tab, org.muml.uppaal.adapter.mtctl.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage.eINSTANCE.getMumlElemExpr());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new MumlElemExprEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.mtctl", "property.tab.mtctl"})
					.contains(tab);
		}
	}

}
