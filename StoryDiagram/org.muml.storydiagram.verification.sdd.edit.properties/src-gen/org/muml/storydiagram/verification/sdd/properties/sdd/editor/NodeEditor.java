
package org.muml.storydiagram.verification.sdd.properties.sdd.editor;

/**
 * @generated
 */
public abstract class NodeEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public NodeEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorOutgoingEdges_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorIncomingEdges_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorOutgoingEdges_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorIncomingEdges_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutgoingEdges_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOutgoingEdges_property_tab_generalTab_Editor() {
		if (this.editorOutgoingEdges_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.verification.sdd.SDDPackage.eINSTANCE
					.getNode_OutgoingEdges();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorOutgoingEdges_property_tab_generalTab = editor;
		}
		return this.editorOutgoingEdges_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingEdges_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncomingEdges_property_tab_generalTab_Editor() {
		if (this.editorIncomingEdges_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.verification.sdd.SDDPackage.eINSTANCE
					.getNode_IncomingEdges();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorIncomingEdges_property_tab_generalTab = editor;
		}
		return this.editorIncomingEdges_property_tab_generalTab;
	}

}
