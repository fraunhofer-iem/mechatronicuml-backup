
package de.uni_paderborn.fujaba.muml.properties.realtimestatechart.editor;

/**
 * @generated
 */
public class AsynchronousMessageEventEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

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

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorKind_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorMessage_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorOneToManyCommunicationSchema_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMessage_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMessage_property_tab_generalTab_Editor() {
		if (this.editorMessage_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getAsynchronousMessageEvent_Message();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The message associated with this event. The message is either requested to be\nreceived (trigger event) or it will be sent (raise event).");

			this.editorMessage_property_tab_generalTab = editor;
		}
		return this.editorMessage_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOneToManyCommunicationSchema_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOneToManyCommunicationSchema_property_tab_generalTab_Editor() {
		if (this.editorOneToManyCommunicationSchema_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getAsynchronousMessageEvent_OneToManyCommunicationSchema();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"An asynchronous message event must have a one-to-many communication schema if the statechart defines the behavior of a multi role.");

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
						.createOCLExpression(
								"if(self.kind = EventKind::RAISE) then one_to_n_schemata::SendingOneToManyCommunicationSchema.oclAsType(ecore::EClass).isSuperTypeOf(eclass) else one_to_n_schemata::ReceivingOneToManyCommunicationSchema.oclAsType(ecore::EClass).isSuperTypeOf(eclass) endif",
								feature, getEClass());
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				query.getEvaluationEnvironment().add("eclass", null);
				de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter filter = new de.uni_paderborn.fujaba.properties.runtime.filter.ICreationFilter() {

					@Override
					public boolean select(Object object, org.eclipse.emf.ecore.EClass eClass) {
						query.getEvaluationEnvironment().replace("eclass", eClass);
						return Boolean.TRUE.equals(query.evaluate(object));
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

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorKind_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorKind_property_tab_generalTab_Editor() {
		if (this.editorKind_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
					.getEvent_Kind();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
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
		this(tab, de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage.eINSTANCE
						.getAsynchronousMessageEvent());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
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
