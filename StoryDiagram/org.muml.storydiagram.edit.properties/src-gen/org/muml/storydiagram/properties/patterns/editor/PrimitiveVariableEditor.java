
package org.muml.storydiagram.properties.patterns.editor;

/**
 * @generated
 */
public class PrimitiveVariableEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PrimitiveVariableEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorBindingState_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorIncomingLink_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorClassifier_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorBindingState_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorIncomingLink_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorClassifier_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClassifier_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorClassifier_property_tab_generalTab_Editor() {
		if (this.editorClassifier_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getPrimitiveVariable_Classifier();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The type of the primitive variable which must be an EDataType.");

			this.editorClassifier_property_tab_generalTab = editor;
		}
		return this.editorClassifier_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingState_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingState_property_tab_generalTab_Editor() {
		if (this.editorBindingState_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractVariable_BindingState();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The binding state defines whether the variable is already bound or whether a match has to be obtained for it. The default value is \"unbound\".");

			this.editorBindingState_property_tab_generalTab = editor;
		}
		return this.editorBindingState_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingLink_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncomingLink_property_tab_generalTab_Editor() {
		if (this.editorIncomingLink_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractVariable_IncomingLink();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorIncomingLink_property_tab_generalTab = editor;
		}
		return this.editorIncomingLink_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PrimitiveVariableEditor(String tab) {
		this(tab, org.muml.storydiagram.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE.getPrimitiveVariable());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new PrimitiveVariableEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general", "property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
