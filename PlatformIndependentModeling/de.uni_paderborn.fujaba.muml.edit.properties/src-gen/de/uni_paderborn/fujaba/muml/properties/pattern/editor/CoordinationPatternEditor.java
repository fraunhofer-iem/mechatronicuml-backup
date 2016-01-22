
package de.uni_paderborn.fujaba.muml.properties.pattern.editor;

/**
 * @generated
 */
public class CoordinationPatternEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public CoordinationPatternEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
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

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorVerificationConstraintRepositories_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAdaptedFromPattern_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVerifiedConfigurations_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPatternParameters_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorDescriptionAspects_property_tab_descriptionAspectsTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorCombineablePatterns_property_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorAlternativePatterns_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPatternVariants_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

			addPropertyEditor(createEditorDescriptionAspects_property_tab_descriptionAspectsTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorVerificationConstraintRepositories_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorName_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorAdaptedFromPattern_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorVerifiedConfigurations_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPatternParameters_property_tab_generalTab_Editor(), false);

			addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists", "Lists", org.eclipse.swt.SWT.HORIZONTAL,
					true);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorCombineablePatterns_property_tab_generalTab_Editor(), false);

			addEditorToCategory("de.uni_paderborn.fujaba.properties.category.Lists",
					createEditorAlternativePatterns_property_tab_generalTab_Editor(), false);

			addPropertyEditor(createEditorPatternVariants_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

			addPropertyEditor(createEditorComment_property_tab_documentationTab_Editor(), false);

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

			addPropertyEditor(createEditorExtension_property_tab_extensionsTab_Editor(), false);

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorCombineablePatterns_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorCombineablePatterns_property_tab_generalTab_Editor() {
		if (this.editorCombineablePatterns_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getCoordinationPattern_CombineablePatterns();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorCombineablePatterns_property_tab_generalTab = editor;
		}
		return this.editorCombineablePatterns_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAlternativePatterns_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAlternativePatterns_property_tab_generalTab_Editor() {
		if (this.editorAlternativePatterns_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getCoordinationPattern_AlternativePatterns();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorAlternativePatterns_property_tab_generalTab = editor;
		}
		return this.editorAlternativePatterns_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDescriptionAspects_property_tab_descriptionAspectsTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorDescriptionAspects_property_tab_descriptionAspectsTab_Editor() {
		if (this.editorDescriptionAspects_property_tab_descriptionAspectsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getCoordinationPattern_DescriptionAspects();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorDescriptionAspects_property_tab_descriptionAspectsTab = editor;
		}
		return this.editorDescriptionAspects_property_tab_descriptionAspectsTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPatternVariants_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPatternVariants_property_tab_generalTab_Editor() {
		if (this.editorPatternVariants_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getCoordinationPattern_PatternVariants();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorPatternVariants_property_tab_generalTab = editor;
		}
		return this.editorPatternVariants_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVerifiedConfigurations_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVerifiedConfigurations_property_tab_generalTab_Editor() {
		if (this.editorVerifiedConfigurations_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getAbstractCoordinationPattern_VerifiedConfigurations();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorVerifiedConfigurations_property_tab_generalTab = editor;
		}
		return this.editorVerifiedConfigurations_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorPatternParameters_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorPatternParameters_property_tab_generalTab_Editor() {
		if (this.editorPatternParameters_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE
					.getAbstractCoordinationPattern_PatternParameters();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorPatternParameters_property_tab_generalTab = editor;
		}
		return this.editorPatternParameters_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorAdaptedFromPattern_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorAdaptedFromPattern_property_tab_generalTab_Editor() {
		if (this.editorAdaptedFromPattern_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage.eINSTANCE
					.getAbstractCoordinationSpecification_AdaptedFromPattern();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("\\todosd{document!}");

			this.editorAdaptedFromPattern_property_tab_generalTab = editor;
		}
		return this.editorAdaptedFromPattern_property_tab_generalTab;
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

			this.editorExtension_property_tab_extensionsTab = editor;
		}
		return this.editorExtension_property_tab_extensionsTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorVerificationConstraintRepositories_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorVerificationConstraintRepositories_property_tab_generalTab_Editor() {
		if (this.editorVerificationConstraintRepositories_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage.eINSTANCE
					.getVerifiableElement_VerificationConstraintRepositories();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The referenced repository that contains verifiable constraints for this element.");

			this.editorVerificationConstraintRepositories_property_tab_generalTab = editor;
		}
		return this.editorVerificationConstraintRepositories_property_tab_generalTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_property_tab_generalTab_Editor() {
		if (this.editorName_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			{
				final org.eclipse.ocl.ecore.OCLExpression initExpression = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin
						.createOCLExpression(
								"let prefix : String = self.oclAsType(ecore::EObject).eClass().name.substring(1, 1) in\nlet number : String = OrderedSet { 1 }->closure(e | \n	let provisionalName : String = prefix.concat(e.toString()) in\n	if self.oclAsType(ecore::EObject).eContainer().eContents()->select(oclIsKindOf(core::NamedElement)).oclAsType(core::NamedElement)->select(n | n.name = provisionalName)->notEmpty() then\n		e + 1\n	else\n		e\n	endif\n)->sortedBy(e | e)->last().toString() in prefix.concat(number)",
								feature, getEClass());
				final org.eclipse.ocl.Query<org.eclipse.emf.ecore.EClassifier, ?, ?> query = de.uni_paderborn.fujaba.properties.runtime.RuntimePlugin.OCL_ECORE
						.createQuery(initExpression);
				if (query != null) {
					editor.setInitializeQuery(query);
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
	public CoordinationPatternEditor(String tab) {
		this(tab, de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.pattern.PatternPackage.eINSTANCE.getCoordinationPattern());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new CoordinationPatternEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general", "property.tab.general",
					"property.tab.descriptionAspects", "property.tab.general", "property.tab.general",
					"property.tab.general", "property.tab.general", "property.tab.documentation",
					"property.tab.extensions", "property.tab.general", "property.tab.general"}).contains(tab);
		}
	}

}
