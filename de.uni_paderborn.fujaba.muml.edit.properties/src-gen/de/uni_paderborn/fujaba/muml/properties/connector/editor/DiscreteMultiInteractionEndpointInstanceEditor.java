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
	public DiscreteMultiInteractionEndpointInstanceEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addDiscreteMultiInteractionEndpointInstanceSubInteractionEndpointInstancesEditor(
					null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addDiscreteMultiInteractionEndpointInstanceFirstEditor(null, true);
		}

		if (getTab() == null || "property.tab.experimental".equals(getTab())) {
			addDiscreteMultiInteractionEndpointInstanceLastEditor(null, true);
		}

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
	/**
	 * @generated
	 */
	protected void addDiscreteMultiInteractionEndpointInstanceFirstEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteMultiInteractionEndpointInstanceFirstEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteMultiInteractionEndpointInstanceFirstEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteMultiInteractionEndpointInstance_First());

	}
	/**
	 * @generated
	 */
	protected void addDiscreteMultiInteractionEndpointInstanceLastEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createDiscreteMultiInteractionEndpointInstanceLastEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDiscreteMultiInteractionEndpointInstanceLastEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.connector.ConnectorPackage.eINSTANCE
						.getDiscreteMultiInteractionEndpointInstance_Last());

	}

}
