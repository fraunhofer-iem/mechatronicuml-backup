
package org.muml.storydiagram.properties.expressions.editor;

/**
 * @generated
 */
public class ParameterExpressionEditor extends org.muml.ape.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ParameterExpressionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorParameter_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.descriptionAspects".equals(tab)) { // Tab Description Aspects

		} else if ("property.tab.condition".equals(tab)) { // Tab Condition

		} else if ("property.tab.effect".equals(tab)) { // Tab Effect

		} else if ("property.tab.deadline".equals(tab)) { // Tab Deadline

		} else if ("property.tab.sampling".equals(tab)) { // Tab Sampling

		} else if ("property.tab.message".equals(tab)) { // Tab Message

		} else if ("property.tab.behavior".equals(tab)) { // Tab Behavior

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorParameter_property_tab_generalTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParameter_property_tab_generalTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorParameter_property_tab_generalTab_Editor() {
		if (this.editorParameter_property_tab_generalTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.storydiagram.calls.expressions.ExpressionsPackage.eINSTANCE
					.getParameterExpression_Parameter();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorParameter_property_tab_generalTab = editor;
		}
		return this.editorParameter_property_tab_generalTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ParameterExpressionEditor(String tab) {
		this(tab, org.muml.storydiagram.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.muml.storydiagram.calls.expressions.ExpressionsPackage.eINSTANCE.getParameterExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory implements org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new ParameterExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general"}).contains(tab);
		}
	}

}
