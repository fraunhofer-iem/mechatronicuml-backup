package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PropertyGeneratorEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyGeneratorEditor(String tab,
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

			addPropertyEditor(createEditorReconciler_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorGenModel_GeneralTab_Editor(), false);

			addPropertyEditor(
					createEditorReferencedGenerators_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorPlugin_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorDefaultTab_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorContributorId_GeneralTab_Editor(),
					false);

			addPropertyEditor(createEditorSourceFolder_GeneralTab_Editor(),
					false);

		} else if ("de.uni_paderborn.fujaba.properties.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorReconciler_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorGenModel_GeneralTab_Editor(), false);

			addPropertyEditor(
					createEditorReferencedGenerators_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorPlugin_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorDefaultTab_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorContributorId_GeneralTab_Editor(),
					false);

			addPropertyEditor(createEditorSourceFolder_GeneralTab_Editor(),
					false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconciler_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconciler_GeneralTab_Editor() {
		if (this.editorReconciler_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_Reconciler();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			this.editorReconciler_GeneralTab = editor;
		}
		return this.editorReconciler_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGenModel_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorGenModel_GeneralTab_Editor() {
		if (this.editorGenModel_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_GenModel();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorGenModel_GeneralTab = editor;
		}
		return this.editorGenModel_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReferencedGenerators_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReferencedGenerators_GeneralTab_Editor() {
		if (this.editorReferencedGenerators_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_ReferencedGenerators();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorReferencedGenerators_GeneralTab = editor;
		}
		return this.editorReferencedGenerators_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPlugin_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPlugin_GeneralTab_Editor() {
		if (this.editorPlugin_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_Plugin();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			this.editorPlugin_GeneralTab = editor;
		}
		return this.editorPlugin_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDefaultTab_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDefaultTab_GeneralTab_Editor() {
		if (this.editorDefaultTab_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_DefaultTab();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorDefaultTab_GeneralTab = editor;
		}
		return this.editorDefaultTab_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorContributorId_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorContributorId_GeneralTab_Editor() {
		if (this.editorContributorId_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_ContributorId();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorContributorId_GeneralTab = editor;
		}
		return this.editorContributorId_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSourceFolder_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSourceFolder_GeneralTab_Editor() {
		if (this.editorSourceFolder_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getPropertyGenerator_SourceFolder();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorSourceFolder_GeneralTab = editor;
		}
		return this.editorSourceFolder_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyGeneratorEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getPropertyGenerator());
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
			return new PropertyGeneratorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general",
							"de.uni_paderborn.fujaba.properties.tab.general"})
					.contains(tab);
		}
	}

}
