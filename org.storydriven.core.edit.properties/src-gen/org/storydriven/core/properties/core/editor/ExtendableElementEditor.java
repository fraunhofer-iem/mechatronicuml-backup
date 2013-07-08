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
		super(org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory());

	}

	/**
	 * @generated
	 */
	public void initialize() {

		super.initialize();
	}

	//
	// Overwritten property settings
	//

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
