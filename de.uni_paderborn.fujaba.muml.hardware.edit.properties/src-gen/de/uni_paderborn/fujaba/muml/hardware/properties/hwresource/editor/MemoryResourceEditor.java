package de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor;

/**
 * @generated
 */
public class MemoryResourceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor.AtomicResourceEditor {

	/**
	 * @generated
	 */
	public MemoryResourceEditor(String tab,
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

		addSubCategory("de.uni_paderborn.fujaba.properties.category.Booleans",
				"Booleans", org.eclipse.swt.SWT.HORIZONTAL, true);

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMemoryResourceMemoryAccess_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMemoryResourceIsVolatile_GeneralTab_Editor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMemoryResourceMemoryType_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addMemoryResourceMemoryAccess_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createMemoryResourceMemoryAccess_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMemoryResourceMemoryAccess_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getMemoryResource_MemoryAccess());

		editor.setTooltipMessage("Specifies what kind of access is allowed for this MemoryResource.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addMemoryResourceIsVolatile_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createMemoryResourceIsVolatile_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMemoryResourceIsVolatile_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getMemoryResource_IsVolatile());

		editor.setTooltipMessage("Specifies if this MemoryResource is volatile or non-volatile. \nNon-volatile Memory (i.e. ROM) could be used to store the binary code.\nVolatile Memory (i.e SRAM) is used during execution of code.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addMemoryResourceMemoryType_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createMemoryResourceMemoryType_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMemoryResourceMemoryType_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getMemoryResource_MemoryType());

		editor.setTooltipMessage("The type of this MemoryResource.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public MemoryResourceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getMemoryResource());
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
			return new MemoryResourceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
