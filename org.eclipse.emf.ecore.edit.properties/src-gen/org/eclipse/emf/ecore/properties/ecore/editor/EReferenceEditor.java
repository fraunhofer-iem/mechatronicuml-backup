package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EReferenceEditor
		extends
			org.eclipse.emf.ecore.properties.ecore.editor.EStructuralFeatureEditor {

	/**
	 * @generated
	 */
	public EReferenceEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEReferenceContainmentEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEReferenceResolveProxiesEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEReferenceEOppositeEditor(null, true);
		}

		if (getTab() == null || "tab.default".equals(getTab())) {
			addEReferenceEKeysEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEReferenceContainmentEditor(String category, boolean front) {
		addEditorToCategory(category, createEReferenceContainmentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEReferenceContainmentEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEReference_Containment());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEReferenceResolveProxiesEditor(String category,
			boolean front) {
		addEditorToCategory(category, createEReferenceResolveProxiesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEReferenceResolveProxiesEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEReference_ResolveProxies());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEReferenceEOppositeEditor(String category, boolean front) {
		addEditorToCategory(category, createEReferenceEOppositeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEReferenceEOppositeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEReference_EOpposite());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEReferenceEKeysEditor(String category, boolean front) {
		addEditorToCategory(category, createEReferenceEKeysEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEReferenceEKeysEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE
						.getEReference_EKeys());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EReferenceEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEReference());
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
			return new EReferenceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default"}).contains(tab);
		}
	}

}
