package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

/**
 * @generated
 */
public abstract class TypedNamedElementEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public TypedNamedElementEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addTypedNamedElementDataTypeEditor(null, true);

	}

	/**
	 * @generated
	 */
	protected void addTypedNamedElementDataTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category, createTypedNamedElementDataTypeEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTypedNamedElementDataTypeEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getTypedNamedElement_DataType());

	}

}
