package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class AssemblyConnectorEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.PortConnectorEditor {

	/**
	 * @generated
	 */
	public AssemblyConnectorEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addAssemblyConnectorPortPartsEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addAssemblyConnectorPortPartsEditor(String category,
			boolean front) {
		addEditorToCategory(category, createAssemblyConnectorPortPartsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createAssemblyConnectorPortPartsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getAssemblyConnector_PortParts());

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
			return new AssemblyConnectorEditor();
		}
	}

}
