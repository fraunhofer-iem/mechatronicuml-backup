package org.storydriven.core.properties.core.editor;

/**
 * @generated
 */
public class ExtendableElementEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ExtendableElementEditor() {
		this(org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public ExtendableElementEditor(
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
			return new ExtendableElementEditor();
		}
	}

}
