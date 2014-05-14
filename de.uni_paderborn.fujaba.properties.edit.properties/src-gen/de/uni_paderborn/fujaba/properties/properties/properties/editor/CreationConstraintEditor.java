package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class CreationConstraintEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CreationConstraintEditor(String tab,
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

		if (getTab() == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) {
			addCreationConstraintFilters_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCreationConstraintFilters_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCreationConstraintFilters_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCreationConstraintFilters_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getCreationConstraint_Filters());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CreationConstraintEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getCreationConstraint());
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
			return new CreationConstraintEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
