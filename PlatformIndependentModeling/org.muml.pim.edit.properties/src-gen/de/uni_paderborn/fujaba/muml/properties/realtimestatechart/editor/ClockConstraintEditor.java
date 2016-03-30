
package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class ClockConstraintEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ClockConstraintEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorClock_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOperator_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBound_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorClock_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOperator_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBound_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClock_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorClock_property_tab_generalTab_Editor() {
		if (this.editorClock_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClockConstraint_Clock();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The clock references in this clock constraint.");

			this.editorClock_property_tab_generalTab = editor;
		}
		return this.editorClock_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOperator_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOperator_property_tab_generalTab_Editor() {
		if (this.editorOperator_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClockConstraint_Operator();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The operator that is used in this clock constraint.");

			this.editorOperator_property_tab_generalTab = editor;
		}
		return this.editorOperator_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBound_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBound_property_tab_generalTab_Editor() {
		if (this.editorBound_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClockConstraint_Bound();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The bound of a deadline (upper or lower) is a natural number.");

			this.editorBound_property_tab_generalTab = editor;
		}
		return this.editorBound_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_property_tab_extensionsTab_Editor() {
		if (this.editorExtension_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtension_property_tab_extensionsTab = editor;
		}
		return this.editorExtension_property_tab_extensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ClockConstraintEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getClockConstraint());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ClockConstraintEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.extensions"}).contains(tab);
		}
	}

}
