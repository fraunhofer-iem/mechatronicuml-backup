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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addAbsoluteDeadlineClockEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addAbsoluteDeadlineClockEditor(String category, boolean front) {
		addEditorToCategory(category, createAbsoluteDeadlineClockEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createAbsoluteDeadlineClockEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getAbsoluteDeadline_Clock());

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
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new AbsoluteDeadlineEditor(tab);
		}
	}

}
