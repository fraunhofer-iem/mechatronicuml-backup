package org.muml.reconfiguration.verification.sdd.componentsdd.properties.componentsdd.editor;

/**
 * @generated
 */
public class InitialNodeEditor
		extends
			org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public InitialNodeEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createOutgoingEdges_GeneralTab_Editor(), false);

			addPropertyEditor(createIncomingEdges_GeneralTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createOutgoingEdges_GeneralTab_Editor(), false);

			addPropertyEditor(createIncomingEdges_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutgoingEdges_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createOutgoingEdges_GeneralTab_Editor() {
		if (this.editorOutgoingEdges_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.verification.sdd.SDDPackage.eINSTANCE
					.getNode_OutgoingEdges();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorOutgoingEdges_GeneralTab = editor;
		}
		return this.editorOutgoingEdges_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingEdges_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createIncomingEdges_GeneralTab_Editor() {
		if (this.editorIncomingEdges_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.verification.sdd.SDDPackage.eINSTANCE
					.getNode_IncomingEdges();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorIncomingEdges_GeneralTab = editor;
		}
		return this.editorIncomingEdges_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public InitialNodeEditor(String tab) {
		this(
				tab,
				org.muml.reconfiguration.verification.sdd.componentsdd.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.reconfiguration.verification.sdd.componentsdd.ComponentsddPackage.eINSTANCE
						.getInitialNode());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new InitialNodeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
