
package org.muml.core.properties.core.editor;

/**
 * @generated
 */
public abstract class TypedElementEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public TypedElementEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
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

		} else if ("General".equals(tab)) { // Tab General

		} else if ("Docuementation".equals(tab)) { // Tab Documentation

		} else if ("Extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_ExtensionsTab_Editor(), false);

		} else {
		}
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
