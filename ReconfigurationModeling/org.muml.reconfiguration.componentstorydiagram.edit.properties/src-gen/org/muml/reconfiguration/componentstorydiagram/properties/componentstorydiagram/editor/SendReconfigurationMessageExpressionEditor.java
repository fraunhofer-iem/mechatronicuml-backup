package org.muml.reconfiguration.componentstorydiagram.properties.componentstorydiagram.editor;

/**
 * @generated
 */
public class SendReconfigurationMessageExpressionEditor
		extends
			org.muml.ape.runtime.editors.ClassPropertyEditor {

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
		if (tab == null) {

			addPropertyEditor(
					createReconfigurationMessageType_GeneralTab_Editor(), false);

			addPropertyEditor(createParameterBindings_GeneralTab_Editor(),
					false);

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.general".equals(tab)) { // Tab General

			addPropertyEditor(
					createReconfigurationMessageType_GeneralTab_Editor(), false);

			addPropertyEditor(createParameterBindings_GeneralTab_Editor(),
					false);

		} else if ("property.tab.documentation".equals(tab)) { // Tab Documentation

		} else if ("property.tab.extensions".equals(tab)) { // Tab Extensions

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else if ("property.tab.constraint".equals(tab)) { // Tab Constraint

		} else {
		}
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorReconfigurationMessageType_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createReconfigurationMessageType_GeneralTab_Editor() {
		if (this.editorReconfigurationMessageType_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
					.getSendReconfigurationMessageExpression_ReconfigurationMessageType();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
					adapterFactory, feature);

			this.editorReconfigurationMessageType_GeneralTab = editor;
		}
		return this.editorReconfigurationMessageType_GeneralTab;
	}

	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editorParameterBindings_GeneralTab;
	private org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor createParameterBindings_GeneralTab_Editor() {
		if (this.editorParameterBindings_GeneralTab == null) {
			final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
					.getSendReconfigurationMessageExpression_ParameterBindings();
			final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
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
				org.muml.reconfiguration.componentstorydiagram.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage.eINSTANCE
						.getSendReconfigurationMessageExpression());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				org.muml.ape.runtime.factory.IPropertyEditorFactory {
		@Override
		public org.muml.ape.runtime.editors.IPropertyEditor createPropertyEditor(
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
