package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

/**
 * @generated
 */
public class ProcessorInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor.ComputingResourceInstanceEditor {

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
			addProcessorInstanceMIPSEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProcessorInstanceCPIEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProcessorInstanceOwnedCacheInstanceEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addProcessorInstanceMIPSEditor(String category, boolean front) {
		addEditorToCategory(category, createProcessorInstanceMIPSEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createProcessorInstanceMIPSEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getProcessorInstance_MIPS(), 3);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProcessorInstanceCPIEditor(String category, boolean front) {
		addEditorToCategory(category, createProcessorInstanceCPIEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createProcessorInstanceCPIEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.SpinnerPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getProcessorInstance_CPI(), 3);

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProcessorInstanceOwnedCacheInstanceEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createProcessorInstanceOwnedCacheInstanceEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.fujaba.properties.runtime.editors.IPropertyEditor createProcessorInstanceOwnedCacheInstanceEditor() {
		de.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getProcessorInstance_OwnedCacheInstance());

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
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getProcessorInstance());
	}

	/**
	 * @generated
	 */
	public static class Factory
			implements
				de.fujaba.properties.runtime.factory.IPropertyEditorFactory {
		@Override
		public de.fujaba.properties.runtime.editors.IPropertyEditor createPropertyEditor(
				String tab) {
			return new ProcessorInstanceEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general"})
					.contains(tab);
		}
	}

}
