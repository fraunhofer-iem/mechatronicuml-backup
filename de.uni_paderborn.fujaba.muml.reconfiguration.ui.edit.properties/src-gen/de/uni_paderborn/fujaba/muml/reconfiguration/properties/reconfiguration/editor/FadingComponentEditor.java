package de.uni_paderborn.fujaba.muml.reconfiguration.properties.reconfiguration.editor;

/**
 * @generated
 */
public class FadingComponentEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.component.editor.AtomicComponentEditor {

	/**
	 * @generated
	 */
	public FadingComponentEditor(String tab,
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
			addFadingComponentFadingFunction_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addFadingComponentFadingFunction_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createFadingComponentFadingFunction_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createFadingComponentFadingFunction_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getFadingComponent_FadingFunction());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public FadingComponentEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.reconfiguration.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage.eINSTANCE
						.getFadingComponent());
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
			return new FadingComponentEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.extensions",
							"property.tab.documentation",
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
