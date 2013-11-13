package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

/**
 * @generated
 */
public class HWPortPartEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

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
			addHWPortPartHwPortInstanceEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPortPartConnectedMediaEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addHWPortPartHwPortInstanceEditor(String category,
			boolean front) {
		addEditorToCategory(category, createHWPortPartHwPortInstanceEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPortPartHwPortInstanceEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortPart_HwPortInstance());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPortPartConnectedMediaEditor(String category,
			boolean front) {
		addEditorToCategory(category, createHWPortPartConnectedMediaEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPortPartConnectedMediaEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortPart_ConnectedMedia());

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
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
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
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
