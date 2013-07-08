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

		addDirectedTypedPortOutPortEditor(null, true);

		addDirectedTypedPortInPortEditor(null, true);

		addNamedElementNameEditor(null, true);

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
				adapterFactory,
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
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_Optional());

	}
	/**
	 * @generated
	 */
	protected void addDirectedTypedPortOutPortEditor(String category,
			boolean front) {
		addEditorToCategory(category, createDirectedTypedPortOutPortEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortOutPortEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_OutPort());

	}
	/**
	 * @generated
	 */
	protected void addDirectedTypedPortInPortEditor(String category,
			boolean front) {
		addEditorToCategory(category, createDirectedTypedPortInPortEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createDirectedTypedPortInPortEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getDirectedTypedPort_InPort());

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
			return new DirectedTypedPortEditor();
		}
	}

}
