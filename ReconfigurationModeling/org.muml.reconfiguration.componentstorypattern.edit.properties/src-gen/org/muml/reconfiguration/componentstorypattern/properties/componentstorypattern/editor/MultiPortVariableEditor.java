package org.muml.reconfiguration.componentstorypattern.properties.componentstorypattern.editor;

/**
 * @generated
 */
public class MultiPortVariableEditor
		extends
			org.muml.reconfiguration.componentstorypattern.properties.componentstorypattern.editor.PortVariableEditor {

	/**
	 * @generated
	 */
	public MultiPortVariableEditor(String tab,
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
			addSubPortVariables_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addSubPortVariables_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createSubPortVariables_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected org.muml.ape.runtime.editors.IPropertyEditor createSubPortVariables_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getMultiPortVariable_SubPortVariables();
		final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ListPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("These are all sub-portVariables of the multi-portVariable. The sub-portVariables are represented by SinglePortVariables. \\todosd{Why is this not a containment reference?}\"");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public MultiPortVariableEditor(String tab) {
		this(
				tab,
				org.muml.reconfiguration.componentstorypattern.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
						.getMultiPortVariable());
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
			return new MultiPortVariableEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.general"}).contains(tab);
		}
	}

}
