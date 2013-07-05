package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public class ConnectorEndpointInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ConnectorEndpointInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConnectorEndpointInstanceConnectorInstancesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConnectorEndpointInstanceConnectorInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createConnectorEndpointInstanceConnectorInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConnectorEndpointInstanceConnectorInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getConnectorEndpointInstance_ConnectorInstances());

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
			return new ConnectorEndpointInstanceEditor();
		}
	}

}
