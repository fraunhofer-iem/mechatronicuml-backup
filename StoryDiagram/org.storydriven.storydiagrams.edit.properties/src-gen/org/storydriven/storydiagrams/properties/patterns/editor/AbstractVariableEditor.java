
package org.storydriven.storydiagrams.properties.patterns.editor;

/**
 * @generated
 */
public abstract class AbstractVariableEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public AbstractVariableEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorBindingState_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorIncomingLink_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorBindingState_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorIncomingLink_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingState_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingState_property_tab_generalTab_Editor() {
		if (this.editorBindingState_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
					.getAbstractVariable_BindingState();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The binding state defines whether the variable is already bound or whether a match has to be obtained for it. The default value is \"unbound\".");

			this.editorBindingState_property_tab_generalTab = editor;
		}
		return this.editorBindingState_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingLink_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncomingLink_property_tab_generalTab_Editor() {
		if (this.editorIncomingLink_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
					.getAbstractVariable_IncomingLink();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorIncomingLink_property_tab_generalTab = editor;
		}
		return this.editorIncomingLink_property_tab_generalTab;
	}

}
