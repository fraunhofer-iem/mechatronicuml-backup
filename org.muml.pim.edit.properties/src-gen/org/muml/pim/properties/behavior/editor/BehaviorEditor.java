
package org.muml.pim.properties.behavior.editor;

/**
 * @generated
 */
public abstract class BehaviorEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public BehaviorEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorBehavioralElement_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOperations_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVariables_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorBehavioralElement_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOperations_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVariables_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBehavioralElement_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBehavioralElement_property_tab_generalTab_Editor() {
		if (this.editorBehavioralElement_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.behavior.BehaviorPackage.eINSTANCE
					.getBehavior_BehavioralElement();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The behavioral element this statechart belongs to.");

			this.editorBehavioralElement_property_tab_generalTab = editor;
		}
		return this.editorBehavioralElement_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOperations_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOperations_property_tab_generalTab_Editor() {
		if (this.editorOperations_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.behavior.BehaviorPackage.eINSTANCE
					.getBehavior_Operations();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"A behavior may define a set of operations as signatures of helper functions. These operations\nmay be called by the behavior specification and may access the variables of\nthe behavior specification. The operations are contained in the behavior.");

			this.editorOperations_property_tab_generalTab = editor;
		}
		return this.editorOperations_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVariables_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVariables_property_tab_generalTab_Editor() {
		if (this.editorVariables_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.behavior.BehaviorPackage.eINSTANCE
					.getBehavior_Variables();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"A behavior may define a set of variables in order to store data. The variables\nmay be accessed by various elements, e.g., operations and the behavior specification itself.\nThe variables are contained in the behavior.");

			this.editorVariables_property_tab_generalTab = editor;
		}
		return this.editorVariables_property_tab_generalTab;
	}

}
