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
	public TextualExpressionEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTextualExpressionExpressionTextEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTextualExpressionLanguageEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTextualExpressionLanguageVersionEditor(null, true);
		}

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression_ExpressionText(), false);

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression_Language(), false);

		return editor;

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
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression_LanguageVersion(), false);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TextualExpressionEditor(String tab) {
		this(tab, org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
				.getAdapterFactory(),
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new TextualExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation"}).contains(tab);
		}
	}

}
