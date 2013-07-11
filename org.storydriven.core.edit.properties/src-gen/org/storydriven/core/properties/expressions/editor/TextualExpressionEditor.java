package org.storydriven.core.properties.expressions.editor;

/**
 * @generated
 */
public class TextualExpressionEditor
		extends
			org.storydriven.core.properties.expressions.editor.ExpressionEditor {

	/**
	 * @generated
	 */
	public TextualExpressionEditor() {
		this(org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory());
	}

	/**
	 * @generated
	 */
	public TextualExpressionEditor(
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addTextualExpressionExpressionTextEditor(null, true);

		addTextualExpressionLanguageEditor(null, true);

		addTextualExpressionLanguageVersionEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addTextualExpressionExpressionTextEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createTextualExpressionExpressionTextEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTextualExpressionExpressionTextEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression_ExpressionText(), false);

	}
	/**
	 * @generated
	 */
	protected void addTextualExpressionLanguageEditor(String category,
			boolean front) {
		addEditorToCategory(category, createTextualExpressionLanguageEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTextualExpressionLanguageEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression_Language(), false);

	}
	/**
	 * @generated
	 */
	protected void addTextualExpressionLanguageVersionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createTextualExpressionLanguageVersionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createTextualExpressionLanguageVersionEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression_LanguageVersion(), false);

	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new TextualExpressionEditor();
		}
	}

}
