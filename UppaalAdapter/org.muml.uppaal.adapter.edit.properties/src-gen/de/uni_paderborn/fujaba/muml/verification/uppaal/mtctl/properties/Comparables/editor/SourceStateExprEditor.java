
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.Comparables.editor;

/**
 * @generated
 */
public class SourceStateExprEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public SourceStateExprEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

		} else if ("property.tab.mtctl".equals(tab)) { // Tab Mtctl

		} else {
		}
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SourceStateExprEditor(String tab) {
		this(tab,
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage.eINSTANCE
						.getSourceStateExpr());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new SourceStateExprEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(tab);
		}
	}

}
