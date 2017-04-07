
package org.muml.core.reachanalysis.reachabilitygraph.properties.reachabilitygraph.editor;

/**
 * @generated
 */
public class HashToStateListMapEntryEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public HashToStateListMapEntryEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorKey_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorValue_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorKey_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorValue_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorKey_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorKey_property_tab_generalTab_Editor() {
		if (this.editorKey_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getHashToStateListMapEntry_Key();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorKey_property_tab_generalTab = editor;
		}
		return this.editorKey_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_property_tab_generalTab_Editor() {
		if (this.editorValue_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getHashToStateListMapEntry_Value();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorValue_property_tab_generalTab = editor;
		}
		return this.editorValue_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HashToStateListMapEntryEditor(String tab) {
		this(tab,
				org.muml.core.reachanalysis.reachabilitygraph.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
						.getHashToStateListMapEntry());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new HashToStateListMapEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
