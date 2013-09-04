package de.uni_paderborn.fujaba.muml.properties.constraint.editor;

/**
 * @generated
 */
public class TextualConstraintEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.constraint.editor.VerifiableConstraintEditor {

	/**
	 * @generated
	 */
	public TextualConstraintEditor(
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

		addTextualConstraintTextualExpressionEditor(null, true);

	}

	/**
	 * @generated
	 */
	protected void addTextualConstraintTextualExpressionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createTextualConstraintTextualExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTextualConstraintTextualExpressionEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getTextualConstraint_TextualExpression());

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TextualConstraintEditor() {
		this(
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
						.getTextualConstraint());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new TextualConstraintEditor();
		}
	}

}
