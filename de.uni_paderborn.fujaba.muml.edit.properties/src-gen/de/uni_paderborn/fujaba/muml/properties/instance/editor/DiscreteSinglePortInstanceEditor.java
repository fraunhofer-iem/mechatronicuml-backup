package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class DiscreteSinglePortInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.instance.editor.DiscretePortInstanceEditor {

	/**
	 * @generated
	 */
	public DiscreteSinglePortInstanceEditor(String tab,
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
			addDiscreteSingleInteractionEndpointInstanceMultiInteractionEndpointInstance_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteSingleInteractionEndpointInstanceNext_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addDiscreteSingleInteractionEndpointInstancePrevious_GeneralTab_Editor(
					null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addDiscreteSingleInteractionEndpointInstanceMultiInteractionEndpointInstance_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteSingleInteractionEndpointInstanceMultiInteractionEndpointInstance_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteSingleInteractionEndpointInstanceMultiInteractionEndpointInstance_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteSingleInteractionEndpointInstance_MultiInteractionEndpointInstance());

		editor.setTooltipMessage("If this is an instance of a multi discrete interaction endpoint, refers to the corresponding multi instance.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteSingleInteractionEndpointInstanceNext_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteSingleInteractionEndpointInstanceNext_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteSingleInteractionEndpointInstanceNext_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteSingleInteractionEndpointInstance_Next());

		editor.setTooltipMessage("If this is an instance of a multi discrete interaction endpoint, refers to the next single instance.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addDiscreteSingleInteractionEndpointInstancePrevious_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteSingleInteractionEndpointInstancePrevious_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteSingleInteractionEndpointInstancePrevious_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteSingleInteractionEndpointInstance_Previous());

		editor.setTooltipMessage("If this is an instance of a multi discrete interaction endpoint, refers to the previous single instance.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DiscreteSinglePortInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getDiscreteSinglePortInstance());
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
			return new DiscreteSinglePortInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
