package de.uni_paderborn.fujaba.muml.properties.types.editor;

/**
 * @generated
 */
public class DataTypeEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public DataTypeEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addCommentableElementCommentEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addCommentableElementCommentEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommentableElementCommentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementCommentEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment(), true);

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new DataTypeEditor();
		}
	}

}
