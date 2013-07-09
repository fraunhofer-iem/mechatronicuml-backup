package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public class ConnectorInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ConnectorInstanceEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConnectorInstanceConnectorEndpointInstancesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConnectorInstanceConnectorEndpointInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorInstanceConnectorEndpointInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorInstanceConnectorEndpointInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorInstance_ConnectorEndpointInstances());

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new ConnectorInstanceEditor();
		}
	}

}
