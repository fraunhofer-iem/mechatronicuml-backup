package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class ReconcilerEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconcilerEditor(String tab,
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

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addReconcilerEnabledEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addReconcilerReconcilePackagesEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addReconcilerReconcileClassesEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addReconcilerReconcilePropertiesEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addReconcilerEnabledEditor(String category, boolean front) {
		addEditorToCategory(category, createReconcilerEnabledEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createReconcilerEnabledEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getReconciler_Enabled());

	}
	/**
	 * @generated
	 */
	protected void addReconcilerReconcilePackagesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createReconcilerReconcilePackagesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createReconcilerReconcilePackagesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getReconciler_ReconcilePackages());

	}
	/**
	 * @generated
	 */
	protected void addReconcilerReconcileClassesEditor(String category,
			boolean front) {
		addEditorToCategory(category, createReconcilerReconcileClassesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createReconcilerReconcileClassesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getReconciler_ReconcileClasses());

	}
	/**
	 * @generated
	 */
	protected void addReconcilerReconcilePropertiesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createReconcilerReconcilePropertiesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createReconcilerReconcilePropertiesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getReconciler_ReconcileProperties());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconcilerEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getReconciler());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new ReconcilerEditor(tab);
		}
	}

}
