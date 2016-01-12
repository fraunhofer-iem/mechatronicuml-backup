
package de.uni_paderborn.fujaba.muml.hardware.properties.hwvaluetype.editor;

/**
 * @generated
 */
public class FrequencyEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public FrequencyEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorValue_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorUnit_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorValue_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorUnit_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_property_tab_generalTab_Editor() {
		if (this.editorValue_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
					.getFrequency_Value();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The value of the frequency.");

			this.editorValue_property_tab_generalTab = editor;
		}
		return this.editorValue_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUnit_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUnit_property_tab_generalTab_Editor() {
		if (this.editorUnit_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
					.getFrequency_Unit();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The unit of this value (i.e. Hz, MHz,etc).");

			this.editorUnit_property_tab_generalTab = editor;
		}
		return this.editorUnit_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public FrequencyEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE.getFrequency());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new FrequencyEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
