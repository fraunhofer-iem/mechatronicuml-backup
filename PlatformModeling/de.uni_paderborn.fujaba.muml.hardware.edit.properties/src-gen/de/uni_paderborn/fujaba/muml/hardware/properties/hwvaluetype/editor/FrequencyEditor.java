package de.uni_paderborn.fujaba.muml.hardware.properties.hwvaluetype.editor;

/**
 * @generated
 */
public class FrequencyEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public FrequencyEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null || "property.tab.constraint".equals(getTab())) { // Tab Constraint

		} else if (tab == null || "property.tab.general".equals(getTab())) { // Tab General

			addPropertyEditor(createValue_GeneralTab_Editor(), false);

			addPropertyEditor(createUnit_GeneralTab_Editor(), false);

		} else if (tab == null || "property.tab.documentation".equals(getTab())) { // Tab Documentation

		} else if (tab == null || "property.tab.extensions".equals(getTab())) { // Tab Extensions

		} else if (tab == null || "property.tab.constraint".equals(getTab())) { // Tab Constraint

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createValue_GeneralTab_Editor() {
		if (this.editorValue_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
					.getFrequency_Value();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The value of the frequency.");

			this.editorValue_GeneralTab = editor;
		}
		return this.editorValue_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUnit_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createUnit_GeneralTab_Editor() {
		if (this.editorUnit_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
					.getFrequency_Unit();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The unit of this value (i.e. Hz, MHz,etc).");

			this.editorUnit_GeneralTab = editor;
		}
		return this.editorUnit_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public FrequencyEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
						.getFrequency());
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
			return new FrequencyEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
