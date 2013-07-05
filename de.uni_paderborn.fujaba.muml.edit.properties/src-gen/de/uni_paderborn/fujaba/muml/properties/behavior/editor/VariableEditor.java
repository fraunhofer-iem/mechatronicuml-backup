package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

/**
 * @generated
 */
public class VariableEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.behavior.editor.TypedNamedElementEditor {

	/**
	 * @generated
	 */
	public VariableEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addVariableInitializeExpressionEditor(null, false);

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

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor() {
			return new VariableEditor();
		}
	}

}
