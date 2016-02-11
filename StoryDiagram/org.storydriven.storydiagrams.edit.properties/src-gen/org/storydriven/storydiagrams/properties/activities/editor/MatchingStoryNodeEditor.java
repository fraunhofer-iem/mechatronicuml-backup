
package org.storydriven.storydiagrams.properties.activities.editor;

/**
 * @generated
 */
public class MatchingStoryNodeEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public MatchingStoryNodeEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorOutgoing_property_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorIncoming_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorForEach_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorOutgoing_property_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorIncoming_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorForEach_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorForEach_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorForEach_property_tab_generalTab_Editor() {
		if (this.editorForEach_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
					.getStoryNode_ForEach();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"Specifies whether just one match should be found for the contained pattern (forEach  = false) or whether all matches should be found (forEach = true).");

			this.editorForEach_property_tab_generalTab = editor;
		}
		return this.editorForEach_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOutgoing_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOutgoing_property_tab_generalTab_Editor() {
		if (this.editorOutgoing_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
					.getActivityNode_Outgoing();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"All ActivityEdges that leave this activity node. The guards of the outgoing activity edges must be exclusive in order to obtain a well-defined activity.");

			this.editorOutgoing_property_tab_generalTab = editor;
		}
		return this.editorOutgoing_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorIncoming_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorIncoming_property_tab_generalTab_Editor() {
		if (this.editorIncoming_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE
					.getActivityNode_Incoming();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("All ActivityEdges entering this activity node.");

			this.editorIncoming_property_tab_generalTab = editor;
		}
		return this.editorIncoming_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public MatchingStoryNodeEditor(String tab) {
		this(tab, org.storydriven.storydiagrams.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.storydriven.storydiagrams.activities.ActivitiesPackage.eINSTANCE.getMatchingStoryNode());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new MatchingStoryNodeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general", "property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
