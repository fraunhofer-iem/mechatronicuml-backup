package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class StateEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.VertexEditor {

	/**
	 * @generated
	 */
	public StateEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		addSubCategory("de.fujaba.properties.category.Booleans", "Booleans",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateEmbeddedRegionsEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateDoEventEditor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateExitEventEditor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateEntryEventEditor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateInvariantsEditor("de.fujaba.properties.category.Lists",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateInitialEditor("de.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateFinalEditor("de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateUrgentEditor("de.fujaba.properties.category.Booleans", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateChannelsEditor("de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateConnectionPointsEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addStateParentStatechartEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addStateEmbeddedRegionsEditor(String category, boolean front) {
		addEditorToCategory(category, createStateEmbeddedRegionsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateEmbeddedRegionsEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_EmbeddedRegions());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateDoEventEditor(String category, boolean front) {
		addEditorToCategory(category, createStateDoEventEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateDoEventEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_DoEvent());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateExitEventEditor(String category, boolean front) {
		addEditorToCategory(category, createStateExitEventEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateExitEventEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_ExitEvent());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateEntryEventEditor(String category, boolean front) {
		addEditorToCategory(category, createStateEntryEventEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateEntryEventEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_EntryEvent());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateInvariantsEditor(String category, boolean front) {
		addEditorToCategory(category, createStateInvariantsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateInvariantsEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Invariants());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateInitialEditor(String category, boolean front) {
		addEditorToCategory(category, createStateInitialEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateInitialEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Initial());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateFinalEditor(String category, boolean front) {
		addEditorToCategory(category, createStateFinalEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateFinalEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Final());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateUrgentEditor(String category, boolean front) {
		addEditorToCategory(category, createStateUrgentEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateUrgentEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Urgent());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateChannelsEditor(String category, boolean front) {
		addEditorToCategory(category, createStateChannelsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateChannelsEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_Channels());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateConnectionPointsEditor(String category, boolean front) {
		addEditorToCategory(category, createStateConnectionPointsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateConnectionPointsEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_ConnectionPoints());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addStateParentStatechartEditor(String category, boolean front) {
		addEditorToCategory(category, createStateParentStatechartEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStateParentStatechartEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState_ParentStatechart());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public StateEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getState());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new StateEditor(tab);
		}
	}

}
