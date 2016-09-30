
package org.muml.psm.properties.codegen.editor;

/**
 * @generated
 */
public class GenPortInstanceEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public GenPortInstanceEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorPortInstance_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorSamplingTime_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorExecCommand_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorPortInstance_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorSamplingTime_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorExecCommand_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPortInstance_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPortInstance_property_tab_psmTab_Editor() {
		if (this.editorPortInstance_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenPortInstance_PortInstance();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorPortInstance_property_tab_psmTab = editor;
		}
		return this.editorPortInstance_property_tab_psmTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSamplingTime_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSamplingTime_property_tab_psmTab_Editor() {
		if (this.editorSamplingTime_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenPortInstance_SamplingTime();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorSamplingTime_property_tab_psmTab = editor;
		}
		return this.editorSamplingTime_property_tab_psmTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExecCommand_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExecCommand_property_tab_psmTab_Editor() {
		if (this.editorExecCommand_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenPortInstance_ExecCommand();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorExecCommand_property_tab_psmTab = editor;
		}
		return this.editorExecCommand_property_tab_psmTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public GenPortInstanceEditor(String tab) {
		this(tab, org.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.psm.codegen.CodegenPackage.eINSTANCE.getGenPortInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new GenPortInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"property.tab.psm", "property.tab.psm", "property.tab.psm"})
					.contains(tab);
		}
	}

}
