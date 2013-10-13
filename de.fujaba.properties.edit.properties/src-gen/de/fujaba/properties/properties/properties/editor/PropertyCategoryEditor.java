package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PropertyCategoryEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyCategoryEditor(String tab,
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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyCategoryTitleEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyCategoryVerticalEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyCategoryOpenEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyCategoryPropertiesEditor(
					"de.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPropertyCategoryTitleEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyCategoryTitleEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyCategoryTitleEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyCategory_Title(), false);

	}
	/**
	 * @generated
	 */
	protected void addPropertyCategoryVerticalEditor(String category,
			boolean front) {
		addEditorToCategory(category, createPropertyCategoryVerticalEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyCategoryVerticalEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyCategory_Vertical());

	}
	/**
	 * @generated
	 */
	protected void addPropertyCategoryOpenEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyCategoryOpenEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyCategoryOpenEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyCategory_Open());

	}
	/**
	 * @generated
	 */
	protected void addPropertyCategoryPropertiesEditor(String category,
			boolean front) {
		addEditorToCategory(category, createPropertyCategoryPropertiesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyCategoryPropertiesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyCategory_Properties());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyCategoryEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyCategory());
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
			return new PropertyCategoryEditor(tab);
		}
	}

}
