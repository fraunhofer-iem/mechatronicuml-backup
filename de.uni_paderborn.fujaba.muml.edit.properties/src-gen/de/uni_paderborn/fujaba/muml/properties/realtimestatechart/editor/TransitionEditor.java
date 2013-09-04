package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class TransitionEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.PrioritizedElementEditor {

	/**
	 * @generated
	 */
	public TransitionEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addTransitionSynchronizationEditor(null, true);

		addTransitionTargetEditor(null, true);

		addTransitionSourceEditor(null, true);

		addTransitionStatechartEditor(null, true);

		addTransitionClockResetsEditor("de.fujaba.properties.category.Lists",
				true);

		addTransitionClockConstraintsEditor(
				"de.fujaba.properties.category.Lists", true);

		addTransitionAbsoluteDeadlinesEditor(
				"de.fujaba.properties.category.Lists", true);

		addTransitionRelativeDeadlineEditor(null, true);

		addTransitionBlockableEditor("de.fujaba.properties.category.Booleans",
				true);

		addTransitionGuardEditor(null, true);

		addTransitionEventsEditor("de.fujaba.properties.category.Lists", true);

		addTransitionActionEditor(null, true);

		addTransitionUrgentEditor("de.fujaba.properties.category.Booleans",
				true);

		addCommentableElementCommentEditor(null, true);

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
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Synchronization());

	}
	/**
	 * @generated
	 */
	protected void addTransitionTargetEditor(String category, boolean front) {
		addEditorToCategory(category, createTransitionTargetEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionTargetEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Target());

	}
	/**
	 * @generated
	 */
	protected void addTransitionSourceEditor(String category, boolean front) {
		addEditorToCategory(category, createTransitionSourceEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionSourceEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Source());

	}
	/**
	 * @generated
	 */
	protected void addTransitionStatechartEditor(String category, boolean front) {
		addEditorToCategory(category, createTransitionStatechartEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTransitionStatechartEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition_Statechart());

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
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
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
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
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
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
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
						.getCommentableElement_Comment(), false);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TransitionEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getTransition());
	}

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
