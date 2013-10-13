package de.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PropertyEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyEditor(String tab,
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
			addPropertyGenFeatureEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyTabEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyTooltipEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyCategoryEditor(null, true);
		}

		if (getTab() == null
				|| "de.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyReconcileEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPropertyGenFeatureEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyGenFeatureEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGenFeatureEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_GenFeature());

	}
	/**
	 * @generated
	 */
	protected void addPropertyTabEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyTabEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyTabEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_Tab());

	}
	/**
	 * @generated
	 */
	protected void addPropertyTooltipEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyTooltipEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyTooltipEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_Tooltip(), false);

	}
	/**
	 * @generated
	 */
	protected void addPropertyCategoryEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyCategoryEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyCategoryEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_Category());

	}
	/**
	 * @generated
	 */
	protected void addPropertyReconcileEditor(String category, boolean front) {
		addEditorToCategory(category, createPropertyReconcileEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyReconcileEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_Reconcile());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyEditor(String tab) {
		this(tab, de.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.fujaba.properties.PropertiesPackage.eINSTANCE.getProperty());
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
			return new PropertyEditor(tab);
		}
	}

}
