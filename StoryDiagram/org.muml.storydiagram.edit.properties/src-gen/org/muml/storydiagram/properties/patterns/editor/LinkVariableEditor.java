
package org.muml.storydiagram.properties.patterns.editor;

/**
 * @generated
 */
public class LinkVariableEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public LinkVariableEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBindingSemantics_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBindingOperator_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSource_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTarget_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorSecondLinkConstraints_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorFirstLinkConstraints_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTargetEnd_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBindingSemantics_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorBindingOperator_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorSource_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTarget_property_tab_generalTab_Editor(), false);

			addSubCategory("org.muml.ape.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorSecondLinkConstraints_property_tab_generalTab_Editor(), false);

			addEditorToCategory("org.muml.ape.category.Lists",
					createEditorFirstLinkConstraints_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorTargetEnd_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtensions_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTargetEnd_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTargetEnd_property_tab_generalTab_Editor() {
		if (this.editorTargetEnd_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getLinkVariable_TargetEnd();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The target end points to the reference that types this direction of the link (the \"normal\" direction). This link end must be set always.");

			this.editorTargetEnd_property_tab_generalTab = editor;
		}
		return this.editorTargetEnd_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingSemantics_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingSemantics_property_tab_generalTab_Editor() {
		if (this.editorBindingSemantics_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractLinkVariable_BindingSemantics();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The binding semantics defines whether the link must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern. The default value is \"mandatory\" (i.e., it must be matched).");

			this.editorBindingSemantics_property_tab_generalTab = editor;
		}
		return this.editorBindingSemantics_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBindingOperator_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBindingOperator_property_tab_generalTab_Editor() {
		if (this.editorBindingOperator_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractLinkVariable_BindingOperator();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The binding operator defines whether this link will be matched, created or destroyed by the story pattern. The default value ist \"check_only\", i.e., the link will be matched.");

			this.editorBindingOperator_property_tab_generalTab = editor;
		}
		return this.editorBindingOperator_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSource_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSource_property_tab_generalTab_Editor() {
		if (this.editorSource_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractLinkVariable_Source();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorSource_property_tab_generalTab = editor;
		}
		return this.editorSource_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorSecondLinkConstraints_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorSecondLinkConstraints_property_tab_generalTab_Editor() {
		if (this.editorSecondLinkConstraints_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractLinkVariable_SecondLinkConstraints();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorSecondLinkConstraints_property_tab_generalTab = editor;
		}
		return this.editorSecondLinkConstraints_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorFirstLinkConstraints_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorFirstLinkConstraints_property_tab_generalTab_Editor() {
		if (this.editorFirstLinkConstraints_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractLinkVariable_FirstLinkConstraints();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorFirstLinkConstraints_property_tab_generalTab = editor;
		}
		return this.editorFirstLinkConstraints_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorTarget_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorTarget_property_tab_generalTab_Editor() {
		if (this.editorTarget_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE
					.getAbstractLinkVariable_Target();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorTarget_property_tab_generalTab = editor;
		}
		return this.editorTarget_property_tab_generalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_property_tab_generalTab_Editor() {
		if (this.editorName_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{

				try {
					final org.eclipse.ocl.pivot.utilities.OCL ocl = org.eclipse.ocl.pivot.utilities.OCL.newInstance();
					org.eclipse.ocl.pivot.utilities.OCLHelper helper = ocl.createOCLHelper(feature);
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

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public LinkVariableEditor(String tab) {
		this(tab, org.muml.storydiagram.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.storydiagram.patterns.PatternsPackage.eINSTANCE.getLinkVariable());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new LinkVariableEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.extensions"}).contains(tab);
		}
	}

}
