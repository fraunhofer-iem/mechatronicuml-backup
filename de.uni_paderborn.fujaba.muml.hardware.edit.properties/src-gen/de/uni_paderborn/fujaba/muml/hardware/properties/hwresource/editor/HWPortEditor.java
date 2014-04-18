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
			addHWPortParentResource_GeneralTab_Editor(null, true);
		}

	}

	/**
	 * @generated
	 */
	protected void addHWPortParentResource_GeneralTab_Editor(String category,
			boolean front) {
		addEditorToCategory(category,
				createHWPortParentResource_GeneralTab_Editor(), front);
	}

	/**
	 * @generated
	 */
	protected de.uni_paderborn.fujaba.properties.runtime.editors.IPropertyEditor createHWPortParentResource_GeneralTab_Editor() {
		de.uni_paderborn.fujaba.properties.runtime.editors.AbstractStructuralFeaturePropertyEditor editor = new de.uni_paderborn.fujaba.properties.runtime.editors.ComboPropertyEditor(
				adapterFactory,
				de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage.eINSTANCE
						.getHWPort_ParentResource());

		editor.setTooltipMessage("The Resource, this HWPort belongs to.");

		return editor;

	}

}
