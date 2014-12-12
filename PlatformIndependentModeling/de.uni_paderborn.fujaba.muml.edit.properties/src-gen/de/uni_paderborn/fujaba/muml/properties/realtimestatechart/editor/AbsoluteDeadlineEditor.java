package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class AbsoluteDeadlineEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.DeadlineEditor {

	/**
	 * @generated
	 */
	public AbsoluteDeadlineEditor(String tab,
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

		if (getTab() == null || "general".equals(getTab())) {
			addClock_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addClock_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createClock_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createClock_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
				.getAbsoluteDeadline_Clock();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("the references clock of the absolute deadline.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public AbsoluteDeadlineEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getAbsoluteDeadline());
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
			return new AbsoluteDeadlineEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"general", "general", "general"})
					.contains(tab);
		}
	}

}
