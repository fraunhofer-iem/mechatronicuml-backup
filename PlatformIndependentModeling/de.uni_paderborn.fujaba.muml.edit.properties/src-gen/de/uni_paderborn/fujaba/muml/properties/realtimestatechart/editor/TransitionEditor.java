package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class TransitionEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

		addPropertyEditor(createExtension_ExtensionsTab_Editor(), false);

		addPropertyEditor(createComment_DocumentationTab_Editor(), false);

		addPropertyEditor(createPriority_GeneralTab_Editor(), false);

		addPropertyEditor(createSynchronization_GeneralTab_Editor(), false);

		addPropertyEditor(createTarget_GeneralTab_Editor(), false);

		addPropertyEditor(createSource_GeneralTab_Editor(), false);

		addPropertyEditor(createStatechart_GeneralTab_Editor(), false);

		addPropertyEditor(createRelativeDeadline_GeneralTab_Editor(), false);

		addPropertyEditor(createGuard_GeneralTab_Editor(), false);

		addPropertyEditor(createAction_GeneralTab_Editor(), false);

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Booleans",
				createBlockable_GeneralTab_Editor(), false);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Booleans",
				createUrgent_GeneralTab_Editor(), false);

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createClockResets_GeneralTab_Editor(), false);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createClockConstraints_GeneralTab_Editor(), false);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createAbsoluteDeadlines_GeneralTab_Editor(), false);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createEvents_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSynchronization_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createSynchronization_GeneralTab_Editor() {
		if (this.editorSynchronization_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Synchronization();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The synchronisation which is sent upon activation of this transition.");

			this.editorSynchronization_GeneralTab = editor;
		}
		return this.editorSynchronization_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTarget_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createTarget_GeneralTab_Editor() {
		if (this.editorTarget_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Target();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The state which is the target of this transition.");

			this.editorTarget_GeneralTab = editor;
		}
		return this.editorTarget_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSource_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createSource_GeneralTab_Editor() {
		if (this.editorSource_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Source();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The state which is the source of this transition.");

			this.editorSource_GeneralTab = editor;
		}
		return this.editorSource_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorStatechart_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createStatechart_GeneralTab_Editor() {
		if (this.editorStatechart_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Statechart();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The realtime statechart that this transition locically belongs to.");

			this.editorStatechart_GeneralTab = editor;
		}
		return this.editorStatechart_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClockResets_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createClockResets_GeneralTab_Editor() {
		if (this.editorClockResets_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_ClockResets();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The clock resets of this transition.");

			this.editorClockResets_GeneralTab = editor;
		}
		return this.editorClockResets_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClockConstraints_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createClockConstraints_GeneralTab_Editor() {
		if (this.editorClockConstraints_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_ClockConstraints();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("A clock constraint restricts when the transition can be activeted in dependency of the values of the clock.");

			this.editorClockConstraints_GeneralTab = editor;
		}
		return this.editorClockConstraints_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAbsoluteDeadlines_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createAbsoluteDeadlines_GeneralTab_Editor() {
		if (this.editorAbsoluteDeadlines_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_AbsoluteDeadlines();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("a transition can has one or more absolute deadlines");

			this.editorAbsoluteDeadlines_GeneralTab = editor;
		}
		return this.editorAbsoluteDeadlines_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRelativeDeadline_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createRelativeDeadline_GeneralTab_Editor() {
		if (this.editorRelativeDeadline_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_RelativeDeadline();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("a transition can have one relative deadline");

			this.editorRelativeDeadline_GeneralTab = editor;
		}
		return this.editorRelativeDeadline_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBlockable_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createBlockable_GeneralTab_Editor() {
		if (this.editorBlockable_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Blockable();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Needed for failure propagation.");

			this.editorBlockable_GeneralTab = editor;
		}
		return this.editorBlockable_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGuard_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createGuard_GeneralTab_Editor() {
		if (this.editorGuard_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Guard();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.ui.properties.XtextPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The guard of a transition is defined by an expression which should have return type boolean. Comparing clock values is not allowed (use clock constraints instead).");

			this.editorGuard_GeneralTab = editor;
		}
		return this.editorGuard_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEvents_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEvents_GeneralTab_Editor() {
		if (this.editorEvents_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Events();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("All events which belong to this transition.");

			this.editorEvents_GeneralTab = editor;
		}
		return this.editorEvents_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAction_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createAction_GeneralTab_Editor() {
		if (this.editorAction_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Action();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The side effect of this transition. A side effect might be a variable assignment as well as a method invocation.");

			this.editorAction_GeneralTab = editor;
		}
		return this.editorAction_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUrgent_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createUrgent_GeneralTab_Editor() {
		if (this.editorUrgent_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getTransition_Urgent();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Indicates whether this transition fires immediately when it is enabled.");

			this.editorUrgent_GeneralTab = editor;
		}
		return this.editorUrgent_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_DocumentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createComment_DocumentationTab_Editor() {
		if (this.editorComment_DocumentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_DocumentationTab = editor;
		}
		return this.editorComment_DocumentationTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_ExtensionsTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createExtension_ExtensionsTab_Editor() {
		if (this.editorExtension_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_ExtensionsTab = editor;
		}
		return this.editorExtension_ExtensionsTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPriority_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createPriority_GeneralTab_Editor() {
		if (this.editorPriority_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getPrioritizedElement_Priority();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage("The integer value that represents the priority.");

			this.editorPriority_GeneralTab = editor;
		}
		return this.editorPriority_GeneralTab;
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
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new TransitionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general"})
					.contains(tab);
		}
	}

}
