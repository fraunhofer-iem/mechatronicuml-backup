package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class PortPartEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.ConnectorEndpointEditor {

	/**
	 * @generated
	 */
	public PortPartEditor(String tab,
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
			addPortPartPortType_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPortPartComponentPart_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPortPartCoordinationProtocolPart_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPortPartPortType_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPortPartPortType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPortPartPortType_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getPortPart_PortType());

		editor.setTooltipMessage("The port of the component that is represented by this PortPart.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPortPartComponentPart_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPortPartComponentPart_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPortPartComponentPart_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getPortPart_ComponentPart());

		editor.setTooltipMessage("The component part that contains this PortPart. The port reference by the \nportType reference needs to be contained in the component that is referenced\nby this reference.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addPortPartCoordinationProtocolPart_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPortPartCoordinationProtocolPart_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPortPartCoordinationProtocolPart_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getPortPart_CoordinationProtocolPart());

		editor.setTooltipMessage("If the port type refines a role, this part refers to the enclosing coordination protocol.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PortPartEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getPortPart());
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
			return new PortPartEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
