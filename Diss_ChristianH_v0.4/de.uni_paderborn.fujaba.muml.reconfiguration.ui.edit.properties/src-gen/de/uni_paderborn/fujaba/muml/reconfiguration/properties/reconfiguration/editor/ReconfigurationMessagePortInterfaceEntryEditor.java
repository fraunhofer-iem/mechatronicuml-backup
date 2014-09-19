package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ReconfigurationMessagePortInterfaceEntryEditor
		extends
			de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor.ReconfigurationPortInterfaceEntryEditor {

	/**
	 * @generated
	 */
	public ReconfigurationMessagePortInterfaceEntryEditor(String tab,
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
			addReconfigurationMessageType_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addExpectedResponseTime_GeneralTab_Editor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addReconfigurationMessageType_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createReconfigurationMessageType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createReconfigurationMessageType_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
				.getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessageType();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("Defines whether the message is an info message or a request. A request needs\nto be answered by the parent within the expected response time.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addExpectedResponseTime_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createExpectedResponseTime_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createExpectedResponseTime_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
				.getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("If the message is a request, then the expected response time denotes how long \nthe parent has time to answer the request. For an info message, no answer of\nthe parent is sent and, consequently, no expected response time is specified.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurationMessagePortInterfaceEntryEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationMessagePortInterfaceEntry());
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
			return new ReconfigurationMessagePortInterfaceEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
