
package org.muml.core.properties.common.editor;

/**
 * @generated
 */
public class LiteralExpressionEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public LiteralExpressionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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

			addPropertyEditor(createEditorValue_GeneralTab_Editor(), false);

		} else if ("General".equals(tab)) { // Tab General

			addPropertyEditor(createEditorValue_GeneralTab_Editor(), false);

		} else if ("Docuementation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_DocuementationTab_Editor(), false);

		} else if ("Extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_ExtensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_GeneralTab_Editor() {
		if (this.editorValue_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.expressions.common.CommonExpressionsPackage.eINSTANCE
					.getLiteralExpression_Value();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"String representation of the value, e.g. \"5\", \"3.14\", \"c\", \"text\", or \"true\".");

			this.editorValue_GeneralTab = editor;
		}
		return this.editorValue_GeneralTab;
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
	public LiteralExpressionEditor(String tab) {
		this(tab, org.muml.core.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.core.expressions.common.CommonExpressionsPackage.eINSTANCE.getLiteralExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new LiteralExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"General", "Docuementation", "Extensions"})
					.contains(tab);
		}
	}

}
