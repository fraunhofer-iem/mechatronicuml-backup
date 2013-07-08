package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

/**
 * @generated
 */
public class ConstrainableElementEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConstrainableElementEditor() {
		super(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory());

	}

	/**
	 * @generated
	 */
	public void initialize() {

		addConstrainableElementConstraintEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addConstrainableElementConstraintEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createConstrainableElementConstraintEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createConstrainableElementConstraintEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getConstrainableElement_Constraint());

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
			return new ConstrainableElementEditor();
		}
	}

}
