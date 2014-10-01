package de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor;

/**
 * @generated
 */
public abstract class AtomicResourceEditor
		extends
			de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor.ResourceEditor {

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
			addParentStructuredResource_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addParentStructuredResource_GeneralTab_Editor(
			String category, boolean front) {
		addEditorToCategory(category,
				createParentStructuredResource_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createParentStructuredResource_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
				.getAtomicResource_ParentStructuredResource();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The StructuredResource, this AtomicResource belongs to.");

		return editor;

	}

}
