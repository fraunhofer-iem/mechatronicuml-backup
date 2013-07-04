package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

public class OperationEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public OperationEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addOperationImplementationsEditor(null, true);

		addOperationParametersEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addOperationImplementationsEditor(String category,
			boolean front) {
		addEditorToCategory(category, createOperationImplementationsEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createOperationImplementationsEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getOperation_Implementations());

	}
	/**
	 * @generated
	 */
	protected void addOperationParametersEditor(String category, boolean front) {
		addEditorToCategory(category, createOperationParametersEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createOperationParametersEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getOperation_Parameters());

	}

	//
	// Overwritten property settings
	//

}
