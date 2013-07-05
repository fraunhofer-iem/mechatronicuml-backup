package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class SynchronizationEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public SynchronizationEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addSynchronizationKindEditor(null, true);

		addSynchronizationSelectorExpressionEditor(null, false);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addSynchronizationKindEditor(String category, boolean front) {
		addEditorToCategory(category, createSynchronizationKindEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createSynchronizationKindEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization_Kind());

	}
	/**
	 * @generated
	 */
	protected void addSynchronizationSelectorExpressionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createSynchronizationSelectorExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createSynchronizationSelectorExpressionEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getSynchronization_SelectorExpression());

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
			return new SynchronizationEditor();
		}
	}

}
