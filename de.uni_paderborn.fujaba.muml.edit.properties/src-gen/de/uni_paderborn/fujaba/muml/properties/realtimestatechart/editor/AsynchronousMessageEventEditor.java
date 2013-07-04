package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class AsynchronousMessageEventEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public AsynchronousMessageEventEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addAsynchronousMessageEventMessageEditor(null, true);

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

	//
	// Overwritten property settings
	//

}
