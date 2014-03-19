package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

/**
 * @generated
 */
public abstract class MemoryResourceInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor.AtomicResourceInstanceEditor {

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
			addMemoryResourceInstanceMemorySize_GeneralTab_Editor(null, false);
		}

	}

	/**
	 * @generated
	 */
	protected void addMemoryResourceInstanceMemorySize_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createMemoryResourceInstanceMemorySize_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createMemoryResourceInstanceMemorySize_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.NavigationFeaturePropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getMemoryResourceInstance_MemorySize());

		editor.setTooltipMessage("The total size of  memory this instances provides.");

		return editor;

	}

}
