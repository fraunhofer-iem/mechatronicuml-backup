package de.uni_paderborn.fujaba.muml.properties.component.editor;

public class HybridPortEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public HybridPortEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addHybridPortSamplingIntervalEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addHybridPortSamplingIntervalEditor(String category,
			boolean front) {
		addEditorToCategory(category, createHybridPortSamplingIntervalEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createHybridPortSamplingIntervalEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.component.ComponentPackage.eINSTANCE
						.getHybridPort_SamplingInterval());

	}

	//
	// Overwritten property settings
	//

}
