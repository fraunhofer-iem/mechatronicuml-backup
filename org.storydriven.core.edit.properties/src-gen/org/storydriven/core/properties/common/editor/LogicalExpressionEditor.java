
package org.storydriven.core.properties.common.editor;

/**
 * @generated
 */
public class LogicalExpressionEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public LogicalExpressionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorOperator_GeneralTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorOperator_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorOperator_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorOperator_GeneralTab_Editor() {
		if (this.editorOperator_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
					.getLogicalExpression_Operator();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
					adapterFactory, feature);

			editor.setTooltipMessage("Specifies the expression's logic operator, e.g. AND, OR, or XOR.");

			this.editorOperator_GeneralTab = editor;
		}
		return this.editorOperator_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public LogicalExpressionEditor(String tab) {
		this(tab, org.storydriven.core.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE.getLogicalExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new LogicalExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general"}).contains(tab);
		}
	}

}
