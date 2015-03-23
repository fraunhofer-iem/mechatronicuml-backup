package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EClassEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EClassEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorName_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorAbstract_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorInterface_DefaultTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorESuperTypes_DefaultTab_Editor(), false);

			addPropertyEditor(
					createEditorEAnnotations_DocumentationTab_0_Editor(), false);

			addPropertyEditor(createEditorEAnnotations_FilterTab_1_Editor(),
					false);

			addPropertyEditor(createEditorEAnnotations_FilterTab_2_Editor(),
					false);

			addPropertyEditor(createEditorEAnnotations_FilterTab_3_Editor(),
					false);

			addPropertyEditor(createEditorEAnnotations_FilterTab_4_Editor(),
					false);

			addPropertyEditor(createEditorEAnnotations_FilterTab_5_Editor(),
					false);

		} else if ("tab.default".equals(tab)) { // Tab Default

			addPropertyEditor(createEditorName_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorAbstract_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorInterface_DefaultTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorESuperTypes_DefaultTab_Editor(), false);

		} else if ("tab.documentation".equals(tab)) { // Tab Documentation

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addPropertyEditor(
					createEditorEAnnotations_DocumentationTab_0_Editor(), false);

		} else if ("tab.ocl".equals(tab)) { // Tab OCL

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("tab.filter".equals(tab)) { // Tab Filter

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addPropertyEditor(createEditorEAnnotations_FilterTab_1_Editor(),
					false);

			addPropertyEditor(createEditorEAnnotations_FilterTab_2_Editor(),
					false);

			addPropertyEditor(createEditorEAnnotations_FilterTab_3_Editor(),
					false);

			addPropertyEditor(createEditorEAnnotations_FilterTab_4_Editor(),
					false);

			addPropertyEditor(createEditorEAnnotations_FilterTab_5_Editor(),
					false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAbstract_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAbstract_DefaultTab_Editor() {
		if (this.editorAbstract_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEClass_Abstract();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorAbstract_DefaultTab = editor;
		}
		return this.editorAbstract_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInterface_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInterface_DefaultTab_Editor() {
		if (this.editorInterface_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEClass_Interface();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorInterface_DefaultTab = editor;
		}
		return this.editorInterface_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorESuperTypes_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorESuperTypes_DefaultTab_Editor() {
		if (this.editorESuperTypes_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEClass_ESuperTypes();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorESuperTypes_DefaultTab = editor;
		}
		return this.editorESuperTypes_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_DocumentationTab_0;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_DocumentationTab_0_Editor() {
		if (this.editorEAnnotations_DocumentationTab_0 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.DocumentationAnnotationPropertyEditor(
					adapterFactory, feature);

			this.editorEAnnotations_DocumentationTab_0 = editor;
		}
		return this.editorEAnnotations_DocumentationTab_0;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_FilterTab_1;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_FilterTab_1_Editor() {
		if (this.editorEAnnotations_FilterTab_1 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.OCLFilterFeaturePropertyEditor(
					adapterFactory, feature);

			this.editorEAnnotations_FilterTab_1 = editor;
		}
		return this.editorEAnnotations_FilterTab_1;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_FilterTab_2;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_FilterTab_2_Editor() {
		if (this.editorEAnnotations_FilterTab_2 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.OCLFilterAllowEmptyPropertyEditor(
					adapterFactory, feature);

			this.editorEAnnotations_FilterTab_2 = editor;
		}
		return this.editorEAnnotations_FilterTab_2;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_FilterTab_3;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_FilterTab_3_Editor() {
		if (this.editorEAnnotations_FilterTab_3 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.OCLFilterCustomChoicesPropertyEditor(
					adapterFactory, feature);

			this.editorEAnnotations_FilterTab_3 = editor;
		}
		return this.editorEAnnotations_FilterTab_3;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_FilterTab_4;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_FilterTab_4_Editor() {
		if (this.editorEAnnotations_FilterTab_4 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.OCLFilterChoicesPropertyEditor(
					adapterFactory, feature);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
						.createOCLExpression(
								"not eAnnotations->select(source = 'http://www.muml.org/emf/OCLFilter').details->select(key = 'choices')->isEmpty()",
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

			this.editorEAnnotations_FilterTab_4 = editor;
		}
		return this.editorEAnnotations_FilterTab_4;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_FilterTab_5;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_FilterTab_5_Editor() {
		if (this.editorEAnnotations_FilterTab_5 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.OCLFilterPropertyEditor(
					adapterFactory, feature);

			this.editorEAnnotations_FilterTab_5 = editor;
		}
		return this.editorEAnnotations_FilterTab_5;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_DefaultTab_Editor() {
		if (this.editorName_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getENamedElement_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorName_DefaultTab = editor;
		}
		return this.editorName_DefaultTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EClassEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEClass());
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
			return new EClassEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.default",
							"tab.default", "tab.documentation", "tab.filter",
							"tab.filter", "tab.filter", "tab.filter",
							"tab.filter", "tab.default", "tab.default",
							"tab.default", "tab.documentation"}).contains(tab);
		}
	}

}
