
package org.muml.uppaal.properties.templates.editor;

/**
 * @generated
 */
public class LocationEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public LocationEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorColor_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorColorCode_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorComment_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorName_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorLocationTimeKind_org_muml_uppaalTab_Editor(), false);

		} else if ("org.muml.uppaal".equals(tab)) { // Tab Uppaal

			addPropertyEditor(createEditorColor_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorColorCode_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorComment_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorName_org_muml_uppaalTab_Editor(), false);

			addPropertyEditor(createEditorLocationTimeKind_org_muml_uppaalTab_Editor(), false);

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorLocationTimeKind_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorLocationTimeKind_org_muml_uppaalTab_Editor() {
		if (this.editorLocationTimeKind_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.templates.TemplatesPackage.eINSTANCE
					.getLocation_LocationTimeKind();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Specifies the kind of location (default, urgent, or committed).");

			this.editorLocationTimeKind_org_muml_uppaalTab = editor;
		}
		return this.editorLocationTimeKind_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorColor_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorColor_org_muml_uppaalTab_Editor() {
		if (this.editorColor_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.visuals.VisualsPackage.eINSTANCE
					.getColoredElement_Color();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage(
					"The color of the model element. It is either a standard uppaal color (default, white, light grey, dark grey, black, blue, cyan, green, magenta, orange, pink, red, yellow) or a self-defined color. Edges should not be white.\n\n\\todosd{We need an OCL-Constraint: Edges should not be white.}\n\\todosd{We need an OCL-Constraint: If self defined is choosen then a color code must be specified.}");

			this.editorColor_org_muml_uppaalTab = editor;
		}
		return this.editorColor_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorColorCode_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorColorCode_org_muml_uppaalTab_Editor() {
		if (this.editorColorCode_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.visuals.VisualsPackage.eINSTANCE
					.getColoredElement_ColorCode();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"The hexadecimal color code of the model element that must be defined if a self-defined color should be used.");

			this.editorColorCode_org_muml_uppaalTab = editor;
		}
		return this.editorColorCode_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorComment_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorComment_org_muml_uppaalTab_Editor() {
		if (this.editorComment_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.core.CorePackage.eINSTANCE
					.getCommentableElement_Comment();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The comment for the model element.\n\\todocg{Change cardinality to 1..1?}");

			this.editorComment_org_muml_uppaalTab = editor;
		}
		return this.editorComment_org_muml_uppaalTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorName_org_muml_uppaalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorName_org_muml_uppaalTab_Editor() {
		if (this.editorName_org_muml_uppaalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.uppaal.core.CorePackage.eINSTANCE
					.getNamedElement_Name();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage("The name of the model element..");

			this.editorName_org_muml_uppaalTab = editor;
		}
		return this.editorName_org_muml_uppaalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public LocationEditor(String tab) {
		this(tab, org.muml.uppaal.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.uppaal.templates.TemplatesPackage.eINSTANCE.getLocation());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new LocationEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"org.muml.uppaal", "org.muml.uppaal",
					"org.muml.uppaal", "org.muml.uppaal", "org.muml.uppaal"}).contains(tab);
		}
	}

}
