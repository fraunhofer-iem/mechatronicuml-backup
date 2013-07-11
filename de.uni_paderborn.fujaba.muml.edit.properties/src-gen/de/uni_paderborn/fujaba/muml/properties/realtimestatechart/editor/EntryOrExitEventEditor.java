package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class EntryOrExitEventEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.StateEventEditor {

	/**
	 * @generated
	 */
	public EntryOrExitEventEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public EntryOrExitEventEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addEntryOrExitEventClockResetsEditor(null, true);

		addEntryOrExitEventActionEditor(null, false);

		super.initialize();
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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEntryOrExitEvent_ClockResets());

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
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEntryOrExitEvent_Action());

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new EntryOrExitEventEditor();
		}
	}

}
