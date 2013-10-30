package de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor;

/**
 * @generated
 */
public abstract class AtomicResourceInstanceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.platform.editor.ResourceInstanceEditor {

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
			addAtomicResourceInstanceParentStructuredResourceInstanceEditor(
					null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addAtomicResourceInstanceParentStructuredResourceInstanceEditor(
			String category, boolean front) {
		addEditorToCategory(
				category,
				createAtomicResourceInstanceParentStructuredResourceInstanceEditor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createAtomicResourceInstanceParentStructuredResourceInstanceEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage.eINSTANCE
						.getAtomicResourceInstance_ParentStructuredResourceInstance());

		editor.setTooltipMessage("The StructuredResourceInstance, this AtomicResourceInstance belongs to.");

		return editor;

	}

}
