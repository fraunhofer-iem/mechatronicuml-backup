package de.uni_paderborn.fujaba.properties.properties.properties.editor;

/**
 * @generated
 */
public class PropertyEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null
				|| "de.uni_paderborn.fujaba.properties.tab.general"
						.equals(getTab())) { // Tab General

			addPropertyEditor(createGenFeature_GeneralTab_Editor(), false);

			addPropertyEditor(createTab_GeneralTab_Editor(), false);

			addPropertyEditor(createTooltip_GeneralTab_Editor(), false);

			addPropertyEditor(createReconcile_GeneralTab_Editor(), false);

			addPropertyEditor(
					createInitializeOCLExpression_GeneralTab_Editor(), false);

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGenFeature_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createGenFeature_GeneralTab_Editor() {
		if (this.editorGenFeature_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getProperty_GenFeature();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorGenFeature_GeneralTab = editor;
		}
		return this.editorGenFeature_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTab_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createTab_GeneralTab_Editor() {
		if (this.editorTab_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getProperty_Tab();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorTab_GeneralTab = editor;
		}
		return this.editorTab_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTooltip_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createTooltip_GeneralTab_Editor() {
		if (this.editorTooltip_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getProperty_Tooltip();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorTooltip_GeneralTab = editor;
		}
		return this.editorTooltip_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconcile_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createReconcile_GeneralTab_Editor() {
		if (this.editorReconcile_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getProperty_Reconcile();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorReconcile_GeneralTab = editor;
		}
		return this.editorReconcile_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInitializeOCLExpression_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createInitializeOCLExpression_GeneralTab_Editor() {
		if (this.editorInitializeOCLExpression_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
					.getProperty_InitializeOCLExpression();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			this.editorInitializeOCLExpression_GeneralTab = editor;
		}
		return this.editorInitializeOCLExpression_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.properties.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.properties.PropertiesPackage.eINSTANCE
						.getProperty());
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
			return new PropertyEditor(tab);
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
