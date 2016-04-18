
package org.muml.storydiagram.properties.patterns.editor;

/**
 * @generated
 */
public class CollectionVariableEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CollectionVariableEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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

			addPropertyEditor(createEditorIncomingLinks_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLinkOrderConstraints_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBindingSemantics_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBindingOperator_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOutgoingLinks_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorAtLeastOne_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUnique_property_tab_generalTab_Editor(),
					false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorBindingState_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorIncomingLinks_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLinkOrderConstraints_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBindingSemantics_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBindingOperator_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOutgoingLinks_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans",
					createEditorAtLeastOne_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUnique_property_tab_generalTab_Editor(),
					false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAtLeastOne_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAtLeastOne_property_tab_generalTab_Editor() {
		if (this.editorAtLeastOne_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getCollectionVariable_AtLeastOne();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorAtLeastOne_property_tab_generalTab = editor;
		}
		return this.editorAtLeastOne_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUnique_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUnique_property_tab_generalTab_Editor() {
		if (this.editorUnique_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getCollectionVariable_Unique();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			this.editorUnique_property_tab_generalTab = editor;
		}
		return this.editorUnique_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLinkOrderConstraints_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLinkOrderConstraints_property_tab_generalTab_Editor() {
		if (this.editorLinkOrderConstraints_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getObjectVariable_LinkOrderConstraints();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorLinkOrderConstraints_property_tab_generalTab = editor;
		}
		return this.editorLinkOrderConstraints_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingSemantics_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingSemantics_property_tab_generalTab_Editor() {
		if (this.editorBindingSemantics_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getObjectVariable_BindingSemantics();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The binding semantics defines whether the object must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern.");

			this.editorBindingSemantics_property_tab_generalTab = editor;
		}
		return this.editorBindingSemantics_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingOperator_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingOperator_property_tab_generalTab_Editor() {
		if (this.editorBindingOperator_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getObjectVariable_BindingOperator();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The binding operator defines whether this object will be matched, created or destroyed by the story pattern.");

			this.editorBindingOperator_property_tab_generalTab = editor;
		}
		return this.editorBindingOperator_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutgoingLinks_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOutgoingLinks_property_tab_generalTab_Editor() {
		if (this.editorOutgoingLinks_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getObjectVariable_OutgoingLinks();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorOutgoingLinks_property_tab_generalTab = editor;
		}
		return this.editorOutgoingLinks_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingState_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingState_property_tab_generalTab_Editor() {
		if (this.editorBindingState_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractVariable_BindingState();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The binding state defines whether the variable is already bound or whether a match has to be obtained for it. The default value is \"unbound\".");

			this.editorBindingState_property_tab_generalTab = editor;
		}
		return this.editorBindingState_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingLinks_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncomingLinks_property_tab_generalTab_Editor() {
		if (this.editorIncomingLinks_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractVariable_IncomingLinks();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorIncomingLinks_property_tab_generalTab = editor;
		}
		return this.editorIncomingLinks_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CollectionVariableEditor(String tab) {
		this(tab, org.muml.storydiagram.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE.getCollectionVariable());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new CollectionVariableEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general"}).contains(tab);
		}
	}

}
