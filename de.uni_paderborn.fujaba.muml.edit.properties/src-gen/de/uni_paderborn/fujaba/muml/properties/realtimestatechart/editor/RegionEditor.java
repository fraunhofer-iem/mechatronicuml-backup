package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class RegionEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RegionEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRegionEmbeddedStatechartEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addRegionEmbeddedStatechartEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRegionEmbeddedStatechartEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRegionEmbeddedStatechartEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRegion_EmbeddedStatechart());

	}

	//
	// Overwritten property settings
	//

}
