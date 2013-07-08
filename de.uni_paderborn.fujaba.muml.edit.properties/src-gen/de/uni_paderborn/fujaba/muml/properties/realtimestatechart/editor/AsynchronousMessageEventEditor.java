package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class AsynchronousMessageEventEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor.TransitionEventEditor {

	/**
	 * @generated
	 */
	public AsynchronousMessageEventEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addAsynchronousMessageEventMessageEditor(null, false);

		addEventKindEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addAsynchronousMessageEventMessageEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createAsynchronousMessageEventMessageEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createAsynchronousMessageEventMessageEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getAsynchronousMessageEvent_Message());

	}
	/**
	 * @generated
	 */
	protected void addEventKindEditor(String category, boolean front) {
		addEditorToCategory(category, createEventKindEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createEventKindEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getEvent_Kind());

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
			return new AsynchronousMessageEventEditor();
		}
	}

}
