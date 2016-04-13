
package org.muml.core.properties.common.editor;

/**
 * @generated
 */
public abstract class BinaryExpressionEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public BinaryExpressionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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

		} else if ("General".equals(tab)) { // Tab General

		} else if ("Docuementation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_DocuementationTab_Editor(), false);

		} else if ("Extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_ExtensionsTab_Editor(), false);

		} else {
		}
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

}
