
package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config.properties.config.editor;

/**
 * @generated
 */
public class Opt4jConfigurationEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public Opt4jConfigurationEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(
					createEditorPopulationSize_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

			addPropertyEditor(
					createEditorGenerations_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

			addPropertyEditor(
					createEditorParents_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

			addPropertyEditor(
					createEditorOffspring_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

			addPropertyEditor(
					createEditorNoDominatedSolutions_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

		} else if ("de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config".equals(tab)) { // Tab Opt4j Configuration

			addPropertyEditor(
					createEditorPopulationSize_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

			addPropertyEditor(
					createEditorGenerations_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

			addPropertyEditor(
					createEditorParents_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

			addPropertyEditor(
					createEditorOffspring_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

			addPropertyEditor(
					createEditorNoDominatedSolutions_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor(),
					false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPopulationSize_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPopulationSize_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor() {
		if (this.editorPopulationSize_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config.ConfigPackage.eINSTANCE
					.getOpt4jConfiguration_PopulationSize();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage("The size of the EA population.");

			this.editorPopulationSize_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab = editor;
		}
		return this.editorPopulationSize_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorGenerations_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorGenerations_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor() {
		if (this.editorGenerations_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config.ConfigPackage.eINSTANCE
					.getOpt4jConfiguration_Generations();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage("The number of generations (a.k.a. number of iterations).");

			this.editorGenerations_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab = editor;
		}
		return this.editorGenerations_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParents_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParents_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor() {
		if (this.editorParents_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config.ConfigPackage.eINSTANCE
					.getOpt4jConfiguration_Parents();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage("The number of parents that are used for mating.");

			this.editorParents_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab = editor;
		}
		return this.editorParents_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOffspring_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOffspring_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor() {
		if (this.editorOffspring_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config.ConfigPackage.eINSTANCE
					.getOpt4jConfiguration_Offspring();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage("The number of new individuals per generation.");

			this.editorOffspring_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab = editor;
		}
		return this.editorOffspring_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorNoDominatedSolutions_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorNoDominatedSolutions_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab_Editor() {
		if (this.editorNoDominatedSolutions_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config.ConfigPackage.eINSTANCE
					.getOpt4jConfiguration_NoDominatedSolutions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"No solution is (weakly) dominated by another solution.\nThat is, each solution is optimal. Note: the objective function, which\nis defined in the allocation problem, is ignored.");

			this.editorNoDominatedSolutions_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab = editor;
		}
		return this.editorNoDominatedSolutions_de_uni_paderborn_fujaba_muml_allocation_algorithm_ilp_opt4j_configTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public Opt4jConfigurationEditor(String tab) {
		this(tab,
				de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config.ConfigPackage.eINSTANCE
						.getOpt4jConfiguration());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new Opt4jConfigurationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config",
							"de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config",
							"de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config",
							"de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config",
							"de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.config"})
					.contains(tab);
		}
	}

}
