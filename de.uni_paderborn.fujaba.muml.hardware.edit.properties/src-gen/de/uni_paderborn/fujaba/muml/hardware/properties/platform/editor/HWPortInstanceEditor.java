package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

/**
 * @generated
 */
public abstract class HWPortInstanceEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public HWPortInstanceEditor(String tab,
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
			addHWPortInstanceHwportType_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPortInstanceParentResourceInstance_GeneralTab_Editor(null,
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPortInstanceConnectedMedia_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPortInstanceDelegation_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addHWPortInstanceHwportType_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPortInstanceHwportType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPortInstanceHwportType_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortInstance_HwportType());

		editor.setTooltipMessage("The port type of this HWPortInstance.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPortInstanceParentResourceInstance_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPortInstanceParentResourceInstance_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPortInstanceParentResourceInstance_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortInstance_ParentResourceInstance());

		editor.setTooltipMessage("The ResourceInstance, this HWPortInstance belongs to.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPortInstanceConnectedMedia_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPortInstanceConnectedMedia_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPortInstanceConnectedMedia_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortInstance_ConnectedMedia());

		editor.setTooltipMessage("The CommunicationMedia that is connected to this HWPortInstance.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPortInstanceDelegation_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPortInstanceDelegation_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPortInstanceDelegation_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortInstance_Delegation());

		editor.setTooltipMessage("The delegation this HWPortInstance is connected to.");

		return editor;

	}

}
