package de.uni_paderborn.fujaba.muml.properties.connector.editor;

/**
 * @generated
 */
public abstract class DiscreteMultiInteractionEndpointInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.DiscreteInteractionEndpointInstanceEditor {

	/**
	 * @generated
	 */
	public DiscreteMultiInteractionEndpointInstanceEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor(
				"de.fujaba.properties.category.Lists", true);

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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteMultiInteractionEndpointInstance_SubInteractionEndpointInstances());

	}

}
