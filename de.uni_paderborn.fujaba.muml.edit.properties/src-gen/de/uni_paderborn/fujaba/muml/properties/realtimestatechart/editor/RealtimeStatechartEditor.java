package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class RealtimeStatechartEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.behavior.editor.BehaviorEditor {

	/**
	 * @generated
	 */
	public RealtimeStatechartEditor() {
	}

	/**
	 * @generated
	 */
	public void initialize() {

		addRealtimeStatechartTransitionsEditor(null, true);

		addRealtimeStatechartStatesEditor(null, true);

		addRealtimeStatechartClocksEditor(null, true);

		addRealtimeStatechartFlatEditor(null, true);

		addRealtimeStatechartEmbeddedEditor(null, true);

		addRealtimeStatechartAllAvailableVariablesEditor(null, true);

		addRealtimeStatechartAllAvailableOperationsEditor(null, true);

		addNamedElementNameEditor(null, true);

		addCommentableElementCommentEditor(null, true);

		super.initialize();
	}

	/**
	 * @generated
	 */
	protected void addRealtimeStatechartTransitionsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createRealtimeStatechartTransitionsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartTransitionsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_Transitions());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartStatesEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRealtimeStatechartStatesEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartStatesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_States());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartClocksEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRealtimeStatechartClocksEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartClocksEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_Clocks());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartFlatEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRealtimeStatechartFlatEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartFlatEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_Flat());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartEmbeddedEditor(String category,
			boolean front) {
		addEditorToCategory(category, createRealtimeStatechartEmbeddedEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartEmbeddedEditor() {
		return new de.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_Embedded());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartAllAvailableVariablesEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createRealtimeStatechartAllAvailableVariablesEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartAllAvailableVariablesEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_AllAvailableVariables());

	}
	/**
	 * @generated
	 */
	protected void addRealtimeStatechartAllAvailableOperationsEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createRealtimeStatechartAllAvailableOperationsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createRealtimeStatechartAllAvailableOperationsEditor() {
		return new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getRealtimeStatechart_AllAvailableOperations());

	}
	/**
	 * @generated
	 */
	protected void addNamedElementNameEditor(String category, boolean front) {
		addEditorToCategory(category, createNamedElementNameEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createNamedElementNameEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				org.storydriven.core.CorePackage.eINSTANCE
						.getNamedElement_Name());

	}
	/**
	 * @generated
	 */
	protected void addCommentableElementCommentEditor(String category,
			boolean front) {
		addEditorToCategory(category, createCommentableElementCommentEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createCommentableElementCommentEditor() {
		return new de.fujaba.properties.runtime.editors.TextPropertyEditor(
				org.storydriven.core.CorePackage.eINSTANCE
						.getCommentableElement_Comment());

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
			return new RealtimeStatechartEditor();
		}
	}

}
