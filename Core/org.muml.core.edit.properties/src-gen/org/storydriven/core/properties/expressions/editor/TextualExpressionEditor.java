
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

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorExpressionText_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLanguage_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLanguageVersion_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorExpressionText_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLanguage_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLanguageVersion_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExpressionText_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExpressionText_property_tab_generalTab_Editor() {
		if (this.editorExpressionText_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
					.getTextualExpression_ExpressionText();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("Holds the expression, e.g. in OCL or Java.");

			this.editorExpressionText_property_tab_generalTab = editor;
		}
		return this.editorExpressionText_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLanguage_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLanguage_property_tab_generalTab_Editor() {
		if (this.editorLanguage_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
					.getTextualExpression_Language();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"String representation of the used language which has to be unique. Examples are OCL and Java.");

			this.editorLanguage_property_tab_generalTab = editor;
		}
		return this.editorLanguage_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLanguageVersion_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLanguageVersion_property_tab_generalTab_Editor() {
		if (this.editorLanguageVersion_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.expressions.ExpressionsPackage.eINSTANCE
					.getTextualExpression_LanguageVersion();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"String representation of the used language's version. The format is <Major>.<Minor>[.<Revision>[.<Build>]]\nExamples: 1.4 or 3.0.1 or 1.0.2.20101208.");

			this.editorLanguageVersion_property_tab_generalTab = editor;
		}
		return this.editorLanguageVersion_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_property_tab_documentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_property_tab_documentationTab_Editor() {
		if (this.editorComment_property_tab_documentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_property_tab_documentationTab = editor;
		}
		return this.editorComment_property_tab_documentationTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_property_tab_extensionsTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_property_tab_extensionsTab_Editor() {
		if (this.editorExtension_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_property_tab_extensionsTab = editor;
		}
		return this.editorExtension_property_tab_extensionsTab;
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
			return java.util.Arrays
					.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.documentation", "property.tab.extensions"})
					.contains(tab);
		}
	}

}