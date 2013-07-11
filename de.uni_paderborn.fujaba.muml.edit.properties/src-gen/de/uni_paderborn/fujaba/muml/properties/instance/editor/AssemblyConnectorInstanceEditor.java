package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class AssemblyConnectorInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.instance.editor.PortConnectorInstanceEditor {

	/**
	 * @generated
	 */
	public AssemblyConnectorInstanceEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public AssemblyConnectorInstanceEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		super.initialize();
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new AssemblyConnectorInstanceEditor();
		}
	}

}
