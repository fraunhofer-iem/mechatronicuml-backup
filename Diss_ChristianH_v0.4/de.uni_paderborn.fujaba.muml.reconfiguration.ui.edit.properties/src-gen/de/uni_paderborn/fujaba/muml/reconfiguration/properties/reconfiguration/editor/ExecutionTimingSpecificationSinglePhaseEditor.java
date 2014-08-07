package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ExecutionTimingSpecificationSinglePhaseEditor
		extends
			de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor.ExecutionTimingSpecificationEditor {

	/**
	 * @generated
	 */
	public ExecutionTimingSpecificationSinglePhaseEditor(String tab,
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
			addExecutionTimingSpecificationSinglePhaseTimeForExecution_GeneralTab_Editor(
					null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addExecutionTimingSpecificationSinglePhaseTimeForExecution_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createExecutionTimingSpecificationSinglePhaseTimeForExecution_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExecutionTimingSpecificationSinglePhaseTimeForExecution_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getExecutionTimingSpecificationSinglePhase_TimeForExecution());

		editor.setTooltipMessage("The time necessary for executing a reconfiguration.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ExecutionTimingSpecificationSinglePhaseEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getExecutionTimingSpecificationSinglePhase());
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
			return new ExecutionTimingSpecificationSinglePhaseEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
