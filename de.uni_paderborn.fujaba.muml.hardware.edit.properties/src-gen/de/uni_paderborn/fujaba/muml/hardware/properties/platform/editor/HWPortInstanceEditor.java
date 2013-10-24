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

		addSubCategory("de.fujaba.properties.category.Lists", "Lists",
				org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPortInstanceHwportTypeEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPortInstanceParentResourceInstanceEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPortInstanceConnectedMediaEditor(
					"de.fujaba.properties.category.Lists", true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addHWPortInstanceDelegationEditor(
					"de.fujaba.properties.category.Lists", true);
		}

	}

	/**
	 * @generated
	 */
	protected void addHWPortInstanceHwportTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category, createHWPortInstanceHwportTypeEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createHWPortInstanceHwportTypeEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortInstance_HwportType());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPortInstanceParentResourceInstanceEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createHWPortInstanceParentResourceInstanceEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createHWPortInstanceParentResourceInstanceEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortInstance_ParentResourceInstance());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPortInstanceConnectedMediaEditor(String category,
			boolean front) {
		addEditorToCategory(category,
				createHWPortInstanceConnectedMediaEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createHWPortInstanceConnectedMediaEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortInstance_ConnectedMedia());

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addHWPortInstanceDelegationEditor(String category,
			boolean front) {
		addEditorToCategory(category, createHWPortInstanceDelegationEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createHWPortInstanceDelegationEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ListPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getHWPortInstance_Delegation());

		return editor;

	}

}
