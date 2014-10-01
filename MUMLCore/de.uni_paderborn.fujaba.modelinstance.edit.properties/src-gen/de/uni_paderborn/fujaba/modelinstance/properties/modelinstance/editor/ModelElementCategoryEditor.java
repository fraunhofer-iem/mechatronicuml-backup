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
			addModelElements_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addModelElements_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createModelElements_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createModelElements_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.modelinstance.ModelinstancePackage.eINSTANCE
				.getModelElementCategory_ModelElements();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The ModelElements which are contained in this category. All model elements\nmust be of the same type.");

		{
			final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
					.createOCLExpression("isValidEClass(eclass)", feature,
							getEClass());
			final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
					.createQuery(expression);
			query.getEvaluationEnvironment().add("eclass", null);
			de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter filter = new de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter() {

				@Override
				public boolean select(Object object,
						org.eclipse.emf.ecore.EClass eClass) {
					query.getEvaluationEnvironment().replace("eclass", eClass);
					return object == null || Boolean.TRUE.equals(query.evaluate(object));
				}

			};
			if (filter != null) {
				editor.addCreationFilter(filter);
			}
		}

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
