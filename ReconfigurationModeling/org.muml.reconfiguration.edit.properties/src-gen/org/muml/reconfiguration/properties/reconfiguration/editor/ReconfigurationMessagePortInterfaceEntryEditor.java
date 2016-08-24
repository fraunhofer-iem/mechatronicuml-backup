
package org.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ReconfigurationMessagePortInterfaceEntryEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconfigurationMessagePortInterfaceEntryEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorDescription_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMessageType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorReconfigurationMessageType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorExpectedResponseTime_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorDescription_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMessageType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorReconfigurationMessageType_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorExpectedResponseTime_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconfigurationMessageType_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorReconfigurationMessageType_property_tab_generalTab_Editor() {
		if (this.editorReconfigurationMessageType_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessageType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"Defines whether the message is an info message or a request. A request needs\nto be answered by the parent within the expected response time.");

			this.editorReconfigurationMessageType_property_tab_generalTab = editor;
		}
		return this.editorReconfigurationMessageType_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExpectedResponseTime_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExpectedResponseTime_property_tab_generalTab_Editor() {
		if (this.editorExpectedResponseTime_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If the message is a request, then the expected response time denotes how long \nthe parent has time to answer the request. For an info message, no answer of\nthe parent is sent and, consequently, no expected response time is specified.");

			this.editorExpectedResponseTime_property_tab_generalTab = editor;
		}
		return this.editorExpectedResponseTime_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDescription_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDescription_property_tab_generalTab_Editor() {
		if (this.editorDescription_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationPortInterfaceEntry_Description();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"A human readable description of this reconfiguration port interface entry. \nThis description is to be used by a developer.");

			this.editorDescription_property_tab_generalTab = editor;
		}
		return this.editorDescription_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMessageType_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMessageType_property_tab_generalTab_Editor() {
		if (this.editorMessageType_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurationPortInterfaceEntry_MessageType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The reconfiguration message type that is specified by the reconfiguration \nport interface entry.");

			this.editorMessageType_property_tab_generalTab = editor;
		}
		return this.editorMessageType_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurationMessagePortInterfaceEntryEditor(String tab) {
		this(tab, org.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getReconfigurationMessagePortInterfaceEntry());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ReconfigurationMessagePortInterfaceEntryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general"}).contains(tab);
		}
	}

}
