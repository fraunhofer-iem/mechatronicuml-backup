package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ManagerSpecificationEntryEditor
		extends
			org.storydriven.core.properties.core.editor.CommentableElementEditor {

	/**
	 * @generated
	 */
	public ManagerSpecificationEntryEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryTreatEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryPropagateEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryMessageTypeEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryStructuralConditionEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryReconfigurationRuleEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryInvokePlannerEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryBlockableEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addManagerSpecificationEntryTreatEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryTreatEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryTreatEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getManagerSpecificationEntry_Treat());

		editor.setTooltipMessage("If true, then message of the type referenced by this entry will be treated.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addManagerSpecificationEntryPropagateEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryPropagateEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryPropagateEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getManagerSpecificationEntry_Propagate());

		editor.setTooltipMessage("If true, then message of the type referenced by this entry will be propagated.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addManagerSpecificationEntryMessageTypeEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryMessageTypeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryMessageTypeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getManagerSpecificationEntry_MessageType());

		editor.setTooltipMessage("The message type which is processed by this entry. This message type either \nneeds to be offered by the executor to the parent or it must be sent by one of\nthe embedded components.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addManagerSpecificationEntryStructuralConditionEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryStructuralConditionEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryStructuralConditionEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getManagerSpecificationEntry_StructuralCondition());

		editor.setTooltipMessage("The structural condition is a condition on the embedded components and ports\nof the component that must evaluate to true for being able to execute the\nreconfiguration.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addManagerSpecificationEntryReconfigurationRuleEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryReconfigurationRuleEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryReconfigurationRuleEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getManagerSpecificationEntry_ReconfigurationRule());

		editor.setTooltipMessage("The reconfiguration rule that will be executed by the executor if this entry\nis treated and all conditions evaluate to true during run-time.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addManagerSpecificationEntryInvokePlannerEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryInvokePlannerEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryInvokePlannerEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getManagerSpecificationEntry_InvokePlanner());

		editor.setTooltipMessage("If true, then a planner will be invoke at run-time to determine whether it is \nuseful to execute the requested reconfiguration.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addManagerSpecificationEntryBlockableEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryBlockableEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryBlockableEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getManagerSpecificationEntry_Blockable());

		editor.setTooltipMessage("If true, then the component checks whether it is safe to execute the reconfiguration\nusing a run-time safety analysis.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ManagerSpecificationEntryEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getManagerSpecificationEntry());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new ManagerSpecificationEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
