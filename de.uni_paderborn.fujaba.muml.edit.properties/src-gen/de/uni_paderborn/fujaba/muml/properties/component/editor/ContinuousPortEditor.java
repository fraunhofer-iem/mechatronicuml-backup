package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class ContinuousPortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.DirectedTypedPortEditor {

	/**
	 * @generated
	 */
	public ContinuousPortEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public ContinuousPortEditor(
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
			return new ContinuousPortEditor();
		}
	}

}
