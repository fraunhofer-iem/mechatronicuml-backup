package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.Quantifiers.editor;

/**
 * @generated
 */
public class UniversalQuantExprEditor
		extends
			de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.Quantifiers.editor.QuantifierExprEditor {

	/**
	 * @generated
	 */
	public UniversalQuantExprEditor(String tab,
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

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public UniversalQuantExprEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage.eINSTANCE
						.getUniversalQuantExpr());
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
			return new UniversalQuantExprEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{}).contains(
					tab);
		}
	}

}
