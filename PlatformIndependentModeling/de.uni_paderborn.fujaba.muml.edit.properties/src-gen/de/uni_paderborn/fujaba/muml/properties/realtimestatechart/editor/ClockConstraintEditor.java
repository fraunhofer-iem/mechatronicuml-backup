
package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class ClockConstraintEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorBound_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorClock_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorOperator_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorBound_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorClock_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorOperator_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_ExtensionsTab_Editor(), false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBound_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBound_GeneralTab_Editor() {
		if (this.editorBound_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClockConstraint_Bound();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The bound of a deadline (upper or lower) is a natural number.");

			this.editorBound_GeneralTab = editor;
		}
		return this.editorBound_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClock_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorClock_GeneralTab_Editor() {
		if (this.editorClock_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClockConstraint_Clock();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The clock references in this clock constraint.");

			this.editorClock_GeneralTab = editor;
		}
		return this.editorClock_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOperator_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOperator_GeneralTab_Editor() {
		if (this.editorOperator_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getClockConstraint_Operator();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The operator that is used in this clock constraint.");

			this.editorOperator_GeneralTab = editor;
		}
		return this.editorOperator_GeneralTab;
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
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ClockConstraintEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.extensions"}).contains(tab);
		}
	}

}
