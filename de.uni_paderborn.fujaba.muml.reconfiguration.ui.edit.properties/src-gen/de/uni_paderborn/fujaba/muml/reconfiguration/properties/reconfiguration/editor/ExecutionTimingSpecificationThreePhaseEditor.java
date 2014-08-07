package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ExecutionTimingSpecificationThreePhaseEditor
		extends
			de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor.ExecutionTimingSpecificationEditor {

	/**
	 * @generated
	 */
	public ExecutionTimingSpecificationThreePhaseEditor(String tab,
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
			addExecutionTimingSpecificationThreePhaseTimeForFading_GeneralTab_Editor(
					null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addExecutionTimingSpecificationThreePhaseTimeForSetup_GeneralTab_Editor(
					null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addExecutionTimingSpecificationThreePhaseTimeForTeardown_GeneralTab_Editor(
					null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addExecutionTimingSpecificationThreePhaseTimeForFading_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createExecutionTimingSpecificationThreePhaseTimeForFading_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExecutionTimingSpecificationThreePhaseTimeForFading_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getExecutionTimingSpecificationThreePhase_TimeForFading());

		editor.setTooltipMessage("The time needed for executing the fading function.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addExecutionTimingSpecificationThreePhaseTimeForSetup_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createExecutionTimingSpecificationThreePhaseTimeForSetup_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExecutionTimingSpecificationThreePhaseTimeForSetup_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getExecutionTimingSpecificationThreePhase_TimeForSetup());

		editor.setTooltipMessage("The time needed for executing the setup phase.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addExecutionTimingSpecificationThreePhaseTimeForTeardown_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createExecutionTimingSpecificationThreePhaseTimeForTeardown_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExecutionTimingSpecificationThreePhaseTimeForTeardown_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getExecutionTimingSpecificationThreePhase_TimeForTeardown());

		editor.setTooltipMessage("The time needed for executing the teardown phase.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ExecutionTimingSpecificationThreePhaseEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getExecutionTimingSpecificationThreePhase());
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
			return new ExecutionTimingSpecificationThreePhaseEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
