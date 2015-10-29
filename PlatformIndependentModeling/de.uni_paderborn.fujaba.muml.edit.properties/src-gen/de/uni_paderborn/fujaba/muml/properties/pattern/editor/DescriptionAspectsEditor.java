
package de.uni_paderborn.fujaba.muml.properties.pattern.editor;

/**
 * @generated
 */
public class DescriptionAspectsEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

			addPropertyEditor(createEditorOverview_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorContext_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorProblem_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSolution_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorStructure_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorBehavior_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorExamples_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorConsequences_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorCombineability_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorVariants_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorAlternatives_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorVerification_properties_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description_Aspects

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorOverview_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorContext_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorProblem_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorSolution_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorStructure_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorBehavior_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorExamples_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorConsequences_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorCombineability_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorVariants_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorAlternatives_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorVerification_properties_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOverview_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOverview_GeneralTab_Editor() {
		if (this.editorOverview_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Overview();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorOverview_GeneralTab = editor;
		}
		return this.editorOverview_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorContext_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorContext_GeneralTab_Editor() {
		if (this.editorContext_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Context();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorContext_GeneralTab = editor;
		}
		return this.editorContext_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorProblem_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorProblem_GeneralTab_Editor() {
		if (this.editorProblem_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Problem();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorProblem_GeneralTab = editor;
		}
		return this.editorProblem_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSolution_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSolution_GeneralTab_Editor() {
		if (this.editorSolution_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Solution();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorSolution_GeneralTab = editor;
		}
		return this.editorSolution_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorStructure_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorStructure_GeneralTab_Editor() {
		if (this.editorStructure_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Structure();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorStructure_GeneralTab = editor;
		}
		return this.editorStructure_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBehavior_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBehavior_GeneralTab_Editor() {
		if (this.editorBehavior_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Behavior();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorBehavior_GeneralTab = editor;
		}
		return this.editorBehavior_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExamples_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExamples_GeneralTab_Editor() {
		if (this.editorExamples_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Examples();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorExamples_GeneralTab = editor;
		}
		return this.editorExamples_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorConsequences_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorConsequences_GeneralTab_Editor() {
		if (this.editorConsequences_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Consequences();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorConsequences_GeneralTab = editor;
		}
		return this.editorConsequences_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCombineability_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCombineability_GeneralTab_Editor() {
		if (this.editorCombineability_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Combineability();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorCombineability_GeneralTab = editor;
		}
		return this.editorCombineability_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVariants_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVariants_GeneralTab_Editor() {
		if (this.editorVariants_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Variants();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorVariants_GeneralTab = editor;
		}
		return this.editorVariants_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAlternatives_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAlternatives_GeneralTab_Editor() {
		if (this.editorAlternatives_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Alternatives();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorAlternatives_GeneralTab = editor;
		}
		return this.editorAlternatives_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVerification_properties_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVerification_properties_GeneralTab_Editor() {
		if (this.editorVerification_properties_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getDescriptionAspects_Verification_properties();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			this.editorVerification_properties_GeneralTab = editor;
		}
		return this.editorVerification_properties_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DescriptionAspectsEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE.getDescriptionAspects());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new DescriptionAspectsEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general"}).contains(tab);
		}
	}

}
