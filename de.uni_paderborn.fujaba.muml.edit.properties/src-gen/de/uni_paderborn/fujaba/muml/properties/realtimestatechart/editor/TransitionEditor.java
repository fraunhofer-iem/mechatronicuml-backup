package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class TransitionEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public TransitionEditor(String tab,
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

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addTransitionSynchronizationEditor(null, false);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionTargetEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionSourceEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionStatechartEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionClockResetsEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionClockConstraintsEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionAbsoluteDeadlinesEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		addTransitionRelativeDeadlineEditor(null, false);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionBlockableEditor(
					"de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionGuardEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionEventsEditor("de.fujaba.properties.category.Lists",
					true);
		}

		addTransitionActionEditor(null, false);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTransitionUrgentEditor("de.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPrioritizedElementPriorityEditor(null, true);
		}

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
		return new de.uni_paderborn.fujaba.muml.ui.properties.XtextPropertyEditor(
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
	// instantiation
	//

	/**
	 * @generated
	 */
	public TransitionEditor(String tab) {
		this(
				tab,
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
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new TransitionEditor(tab);
		}
	}

}
