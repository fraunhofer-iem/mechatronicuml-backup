package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class DirectedTypedPortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.PortEditor {

	/**
	 * @generated
	 */
	public DirectedTypedPortEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addDirectedTypedPortKindEditor(null, true);

		addDirectedTypedPortOptionalEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addDirectedTypedPortKindEditor(String category, boolean front) {
		addEditorToCategory(category, createDirectedTypedPortKindEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortKindEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_Kind());

	}
	/**
	 * @generated
	 */
	protected void addDirectedTypedPortOptionalEditor(String category,
			boolean front) {
		addEditorToCategory(category, createDirectedTypedPortOptionalEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortOptionalEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_Optional());

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
			return new DirectedTypedPortEditor();
		}
	}

}
