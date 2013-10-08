package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class ClockConstraintEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public ClockConstraintEditor(String tab,
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

		addClockConstraintBoundEditor(null, false);

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addClockConstraintClockEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addClockConstraintOperatorEditor(null, true);
		}

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
	protected void addClockConstraintClockEditor(String category, boolean front) {
		addEditorToCategory(category, createClockConstraintClockEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createClockConstraintClockEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getClockConstraint_Clock());

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
		return new de.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getClockConstraint_Operator());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ClockConstraintEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getClockConstraint());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new ClockConstraintEditor(tab);
		}
	}

}
