
package org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.properties.rtsc.editor;

/**
 * @generated
 */
public class ZoneGraphStateEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ZoneGraphStateEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorHash_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPathDepth_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorIncomingTransitions_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorOutgoingTransitions_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorFederation_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLocations_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorHash_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPathDepth_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorIncomingTransitions_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorOutgoingTransitions_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorFederation_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorLocations_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorFederation_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorFederation_property_tab_generalTab_Editor() {
		if (this.editorFederation_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage.eINSTANCE
					.getZoneGraphState_Federation();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorFederation_property_tab_generalTab = editor;
		}
		return this.editorFederation_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLocations_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLocations_property_tab_generalTab_Editor() {
		if (this.editorLocations_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage.eINSTANCE
					.getZoneGraphState_Locations();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"Refers to all Real-Time Statechart instances considered by this zone graph state.");

			this.editorLocations_property_tab_generalTab = editor;
		}
		return this.editorLocations_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorHash_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorHash_property_tab_generalTab_Editor() {
		if (this.editorHash_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getReachabilityGraphState_Hash();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage("Stores the hash value that has been computed for this state. ");

			this.editorHash_property_tab_generalTab = editor;
		}
		return this.editorHash_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncomingTransitions_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncomingTransitions_property_tab_generalTab_Editor() {
		if (this.editorIncomingTransitions_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getReachabilityGraphState_IncomingTransitions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("All transitions leading to this state.");

			this.editorIncomingTransitions_property_tab_generalTab = editor;
		}
		return this.editorIncomingTransitions_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutgoingTransitions_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOutgoingTransitions_property_tab_generalTab_Editor() {
		if (this.editorOutgoingTransitions_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getReachabilityGraphState_OutgoingTransitions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("All transitions originating from this state.");

			this.editorOutgoingTransitions_property_tab_generalTab = editor;
		}
		return this.editorOutgoingTransitions_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPathDepth_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPathDepth_property_tab_generalTab_Editor() {
		if (this.editorPathDepth_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage.eINSTANCE
					.getReachabilityGraphState_PathDepth();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.SpinnerPropertyEditor(
					adapterFactory, feature, 0);

			editor.setTooltipMessage(
					"Encodes the length of the path from the root node of the reachability graph to this state.");

			this.editorPathDepth_property_tab_generalTab = editor;
		}
		return this.editorPathDepth_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_property_tab_extensionsTab_Editor() {
		if (this.editorExtensions_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtensions_property_tab_extensionsTab = editor;
		}
		return this.editorExtensions_property_tab_extensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ZoneGraphStateEditor(String tab) {
		this(tab,
				org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage.eINSTANCE
						.getZoneGraphState());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ZoneGraphStateEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.extensions"}).contains(tab);
		}
	}

}
