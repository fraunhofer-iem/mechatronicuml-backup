
package org.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ReconfigurationExecutionPortInterfaceEntryEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconfigurationExecutionPortInterfaceEntryEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorDescription_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMessageType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTimeForExecutionPhase_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTimeForDecision_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMinimumCommitTime_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorDescription_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMessageType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTimeForExecutionPhase_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTimeForDecision_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMinimumCommitTime_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTimeForExecutionPhase_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTimeForExecutionPhase_property_tab_generalTab_Editor() {
		if (this.editorTimeForExecutionPhase_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPortInterfaceEntry_TimeForExecutionPhase();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The time that is needed by the component for executing the reconfiguration\nthat is offered by this interface entry. The time for execution is specified an\nExecutionTimeSpecification because it depends on the particular execution\nprocedure. Currently, we support single-phase and three-phase execution.");

			this.editorTimeForExecutionPhase_property_tab_generalTab = editor;
		}
		return this.editorTimeForExecutionPhase_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTimeForDecision_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTimeForDecision_property_tab_generalTab_Editor() {
		if (this.editorTimeForDecision_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPortInterfaceEntry_TimeForDecision();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The time that is needed by the component for deciding whether the reconfiguration\nthat is offered by this interface entry can be executed.");

			this.editorTimeForDecision_property_tab_generalTab = editor;
		}
		return this.editorTimeForDecision_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMinimumCommitTime_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMinimumCommitTime_property_tab_generalTab_Editor() {
		if (this.editorMinimumCommitTime_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPortInterfaceEntry_MinimumCommitTime();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If the component confirmed to the parent that it can execute the requested\nreconfiguration, the commit time denotes how long the component may stick\nto that confirmation. The minimum commit time sets a lower bound to this value.\nIt is required for analyzing the reconfiguration behavior.");

			this.editorMinimumCommitTime_property_tab_generalTab = editor;
		}
		return this.editorMinimumCommitTime_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDescription_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDescription_property_tab_generalTab_Editor() {
		if (this.editorDescription_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationPortInterfaceEntry_Description();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"A human readable description of this reconfiguration port interface entry. \nThis description is to be used by a developer.");

			this.editorDescription_property_tab_generalTab = editor;
		}
		return this.editorDescription_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMessageType_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMessageType_property_tab_generalTab_Editor() {
		if (this.editorMessageType_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationPortInterfaceEntry_MessageType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The reconfiguration message type that is specified by the reconfiguration \nport interface entry.");

			this.editorMessageType_property_tab_generalTab = editor;
		}
		return this.editorMessageType_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurationExecutionPortInterfaceEntryEditor(String tab) {
		this(tab, org.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationExecutionPortInterfaceEntry());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ReconfigurationExecutionPortInterfaceEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general"}).contains(tab);
		}
	}

}
