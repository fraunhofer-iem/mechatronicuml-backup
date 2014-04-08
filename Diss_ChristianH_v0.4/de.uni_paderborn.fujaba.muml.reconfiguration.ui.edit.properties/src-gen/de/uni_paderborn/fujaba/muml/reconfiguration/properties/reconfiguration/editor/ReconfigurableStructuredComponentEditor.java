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
			addReconfigurableStructuredComponentInitialConfigurationEditor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStructuredComponentConnectorsEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addReconfigurableStructuredComponentInitialConfigurationEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createReconfigurableStructuredComponentInitialConfigurationEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurableStructuredComponentInitialConfigurationEditor() {
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
	protected void addStructuredComponentConnectorsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createStructuredComponentConnectorsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createStructuredComponentConnectorsEditor() {
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
