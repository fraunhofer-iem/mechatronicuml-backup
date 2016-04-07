
package org.muml.uppaal.adapter.mtctl.properties.Comparables.editor;

/**
 * @generated
 */
public class ConstExprEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConstExprEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorTimeUnit_MtctlTab_Editor(), false);

		} else if ("property.tab.mtctl".equals(tab)) { // Tab Mtctl

			addPropertyEditor(createEditorTimeUnit_MtctlTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTimeUnit_MtctlTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTimeUnit_MtctlTab_Editor() {
		if (this.editorTimeUnit_MtctlTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage.eINSTANCE
					.getConstExpr_TimeUnit();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorTimeUnit_MtctlTab = editor;
		}
		return this.editorTimeUnit_MtctlTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ConstExprEditor(String tab) {
		this(tab,
				org.muml.uppaal.adapter.mtctl.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage.eINSTANCE
						.getConstExpr());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ConstExprEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.mtctl", "property.tab.mtctl"})
					.contains(tab);
		}
	}

}
