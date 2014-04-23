package de.uni_paderborn.fujaba.modelinstance.properties.modelinstance.editor;

/**
 * @generated
 */
public class ModelElementCategoryEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ModelElementCategoryEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addModelElementCategoryModelElements_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addModelElementCategoryModelElements_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createModelElementCategoryModelElements_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createModelElementCategoryModelElements_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
						.getModelElementCategory_ModelElements());

		editor.setTooltipMessage("The ModelElements which are contained in this category. All model elements\nmust be of the same type.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ModelElementCategoryEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.modelinstance.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
						.getModelElementCategory());
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
			return new ModelElementCategoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general"}).contains(
					tab);
		}
	}

}
