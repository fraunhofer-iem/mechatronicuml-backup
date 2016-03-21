
package de.uni_paderborn.fujaba.muml.psm.properties.codegen.editor;

/**
 * @generated
 */
public class GenPortInstanceEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPortInstance_property_tab_psmTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPortInstance_property_tab_psmTab_Editor() {
		if (this.editorPortInstance_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenPortInstance_PortInstance();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorPortInstance_property_tab_psmTab = editor;
		}
		return this.editorPortInstance_property_tab_psmTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSamplingTime_property_tab_psmTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSamplingTime_property_tab_psmTab_Editor() {
		if (this.editorSamplingTime_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenPortInstance_SamplingTime();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorSamplingTime_property_tab_psmTab = editor;
		}
		return this.editorSamplingTime_property_tab_psmTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExecCommand_property_tab_psmTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExecCommand_property_tab_psmTab_Editor() {
		if (this.editorExecCommand_property_tab_psmTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE
					.getGenPortInstance_ExecCommand();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
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
		this(tab, de.uni_paderborn.fujaba.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage.eINSTANCE.getGenPortInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
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
