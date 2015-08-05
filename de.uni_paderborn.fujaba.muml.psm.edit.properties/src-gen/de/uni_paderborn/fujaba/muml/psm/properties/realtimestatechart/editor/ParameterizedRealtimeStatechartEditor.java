
package de.uni_paderborn.fujaba.muml.psm.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class ParameterizedRealtimeStatechartEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ParameterizedRealtimeStatechartEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(), false);

			addPropertyEditor(createEditorBehavioralElement_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorOperations_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorVariables_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorParentRegion_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorTransitions_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorStates_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorClocks_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorUsedOperationRepositories_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSubRoleSpecificVariables_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSubRoleSpecificClocks_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSubRoleSpecificOperations_GeneralTab_Editor(), false);

		} else if ("property.tab.psm".equals(tab)) { // Tab PSM

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorBehavioralElement_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorOperations_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorVariables_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorName_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorParentRegion_GeneralTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorTransitions_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorStates_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorClocks_GeneralTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorUsedOperationRepositories_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSubRoleSpecificVariables_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSubRoleSpecificClocks_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSubRoleSpecificOperations_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_DocumentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParentRegion_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParentRegion_GeneralTab_Editor() {
		if (this.editorParentRegion_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_ParentRegion();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If the real-time statechart is embedded into a region of a composite state,\nthan this reference returns the region of this state. If the real-time statechart\nis not embedded, this reference will be undefined.");

			this.editorParentRegion_GeneralTab = editor;
		}
		return this.editorParentRegion_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTransitions_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTransitions_GeneralTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorStates_GeneralTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorClocks_GeneralTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUsedOperationRepositories_GeneralTab_Editor() {
		if (this.editorUsedOperationRepositories_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_UsedOperationRepositories();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"A Real-time Statechart may use an arbitrary number of OperationRepositories. Then, the Real-Time Statechart may access all of the operations that are contained in the OperationRepository, i.e., it may invoke them whereever an Operation may be invoked.");

			this.editorUsedOperationRepositories_GeneralTab = editor;
		}
		return this.editorUsedOperationRepositories_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSubRoleSpecificVariables_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSubRoleSpecificVariables_GeneralTab_Editor() {
		if (this.editorSubRoleSpecificVariables_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_SubRoleSpecificVariables();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorSubRoleSpecificVariables_GeneralTab = editor;
		}
		return this.editorSubRoleSpecificVariables_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSubRoleSpecificClocks_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSubRoleSpecificClocks_GeneralTab_Editor() {
		if (this.editorSubRoleSpecificClocks_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_SubRoleSpecificClocks();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorSubRoleSpecificClocks_GeneralTab = editor;
		}
		return this.editorSubRoleSpecificClocks_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSubRoleSpecificOperations_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSubRoleSpecificOperations_GeneralTab_Editor() {
		if (this.editorSubRoleSpecificOperations_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getRealtimeStatechart_SubRoleSpecificOperations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorSubRoleSpecificOperations_GeneralTab = editor;
		}
		return this.editorSubRoleSpecificOperations_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_DocumentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_DocumentationTab_Editor() {
		if (this.editorComment_DocumentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

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

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBehavioralElement_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBehavioralElement_GeneralTab_Editor() {
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
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOperations_GeneralTab_Editor() {
		if (this.editorOperations_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getBehavior_Operations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"A behavior may define a set of operations as signatures of helper functions. These operations\nmay be called by the behavior specification and may access the variables of\nthe behavior specification. The operations are contained in the behavior.");

			this.editorOperations_GeneralTab = editor;
		}
		return this.editorOperations_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVariables_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVariables_GeneralTab_Editor() {
		if (this.editorVariables_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getBehavior_Variables();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"A behavior may define a set of variables in order to store data. The variables\nmay be accessed by various elements, e.g., operations and the behavior specification itself.\nThe variables are contained in the behavior.");

			this.editorVariables_GeneralTab = editor;
		}
		return this.editorVariables_GeneralTab;
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
	public ParameterizedRealtimeStatechartEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.psm.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.psm.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getParameterizedRealtimeStatechart());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ParameterizedRealtimeStatechartEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.documentation",
					"property.tab.extensions", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general"}).contains(tab);
		}
	}

}
