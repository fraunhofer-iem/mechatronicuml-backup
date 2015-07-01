
package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class AbsoluteDeadlineEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public AbsoluteDeadlineEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorUpperBound_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLowerBound_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorClock_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorUpperBound_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLowerBound_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorClock_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClock_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorClock_GeneralTab_Editor() {
		if (this.editorClock_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getAbsoluteDeadline_Clock();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("the references clock of the absolute deadline.");

			this.editorClock_GeneralTab = editor;
		}
		return this.editorClock_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUpperBound_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUpperBound_GeneralTab_Editor() {
		if (this.editorUpperBound_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getDeadline_UpperBound();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The upper bound of a deadline is a natural number.");

			this.editorUpperBound_GeneralTab = editor;
		}
		return this.editorUpperBound_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLowerBound_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLowerBound_GeneralTab_Editor() {
		if (this.editorLowerBound_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getDeadline_LowerBound();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The lower bound of a deadline is a natural number.");

			this.editorLowerBound_GeneralTab = editor;
		}
		return this.editorLowerBound_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public AbsoluteDeadlineEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getAbsoluteDeadline());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new AbsoluteDeadlineEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general", "property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
