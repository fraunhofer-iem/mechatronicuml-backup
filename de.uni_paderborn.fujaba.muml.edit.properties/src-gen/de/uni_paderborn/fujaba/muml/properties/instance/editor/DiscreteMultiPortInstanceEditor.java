package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class DiscreteMultiPortInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.DiscreteMultiInteractionEndpointInstanceEditor {

	/**
	 * @generated
	 */
	public DiscreteMultiPortInstanceEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPortInstanceComponentInstanceEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPortInstanceComponentInstanceEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createPortInstanceComponentInstanceEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPortInstanceComponentInstanceEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getPortInstance_ComponentInstance());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DiscreteMultiPortInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getDiscreteMultiPortInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new DiscreteMultiPortInstanceEditor(tab);
		}
	}

}
