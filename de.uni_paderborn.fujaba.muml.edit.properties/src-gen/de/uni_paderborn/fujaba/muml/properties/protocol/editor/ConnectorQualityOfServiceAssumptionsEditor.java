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
	public ConnectorQualityOfServiceAssumptionsEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConnectorQualityOfServiceAssumptionsMinMessageDelayEditor(null,
				false);

		addConnectorQualityOfServiceAssumptionsMaxMessageDelayEditor(null,
				false);

		addConnectorQualityOfServiceAssumptionsMessageLossPossibleEditor(null,
				true);

		addCommentableElementCommentEditor(null, true);

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
	/**
	 * @generated
	 */
	protected void addCommentableElementCommentEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommentableElementCommentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementCommentEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment());

	}

	//
	// Overwritten property settings
	//

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ConnectorQualityOfServiceAssumptionsEditor();
		}
	}

}
