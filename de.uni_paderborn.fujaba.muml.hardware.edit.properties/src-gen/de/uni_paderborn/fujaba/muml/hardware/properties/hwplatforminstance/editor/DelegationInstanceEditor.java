package de.uni_paderborn.fujaba.muml.hardware.properties.hwplatforminstance.editor;

/**
 * @generated
 */
public class DelegationInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwplatforminstance.editor.NetworkingHardwareInstanceEditor {

	/**
	 * @generated
	 */
	public DelegationInstanceEditor(String tab,
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
			addConnectorInstanceType_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConnectorInstanceConnectorEndpointInstances_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.documentation".equals(getTab())) {
			addCommentableElementComment_DocumentationTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addConnectorInstanceType_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConnectorInstanceType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorInstanceType_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorInstance_Type());

		editor.setTooltipMessage("The connector that represents the type of this connector instance. May be undefined in case of a top level connector instance, which does not refer to a particular connector inside a structured component.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addConnectorInstanceConnectorEndpointInstances_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createConnectorInstanceConnectorEndpointInstances_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorInstanceConnectorEndpointInstances_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorInstance_ConnectorEndpointInstances());

		editor.setTooltipMessage("The connector endpoint instances connected by this connector instance.");

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
	public DelegationInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage.eINSTANCE
						.getDelegationInstance());
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
			return new DelegationInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.extensions",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation"}).contains(tab);
		}
	}

}
