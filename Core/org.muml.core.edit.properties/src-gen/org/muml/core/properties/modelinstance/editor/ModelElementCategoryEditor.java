
package org.muml.core.properties.modelinstance.editor;

/**
 * @generated
 */
public class ModelElementCategoryEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ModelElementCategoryEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorModelElements_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorModelElements_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorModelElements_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorModelElements_property_tab_generalTab_Editor() {
		if (this.editorModelElements_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.modelinstance.ModelinstancePackage.eINSTANCE
					.getModelElementCategory_ModelElements();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The ModelElements which are contained in this category. All model elements\nmust be of the same type.");

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression("isValidEClass(eclass)", feature, getEClass());
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				query.getEvaluationEnvironment().add("eclass", null);
				org.muml.ape.runtime.filter.ICreationFilter filter = new org.muml.ape.runtime.filter.ICreationFilter() {

					@Override
					public boolean select(Object object, org.eclipse.emf.ecore.EClass eClass) {
						query.getEvaluationEnvironment().replace("eclass", eClass);
						return Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null) {
					editor.addCreationFilter(filter);
				}
			}

			this.editorModelElements_property_tab_generalTab = editor;
		}
		return this.editorModelElements_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ModelElementCategoryEditor(String tab) {
		this(tab, org.muml.core.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.core.modelinstance.ModelinstancePackage.eINSTANCE.getModelElementCategory());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ModelElementCategoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general"}).contains(tab);
		}
	}

}
