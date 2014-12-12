package de.uni_paderborn.fujaba.muml.pattern.model.properties.pattern.editor;

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
		super.createProperties();

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addOverview_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addContext_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProblem_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addSolution_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStructure_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addBehavior_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addExamples_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConsequences_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addCombineability_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addVariants_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addAlternatives_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addOverview_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createOverview_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createOverview_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Overview();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addContext_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createContext_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createContext_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Context();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProblem_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createProblem_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProblem_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Problem();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addSolution_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createSolution_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createSolution_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Solution();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStructure_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createStructure_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createStructure_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Structure();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addBehavior_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createBehavior_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createBehavior_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Behavior();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addExamples_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createExamples_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExamples_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Examples();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addConsequences_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createConsequences_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConsequences_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Consequences();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCombineability_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createCombineability_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCombineability_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Combineability();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addVariants_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createVariants_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createVariants_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Variants();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addAlternatives_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createAlternatives_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createAlternatives_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = pattern.PatternPackage.eINSTANCE
				.getPlainTextualDescriptionAspects_Alternatives();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory, feature, false);

		editor.setTooltipMessage("\\todosd{document!}");

		return editor;

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
				de.uni_paderborn.fujaba.muml.pattern.model.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(), pattern.PatternPackage.eINSTANCE
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
