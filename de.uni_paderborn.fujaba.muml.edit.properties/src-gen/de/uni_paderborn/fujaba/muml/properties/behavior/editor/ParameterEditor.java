package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

/**
 * @generated
 */
public class ParameterEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ParameterEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addNamedElementNameEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addNamedElementNameEditor(String category, boolean front) {
		addEditorToCategory(category, createNamedElementNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createNamedElementNameEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				org.storydriven.core.CorePackage.eINSTANCE
						.getNamedElement_Name());

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
			return new ParameterEditor();
		}
	}

}
