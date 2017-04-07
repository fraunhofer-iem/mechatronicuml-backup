
package org.muml.core.reachanalysis.reachabilitygraph.properties.reachabilitygraph.editor;

/**
 * @generated
 */
public class HashToStateListEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public HashToStateListEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorHash_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorStates_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorHash_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorStates_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorHash_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorHash_property_tab_generalTab_Editor() {
		if (this.editorHash_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getHashToStateList_Hash();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			this.editorHash_property_tab_generalTab = editor;
		}
		return this.editorHash_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorStates_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorStates_property_tab_generalTab_Editor() {
		if (this.editorStates_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getHashToStateList_States();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Contains all states that share the hash value \"hash\".");

			this.editorStates_property_tab_generalTab = editor;
		}
		return this.editorStates_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HashToStateListEditor(String tab) {
		this(tab,
				org.muml.core.reachanalysis.reachabilitygraph.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE.getHashToStateList());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new HashToStateListEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
