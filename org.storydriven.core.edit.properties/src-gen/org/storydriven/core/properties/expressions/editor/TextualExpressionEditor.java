
package org.storydriven.core.properties.expressions.editor;

/**
 * @generated
 */
public class TextualExpressionEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public TextualExpressionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExpressionText_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLanguage_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLanguageVersion_GeneralTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorExpressionText_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLanguage_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLanguageVersion_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExpressionText_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExpressionText_GeneralTab_Editor() {
		if (this.editorExpressionText_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
					.getTextualExpression_ExpressionText();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("Holds the expression, e.g. in OCL or Java.");

			this.editorExpressionText_GeneralTab = editor;
		}
		return this.editorExpressionText_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLanguage_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLanguage_GeneralTab_Editor() {
		if (this.editorLanguage_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
					.getTextualExpression_Language();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"String representation of the used language which has to be unique. Examples are OCL and Java.");

			this.editorLanguage_GeneralTab = editor;
		}
		return this.editorLanguage_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLanguageVersion_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLanguageVersion_GeneralTab_Editor() {
		if (this.editorLanguageVersion_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
					.getTextualExpression_LanguageVersion();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"String representation of the used language which has to be unique. Examples are OCL and Java.");

			this.editorLanguageVersion_GeneralTab = editor;
		}
		return this.editorLanguageVersion_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TextualExpressionEditor(String tab) {
		this(tab, org.storydriven.core.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE.getTextualExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new TextualExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general", "property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
