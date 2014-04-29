package de.uni_paderborn.fujaba.muml.hardware.properties.hwresourceinstance.editor;

/**
 * @generated
 */
public class ProcessorInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwresourceinstance.editor.ComputingResourceInstanceEditor {

	/**
	 * @generated
	 */
	public ProcessorInstanceEditor(String tab,
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
			addProcessorInstanceMIPS_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProcessorInstanceCPI_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProcessorInstanceOwnedCacheInstance_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addProcessorInstanceMIPS_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createProcessorInstanceMIPS_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorInstanceMIPS_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
						.getProcessorInstance_MIPS(), false);

		editor.setTooltipMessage("The MIPS-Rate (Million instructions per second) of this ProcessorInstance.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProcessorInstanceCPI_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createProcessorInstanceCPI_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorInstanceCPI_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
						.getProcessorInstance_CPI(), false);

		editor.setTooltipMessage("The average count of cycles per instruction (CPI) of this ProcessorInstance.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProcessorInstanceOwnedCacheInstance_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createProcessorInstanceOwnedCacheInstance_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorInstanceOwnedCacheInstance_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
						.getProcessorInstance_OwnedCacheInstance());

		editor.setTooltipMessage("The CacheInstance this ProcessorInstance uses.");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ProcessorInstanceEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
						.getProcessorInstance());
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
			return new ProcessorInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.extensions"}).contains(tab);
		}
	}

}
