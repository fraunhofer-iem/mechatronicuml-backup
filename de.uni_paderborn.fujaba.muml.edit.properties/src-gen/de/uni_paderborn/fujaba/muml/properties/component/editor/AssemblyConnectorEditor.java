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
	public AssemblyConnectorEditor(
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
	public AssemblyConnectorEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getAssemblyConnector());
	}

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
