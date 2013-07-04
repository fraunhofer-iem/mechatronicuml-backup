package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

public class ActionEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ActionEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addActionExpressionsEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addActionExpressionsEditor(String category, boolean front) {
		addEditorToCategory(category, createActionExpressionsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createActionExpressionsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getAction_Expressions());

	}

	//
	// Overwritten property settings
	//

}
