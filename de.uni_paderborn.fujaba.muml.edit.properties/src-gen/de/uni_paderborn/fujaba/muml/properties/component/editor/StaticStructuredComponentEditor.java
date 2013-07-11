package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class StaticStructuredComponentEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.StructuredComponentEditor {

	/**
	 * @generated
	 */
	public StaticStructuredComponentEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public StaticStructuredComponentEditor(
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
			return new StaticStructuredComponentEditor();
		}
	}

}
