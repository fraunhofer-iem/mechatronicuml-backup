package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EReferenceEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EReferenceEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null || "tab.default".equals(getTab())) { // Tab Default

			addPropertyEditor(createName_DefaultTab_Editor(), false);

			addPropertyEditor(createOrdered_DefaultTab_Editor(), false);

			addPropertyEditor(createUnique_DefaultTab_Editor(), false);

			addPropertyEditor(createEType_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					createUpperBound_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					createLowerBound_DefaultTab_Editor(), false);

			addPropertyEditor(createChangeable_DefaultTab_Editor(), false);

			addPropertyEditor(createVolatile_DefaultTab_Editor(), false);

			addPropertyEditor(createTransient_DefaultTab_Editor(), false);

			addPropertyEditor(createDefaultValueLiteral_DefaultTab_Editor(),
					false);

			addPropertyEditor(createUnsettable_DefaultTab_Editor(), false);

			addPropertyEditor(createDerived_DefaultTab_Editor(), false);

			addPropertyEditor(createEOpposite_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createContainment_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createResolveProxies_DefaultTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEKeys_DefaultTab_Editor(), false);

		} else if (tab == null || "tab.documentation".equals(getTab())) { // Tab Documentation

			addPropertyEditor(createEAnnotations_DocumentationTab_Editor(),
					false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if (tab == null || "tab.ocl".equals(getTab())) { // Tab OCL

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorContainment_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createContainment_DefaultTab_Editor() {
		if (this.editorContainment_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEReference_Containment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorContainment_DefaultTab = editor;
		}
		return this.editorContainment_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorResolveProxies_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createResolveProxies_DefaultTab_Editor() {
		if (this.editorResolveProxies_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEReference_ResolveProxies();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorResolveProxies_DefaultTab = editor;
		}
		return this.editorResolveProxies_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEOpposite_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEOpposite_DefaultTab_Editor() {
		if (this.editorEOpposite_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEReference_EOpposite();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorEOpposite_DefaultTab = editor;
		}
		return this.editorEOpposite_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEKeys_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEKeys_DefaultTab_Editor() {
		if (this.editorEKeys_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEReference_EKeys();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorEKeys_DefaultTab = editor;
		}
		return this.editorEKeys_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorChangeable_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createChangeable_DefaultTab_Editor() {
		if (this.editorChangeable_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Changeable();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorChangeable_DefaultTab = editor;
		}
		return this.editorChangeable_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVolatile_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createVolatile_DefaultTab_Editor() {
		if (this.editorVolatile_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Volatile();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorVolatile_DefaultTab = editor;
		}
		return this.editorVolatile_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTransient_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createTransient_DefaultTab_Editor() {
		if (this.editorTransient_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Transient();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorTransient_DefaultTab = editor;
		}
		return this.editorTransient_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDefaultValueLiteral_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createDefaultValueLiteral_DefaultTab_Editor() {
		if (this.editorDefaultValueLiteral_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_DefaultValueLiteral();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
						.createOCLExpression(
								"self.oclIsKindOf(ecore::EAttribute)", feature,
								getEClass());
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

			this.editorDefaultValueLiteral_DefaultTab = editor;
		}
		return this.editorDefaultValueLiteral_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUnsettable_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createUnsettable_DefaultTab_Editor() {
		if (this.editorUnsettable_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Unsettable();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorUnsettable_DefaultTab = editor;
		}
		return this.editorUnsettable_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDerived_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createDerived_DefaultTab_Editor() {
		if (this.editorDerived_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEStructuralFeature_Derived();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorDerived_DefaultTab = editor;
		}
		return this.editorDerived_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOrdered_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createOrdered_DefaultTab_Editor() {
		if (this.editorOrdered_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_Ordered();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorOrdered_DefaultTab = editor;
		}
		return this.editorOrdered_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUnique_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createUnique_DefaultTab_Editor() {
		if (this.editorUnique_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_Unique();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorUnique_DefaultTab = editor;
		}
		return this.editorUnique_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUpperBound_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createUpperBound_DefaultTab_Editor() {
		if (this.editorUpperBound_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_UpperBound();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorUpperBound_DefaultTab = editor;
		}
		return this.editorUpperBound_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLowerBound_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createLowerBound_DefaultTab_Editor() {
		if (this.editorLowerBound_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_LowerBound();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorLowerBound_DefaultTab = editor;
		}
		return this.editorLowerBound_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEType_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEType_DefaultTab_Editor() {
		if (this.editorEType_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getETypedElement_EType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorEType_DefaultTab = editor;
		}
		return this.editorEType_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createName_DefaultTab_Editor() {
		if (this.editorName_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getENamedElement_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorName_DefaultTab = editor;
		}
		return this.editorName_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_DocumentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEAnnotations_DocumentationTab_Editor() {
		if (this.editorEAnnotations_DocumentationTab == null) {
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

			this.editorEAnnotations_DocumentationTab = editor;
		}
		return this.editorEAnnotations_DocumentationTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EReferenceEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEReference());
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
			return new EReferenceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.documentation"})
					.contains(tab);
		}
	}

}
