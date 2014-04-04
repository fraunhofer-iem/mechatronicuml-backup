package de.uni_paderborn.fujaba.muml.properties.protocol.editor;

/**
 * @generated
 */
public class ConnectorQualityOfServiceAssumptionsEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptionsEditor(String tab,
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
			addConnectorQualityOfServiceAssumptionsMinMessageDelayEditor(null,
					false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConnectorQualityOfServiceAssumptionsMaxMessageDelayEditor(null,
					false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addConnectorQualityOfServiceAssumptionsMessageLossPossibleEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addConnectorQualityOfServiceAssumptionsMinMessageDelayEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createConnectorQualityOfServiceAssumptionsMinMessageDelayEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorQualityOfServiceAssumptionsMinMessageDelayEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions_MinMessageDelay());

		editor.setTooltipMessage("The minimal time a message needs from the sender to the receiver using this connector.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addConnectorQualityOfServiceAssumptionsMaxMessageDelayEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createConnectorQualityOfServiceAssumptionsMaxMessageDelayEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorQualityOfServiceAssumptionsMaxMessageDelayEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions_MaxMessageDelay());

		editor.setTooltipMessage("The maximal time a message needs from the sender to the receiver using this connector.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addConnectorQualityOfServiceAssumptionsMessageLossPossibleEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createConnectorQualityOfServiceAssumptionsMessageLossPossibleEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createConnectorQualityOfServiceAssumptionsMessageLossPossibleEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions_MessageLossPossible());

		editor.setTooltipMessage("Defines if messages that are send using this connector may be lost during transport.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptionsEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions());
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
			return new ConnectorQualityOfServiceAssumptionsEditor(tab);
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
