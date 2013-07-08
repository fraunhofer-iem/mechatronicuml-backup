package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public class DiscreteMultiInteractionEndpointInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.DiscreteInteractionEndpointInstanceEditor {

	/**
	 * @generated
	 */
	public DiscreteMultiInteractionEndpointInstanceEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor(
				null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances());

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
			return new DiscreteMultiInteractionEndpointInstanceEditor();
		}
	}

}
