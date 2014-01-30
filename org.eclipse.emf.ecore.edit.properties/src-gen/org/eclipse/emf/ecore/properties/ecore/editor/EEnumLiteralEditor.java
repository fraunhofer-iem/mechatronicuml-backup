package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EEnumLiteralEditor
		extends
			org.eclipse.emf.ecore.properties.ecore.editor.ENamedElementEditor {

	/**
	 * @generated
	 */
	public EEnumLiteralEditor(String tab,
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

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEEnumLiteralValueEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEEnumLiteralLiteralEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEEnumLiteralValueEditor(String category, boolean front) {
		addEditorToCategory(category, createEEnumLiteralValueEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEEnumLiteralValueEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEEnumLiteral_Value(), 0);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEEnumLiteralLiteralEditor(String category, boolean front) {
		addEditorToCategory(category, createEEnumLiteralLiteralEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEEnumLiteralLiteralEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEEnumLiteral_Literal(), false);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EEnumLiteralEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEEnumLiteral());
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
			return new EEnumLiteralEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.default",
							"tab.default"}).contains(tab);
		}
	}

}
