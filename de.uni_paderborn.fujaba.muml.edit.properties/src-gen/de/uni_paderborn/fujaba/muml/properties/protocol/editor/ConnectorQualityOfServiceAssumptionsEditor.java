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
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptionsEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addConnectorQualityOfServiceAssumptionsMinMessageDelayEditor(null,
				false);

		addConnectorQualityOfServiceAssumptionsMaxMessageDelayEditor(null,
				false);

		addConnectorQualityOfServiceAssumptionsMessageLossPossibleEditor(
				"de.fujaba.properties.category.Booleans", true);

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
