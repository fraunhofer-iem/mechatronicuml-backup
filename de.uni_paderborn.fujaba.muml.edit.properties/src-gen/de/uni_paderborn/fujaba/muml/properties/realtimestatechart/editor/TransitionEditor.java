package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class TransitionEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public TransitionEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addSubCategory("de.fujaba.properties.category.Transition.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL);

		addTransitionSynchronizationEditor(null, false);

		addTransitionClockResetsEditor(null, true);

		addTransitionClockConstraintsEditor(null, true);

		addTransitionAbsoluteDeadlinesEditor(null, true);

		addTransitionRelativeDeadlineEditor(null, false);

		addTransitionBlockableEditor(
				"de.fujaba.properties.category.Transition.Booleans", true);

		addTransitionGuardEditor(null, false);

		addTransitionEventsEditor(null, true);

		addTransitionActionEditor(null, false);

		addTransitionUrgentEditor(
				"de.fujaba.properties.category.Transition.Booleans", true);

		addCommentableElementCommentEditor(null, true);

		addPrioritizedElementPriorityEditor(null, true);

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
				adapterFactory,
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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
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
				adapterFactory,
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
				adapterFactory,
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
				adapterFactory,
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
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
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
				adapterFactory,
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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Urgent());

	}
	/**
	 * @generated
	 */
	protected void addCommentableElementCommentEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommentableElementCommentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementCommentEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment());

	}
	/**
	 * @generated
	 */
	protected void addPrioritizedElementPriorityEditor(String category,
			boolean front) {
		addEditorToCategory(category, createPrioritizedElementPriorityEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPrioritizedElementPriorityEditor() {
		return new de.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getPrioritizedElement_Priority(), 0);

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
			return new TransitionEditor();
		}
	}

}
