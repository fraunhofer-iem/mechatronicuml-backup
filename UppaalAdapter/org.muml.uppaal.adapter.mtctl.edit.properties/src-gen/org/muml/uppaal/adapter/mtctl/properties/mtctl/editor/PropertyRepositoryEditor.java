
package org.muml.uppaal.adapter.mtctl.properties.mtctl.editor;

/**
 * @generated
 */
public class PropertyRepositoryEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyRepositoryEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorProperties_MtctlTab_Editor(), false);

		} else if ("property.tab.mtctl".equals(tab)) { // Tab Mtctl

			addPropertyEditor(createEditorProperties_MtctlTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorProperties_MtctlTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorProperties_MtctlTab_Editor() {
		if (this.editorProperties_MtctlTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.adapter.mtctl.MtctlPackage.eINSTANCE
					.getPropertyRepository_Properties();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.uppaal.adapter.mtctl.xtext.ui.properties.MtctlXtextPropertyEditor(
					adapterFactory, feature);

			this.editorProperties_MtctlTab = editor;
		}
		return this.editorProperties_MtctlTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyRepositoryEditor(String tab) {
		this(tab,
				org.muml.uppaal.adapter.mtctl.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.uppaal.adapter.mtctl.MtctlPackage.eINSTANCE.getPropertyRepository());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new PropertyRepositoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.mtctl"}).contains(tab);
		}
	}

}
