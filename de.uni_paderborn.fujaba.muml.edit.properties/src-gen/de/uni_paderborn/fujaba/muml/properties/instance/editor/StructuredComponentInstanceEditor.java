package de.uni_paderborn.fujaba.muml.properties.instance.editor;

/**
 * @generated
 */
public class StructuredComponentInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.instance.editor.ComponentInstanceEditor {

	/**
	 * @generated
	 */
	public StructuredComponentInstanceEditor(String tab,
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
			addStructuredComponentInstanceEmbeddedCICEditor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addStructuredComponentInstanceEmbeddedCICEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createStructuredComponentInstanceEmbeddedCICEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createStructuredComponentInstanceEmbeddedCICEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getStructuredComponentInstance_EmbeddedCIC());

		editor.setTooltipMessage("The component instances and connector instances that are embedded in this component instance\nare contained by the component instance configuration.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public StructuredComponentInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.instance.InstancePackage.eINSTANCE
						.getStructuredComponentInstance());
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
			return new StructuredComponentInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
