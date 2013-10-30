package de.uni_paderborn.fujaba.muml.hardware.properties.platforminstance.editor;

/**
 * @generated
 */
public class HWPlatformInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public HWPlatformInstanceEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Lists",
				"Lists", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPlatformInstanceHwplatformTypeEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPlatformInstanceDelegationPortsEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPlatformInstanceDelegationsEditor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addHWPlatformInstanceHwplatformTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createHWPlatformInstanceHwplatformTypeEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPlatformInstanceHwplatformTypeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage.eINSTANCE
						.getHWPlatformInstance_HwplatformType());

		editor.setTooltipMessage("The HWPlatform type of which this instance is derived.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPlatformInstanceDelegationPortsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createHWPlatformInstanceDelegationPortsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPlatformInstanceDelegationPortsEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage.eINSTANCE
						.getHWPlatformInstance_DelegationPorts());

		editor.setTooltipMessage("The delegation ports of this HWPlatformInstance. They are derived from the HWPlatform type.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPlatformInstanceDelegationsEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createHWPlatformInstanceDelegationsEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPlatformInstanceDelegationsEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage.eINSTANCE
						.getHWPlatformInstance_Delegations());

		editor.setTooltipMessage("The delegations of this HWPlatformInstance. They are derived from is HWPlatform type.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public HWPlatformInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage.eINSTANCE
						.getHWPlatformInstance());
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
			return new HWPlatformInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general"}).contains(tab);
		}
	}

}
