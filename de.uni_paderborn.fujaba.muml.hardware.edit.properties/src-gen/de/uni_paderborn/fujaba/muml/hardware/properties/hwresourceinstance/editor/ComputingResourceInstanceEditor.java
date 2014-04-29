package de.uni_paderborn.fujaba.muml.hardware.properties.hwresourceinstance.editor;

/**
 * @generated
 */
public abstract class ComputingResourceInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwresourceinstance.editor.AtomicResourceInstanceEditor {

	/**
	 * @generated
	 */
	public ComputingResourceInstanceEditor(String tab,
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
			addComputingResourceInstanceFrequency_GeneralTab_Editor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addComputingResourceInstanceFrequency_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createComputingResourceInstanceFrequency_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createComputingResourceInstanceFrequency_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
						.getComputingResourceInstance_Frequency());

		editor.setTooltipMessage("The frequency or clock rate of this ComputingResource.");

		return editor;

	}

}
