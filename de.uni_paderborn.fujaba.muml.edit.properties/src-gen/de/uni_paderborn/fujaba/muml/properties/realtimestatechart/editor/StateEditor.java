package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class StateEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.VertexEditor {

	/**
	 * @generated
	 */
	public StateEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addSubCategory("de.fujaba.properties.category.State.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL);

		addSubCategory("de.fujaba.properties.category.State.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL);

		addStateDoEventEditor(null, false);

		addStateExitEventEditor(null, false);

		addStateEntryEventEditor(null, false);

		addStateInitialEditor("de.fujaba.properties.category.State.Booleans",
				true);

		addStateFinalEditor("de.fujaba.properties.category.State.Booleans",
				true);

		addStateUrgentEditor("de.fujaba.properties.category.State.Booleans",
				true);

		addStateInvariantsEditor("de.fujaba.properties.category.State.Lists",
				true);

		addStateChannelsEditor("de.fujaba.properties.category.State.Lists",
				true);

		addStateSimpleEditor("de.fujaba.properties.category.State.Booleans",
				true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addStateDoEventEditor(String category, boolean front) {
		addEditorToCategory(category, createStateDoEventEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateDoEventEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_DoEvent());

	}
	/**
	 * @generated
	 */
	protected void addStateExitEventEditor(String category, boolean front) {
		addEditorToCategory(category, createStateExitEventEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateExitEventEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_ExitEvent());

	}
	/**
	 * @generated
	 */
	protected void addStateEntryEventEditor(String category, boolean front) {
		addEditorToCategory(category, createStateEntryEventEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateEntryEventEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_EntryEvent());

	}
	/**
	 * @generated
	 */
	protected void addStateInitialEditor(String category, boolean front) {
		addEditorToCategory(category, createStateInitialEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateInitialEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Initial());

	}
	/**
	 * @generated
	 */
	protected void addStateFinalEditor(String category, boolean front) {
		addEditorToCategory(category, createStateFinalEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateFinalEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Final());

	}
	/**
	 * @generated
	 */
	protected void addStateUrgentEditor(String category, boolean front) {
		addEditorToCategory(category, createStateUrgentEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateUrgentEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Urgent());

	}
	/**
	 * @generated
	 */
	protected void addStateInvariantsEditor(String category, boolean front) {
		addEditorToCategory(category, createStateInvariantsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateInvariantsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Invariants());

	}
	/**
	 * @generated
	 */
	protected void addStateChannelsEditor(String category, boolean front) {
		addEditorToCategory(category, createStateChannelsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateChannelsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Channels());

	}
	/**
	 * @generated
	 */
	protected void addStateSimpleEditor(String category, boolean front) {
		addEditorToCategory(category, createStateSimpleEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateSimpleEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Simple());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new StateEditor();
		}
	}

}
