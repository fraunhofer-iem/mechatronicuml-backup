package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class ComponentPartEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

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

		addComponentPartPortPartsEditor(null, true);

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
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponentPart_Cardinality());

	}
	/**
	 * @generated
	 */
	protected void addComponentPartPortPartsEditor(String category,
			boolean front) {
		addEditorToCategory(category, createComponentPartPortPartsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createComponentPartPortPartsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getComponentPart_PortParts());

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
