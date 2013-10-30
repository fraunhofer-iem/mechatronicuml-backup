package de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor;

/**
 * @generated
 */
public abstract class AtomicResourceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.resourcetype.editor.ResourceTypeEditor {

	/**
	 * @generated
	 */
	public AtomicResourceEditor(String tab,
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
			addAtomicResourceParentStructuredResourceEditor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addAtomicResourceParentStructuredResourceEditor(
			String category, boolean front) {
		addEditorToCategory(category,
				createAtomicResourceParentStructuredResourceEditor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createAtomicResourceParentStructuredResourceEditor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage.eINSTANCE
						.getAtomicResource_ParentStructuredResource());

		editor.setTooltipMessage("The StructuredResource, this AtomicResource belongs to.");

		return editor;

	}

}
