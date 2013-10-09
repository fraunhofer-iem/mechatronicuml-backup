package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class RegionEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public RegionEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addRegionParentStateEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addPrioritizedElementPriorityEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addRegionParentStateEditor(String category, boolean front) {
		addEditorToCategory(category, createRegionParentStateEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRegionParentStateEditor() {
		return new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRegion_ParentState());

	}
	/**
	 * @generated
	 */
	protected void addPrioritizedElementPriorityEditor(String category,
			boolean front) {
		addEditorToCategory(category, createPrioritizedElementPriorityEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createPrioritizedElementPriorityEditor() {
		return new de.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getPrioritizedElement_Priority(), 0);

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public RegionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRegion());
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
			return new RegionEditor(tab);
		}
	}

}
