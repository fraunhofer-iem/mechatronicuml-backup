
package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EAttributeEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EAttributeEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorEAnnotations_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorName_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorOrdered_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorUnique_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorEType_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Cardinality", "Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Cardinality", createEditorLowerBound_tab_defaultTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Cardinality", createEditorUpperBound_tab_defaultTab_Editor(),
					false);

			addPropertyEditor(createEditorChangeable_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorVolatile_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorTransient_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorDefaultValueLiteral_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorUnsettable_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorDerived_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorID_tab_defaultTab_Editor(), false);

		} else if ("tab.default".equals(tab)) { // Tab Default

			addPropertyEditor(createEditorName_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorOrdered_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorUnique_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorEType_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Cardinality", "Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Cardinality", createEditorLowerBound_tab_defaultTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Cardinality", createEditorUpperBound_tab_defaultTab_Editor(),
					false);

			addPropertyEditor(createEditorChangeable_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorVolatile_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorTransient_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorDefaultValueLiteral_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorUnsettable_tab_defaultTab_Editor(), false);

			addPropertyEditor(createEditorDerived_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorID_tab_defaultTab_Editor(), false);

		} else if ("tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorEAnnotations_tab_documentationTab_Editor(), false);

		} else if ("tab.ocl".equals(tab)) { // Tab OCL

		} else if ("tab.filter".equals(tab)) { // Tab Filter

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorID_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorID_tab_defaultTab_Editor() {
		if (this.editorID_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEAttribute_ID();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorID_tab_defaultTab = editor;
		}
		return this.editorID_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorChangeable_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorChangeable_tab_defaultTab_Editor() {
		if (this.editorChangeable_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Changeable();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorChangeable_tab_defaultTab = editor;
		}
		return this.editorChangeable_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVolatile_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVolatile_tab_defaultTab_Editor() {
		if (this.editorVolatile_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Volatile();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorVolatile_tab_defaultTab = editor;
		}
		return this.editorVolatile_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTransient_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTransient_tab_defaultTab_Editor() {
		if (this.editorTransient_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Transient();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorTransient_tab_defaultTab = editor;
		}
		return this.editorTransient_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDefaultValueLiteral_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDefaultValueLiteral_tab_defaultTab_Editor() {
		if (this.editorDefaultValueLiteral_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_DefaultValueLiteral();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression("self.oclIsKindOf(ecore::EAttribute)", feature, getEClass());
				editor.setInput(input);
				editor.registerOCLAdapter(new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

					@Override
					public boolean select(Object object) {
						return object != null && Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null && expression != null) {
					editor.addVisibilityFilter(filter);
				}
			}

			this.editorDefaultValueLiteral_tab_defaultTab = editor;
		}
		return this.editorDefaultValueLiteral_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUnsettable_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUnsettable_tab_defaultTab_Editor() {
		if (this.editorUnsettable_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Unsettable();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorUnsettable_tab_defaultTab = editor;
		}
		return this.editorUnsettable_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDerived_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDerived_tab_defaultTab_Editor() {
		if (this.editorDerived_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Derived();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorDerived_tab_defaultTab = editor;
		}
		return this.editorDerived_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOrdered_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOrdered_tab_defaultTab_Editor() {
		if (this.editorOrdered_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_Ordered();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorOrdered_tab_defaultTab = editor;
		}
		return this.editorOrdered_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUnique_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUnique_tab_defaultTab_Editor() {
		if (this.editorUnique_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_Unique();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorUnique_tab_defaultTab = editor;
		}
		return this.editorUnique_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUpperBound_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUpperBound_tab_defaultTab_Editor() {
		if (this.editorUpperBound_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_UpperBound();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorUpperBound_tab_defaultTab = editor;
		}
		return this.editorUpperBound_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLowerBound_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLowerBound_tab_defaultTab_Editor() {
		if (this.editorLowerBound_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_LowerBound();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorLowerBound_tab_defaultTab = editor;
		}
		return this.editorLowerBound_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEType_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEType_tab_defaultTab_Editor() {
		if (this.editorEType_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_EType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorEType_tab_defaultTab = editor;
		}
		return this.editorEType_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_tab_defaultTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_tab_defaultTab_Editor() {
		if (this.editorName_tab_defaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getENamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorName_tab_defaultTab = editor;
		}
		return this.editorName_tab_defaultTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_tab_documentationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_tab_documentationTab_Editor() {
		if (this.editorEAnnotations_tab_documentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.DocumentationAnnotationPropertyEditor(
					adapterFactory, feature);

			this.editorEAnnotations_tab_documentationTab = editor;
		}
		return this.editorEAnnotations_tab_documentationTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EAttributeEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEAttribute());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new EAttributeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"tab.default", "tab.default", "tab.default",
					"tab.default", "tab.default", "tab.default", "tab.default", "tab.default", "tab.default",
					"tab.default", "tab.default", "tab.default", "tab.default", "tab.documentation"}).contains(tab);
		}
	}

}
