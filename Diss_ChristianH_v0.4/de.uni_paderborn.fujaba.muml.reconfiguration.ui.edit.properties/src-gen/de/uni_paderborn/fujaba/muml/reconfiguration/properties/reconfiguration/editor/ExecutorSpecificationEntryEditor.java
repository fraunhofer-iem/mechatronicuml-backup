package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ExecutorSpecificationEntryEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public ExecutorSpecificationEntryEditor(String tab,
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

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addExecutorSpecificationEntryReconfigurationRule_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addExecutorSpecificationEntryId_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addExecutorSpecificationEntryReconfigurationRule_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createExecutorSpecificationEntryReconfigurationRule_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExecutorSpecificationEntryReconfigurationRule_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getExecutorSpecificationEntry_ReconfigurationRule());

		editor.setTooltipMessage("The reconfiguration rule specified by this entry.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addExecutorSpecificationEntryId_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createExecutorSpecificationEntryId_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExecutorSpecificationEntryId_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getExecutorSpecificationEntry_Id(), 0);

		editor.setTooltipMessage("The ID of this entry. In one executor specification, the IDs of the entries must\nbe uniquely identifying. Specification entries of different executors, however, \nmay use the same IDs.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ExecutorSpecificationEntryEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getExecutorSpecificationEntry());
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
			return new ExecutorSpecificationEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
