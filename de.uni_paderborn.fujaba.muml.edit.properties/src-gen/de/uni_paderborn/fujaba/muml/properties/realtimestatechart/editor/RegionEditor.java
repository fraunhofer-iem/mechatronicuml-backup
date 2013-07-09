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

		addPrioritizedElementPriorityEditor(null, true);

		super.initialize();
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
