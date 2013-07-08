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
			return new StaticStructuredComponentEditor();
		}
	}

}
