package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public abstract class ETypedElementEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ETypedElementEditor(String tab,
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

			addPropertyEditor(createEType_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createOrdered_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createUnique_DefaultTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					createUpperBound_DefaultTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					createLowerBound_DefaultTab_Editor(), false);

		} else if (tab == null || "tab.documentation".equals(getTab())) { // Tab Documentation

			addPropertyEditor(createEAnnotations_DocumentationTab_Editor(),
					false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if (tab == null || "tab.ocl".equals(getTab())) { // Tab OCL

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Cardinality",
					"Cardinality", org.eclipse.swt.SWT.HORIZONTAL, true);

		}

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

}
