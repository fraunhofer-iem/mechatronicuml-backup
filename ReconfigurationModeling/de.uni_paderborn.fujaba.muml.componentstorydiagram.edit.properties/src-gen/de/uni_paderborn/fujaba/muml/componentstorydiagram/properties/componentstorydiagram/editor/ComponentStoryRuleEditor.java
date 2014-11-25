package de.uni_paderborn.fujaba.muml.componentstorydiagram.properties.componentstorydiagram.editor;

/**
 * @generated
 */
public class ComponentStoryRuleEditor
		extends
			de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor.ReconfigurationRuleEditor {

	/**
	 * @generated
	 */
	public ComponentStoryRuleEditor(String tab,
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
			addConstructor_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addConstructor_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createConstructor_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConstructor_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
				.getComponentStoryRule_Constructor();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("Defines whether this ComponentStoryRule is a constructor (true) or not (false). A constructor may be invoked when a component instance\nis created. In a constructor, all variables need to have binding operator CREATE.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ComponentStoryRuleEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
						.getComponentStoryRule());
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
			return new ComponentStoryRuleEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
