package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public abstract class EntryOrExitEventEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.StateEventEditor {

	/**
	 * @generated
	 */
	public EntryOrExitEventEditor(String tab,
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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addEntryOrExitEventClockResetsEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		addEntryOrExitEventActionEditor(null, false);

	}

	/**
	 * @generated
	 */
	protected void addEntryOrExitEventClockResetsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEntryOrExitEventClockResetsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createEntryOrExitEventClockResetsEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEntryOrExitEvent_ClockResets());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEntryOrExitEventActionEditor(String category,
			boolean front) {
		addEditorToCategory(category, createEntryOrExitEventActionEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createEntryOrExitEventActionEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEntryOrExitEvent_Action());

		return editor;

	}

}
