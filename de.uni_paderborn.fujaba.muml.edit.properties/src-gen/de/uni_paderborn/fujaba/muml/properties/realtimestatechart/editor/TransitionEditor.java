package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class TransitionEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public TransitionEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addTransitionSynchronizationEditor(null, true);

		addTransitionClockResetsEditor(null, true);

		addTransitionClockConstraintsEditor(null, true);

		addTransitionAbsoluteDeadlinesEditor(null, true);

		addTransitionRelativeDeadlineEditor(null, true);

		addTransitionBlockableEditor(null, true);

		addTransitionGuardEditor(null, true);

		addTransitionEventsEditor(null, true);

		addTransitionActionEditor(null, true);

		addTransitionUrgentEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addTransitionSynchronizationEditor(String category,
			boolean front) {
		addEditorToCategory(category, createTransitionSynchronizationEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionSynchronizationEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Synchronization());

	}
	/**
	 * @generated
	 */
	protected void addTransitionClockResetsEditor(String category, boolean front) {
		addEditorToCategory(category, createTransitionClockResetsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionClockResetsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_ClockResets());

	}
	/**
	 * @generated
	 */
	protected void addTransitionClockConstraintsEditor(String category,
			boolean front) {
		addEditorToCategory(category, createTransitionClockConstraintsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionClockConstraintsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_ClockConstraints());

	}
	/**
	 * @generated
	 */
	protected void addTransitionAbsoluteDeadlinesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createTransitionAbsoluteDeadlinesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionAbsoluteDeadlinesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_AbsoluteDeadlines());

	}
	/**
	 * @generated
	 */
	protected void addTransitionRelativeDeadlineEditor(String category,
			boolean front) {
		addEditorToCategory(category, createTransitionRelativeDeadlineEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionRelativeDeadlineEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_RelativeDeadline());

	}
	/**
	 * @generated
	 */
	protected void addTransitionBlockableEditor(String category, boolean front) {
		addEditorToCategory(category, createTransitionBlockableEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionBlockableEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Blockable());

	}
	/**
	 * @generated
	 */
	protected void addTransitionGuardEditor(String category, boolean front) {
		addEditorToCategory(category, createTransitionGuardEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionGuardEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Guard());

	}
	/**
	 * @generated
	 */
	protected void addTransitionEventsEditor(String category, boolean front) {
		addEditorToCategory(category, createTransitionEventsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionEventsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Events());

	}
	/**
	 * @generated
	 */
	protected void addTransitionActionEditor(String category, boolean front) {
		addEditorToCategory(category, createTransitionActionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionActionEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Action());

	}
	/**
	 * @generated
	 */
	protected void addTransitionUrgentEditor(String category, boolean front) {
		addEditorToCategory(category, createTransitionUrgentEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionUrgentEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Urgent());

	}

	//
	// Overwritten property settings
	//

}
