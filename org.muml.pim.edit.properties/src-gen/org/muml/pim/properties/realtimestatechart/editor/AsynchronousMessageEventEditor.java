
package org.muml.pim.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class AsynchronousMessageEventEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public AsynchronousMessageEventEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorKind_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMessage_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOneToManyCommunicationSchema_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorKind_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMessage_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOneToManyCommunicationSchema_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMessage_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMessage_property_tab_generalTab_Editor() {
		if (this.editorMessage_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getAsynchronousMessageEvent_Message();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The message associated with this event. The message is either requested to be\nreceived (trigger event) or it will be sent (raise event).");

			this.editorMessage_property_tab_generalTab = editor;
		}
		return this.editorMessage_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOneToManyCommunicationSchema_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOneToManyCommunicationSchema_property_tab_generalTab_Editor() {
		if (this.editorOneToManyCommunicationSchema_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getAsynchronousMessageEvent_OneToManyCommunicationSchema();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"An asynchronous message event must have a one-to-many communication schema if the statechart defines the behavior of a multi role.");

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = org.muml.ape.runtime.RuntimePlugin
						.createOCLExpression(
								"if(self.kind = EventKind::RAISE) then one_to_n_schemata::SendingOneToManyCommunicationSchema.oclAsType(ecore::EClass).isSuperTypeOf(eclass) else one_to_n_schemata::ReceivingOneToManyCommunicationSchema.oclAsType(ecore::EClass).isSuperTypeOf(eclass) endif",
								feature, getEClass());
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = org.muml.ape.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				query.getEvaluationEnvironment().add("eclass", null);
				org.muml.ape.runtime.filter.ICreationFilter filter = new org.muml.ape.runtime.filter.ICreationFilter() {

					@Override
					public boolean select(Object object, org.eclipse.emf.ecore.EClass eClass) {
						query.getEvaluationEnvironment().replace("eclass", eClass);
						try {
							return Boolean.TRUE.equals(query.evaluate(object));
						} catch (org.eclipse.ocl.pivot.values.InvalidValueException e) {
							return false;
						}
					}

				};
				if (filter != null) {
					editor.addCreationFilter(filter);
				}
			}

			this.editorOneToManyCommunicationSchema_property_tab_generalTab = editor;
		}
		return this.editorOneToManyCommunicationSchema_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorKind_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorKind_property_tab_generalTab_Editor() {
		if (this.editorKind_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getEvent_Kind();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"Decides the kind: Is this a raise event or a trigger event?\n\nA event may either be a trigger event or a raise event. A trigger event triggers \nsome action within the statechart, a raise event is generated by the statechart \nand will be processed by another statechart.");

			this.editorKind_property_tab_generalTab = editor;
		}
		return this.editorKind_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public AsynchronousMessageEventEditor(String tab) {
		this(tab, org.muml.pim.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.pim.realtimestatechart.RealtimestatechartPackage.eINSTANCE.getAsynchronousMessageEvent());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new AsynchronousMessageEventEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general", "property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
