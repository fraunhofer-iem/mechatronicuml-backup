package de.uni_paderborn.fujaba.muml.hardware.properties.hwresourceinstance.editor;

/**
 * @generated
 */
public abstract class AtomicResourceInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwresourceinstance.editor.ResourceInstanceEditor {

	/**
	 * @generated
	 */
	public AtomicResourceInstanceEditor(String tab,
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
			addAtomicResourceInstanceParentStructuredResourceInstance_GeneralTab_Editor(
					null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addAtomicResourceInstanceParentStructuredResourceInstance_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createAtomicResourceInstanceParentStructuredResourceInstance_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createAtomicResourceInstanceParentStructuredResourceInstance_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage.eINSTANCE
						.getAtomicResourceInstance_ParentStructuredResourceInstance());

		editor.setTooltipMessage("The StructuredResourceInstance, this AtomicResourceInstance belongs to.");

		return editor;

	}

}
