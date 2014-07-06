package de.uni_paderborn.fujaba.muml.hardware.properties.hwplatform.editor;

/**
 * @generated
 */
public class HWPortPartEditor
		extends
			de.uni_paderborn.fujaba.muml.properties.connector.editor.ConnectorEndpointEditor {

	/**
	 * @generated
	 */
	public HWPortPartEditor(String tab,
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
			addCommunicationResource_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addParentResourcePart_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addCommunicationResource_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createCommunicationResource_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createCommunicationResource_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
				.getHWPortPart_CommunicationResource();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addParentResourcePart_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createParentResourcePart_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createParentResourcePart_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
				.getHWPortPart_ParentResourcePart();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HWPortPartEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage.eINSTANCE
						.getHWPortPart());
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
			return new HWPortPartEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.documentation",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
