package org.storydriven.core.properties.common.editor;

/**
 * @generated
 */
public class ArithmeticExpressionEditor
		extends
			org.storydriven.core.properties.common.editor.BinaryExpressionEditor {

	/**
	 * @generated
	 */
	public ArithmeticExpressionEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		super.createProperties();

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addArithmeticExpressionOperatorEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addArithmeticExpressionOperatorEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createArithmeticExpressionOperatorEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createArithmeticExpressionOperatorEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getArithmeticExpression_Operator());

		editor.setTooltipMessage("Specifies the expression's arithmetic operator, e.g. +, -, *, /, or MODULO.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ArithmeticExpressionEditor(String tab) {
		this(
				tab,
				org.storydriven.core.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
						.getArithmeticExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new ArithmeticExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.documentation"}).contains(tab);
		}
	}

}
