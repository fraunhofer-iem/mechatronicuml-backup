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
		if (tab == null) {

			addPropertyEditor(createEditorName_DefaultTab_Editor(), false);

			addPropertyEditor(createEditorEType_DefaultTab_Editor(), false);

			addPropertyEditor(
					createEditorDefaultValueLiteral_DefaultTab_Editor(), false);

			addPropertyEditor(createEditorEOpposite_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					createEditorLowerBound_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					createEditorUpperBound_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorChangeable_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorContainment_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorResolveProxies_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorVolatile_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorTransient_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorUnsettable_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorDerived_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorOrdered_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorUnique_DefaultTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorEKeys_DefaultTab_Editor(), false);

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

		} else if ("tab.default".equals(tab)) { // Tab Default

			addPropertyEditor(createEditorName_DefaultTab_Editor(), false);

			addPropertyEditor(createEditorEType_DefaultTab_Editor(), false);

			addPropertyEditor(
					createEditorDefaultValueLiteral_DefaultTab_Editor(), false);

			addPropertyEditor(createEditorEOpposite_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					createEditorLowerBound_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					createEditorUpperBound_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorChangeable_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorContainment_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorResolveProxies_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorVolatile_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorTransient_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorUnsettable_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorDerived_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorOrdered_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorUnique_DefaultTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorEKeys_DefaultTab_Editor(), false);

		} else if ("tab.documentation".equals(tab)) { // Tab Documentation

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addPropertyEditor(
					createEditorEAnnotations_DocumentationTab_0_Editor(), false);

		} else if ("tab.ocl".equals(tab)) { // Tab OCL

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("tab.filter".equals(tab)) { // Tab Filter

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

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

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEOpposite_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEOpposite_DefaultTab_Editor() {
		if (this.editorEOpposite_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEReference_EOpposite();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorEOpposite_DefaultTab = editor;
		}
		return this.editorEOpposite_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorContainment_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorContainment_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorResolveProxies_DefaultTab_Editor() {
		if (this.editorResolveProxies_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEReference_ResolveProxies();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorResolveProxies_DefaultTab = editor;
		}
		return this.editorResolveProxies_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEKeys_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEKeys_DefaultTab_Editor() {
		if (this.editorEKeys_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEReference_EKeys();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorEKeys_DefaultTab = editor;
		}
		return this.editorEKeys_DefaultTab;
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
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.OCLFilterAllowEmptyPropertyEditor(
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
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.OCLFilterCustomChoicesPropertyEditor(
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

			this.editorEAnnotations_FilterTab_3 = editor;
		}
		return this.editorEAnnotations_FilterTab_3;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEAnnotations_FilterTab_4;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEAnnotations_FilterTab_4_Editor() {
		if (this.editorEAnnotations_FilterTab_4 == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEModelElement_EAnnotations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.eclipse.emf.ecore.properties.ecore.editor.OCLFilterPropertyEditor(
					adapterFactory, feature);

			this.editorEAnnotations_FilterTab_4 = editor;
		}
		return this.editorEAnnotations_FilterTab_4;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorChangeable_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorChangeable_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVolatile_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTransient_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDefaultValueLiteral_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUnsettable_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDerived_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOrdered_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUnique_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUpperBound_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLowerBound_DefaultTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEType_DefaultTab_Editor() {
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
							"tab.default", "tab.default", "tab.documentation",
							"tab.filter", "tab.filter", "tab.filter",
							"tab.filter", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.default", "tab.default",
							"tab.default", "tab.documentation"}).contains(tab);
		}
	}

}
