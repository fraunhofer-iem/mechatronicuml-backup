
package org.muml.pim.properties.one_to_n_schemata.editor;

/**
 * @generated
 */
public class UnicastEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public UnicastEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorCondition_property_tab_conditionTab_Editor(), false);

			addPropertyEditor(createEditorAction_property_tab_effectTab_Editor(), false);

			addPropertyEditor(createEditorRetryAfter_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

			addPropertyEditor(createEditorCondition_property_tab_conditionTab_Editor(), false);

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

			addPropertyEditor(createEditorAction_property_tab_effectTab_Editor(), false);

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorRetryAfter_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCondition_property_tab_conditionTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCondition_property_tab_conditionTab_Editor() {
		if (this.editorCondition_property_tab_conditionTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage.eINSTANCE
					.getOneToManyCommunicationSchema_Condition();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.pim.actionlanguage.xtext.ui.properties.XtextPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("A subrole only sends or receives a message if it satisfies this condition.");

			this.editorCondition_property_tab_conditionTab = editor;
		}
		return this.editorCondition_property_tab_conditionTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAction_property_tab_effectTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAction_property_tab_effectTab_Editor() {
		if (this.editorAction_property_tab_effectTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage.eINSTANCE
					.getOneToManyCommunicationSchema_Action();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The action a subrole performs when sending or receiving a message with communication schema.");

			this.editorAction_property_tab_effectTab = editor;
		}
		return this.editorAction_property_tab_effectTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRetryAfter_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorRetryAfter_property_tab_generalTab_Editor() {
		if (this.editorRetryAfter_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage.eINSTANCE
					.getOneToManyCommunicationSchema_RetryAfter();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"If the transition uses a communication schemata with the condition attribute, then it may be that no subrole may send or receiver a message. Before the RTSC may retry again to execute the communication schemata, it has to wait a specific time. This time is encoded within the attribute retryAfter.");

			this.editorRetryAfter_property_tab_generalTab = editor;
		}
		return this.editorRetryAfter_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public UnicastEditor(String tab) {
		this(tab, org.muml.pim.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage.eINSTANCE.getUnicast());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new UnicastEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.condition", "property.tab.effect",
					"property.tab.general", "property.tab.general"}).contains(tab);
		}
	}

}
