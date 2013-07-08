package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

/**
 * @generated
 */
public class BehaviorEditor
		extends
			de.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public BehaviorEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addBehaviorOperationsEditor(null, true);

		addBehaviorVariablesEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addBehaviorOperationsEditor(String category, boolean front) {
		addEditorToCategory(category, createBehaviorOperationsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBehaviorOperationsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavior_Operations());

	}
	/**
	 * @generated
	 */
	protected void addBehaviorVariablesEditor(String category, boolean front) {
		addEditorToCategory(category, createBehaviorVariablesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createBehaviorVariablesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getBehavior_Variables());

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
			return new BehaviorEditor();
		}
	}

}
