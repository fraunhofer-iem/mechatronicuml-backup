
package org.muml.core.properties.modelinstance.editor;

/**
 * @generated
 */
public class ModelElementCategoryEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ModelElementCategoryEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorKey_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

		} else if ("General".equals(tab)) { // Tab General

			addPropertyEditor(createEditorKey_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

		} else if ("Docuementation".equals(tab)) { // Tab Documentation

		} else if ("Extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorKey_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorKey_GeneralTab_Editor() {
		if (this.editorKey_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.modelinstance.ModelinstancePackage.eINSTANCE
					.getModelElementCategory_Key();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"The uniquely identifying key of this category. The key of the category may be\nused by editors to register for the model elements contained in this section.");

			this.editorKey_GeneralTab = editor;
		}
		return this.editorKey_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_GeneralTab_Editor() {
		if (this.editorName_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.modelinstance.ModelinstancePackage.eINSTANCE
					.getModelElementCategory_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("A human readable name for this category.");

			this.editorName_GeneralTab = editor;
		}
		return this.editorName_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ModelElementCategoryEditor(String tab) {
		this(tab, org.muml.core.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.core.modelinstance.ModelinstancePackage.eINSTANCE.getModelElementCategory());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ModelElementCategoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"General", "General"}).contains(tab);
		}
	}

}
