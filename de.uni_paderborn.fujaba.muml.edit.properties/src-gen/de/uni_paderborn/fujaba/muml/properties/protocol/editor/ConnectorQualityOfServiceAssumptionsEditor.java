package de.uni_paderborn.fujaba.muml.properties.protocol.editor;

public class ConnectorQualityOfServiceAssumptionsEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptionsEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConnectorQualityOfServiceAssumptionsMinMessageDelayEditor(null, true);

		addConnectorQualityOfServiceAssumptionsMaxMessageDelayEditor(null, true);

		addConnectorQualityOfServiceAssumptionsMessageLossPossibleEditor(null,
				true);

		super.initialize();
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
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions_MessageLossPossible());

	}

	//
	// Overwritten property settings
	//

}
