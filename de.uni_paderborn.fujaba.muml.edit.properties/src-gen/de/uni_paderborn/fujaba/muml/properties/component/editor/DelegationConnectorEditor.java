package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class DelegationConnectorEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.PortConnectorEditor {

	/**
	 * @generated
	 */
	public DelegationConnectorEditor(
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
	public DelegationConnectorEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDelegationConnector());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new DelegationConnectorEditor();
		}
	}

}
