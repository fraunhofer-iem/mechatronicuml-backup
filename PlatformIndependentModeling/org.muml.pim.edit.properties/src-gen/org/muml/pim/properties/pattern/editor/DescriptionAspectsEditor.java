
package org.muml.pim.properties.pattern.editor;

/**
 * @generated
 */
public class DescriptionAspectsEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DescriptionAspectsEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorAlsoKnownAs_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOverview_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorContext_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorProblem_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSolution_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorStructure_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBehavior_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVerification_properties_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorConsequences_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorExamples_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVariants_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAlternatives_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorCombineability_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSearchTerms_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorAlsoKnownAs_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOverview_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorContext_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorProblem_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSolution_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorStructure_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBehavior_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVerification_properties_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorConsequences_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorExamples_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVariants_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAlternatives_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorCombineability_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSearchTerms_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAlsoKnownAs_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAlsoKnownAs_property_tab_generalTab_Editor() {
		if (this.editorAlsoKnownAs_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_AlsoKnownAs();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the alternatives of the pattern.");

			this.editorAlsoKnownAs_property_tab_generalTab = editor;
		}
		return this.editorAlsoKnownAs_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOverview_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOverview_property_tab_generalTab_Editor() {
		if (this.editorOverview_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Overview();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the overview of the pattern.");

			this.editorOverview_property_tab_generalTab = editor;
		}
		return this.editorOverview_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorContext_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorContext_property_tab_generalTab_Editor() {
		if (this.editorContext_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Context();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the context of the pattern.");

			this.editorContext_property_tab_generalTab = editor;
		}
		return this.editorContext_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorProblem_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorProblem_property_tab_generalTab_Editor() {
		if (this.editorProblem_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Problem();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the problem of the pattern.");

			this.editorProblem_property_tab_generalTab = editor;
		}
		return this.editorProblem_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSolution_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSolution_property_tab_generalTab_Editor() {
		if (this.editorSolution_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Solution();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the solution of the pattern.");

			this.editorSolution_property_tab_generalTab = editor;
		}
		return this.editorSolution_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorStructure_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorStructure_property_tab_generalTab_Editor() {
		if (this.editorStructure_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Structure();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the structure of the pattern.");

			this.editorStructure_property_tab_generalTab = editor;
		}
		return this.editorStructure_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBehavior_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBehavior_property_tab_generalTab_Editor() {
		if (this.editorBehavior_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Behavior();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the behavior of the pattern.");

			this.editorBehavior_property_tab_generalTab = editor;
		}
		return this.editorBehavior_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVerification_properties_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVerification_properties_property_tab_generalTab_Editor() {
		if (this.editorVerification_properties_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Verification_properties();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the verification properties of the pattern.");

			this.editorVerification_properties_property_tab_generalTab = editor;
		}
		return this.editorVerification_properties_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorConsequences_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorConsequences_property_tab_generalTab_Editor() {
		if (this.editorConsequences_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Consequences();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the consequences of the pattern.");

			this.editorConsequences_property_tab_generalTab = editor;
		}
		return this.editorConsequences_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExamples_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExamples_property_tab_generalTab_Editor() {
		if (this.editorExamples_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Examples();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the examples of the pattern.");

			this.editorExamples_property_tab_generalTab = editor;
		}
		return this.editorExamples_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVariants_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVariants_property_tab_generalTab_Editor() {
		if (this.editorVariants_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Variants();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the variants of the pattern.");

			this.editorVariants_property_tab_generalTab = editor;
		}
		return this.editorVariants_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAlternatives_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAlternatives_property_tab_generalTab_Editor() {
		if (this.editorAlternatives_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Alternatives();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the alternatives of the pattern.");

			this.editorAlternatives_property_tab_generalTab = editor;
		}
		return this.editorAlternatives_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCombineability_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCombineability_property_tab_generalTab_Editor() {
		if (this.editorCombineability_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Combineability();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the combineability of the pattern.");

			this.editorCombineability_property_tab_generalTab = editor;
		}
		return this.editorCombineability_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSearchTerms_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSearchTerms_property_tab_generalTab_Editor() {
		if (this.editorSearchTerms_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_SearchTerms();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("Describes the alternatives of the pattern.");

			this.editorSearchTerms_property_tab_generalTab = editor;
		}
		return this.editorSearchTerms_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DescriptionAspectsEditor(String tab) {
		this(tab, org.muml.pim.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.pim.pattern.PatternPackage.eINSTANCE.getDescriptionAspects());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new DescriptionAspectsEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
