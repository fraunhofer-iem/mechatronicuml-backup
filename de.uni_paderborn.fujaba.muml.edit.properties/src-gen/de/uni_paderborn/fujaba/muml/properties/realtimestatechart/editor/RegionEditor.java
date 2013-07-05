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
	public RegionEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRegionEmbeddedStatechartEditor(null, false);

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

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new RegionEditor();
		}
	}

}
