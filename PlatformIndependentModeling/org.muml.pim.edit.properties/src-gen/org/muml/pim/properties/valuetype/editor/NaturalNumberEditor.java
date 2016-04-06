
package org.muml.pim.properties.valuetype.editor;

/**
 * @generated
 */
public class NaturalNumberEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public NaturalNumberEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addSubCategory("org.muml.ape.category.Natural Number", "Natural Number", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("org.muml.ape.category.Natural Number",
					createEditorValue_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Natural Number",
					createEditorInfinity_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addSubCategory("org.muml.ape.category.Natural Number", "Natural Number", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("org.muml.ape.category.Natural Number",
					createEditorValue_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Natural Number",
					createEditorInfinity_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_property_tab_generalTab_Editor() {
		if (this.editorValue_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.valuetype.ValuetypePackage.eINSTANCE
					.getNaturalNumber_Value();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage("The value of this natural number.");

			this.editorValue_property_tab_generalTab = editor;
		}
		return this.editorValue_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInfinity_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInfinity_property_tab_generalTab_Editor() {
		if (this.editorInfinity_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.valuetype.ValuetypePackage.eINSTANCE
					.getNaturalNumber_Infinity();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Determins whether this natural number represents infinity.");

			this.editorInfinity_property_tab_generalTab = editor;
		}
		return this.editorInfinity_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public NaturalNumberEditor(String tab) {
		this(tab, org.muml.pim.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.pim.valuetype.ValuetypePackage.eINSTANCE.getNaturalNumber());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new NaturalNumberEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
