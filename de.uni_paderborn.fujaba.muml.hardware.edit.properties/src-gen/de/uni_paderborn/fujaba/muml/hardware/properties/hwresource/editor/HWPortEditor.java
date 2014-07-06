package de.uni_paderborn.fujaba.muml.hardware.properties.hwresource.editor;

/**
 * @generated
 */
public abstract class HWPortEditor
		extends
			org.storydriven.core.properties.core.editor.NamedElementEditor {

	/**
	 * @generated
	 */
	public HWPortEditor(String tab,
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
			addParentResource_GeneralTab_Editor(null, true);
		}

		if (getTab() == null || "property.tab.general".equals(getTab())) {
			addParentResourceInstance_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addParentResource_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category, createParentResource_GeneralTab_Editor(),
				front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createParentResource_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
				.getHWPort_ParentResource();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The Resource, this HWPort belongs to.");

		return editor;

	}

	/**
	 * @generated
	 */
	protected void addParentResourceInstance_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createParentResourceInstance_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createParentResourceInstance_GeneralTab_Editor() {
		final org.eclipse.emf.ecore.EStructuralFeature feature = de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
				.getHWPort_ParentResourceInstance();
		final de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory, feature);

		editor.setTooltipMessage("The Resource, this HWPort belongs to.");

		return editor;

	}

}
