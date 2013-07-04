package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

public class VariableEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public VariableEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addVariableInitializeExpressionEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addVariableInitializeExpressionEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createVariableInitializeExpressionEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createVariableInitializeExpressionEditor() {
		return new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getVariable_InitializeExpression());

	}

	//
	// Overwritten property settings
	//

}
