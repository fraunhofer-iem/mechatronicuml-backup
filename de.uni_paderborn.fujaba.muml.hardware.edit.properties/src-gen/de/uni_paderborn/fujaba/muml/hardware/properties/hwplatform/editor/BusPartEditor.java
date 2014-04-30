package de.uni_paderborn.fujaba.muml.hardware.properties.hwplatform.editor;

/**
 * @generated
 */
public class BusPartEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwplatform.editor.CommunicationMediaPartEditor {

	/**
	 * @generated
	 */
	public BusPartEditor(String tab,
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
			addConnectorEndpointConnectors_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.documentation".equals(getTab())) {
			addCommentableElementComment_DocumentationTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addConnectorEndpointConnectors_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorEndpointConnectors_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorEndpointConnectors_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorEndpoint_Connectors());

		editor.setTooltipMessage("The connectors attached to this endpoint.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addCommentableElementComment_DocumentationTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createCommentableElementComment_DocumentationTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementComment_DocumentationTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment(), true);

		editor.setTooltipMessage("The comment string that can be used to attach arbitrary information to CommentableElements.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public BusPartEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
						.getBusPart());
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
			return new BusPartEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.extensions", "property.tab.general",
							"property.tab.documentation"}).contains(tab);
		}
	}

}
