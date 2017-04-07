
package org.muml.verification.core.reachanalysis.reachabilitygraph.cic.properties.cic.editor;

/**
 * @generated
 */
public class CICZoneGraphStateEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CICZoneGraphStateEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorCic_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorCic_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCic_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCic_property_tab_generalTab_Editor() {
		if (this.editorCic_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicPackage.eINSTANCE
					.getCICZoneGraphState_Cic();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			this.editorCic_property_tab_generalTab = editor;
		}
		return this.editorCic_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public CICZoneGraphStateEditor(String tab) {
		this(tab,
				org.muml.verification.core.reachanalysis.reachabilitygraph.cic.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicPackage.eINSTANCE
						.getCICZoneGraphState());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new CICZoneGraphStateEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general"}).contains(tab);
		}
	}

}
