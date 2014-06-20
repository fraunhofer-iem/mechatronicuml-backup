package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ReconfigurationPortInterfaceEntryEditor
		extends
			org.storydriven.core.properties.core.editor.ExtendableElementEditor {

	/**
	 * @generated
	 */
	public ReconfigurationPortInterfaceEntryEditor(String tab,
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
			addReconfigurationPortInterfaceEntryDescription_GeneralTab_Editor(
					null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addReconfigurationPortInterfaceEntryMessageType_GeneralTab_Editor(
					null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addReconfigurationPortInterfaceEntryDescription_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createReconfigurationPortInterfaceEntryDescription_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurationPortInterfaceEntryDescription_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationPortInterfaceEntry_Description(),
				false);

		editor.setTooltipMessage("A human readable description of this reconfiguration port interface entry. \nThis description is to be used by a developer.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addReconfigurationPortInterfaceEntryMessageType_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createReconfigurationPortInterfaceEntryMessageType_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurationPortInterfaceEntryMessageType_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationPortInterfaceEntry_MessageType());

		editor.setTooltipMessage("The reconfiguration message type that is specified by the reconfiguration \nport interface entry.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurationPortInterfaceEntryEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationPortInterfaceEntry());
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
			return new ReconfigurationPortInterfaceEntryEditor(tab);
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
