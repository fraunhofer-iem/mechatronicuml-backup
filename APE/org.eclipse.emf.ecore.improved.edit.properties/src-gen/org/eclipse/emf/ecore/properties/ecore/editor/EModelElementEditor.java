package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public abstract class EModelElementEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EModelElementEditor(String tab,
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

		if (getTab() == null || "tab.documentation".equals(getTab())) {
			addEAnnotations_DocumentationTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addEAnnotations_DocumentationTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEAnnotations_DocumentationTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEAnnotations_DocumentationTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
				.getEModelElement_EAnnotations();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.EcoreDocumentationPropertyEditor(
				adapterFactory, feature);

		{
			final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
					.createOCLExpression(
							"true or not eAnnotations->select(source = 'http://www.eclipse.org/emf/2002/GenModel')->isEmpty()",
							feature, getEClass());
			editor.registerOCLAdapter(expression,
					new org.eclipse.emf.common.notify.impl.AdapterImpl() {
						@Override
						public void notifyChanged(
								org.eclipse.emf.common.notify.Notification notification) {
							editor.updateVisibility(true, true);
						}
					});
			final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
					.createQuery(expression);
			org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

				@Override
				public boolean select(Object object) {
					return object != null
							&& Boolean.TRUE.equals(query.evaluate(object));
				}

			};
			if (filter != null) {
				editor.addVisibilityFilter(filter);
			}
		}

		return editor;

	}

}
