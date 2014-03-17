package de.uni_paderborn.fujaba.muml.hardware.properties.hwvaluetype.editor;

/**
 * @generated
 */
public class TimeIntervalEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.valuetype.editor.RangeEditor {

	/**
	 * @generated
	 */
	public TimeIntervalEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTimeIntervalUnit_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addTimeIntervalUnit_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createTimeIntervalUnit_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createTimeIntervalUnit_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
						.getTimeInterval_Unit());

		editor.setTooltipMessage("The unit for this TimeInterval.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TimeIntervalEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage.eINSTANCE
						.getTimeInterval());
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
			return new TimeIntervalEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
