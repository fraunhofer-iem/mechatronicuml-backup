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
			addManagerSpecificationEntryTreat_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryPropagate_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryMessageType_GeneralTab_Editor(null,
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryStructuralCondition_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryReconfigurationRule_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryInvokePlanner_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addManagerSpecificationEntryBlockable_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

	}

	/**
	 * @generated
	 */
	protected void addManagerSpecificationEntryTreat_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryTreat_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryTreat_GeneralTab_Editor() {
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
	protected void addManagerSpecificationEntryPropagate_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryPropagate_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryPropagate_GeneralTab_Editor() {
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
	protected void addManagerSpecificationEntryMessageType_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryMessageType_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryMessageType_GeneralTab_Editor() {
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
	protected void addManagerSpecificationEntryStructuralCondition_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createManagerSpecificationEntryStructuralCondition_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryStructuralCondition_GeneralTab_Editor() {
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
	protected void addManagerSpecificationEntryReconfigurationRule_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createManagerSpecificationEntryReconfigurationRule_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryReconfigurationRule_GeneralTab_Editor() {
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
	protected void addManagerSpecificationEntryInvokePlanner_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createManagerSpecificationEntryInvokePlanner_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryInvokePlanner_GeneralTab_Editor() {
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
	protected void addManagerSpecificationEntryBlockable_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createManagerSpecificationEntryBlockable_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createManagerSpecificationEntryBlockable_GeneralTab_Editor() {
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
