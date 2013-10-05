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

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addConnectorQualityOfServiceAssumptionsMinMessageDelayEditor(null,
				false);

		addConnectorQualityOfServiceAssumptionsMaxMessageDelayEditor(null,
				false);

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addConnectorQualityOfServiceAssumptionsMessageLossPossibleEditor(
					"de.fujaba.properties.category.Booleans", true);
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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorQualityOfServiceAssumptionsMinMessageDelayEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions_MinMessageDelay());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorQualityOfServiceAssumptionsMaxMessageDelayEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions_MaxMessageDelay());

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
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorQualityOfServiceAssumptionsMessageLossPossibleEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions_MessageLossPossible());

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
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new ConnectorQualityOfServiceAssumptionsEditor(tab);
		}
	}

}
