package de.uni_paderborn.fujaba.muml.properties.types.editor;

/**
 * @generated
 */
public class RangedPrimitiveDataTypeEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public RangedPrimitiveDataTypeEditor(String tab,
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

		addPropertyEditor(createRangedType_GeneralTab_Editor(), false);

		addPropertyEditor(createRange_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRangedType_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createRangedType_GeneralTab_Editor() {
		if (this.editorRangedType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
					.getRangedPrimitiveDataType_RangedType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The primitive data type that provides a superset of possible values.");

			this.editorRangedType_GeneralTab = editor;
		}
		return this.editorRangedType_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRange_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createRange_GeneralTab_Editor() {
		if (this.editorRange_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
					.getRangedPrimitiveDataType_Range();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The range of values provided by this data type.");

			this.editorRange_GeneralTab = editor;
		}
		return this.editorRange_GeneralTab;
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
	public RangedPrimitiveDataTypeEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.types.TypesPackage.eINSTANCE
						.getRangedPrimitiveDataType());
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
			return new RangedPrimitiveDataTypeEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general"})
					.contains(tab);
		}
	}

}
