package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ReconfigurationExecutionPortInterfaceEntryEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconfigurationExecutionPortInterfaceEntryEditor(String tab,
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

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createDescription_GeneralTab_Editor(), false);

			addPropertyEditor(createMessageType_GeneralTab_Editor(), false);

			addPropertyEditor(createMinimumCommitTime_GeneralTab_Editor(),
					false);

			addPropertyEditor(createTimeForDecision_GeneralTab_Editor(), false);

			addPropertyEditor(createTimeForExecutionPhase_GeneralTab_Editor(),
					false);

			addPropertyEditor(createReturnValues_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addPropertyEditor(createDescription_GeneralTab_Editor(), false);

			addPropertyEditor(createMessageType_GeneralTab_Editor(), false);

			addPropertyEditor(createMinimumCommitTime_GeneralTab_Editor(),
					false);

			addPropertyEditor(createTimeForDecision_GeneralTab_Editor(), false);

			addPropertyEditor(createTimeForExecutionPhase_GeneralTab_Editor(),
					false);

			addPropertyEditor(createReturnValues_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory(
					"de.uni_paderborn.fujaba.properties.category.Lists",
					createExtension_ExtensionsTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMinimumCommitTime_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createMinimumCommitTime_GeneralTab_Editor() {
		if (this.editorMinimumCommitTime_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPortInterfaceEntry_MinimumCommitTime();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("If the component confirmed to the parent that it can execute the requested\nreconfiguration, the commit time denotes how long the component may stick\nto that confirmation. The minimum commit time sets a lower bound to this value.\nIt is required for analyzing the reconfiguration behavior.");

			this.editorMinimumCommitTime_GeneralTab = editor;
		}
		return this.editorMinimumCommitTime_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTimeForDecision_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createTimeForDecision_GeneralTab_Editor() {
		if (this.editorTimeForDecision_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPortInterfaceEntry_TimeForDecision();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The time that is needed by the component for deciding whether the reconfiguration\nthat is offered by this interface entry can be executed.");

			this.editorTimeForDecision_GeneralTab = editor;
		}
		return this.editorTimeForDecision_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTimeForExecutionPhase_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createTimeForExecutionPhase_GeneralTab_Editor() {
		if (this.editorTimeForExecutionPhase_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPortInterfaceEntry_TimeForExecutionPhase();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The time that is needed by the component for executing the reconfiguration\nthat is offered by this interface entry. The time for execution is specified an\nExecutionTimeSpecification because it depends on the particular execution\nprocedure. Currently, we support single-phase and three-phase execution.");

			this.editorTimeForExecutionPhase_GeneralTab = editor;
		}
		return this.editorTimeForExecutionPhase_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReturnValues_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createReturnValues_GeneralTab_Editor() {
		if (this.editorReturnValues_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationExecutionPortInterfaceEntry_ReturnValues();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorReturnValues_GeneralTab = editor;
		}
		return this.editorReturnValues_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDescription_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createDescription_GeneralTab_Editor() {
		if (this.editorDescription_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationPortInterfaceEntry_Description();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("A human readable description of this reconfiguration port interface entry. \nThis description is to be used by a developer.");

			this.editorDescription_GeneralTab = editor;
		}
		return this.editorDescription_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMessageType_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createMessageType_GeneralTab_Editor() {
		if (this.editorMessageType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationPortInterfaceEntry_MessageType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The reconfiguration message type that is specified by the reconfiguration \nport interface entry.");

			this.editorMessageType_GeneralTab = editor;
		}
		return this.editorMessageType_GeneralTab;
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

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurationExecutionPortInterfaceEntryEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationExecutionPortInterfaceEntry());
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
			return new ReconfigurationExecutionPortInterfaceEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
