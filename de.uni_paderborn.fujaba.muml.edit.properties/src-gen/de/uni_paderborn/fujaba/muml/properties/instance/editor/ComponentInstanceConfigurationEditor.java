package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class ComponentInstanceConfigurationEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addComponentInstanceConfigurationComponentInstances_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addComponentInstanceConfigurationPortConnectorInstances_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addComponentInstanceConfigurationParentStructuredComponentInstance_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addNamedElementName_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addComponentInstanceConfigurationComponentInstances_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createComponentInstanceConfigurationComponentInstances_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstanceConfigurationComponentInstances_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstanceConfiguration_ComponentInstances());

		editor.setTooltipMessage("The set of component instances of a component instance configuration.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addComponentInstanceConfigurationPortConnectorInstances_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createComponentInstanceConfigurationPortConnectorInstances_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstanceConfigurationPortConnectorInstances_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstanceConfiguration_PortConnectorInstances());

		editor.setTooltipMessage("The set of connector instances of a component instance configuration.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addComponentInstanceConfigurationParentStructuredComponentInstance_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createComponentInstanceConfigurationParentStructuredComponentInstance_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComponentInstanceConfigurationParentStructuredComponentInstance_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstanceConfiguration_ParentStructuredComponentInstance());

		editor.setTooltipMessage("A structured component instance embeds a component instance configuration\nthat defines its inner structure. For such component instance configuration,\nthis reference points to the containing structured component instance. If this\ncomponent instance configuration is not contained in a structured component\ninstance, this reference is null.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addNamedElementName_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createNamedElementName_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createNamedElementName_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getNamedElement_Name(), false);

		editor.setTooltipMessage("The name attribute of a meta-model element.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ComponentInstanceConfigurationEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getComponentInstanceConfiguration());
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
			return new ComponentInstanceConfigurationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general"})
					.contains(tab);
		}
	}

}
