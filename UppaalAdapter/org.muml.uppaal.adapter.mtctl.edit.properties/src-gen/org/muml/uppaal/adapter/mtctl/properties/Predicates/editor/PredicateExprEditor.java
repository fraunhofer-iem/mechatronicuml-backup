
package org.muml.uppaal.adapter.mtctl.properties.Predicates.editor;

/**
 * @generated
 */
public class PredicateExprEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PredicateExprEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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
	public PredicateExprEditor(String tab) {
		this(tab,
				org.muml.uppaal.adapter.mtctl.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage.eINSTANCE
						.getPredicateExpr());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new PredicateExprEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(tab);
		}
	}

}
