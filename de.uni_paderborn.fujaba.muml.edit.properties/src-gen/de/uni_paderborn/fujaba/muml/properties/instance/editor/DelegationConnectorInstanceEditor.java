package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class DelegationConnectorInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.instance.editor.PortConnectorInstanceEditor {

	/**
	 * @generated
	 */
	public DelegationConnectorInstanceEditor(
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

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DelegationConnectorInstanceEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getDelegationConnectorInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new DelegationConnectorInstanceEditor();
		}
	}

}
