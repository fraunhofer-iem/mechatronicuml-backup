package de.uni_paderborn.fujaba.muml.hardware.properties.hwresourceinstance.editor;

/**
 * @generated
 */
public abstract class MemoryResourceInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwresourceinstance.editor.AtomicResourceInstanceEditor {

	/**
	 * @generated
	 */
	public MemoryResourceInstanceEditor(String tab,
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
			addMemorySize_GeneralTab_Editor(null, false);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addThroughput_GeneralTab_Editor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addMemorySize_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createMemorySize_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMemorySize_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
				.getMemoryResourceInstance_MemorySize();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The total size of  memory this instances provides.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addThroughput_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createThroughput_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createThroughput_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
				.getMemoryResourceInstance_Throughput();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The maximum speed at which the memory can be read.");

		return editor;

	}

}
