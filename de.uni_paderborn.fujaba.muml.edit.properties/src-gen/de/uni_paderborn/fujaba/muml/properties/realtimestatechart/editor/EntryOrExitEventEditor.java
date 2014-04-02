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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addEntryOrExitEventClockResets_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addEntryOrExitEventAction_GeneralTab_Editor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addEntryOrExitEventClockResets_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createEntryOrExitEventClockResets_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEntryOrExitEventClockResets_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEntryOrExitEvent_ClockResets());

		editor.setTooltipMessage("The clock resets of this action");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addEntryOrExitEventAction_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createEntryOrExitEventAction_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createEntryOrExitEventAction_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEntryOrExitEvent_Action());

		editor.setTooltipMessage("Each entry or exit event can have one or more actions.");

		return editor;

	}

}
