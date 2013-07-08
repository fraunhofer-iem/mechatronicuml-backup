package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class PortInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.ConnectorEndpointInstanceEditor {

	/**
	 * @generated
	 */
	public PortInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addPortInstancePortConnectorInstancesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addPortInstancePortConnectorInstancesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPortInstancePortConnectorInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPortInstancePortConnectorInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getPortInstance_PortConnectorInstances());

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
			return new PortInstanceEditor();
		}
	}

}
