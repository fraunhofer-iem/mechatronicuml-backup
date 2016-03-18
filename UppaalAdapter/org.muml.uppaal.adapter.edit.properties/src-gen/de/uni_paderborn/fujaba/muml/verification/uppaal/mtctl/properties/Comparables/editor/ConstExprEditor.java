
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.Comparables.editor;

/**
 * @generated
 */
public class ConstExprEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTimeUnit_MtctlTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTimeUnit_MtctlTab_Editor() {
		if (this.editorTimeUnit_MtctlTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage.eINSTANCE
					.getConstExpr_TimeUnit();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
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
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage.eINSTANCE
						.getConstExpr());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ConstExprEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.mtctl", "property.tab.mtctl"})
					.contains(tab);
		}
	}

}
