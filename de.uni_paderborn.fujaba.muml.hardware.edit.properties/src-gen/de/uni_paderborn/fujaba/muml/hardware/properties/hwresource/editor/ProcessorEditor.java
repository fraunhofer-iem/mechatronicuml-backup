package de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor;

/**
 * @generated
 */
public class ProcessorEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor.ComputingResourceEditor {

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
			addProcessorOwnedCache_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProcessorArchitecture_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addProcessorFamily_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addProcessorOwnedCache_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createProcessorOwnedCache_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorOwnedCache_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getProcessor_OwnedCache());

		editor.setTooltipMessage("The Cache which belongs to this Processor.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProcessorArchitecture_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createProcessorArchitecture_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorArchitecture_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.OptionPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getProcessor_Architecture());

		editor.setTooltipMessage("The architecture of this Processor (i.e. RISC,CISC,..).");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addProcessorFamily_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createProcessorFamily_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createProcessorFamily_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.TextPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
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
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
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
							"property.tab.extensions"}).contains(tab);
		}
	}

}
