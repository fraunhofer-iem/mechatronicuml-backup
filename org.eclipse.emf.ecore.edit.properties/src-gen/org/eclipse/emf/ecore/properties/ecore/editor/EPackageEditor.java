package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EPackageEditor
		extends
			org.eclipse.emf.ecore.properties.ecore.editor.ENamedElementEditor {

	/**
	 * @generated
	 */
	public EPackageEditor(String tab,
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
			addEPackageNsURIEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEPackageNsPrefixEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEPackageEFactoryInstanceEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEPackageNsURIEditor(String category, boolean front) {
		addEditorToCategory(category, createEPackageNsURIEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEPackageNsURIEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEPackage_NsURI(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEPackageNsPrefixEditor(String category, boolean front) {
		addEditorToCategory(category, createEPackageNsPrefixEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEPackageNsPrefixEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEPackage_NsPrefix(), false);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEPackageEFactoryInstanceEditor(String category,
			boolean front) {
		addEditorToCategory(category, createEPackageEFactoryInstanceEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEPackageEFactoryInstanceEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEPackage_EFactoryInstance());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EPackageEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEPackage());
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
			return new EPackageEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.default",
							"tab.default", "tab.default"}).contains(tab);
		}
	}

}
