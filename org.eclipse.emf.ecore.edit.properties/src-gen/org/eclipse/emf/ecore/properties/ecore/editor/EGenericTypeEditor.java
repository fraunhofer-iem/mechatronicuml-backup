package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EGenericTypeEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EGenericTypeEditor(String tab,
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
			addEGenericTypeETypeParameterEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEGenericTypeEClassifierEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEGenericTypeETypeParameterEditor(String category,
			boolean front) {
		addEditorToCategory(category, createEGenericTypeETypeParameterEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEGenericTypeETypeParameterEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEGenericType_ETypeParameter());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEGenericTypeEClassifierEditor(String category,
			boolean front) {
		addEditorToCategory(category, createEGenericTypeEClassifierEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEGenericTypeEClassifierEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEGenericType_EClassifier());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EGenericTypeEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEGenericType());
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
			return new EGenericTypeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.default"})
					.contains(tab);
		}
	}

}
