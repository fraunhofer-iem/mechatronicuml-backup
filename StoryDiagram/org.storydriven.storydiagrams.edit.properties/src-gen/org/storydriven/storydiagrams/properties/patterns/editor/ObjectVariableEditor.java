package org.storydriven.storydiagrams.properties.patterns.editor;

/**
 * @generated
 */
public class ObjectVariableEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ObjectVariableEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorBindingState_GeneralTab_Editor(),
					false);

			addPropertyEditor(createEditorIncomingLink_GeneralTab_Editor(),
					false);

			addPropertyEditor(createEditorOutgoingLink_GeneralTab_Editor(),
					false);

			addPropertyEditor(createEditorBindingSemantics_GeneralTab_Editor(),
					false);

			addPropertyEditor(createEditorBindingOperator_GeneralTab_Editor(),
					false);

			addPropertyEditor(createEditorClassifier_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutgoingLink_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOutgoingLink_GeneralTab_Editor() {
		if (this.editorOutgoingLink_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
					.getObjectVariable_OutgoingLink();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorOutgoingLink_GeneralTab = editor;
		}
		return this.editorOutgoingLink_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingSemantics_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingSemantics_GeneralTab_Editor() {
		if (this.editorBindingSemantics_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
					.getObjectVariable_BindingSemantics();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The binding semantics defines whether the object must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern.");

			this.editorBindingSemantics_GeneralTab = editor;
		}
		return this.editorBindingSemantics_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingOperator_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingOperator_GeneralTab_Editor() {
		if (this.editorBindingOperator_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
					.getObjectVariable_BindingOperator();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The binding operator defines whether this object will be matched, created or destroyed by the story pattern.");

			this.editorBindingOperator_GeneralTab = editor;
		}
		return this.editorBindingOperator_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorClassifier_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorClassifier_GeneralTab_Editor() {
		if (this.editorClassifier_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
					.getObjectVariable_Classifier();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The type of this ObjectVariable, given as an EClass.");

			this.editorClassifier_GeneralTab = editor;
		}
		return this.editorClassifier_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingState_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingState_GeneralTab_Editor() {
		if (this.editorBindingState_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
					.getAbstractVariable_BindingState();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The binding state defines whether the variable is already bound or whether a match has to be obtained for it. The default value is \"unbound\".");

			this.editorBindingState_GeneralTab = editor;
		}
		return this.editorBindingState_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingLink_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncomingLink_GeneralTab_Editor() {
		if (this.editorIncomingLink_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
					.getAbstractVariable_IncomingLink();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorIncomingLink_GeneralTab = editor;
		}
		return this.editorIncomingLink_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ObjectVariableEditor(String tab) {
		this(
				tab,
				org.storydriven.storydiagrams.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.storydriven.storydiagrams.patterns.PatternsPackage.eINSTANCE
						.getObjectVariable());
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
			return new ObjectVariableEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
