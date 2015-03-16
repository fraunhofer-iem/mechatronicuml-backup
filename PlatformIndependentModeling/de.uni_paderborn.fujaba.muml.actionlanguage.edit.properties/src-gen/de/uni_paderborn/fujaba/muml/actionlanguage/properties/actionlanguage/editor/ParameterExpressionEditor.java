package de.uni_paderborn.fujaba.muml.actionlanguage.properties.actionlanguage.editor;

/**
 * @generated
 */
public class ParameterExpressionEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public ParameterExpressionEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		addPropertyEditor(createParameter_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParameter_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createParameter_GeneralTab_Editor() {
		if (this.editorParameter_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
					.getParameterExpression_Parameter();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The parameter which is referenced by the ParameterExpression.");

			this.editorParameter_GeneralTab = editor;
		}
		return this.editorParameter_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ParameterExpressionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.actionlanguage.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
						.getParameterExpression());
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
			return new ParameterExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general"}).contains(
					tab);
		}
	}

}
