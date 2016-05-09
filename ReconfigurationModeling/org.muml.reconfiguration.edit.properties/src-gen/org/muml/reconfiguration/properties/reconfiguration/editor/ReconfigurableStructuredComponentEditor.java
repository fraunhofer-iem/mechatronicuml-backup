
package org.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class ReconfigurableStructuredComponentEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ReconfigurableStructuredComponentEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory, org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPorts_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorComponentKind_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPorts_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorComponentKind_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorInitialConfiguration_property_tab_generalTab_Editor(), false);

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

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPorts_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorComponentKind_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPorts_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorComponentKind_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorInitialConfiguration_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInitialConfiguration_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorInitialConfiguration_property_tab_generalTab_Editor() {
		if (this.editorInitialConfiguration_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
					.getReconfigurableStructuredComponent_InitialConfiguration();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The initial configurations that are supported by this component. If a component\nis instantiated, it takes of its initial configurations.");

			this.editorInitialConfiguration_property_tab_generalTab = editor;
		}
		return this.editorInitialConfiguration_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPorts_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPorts_property_tab_generalTab_Editor() {
		if (this.editorPorts_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.component.ComponentPackage.eINSTANCE
					.getComponent_Ports();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The ports of a component represent the interaction points between the component and its environment.");

			this.editorPorts_property_tab_generalTab = editor;
		}
		return this.editorPorts_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComponentKind_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComponentKind_property_tab_generalTab_Editor() {
		if (this.editorComponentKind_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.pim.component.ComponentPackage.eINSTANCE
					.getComponent_ComponentKind();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"This attribute specifies the kind of the component. A component may be either\ndiscrete software component, a continuous component, a hybrid component \nor a hardware component.");

			this.editorComponentKind_property_tab_generalTab = editor;
		}
		return this.editorComponentKind_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_property_tab_documentationTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_property_tab_documentationTab_Editor() {
		if (this.editorComment_property_tab_documentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage(
					"The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_property_tab_documentationTab = editor;
		}
		return this.editorComment_property_tab_documentationTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtensions_property_tab_extensionsTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorExtensions_property_tab_extensionsTab_Editor() {
		if (this.editorExtensions_property_tab_extensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getExtendableElement_Extensions();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Extendable Elements can be extended by an Extension.");

			this.editorExtensions_property_tab_extensionsTab = editor;
		}
		return this.editorExtensions_property_tab_extensionsTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_property_tab_generalTab_Editor() {
		if (this.editorName_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
				org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);

				try {
					final org.eclipse.ocl.pivot.ExpressionInOCL oclExpression = helper.createQuery(
							"let prefix : String = self.oclType().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclContainer().oclContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)");
					editor.setInitializeExpression(oclExpression);
				} catch (org.eclipse.ocl.pivot.utilities.ParserException e) {
					e.printStackTrace();
				}
			}

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_property_tab_generalTab = editor;
		}
		return this.editorName_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ReconfigurableStructuredComponentEditor(String tab) {
		this(tab, org.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.reconfiguration.ReconfigurationPackage.eINSTANCE.getReconfigurableStructuredComponent());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ReconfigurableStructuredComponentEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.documentation", "property.tab.extensions",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
