package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class ComponentPartEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public ComponentPartEditor() {

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addComponentPartCardinalityEditor(null, false);

		addComponentPartMultiPartEditor(null, true);

		addCommentableElementCommentEditor(null, true);

		addNamedElementNameEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addComponentPartCardinalityEditor(String category,
			boolean front) {
		addEditorToCategory(category, createComponentPartCardinalityEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentPartCardinalityEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponentPart_Cardinality());

	}
	/**
	 * @generated
	 */
	protected void addComponentPartMultiPartEditor(String category,
			boolean front) {
		addEditorToCategory(category, createComponentPartMultiPartEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentPartMultiPartEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponentPart_MultiPart());

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
						.getCommentableElement_Comment());

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
				adapterFactory,
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
			return new ComponentPartEditor();
		}
	}

}
