
package org.muml.ape.properties.ape.editor;

/**
 * @generated
 */
public class PropertyEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorGenFeature_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTab_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTooltip_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorReconcile_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorInitializeOCLExpression_org_muml_ape_tab_generalTab_Editor(), false);

		} else if ("org.muml.ape.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorGenFeature_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTab_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTooltip_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorReconcile_org_muml_ape_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorInitializeOCLExpression_org_muml_ape_tab_generalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGenFeature_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorGenFeature_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorGenFeature_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getProperty_GenFeature();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorGenFeature_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorGenFeature_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTab_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTab_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorTab_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getProperty_Tab();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorTab_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorTab_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTooltip_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTooltip_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorTooltip_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getProperty_Tooltip();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorTooltip_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorTooltip_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconcile_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconcile_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorReconcile_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getProperty_Reconcile();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorReconcile_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorReconcile_org_muml_ape_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInitializeOCLExpression_org_muml_ape_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInitializeOCLExpression_org_muml_ape_tab_generalTab_Editor() {
		if (this.editorInitializeOCLExpression_org_muml_ape_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.ape.PropertiesPackage.eINSTANCE
					.getProperty_InitializeOCLExpression();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OCLPropertyEditor(
					adapterFactory, feature);

			{
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

				try {
					final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
					org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper
							.createQuery("self.genFeature.ecoreFeature.oclIsKindOf(ecore::EAttribute)");

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

			this.editorInitializeOCLExpression_org_muml_ape_tab_generalTab = editor;
		}
		return this.editorInitializeOCLExpression_org_muml_ape_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyEditor(String tab) {
		this(tab, org.muml.ape.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.ape.PropertiesPackage.eINSTANCE.getProperty());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new PropertyEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.ape.tab.general",
					"org.muml.ape.tab.general", "org.muml.ape.tab.general", "org.muml.ape.tab.general",
					"org.muml.ape.tab.general", "org.muml.ape.tab.general", "org.muml.ape.tab.general"}).contains(tab);
		}
	}

}
