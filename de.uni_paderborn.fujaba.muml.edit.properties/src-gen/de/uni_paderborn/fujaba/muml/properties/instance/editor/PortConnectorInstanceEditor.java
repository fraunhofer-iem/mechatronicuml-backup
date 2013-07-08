package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class PortConnectorInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.ConnectorInstanceEditor {

	/**
	 * @generated
	 */
	public PortConnectorInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addPortConnectorInstancePortInstancesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addPortConnectorInstancePortInstancesEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPortConnectorInstancePortInstancesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPortConnectorInstancePortInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getPortConnectorInstance_PortInstances());

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
			return new PortConnectorInstanceEditor();
		}
	}

}
