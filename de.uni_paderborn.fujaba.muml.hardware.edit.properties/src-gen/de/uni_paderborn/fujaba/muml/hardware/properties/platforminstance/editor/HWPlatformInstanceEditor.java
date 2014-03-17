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
			addHWPlatformInstanceHwplatformType_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPlatformInstanceDelegationPorts_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPlatformInstanceDelegations_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addHWPlatformInstanceHwplatformType_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPlatformInstanceHwplatformType_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPlatformInstanceHwplatformType_GeneralTab_Editor() {
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
	protected void addHWPlatformInstanceDelegationPorts_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPlatformInstanceDelegationPorts_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPlatformInstanceDelegationPorts_GeneralTab_Editor() {
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
	protected void addHWPlatformInstanceDelegations_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPlatformInstanceDelegations_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPlatformInstanceDelegations_GeneralTab_Editor() {
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
							"property.tab.general", "property.tab.extensions"})
					.contains(tab);
		}
	}

}
