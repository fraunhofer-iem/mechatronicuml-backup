package de.uni_paderborn.fujaba.muml.hardware.properties.hwvaluetype.editor;

/**
 * @generated
 */
public class DataRateEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DataRateEditor(String tab,
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

			addPropertyEditor(createEditorValue_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorUnit_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorValue_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorUnit_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_GeneralTab_Editor() {
		if (this.editorValue_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
					.getDataRate_Value();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The value of this DataRate.");

			this.editorValue_GeneralTab = editor;
		}
		return this.editorValue_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUnit_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUnit_GeneralTab_Editor() {
		if (this.editorUnit_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
					.getDataRate_Unit();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The unit of the value (i.e. b/s, Kb/s).");

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
	public DataRateEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
						.getDataRate());
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
			return new DataRateEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
