package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class StateEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public StateEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(),
					false);

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(),
					false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(),
					false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorDoEvent_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorExitEvent_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorEntryEvent_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorParentStatechart_GeneralTab_Editor(),
					false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorInitial_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorFinal_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorUrgent_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorEmbeddedRegions_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorInvariants_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorChannels_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorConnectionPoints_GeneralTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					"Transitions", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					createEditorOutgoingTransitions_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					createEditorIncomingTransitions_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					"Transitions", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorDoEvent_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorExitEvent_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorEntryEvent_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorParentStatechart_GeneralTab_Editor(),
					false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorInitial_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorFinal_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					createEditorUrgent_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorEmbeddedRegions_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorInvariants_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorChannels_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorConnectionPoints_GeneralTab_Editor(), false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					"Transitions", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					createEditorOutgoingTransitions_GeneralTab_Editor(), false);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					createEditorIncomingTransitions_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(),
					false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					"Transitions", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(),
					false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(),
					false);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addSubCategory(
					"de.uni_paderborn.fujaba.properties.category.Transitions",
					"Transitions", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEmbeddedRegions_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEmbeddedRegions_GeneralTab_Editor() {
		if (this.editorEmbeddedRegions_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_EmbeddedRegions();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The regions of this state. Regions are used to model composite states.\nIn case of one region, we have an xor superstate, in case of multiple regions, \nwe have an AND-superstate.");

			this.editorEmbeddedRegions_GeneralTab = editor;
		}
		return this.editorEmbeddedRegions_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDoEvent_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDoEvent_GeneralTab_Editor() {
		if (this.editorDoEvent_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_DoEvent();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The do event. It is executed periodically while the corresponding state is active.");

			this.editorDoEvent_GeneralTab = editor;
		}
		return this.editorDoEvent_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExitEvent_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExitEvent_GeneralTab_Editor() {
		if (this.editorExitEvent_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_ExitEvent();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The exit action is exectuted once when the corresponding state is left.");

			this.editorExitEvent_GeneralTab = editor;
		}
		return this.editorExitEvent_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEntryEvent_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEntryEvent_GeneralTab_Editor() {
		if (this.editorEntryEvent_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_EntryEvent();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The entry action is exectuted once when the corresponding state is entered.");

			this.editorEntryEvent_GeneralTab = editor;
		}
		return this.editorEntryEvent_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInvariants_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInvariants_GeneralTab_Editor() {
		if (this.editorInvariants_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Invariants();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The invariant belonging to this complex state. It describes how long it is allowed to reside in this complex state depending on the values of the clocks.");

			this.editorInvariants_GeneralTab = editor;
		}
		return this.editorInvariants_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInitial_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInitial_GeneralTab_Editor() {
		if (this.editorInitial_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Initial();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("An initial state is the first one to active if the statechart is activated. There is only one initial state allowed at the top hierarchy of a statechart.");

			this.editorInitial_GeneralTab = editor;
		}
		return this.editorInitial_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorFinal_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorFinal_GeneralTab_Editor() {
		if (this.editorFinal_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Final();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("a final state is not allowed to have outgoing transitions.");

			this.editorFinal_GeneralTab = editor;
		}
		return this.editorFinal_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUrgent_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUrgent_GeneralTab_Editor() {
		if (this.editorUrgent_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Urgent();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("If a state is active and urgent, no time is allowed to pass until the state is leaved.");

			this.editorUrgent_GeneralTab = editor;
		}
		return this.editorUrgent_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorChannels_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorChannels_GeneralTab_Editor() {
		if (this.editorChannels_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Channels();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The synchronization channels provided by this state.");

			this.editorChannels_GeneralTab = editor;
		}
		return this.editorChannels_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorConnectionPoints_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorConnectionPoints_GeneralTab_Editor() {
		if (this.editorConnectionPoints_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_ConnectionPoints();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("A state references its connection points. They can only exist, if a state embeds one or more statecharts.");

			this.editorConnectionPoints_GeneralTab = editor;
		}
		return this.editorConnectionPoints_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParentStatechart_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParentStatechart_GeneralTab_Editor() {
		if (this.editorParentStatechart_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_ParentStatechart();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The realtime statechart this state belongs to.\n\\todoib{Should be 1..1, but GMF needs 0..1 here!}");

			this.editorParentStatechart_GeneralTab = editor;
		}
		return this.editorParentStatechart_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutgoingTransitions_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOutgoingTransitions_GeneralTab_Editor() {
		if (this.editorOutgoingTransitions_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getVertex_OutgoingTransitions();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The outgoing transitions of this vertex");

			this.editorOutgoingTransitions_GeneralTab = editor;
		}
		return this.editorOutgoingTransitions_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingTransitions_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncomingTransitions_GeneralTab_Editor() {
		if (this.editorIncomingTransitions_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getVertex_IncomingTransitions();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The incoming transitions of this vertex");

			this.editorIncomingTransitions_GeneralTab = editor;
		}
		return this.editorIncomingTransitions_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_DocumentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_DocumentationTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_ExtensionsTab_Editor() {
		if (this.editorExtension_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_ExtensionsTab = editor;
		}
		return this.editorExtension_ExtensionsTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_GeneralTab_Editor() {
		if (this.editorName_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.ecore.OCLExpression initExpression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
						.createOCLExpression(
								"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)",
								feature, getEClass());
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(initExpression);
				if (query != null) {
					editor.setInitializeQuery(query);
				}
			}

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_GeneralTab = editor;
		}
		return this.editorName_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public StateEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState());
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
			return new StateEditor(tab);
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
