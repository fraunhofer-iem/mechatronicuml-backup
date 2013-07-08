package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class ClockConstraintEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ClockConstraintEditor() {
		super(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addClockConstraintBoundEditor(null, false);

		addClockConstraintOperatorEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addClockConstraintBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createClockConstraintBoundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createClockConstraintBoundEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getClockConstraint_Bound());

	}
	/**
	 * @generated
	 */
	protected void addClockConstraintOperatorEditor(String category,
			boolean front) {
		addEditorToCategory(category, createClockConstraintOperatorEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createClockConstraintOperatorEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getClockConstraint_Operator());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ClockConstraintEditor();
		}
	}

}
