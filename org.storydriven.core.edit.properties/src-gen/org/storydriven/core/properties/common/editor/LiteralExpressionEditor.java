package org.storydriven.core.properties.common.editor;

/**
 * @generated
 */
public class LiteralExpressionEditor
		extends
			org.storydriven.core.properties.expressions.editor.ExpressionEditor {

	/**
	 * @generated
	 */
	public LiteralExpressionEditor(
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

		addLiteralExpressionValueEditor(null, true);

	}

	/**
	 * @generated
	 */
	protected void addLiteralExpressionValueEditor(String category,
			boolean front) {
		addEditorToCategory(category, createLiteralExpressionValueEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createLiteralExpressionValueEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getLiteralExpression_Value(), false);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public LiteralExpressionEditor() {
		this(
				org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getLiteralExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new LiteralExpressionEditor();
		}
	}

}
