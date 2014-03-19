package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EFactoryEditor
		extends
			org.eclipse.emf.ecore.properties.ecore.editor.EModelElementEditor {

	/**
	 * @generated
	 */
	public EFactoryEditor(String tab,
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
			addEFactoryEPackage_DefaultTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEFactoryEPackage_DefaultTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEFactoryEPackage_DefaultTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEFactoryEPackage_DefaultTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEFactory_EPackage());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EFactoryEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEFactory());
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
			return new EFactoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.documentation"})
					.contains(tab);
		}
	}

}
