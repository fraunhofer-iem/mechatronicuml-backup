package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.mtctl.editor;

/**
 * @generated
 */
public class PropertyRepositoryEditor
		extends
			de.uni_paderborn.fujaba.properties.runtime.editors.ClassPropertyEditor {

	/**
	 * @generated
	 */
	public PropertyRepositoryEditor(String tab,
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

		if (getTab() == null || "property.tab.mtctl".equals(getTab())) {
			addPropertyRepositoryProperties_MtctlTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addPropertyRepositoryProperties_MtctlTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createPropertyRepositoryProperties_MtctlTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createPropertyRepositoryProperties_MtctlTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.muml.ui.properties.MtctlXtextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage.eINSTANCE
						.getPropertyRepository_Properties());

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public PropertyRepositoryEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage.eINSTANCE
						.getPropertyRepository());
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
			return new PropertyRepositoryEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.mtctl"}).contains(tab);
		}
	}

}
