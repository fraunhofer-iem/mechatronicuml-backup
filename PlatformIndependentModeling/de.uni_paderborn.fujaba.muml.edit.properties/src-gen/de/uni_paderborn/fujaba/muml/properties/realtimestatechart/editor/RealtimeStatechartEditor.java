package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class RealtimeStatechartEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RealtimeStatechartEditor(String tab,
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

		addPropertyEditor(createName_GeneralTab_Editor(), false);

		addPropertyEditor(createBehavioralElement_GeneralTab_Editor(), false);

		addPropertyEditor(createOperations_GeneralTab_Editor(), false);

		addPropertyEditor(createVariables_GeneralTab_Editor(), false);

		addPropertyEditor(createExtension_ExtensionsTab_Editor(), false);

		addPropertyEditor(createComment_DocumentationTab_Editor(), false);

		addPropertyEditor(createParentRegion_GeneralTab_Editor(), false);

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createTransitions_GeneralTab_Editor(), false);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createStates_GeneralTab_Editor(), false);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createClocks_GeneralTab_Editor(), false);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createUsedOperationRepositories_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParentRegion_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createParentRegion_GeneralTab_Editor() {
		if (this.editorParentRegion_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_ParentRegion();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("If the real-time statechart is embedded into a region of a composite state,\nthan this reference returns the region of this state. If the real-time statechart\nis not embedded, this reference will be undefined.");

			this.editorParentRegion_GeneralTab = editor;
		}
		return this.editorParentRegion_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTransitions_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createTransitions_GeneralTab_Editor() {
		if (this.editorTransitions_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_Transitions();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The transitions of the realtime statechart.");

			this.editorTransitions_GeneralTab = editor;
		}
		return this.editorTransitions_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorStates_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createStates_GeneralTab_Editor() {
		if (this.editorStates_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_States();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The states of this realtime statechart.");

			this.editorStates_GeneralTab = editor;
		}
		return this.editorStates_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClocks_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createClocks_GeneralTab_Editor() {
		if (this.editorClocks_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_Clocks();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The clocks of this realtime statechart.");

			this.editorClocks_GeneralTab = editor;
		}
		return this.editorClocks_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUsedOperationRepositories_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createUsedOperationRepositories_GeneralTab_Editor() {
		if (this.editorUsedOperationRepositories_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_UsedOperationRepositories();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("A Real-time Statechart may use an arbitrary number of OperationRepositories. Then, the Real-Time Statechart may access all of the operations that are contained in the OperationRepository, i.e., it may invoke them whereever an Operation may be invoked.");

			this.editorUsedOperationRepositories_GeneralTab = editor;
		}
		return this.editorUsedOperationRepositories_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createName_GeneralTab_Editor() {
		if (this.editorName_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_GeneralTab = editor;
		}
		return this.editorName_GeneralTab;
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

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBehavioralElement_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createBehavioralElement_GeneralTab_Editor() {
		if (this.editorBehavioralElement_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getBehavior_BehavioralElement();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The behavioral element this statechart belongs to.");

			this.editorBehavioralElement_GeneralTab = editor;
		}
		return this.editorBehavioralElement_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOperations_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createOperations_GeneralTab_Editor() {
		if (this.editorOperations_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getBehavior_Operations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("A behavior may define a set of operations as signatures of helper functions. These operations\nmay be called by the behavior specification and may access the variables of\nthe behavior specification. The operations are contained in the behavior.");

			this.editorOperations_GeneralTab = editor;
		}
		return this.editorOperations_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVariables_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createVariables_GeneralTab_Editor() {
		if (this.editorVariables_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getBehavior_Variables();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("A behavior may define a set of variables in order to store data. The variables\nmay be accessed by various elements, e.g., operations and the behavior specification itself.\nThe variables are contained in the behavior.");

			this.editorVariables_GeneralTab = editor;
		}
		return this.editorVariables_GeneralTab;
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

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public RealtimeStatechartEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart());
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
			return new RealtimeStatechartEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.extensions",
							"property.tab.general", "property.tab.general",
							"property.tab.general",
							"property.tab.documentation"}).contains(tab);
		}
	}

}
