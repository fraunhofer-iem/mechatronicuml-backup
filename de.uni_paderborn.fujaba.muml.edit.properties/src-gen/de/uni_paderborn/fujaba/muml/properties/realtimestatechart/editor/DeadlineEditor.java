package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public abstract class DeadlineEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DeadlineEditor(String tab,
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
			addDeadlineUpperBoundEditor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDeadlineLowerBoundEditor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addDeadlineUpperBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createDeadlineUpperBoundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDeadlineUpperBoundEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getDeadline_UpperBound());

		editor.setTooltipMessage("The upper bound of a deadline is a natural number.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDeadlineLowerBoundEditor(String category, boolean front) {
		addEditorToCategory(category, createDeadlineLowerBoundEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDeadlineLowerBoundEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getDeadline_LowerBound());

		editor.setTooltipMessage("The lower bound of a deadline is a natural number.");

		return editor;

	}

}
