package de.uni_paderborn.fujaba.muml.properties.protocol.editor;

/**
 * @generated
 */
public class CoordinationProtocolEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.protocol.editor.AbstractCoordinationSpecificationEditor {

	/**
	 * @generated
	 */
	public CoordinationProtocolEditor(
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
	public CoordinationProtocolEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getCoordinationProtocol());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new CoordinationProtocolEditor();
		}
	}

}
