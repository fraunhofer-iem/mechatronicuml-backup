package de.uni_paderborn.fujaba.muml.properties.component.editor;

/**
 * @generated
 */
public class HybridPortEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.DirectedTypedPortEditor {

	/**
	 * @generated
	 */
	public HybridPortEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addHybridPortSamplingIntervalEditor(null, false);

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

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new HybridPortEditor();
		}
	}

}
