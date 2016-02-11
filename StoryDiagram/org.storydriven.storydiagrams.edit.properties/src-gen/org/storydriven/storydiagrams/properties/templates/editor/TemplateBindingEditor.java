
package org.storydriven.storydiagrams.properties.templates.editor;

/**
 * @generated
 */
public class TemplateBindingEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public TemplateBindingEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorBoundParameter_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorBoundParameter_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorBoundParameter_property_tab_generalTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorBoundParameter_property_tab_generalTab_Editor() {
		if (this.editorBoundParameter_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.storydiagrams.templates.TemplatesPackage.eINSTANCE
					.getTemplateBinding_BoundParameter();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorBoundParameter_property_tab_generalTab = editor;
		}
		return this.editorBoundParameter_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public TemplateBindingEditor(String tab) {
		this(tab, org.storydriven.storydiagrams.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.storydriven.storydiagrams.templates.TemplatesPackage.eINSTANCE.getTemplateBinding());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new TemplateBindingEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general"}).contains(tab);
		}
	}

}
