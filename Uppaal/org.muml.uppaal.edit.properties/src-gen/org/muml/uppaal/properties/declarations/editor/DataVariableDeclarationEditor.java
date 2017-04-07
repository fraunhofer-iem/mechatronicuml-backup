
package org.muml.uppaal.properties.declarations.editor;

/**
 * @generated
 */
public class DataVariableDeclarationEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public DataVariableDeclarationEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorPrefix_org_muml_uppaalTab_Editor(), false);

		} else if ("org.muml.uppaal".equals(tab)) { // Tab Uppaal

			addPropertyEditor(createEditorPrefix_org_muml_uppaalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPrefix_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPrefix_org_muml_uppaalTab_Editor() {
		if (this.editorPrefix_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.declarations.DeclarationsPackage.eINSTANCE
					.getDataVariableDeclaration_Prefix();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The prefix of the data variable declaration.");

			this.editorPrefix_org_muml_uppaalTab = editor;
		}
		return this.editorPrefix_org_muml_uppaalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public DataVariableDeclarationEditor(String tab) {
		this(tab, org.muml.uppaal.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.declarations.DeclarationsPackage.eINSTANCE.getDataVariableDeclaration());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new DataVariableDeclarationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.uppaal"}).contains(tab);
		}
	}

}
