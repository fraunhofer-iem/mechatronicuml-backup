package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public class ConnectorEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ConnectorEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConnectorConnectorEndpointsEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConnectorConnectorEndpointsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConnectorConnectorEndpointsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorConnectorEndpointsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnector_ConnectorEndpoints());

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ConnectorEditor();
		}
	}

}
