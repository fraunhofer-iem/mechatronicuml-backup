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

		addSubCategory(
				"de.uni_paderborn.fujaba.properties.category.Message Delay",
				"Message Delay", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMinMessageDelay_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Message Delay",
					false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMaxMessageDelay_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Message Delay",
					false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMessageLossPossible_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addMinMessageDelay_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createMinMessageDelay_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMinMessageDelay_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getConnectorQualityOfServiceAssumptions_MinMessageDelay();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The minimal time a message needs from the sender to the receiver using this connector.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addMaxMessageDelay_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createMaxMessageDelay_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMaxMessageDelay_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getConnectorQualityOfServiceAssumptions_MaxMessageDelay();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The maximal time a message needs from the sender to the receiver using this connector.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addMessageLossPossible_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createMessageLossPossible_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMessageLossPossible_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
				.getConnectorQualityOfServiceAssumptions_MessageLossPossible();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory, feature);

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
