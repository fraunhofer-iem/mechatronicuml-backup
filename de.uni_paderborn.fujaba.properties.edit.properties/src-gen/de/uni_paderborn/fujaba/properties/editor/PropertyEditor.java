package de.uni_paderborn.fujaba.properties.editor;

/**
 * @generated
 */
public class PropertyEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyGenFeatureEditor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyTabEditor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyTooltipEditor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyCategoryEditor(null, true);
		}

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general".equals(getTab())) {
			addPropertyReconcileEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans", true);
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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyGenFeatureEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_GenFeature());

		return editor;

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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyTabEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_Tab());

		return editor;

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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyTooltipEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_Tooltip(), false);

		return editor;

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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyCategoryEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_Category());

		return editor;

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
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyReconcileEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty_Reconcile());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE.getProperty());
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
			return new PropertyEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general"}).contains(tab);
		}
	}

}
