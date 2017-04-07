
package org.muml.uppaal.properties.declarations.editor;

/**
 * @generated
 */
public class ChannelVariableDeclarationEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ChannelVariableDeclarationEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUrgent_org_muml_uppaalTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorBroadcast_org_muml_uppaalTab_Editor(),
					false);

		} else if ("org.muml.uppaal".equals(tab)) { // Tab Uppaal

			addSubCategory("org.muml.ape.category.Booleans", "Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorUrgent_org_muml_uppaalTab_Editor(),
					false);

			addEditorToCategory("org.muml.ape.category.Booleans", createEditorBroadcast_org_muml_uppaalTab_Editor(),
					false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorUrgent_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorUrgent_org_muml_uppaalTab_Editor() {
		if (this.editorUrgent_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.declarations.DeclarationsPackage.eINSTANCE
					.getChannelVariableDeclaration_Urgent();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Specifies the urgency of the declared synchronization channels.");

			this.editorUrgent_org_muml_uppaalTab = editor;
		}
		return this.editorUrgent_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBroadcast_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBroadcast_org_muml_uppaalTab_Editor() {
		if (this.editorBroadcast_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.declarations.DeclarationsPackage.eINSTANCE
					.getChannelVariableDeclaration_Broadcast();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Specifies whether the declared synchronization channels use broadcast.");

			this.editorBroadcast_org_muml_uppaalTab = editor;
		}
		return this.editorBroadcast_org_muml_uppaalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ChannelVariableDeclarationEditor(String tab) {
		this(tab, org.muml.uppaal.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.declarations.DeclarationsPackage.eINSTANCE.getChannelVariableDeclaration());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ChannelVariableDeclarationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.uppaal", "org.muml.uppaal"}).contains(tab);
		}
	}

}
