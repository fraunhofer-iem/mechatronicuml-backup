package org.eclipse.emf.ecore.properties.ecore.editor;

/**
 * @generated
 */
public class EGenericTypeEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public EGenericTypeEditor(String tab,
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

			addPropertyEditor(createEditorETypeParameter_DefaultTab_Editor(),
					false);

			addPropertyEditor(createEditorEClassifier_DefaultTab_Editor(),
					false);

		} else if ("tab.default".equals(tab)) { // Tab Default

			addPropertyEditor(createEditorETypeParameter_DefaultTab_Editor(),
					false);

			addPropertyEditor(createEditorEClassifier_DefaultTab_Editor(),
					false);

		} else if ("tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("tab.ocl".equals(tab)) { // Tab OCL

		} else if ("tab.filter".equals(tab)) { // Tab Filter

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorETypeParameter_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorETypeParameter_DefaultTab_Editor() {
		if (this.editorETypeParameter_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEGenericType_ETypeParameter();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorETypeParameter_DefaultTab = editor;
		}
		return this.editorETypeParameter_DefaultTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEClassifier_DefaultTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEClassifier_DefaultTab_Editor() {
		if (this.editorEClassifier_DefaultTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.eclipse.emf.ecore.EcorePackage.eINSTANCE
					.getEGenericType_EClassifier();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorEClassifier_DefaultTab = editor;
		}
		return this.editorEClassifier_DefaultTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public EGenericTypeEditor(String tab) {
		this(tab, org.eclipse.emf.ecore.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEGenericType());
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
			return new EGenericTypeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"tab.default", "tab.default"})
					.contains(tab);
		}
	}

}
