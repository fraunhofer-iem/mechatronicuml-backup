package de.uni_paderborn.fujaba.muml.componentstorypattern.properties.componentstorypattern.editor;

/**
 * @generated
 */
public class AssemblyVariableEditor
		extends
			de.uni_paderborn.fujaba.muml.componentstorypattern.properties.componentstorypattern.editor.ConnectorVariableEditor {

	/**
	 * @generated
	 */
	public AssemblyVariableEditor(String tab,
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
			addType_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addType_GeneralTab_Editor(String category, boolean front) {
		addEditorToCategory(category, createType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected org.muml.ape.runtime.editors.IPropertyEditor createType_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
				.getAssemblyVariable_Type();
		final org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new org.muml.ape.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public AssemblyVariableEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.componentstorypattern.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage.eINSTANCE
						.getAssemblyVariable());
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
			return new AssemblyVariableEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
