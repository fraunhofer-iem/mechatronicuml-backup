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
			addTextualExpressionExpressionText_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTextualExpressionLanguage_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addTextualExpressionLanguageVersion_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addTextualExpressionExpressionText_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createTextualExpressionExpressionText_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createTextualExpressionExpressionText_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression_ExpressionText(), false);

		editor.setTooltipMessage("Holds the expression, e.g. in OCL or Java.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addTextualExpressionLanguage_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createTextualExpressionLanguage_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createTextualExpressionLanguage_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression_Language(), false);

		editor.setTooltipMessage("String representation of the used language which has to be unique. Examples are OCL and Java.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addTextualExpressionLanguageVersion_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createTextualExpressionLanguageVersion_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createTextualExpressionLanguageVersion_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
						.getTextualExpression_LanguageVersion(), false);

		editor.setTooltipMessage("String representation of the used language's version. The format is <Major>.<Minor>[.<Revision>[.<Build>]]\nExamples: 1.4 or 3.0.1 or 1.0.2.20101208.");

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
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new TextualExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
