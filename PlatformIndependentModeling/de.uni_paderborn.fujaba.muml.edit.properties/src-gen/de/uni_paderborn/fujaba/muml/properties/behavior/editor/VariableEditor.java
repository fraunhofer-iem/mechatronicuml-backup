package de.uni_paderborn.fujaba.muml.properties.behavior.editor;

/**
 * @generated
 */
public class VariableEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public VariableEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createExtension_ExtensionsTab_Editor(), false);

		addPropertyEditor(createComment_DocumentationTab_Editor(), false);

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Lists",
				createExtension_ExtensionsTab_Editor(), false);

		addPropertyEditor(createName_GeneralTab_Editor(), false);

		addPropertyEditor(createDataType_GeneralTab_Editor(), false);

		addPropertyEditor(createInitializeExpression_GeneralTab_Editor(), false);

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		addEditorToCategory(
				"de.uni_paderborn.fujaba.properties.category.Booleans",
				createConstant_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorInitializeExpression_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createInitializeExpression_GeneralTab_Editor() {
		if (this.editorInitializeExpression_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getVariable_InitializeExpression();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.ui.properties.XtextPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("A variable may have a value when it is initialized. The value is defined by an expression.");

			this.editorInitializeExpression_GeneralTab = editor;
		}
		return this.editorInitializeExpression_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorConstant_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createConstant_GeneralTab_Editor() {
		if (this.editorConstant_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getVariable_Constant();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("It must be defined if a the variable is constant or not.");

			this.editorConstant_GeneralTab = editor;
		}
		return this.editorConstant_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_DocumentationTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createComment_DocumentationTab_Editor() {
		if (this.editorComment_DocumentationTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, true);

			editor.setTooltipMessage("The comment string that can be used to attach arbitrary information to CommentableElements.");

			this.editorComment_DocumentationTab = editor;
		}
		return this.editorComment_DocumentationTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorExtension_ExtensionsTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createExtension_ExtensionsTab_Editor() {
		if (this.editorExtension_ExtensionsTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getExtendableElement_Extension();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.FlattenedListPropertyEditor(
					adapterFactory, feature);

			this.editorExtension_ExtensionsTab = editor;
		}
		return this.editorExtension_ExtensionsTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDataType_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createDataType_GeneralTab_Editor() {
		if (this.editorDataType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
					.getTypedNamedElement_DataType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The data type of this element.");

			this.editorDataType_GeneralTab = editor;
		}
		return this.editorDataType_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createName_GeneralTab_Editor() {
		if (this.editorName_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The name attribute of a meta-model element.");

			this.editorName_GeneralTab = editor;
		}
		return this.editorName_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public VariableEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage.eINSTANCE
						.getVariable());
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
			return new VariableEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
