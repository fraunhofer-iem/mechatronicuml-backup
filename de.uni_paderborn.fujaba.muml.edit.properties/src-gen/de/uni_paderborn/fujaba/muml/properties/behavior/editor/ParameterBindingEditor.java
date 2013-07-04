package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

public class ParameterBindingEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ParameterBindingEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addParameterBindingValueEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addParameterBindingValueEditor(String category, boolean front) {
		addEditorToCategory(category, createParameterBindingValueEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createParameterBindingValueEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getParameterBinding_Value());

	}

	//
	// Overwritten property settings
	//

}
