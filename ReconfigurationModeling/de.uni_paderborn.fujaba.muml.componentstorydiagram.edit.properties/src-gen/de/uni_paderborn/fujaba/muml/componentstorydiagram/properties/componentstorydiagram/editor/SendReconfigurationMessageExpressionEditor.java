package de.uni_paderborn.fujaba.muml.componentstorydiagram.properties.componentstorydiagram.editor;

/**
 * @generated
 */
public class SendReconfigurationMessageExpressionEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public SendReconfigurationMessageExpressionEditor(String tab,
			org.eclipse.emf.common.notify.AdapterFactory adapterFactory,
			org.eclipse.emf.ecore.EClass eClass) {
		super(tab, adapterFactory, eClass);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createProperties() {

		if (tab == null || "property.tab.constraint".equals(getTab())) { // Tab Constraint

		} else if (tab == null || "property.tab.general".equals(getTab())) { // Tab General

			addPropertyEditor(
					createReconfigurationMessageType_GeneralTab_Editor(), false);

			addPropertyEditor(createParameterBindings_GeneralTab_Editor(),
					false);

		} else if (tab == null || "property.tab.documentation".equals(getTab())) { // Tab Documentation

		} else if (tab == null || "property.tab.extensions".equals(getTab())) { // Tab Extensions

		} else if (tab == null || "property.tab.constraint".equals(getTab())) { // Tab Constraint

		} else if (tab == null || "property.tab.constraint".equals(getTab())) { // Tab Constraint

		}

	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconfigurationMessageType_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createReconfigurationMessageType_GeneralTab_Editor() {
		if (this.editorReconfigurationMessageType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
					.getSendReconfigurationMessageExpression_ReconfigurationMessageType();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorReconfigurationMessageType_GeneralTab = editor;
		}
		return this.editorReconfigurationMessageType_GeneralTab;
	}

	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParameterBindings_GeneralTab;
	private de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor createParameterBindings_GeneralTab_Editor() {
		if (this.editorParameterBindings_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
					.getSendReconfigurationMessageExpression_ParameterBindings();
			final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
					adapterFactory, feature);

			this.editorParameterBindings_GeneralTab = editor;
		}
		return this.editorParameterBindings_GeneralTab;
	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public SendReconfigurationMessageExpressionEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.componentstorydiagram.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
						.getSendReconfigurationMessageExpression());
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
			return new SendReconfigurationMessageExpressionEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
