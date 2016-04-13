
package org.muml.core.properties.expressions.editor;

/**
 * @generated
 */
public class TextualExpressionEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

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

			addPropertyEditor(createEditorExtensions_ExtensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_DocuementationTab_Editor(), false);

			addPropertyEditor(createEditorExpressionText_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLanguage_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLanguageVersion_GeneralTab_Editor(), false);

		} else if ("General".equals(tab)) { // Tab General

			addPropertyEditor(createEditorExpressionText_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLanguage_GeneralTab_Editor(), false);

			addPropertyEditor(createEditorLanguageVersion_GeneralTab_Editor(), false);

		} else if ("Docuementation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_DocuementationTab_Editor(), false);

		} else if ("Extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_ExtensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExpressionText_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExpressionText_GeneralTab_Editor() {
		if (this.editorExpressionText_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.expressions.ExpressionsPackage.eINSTANCE
					.getTextualExpression_ExpressionText();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("Holds the expression, e.g. in OCL or Java.");

			this.editorExpressionText_GeneralTab = editor;
		}
		return this.editorExpressionText_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLanguage_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLanguage_GeneralTab_Editor() {
		if (this.editorLanguage_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.expressions.ExpressionsPackage.eINSTANCE
					.getTextualExpression_Language();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"String representation of the used language which has to be unique. Examples are OCL and Java.");

			this.editorLanguage_GeneralTab = editor;
		}
		return this.editorLanguage_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLanguageVersion_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLanguageVersion_GeneralTab_Editor() {
		if (this.editorLanguageVersion_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.expressions.ExpressionsPackage.eINSTANCE
					.getTextualExpression_LanguageVersion();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"String representation of the used language's version. The format is <Major>.<Minor>[.<Revision>[.<Build>]]\nExamples: 1.4 or 3.0.1 or 1.0.2.20101208.");

			this.editorLanguageVersion_GeneralTab = editor;
		}
		return this.editorLanguageVersion_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_DocuementationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_DocuementationTab_Editor() {
		if (this.editorComment_DocuementationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_DocuementationTab = editor;
		}
		return this.editorComment_DocuementationTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_ExtensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_ExtensionsTab_Editor() {
		if (this.editorExtensions_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtensions_ExtensionsTab = editor;
		}
		return this.editorExtensions_ExtensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TextualExpressionEditor(String tab) {
		this(tab, org.muml.core.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.core.expressions.ExpressionsPackage.eINSTANCE.getTextualExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new TextualExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"General", "General", "General", "Docuementation", "Extensions"})
					.contains(tab);
		}
	}

}
