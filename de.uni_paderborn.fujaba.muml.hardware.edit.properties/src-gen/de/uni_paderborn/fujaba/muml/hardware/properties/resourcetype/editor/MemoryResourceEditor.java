package de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor;

/**
 * @generated
 */
public class MemoryResourceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor.AtomicResourceEditor {

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
			addMemoryResourceMemoryAccessEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMemoryResourceIsVolatileEditor(
					"de.uni_paderborn.fujaba.properties.category.Booleans",
					true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addMemoryResourceMemoryTypeEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addMemoryResourceMemoryAccessEditor(String category,
			boolean front) {
		addEditorToCategory(category, createMemoryResourceMemoryAccessEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMemoryResourceMemoryAccessEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getMemoryResource_MemoryAccess());

		editor.setTooltipMessage("Specifies what kind of access is allowed for this MemoryResource.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addMemoryResourceIsVolatileEditor(String category,
			boolean front) {
		addEditorToCategory(category, createMemoryResourceIsVolatileEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMemoryResourceIsVolatileEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.CheckboxPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getMemoryResource_IsVolatile());

		editor.setTooltipMessage("Specifies if this MemoryResource is volatile or non-volatile. \nNon-volatile Memory (i.e. ROM) could be used to store the binary code.\nVolatile Memory (i.e SRAM) is used during execution of code.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addMemoryResourceMemoryTypeEditor(String category,
			boolean front) {
		addEditorToCategory(category, createMemoryResourceMemoryTypeEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMemoryResourceMemoryTypeEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
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
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
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
							"property.tab.general",
							"property.tab.documentation",
							"property.tab.general"}).contains(tab);
		}
	}

}
