
package de.uni_paderborn.fujaba.muml.properties.protocol.editor;

/**
 * @generated
 */
public class ConnectorQualityOfServiceAssumptionsEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptionsEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Message Loss", "Message Loss",
					org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Message Loss",
					createEditorMessageLossPossible_property_tab_generalTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Message Delay", "Message Delay",
					org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Message Delay",
					createEditorMaxMessageDelay_property_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Message Delay",
					createEditorMinMessageDelay_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Message Loss", "Message Loss",
					org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Message Loss",
					createEditorMessageLossPossible_property_tab_generalTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Message Delay", "Message Delay",
					org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Message Delay",
					createEditorMaxMessageDelay_property_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Message Delay",
					createEditorMinMessageDelay_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMaxMessageDelay_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMaxMessageDelay_property_tab_generalTab_Editor() {
		if (this.editorMaxMessageDelay_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getConnectorQualityOfServiceAssumptions_MaxMessageDelay();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The maximal time a message needs from the sender to the receiver using this connector.");

			this.editorMaxMessageDelay_property_tab_generalTab = editor;
		}
		return this.editorMaxMessageDelay_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMinMessageDelay_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMinMessageDelay_property_tab_generalTab_Editor() {
		if (this.editorMinMessageDelay_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getConnectorQualityOfServiceAssumptions_MinMessageDelay();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			{
				final org.eclipse.ocl.ecore.OCLExpression expression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
						.createOCLExpression("false", feature, getEClass());
				editor.setInput(input);
				editor.registerOCLAdapter(expression, new org.eclipse.emf.common.notify.impl.AdapterImpl() {
					@Override
					public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
						boolean visibleBefore = editor.isVisible();
						editor.updateVisibility(true);

						// Set default value, if we are hiding the editor and it was not hidden before.
						if (!editor.isVisible() && visibleBefore) {
							editor.setDefaultValue();
						}
					}
				});
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(expression);
				org.eclipse.jface.viewers.IFilter filter = new org.eclipse.jface.viewers.IFilter() {

					@Override
					public boolean select(Object object) {
						return object != null && Boolean.TRUE.equals(query.evaluate(object));
					}

				};
				if (filter != null) {
					editor.addVisibilityFilter(filter);
				}
			}

			editor.setTooltipMessage(
					"The minimal time a message needs from the sender to the receiver using this connector.");

			this.editorMinMessageDelay_property_tab_generalTab = editor;
		}
		return this.editorMinMessageDelay_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorMessageLossPossible_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorMessageLossPossible_property_tab_generalTab_Editor() {
		if (this.editorMessageLossPossible_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getConnectorQualityOfServiceAssumptions_MessageLossPossible();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"Defines if messages that are send using this connector may be lost during transport.");

			this.editorMessageLossPossible_property_tab_generalTab = editor;
		}
		return this.editorMessageLossPossible_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_property_tab_documentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_property_tab_documentationTab_Editor() {
		if (this.editorComment_property_tab_documentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_property_tab_documentationTab = editor;
		}
		return this.editorComment_property_tab_documentationTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_property_tab_extensionsTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtension_property_tab_extensionsTab_Editor() {
		if (this.editorExtension_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtension_property_tab_extensionsTab = editor;
		}
		return this.editorExtension_property_tab_extensionsTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ConnectorQualityOfServiceAssumptionsEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
						.getConnectorQualityOfServiceAssumptions());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ConnectorQualityOfServiceAssumptionsEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays
					.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.documentation", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
