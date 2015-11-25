
package org.storydriven.core.properties.common.editor;

/**
 * @generated
 */
public class LiteralExpressionEditor extends de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public LiteralExpressionEditor(String tab, org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {
		if (tab == null) {

			addPropertyEditor(createEditorValue_GeneralTab_Editor(), false);

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(createEditorValue_GeneralTab_Editor(), false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else {
		}
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorValue_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createEditorValue_GeneralTab_Editor() {
		if (this.editorValue_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE
					.getLiteralExpression_Value();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
					adapterFactory, feature, false);

			editor.setTooltipMessage(
					"String representation of the value, e.g. \"5\", \"3.14\", \"c\", \"text\", or \"true\".");

			this.editorValue_GeneralTab = editor;
		}
		return this.editorValue_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public LiteralExpressionEditor(String tab) {
		this(tab, org.storydriven.core.properties.util.PropertiesUtil.INSTANCE.getAdapterFactory(),
				org.storydriven.core.expressions.common.CommonExpressionsPackage.eINSTANCE.getLiteralExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory implements de.uni_paderborn.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(String tab) {
			return new LiteralExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(new java.lang.String[]{"property.tab.general"}).contains(tab);
		}
	}

}
