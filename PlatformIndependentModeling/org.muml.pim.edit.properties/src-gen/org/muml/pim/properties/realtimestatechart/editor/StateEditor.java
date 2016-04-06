
package org.muml.pim.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class StateEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public StateEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorEmbeddedRegions_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorEntryEvent_property_tab_effectTab_Editor(), false);

			addPropertyEditor(createEditorDoEvent_property_tab_effectTab_Editor(), false);

			addPropertyEditor(createEditorExitEvent_property_tab_effectTab_Editor(), false);

			addPropertyEditor(createEditorInvariants_property_tab_conditionTab_Editor(), false);

			addPropertyEditor(createEditorChannels_property_tab_conditionTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorInitial_property_tab_generalTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorFinal_property_tab_generalTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUrgent_property_tab_generalTab_Editor(),
					false);

			addSubCategory("org.muml.ape.category.Transitions", "Transitions", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Transitions",
					createEditorOutgoingTransitions_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Transitions",
					createEditorIncomingTransitions_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

			addPropertyEditor(createEditorInvariants_property_tab_conditionTab_Editor(), false);

			addPropertyEditor(createEditorChannels_property_tab_conditionTab_Editor(), false);

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

			addPropertyEditor(createEditorEntryEvent_property_tab_effectTab_Editor(), false);

			addPropertyEditor(createEditorDoEvent_property_tab_effectTab_Editor(), false);

			addPropertyEditor(createEditorExitEvent_property_tab_effectTab_Editor(), false);

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorEmbeddedRegions_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorInitial_property_tab_generalTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorFinal_property_tab_generalTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUrgent_property_tab_generalTab_Editor(),
					false);

			addSubCategory("org.muml.ape.category.Transitions", "Transitions", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Transitions",
					createEditorOutgoingTransitions_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Transitions",
					createEditorIncomingTransitions_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEmbeddedRegions_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEmbeddedRegions_property_tab_generalTab_Editor() {
		if (this.editorEmbeddedRegions_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_EmbeddedRegions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The regions of this state. Regions are used to model composite states.\nIn case of one region, we have an xor superstate, in case of multiple regions, \nwe have an AND-superstate.");

			this.editorEmbeddedRegions_property_tab_generalTab = editor;
		}
		return this.editorEmbeddedRegions_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorEntryEvent_property_tab_effectTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorEntryEvent_property_tab_effectTab_Editor() {
		if (this.editorEntryEvent_property_tab_effectTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_EntryEvent();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The entry action is exectuted once when the corresponding state is entered.");

			this.editorEntryEvent_property_tab_effectTab = editor;
		}
		return this.editorEntryEvent_property_tab_effectTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDoEvent_property_tab_effectTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDoEvent_property_tab_effectTab_Editor() {
		if (this.editorDoEvent_property_tab_effectTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_DoEvent();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The do event. It is executed periodically while the corresponding state is active.");

			this.editorDoEvent_property_tab_effectTab = editor;
		}
		return this.editorDoEvent_property_tab_effectTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExitEvent_property_tab_effectTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExitEvent_property_tab_effectTab_Editor() {
		if (this.editorExitEvent_property_tab_effectTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_ExitEvent();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The exit action is exectuted once when the corresponding state is left.");

			this.editorExitEvent_property_tab_effectTab = editor;
		}
		return this.editorExitEvent_property_tab_effectTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInvariants_property_tab_conditionTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInvariants_property_tab_conditionTab_Editor() {
		if (this.editorInvariants_property_tab_conditionTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Invariants();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The invariant belonging to this complex state. It describes how long it is allowed to reside in this complex state depending on the values of the clocks.");

			this.editorInvariants_property_tab_conditionTab = editor;
		}
		return this.editorInvariants_property_tab_conditionTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInitial_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInitial_property_tab_generalTab_Editor() {
		if (this.editorInitial_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Initial();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"An initial state is the first one to active if the statechart is activated. There is only one initial state allowed at the top hierarchy of a statechart.");

			this.editorInitial_property_tab_generalTab = editor;
		}
		return this.editorInitial_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorFinal_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorFinal_property_tab_generalTab_Editor() {
		if (this.editorFinal_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Final();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("a final state is not allowed to have outgoing transitions.");

			this.editorFinal_property_tab_generalTab = editor;
		}
		return this.editorFinal_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUrgent_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUrgent_property_tab_generalTab_Editor() {
		if (this.editorUrgent_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Urgent();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If a state is active and urgent, no time is allowed to pass until the state is leaved.");

			this.editorUrgent_property_tab_generalTab = editor;
		}
		return this.editorUrgent_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorChannels_property_tab_conditionTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorChannels_property_tab_conditionTab_Editor() {
		if (this.editorChannels_property_tab_conditionTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getState_Channels();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The synchronization channels provided by this state.");

			this.editorChannels_property_tab_conditionTab = editor;
		}
		return this.editorChannels_property_tab_conditionTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutgoingTransitions_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOutgoingTransitions_property_tab_generalTab_Editor() {
		if (this.editorOutgoingTransitions_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getVertex_OutgoingTransitions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The outgoing transitions of this vertex");

			this.editorOutgoingTransitions_property_tab_generalTab = editor;
		}
		return this.editorOutgoingTransitions_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingTransitions_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncomingTransitions_property_tab_generalTab_Editor() {
		if (this.editorIncomingTransitions_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getVertex_IncomingTransitions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The incoming transitions of this vertex");

			this.editorIncomingTransitions_property_tab_generalTab = editor;
		}
		return this.editorIncomingTransitions_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_property_tab_documentationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_property_tab_documentationTab_Editor() {
		if (this.editorComment_property_tab_documentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_property_tab_documentationTab = editor;
		}
		return this.editorComment_property_tab_documentationTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_property_tab_extensionsTab_Editor() {
		if (this.editorExtensions_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtensions_property_tab_extensionsTab = editor;
		}
		return this.editorExtensions_property_tab_extensionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_property_tab_generalTab_Editor() {
		if (this.editorName_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.ecore.OCLExpression initExpression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression(
								"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)",
								feature, getEClass());
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(initExpression);
				if (query != null) {
					editor.setInitializeQuery(query);
				}
			}

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_property_tab_generalTab = editor;
		}
		return this.editorName_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public StateEditor(String tab) {
		this(tab, org.muml.pim.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE.getState());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new StateEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.effect",
					"property.tab.effect", "property.tab.effect", "property.tab.condition", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.condition", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.documentation", "property.tab.extensions", "property.tab.general"}).contains(tab);
		}
	}

}
