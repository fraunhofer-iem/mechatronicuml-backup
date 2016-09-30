
package org.muml.psm.properties.codegen.editor;

/**
 * @generated
 */
public class GenECUEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public GenECUEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorEcu_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorAllocatedGenTasks_property_tab_psmTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

			addPropertyEditor(createEditorEcu_property_tab_psmTab_Editor(), false);

			addPropertyEditor(createEditorAllocatedGenTasks_property_tab_psmTab_Editor(), false);

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

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEcu_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEcu_property_tab_psmTab_Editor() {
		if (this.editorEcu_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenECU_Ecu();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorEcu_property_tab_psmTab = editor;
		}
		return this.editorEcu_property_tab_psmTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAllocatedGenTasks_property_tab_psmTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAllocatedGenTasks_property_tab_psmTab_Editor() {
		if (this.editorAllocatedGenTasks_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenECU_AllocatedGenTasks();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorAllocatedGenTasks_property_tab_psmTab = editor;
		}
		return this.editorAllocatedGenTasks_property_tab_psmTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public GenECUEditor(String tab) {
		this(tab, org.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.psm.codegen.CodegenPackage.eINSTANCE.getGenECU());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new GenECUEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.psm", "property.tab.psm"})
					.contains(tab);
		}
	}

}
