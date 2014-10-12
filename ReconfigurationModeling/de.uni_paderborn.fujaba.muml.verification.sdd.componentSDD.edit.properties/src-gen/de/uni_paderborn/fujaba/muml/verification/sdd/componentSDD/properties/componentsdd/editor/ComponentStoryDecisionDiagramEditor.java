package de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.properties.componentsdd.editor;

/**
 * @generated
 */
public class ComponentStoryDecisionDiagramEditor
		extends
			de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor.StructuralConditionEditor {

	/**
	 * @generated
	 */
	public ComponentStoryDecisionDiagramEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addInvariantSDD_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addInvariantSDD_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createInvariantSDD_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createInvariantSDD_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
				.getComponentStoryDecisionDiagram_InvariantSDD();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("Defines whether this ComponentStoryDecisionDiagram must hold invariantly for all instances of a ReconfigurableComponent. If invariantSDD is false, then this ComponentStoryDecisionDiagram may evaluate to false for some instances.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ComponentStoryDecisionDiagramEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.verification.sdd.componentSDD.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
						.getComponentStoryDecisionDiagram());
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
			return new ComponentStoryDecisionDiagramEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general"})
					.contains(tab);
		}
	}

}
