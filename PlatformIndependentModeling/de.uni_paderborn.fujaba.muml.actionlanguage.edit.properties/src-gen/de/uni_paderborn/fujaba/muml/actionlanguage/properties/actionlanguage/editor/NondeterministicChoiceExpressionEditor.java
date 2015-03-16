package de.uni_paderborn.fujaba.muml.actionlanguage.properties.actionlanguage.editor;

/**
 * @generated
 */
public class NondeterministicChoiceExpressionEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public NondeterministicChoiceExpressionEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		addPropertyEditor(createRange_GeneralTab_Editor(), false);

		addPropertyEditor(createDataType_GeneralTab_Editor(), false);

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorRange_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createRange_GeneralTab_Editor() {
		if (this.editorRange_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
					.getNondeterministicChoiceExpression_Range();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The range defines the lower bound and the upper bound of the interval from which\nvalues will be chosen nondeterministically. Every value in this interval will be\nchosen with the same probability.");

			this.editorRange_GeneralTab = editor;
		}
		return this.editorRange_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorDataType_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createDataType_GeneralTab_Editor() {
		if (this.editorDataType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
					.getNondeterministicChoiceExpression_DataType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("The base type for the interval defined by the range. We only allow for integer types.");

			this.editorDataType_GeneralTab = editor;
		}
		return this.editorDataType_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public NondeterministicChoiceExpressionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.actionlanguage.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage.eINSTANCE
						.getNondeterministicChoiceExpression());
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
			return new NondeterministicChoiceExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
