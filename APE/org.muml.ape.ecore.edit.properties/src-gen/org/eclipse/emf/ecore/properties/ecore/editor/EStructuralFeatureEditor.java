
package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public abstract class EStructuralFeatureEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EStructuralFeatureEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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

			addPropertyEditor(createEditorDefaultValueLiteral_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorChangeable_tab_defaultTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorVolatile_tab_defaultTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorTransient_tab_defaultTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUnsettable_tab_defaultTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorDerived_tab_defaultTab_Editor(), false);

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

			addPropertyEditor(createEditorDefaultValueLiteral_tab_defaultTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorChangeable_tab_defaultTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorVolatile_tab_defaultTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorTransient_tab_defaultTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUnsettable_tab_defaultTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorDerived_tab_defaultTab_Editor(), false);

		} else if ("tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorEAnnotations_tab_documentationTab_Editor(), false);

		} else if ("tab.ocl".equals(tab)) { // Tab OCL

		} else if ("tab.filter".equals(tab)) { // Tab Filter

		} else {
		}
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
				editor.setInput(input);
				

				try {
					final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
					org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper
							.createQuery("self.oclIsKindOf(ecore::EAttribute)");

					org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {
						@Override
						public boolean select(Object object) {
							try {
								return object != null && Boolean.TRUE.equals(ocl.evaluate(object, oclExpression));
							} catch (org.eclipse.ocl.pivot.values.InvalidValueException e) {
								return false;
							}
						}
					};
					if (filter != null) {
						editor.addVisibilityFilter(filter);
					}

				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
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

}
