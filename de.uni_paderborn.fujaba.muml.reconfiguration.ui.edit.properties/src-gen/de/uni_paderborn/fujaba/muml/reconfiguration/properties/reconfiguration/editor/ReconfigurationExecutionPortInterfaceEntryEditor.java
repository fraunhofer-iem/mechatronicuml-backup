package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ReconfigurationExecutionPortInterfaceEntryEditor
		extends
			de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor.ReconfigurationPortInterfaceEntryEditor {

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
		super.createProperties();

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addReconfigurationExecutionPortInterfaceEntryMinimumCommitTime_GeneralTab_Editor(
					null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addReconfigurationExecutionPortInterfaceEntryTimeForDecision_GeneralTab_Editor(
					null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addReconfigurationExecutionPortInterfaceEntryTimeForExecutionPhase_GeneralTab_Editor(
					null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addReconfigurationExecutionPortInterfaceEntryMinimumCommitTime_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createReconfigurationExecutionPortInterfaceEntryMinimumCommitTime_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurationExecutionPortInterfaceEntryMinimumCommitTime_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationExecutionPortInterfaceEntry_MinimumCommitTime());

		editor.setTooltipMessage("If the component confirmed to the parent that it can execute the requested\nreconfiguration, the commit time denotes how long the component may stick\nto that confirmation. The minimum commit time sets a lower bound to this value.\nIt is required for analyzing the reconfiguration behavior.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addReconfigurationExecutionPortInterfaceEntryTimeForDecision_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createReconfigurationExecutionPortInterfaceEntryTimeForDecision_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurationExecutionPortInterfaceEntryTimeForDecision_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationExecutionPortInterfaceEntry_TimeForDecision());

		editor.setTooltipMessage("The time that is needed by the component for deciding whether the reconfiguration\nthat is offered by this interface entry can be executed.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addReconfigurationExecutionPortInterfaceEntryTimeForExecutionPhase_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createReconfigurationExecutionPortInterfaceEntryTimeForExecutionPhase_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurationExecutionPortInterfaceEntryTimeForExecutionPhase_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationExecutionPortInterfaceEntry_TimeForExecutionPhase());

		editor.setTooltipMessage("The time that is needed by the component for executing the reconfiguration\nthat is offered by this interface entry. The time for execution is specified an\nExecutionTimeSpecification because it depends on the particular execution\nprocedure. Currently, we support single-phase and three-phase execution.");

		return editor;

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
							"property.tab.extensions"}).contains(tab);
		}
	}

}
