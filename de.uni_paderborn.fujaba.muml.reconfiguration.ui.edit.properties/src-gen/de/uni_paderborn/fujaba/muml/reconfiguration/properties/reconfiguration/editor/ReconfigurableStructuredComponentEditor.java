package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ReconfigurableStructuredComponentEditor
		extends
			de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor.ReconfigurableComponentEditor {

	/**
	 * @generated
	 */
	public ReconfigurableStructuredComponentEditor(String tab,
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
			addReconfigurableStructuredComponentInitialConfiguration_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStructuredComponentConnectors_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addReconfigurableStructuredComponentInitialConfiguration_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createReconfigurableStructuredComponentInitialConfiguration_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurableStructuredComponentInitialConfiguration_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurableStructuredComponent_InitialConfiguration());

		editor.setTooltipMessage("The initial configurations that are supported by this component. If a component\nis instantiated, it takes of its initial configurations.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStructuredComponentConnectors_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createStructuredComponentConnectors_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createStructuredComponentConnectors_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getStructuredComponent_Connectors());

		editor.setTooltipMessage("The connectors this structured component contains. These can either be delegations or assemblies.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurableStructuredComponentEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurableStructuredComponent());
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
			return new ReconfigurableStructuredComponentEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.extensions",
							"property.tab.documentation",
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
