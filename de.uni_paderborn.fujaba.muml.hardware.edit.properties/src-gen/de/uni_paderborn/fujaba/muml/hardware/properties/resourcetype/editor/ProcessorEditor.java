package de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor;

/**
 * @generated
 */
public class ProcessorEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor.ComputingResourceEditor {

	/**
	 * @generated
	 */
	public ProcessorEditor(String tab,
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
			addProcessorOwnedCacheEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProcessorArchitectureEditor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProcessorNbCoresEditor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProcessorFamilyEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addProcessorOwnedCacheEditor(String category, boolean front) {
		addEditorToCategory(category, createProcessorOwnedCacheEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorOwnedCacheEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getProcessor_OwnedCache());

		editor.setTooltipMessage("The Cache which belongs to this Processor.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProcessorArchitectureEditor(String category, boolean front) {
		addEditorToCategory(category, createProcessorArchitectureEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorArchitectureEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getProcessor_Architecture());

		editor.setTooltipMessage("The architecture of this Processor (i.e. RISC,CISC,..).");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProcessorNbCoresEditor(String category, boolean front) {
		addEditorToCategory(category, createProcessorNbCoresEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorNbCoresEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getProcessor_NbCores());

		editor.setTooltipMessage("The number of cores of this Processor.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProcessorFamilyEditor(String category, boolean front) {
		addEditorToCategory(category, createProcessorFamilyEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorFamilyEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getProcessor_Family(), false);

		editor.setTooltipMessage("The family of this Processor (i.e. x86, ARM, MIPS,..).");

		return editor;

	}

	//
	// instantiation
	//

	/**
	 * @generated
	 */
	public ProcessorEditor(String tab) {
		this(
				tab,
				de.uni_paderborn.fujaba.muml.hardware.properties.util.PropertiesUtil.INSTANCE
						.getAdapterFactory(),
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getProcessor());
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
			return new ProcessorEditor(tab);
		}

		@Override
		public boolean hasTab(java.lang.String tab) {
			return java.util.Arrays.asList(
					new java.lang.String[]{"property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general", "property.tab.general",
							"property.tab.general",
							"property.tab.documentation"}).contains(tab);
		}
	}

}
