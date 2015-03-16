package de.uni_paderborn.fujaba.muml.properties.pattern.editor;

/**
 * @generated
 */
public class PlainTextualDescriptionAspectsEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PlainTextualDescriptionAspectsEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		addPropertyEditor(createOverview_GeneralTab_Editor(), false);

		addPropertyEditor(createContext_GeneralTab_Editor(), false);

		addPropertyEditor(createProblem_GeneralTab_Editor(), false);

		addPropertyEditor(createSolution_GeneralTab_Editor(), false);

		addPropertyEditor(createStructure_GeneralTab_Editor(), false);

		addPropertyEditor(createBehavior_GeneralTab_Editor(), false);

		addPropertyEditor(createExamples_GeneralTab_Editor(), false);

		addPropertyEditor(createConsequences_GeneralTab_Editor(), false);

		addPropertyEditor(createCombineability_GeneralTab_Editor(), false);

		addPropertyEditor(createVariants_GeneralTab_Editor(), false);

		addPropertyEditor(createAlternatives_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOverview_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createOverview_GeneralTab_Editor() {
		if (this.editorOverview_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Overview();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorOverview_GeneralTab = editor;
		}
		return this.editorOverview_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorContext_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createContext_GeneralTab_Editor() {
		if (this.editorContext_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Context();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorContext_GeneralTab = editor;
		}
		return this.editorContext_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorProblem_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createProblem_GeneralTab_Editor() {
		if (this.editorProblem_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Problem();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorProblem_GeneralTab = editor;
		}
		return this.editorProblem_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSolution_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createSolution_GeneralTab_Editor() {
		if (this.editorSolution_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Solution();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorSolution_GeneralTab = editor;
		}
		return this.editorSolution_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorStructure_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createStructure_GeneralTab_Editor() {
		if (this.editorStructure_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Structure();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorStructure_GeneralTab = editor;
		}
		return this.editorStructure_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBehavior_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createBehavior_GeneralTab_Editor() {
		if (this.editorBehavior_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Behavior();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorBehavior_GeneralTab = editor;
		}
		return this.editorBehavior_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExamples_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createExamples_GeneralTab_Editor() {
		if (this.editorExamples_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Examples();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorExamples_GeneralTab = editor;
		}
		return this.editorExamples_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorConsequences_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createConsequences_GeneralTab_Editor() {
		if (this.editorConsequences_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Consequences();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorConsequences_GeneralTab = editor;
		}
		return this.editorConsequences_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCombineability_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createCombineability_GeneralTab_Editor() {
		if (this.editorCombineability_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Combineability();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorCombineability_GeneralTab = editor;
		}
		return this.editorCombineability_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVariants_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createVariants_GeneralTab_Editor() {
		if (this.editorVariants_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Variants();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorVariants_GeneralTab = editor;
		}
		return this.editorVariants_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAlternatives_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createAlternatives_GeneralTab_Editor() {
		if (this.editorAlternatives_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getPlainTextualDescriptionAspects_Alternatives();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorAlternatives_GeneralTab = editor;
		}
		return this.editorAlternatives_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PlainTextualDescriptionAspectsEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
						.getPlainTextualDescriptionAspects());
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
			return new PlainTextualDescriptionAspectsEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
